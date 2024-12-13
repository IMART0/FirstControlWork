<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>Welcome!</title>
    <meta charset="utf-8"/>
</head>
<body>
<h1>Расписание</h1>

<div>

    <table>
        <#list schedules as schedule>
            <tr>
                <a href="detail?id=${schedule.id}">
                    ${schedule.weekday}, ${schedule.date}, ${schedule.teacher}, ${schedule.group_number}
                </a><br>
            </tr>
        </#list>
    </table>

</div>

</body>
</html>