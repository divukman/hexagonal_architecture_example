# Hexagonal Architecture With Spring Boot
Hexagonal architecture example

![Hexagonal Architecture](https://static.packt-cdn.com/products/9781839211966/graphics/B15547_02_04.jpg)

WIP project that aims to have a basic structure of hexagonal infrastructure setup with spring boot example...

- Ports: Interfaces in core (domain)
- Adapters: Implementations of ports
- API: that which drives the core (web api for example)
- SPI (Service provider interface): that which is driven by core (database for example)


# Example
- Core defines interfaces (ports) for the input (API) and for the output (SPI)

## Input adapters (API)
- Web input adapter implements one of the ports and exposes a web api that drives the core 
- Different input adapters can drive the logic, for example pubsub subscription etc...

## Output adapters (SPI)
- Firebase output adapter implements one of the ports and provides means for persisting the data (in firebase) 
- Different output adapters can implement output port, for example Postgres adapter to store data into the database...


# Config
If you are using a firebase project:
https://firebase.google.com/docs/admin/setup

```
export GOOGLE_APPLICATION_CREDENTIALS="/home/user/Downloads/service-account-file.json"
```
Or you can have a dummy adapter that stores data into h2 for example...

Update the application-dev.properties file with following:
```
firebase.sa=/path/to/serviceaccount/key/firebaseSA.json
firebase.db=https://your-db.firebasedatabase.app

```

# Run the project
```
  $ ./mvnw spring-boot: run (or mvn spring-boot:run)
```
