

package polymorphism;


public class Main {

    public static void main(String[] args) {
        food younha[] = new food[3];
        for(int i=0; i<3;i++){
            younha[i] = new potpie();       //younha in food can generate the potpie
            younha[i].eat();
        }
    }

}
