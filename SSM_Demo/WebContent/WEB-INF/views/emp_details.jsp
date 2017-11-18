<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>EMPLOYEE INFORMATION</title>
<meta charset="utf-8" />
</head>
<body>
	<h1>员工信息操作平台</h1>
	<h3>欢迎${param.username }登录   
	<a href="${pageContext.request.contextPath }/emp/report1.do">报表查看</a></h3>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>岗位</td>
			<td>上级</td>
			<td>入职日期</td>
			<td>工资</td>
			<td>奖金</td>
			<td>部门编号</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.emps }" var="emp">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.mgr }</td>
				<td>${emp.hiredate }</td>
				<td>${emp.sal }</td>
				<td>${emp.comm }</td>
				<td>${emp.deptno }</td>
				<td><a
					href="${pageContext.request.contextPath }/emp/del_emp.do?empno=${emp.empno}"
					onclick="return confirm('确认删除吗？')">删除</a>
					<a href="${pageContext.request.contextPath }/emp/tiao_update.do?empno=${emp.empno}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<a href="${pageContext.request.contextPath}/emp/tiao_save.do">新增员工</a>
	<hr />
	员工ID：
	<input type="number" value="1" id="empno" />
	<a href="${pageContext.request.contextPath }/emp/jqfind_emp.do?empno="
		onclick="findByIdHandler()" id="findById">精确查询</a>
	<h3>
		${emp111 }
	</h3>
	
	<hr />
	<form action="${pageContext.request.contextPath}/emp/mhfind_emp.do"
		method="post">
		员工姓名：<input name="ename" type="text" value="a"/> 
		 <input type="submit" value="模糊查询"/>
	</form>
	<h3>
	<table>
		<c:forEach items="${emp222 }" var="e1">
		<tr>
			<td>${e1.empno }</td>
			<td>${e1.ename }</td>
			<td>${e1.job }</td>
			<td>${e1.mgr }</td>
			<td>${e1.hiredate }</td>
			<td>${e1.sal }</td>
			<td>${e1.comm }</td>
			<td>${e1.deptno }</td>
		</tr>
		</c:forEach>
	</table>
	</h3>	
	<script>
		function findByIdHandler() {
			//1-获取input-empno
			var empno = document.querySelector("#empno").value;
			console.log(empno);
			//2-获取a节点，拼接href属性
			var aNode = document.querySelector("#findById");
			console.log(aNode.href);
			aNode.href = aNode.href + empno;
			console.log(aNode.href);
			//3-实现跳转
			return true;
		}
	</script>
</body>
</html>