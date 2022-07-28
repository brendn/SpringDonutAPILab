<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
                    <div id="window_title">Donuts</div>
                    <div id="window_text">
                        <p>Select a donut to view:</p>
                        <c:forEach items="${donuts}" var="donut" >
                            <p><a href="/donut?id=${donut.getId()}">${donut.getName()}</a></p>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>