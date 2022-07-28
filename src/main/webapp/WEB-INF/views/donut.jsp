<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
        <div class="box">
            <div id="container">
                <div id="window_main">
                    <div id="window_title">Donut: ${donut.getName()}</div>
                    <div id="window_text">
                        <img src="${donut.getPhoto()}"></img>
                        <p><b>Name</b>: ${donut.getName()}</p>
                        <p><b>Calories</b>: ${donut.getCalories()}</p>
                        <c:if test="${fn:length(donut.getExtras()) > 0}">
                            <p><b>Extras</b>:</p>
                            <ul>
                                <c:forEach items="${donut.getExtras()}" var="extra">
                                    <li>${extra}</li>
                                </c:forEach>
                            </ul>
                        </c:if>
                        <div id ="button"><a href ="/"> Home </a></div> <p />
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>