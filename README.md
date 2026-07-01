## 🤖 AI Chatbot — Spring Boot + Groq

A REST API that answers questions 
using AI — built with Spring Boot 
and Groq's FREE LLaMA model!

## 🚀 What This Project Does

- User sends a question via API
- Spring Boot receives the request
- Groq AI (LLaMA 3.1) processes it
- AI generated answer returned!

## 🛠️ Technologies Used

- Java 21
- Spring Boot 3.5.16
- Spring AI 1.0.0-M6
- Groq API (FREE!)
- LLaMA 3.1 8B Model
- Maven

## 📡 API Endpoints

GET /ask?question=What is Java?
→ Returns AI generated answer!

## 🔧 How to Run

1. Clone this repository
2. Get FREE API key from console.groq.com
3. Set environment variable:
   GROQ_API_KEY=your_key_here
4. Run the Spring Boot application
5. Test with Postman:
   localhost:8080/ask?question=Hello

## 📸 Screenshots

### /ask Endpoint — Java Question
![Java Question](Screenshot1.png)

### /ask Endpoint — Spring Boot Question  
![Spring Boot Question](Screenshot2.png)

## 👩‍💻 Author

CodeWithPreeti8
Java Backend Developer
Learning AI Integration
