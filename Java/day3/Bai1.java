import java.util.*;

class WordSet{
    public Set<String> a;
    public WordSet(String s){
        String[] word = s.split("\\s+");
        Set<String>  u = new TreeSet<>();
        for(String x: word){
            u.add(x.toLowerCase());
        }
        this.a = u;
    }
    public WordSet union(WordSet other){
        Set<String> ret= new TreeSet<>();
        for(String u: this.a) ret.add(u);
        for(String u: other.a) ret.add(u);
        WordSet x= new WordSet("");
        x.a = ret;
        return x;
    }
    public WordSet intersection(WordSet other){
        Set<String> ret = new TreeSet<>();
        for(String u : this.a){
            if(other.a.contains(u)) ret.add(u);
        }
        WordSet x = new WordSet("");
        x.a = ret;
        return x;
    }
    public String toString(){
        StringBuilder ret = new StringBuilder();
        for(String tmp : this.a){
            ret.append(tmp + " ");
        }
        return ret.toString();
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}