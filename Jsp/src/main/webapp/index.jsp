<!-- index.jsp -->
<%@ include file="header.jsp" %>

<html>
<body>
    <h1>Main JSP Page</h1>
    
    <!-- Including Scriptlet Example -->
    <h2>Sum Calculation (Scriptlet Example)</h2>
    <jsp:include page="sum.jsp" />

    <!-- Including Declaration Example -->
    <h2>Greeting (Declaration Example)</h2>
    <jsp:include page="greet.jsp" />

    <!-- Request Parameter Example -->
    <h2>Request Parameter Example</h2>
    <p>Try accessing this page with a query parameter, like this:</p>
    <p><a href="requestExample.jsp?name=John">Click here to pass 'John' as the name</a></p>

    <!-- Including Redirect Example -->
    <h2>Redirect Example</h2>
    <p><a href="redirect.jsp">Click here to see a redirection</a></p>
</body>
</html>
