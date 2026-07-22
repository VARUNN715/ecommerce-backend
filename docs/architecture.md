# Architecture

## Overview

This project is a production-style E-Commerce REST API built using Java 21 and Spring Boot.

The goal of this project is not only to implement business functionality but also to follow clean architecture principles, coding standards, and scalable design practices used in enterprise applications.

---

## Architecture Style

This project follows a Feature-First Layered Architecture.

Instead of grouping classes by technical layers (controller, service, repository), each business feature owns its complete implementation.

Example:

product
├── controller
├── service
├── repository
├── entity
├── dto
└── mapper

This keeps related code together and improves maintainability as the project grows.

---

## Request Flow

Angular Client
│
▼
Spring Boot Controller
│
▼
Service Layer
│
▼
Repository Layer
│
▼
MySQL Database

---

## Shared Components

The application contains shared infrastructure that can be used by every module.

Examples:

- ApiResponse
- GlobalExceptionHandler
- ErrorResponse

---

## Technology Stack

Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- MySQL

Frontend
- Angular

Development Tools

- IntelliJ IDEA Community Edition
- Visual Studio Code
- Git
- GitHub
- Postman
- Docker Desktop