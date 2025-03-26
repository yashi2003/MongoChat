# 🗣️ MongoChat

MongoChat is a **full-stack chatbot application** that allows users to query a **MongoDB** database using natural language. It is built with **Spring Boot (Kotlin)** for the backend and **React** for the frontend.

---

## 🚀 Features

- ✅ **Chatbot-based search**: Query MongoDB data using natural language.
- ✅ **Reactive Spring Boot Backend**: Uses WebFlux for non-blocking data retrieval.
- ✅ **RESTful API**: Communication between frontend and backend via REST.
- ✅ **MongoDB Integration**: Fetches and displays dynamic data.
- ✅ **CORS-enabled**: Allows communication between different origins.

---

## 🛠️ Tech Stack

- **Backend**: Spring Boot (Kotlin), WebFlux, Reactive MongoDB
- **Frontend**: React (JavaScript), Axios for API calls
- **Database**: MongoDB (Local/Atlas)
- **Build Tools**: Gradle (backend), npm (frontend)

---

## 🏃‍♂️ How to Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yashi2003/mongochat.git
cd mongochat
```
### 2️⃣ Set Up MongoDB
```bash
mongod --dbpath=/your/local/dbpath
```
### 3️⃣ Run the Backend (Spring Boot - Kotlin)
```bash
cd mongochat-backend
./gradlew bootRun
```
The backend runs on 
http://localhost:8080


### 4️⃣ Run the Frontend (React)
```bash
cd ../mongochat-frontend
npm install
npm start
```

The frontend runs on 
http://localhost:3000

---


## 📡 API Endpoints

#### 1️⃣ Get All People
```bash
GET /api/people
```

#### 2️⃣ Search by Last Name (via Chatbot)
```bash
POST /api/chatbot
Content-Type: application/json
{
  "query": "Find people with last name XYZ"
}
```

#### 🔍 Example Chatbot Queries
```bash
"Find all people with last name Sharma."
"Show me details of people with last name Singh."
```

---


## ✅ Running Tests

Run backend tests using Gradle:
```
./gradlew test
```

---

## 📌 Future Enhancements

✅ Natural Language Processing (NLP) for smarter chatbot responses

✅ User Authentication for role-based access

✅ Advanced Filtering (e.g., age, location)
