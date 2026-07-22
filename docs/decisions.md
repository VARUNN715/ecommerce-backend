# Architectural Decisions

## Decision 001

Feature-First Architecture

Reason

Improves scalability and keeps related code together.

---

## Decision 002

Java 21

Reason

Current LTS version with long-term support.

---

## Decision 003

MySQL

Reason

Widely supported relational database suitable for this project.

---

## Decision 004

Spring Boot

Reason

Production-ready framework with strong ecosystem.

## Decision 004 

Success responses will not include a timestamp. Diagnostic metadata such as timestamps belongs in error responses and application logs, not every successful API response.
