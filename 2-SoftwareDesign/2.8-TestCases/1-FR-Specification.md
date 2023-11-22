## Специфікація функції checkWater()
### Опис функції:
Ця функція призначена для отримання інформації про стан повітря навколишнього середовища від сервісу SafeWater. Вона виконує запит до SafeWater і повертає дані про якість повітря та інші важливі параметри.

### Вхідні параметри:
requestor (тип: User) - це об'єкт, який представляє користувача, який надсилає запит. Цей параметр використовується для ідентифікації користувача та його даних.

location (тип: String) - це рядок, який містить інформацію про місцезнаходження користувача або місця, для якого він хоче отримати дані про стан повітря. Цей параметр повинен відповідати певним обмеженням, наприклад, формату місця або координат.

### Вихідні параметри:
waterQualityIndex (тип: Integer) - Індекс якості води, який вказує на рівень забруднення води на числовій шкалі. Це число від 0 до 100, де 0 означає дуже чиста вода, а 100 - найвищий рівень забруднення.

temperature (тип: Float) - це числове значення, яке представляє температуру води в градусах Цельсія на момент отримання даних.

Якщо requestor та location не відпоідаюсь умовам, функція повертає рядок "Помилка авторизації".

### Умови обмежень значень даних:
Параметр requestor повинен бути дійсним об'єктом користувача, який надсилає запит.

Параметр location має відповідати певним обмеженням, що стосуються довжини рядка (не більш 20 символів) та допустимих символів (не допустимі: / \ : ? * ! " < > 1 2 3 4 5 6 7 8 9 0).

Функція повинна здійснювати відповідну автентифікацію і авторизацію користувача перед надсиланням запиту до  SafeWater.