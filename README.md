Spring Boot Assessment
Carefully read all the instructions before beginning the assessment.

For this assessment, you will create a web application that allows you to create order records in a database and manipulate them, this will simulate an online store where customers can buy products.

The application must implement the following features:

Show an existing order
Add new order
Delete or Update an order
This will assess your understanding of the Java Web Framework Spring Boot module.

Setup
Please reference the section in the curriculum on setting up a new spring boot application
Create a new GitHub repository and connect it as a remote by following the directions on GitHub.
Create and do your work in a branch named first-last where first and last are your first name and last name
(Optional) Set up a database connection in IntelliJ. This is not required, and you can accomplish everything you need to do with the mysql command line client.
(Optional) Depending on your database engine version you might need to change the JDBC connection dependency on your pom.xml file, find here all the versions of the JDBC connector, specially if you are working with MySQL 8 this will be required.
You should now be all set up to run the application and make changes to it.

Specifications
Create the Order model to reflect the changes made in the database. It must have:
A property for an orderNumber that auto-increments when a new record is being created.
An email to keep track of the customer.
A totalPrice that is defined as a double.
A constructor, getters and setters for each property.
Your application will need an OrderRepository, create the repository in order to utilize the JPA most common CRUD actions.
Create an OrderController to handle the following http requests:
route	method	description
/orders/create	GET	Show the create form
/orders/create	POST	Create a new order
/orders/{id}	GET	View the information about a specific order
/orders/{id}/update	GET	View the form to modify an existing order
/orders/{id}/update	POST	Modify the existing order
/orders/{id}/delete	POST	Delete an order
Inside your templates folder you will need an orders directory where we expect to have the following views:
A show.html file that shows the information of a single order.
A create.html file that shows a form and allows you to submit the order info.
The edit or delete functionality it's up to you how you want this to be implemented
Grading
Grades will not be based on the CSS or styling for your site. Just the functionality of the frontend and backend logic.


Thank you,# SpringBoot
