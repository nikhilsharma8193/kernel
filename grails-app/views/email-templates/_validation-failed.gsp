<g:applyLayout name="emailMain">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <div>
            Hello,
        </div>
        <br>
        <div>
            Domain Validation Failed.
            <g:render template="/email-templates/developers-common" plugin="kernel" />
        </div>
        <br>
        <g:each in="${gormInstances }" var="instance">
            <kernel:renderErrors bean="${instance }" />
        </g:each>
        <br>
        From,<br>
        ${appName } Server
    </body>
    </html>
</g:applyLayout>