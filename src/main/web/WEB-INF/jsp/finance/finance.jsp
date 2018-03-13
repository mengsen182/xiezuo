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
            $("#financeHg").datagrid({
                url:"${pageContext.request.contextPath}/finance/queryFinance",
                method:"GET",
                pagination:true,
                toolbar:[{
                    text:'添加',iconCls:'icon-add',handler:function () {
                        alert("添加")
                    }},{
                    text:'删除',iconCls:'icon-remove',handler:function () {
                        alert("删除");
                    }}],
                columns:[[
                    {field:'ck',checkbox:true},
                    {field:'type',title:'财务类型',width:150,formatter:function (value,row,index) {
                        return row.type.typeName;
                    }},
                    {field:'money',title:'账务资金',width:120},
                    {field:'balance',title:'账户余额',width:120},
                    {field:'remark',title:'备注信息',width:500},
                    {field:'createDate',title:'明细时间',width:150},
                    {field:'id',title:'操作',formatter:function (value,row,index) {
                        var updateButton = "<button onclick='updateFinance(" + value + ")'>修改</button>";
                        var deleteButton = "<button onclick='deleteFinance(" + value + ")'>删除</button>";
                        return updateButton+" "+deleteButton
                    }}
                ]]

            })
        })
        function addFinanceWindow() {
            $("#addFinanceWindow").window("open");
        }
        function updateFinance(id) {
            alert("修改" + id);
        }
        function deleteFinance(id) {
            alert("删除" + id);
        }
    </script>
</head>
<body>
    <table id="financeHg"></table>
    <div class="easyui-windows" id="addFinanceWindow" style="top: 10%;left: 20%;width: 400px;height: 350px;padding: 40px 80px;">
        <div>
            财务类型:<input id="addFinanceTypeidCombobox" class="easyui-combobox">
        </div>
        <div>
            财务资金:<input id="addFinanceMoney" class="easyui-textbox"/>
        </div>
        <div>
            账户余额:<input id="addFinanceBalance" class="easyui-textbox"/>
        </div>
        <div>
            备注信息:<input id="addFinanceRemark" class="easyui-textbox"/>
        </div>
            <div>
                <button id="saveAddFinanceButton" class="easyui-linkbutton" iconCls="icon-save">保存</button>
            </div>
    </div>

</body>
</html>
