Patterns and Architecture Used:

    Model-View-Controller (MVC): The main architectural pattern used to separate concerns between user interface (view), business logic (model), and request handling (controller).
    Front Controller: A pattern where a single servlet (like CustomerInsertServlet) handles requests and forwards them to the appropriate handler.
    Singleton Pattern (optional): Could be used for managing database connections.
    DAO Pattern: Used to abstract database interactions and keep the data layer separate from business logic.
    Factory Pattern (optional): Can be used for creating complex objects dynamically.
    Command Pattern (optional): Can be used to further decouple servlet logic and simplify request handling.

<img width="1440" alt="Screenshot 2024-11-15 at 4 50 03 PM" src="https://github.com/user-attachments/assets/13b8da55-18f1-4a83-bcaf-6b2d9921eb06">
