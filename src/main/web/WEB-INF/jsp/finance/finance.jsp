<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/13/013
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Finance</title>
    <%@include file="../easyuiBasic.jsp"%>
    <script type="text/javascript">
        $(function () {
            $("#financeHg").datagrid()
        })
    </script>
</head>
<body>
    <table id="financeHg"></table>
</body>
</html>
