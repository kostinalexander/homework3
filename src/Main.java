public class Main {
    public static void main(String[] args) {
      Task1();
      Task2();
      Task3();
      Task4();
      Task5();
      Task6();
      Task7();
      Task8();

    }





    public static void Task1()  {
        System.out.println("Задание2");
        int naruto = 1;
        System.out.println(naruto);
        byte apple = 24;
        System.out.println(apple);
        short branch = 31000;
        System.out.println(branch);
        long mouse = 584434334314L;
        System.out.println (mouse);
        double smallMouse = 85.5;
        System.out.println(smallMouse);
        float milk = 51.4f;
        System.out.println(milk);
        // задача 1
    }
    public static void Task2() {
        System.out.println("Задание2");
        float milk = 27.12f;
        System.out.println(milk);
        long children = 987678965549L;
        System.out.println(children);
        double y = 2.786;
        System.out.println(y);
        short x = 569;
        System.out.println(x);
        short z = -159;
        System.out.println(z);
        short w = 27897;
        System.out.println(w);
        byte l = 67;
        System.out.println(l);
        // Задача 2


    }
      static public void Task3() {
        System.out.println("Задача3");
        byte lydmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        System.out.println(lydmila);
        System.out.println(anna);
        System.out.println(ekaterina);
        short vsegoListow = 480;
        byte vseKlassi = 3;
        System.out.println(vsegoListow);
        System.out.println(vseKlassi);
        int kazdomyYcheniky = vsegoListow / vseKlassi;
        System.out.println("На каждого ученика расчитано "+ kazdomyYcheniky+ " листов бумаги");
          // задача 3

      }
      static public void Task4() {
        System.out.println("Задание4");
        byte bottle = 16;
        byte time = 2;
        System.out.println(bottle);
        System.out.println(time);
        int poizvoditelnost = bottle / time;
        System.out.println(poizvoditelnost);
        int za20Min = poizvoditelnost * 20;
        System.out.println(za20Min);
        int zaSutki = poizvoditelnost * 1440;
        System.out.println(zaSutki);
        int za3Dnya = zaSutki * 3;
        System.out.println(za3Dnya);
        int zaMecyac = zaSutki * 30;
        System.out.println(zaMecyac);
          // задача 4

      }
      static public void Task5() {
        System.out.println("Задача5");
        byte vsegoKrasok = 120;
        byte white = 2;
        byte brown = 4;
        System.out.println(vsegoKrasok);
        System.out.println(white);
        System.out.println(brown);
        byte naKlass = 6;
        System.out.println(naKlass);
        int vsegoKlassow = vsegoKrasok / naKlass;
        System.out.println(vsegoKlassow);
        int vsegoWhite = white * vsegoKlassow;
        System.out.println(vsegoWhite);
        int vsegoBrown = vsegoKrasok - vsegoWhite;
        System.out.println(vsegoBrown);
        // задача 5
    }
    static public void Task6()  {
        System.out.println("Задача6");
        byte banana = 5;
        byte grammBanana = 80;
        int vesBanana = banana * grammBanana;
        System.out.println(banana);
        System.out.println(grammBanana);
        System.out.println(vesBanana);
        short milk = 200;
        byte grammMilk = 105;
        int vesMilk = grammMilk * 2;
        System.out.println(milk);
        System.out.println(grammMilk);
        System.out.println(vesMilk);
        byte icePolmbir = 2;
        byte grammIcePlombir = 100;
        int vsegoIcePlombir = icePolmbir * grammIcePlombir;
        System.out.println(icePolmbir);
        System.out.println(grammIcePlombir);
        System.out.println(vsegoIcePlombir);
        byte eggs = 4;
        byte graamEggs = 70;
        int vesEggs = eggs * graamEggs;
        System.out.println(eggs);
        System.out.println(graamEggs);
        System.out.println(vesEggs);
        int vesKoktel = vesEggs + vesBanana + vesMilk + vsegoIcePlombir;
        System.out.println(vesKoktel);
        System.out.println("Завтрак спортсмена весит "+ vesKoktel+ " грамм" );
        float vesKg = vesKoktel / 1000f;
        System.out.println(vesKg);
        System.out.println("Завтрак спортсмена весит "+ vesKg+ "кг");
        // задание 6
    }
        public static void Task7() {
        System.out.println("Задание7");
        byte nadoSbrosit = 7;
        short poteryaVesa = 250;
        short poteryaVesa1 = 500;
        System.out.println(nadoSbrosit);
        System.out.println(poteryaVesa);
        System.out.println(poteryaVesa1);
        int perevodVGrammy = 1000 * nadoSbrosit;
        System.out.println(perevodVGrammy);
        int priPoteryaVesa250 = perevodVGrammy / poteryaVesa;
        System.out.println(priPoteryaVesa250);
        int priPoteryaVesa500 = perevodVGrammy / poteryaVesa1;
        System.out.println(priPoteryaVesa500);
        System.out.println("При потере веса 250грамм, спортсмен сбросит вес за "+ priPoteryaVesa250+ " дней");
        System.out.println("При потере веса 500грамм, спортсмен сбросит вес за "+ priPoteryaVesa500+ " дней");
        int srednee = (poteryaVesa + poteryaVesa1) / 2;
        System.out.println(srednee);
        int priSredney = perevodVGrammy / srednee;
        System.out.println(priSredney);
        System.out.println("При средней потере веса, спортсмен сбросит вес за "+ priSredney+ " дней");
            // задание 7

        }
        public static void Task8() {
        System.out.println("Задание8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        System.out.println(masha);
        System.out.println(denis);
        System.out.println(kristina);
        int x = (masha *10) / 100;
        System.out.println(x);
        int zpMasha = masha + x;
        System.out.println(zpMasha);
        int y = (denis * 10) / 100;
        System.out.println(y);
        int zpDenis = denis + y;
        System.out.println(zpDenis);
        int z = (kristina *10) / 100;
        System.out.println(z);
        int zpKristina = kristina + z;
        System.out.println(zpKristina);
        System.out.println("Увеличенная зп Маши= "+ masha+ " увеличенная зп Дениса= "+ denis+
                "увеличенная зп Кристины = "+ kristina);
        int mashaGod = masha * 12;
        int mashaGodYvelich = zpMasha * 12;
        System.out.println(mashaGod);
        System.out.println(mashaGodYvelich);
        int denisGod = denis * 12;
        int denisGodYvelich = zpDenis * 12;
        System.out.println(denisGod);
        System.out.println(denisGodYvelich);
        int kristinaGod = kristina * 12;
        int kristinaGodYvelich = zpKristina * 12;
        System.out.println(kristinaGod);
        System.out.println(kristinaGodYvelich);
        int raznicaMasha = mashaGodYvelich - mashaGod;
        System.out.println(raznicaMasha);
        int raznicaDenis = denisGodYvelich - denisGod;
        int raznicaKristina = kristinaGodYvelich - kristinaGod;
        System.out.println(raznicaDenis);
        System.out.println(raznicaKristina);
        System.out.println("Маша теперь получает= "+ mashaGodYvelich+ " Годовой доход " +
                "вырос на "+ raznicaMasha+ " рублей в год");
        System.out.println("Денис теперь получает= "+ denisGodYvelich+ " Годовой " +
                "доход вырос на "+ raznicaDenis+ "рублей в год");
        System.out.println("Кристина теперь получает= "+ kristinaGodYvelich+ " Годовой " +
                "доход вырос на "+ raznicaKristina+ "рублей в год");





        }
}