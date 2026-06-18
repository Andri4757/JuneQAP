For QAP 2, I created a simple REST API using Spring Boot. The project follows the same layered structure we used in class, with separate files for the model, repository, service, and controller. The API works with one main entity called Student, which stores basic information about a student such as id, first name, last name, email, program name, and semester.

The application uses MySQL as the database. Before running the project, I created a new database called qap2_student_api. After that, I updated the database username and password in the application.properties file so the API could connect to MySQL properly.

To run the project, I used the command “mvn spring-boot:run” from the project folder. Once the application starts, the API becomes available at http://localhost:8080/api/students.

The API supports the basic CRUD operations. A GET request to /api/students returns all students, and a GET request to /api/students followed by an ID returns a single student. A POST request to the same URL creates a new student, a PUT request updates an existing one, and a DELETE request removes a student from the database.

For testing, I included a Postman collection in the project. I tested the API in the following order: first I created a student, then I retrieved all students, then I checked a student by ID, updated the student, and finally deleted the record. After creating a student, I used the returned ID for the rest of the requests.
