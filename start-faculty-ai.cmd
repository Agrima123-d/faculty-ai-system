@echo off
setlocal

cd /d "%~dp0"

echo Starting Faculty AI System on http://localhost:8080/students
echo.

call mvnw.cmd -s .mvn\local-settings.xml -o -DskipTests spring-boot:run

endlocal
