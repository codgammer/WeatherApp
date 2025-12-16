# WeatherApp
Simple Java Application
# 🌦️ Weather Application – Full Stack Project

A **full-stack Weather Forecast Application** built using **Spring Boot (Java)** for the backend and **HTML, CSS, JavaScript** for the frontend.  
The application fetches **real-time weather data** from **WeatherAPI.com** and displays it through a clean, responsive UI.

---

## 🔗 Live Demo
- **Backend API:** https://your-backend.up.railway.app  
- **Frontend UI:** https://your-frontend.netlify.app  

> Replace the URLs with your deployed links.

---

## 🏗️ Project Architecture

Browser  
↓  
Frontend (HTML, CSS, JavaScript)  
↓ REST API  
Spring Boot Backend (Railway)  
↓  
WeatherAPI.com  

---

## 🚀 Features

- 🌍 Search weather by city name
- 🌡️ Displays temperature in Celsius
- 💧 Shows humidity percentage
- 💨 Displays wind speed
- 🌤️ Weather condition with icon
- 🔐 Secure API key using environment variables
- ☁️ Cloud deployment using Railway & Netlify

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- REST API
- Maven
- WeatherAPI.com
- Railway (Deployment)

### Frontend
- HTML5
- CSS3
- JavaScript (Fetch API)
- Netlify (Deployment)

### Tools
- Git & GitHub
- VS Code / IntelliJ
- Postman

---

## 📂 Project Structure

WeatherApp  
├── backend  
│   ├── src/main/java/com/weather/app  
│   │   ├── WeatherApplication.java  
│   │   ├── controller  
│   │   ├── service  
│   │   └── model  
│   └── pom.xml  
│  
├── frontend  
│   ├── index.html  
│   ├── style.css  
│   └── script.js  
│  
└── README.md  

---

## ⚙️ Backend Setup (Local)

### 1️⃣ Clone the repository
```bash
git clone https://github.com/codgammer/WeatherApp.git
cd WeatherApp/backend
