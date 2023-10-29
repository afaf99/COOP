# TrainingRegistration

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.1.1.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

# Todo List
<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#Description-of-the-project">Description of the project</a></li>
    <li> <a href="#Setup">Setup</a> </li>
    <li><a href="#Technologies-Used">Technologies Used</a></li>
    <li><a href="#Project-Overview">Project Overview </a></li>
    <li><a href="#Demo">Demo</a></li>
 
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## Description of the project

<p>This is a full-stack project - a Todo List website built using Angular and Spring Boot! It was quite a challenge for me to deploy the project on GitHub Pages, as I had never used GitHub before. However, I learned a lot through this experience and am proud of what I've accomplished./p>



<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Setup
<ul>
## Prerequisites

**Clone the repo**
   ```sh
   git clone https://github.com/afaf99/Todos.git
   ```
- Java 19
- Angular
-  Create a MySQL database and update the database configuration in `application.properties` with your database credentials:
# JWT Configuration
- jwt.signing.key.secret=mySecret
- jwt.get.token.uri=/authenticate
- jwt.refresh.token.uri=/refresh
- jwt.http.request.header=Authorization
- jwt.token.expiration.in.seconds=604800

# Database Configuration
- spring.datasource.url=jdbc:h2:mem:testdb;NON_KEYWORDS=USER
- spring.h2.console.path=/h2-console
- spring.h2.console.enabled=true
- spring.jpa.defer-datasource-initialization=true
- spring.data.jpa.repositories.bootstrap-mode=default

</ul>



## Technologies Used

This project is built using a range of technologies and tools:

- **Java Persistence API (JPA)**: Used for managing entities and database relationships.
- **Jakarta Persistence**: Annotations like `@Entity` are used for entity mapping.
- **Lombok**: Employed to reduce boilerplate code and enhance code readability.
- **Database**: H2.
- **APIs/Web Scraping**: Data enrichment is achieved through external data sources.
- **Spring Boot**: The Spring framework is utilized for the backend development.
- **Angular**: Angular is used for the frontend development.

These technologies work in harmony to power the system's functionality and provide a robust user experience.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- ROADMAP -->
## Project Overview 
- The Todo List website allows users to manage their tasks and stay organized. It provides features to add, edit, and delete tasks. The project utilizes Angular on the frontend and Spring Boot on the backend.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Demo
<img src="website Images/10.jpg"> 
<img src="image/Screenshot_2.png"> 
<img src="image/Screenshot_3.png"> 
<img src="image/Screenshot_4.png"> 
<img src="image/Screenshot_5.png"> 
<img src="image/Screenshot_8.png"> 


site is live at https://afaf99.github.io/Todos/



<p align="right">(<a href="#readme-top">back to top</a>)</p>




