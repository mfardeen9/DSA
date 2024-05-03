 class constructor {
    int rno;
    String name;
    float marks;

    constructor(){
        this.rno = 12;
        this.name ="Fardeen";
        this.marks = 88.78f;
    }



     public static void main(String[] args) {
         constructor fardeen = new constructor();
         System.out.println(fardeen.rno);
     }
}
