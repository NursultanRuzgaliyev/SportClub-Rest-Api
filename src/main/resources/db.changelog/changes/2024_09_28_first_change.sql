-- Создание таблицы SportType
CREATE TABLE sporttype (
                           id serial PRIMARY KEY,
                           name VARCHAR(50),
                           description VARCHAR(100)
);

-- Вставка данных в таблицу SportType
INSERT INTO sporttype (name, description) VALUES
                                              ('Football', 'Team sport played with a round ball'),
                                              ('Basketball', 'Team sport played on a rectangular court'),
                                              ('Tennis', 'Sport played with a racket and ball'),
                                              ('Swimming', 'Sport that involves moving through water'),
                                              ('Athletics', 'A collection of sporting events such as running and jumping'),
                                              ('Boxing', 'Combat sport involving two participants fighting with fists'),
                                              ('Gymnastics', 'Sport involving physical exercises and performances'),
                                              ('Cycling', 'Sport involving riding bicycles'),
                                              ('Rowing', 'Sport that involves propelling a boat using oars'),
                                              ('Wrestling', 'Combat sport involving grappling techniques'),
                                              ('Judo', 'Martial art focused on grappling and throws'),
                                              ('Karate', 'Martial art that focuses on striking techniques'),
                                              ('Skiing', 'Sport of gliding over snow on skis'),
                                              ('Snowboarding', 'Sport of riding on a snowboard down snow-covered slopes'),
                                              ('Volleyball', 'Team sport played with a ball and net');
