<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../page/header.html" %>

<form action="/servlet/infoServlet" method="post">

	氏名:<input type="text" name="name" required="required"><br><br>
	会社:<input type="text" name="company"><br><br>
	メールアドレス:<input type="text" name="mailAddress" required="required"><br><br>
	お問い合わせ内容:<br><textarea name="info" rows="4" cols="40" ></textarea><br><br>
	メルマガ種類:<br>
	総合案内:<input type="checkbox" name="mailKind" value="総合案内"><br>
	セミナー案内:<input type="checkbox" name="mailKind" value="セミナー案内"><br>
	求人案内:<input type="checkbox" name="mailKind" value="求人採用情報"><br><br>
	資料請求希望:<br>
	Yes<input type="radio" name="radio" value="yes"><br>
	No<input type="radio" name="radio" value="no"><br><br>
	<input type="submit" value="送信">

</form>

<%@include file="../page/footer.html" %>