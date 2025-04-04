class Objects {
    static class Animal {
        public static void dog() {
            System.out.println("Bow, Bow.....");
        }
    }

    class Animal1 {
        public void cat() {
            System.out.println("Meow, meow......");
        }
    }

    public static void main(String[] args) {
        Animal.dog();

        Objects obj = new Objects();
        Animal1 catObj = obj.new Animal1();
        catObj.cat();
    }
}
