# TestVKBot

##### Описание 

Реализация задания https://docs.google.com/document/d/1x_EEtb1AbU83dlJHVnI4GYkoSnGmXYmzqoM6q_BceF0/edit

#
##### Подготовка к запуску
Для начала необходимо зайти в настройки паблика __Сообщения > Настройки для бота__ и включить возможности ботов. После чего перейти в __Настройки > Работа с API__ и создать ключ доступа.

<p align="center">
  <img src="https://github.com/IvanovAndrey/TestVKBot/blob/main/pic/settings1.PNG?raw=true" />
</p>

Далее перейти запустить ngrok и ввести команду `ngrok http <номер используемого порта>`

Затем перейти в Callback API и указать версию API, адрес сервера в ngrok и секретное слово.
<p align="center">
  <img src="https://github.com/IvanovAndrey/TestVKBot/blob/main/pic/settings2.PNG?raw=true" />
</p>

#
##### Конфигурация
В __application.yaml__ необходимо указать:
+ token: confirmation: - строка, которую должен вернуть сервер
+ token: access: - секретный ключ доступа (токен)
+ secret: key: - секретный ключ для сервера
+ server: port: - номер порта запуска приложения (обычно 8080)
