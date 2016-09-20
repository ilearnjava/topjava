<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Meal list</title>
</head>
<body>
<h2><a href="index.html">Home</a></h2>
<h2>Meal list</h2>
<table class="table table-striped">
    <thead>
    <tr class="filters">
        <th><input type="text" class="form-control" placeholder="Meal ID" disabled></th>
        <th><input type="text" class="form-control" placeholder="DateTime" disabled></th>
        <th><input type="text" class="form-control" placeholder="Description" disabled></th>
        <th><input type="text" class="form-control" placeholder="Calories" disabled></th>
    </tr>
    </thead>
    <tbody id="myTable">
    <c:forEach items="${mealList}" var="meal">
        <tr style="color:
        <c:if test="${meal.exceed}">red</c:if>
        <c:if test="${!meal.exceed}">green</c:if>">
            <td>${meal.id}</td>
            <td>${fn:replace(meal.dateTime, 'T',' ' )}</td>
            <td>${meal.description}</td>
            <td>${meal.calories}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
