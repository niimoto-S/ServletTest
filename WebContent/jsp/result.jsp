<%@page import="bean.InfoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../page/header.html" %>

<jsp:useBean id="infoBean" class="bean.InfoBean" scope="request" />

<p>氏名:<br><jsp:getProperty property="name" name="infoBean"/></p>
<p>会社:<br><jsp:getProperty property="company" name="infoBean"/></p>
<p>メールアドレス:<br><jsp:getProperty property="mailAddress" name="infoBean"/></p>
<p>お問い合わせ:<br><jsp:getProperty property="info" name="infoBean"/></p>
<p>メルマガ:<%
if(request.getAttribute("nullpo") != "ぬるぽ"){
	InfoBean bean = new InfoBean();
	bean = (InfoBean)request.getAttribute("infoBean");
	String[] mailKind = bean.getMailKind();
	for(String str : mailKind){
%>
	<br><%=str %>
<%} %>
<%} else { %>
<br>選択していません。
<%} %>
</p>
<p>資料請求希望:<br><jsp:getProperty property="radio" name="infoBean"/></p>

<% if(infoBean.getRadio().equals("yes")){ %>
	<a href="/ServletTest/jsp/dummy.jsp">この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。</a>
<%} %>
<%@include file="../page/footer.html" %>
