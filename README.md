# hexagonal_architecture_example
Hexagonal architecture example

WIP project that aims to have a basic structure of hexagonal infrastructure setup with spring boot example...

- Ports: Interfaces in core (domain)
- Adapters: Implementations of ports
- API: that which drives the core (web api for example)
- SPI (Service provider interface): that which is driven by core (database for example)



# Config
If you are using a firebase project:
https://firebase.google.com/docs/admin/setup

```
export GOOGLE_APPLICATION_CREDENTIALS="/home/user/Downloads/service-account-file.json"
```
Or you can have a dummy adapter that stores data into h2 for example...

# Run the project
```
  $ ./mvnw spring-boot: run (or mvn spring-boot:run)
```
