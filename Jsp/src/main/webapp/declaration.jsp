<html>
<body>
    <h1>JSP Declaration Example</h1>
    <%! 
        // Declaration block for defining methods
        String greetUser() {
            return "Hello, JSP User!";
        }
    %>
    <!-- Use the method in a JSP expression -->
    <p>Message: <%= greetUser() %></p>
</body>
</html>
