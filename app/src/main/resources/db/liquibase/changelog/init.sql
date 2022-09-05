-- 初始化demo
create table if not exists demo.demo_user (
    id int primary key auto_increment not null,
    name varchar(50) not null
)