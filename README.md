این یک پروژه مدیریت یک کتابخانه با داشتن قابلیت مدیریت خطا ها.
پروژه شامل کلاس‌های زیر است:
 کلاس Book 
 نگهداری اطلاعات مربوط به کتاب (عنوان و تعداد صفحات).  

title   
pageCount  

متد ها :
Book(String title, int pageCount) 
getTitle() 
getPageCount()  
toString()

 کلاس Library 
 مدیریت عملیات کتابخانه (اضافه کردن، قرض گرفتن، برگرداندن و نمایش کتاب‌ها).  
 (لیست کتاب‌های موجود در کتابخانه)  

متدهای:
addBook(Book book) 
borrowBook(String title)  
returnBook(String title)  
listBooks()   
findBook(String title)

خطاها :
EmptyLibraryException: اگر کتابخانه خالی باشد.  
BookNotFoundException: اگر کتابی با عنوان داده‌شده وجود نداشته باشد.  
InvalidBookException: اگر کتاب null باشد.

انواع اکسپشن ها :  
1. BookNotFoundException: وقتی کتابی در کتابخانه پیدا نشود.  
2. EmptyLibraryException: وقتی کتابخانه خالی باشد.  
3. InvalidBookException: وقتی کتاب نامعتبر (null) باشد.
   که همه این ها در غالب کلاس معرفی شده در برنامه .


کلاس Main
 وظیفه: اجرای برنامه و تست کتابخانه try-catch.  
1. ایجاد کتاب‌های مجاز و غیر مجاز.
2. اضافه کردن کتاب‌ها به کتابخانه.  
3. امانت گرفتن و برگرداندن کتاب.  
4. نمایش کتاب‌های موجود.  
5. مدیریت خطاها (کتاب ناموجود، کتابخانه خالی، کتاب نامعتبر).
