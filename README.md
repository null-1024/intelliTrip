# Intelligent Travel Platform with Heterogeneous Model and Algorithm Integration

## Project Overview

This project focuses on developing an intelligent travel platform to meet the diverse needs of modern travelers and enhance the overall travel experience. As the tourism industry evolves, there is a growing demand for personalized and intelligent services in itinerary planning, attraction selection, and travel arrangements. To address this, the platform integrates various travel resources to provide a one-stop solution, including itinerary customization, attraction recommendations, and online booking.

The platform emphasizes user experience by offering intelligent travel suggestions and optimized travel plans, enabling users to efficiently choose suitable travel routes and attractions. Equipped with robust data analysis capabilities, it uses user behavior and historical data to provide personalized recommendations, ensuring every trip is unique and memorable. This project aims to drive digital transformation in the tourism industry, offering smarter, more convenient, and thoughtful travel services to become an indispensable assistant for travelers.

## Technical Architecture

### Backend

- **Frameworks & Tools**: Spring Cloud, Spring MVC for microservices architecture
- **Database Operations**: Mybatis-plus for streamlined database interactions
- **Messaging**: RabbitMQ for asynchronous communication
- **Caching**: Redis and Redisson for efficient data caching
- **Storage**: Minio for object storage
- **Database**: MySQL for storing user and travel information
- **Authentication**: JWT for secure user authentication
- **Deployment**: Docker for containerization and portability

### Frontend

- **Frameworks**: Vue 3 with Element-Plus for UI development
- **Data Interaction**: Axios for API communication
- **Admin Panel**: RuoYi-Vue-master for backend management

### Data Science and AI

- **Libraries**: Sklearn, Pandas, Numpy, Matplotlib for data analysis and model training
- **APIs**:
  - Zhipu Qingyan AI for natural language processing
  - Amap APIs for navigation and weather data
  - Baidu AI for object and scene recognition

## Features

### 1. User Management Module

- **Login System**: Encrypted password handling with Spring Security (BCrypt)
- **JWT Integration**: Secure token-based authentication
- **Error Handling**: User-friendly error messages for login failures

### 2. Attractions Module

- **Dynamic Updates**: Redis-backed distributed locks with Redisson for consistent data access
- **Integrated Weather Information**: Displays real-time and forecasted weather for attractions
- **Comprehensive Attraction Details**: Location, contact info, opening hours, and user reviews

### 3. Accommodation Module

- **Local Recommendations**: Displays hotels near attractions
- **Detailed Information**: Room types, pricing, contact information, and user reviews

### 4. Restaurants Module

- **Local Recommendations**: Displays restaurants near attractions
- **Detailed Information**: Popular dishes, contact info, and user reviews

### 5. Itinerary Planning Module

- **Map Integration**: Amap API for route mapping and driving time estimation
- **Reminder System**: RabbitMQ-based delayed messaging for travel reminders

### 6. Personal Management Module

- **Profile Customization**: Modify personal details, including signature, password, and email
- **User Activity**: Track liked and bookmarked attractions and travel logs
- **Social Features**: Follow other users and view their travel logs

### 7. Travel Logs Module

- **User-Generated Content**: View and interact with travel logs, including comments, likes, and bookmarks
- **Detailed Insights**: Costs, travel dates, and personal experiences shared by users

### 8. Zhipu Qingyan AI Integration Module

- **AI Chat**: Seamless and dynamic AI-powered chat functionality with SSE
- **Data Retention**: Local storage for user interactions

### 9. Comment Section Module

- **Hierarchical Design**: Nested comments with clear reply relationships
- **User Feedback**: Time-stamped comments and replies for better engagement

### 10. Artificial Intelligence Module

- **Visitor Prediction**: Linear regression using Sklearn for future visitor trends
- **Image Recognition**: Integrated Baidu AI APIs for object and scene recognition, tailored for tourism use cases

## Getting Started

### Prerequisites

- Docker installed for containerized deployment
- MySQL database setup
- Redis for caching and distributed locking

### Installation

1. Clone the repository.
2. Set up the backend environment using Spring Boot.
3. Configure the frontend with Vue 3.
4. Deploy services using Docker.
5. Integrate external APIs (Zhipu Qingyan, Amap, Baidu).

### Run

1. Start the backend services.
2. Launch the frontend.
3. Access the platform via the designated URL.
