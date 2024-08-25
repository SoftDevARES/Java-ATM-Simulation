import java.util.Scanner;

public class youtube {
    public static void main(String[] args) {
        Scanner bilgial = new Scanner(System.in);

        int bakiye = 0;

        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("Bakiyeniz: " + bakiye);

        while (true) {
            System.out.println("-----------------Ana Menü-------------");
            System.out.println("1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Sorgula");
            System.out.println("4- Çıkış Yap");

            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            int islem = bilgial.nextInt();

            if (islem == 1) {
                while (true) {
                    System.out.println();
                    System.out.println("-----------------Para Yatırma-------------");
                    System.out.println();

                    System.out.print("Ne kadar para yatıracaksınız: ");
                    int ypara = bilgial.nextInt();

                    if (ypara == 0) {
                        System.out.println("Geçersiz");
                    } else {
                        System.out.println("Parayı yerleştiriniz");

                        bakiye += ypara;

                        try {
                            Thread.sleep(3000); // 3 saniye bekletme (3000 milisaniye)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Para yatırma başarılı");
                        System.out.println();
                        System.out.println("Bakiyeniz: " + bakiye);
                        System.out.println();
                        System.out.println("1- Ana Menüyü Dön");
                        System.out.println("2- Tekrar Para Yatır");
                        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                        int bir = bilgial.nextInt();

                        if (bir == 1) {
                            System.out.println();
                            break;
                        } else if (bir == 2) {
                            continue;
                        } else {
                            System.out.println("Geçersiz seçim Ana Menüye dönülüyor...");
                            System.out.println();
                            break;
                        }
                    }
                }

            } else if (islem == 2) {
                while (true) {
                    System.out.println();
                    System.out.println("-----------------Para Çekme-------------");
                    System.out.println();
                    System.out.print("Ne kadar para çekeceksiniz: ");
                    int cpara = bilgial.nextInt();

                    if (cpara == 0) {
                        System.out.println("Geçersiz");
                    } else {
                        if (cpara <= bakiye) {
                            bakiye -= cpara;

                            System.out.println("Paranızı alın");

                            try {
                                Thread.sleep(3000); // 3 saniye bekletme (3000 milisaniye)
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            System.out.println("Para çekme işlemi başarılı");
                            System.out.println();
                            System.out.println("Bakiyeniz: " + bakiye);
                            System.out.println();
                            System.out.println("1- Ana Menüyü Dön");
                            System.out.println("2- Tekrar Para Çek");
                            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                            int bir = bilgial.nextInt();

                            if (bir == 1) {
                                System.out.println();
                                break;
                            } else if (bir == 2) {
                                continue;
                            } else {
                                System.out.println("Geçersiz seçim Ana Menüye dönülüyor...");
                                System.out.println();
                                break;
                            }
                        } else {
                            System.out.println("Bakiye Yetersiz");
                            System.out.println();
                            System.out.println("1- Ana Menüyü Dön");
                            System.out.println("2- Para Yatır");
                            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                            int iki = bilgial.nextInt();

                            if (iki == 1) {
                                System.out.println();
                                break;
                            } else if (iki == 2) {
                                while (true) {
                                    System.out.println();
                                    System.out.println("-----------------Para Yatırma-------------");
                                    System.out.println();

                                    System.out.print("Ne kadar para yatıracaksınız: ");
                                    int ypara = bilgial.nextInt();

                                    System.out.println("Parayı yerleştiriniz");

                                    bakiye += ypara;

                                    try {
                                        Thread.sleep(3000); // 3 saniye bekletme (3000 milisaniye)
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("Para yatırma başarılı");
                                    System.out.println();
                                    System.out.println("Para çekmeye yönlendiriliyorsunuz...");

                                    try {
                                        Thread.sleep(3000); // 3 saniye bekletme (3000 milisaniye)
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    break;
                                }
                            } else {
                                System.out.println("Geçersiz seçim Ana Menüye dönülüyor...");
                                System.out.println();
                                break;
                            }
                        }
                    }
                }

            } else if (islem == 3) {
                System.out.println();
                System.out.println("Bakiyeniz: " + bakiye);
                System.out.println();

            } else if (islem == 4) {
                System.out.println("Çıkış yapıldı");
                bilgial.close();
                break;

            } else {
                System.out.println("Geçersiz işlem Ana Menüye dönülüyor...");
                System.out.println();
                continue;
            }
        }
    }
}
