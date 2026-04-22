# Deploy Faculty AI System on Railway

## 1. Push the project to GitHub

Create a GitHub repository and push the project folder:

```powershell
cd "C:\Users\Agrima Bajpai\Downloads\faculty-ai-system\faculty-ai-system"
git init
git add .
git commit -m "Prepare Faculty AI System for deployment"
git branch -M main
git remote add origin <your-github-repo-url>
git push -u origin main
```

## 2. Create a Railway project

1. Go to [Railway](https://railway.com/).
2. Create a new project.
3. Choose `Deploy from GitHub repo`.
4. Select your repository.

## 3. Add a MySQL service

1. In the same Railway project, click `+ New`.
2. Add `MySQL`.
3. Railway will create database environment variables automatically.

## 4. Configure the web service variables

On your Spring Boot service, add these variables:

- `DB_HOST` = `${{MySQL.MYSQLHOST}}`
- `DB_PORT` = `${{MySQL.MYSQLPORT}}`
- `DB_NAME` = `${{MySQL.MYSQLDATABASE}}`
- `DB_USER` = `${{MySQL.MYSQLUSER}}`
- `DB_PASSWORD` = `${{MySQL.MYSQLPASSWORD}}`
- `SHOW_SQL` = `false`

If you later use Gemini or another AI key:

- `GEMINI_API_KEY` = your real key

## 5. Generate the public URL

1. Open your deployed web service in Railway.
2. Go to `Settings` -> `Networking`.
3. Click `Generate Domain`.

Railway will give you a public link like:

`https://faculty-ai-system-production.up.railway.app`

That is the shareable link you can submit to your professor.

## 6. Test after deployment

Open:

- `/`
- `/students`
- `/students/new`
- `/actuator/health`

## 7. Important note

`localhost` is never public. The Railway domain is the real always-available link, as long as the Railway service stays deployed and running.
