
<%@page import="java.sql.ResultSet"%>
<%@page import="factory.connfac"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<div>
    <table class="table table-responsive">
        <thead>
            <tr>
                <th class="text-center">amity_id</th>
                <th class="text-center">comp_id</th>
                <th class="text-center">Comp_cat</th>
                <th class="text-center">Comp_desc</th>
                <th class="text-center">date</th>
                <th class="text-center">status</th>
                <th class="text-center">Action</th>
            </tr>
            <tr>
                <%
                    String t1, t2, t3, t4, t5, t6;
                    String amity_id = "", comp_id = "", cat = "", desc = "", dat = "", status = "";
                    Connection con = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint management?zeroDateTimeBehavior=convertToNull", "root", "1234");
                    ResultSet rs = connfac.getCon().createStatement().executeQuery("select * from complaints where comp_cat='" + Hostel + "'");
                    while (rs.next()) {
                        t1 = rs.getString(1);
                        t2 = rs.getString(2);
                        t3 = rs.getString(3);
                        t4 = rs.getString(4);
                        t5 = rs.getString(5);
                        t6 = rs.getString(6);

                %>
            <tr>
                <td> <%=t1%> </td>
                <td> <%=t2%> </td>
                <td> <%=t3%> </td>
                <td> <%=t4%> </td>
                <td> <%=t5%> </td>
                <td> <%=t6%></td>

                <td>

                    <%  if (rs.getString(6).equals("Pending")) {%>
                    <form action="Chgstatus1" method="Get">
                        <input type="hidden" name="cid" value="<%=t2%>">

                        <input type="submit" value="Processing">

                    </form>

                    <%  } else if (rs.getString(6).equals("Processing")) {%>
                    <form action="chgstatus3" method="Get">
                        <input type="hidden" name="cid" value="<%=t2%>">
                        <%--<select class="form-control" onchange="this.form.submit();>
                            <option value="default" selected="">Select your action</option>
                            <option value="Processing">Processing</option>
                            <option value="Resolved">Resolved</option>
                        </select>--%>
                        <input type="submit" value="Resolved">
                    </form>
                    <%
                    } else {
                    %>
                    <input type="hidden" name="id" value="<%=t2%>">
                    No Action


                    <%  }%>
                </td>

            </tr>


            <%
                }

            %>

        </thead>

        <%--  <tbody>
        <tr>
            <td>1</td>
            <td>Prateek Gogia</td>
            <td>Hostel</td>
            <td>WiFi not working.</td>
            <td><a href="mailto:gogia.prateek@hotmail.com">Mr. IT Uncle</a></td>
            <td>
                <select class="form-control">
                    <option>Pending</option>
                    <option>Processing</option>
                    <option>Resolved</option>
                </select>
            </td>
        </tr>
        </tbody>--%>
    </table>
    
    <td class="text-center">101</td>
    <td class="text-center">1234</td>
    <td class="text-center">ASET</td>
    <td class="text-center">Engineering na ho payegi</td>
    <td class="text-center">18/08/1995</td>
    <td class="text-center">Pending</td>
    <td class="text-center">
        <select class="form-control">
            <option></option>
            <option></option>
            <option></option>
        </select>
    </td>
</tr>
</thead>
</table>
</div>