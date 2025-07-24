# 🧾 Simple Feedback API

A clean, beginner-friendly Spring Boot REST API that allows users to **submit feedback** and **view all feedback entries** — using PostgreSQL, JPA, and JUnit for testing.

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- JUnit + Mockito
- Maven

---

### 📌 Prerequisites:
- Java 17+
- PostgreSQL running locally on port `5432`
- A database named `feedbackdb`
------------------------------------------------------------------------------------------------------------------------------------
### ⚙️ Setup
1. Clone the repo:
   ```bash
   git clone https://github.com/AkshatChoudhary410/feedback-api.git
   cd feedback-api
   
2.Edit your PostgreSQL credentials in:
  src/main/resources/application.properties

3.Run the app:
  mvn spring-boot:run

  ![SQL Snapshot](https://github.com/user-attachments/assets/4baffb87-6863-42ca-8857-146cb0f9875e)

---------------------------------------------------------------------------------------------------------------------------------------

API Endpoints-
1.Submit Feedback (POST /feedback)
  curl -X POST http://localhost:8080/feedback ^
  -H "Content-Type: application/json" ^
  -d "{\"name\":\"Akshat\", \"email\":\"akshat@example.com\", \"message\":\"Great API!\"}"
  ![POST Req](https://github.com/user-attachments/assets/b9a4ff80-fb59-4e7a-9b95-ed2fd4d6440a)

2.Get All Feedback (GET /feedback)
  curl http://localhost:8080/feedback
![GET](https://github.com/user-attachments/assets/6070c9e9-118d-4306-b014-5d2e340abc8e)

--------------------------------------------------------------------------------------------------------------------------------------

Run Tests-
mvn test
![Test](https://github.com/user-attachments/assets/74286ecb-192f-41da-b956-3a1e1c8201b5)


