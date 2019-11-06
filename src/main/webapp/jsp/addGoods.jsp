<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE html PUBLIC>

<html>
<head>
<link rel="stylesheet" type="text/css" href="path/css/css.css"/>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="font-size: 25px">新增商品页面</h1>
	
	<div align="center">
	<form action="<%=path%>/addGoods" method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="gcname"><br><br>
		英文名称:<input type="text" name="gename"><br><br>
		商品品牌:	
			<select name="bid"></select><br><br>
		商品种类:
			<select name="sid"></select><br><br>
		尺寸:<input type="text" name="gsize"><br><br>
		单价(元):<input type="text" name="gprice"><br><br>
		数量:<input type="text" name="gsum"><br><br>
		标签:<input type="text" name="glabel"><br><br>
		商品图片上传:<input type="file" name="img"><br><br>
		<input type="submit" value="提交">
	</form>
	</div>
</body>
<script type="text/javascript">

	$.post(
		"<%=path%>/getBrandAll",
		"",
		function (obj) {
			for (var i = 0; i < obj.length; i++) {
				$("[name=bid]").append("<option value='"+obj[i].bid+"'>"+obj[i].bname+"</option>");
			}
		},
		"json"
	);
	
	$.post(
			"<%=path%>/getGoodsKindAll",
			"",
			function (obj) {
				for (var i = 0; i < obj.length; i++) {
					$("[name=sid]").append("<option value='"+obj[i].sid+"'>"+obj[i].sname+"</option>");
				}
			},
			"json"
		);
	
</script>
</html>