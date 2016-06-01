<%-- 
    Document   : login
    Created on : Apr 11, 2016, 9:55:26 AM
    Author     : miracle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Struts and Hibernate Integration</h1>
        <s:form action="login">
        <s:textfield id="userName" name="userName"/>
        <s:password id="password" name="password"/>
        <s:submit value ="checkIn"/>
    </s:form>
    </body>
</html>
