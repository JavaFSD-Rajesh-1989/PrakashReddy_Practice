<!-- greet.jsp -->
<html>
<body>
    <h1>JSP Declaration Example</h1>
    
    
    <%! 
        String greetUser() {
            return "Hello, JSP User!";
        }
    %>

    <!-- Use the method inside a JSP expression -->
    <p>Message: <%= greetUser() %></p>
</body>
</html>
