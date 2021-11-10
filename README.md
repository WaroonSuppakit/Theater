# Theater Project

Movie Ticket Reservation Website Demo
เว็บไซต์สำหรับการจองตั๋วภาพยนต์ ที่แสดงตัวเลือกภาพยนต์ โรงภาพยนต์ เวลา รองรับการจองที่นั่ง และการใช้โปรโมชั่นในการจองตั๋ว


# การรันโปรเจค
ทำการติดตั้งและรัน Database บน Docker ด้วยคำสั่ง
```
docker run --name=mysql_theater -e MYSQL_ROOT_PASSWORD=popcat -e MYSQL_DATABASE=theaterDB -p 3307:3306 -d mysql
```
จากนั้นทำการรัน และเรียกใช้เว็บไซต์ที่ localhost:8090/

# จัดทำโดย
- นายกิตติธัช จึงโสภณวิทวัส รหัสนิสิต 6110450022
- นางสาวศรสวรรค์ โกฏิรัตน์ รหัสนิสิต 6110450961
- นายวรุณ สรรพกิจ รหัสนิสิต 6110451398
- นางสาววิชญาดา โหตระไวศยะ รหัสนิสิต 6110451410

01418471 Introduction to Software Engineering
