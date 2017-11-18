<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<title>UPDATE PAGE</title>
		<meta charset="utf-8" />
	</head>

	<body>
		<h3>员工信息修改</h3>
		<form action="${pageContext.request.contextPath}/emp/update_emp.do" method="post">
		<table>
			<tr>
				<td>员工编号</td>
				<td>
					${eno }
					<input type="hidden" name="empno" value="${empno }"/> 
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>
					<input type="text" name="ename" value="${ename}"/>
				</td>
			</tr>
			<tr>
				<td>岗位</td>
				<td>
					<input type="text" name="job" value="${job}"/>
				</td>
			</tr>
			<tr>
				<td>上级</td>
				<td>
				<input type="number" name="mgr" value="${mgr}" />
				</td>
			</tr>
			<tr>
				<td>入职日期</td>
				<td><input type="date" name="hiredate" value="${hiredate}"/></td>
			</tr>
			<tr>
				<td>工资</td>
				<td><input type="number" name="sal" value="${sal}"/></td>
			</tr>
			<tr>
				<td>奖金</td>
				<td>
					<input type="number" name="comm" value="${emp.comm}" />
				</td>
			</tr>
			<tr>
				<td>部门编号</td>
				<td>
				<input type="number" name="deptno" value="${deptno}" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="UPDATE" />
				</td>
				<td>
					<input type="reset" value="RESET">
				</td>
			</tr>
		</table>
		</form>
	</body>

</html>