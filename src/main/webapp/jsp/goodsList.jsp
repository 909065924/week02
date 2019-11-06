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
<link rel="stylesheet" type="text/css" href="${path}/css/css.css"/>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="font-size: 25px">商品列表页面</h1>
<input type="button" value="新增商品" onclick="addGoods()">
<input type="button" value="批量删除" onclick="deleAllGoods()">
	<div align="center">
	<form action="<%=path%>/getGoodsAll" method="post" > 

	
		<table>
			<thead></thead>
			<tbody>
				<tr>
					<td>选择</td>
					<td>商品名称</td>
					<td>商品英文名</td>
					<td>商品品牌</td>
					<td>商品种类</td>
					<td>尺寸</td>
					<td>价格</td>
					<td>数量</td>
					<td>标签</td>
					<td>图片</td>
					<td colspan="2">操作</td>
				</tr>
			<c:forEach items="${page.list}" var="l">
				<tr>
					<td><input type="checkbox" value="${l.gid}" class="a"></td>
					<td>${l.gcname}</td>
					<td>${l.gename}</td>
					<td>${l.bname}</td>
					<td>${l.sname}</td>
					<td>${l.gsize}</td>
					<td>${l.gprice}</td>
					<td>${l.gsum}</td>
					<td>${l.glabel}</td>
					<td><input type="image" style="width: 30px;height: 30px" src="<%=path%>/looking?path=${l.gpic}"></td>
					<td><input type="button" value="修改" onclick="upd(${l.gid})"></td>
					<td><input type="button" value="删除" onclick="del(${l.gid})"></td>
				</tr>
			</c:forEach>
			</tbody>
			<tfoot> 
				<tr>
					<td colspan="15">
						<a href="<%=path%>/getGoodsAll?pageNum=1">首页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pageNum-1 < 1?1:page.pageNum-1}">上一页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pageNum+1 > page.pages?page.pages:page.pageNum+1}">下一页</a>
						<a href="<%=path%>/getGoodsAll?pageNum=${page.pages}">尾页</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						当前${page.pageNum}/${page.pages}页
					</td>
				</tr>
			</tfoot>
		</table>
	</form>
	</div>
</body>
<script type="text/javascript">

	function addGoods() {
		location="<%=path%>/jsp/addGoods.jsp";
	}

	
	function upd(gid) {
		
	}
	
	function deleAllGoods() {
		var 
		$(".a").each(function () {
			
		});
	}
	
	function del(gid) {
		if(confirm("确认删除"+gid+"条数据?")){
			$.post(
					"<%=path%>/deleteGoodsByGid",
					{gid:gid},
					function (obj) {
						if(obj>0){
							alert("删除成功~");
							location="<%=path%>/getGoodsAll";
						}else{
							alert("删除失败~");
							location="<%=path%>/getGoodsAll";
						}
					},
					"json"
				);
		}else{
			alert("删除取消~");
		}
	
	}
</script>
</html>