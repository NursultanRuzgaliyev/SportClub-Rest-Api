Sports Club Management System
Описание
Проект представляет собой систему управления спортивным клубом, разработанную для продвижения здорового образа жизни и стимулирования граждан к занятиям спортом. Эта система помогает администраторам и тренерам управлять спортсменами, их тренировками и видами спорта. Основной целью проекта является облегчение процесса управления спортивной деятельностью для повышения вовлечённости в спорт.

Технологический стек
JDK: 17
Gradle: 7.6.2
Spring Boot: 3.3.4
PostgreSQL: Используется для хранения данных
Liquibase: Для миграции базы данных
Lombok: Для уменьшения шаблонного кода (геттеры/сеттеры)
MapStruct: Для маппинга объектов DTO и сущностей
JUnit: Для модульного тестирования
Spring Security: Для безопасности
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-security'
    implementation 'org.springframework.boot:spring-boot-starter-mail'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.liquibase:liquibase-core'
    compileOnly 'org.projectlombok:lombok'
    runtimeOnly 'org.postgresql:postgresql'
    annotationProcessor 'org.projectlombok:lombok'
    implementation 'org.mapstruct:mapstruct:1.6.2'
    annotationProcessor 'org.mapstruct:mapstruct-processor:1.6.2'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.springframework.security:spring-security-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

Основные классы
1. Athlete
Сущность, представляющая спортсмена, со следующими полями:

id: Уникальный идентификатор.
email: Адрес электронной почты спортсмена.
name: Имя.
age: Возраст.
weightClass: Весовая категория.
sportType: Вид спорта.
trainingSessions: Список тренировок.
promocode: Промокод для скидок.
2. AthleteController
Контроллер для обработки запросов на управление спортсменами:

GET /api/athlete: Получить список всех спортсменов.
GET /api/athlete/{id}: Получить информацию о спортсмене по ID.
POST /api/athlete: Создать нового спортсмена.
PUT /api/athlete/{id}: Обновить данные спортсмена.
DELETE /api/athlete/{id}: Удалить спортсмена.
Дополнительные возможности
Регистрация и верификация пользователей
В системе реализована регистрация пользователей с верификацией по email. После успешной регистрации пользователю отправляется код подтверждения, который необходимо ввести для активации учетной записи.

Основные методы:

register(Users user): Регистрирует пользователя, проверяет наличие учетной записи с данным email, хеширует пароль, отправляет код подтверждения на указанный email. Если email уже зарегистрирован, регистрация не выполняется.
verify(String code, String email): Проверяет код подтверждения, отправленный на email пользователя. Если код совпадает, учетная запись активируется. В случае неудачи, статус пользователя остается "не активирован".
loadUserByUsername(String username): Загружает данные пользователя по email для аутентификации через Spring Security. Если пользователь не найден, выбрасывается исключение UsernameNotFoundException.
Для отправки email используется сервис JavaMailSender, который формирует и отправляет письмо с кодом подтверждения.

Пример отправляемого письма:

Тема: "Ваш код подтверждения"
Текст: "Спасибо за регистрацию. Уважаемый {fullName}, не сообщайте этот код никому: http://localhost:8080/auth/verify?code={code}&email={to}"
