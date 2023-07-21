# kafka-banking-app

Kafka producer & consumer microservice application 
--
This project contains rest endpoint to post the json data as producer and consumer will consume the data and store it in Mysql database.

Prerequisites
--
1) openjdk 17
2) maven 3.8.8
3) mysql
4) postman (optional)
5) git
6) kafka

Installation
--
Java
--
```
sudo apt update
sudo apt install openjdk-17-jdk
sudo apt install openjdk-17-jre
java --version
openjdk 17.0.5 2022-10-18
```
Maven
--
```
$ wget https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz
$ tar -xvf apache-maven-3.8.8-bin.tar.gz
$ mv apache-maven-3.8.8 /opt/

SET M2_HOME for maven
sudo nano .profile
M2_HOME='/opt/apache-maven-3.8.8'
PATH="$M2_HOME/bin:$PATH"
export PATH

verify
mvn -version
```
Mysql 
--
```
sudo apt update
sudo apt install mysql-server
sudo systemctl start mysql.service
```

Configuring mysql
```
sudo mysql

Create user and grant create database access

This has to be done in mysql terminal after typing sudo mysql

CREATE USER 'sammy'@'localhost' IDENTIFIED BY 'password';
GRANT PRIVILEGE ON database.table TO 'username'@'host';
```
Create Database on user or root as required
---
```
CREATE DATABASE banking;

NOTE: No need of create table in DB, After running the microservices it will create for us
```

Git
--
```
sudo apt install git
```


Git clone the repo
--
```
git clone https://github.com/5gucl-idrbt/kafka-banking-app.git
```
Kafka
--
```
wget https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz
$ tar -xzf kafka_2.13-3.5.0.tgz
$ cd kafka_2.13-3.5.0
```
# Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties

to 
$ bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
This is my first event
This is my second event

$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
This is my first event
This is my second event

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
1. If you are using postman then use as like this
1.1 Open postman and give the below data
2. POST:    http://localhost:9001/api/v1/kafka/publish
   OR
   localhost:9002
   and raw-- and next that option select JSON
   ```
   {
    "source_account": "KKK9809",
    "dest_account": "PPP0468",
    "txn_account": 5555
   }
   
   OR
   Use curl command for CLI 
   
   curl --location 'http://localhost:9001/api/v1/kafka/publish' \
   --header 'Content-Type: application/json' \
   --data '{
       "source_account": "KKK9809",
       "dest_account": "PPP0468",
       "txn_account": 5555
   }'
   ```
4. Check the kafka consumer console and mysql database that this data is saved in DB

All reference link for installation
--
1) https://techviewleo.com/install-java-openjdk-on-ubuntu-linux/
2) https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu
3) https://maven.apache.org/download.cgi
4) https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-22-04
5) https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-22-04
6) https://kafka.apache.org/quickstart



