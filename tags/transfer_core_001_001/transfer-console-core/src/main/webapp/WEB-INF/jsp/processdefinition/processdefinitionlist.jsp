<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:fn="http://java.sun.com/jsp/jstl/functions"
	xmlns:app="urn:jsptagdir:/WEB-INF/tags">
	<app:unorderedlist list="${model.processDefinitionBeanList}" itemClass="processdefinition">
		<jsp:attribute name="listItem">
			<app:processdefinition item="${item}" />
		</jsp:attribute>
	</app:unorderedlist>
</jsp:root>