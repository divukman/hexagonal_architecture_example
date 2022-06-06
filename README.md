# hexagonal_architecture_example
Hexagonal architecture example

WIP project that aims to have a basic structure of hexagonal infrastructure setup with spring boot example...

- Ports: Interfaces in core (domain)
- Adapters: Implementations of ports
- API: that which drives the core (web api for example)
- SPI (Service provider interface): that which is driven by core (database for example)
