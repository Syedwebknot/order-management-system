# Order Management System (Spring Boot)

## 📘 Overview
This is a simple **Order Management System backend**, built using **Spring Boot**, **Spring Data JPA**, and **H2 Database**.

It provides complete CRUD APIs for managing orders and includes two additional APIs for updating order status and filtering orders by status.

---

## 🏗️ Tech Stack
| Layer | Technology |
|--------|-------------|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Database | H2 (in-memory) |
| ORM | Hibernate / JPA |
| Build Tool | Gradle |
| API Testing | Postman |

---

## 📦 Features Implemented
✔ Create an order  
✔ Get order by ID  
✔ Get all orders  
✔ Update an order  
✔ Delete an order  
✔ Update order status  
✔ Get orders by status   

---

## 🔗 REST API Endpoints

### ➤ Create Order  
`POST /orders`

Example JSON body:
```json
{
  "customerName": "Syed",
  "productName": "iPhone",
  "quantity": 1,
  "price": 70000,
  "status": "CREATED"
}
```

### ➤ Get All Orders  
`GET /orders`

### ➤ Get Order By ID  
`GET /orders/{id}`

### ➤ Update Order  
`PUT /orders/{id}`

### ➤ Delete Order  
`DELETE /orders/{id}`

### ➤ Update Order Status (Extra API)  
`PUT /orders/{id}/status?status=SHIPPED`

### ➤ Filter Orders by Status (Extra API)  
`GET /orders/status/{status}`

---

## 🗄️ H2 Console Access
URL:
http://localhost:8080/h2-console

Credentials:
JDBC URL: jdbc:h2:mem:ordersdb
User: sa
Password: 

---

## 📂 Folder Structure
src/main/java
    ├── controller
    ├── service
    ├── repository
    └── entity

---

## ✔️ How To Run
1. Download / clone this project  
2. Open it in IntelliJ IDEA Community Edition  
3. Run `OrderManagementSystem` main class  
4. Test APIs using Postman  
5. View DB data in H2 Console  

---

## 🚀 Project Status
🎯 Fully Completed  
✔ All CRUD APIs working  
✔ 2 Extra APIs implemented  
✔ Tested in Postman  
✔ Data visible in H2 database  

---


