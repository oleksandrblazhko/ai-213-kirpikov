### Словник атрибутів об’єктів

| Об’єкт | Атрибут | 	Короткий опис | Тип |  Обмеження |
| --- | --- | --- | --- | --- |
| User | full_name | Як звати користувача | Текст| Довжина < 100 символів|
| User | date_of_birth | Коли користувач народився | Дата| Довжина < 50 символів|
| User | gender | Якої користувач статі | Текст| Довжина < 50 символів|
| User | email | Електронна адреса користувача | Текст| Довжина < 100 символів|
| Request_water_level | location | Місце, де було зроблено запит | Текст| Довжина < 100 символів|
| Request_water_level | request_time | Час, коли було зроблено запит | Дата| Довжина < 50 символів|
| Request_water_level | request_status | Статус запиту (наприклад, “в обробці”, “завершено”) | Текст| Довжина < 50 символів|
| Answer_on_request | measured_water_level | Виміряний рівень брудності води | Текст| Довжина < 100 символів|
| Answer_on_request | answer_time | Час, коли було надано відповідь | Дата| Довжина < 50 символів|
| Answer_on_request | answer_status | Статус відповіді (наприклад, “в обробці”, “завершено”) | Текст| Довжина < 100 символів|
| SafeWater | measured_water | Функція для вимірювання стану води | Текст| Довжина < 100 символів|
| SafeWater | water_analysis | Функція для аналізу виміряної води | Текст| Довжина < 100 символів|
| SafeWater | providing_recommendations | Функція для надання рекомендацій на основі аналізу води | Текст| Довжина < 100 символів|
