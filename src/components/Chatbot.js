import React, { useState } from 'react';
import axios from 'axios';

const Chatbot = () => {
  const [query, setQuery] = useState('');
  const [response, setResponse] = useState([]);

 const handleQuerySubmit = async (e) => {
   e.preventDefault();
   try {
     const res = await axios.post('http://localhost:8080/api/chatbot', { query });
     console.log('API Response:', res.data); // Log the entire response
     setResponse(res.data);
   } catch (error) {
     console.error('Error fetching data:', error);
     setResponse(["Error occurred while processing the query."]);
   }
 };


  return (
    <div style={{ padding: '20px' }}>
      <h2>MongoChat - Query MongoDB</h2>
      <form onSubmit={handleQuerySubmit}>
        <input
          type="text"
          value={query}
          onChange={(e) => setQuery(e.target.value)}
          placeholder='e.g., "Find all people with last name Smith"'
          required
          style={{ padding: '10px', width: '60%' }}
        />
        <button type="submit" style={{ padding: '10px 20px', marginLeft: '10px' }}>
          Submit
        </button>
      </form>

      <h3>Response:</h3>
      <ul>
        {response.length > 0 ? (
          response.map((person, index) => (
            <li key={index}>
              {person?.firstName || 'Unknown'} {person?.lastName || 'Unknown'} (Age: {person?.age || 'N/A'})
            </li>
          ))
        ) : (
          <p>No results found.</p>
        )}
      </ul>
    </div>
  );
};

export default Chatbot;
