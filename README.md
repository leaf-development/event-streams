[![Build Status](https://travis-ci.org/lfarmer/event-streams.svg?branch=master)](https://travis-ci.org/lfarmer/event-streams)

# Event Stream Processing

This project aims to provide a simple demonstration of how event stream processing works with spring + kafka

## Prerequistes 

 * Docker/ Docker Compose 
 * Maven 
 * Java 8
 
### Only tested on OSX, things may differ on windows (especially older versions with docker-machine etc)

##  Build project (Maven)

1. Open terminal at project root
2. Run `mvn clean install -Pinstall-docker`

You should see build output that indicates the docker images are being created and stored in your local docker registry.

##  Run example 

1. Open terminal and run `docker-compose up`

### Whats going on?

After running the docker-compose up command you will see three different output logs for each of the containers
provided within the docker-compose.yml file.

The environment created consists of:

1. event-source with h2 embedded database
2. Apache kafka/ zookeeper container
3. event-log-sink

When docker compose successfully completes then the following will occur.

1. event-source checks the embedded database (every second) for unprocessed events
2. Unprocessed events will be placed onto the kafka events topic
3. event-log-sink will then process each event placed on the topic, by simpling outputting it 
   to the logs (which you will see within the docker-compose up terminal)
   

