public class Main {
    public static int luasPersegi(int s){
        return s * s;
    }
    public static int kelilingPersegi(int s){
        return 4 * s;
    }
    public static int luasSegitiga(int a, int t){
        return (a * t) / 2;
    }
    public static int kelilingSegitiga(int a, int b, int c){
        return a + b + c;
    }
    public static int luasLingkaran(int r){
        return (int) (Math.PI * r * r);
    }
    public static int kelilingLingkaran(int r){
        return (int) (2 * Math.PI * r);
    }
    public static int volumeKubus(int s){
        return s * s * s;
    }
    public static int kelilingKubus(int s){
        return 12 * s;
    }
    public static int luasKubus(int s){
        return 6 * s * s;
    }
    public static void main(String[] args) {
        System.out.println("Luas Persegi : " + luasPersegi(5));
        System.out.println("Kelilinng Persegi : " + kelilingPersegi(5));
        System.out.println("Luas Segitiga : " +  luasSegitiga(5, 10));
        System.out.println("Keliling Segitiga : " + kelilingSegitiga(5, 10, 15));
        System.out.println("Luas Lingkaran : " + luasLingkaran(5));
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran(5)); 
        System.out.println("Volumme Kubus : " + volumeKubus(5));
        System.out.println("Keliling Kubus : " + kelilingKubus(5));
        System.out.println("Luas Kubus : " + luasKubus(5));
        
    }
}