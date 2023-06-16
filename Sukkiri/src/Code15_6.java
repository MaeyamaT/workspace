import java.util.Arrays;
public class Code15_6 {
	public static void main(String[] args) {
		String name="a123654k";
		if(isVaildPlayerName(name)){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
		String s="Java";
		if(s.matches("Java")){
			System.out.println("OK");
		}
		if(s.matches("JavaJava")){
			System.out.println("OK");
		}
		if(s.matches("java")){
			System.out.println("OK");
		}
		if(s.matches("J.va")){
			System.out.println("OK");
		}
		s="Jaaaava";
		if(s.matches("Ja*va")){
			System.out.println("OK");
		}
		s="あいうxx019";
		if(s.matches(".*")){
			System.out.println("OK");
		}
		if(s.matches("あい.*")){
			System.out.println("OK");
		}
		if(s.matches(".*9")){
			System.out.println("OK");
		}
		s="146-0092";
		if(s.matches("[0-9]{3}-?[0-9]{4}")){
			System.out.println("OK");
		}
		s="URI";
		if(s.matches("UR[LIN]")){
			System.out.println("OK");
		}
		if(s.matches("[A-Z]{3}")){
			System.out.println("OK");
		}
		if(s.matches("[A-Za-z0-9]{3}")){
			System.out.println("OK");
		}
		s="abc,def:ghi";
		String[] words=s.split("[,:]");
		System.out.println(Arrays.toString(words));
		String w=s.replaceAll("[beh]","X");//置換
		System.out.println(w);//aXc,dXf,gXi
		
	}
    public static boolean isVaildPlayerName(String name){
	    return name.matches("[A-Za-z][A-Za-z0-9]{7}");
    }
}