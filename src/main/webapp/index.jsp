<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: harbo
  Date: 2018/1/9
  Time: 14:36
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录 - HAERMS</title>
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/managedepart.css" rel="stylesheet"/>
</head>
<body>
<jsp:include page="decorations/nav.jsp"/>
<div class="content">
    <div class="container inline-block-center">
        <s:action name="allDepartments" namespace="/department"/>
        <s:iterator value="#request.AllDepartments" var="department" status="alldepart">
            <div class="block">
                <div class="photo">
                    <img src="<s:property value="#department.image"/>" alt="x">
                    <a href="">点击查看</a>
                </div>
                <div class="info">
                    <h2 class="title"><s:property value="#department.chinesaeName"/></h2>
                    <a title="<s:property value="#department.englishName"/>">
                        <span class="english-name cut"><s:property value="#department.englishName"/></span>
                    </a>
                    <div class="block-with-text school-intro">
                        <a title="<s:property value="#department.introduction"/>">
                            <span><s:property value="#department.introduction"/> </span>
                        </a>
                    </div>
                </div>
            </div>
        </s:iterator>
    </div>
</div>
<jsp:include page="decorations/footer.jsp"/>
<s:debug/>
</body>
</html>
