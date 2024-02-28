//studentForm.jsp
<!DOCTYPE html>
<html>

<head>
    <title>Student Form</title>
</head>

<body>
    <h2>Student Information Form</h2>
    <form action="processForm.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>

        <label for="age">Age:</label>
        <input type="text" id="age" name="age"><br><br>

        <label for="grade">Grade:</label>
        <input type="text" id="grade" name="grade"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>

</html>


//processForm.jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Process Form</title>
</head>

<body>
    <h2>Submitted Student Information</h2>
    <%-- Retrieve form parameters --%>
    <% String name = request.getParameter("name"); %>
    <% String age = request.getParameter("age"); %>
    <% String grade = request.getParameter("grade"); %>

    <%-- Display submitted information --%>
    <p>Name: <%= name %></p>
    <p>Age: <%= age %></p>
    <p>Grade: <%= grade %></p>
</body>

</html>