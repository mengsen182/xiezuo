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

                            addFinanceWindow();
                    }},{
                    text:'批量删除',iconCls:'icon-remove',handler:function () {
                        /*alert("删除");*/
                        var checkFinance = $("#financeHg").datagrid("getChecked");
                        var ids = "";
                        if(checkFinance==null||checkFinance.length<=0) {
                            alert("请选择需要删除的选项");
                            return ;
                        }
                        if(confirm("确定要删除这些记录吗?")) {
                            $.each(checkFinance,function (index,item) {
                                ids = ids + item.id + ",";
                            })
                            $.post("${pageContext.request.contextPath}/finance/deleteFinanceByIds",{"ids":ids},function (data) {
                                alert(data.msg);
                                $("#financeHg").datagrid("reload");
                            })
                        }
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
            $("#saveAddFinanceButton").click(function () {
                var finance = $("#addFinanceForm").serialize();
                alert(finance);
                $.post("${pageContext.request.contextPath}/finance/addFinance",finance,function (data) {
                    alert(data.msg);
                    $("#addFinanceForm").form("clear");
                    $("#addFinanceWindow").window("close");
                    $("#financeHg").datagrid("reload");
                })
            })
            $("#saveUpdateFinanceButton").click(function () {
                var finance = $("#updateFinanceForm").serialize();
                $.post("${pageContext.request.contextPath}/finance/updateFinance",finance,function (data) {
                    alert(data.msg);
                    $("#updateFinanceForm").form("clear");
                    $("#updateFinanceWindow").window("close");
                    $("#financeHg").datagrid("reload");
                })
            })
        })
        function addFinanceWindow() {
            $.get("${pageContext.request.contextPath}/finance/queryAllType",function (finance) {
                $("#addFinanceTypeidCombobox").combobox({
                    valueField:'typeid',
                    textField:'typeName',
                    data:finance,
                    editable:false

                })

                $("#addFinanceWindow").window("open");
           })

        }
        function updateFinance(id) {
           /* alert("修改" + id);*/
            $.get("${pageContext.request.contextPath}/finance/queryFinanceById",{"id":id},
                function (data) {

                $("#updateFinanceId").val(data.id);
/*
                    $("#updateFinanceTypeidCombobox").combobox("setValue", data.type.typeName);
*/
                    ("#updateFinanceTypeidCombobox").combobox({
                        url:"${pageContext.request.contextPath}/finance/queryAllType",
                        valueField:"typeid",
                        textField:"typeName",
                        method:"get",
                        data:data
                    })
                $("#updateFinanceMoney").textbox('setValue', data.money);
                $("#updateFinanceBalance").textbox("setValue", data.balance);
                $("#updateFinanceRemark").textbox("setValue", data.remark);

            })

            $("#updateFinanceWindow").window("open");
        }
        function deleteFinance(id) {
            /*alert("删除" + id);*/
            if(confirm("确定删除该记录吗?")) {
                $.post("${pageContext.request.contextPath}/finance/deleteFinanceById",{"id":id},function (data) {
                    alert(data.msg);
                    $("#financeHg").datagrid("reload");
                })

            }

        }

    </script>
</head>
<body>
    <table id="financeHg"></table>
    <!--添加windows-->
    <div class="easyui-window" id="addFinanceWindow" closed="true"  title="添加" style="top: 10%;left: 20%;width: 400px;height: 350px;padding: 40px 80px;">

        <form id="addFinanceForm">

        <div>
            财务类型:<input id="addFinanceTypeidCombobox" class="easyui-combobox" name="typeid">
        </div>
        <div>
            财务资金:<input id="addFinanceMoney" class="easyui-textbox" name="money"/>
        </div>
        <div>
            账户余额:<input id="addFinanceBalance" class="easyui-textbox" name="balance"/>
        </div>
        <div>
            备注信息:<input id="addFinanceRemark" class="easyui-textbox" name="remark"/>
        </div>

        </form>
        <div>
            <button id="saveAddFinanceButton" class="easyui-linkbutton" iconCls="icon-save">保存</button>
        </div>
    </div>
<!--修改弹窗-->
    <div class="easyui-window" id="updateFinanceWindow" closed="true"  title="修改" style="top: 10%;left: 20%;width: 400px;height: 350px;padding: 40px 80px;">

        <form id="updateFinanceForm">

            <div>
                财务类型:<input id="updateFinanceTypeidCombobox" class="easyui-combobox" name="typeid"
                           >

                <input type="hidden" name="id" id="updateFinanceId"/>
            </div>
            <div>
                财务资金:<input id="updateFinanceMoney" class="easyui-textbox" name="money"/>
            </div>
            <div>
                账户余额:<input id="updateFinanceBalance" class="easyui-textbox" name="balance"/>
            </div>
            <div>
                备注信息:<input id="updateFinanceRemark" class="easyui-textbox" name="remark"/>
            </div>

        </form>
        <div>
            <button id="saveUpdateFinanceButton" class="easyui-linkbutton" iconCls="icon-save">保存</button>
        </div>
    </div>
</body>
</html>
