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

## 📂 Project Structure
mongochat/ ├── mongochat-backend/ │ ├── src/main/kotlin/com/yashi/mongochat/ │ │ ├── controller/ # API Controllers │ │ ├── model/ # Data Models (Person) │ │ ├── repository/ # MongoDB Repository │ │ ├── service/ # Business Logic │ │ ├── config/ # CORS Configuration │ └── build.gradle.kts └── mongochat-frontend/ ├── src/ │ ├── components/ # React Components (Chatbot) │ └── App.js # Main Entry ├── package.json ├── public/ └── README.md
