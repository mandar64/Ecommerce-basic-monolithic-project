<%@ page import="java.sql.*" %>
<html>
  <body>
    <h2>Products</h2>
    <ul>
    <%
      try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/ecommerce", "postgres", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name, price FROM products");
        while (rs.next()) {
          out.println("<li>" + rs.getString("name") + " - $" + rs.getDouble("price") + "</li>");
        }
        conn.close();
      } catch (Exception e) {
        out.println("<li>Error: " + e.getMessage() + "</li>");
      }
    %>
    </ul>
  </body>
</html>

