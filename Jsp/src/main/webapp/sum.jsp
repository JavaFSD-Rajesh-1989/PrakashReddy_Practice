<!-- sum.jsp -->
<html>
<body>
    <h1>Scriptlet Example: Sum Calculation</h1>
    <%
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
    %>
    <p>The sum of <%= num1 %> and <%= num2 %> is: <%= sum %></p>
</body>
</html>
