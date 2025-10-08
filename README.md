# University Portal Clone

A full-stack university portal application designed to manage students, courses, events, and announcements. This project demonstrates modern web development skills, including **React frontend**, **Spring Boot backend**, **MySQL database**, and **JWT-based authentication**. It is designed to showcase skills relevant to Software Developer roles in higher education environments.

---

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Setup Instructions](#setup-instructions)
- [Demo](#demo)
- [API Endpoints](#api-endpoints)
- [Screenshots](#screenshots)
- [Demo Credentials](#demo-credentials)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

## Project Overview
The portal is a clone of a university management system with separate functionalities for **students** and **administrators**. It demonstrates expertise in:
- Full software development lifecycle
- Database design and management
- RESTful API development and integration
- Frontend development with React
- Secure authentication using JWT
- Optional containerization with Docker

---

## Features
- **Student Features**
  - View profile and enrolled courses
  - Browse courses and enroll
  - View announcements and events

- **Admin Features**
  - Manage students, courses, events, and announcements
  - Role-based authentication with JWT
  - Secure access for administrative tasks

- **General**
  - RESTful API backend
  - React frontend with responsive design
  - JWT-based authentication
  - Docker Compose for optional containerized deployment

---

## Technologies Used
- **Frontend:** React, Axios, HTML, CSS  
- **Backend:** Java, Spring Boot, Spring Security  
- **Database:** MySQL  
- **Authentication:** JSON Web Tokens (JWT)  
- **Containerization:** Docker & Docker Compose (optional)  
- **Version Control:** Git & GitHub  

---

## Architecture

- The University Portal Clone follows a three-tier architecture:

 **Frontend (React)**
  - Communicates with the backend REST API using Axios.
  - Displays data dynamically using reusable React components.
  - Runs on localhost:3000.

 **Backend (Spring Boot)**
 - Provides RESTful API endpoints for managing users, courses, and events.
-   Handles authentication, authorization, and business logic.
- Runs on localhost:8080.

**Database (MySQL)**

- Stores persistent data such as users, courses, and announcements.

- Runs locally on port 3306.

Optional Docker setup allows the entire system to run in isolated containers for easy deployment and scalability.

## Setup Instructions

**Step 1 - Clone Repository**
- git clone https://github.com/yourusername/university-portal-clone.git
- cd university-portal-clone

**Step 2 - Frontend Setup**
- cd backend
- mvn clean install
- mvn spring-boot:run
- The React app will start on https://localhost:3000

**Step 3 - Backend Setup**
- cd backend
- mvn clean install
- mvn spring-boot:run
- The Spring Boot server will start on https://localhost:8080

**Step 4 - Database Setup**
- Install MySQL(if not already installed)
- create a database called university_portal
- Update the database credientials in application.properties:
  spring.datasource.url=jdbc:mysql://localhost:3306/university_portal
  spring.datasource.username=root
  spring.datasource.password=yourpassword
- Run the backend again to auto-generate tables.

**Step 5 - Docker (Optional)**
- docker-compose up --build
- This will start MySQL, the backend, and frontend containers together.

## Demo
Once all services are running locally, open your browser and navigate to:

- Frontend (React): https://localhost:3000

- Backend (Spring Boot API): https://localhost:8080

- MySQL Database: Port 3306

You’ll be able to log in as an admin or student, view dashboards, and test API functionality.
If Docker is used, all components run automatically inside containers.






