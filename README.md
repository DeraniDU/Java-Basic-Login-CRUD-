Patterns and Architecture Used:

    Model-View-Controller (MVC): The main architectural pattern used to separate concerns between user interface (view), business logic (model), and request handling (controller).
    
    Front Controller: A pattern where a single servlet (like CustomerInsertServlet) handles requests and forwards them to the appropriate handler.
    
    Singleton Pattern (optional): Could be used for managing database connections.
    
    DAO Pattern: Used to abstract database interactions and keep the data layer separate from business logic.
    
    Factory Pattern (optional): Can be used for creating complex objects dynamically.
    
    Command Pattern (optional): Can be used to further decouple servlet logic and simplify request handling.
