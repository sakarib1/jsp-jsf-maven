<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
<html>

<body>

	<h:outputText value="Simple Test"></h:outputText>

	<h:form>
		<h:inputText value="#{userBean.name}" />
		<h:inputText value="#{userBean.surname}" />
		<h:commandButton value="Submit" action="#{userBean.persistUser()}" />
	</h:form>

</body>
</html>
</f:view>