CREATE TABLE TRANS.trainer_info (
       id BIGINT IDENTITY PRIMARY KEY NOT NULL,
        hospital_department_id BIGINT NOT NULL,
        fname VARCHAR(50) NOT NULL,
        uniy VARCHAR(100) NOT NULL,
        major VARCHAR(100)NOT NULL,
        gpa decimal(3,2)NOT NULL,
        phone VARCHAR(250)NOT NULL,
        dot VARCHAR(100) NOT NULL,
        created_on DATETIME NOT NULL,
        created_by BIGINT NOT NULL,
        update_on DATETIME,
        updated_by BIGINT,
        FOREIGN KEY (hospital_department_id) REFERENCES REFRENC.HOSPITALS(ID),
)

