# Spring cloud
Sandbox to play with spring cloud features

## Servers

| Name                 | Description               | Default port | Details                                            |
|----------------------|---------------------------|--------------|----------------------------------------------------|
| Configuration server | Configuration server | 8888 | You should set an `JAVA_CLUB_SRC_HOME` variable which points to the folder where your java club sources are checked out. <br/>Configs URL example: http://localhost:8888/cloud/master |
| Discovery server | Discovery server | 8761 | Eureka server for services registration. |


## Service
| Name                 | Description                 | Default port | Details                                          |
|----------------------|-----------------------------|--------------|--------------------------------------------------|
| Rating service | Rating Calculation Service | 8081 | |
| Hackster service| Hackster Detection Service | 8082| |
| Realtor service| Realtor Api Service | 8080| To call other services used Feign, RestTemplate |
| Storage service| Storage of Apartment Records Service | 8091| H2 based service for ApartmentRecord data storage. |


# Dev

## Build

```bash
mvn clean install
```

## Run

```bash

```
## TODO Items
- [ ] Check Feign Fallback ?
- [ ] All eurika clients add eurika server address to properties
- [ ] Client service for search
- [ ] Zuul like a proxy API gateway
- [ ] Cloud foundary
- [ ] FeignClient usage
- [ ] Circuit Breaker: Hystrix Clients
- [ ] Connect Zipkin
- [ ] Event Driven with JMS or Kafka
- [ ] Create parser for Visokiy Zamok data
- [ ] Security check to implement with Zuul only
