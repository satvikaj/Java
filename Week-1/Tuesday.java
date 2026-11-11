class Tuesday {
    public static void main(String[] args) {
        //primitive datatypes & details
        byte age=22;
        short year=2026;
        long ph=7823569866L;
        int income=1884672;
        float percentage=98.2f;
        double gpa=9.38;
        char grade='a';
        boolean isstudent=true;
        String name="Satvika";
        String College="SVECW";
        System.out.println("age:"+age+"\n"+year+"\n"+ph+"\n"+income+"\n"+percentage+"\n"+gpa+"\n"+grade+"\n"+isstudent+"\n"+name+"\n"+College);
        // sum of two numbers
        int a=10;
        int b=50;
        int sum=a+b;
        System.out.println("sum:"+sum);
        //avg of subjects
        int maths=98;
        float eng=94.5f;
        int cn=99;
        int uhv=95;
        float ai=93.75f;
        float total=maths+eng+cn+uhv+ai;
        float avg=total/5;
        System.out.println("Average:"+avg);
        //Convert Celsius to Fahrenheit.
        float c=37.5f;
        float f=(c*9/5)+32;
        System.out.println("fahrenheit:"+f);
        //Calculate simple interest.
        int p=10000;
        int t=3;
        int r=2;
        float Si=(p*t*r)/100;
        System.out.println("simple intrest:"+Si);
        //Swap two numbers using a third variable
        int x=50;
        int y=80;
        int temp=x;
        x=y;
        y=temp;
        System.out.println("x="+x+" y="+y);
        //Swap two numbers without using a third variable
        int m=80;
        int v=50;
        m=m+v;
        v=m-v;
        m=m-v;
        System.out.println("m="+m+" v="+v);
        // Challenge: Student Marksheet
        float studentPercentage = (total / 500) * 100;

        System.out.println("STUDENT MARKSHEET::");
        System.out.println("Name: " + name);
        System.out.println("College: " + College);
        System.out.println("Age: " + age);

        System.out.println("Maths: " + maths);
        System.out.println("English: " + eng);
        System.out.println("CN: " + cn);
        System.out.println("UHV: " + uhv);
        System.out.println("AI: " + ai);

        System.out.println("Total: " + total + "/500");
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + studentPercentage + "%");
        
        
    }
}
