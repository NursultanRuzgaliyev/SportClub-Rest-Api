create table coach(
    id serial primary key,
    name varchar(50),
    specialization varchar(100)
);
INSERT INTO coach (name, specialization) VALUES
                                             ('John Doe', 'Fitness Trainer'),
                                             ('Jane Smith', 'Yoga Instructor'),
                                             ('Alex Brown', 'Strength and Conditioning Coach');
