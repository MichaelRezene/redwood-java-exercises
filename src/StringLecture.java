public class StringLecture {

    public static void main(String[] args) {
        String name = "Micky";
        name = name.trim();
        if (name.equalsIgnoreCase( "Micky")){
            System.out.println("They are the same");
        } else{
            System.out.println("They are not the same");

        }
        //Start with
        char latter = 'T';
        if(name.startsWith(String.valueOf(latter))){
            System.out.println("Starts with M");

        }else{
            System.out.println("Doesn't start with M");

        }

        // lastTwo
        String lastTwo = "ky";
        if ("Micky".endsWith(lastTwo)){
            System.out.println("ends with " + lastTwo);

        }
        // indexOf
        int index = name.indexOf("n");
        System.out.println(" index of n is " + index);

        // charAt
        System.out.println(name.charAt(2));
        System.out.println(name);

        // Looks for how many 'c' they are  in the string
        int counter = 0;
       for (int i = 0; i <= name.length(); i++){
          if(name.charAt(i) == 'c'){
             counter++;
           }
       }
        System.out.println("counter : " + counter);

        // replace
       String newName = name.replace(  'c', 'C');
        System.out.println(newName);

        // substring and lower and upper case
        String nickName = name.substring(0, 3);//name.length()-1
        System.out.println(nickName.toLowerCase());//.toUpperCase()  .toLowerCase()
    }
}
