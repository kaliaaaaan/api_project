# Проект API тестов для сайта [Reqres.in](https://reqres.in/)

<p>
  <img src="media/logo/logo.png" alt="c"/>
</p>

## Содержание:
+ [Стек технологий](#computer-использованный-стек-технологий)
+ [Тестовые сценарии](#clipboard-Тестовые-сценарии)
+ [Запуск тестов из терминала](#desktop_computer-Запуск-тестов-из-терминала)
+ [Сборка в Jenkins](#-Сборка-в-Jenkins)
+ [Интеграция с Allure report](#-Интеграция-с-Allure-report)
+ [Интеграция с Allure TestOps](#-Интеграция-с-Allure-testOps)
+ [Интеграция с Jira](#-Интеграция-с-Jira)
+ [Уведомления в Telegram](#-Уведомления-в-Telegram)

## :computer: Стек технологий

<p align="left"> 
<img src="media/images/java-original-wordmark.svg" alt="c" width="50" height="50"/>
<img src="media/images/Intelij_IDEA.svg" height="50" width="50">
<img src="media/images/jenkins-original.svg" height="50" width="50">
<img src="media/images/Allure_Report.svg" height="50" width="50">
<img src="media/images/Allure_TestOps.svg" height="50" width="50">
<img src="media/images/github-original-wordmark.svg" height="50" width="50">
<img src="media/images/JUnit5.svg" height="50" width="50">
<img src="media/images/Rest-Assured.svg" height="50" width="50">
<img src="media/images/jira-original-wordmark.svg" height="50" width="50">
</p>

## :clipboard: Тестовые сценарии
+ :white_check_mark: Проверка создания пользователя (CREATE)
+ :white_check_mark: Проверка удаления пользователя (DELETE)
+ :white_check_mark: Проверка авторизации (LOGIN - SUCCESSFUL)
+ :white_check_mark: Проверка изменения пользователя запросом put (UPDATE)
+ :white_check_mark: Проверка изменения пользователя запросом patch (UPDATE)

### Запуск тестов из терминала
```
gradle clean test
```

### <img title="Jenkins Build" src="media/images/jenkins-original.svg" alt="c" width="30" height="30"/> [Сборка в Jenkins](https://jenkins.autotests.cloud/job/pronyushkin_api_project/build?delay=0sec) 

Также можно переопределить параметры запуска:

```
clean
${TASK}
```

<p align="center">
<img title="Jenkins Build" src="media/screenshots/jenkins-api_screen.png">
</p>

## <img name="allure" src="media/images/Allure_Report.svg" title="Allure Report" width="4%"/> <a href="https://jenkins.autotests.cloud/job/pronyushkin_api_project/10/allure/" target="_blank">Пример Allure-отчета</a>

<p align="center">
<img title="Allure Overview" src="media/screenshots/allure-api-screen.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/screenshots/allure2-screen.png">
</p>

## <img name="TestOps" src="media/images/Allure_TestOps.svg" title="Allure TestOps" width="4%"/> <a href="https://allure.autotests.cloud/project/3841/dashboards" target="_blank">Интеграция с Allure TestOps</a>

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>
На Dashboard в <code>Allure TestOps</code> отображена статистика пройденных тестов.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screenshots/testops_main-api.png">
</p>
<p align="center">
<img title="Allure TestOps DashBoard" src="media/screenshots/testops-case-api.png">
</p>

## <img name="Jira" src="media/images/jira-original-wordmark.svg" title="Jira" width="4%"/> <a href="https://jira.autotests.cloud/browse/HOMEWORK-979" target="_blank">Интеграция с Jira</a>

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>. В задаче отображаются прикреплённые к ней тест-кейсы, а также результаты запусков/прохождения тестов.

<p align="center">
<img title="Jira" src="media/screenshots/jira-api.png">
</p>


## <img name="telegram" width="4%" style="vertical-align:middle" title="Telegram" src="media/images/telegram.svg"> <a href="https://t.me/+W3sjUdH_PSk1Mjdi" target="_blank">Уведомления в Telegram с использованием бота</a> 


После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screenshots/telegram_screen.png">
</p>
