<HTML>
    <HEAD>
        <TITLE>Causing a Runtime Error</TITLE>
    </HEAD>

    <BODY>
        <H1>Causing a Runtime Error</H1>
        <%
            int i = 1;
            i = i / 0;
            out.println("The answer is " + i);
        %>
    </BODY>
</HTML>


           