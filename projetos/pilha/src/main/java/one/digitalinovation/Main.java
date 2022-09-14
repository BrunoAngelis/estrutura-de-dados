package one.digitalinovation;

public class Main {
    public static void main(String[] args) {

        Pilha minhapilha = new Pilha();

        minhapilha.push(new No(1));
        minhapilha.push(new No(2));
        minhapilha.push(new No(3));
        minhapilha.push(new No(4));
        minhapilha.push(new No(5));
        minhapilha.push(new No(6));

        minhapilha.top();

        System.out.println(minhapilha);

        minhapilha.pop();

        System.out.println(minhapilha);

        minhapilha.pop();

        System.out.println(minhapilha);

        
    }
}
