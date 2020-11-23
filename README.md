## Kafka-pub

What is this?
A simple way to publishing JSON objects (messages) to topics in kafka via a rest endpoint. 

How to use?
- set up kafka broker in `./src/main/resources/application.yaml`
- run Spring app
- POST JSON body to localhost:8083/${target} where ${target} is target topic  
