 Task 1 Spring MVC App

Endpoints and HTTP Methods

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/` | Returns plain text using `@ResponseBody` |
| GET    | `/greeting` | Returns an MVC HTML view from Thymeleaf |


How it functions
- The controller class is annotated with `@Controller`, meaning it handles HTTP requests.
- The `simpleGreeting()` method uses `@ResponseBody`, so Spring sends the returned string directly in the HTTP response body instead of searching for a view file.
- The `greetingPage()` method returns `"greeting"` which maps to `greeting.html` inside `resources/templates`.

---
Testing
 Browser Tests
<img width="958" height="270" alt="Screenshot 2025-12-25 080940" src="https://github.com/user-attachments/assets/c1b49965-5332-4c2f-8989-c37840645e34" />

<img width="953" height="764" alt="Screenshot 2025-12-25 081016" src="https://github.com/user-attachments/assets/5f2c9ed9-6e9d-40e0-8674-cf4c21b009ee" />


 Postman Test
<img width="956" height="1060" alt="image" src="https://github.com/user-attachments/assets/000921ef-17d8-4cba-a12d-926c8d54e442" />

<img width="957" height="1050" alt="image" src="https://github.com/user-attachments/assets/ffec4a7a-f5d3-4bb5-9ab2-93df45247617" />

Static Resources
- Image file `vistula.jpeg` is stored inside `src/main/resources/static/` and served at runtime.


Run instructions
1. Reload Maven: 
2. Run main class
3. Test URLs in browser or Postman
