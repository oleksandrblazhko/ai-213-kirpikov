CREATE TABLE User_n( -- опис користувача
  full_name VARCHAR(100), -- ПІБ користувача
  date_of_birth DATE, -- Дата народження користувача
  gender VARCHAR(50), -- Стать користувача
  email VARCHAR(100), -- email користувача
);

CREATE TABLE Request_water_level( -- опис запиту на рівень забруднення води
  location_n VARCHAR(100), -- місце проведення вимірювань
  request_time DATE, -- час надсилання запиту
  request_status VARCHAR(50), -- статус запиту
  user_id INT,  -- номер користувача, який надсилає запит
  FOREIGN KEY (user_id) REFERENCES User(user_id)
);

CREATE TABLE Answer_on_request(
    measured_water_level FLOAT, -- опис рівня забруднення води
    answer_time DATE, -- час відповіді
    answer_status VARCHAR(50), -- статус відповіді
    requestairquality_id INT, -- номер запиту
    safeWater_id INT, -- номер 
    FOREIGN KEY (requestwaterquality_id) REFERENCES Request_water_level(requestwaterquality_id),
    FOREIGN KEY (safeWater_id) REFERENCES SafeWater(safeWater_id)
);

CREATE TABLE SafeWater( -- опис 
  safeWater_id INT PRIMARY KEY, -- номер 
  measured_water_purity FLOAT, -- виміряний рівень брудності води
  analyze_water FLOAT, -- аналізований рівень брудності води
  provide_recommendation VARCHAR(100), -- рекомендація щодо брудності води
  user_id INT,  -- номер користувача
  FOREIGN KEY (user_id) REFERENCES User_n(user_id)
);

ALTER TABLE User_n ADD (
    user_id INT PRIMARY KEY
);

ALTER TABLE Request_water_level ADD (
    requestwaterquality_id INT PRIMARY KEY
);

    -- Додавання нового стовпця до таблиці User_n
ALTER TABLE User_n 
  ADD mobile_phone CHAR(14);

 -- Додавання обмеження до стовпця
ALTER TABLE User_n 
  ADD CONSTRAINT mobile_format_check 
  CHECK (REGEXP_LIKE(mobile_phone, '^(\([0-9]{3}\))?[0-9]{3}-[0-9]{4}$'));

  ALTER TABLE User_n 
  ADD CONSTRAINT email_check 
  CHECK (REGEXP_LIKE(email, '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$'));
