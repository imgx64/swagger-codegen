:: Generated by: https://github.com/swagger-api/swagger-codegen.git
::

@echo off

dotnet restore srcIO.Swagger
dotnet build srcIO.Swagger
echo Now, run the following to start the project: dotnet run -p srcIO.SwaggerIO.Swagger.csproj --launch-profile web.
echo.