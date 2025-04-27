# E-Commerce-Plateform-Shopping-Cart-System
🛒 Simple E-Commerce Platform (Spring Boot + Bootstrap)

This is a modern e-commerce shopping cart web application built using **Spring Boot** for the backend and **Bootstrap 5 + HTML** for the frontend, featuring a clean and responsive design.

## ✨ Features

- **Product Management**
  - Add new products with name and price
  - View all available products in a responsive grid
  - Delete individual products
  - Delete all products at once
  - Search products by name

- **Shopping Cart**
  - Add products to cart
  - Remove items from cart
  - Real-time cart total calculation
  - Automatic cart sync with product updates
  - Refresh cart functionality

- **Modern UI/UX**
  - Responsive Bootstrap 5 design
  - Clean and intuitive interface
  - Real-time updates
  - Search functionality
  - Elegant animations and hover effects

------------------------------------------------------------------------------------

## 🚀 Technologies Used

- **Backend**
  - Java 17
  - Spring Boot 3.4.4
  - Spring Web (REST APIs)
  - Spring Boot Actuator
  
- **Frontend**
  - HTML5
  - Bootstrap 5.3.3
  - jQuery 3.6.0
  
- **Storage**
  - In-memory storage (`CopyOnWriteArrayList`) for thread-safe operations
  - Atomic counters for ID generation

------------------------------------------------------------------------------------

## 📋 Prerequisites

Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 17 or later
- Maven 3.6+ (or you can use the included Maven wrapper)
- A modern web browser (Chrome, Firefox, Edge, etc.)

------------------------------------------------------------------------------------

## 🔧 Installation & Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/E-Commerce-Plateform-Shopping-Cart-System.git
   cd E-Commerce-Plateform-Shopping-Cart-System
   ```

2. **Verify Java Installation**
   ```bash
   java -version
   ```
   Make sure it shows Java 17 or later

3. **Verify Maven Installation** (if using local Maven)
   ```bash
   mvn -version
   ```

------------------------------------------------------------------------------------

## ▶️ Running the Application

You can run the application in two ways:

### Using Maven Wrapper (Recommended)

On Windows:
```bash
./mvnw spring-boot:run
```

On Unix/MacOS:
```bash
chmod +x mvnw
./mvnw spring-boot:run
```

### Using Local Maven Installation

```bash
mvn spring-boot:run
```

The application will start and be available at:
`http://localhost:8080`

------------------------------------------------------------------------------------

## 🌐 Accessing the Application

1. Open your web browser and navigate to:
   ```
   http://localhost:8080
   ```

2. You should see the main interface with:
   - Product creation form at the top
   - Product listing in the middle
   - Shopping cart at the bottom

3. Start by adding some products:
   - Enter product name
   - Enter price
   - Click "Add Product"

------------------------------------------------------------------------------------

## 📦 API Endpoints

The application exposes the following REST endpoints:

### Products

- `GET /products` - List all products
- `GET /products?search=keyword` - Search products
- `POST /products` - Add a new product
- `DELETE /products/{id}` - Delete a product
- `DELETE /products/all` - Delete all products

### Shopping Cart

- `GET /cart` - View cart contents
- `POST /cart/add` - Add item to cart
- `DELETE /cart/remove` - Remove item from cart

Example product JSON:
```json
{
  "name": "Laptop",
  "price": 999.99
}
```

------------------------------------------------------------------------------------

## 🔧 Troubleshooting

1. **Port Already in Use**
   ```bash
   netstat -ano | findstr :8080
   taskkill /PID <PID> /F
   ```

2. **Maven Wrapper Issues**
   - Try cleaning the wrapper:
     ```bash
     mvn -N wrapper:wrapper
     ```

3. **Application Not Starting**
   - Check Java version
   - Verify no other application is using port 8080
   - Check console for error messages

------------------------------------------------------------------------------------

## 💡 Future Improvements

- [ ] Add database persistence (MySQL/PostgreSQL)
- [ ] Implement user authentication
- [ ] Add product categories
- [ ] Support for product images
- [ ] Shopping cart persistence
- [ ] Order processing system
- [ ] User profiles and order history
- [ ] Admin dashboard
- [ ] Product inventory management
- [ ] Frontend in React/Angular

------------------------------------------------------------------------------------

## 📜 License

This project is open-source and available under the MIT License.



