# kafka-banking-app

Kafka producer & consumer microservice application 
--
This project contains rest endpoint to post the json data as producer and consumer will consume the data and store it in Mysql database.

Git clone the repo
--
```
git clone https://github.com/5gucl-idrbt/kafka-banking-app.git
```
How to run the application
--
```
 import the project and run the application using follwing steps
 After GitClone the project in instance move to  microservice folder
 1. cd kafka-banking-app/
 2. to build the package(jar file)
    mvn package
 2.1 The above command will generate a jar file in target folder
 3. cd target/
    ls  
 4. To run the SpringBoot application
    Jar name looks like this ---> jar-name-0.0.1-SNAPSHOT.jar
    java -jar jar-name-0.0.1-SNAPSHOT.jar
```
How to test the application
--
Open postman or use curl command to post the data to rest endpoint as a producer
1. If you are using postman then use as like this :
1.1 
