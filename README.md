---------------------ATM Uygulaması----------------
Bu Java uygulaması, temel ATM işlevselliğini simüle eden bir konsol programıdır. Kullanıcılar, hesap bakiyelerini yönetebilir, para yatırabilir, para çekebilir ve bakiye sorgulayabilirler.

----Özellikler-----
Para Yatırma: Kullanıcılar, mevcut bakiyeye eklemek istedikleri miktarı yatırabilirler.
Para Çekme: Kullanıcılar, mevcut bakiyeden para çekebilirler.
Bakiye Sorgulama: Kullanıcılar, hesap bakiyelerini görüntüleyebilirler.
Çıkış Yapma: Kullanıcılar, uygulamadan çıkış yapabilirler.

------Kullanım------
IDE Kurulumu: Uygulamayı çalıştırmak için Eclipse IDE veya Java destekli bir IDE kullanabilirsiniz.
Çalıştırma: youtube sınıfını içeren Java dosyasını çalıştırın.
İşlem Seçimi: Ana menüden işlem seçin ve yönergeleri takip edin.

-------Kod Açıklamaları------
-Para Yatırma ve Çekme:
Kullanıcıdan alınan miktar, geçerlilik kontrolleri (sıfır olmayan değerler) yapıldıktan sonra bakiye güncellenir.
Para yatırma ve çekme işlemleri arasında 3 saniyelik bir bekleme süresi eklenmiştir.

-Bakiye Görüntüleme:
Mevcut bakiye ekrana yazdırılır.

-Çıkış:
Kullanıcı, uygulamadan çıkabilir ve kaynaklar serbest bırakılır (Scanner nesnesi kapatılır).

------------Geliştirme Notları---------
Ana Menü Yönetimi: Program, kullanıcı işlemlerini ana menüye dönerek yönetir. İşlem tamamlandıktan sonra kullanıcıya tekrar ana menüye dönme veya başka bir işlem yapma seçeneği sunulur.
Geçersiz Girişler: Geçersiz girişler için kullanıcıya hata mesajları gösterilir ve ana menüye dönülür.
Para Yatırma ve Çekme: Para çekme işlemi sırasında bakiye yetersiz olduğunda kullanıcıya para yatırma seçeneği sunulur.

--------Derleme ve Çalıştırma--------
Derleme: javac youtube.java komutunu kullanarak sınıf dosyasını derleyin.
Çalıştırma: java youtube komutunu kullanarak programı çalıştırın.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


---------------------ATM Application----------------
This Java application simulates basic ATM functionality through a console program. Users can manage their account balance, deposit money, withdraw money, and check their balance.

----Features----
Deposit Money: Users can deposit the amount they wish to add to their current balance.
Withdraw Money: Users can withdraw money from their current balance.
Check Balance: Users can view their account balance.
Exit: Users can exit the application.

------Usage------
IDE Setup: You can run the application using Eclipse IDE or any Java-supported IDE.
Execution: Run the Java file containing the youtube class.
Select Operation: Choose an operation from the main menu and follow the prompts.

-------Code Description------
-Deposit and Withdraw:
Amounts entered by the user are validated (e.g., non-zero values) before updating the balance.
A 3-second delay is included between deposit and withdrawal operations.

-Check Balance:
The current balance is displayed on the screen.

-Exit:
The user can exit the application, and resources are released (the Scanner object is closed).

------------Development Notes---------
Main Menu Management: The program continuously manages user operations by returning to the main menu. After each transaction, users are given the option to return to the main menu or perform another transaction.
Invalid Inputs: Invalid inputs are handled with error messages, and users are returned to the main menu.
Deposit and Withdraw: When withdrawing money, if the balance is insufficient, the user is given the option to deposit money.

--------Compilation and Execution--------
Compile: Use the command javac youtube.java to compile the class file.
Run: Use the command java youtube to run the program.
