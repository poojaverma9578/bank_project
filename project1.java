import java.util.Scanner;
class project1
{
    Scanner sc=new Scanner(System.in);
    private int i,j,p,z=0,n,x=0,ch1=0,am=0,x1=0,x2=10000,lch=0,lch1=0,fdch=0,date1=0,date=0,date2=0;
    private char c;
    private long stac,send=0,d=0,lacc=0;;
    private double amt=0.0d,lamt=0.0d;
    private String a="",a1="",y="",sa="",con="",co="",rch="";
    private long account;
    private String name[]=new String[10000];
    private String name1[]=new String[10000];
    private String ans[]=new String[10000];
    private String ans1[]=new String[10000];
    private int potp[]=new int[10000];
    private long acc[]=new long[10000];
    private double balance[]=new double[10000];
    private long phone[]=new long[10000];
    private String str[]=new String[10000];
    private String s[]=new String[10000];
    private int l[]=new int[10000];
    private int ch[]=new int[10000];
    private String st[][]=new String[50][500];
    private double loan[]=new double[10000];
    private double interest[]=new double[10000];
    private double install[]=new double[10000];
    private double repay[]=new double[10000];
    private String reason[]=new String[10000];
    private double fdamt[]=new double[10000];
    private double fdinterest[]=new double[10000];
    private int fdterm[]=new int[10000];
    public void noc()
    {
        System.out.println("Enter The Number Of Customers");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Customer Account Number");
            acc[i]=sc.nextLong();
            System.out.println("Enter Customer Account Balance");
            balance[i]=sc.nextDouble();
            System.out.println("Enter Customer 10-digit Phone Number");
            phone[i]=sc.nextLong();
            System.out.println("Enter Customer Name");
            {
                name[i]=sc.next();
                name1[i]=sc.next();
                name[i]=name[i]+"  " +name1[i];
            }
        }
    }
    public void security()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Answer Any TWO Security Question");
        System.out.println("*********************************************************************************************");
        System.out.println("You have to answer 1 question of your chice and 1 random question");
        System.out.println("Enter Your Choice From 1 To 8");
        System.out.println("1.  What Was Your Childhood Nickname?");
        System.out.println("2.  What Was Your First Occupation?");
        System.out.println("3.  What Was The Name Of Your First School?");
        System.out.println("4.  What Is The Country Of Your Ultimate Dream Vacation?");
        System.out.println("5.  What Was Your Dream Job As A Child?");
        System.out.println("6.  What Was The Street Name In Which Your Childhood Spent?");
        System.out.println("7.  Who Was Your Childhood Hero?");
        System.out.println("8.  What Is The Name Of Your First Hall Movie?");
        System.out.println("Enter Your Answer!");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter The Choice For Customer Number:"+(i+1));
            ch[i]=sc.nextInt();
            if(ch[i]>=1&&ch[i]<=8)
            {
                switch(ch[i])
                {
                    case 1:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Was Your First Pet Name?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 2:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your Hometown?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 3:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Time Of The Day Were You Born : Morning, Afternoon, Evening, Night, Midnight ?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 4:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is Your Favourite Country?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 5:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your First Friend?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 6:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your Favourite Singer?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 7:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Youe Favourite Actor?");
                        ans1[i]=sc.next();
                    }
                    break;
                    case 8:{
                        ans[i]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Youe Favourite Movie?");
                        ans1[i]=sc.next();
                    }
                    break;
                    default:System.out.println("Please Enter A Valid Choice!");
                    break;
                }
            }
            else
            System.out.println("Please Enter A Valid Choice!");
        }
    }
    public int login(int r)
    {
        System.out.println("WELCOME TO OUR SERVICES!");
        System.out.println("PLEASURE TO HELP YOU!");
        System.out.println("Enter The Following Details To Get Access To Your Account");
        System.out.println("Enter Bank Account Number");
        account=sc.nextLong();
        for(i=0;i<n;i++)
        {
            if(account==acc[i])
            {
                x=i;
                System.out.println("Welcome "+name[x]);
                System.out.println("Please Answer Some Security Questions For Your Better Privacy");
                System.out.println("Select From The List Of Questions Given Below:-");
                System.out.println("1.  What Was Your Childhood Nickname?");
                System.out.println("2.  What Was Your First Occupation?");
                System.out.println("3.  What Was The Name Of Your First School?");
                System.out.println("4.  What Is The Country Of Your Ultimate Dream Vacation?");
                System.out.println("5.  What Was Your Dream Job As A Child?");
                System.out.println("6.  What Was The Street Name In Which Your Childhood Spent?");
                System.out.println("7.  Who Was Your Childhood Hero?");
                System.out.println("8.  What Is The Name Of Your First Hall Movie?");
                System.out.println("Enter Your Answer!");
                ch1=sc.nextInt();
                if(ch1==ch[x])
                {
                    a=sc.next();
                    if(a.equalsIgnoreCase(ans[x]))
                    {
                        System.out.println("Enter The Answer Of Your RANDOM Question");
                        a1=sc.next();
                        if(a1.equalsIgnoreCase(ans1[x]))
                        {
                            System.out.println("Enter Your OTP");
                            potp[x]=sc.nextInt();
                            str[x]=Long.toString(phone[x]);
                            s[x]="";
                            for(j=7;j<10;j++)
                            {
                                c=str[x].charAt(j);
                                s[x]=s[x]+c;
                            }
                            c=' ';
                            l[x]=Integer.parseInt(s[x]);
                            if(potp[x]==l[x])
                            {
                                System.out.println("Welcome to Our Services!");
                                r=1;
                            }
                            else
                            {
                                System.out.println("Sorry! Wrong OTP Entered!");
                                r=0;
                            }
                        }
                        else
                        {
                            System.out.println("Sorry! Wrong Answer!");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Sorry Wrong Answer");
                        break;
                    }
                }
                else
                {
                    System.out.println("Sorry Wrong Choice Entered");
                    break;
                }
            }
            else
            {
                System.out.println("SORRY! NO BANK ACCOUNT FOUND!");
            }
        }
        return r;
    }
    public void naccount()
    {
        System.out.println("Do You Want To Open A New Account");
        y=sc.next();
        if(y.equalsIgnoreCase("yes"))
        {
            n=n+1;
            System.out.println("OK! Pleasure To Help You!");
            System.out.println("Please Enter The Name");
            {
                name[n-1]=sc.next();
                name1[n-1]=sc.next();
                name[n-1]=name[n-1]+name1[n-1];
            }
            System.out.println("Please Enter 10-digit Bank Account Number Of Your Choice");
            acc[n-1]=sc.nextLong();
            System.out.println("Please Enter Bank Account Opening Balance"+"\n"+"Our Bank Gives 0 Balance Facility");
            balance[n-1]=sc.nextInt();
            System.out.println("Please Enter Your Phone Number");
            phone[n-1]=sc.nextLong(); 
            sa=Long.toString(acc[n-1]);
            System.out.println("Answer Any TWO Security Question");
            System.out.println("*********************************************************************************************");
            System.out.println("You have to answer 1 question of your chice and 1 random question");
            System.out.println("Enter Your Choice From 1 To 8");
            System.out.println("1.  What Was Your Childhood Nickname?");
            System.out.println("2.  What Was Your First Occupation?");
            System.out.println("3.  What Was The Name Of Your First School?");
            System.out.println("4.  What Is The Country Of Your Ultimate Dream Vacation?");
            System.out.println("5.  What Was Your Dream Job As A Child?");
            System.out.println("6.  What Was The Street Name In Which Your Childhood Spent?");
            System.out.println("7.  Who Was Your Childhood Hero?");
            System.out.println("8.  What Is The Name Of Your First Hall Movie?");
            System.out.println("Enter Your Answer!");
            System.out.println("Enter The Choice For Customer Number:"+(n-1));
            ch[n-1]=sc.nextInt();
            if(ch[n-1]>=1&&ch[n-1]<=8)
            {
                switch(ch[n-1])
                {
                    case 1:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Was Your First Pet Name?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 2:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your Hometown?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 3:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Time Of The Day Were You Born : Morning, Afternoon, Evening, Night, Midnight ?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 4:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is Your Favourite Country?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 5:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your First Friend?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 6:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Your Favourite Singer?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 7:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Youe Favourite Actor?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    case 8:{
                        ans[n-1]=sc.next();
                        System.out.println("Enter Another RANDOM Question!");
                        System.out.println("What Is The Name Of Youe Favourite Movie?");
                        ans1[n-1]=sc.next();
                    }
                    break;
                    default:System.out.println("Please Enter A Valid Choice!");
                    break;
                }
            }
            else
            System.out.println("Please Enter A Valid Choice!");
            if(sa.length()==10)
            {
                System.out.println("Good Choice!");
                System.out.println("Congratulations! You Have Opened Your Bank Account Successfully");
                System.out.println("Now This Is Your Fixed Account Number!"+"\n"+"Please remember it");
            }
            else
            {
                System.out.println("Sorry Not A TEN(10) Digit Number");
                n=n-1;
            }
        }
        else
        {
            System.out.println("OK!");
        }
    }
    public void deposit()
    {
        System.out.println("Confirm Money Deposit : YES OR NO");
        con=sc.next();
        date2=date;
        switch(con)
        {
            case "YES":{
                System.out.println("OK! ENTER THE AMOUNT TO BE DEPOSITED");
                am=sc.nextInt();
                balance[x]=balance[x]+am;
                System.out.println("THANK YOU FOR USING OUR SERVICES!");
                System.out.println("AMOUNT SUCCESSFULLY DEPOSITED");
                System.out.println("YOUR NEW BALANCE : "+balance[x]);
                st[x][z]=Integer.toString(date2)+"      "+(Integer.toString(am))+"      C";
                z++;
            }
            break;
            case "NO":{
                System.out.println("OK! NO PROBLEM");
            }
            break;
            default:System.out.println("WRONG CHOICE"+"\n"+"PLEASE TRY AGAIN");
            break;
        }
    }
    public void withdraw()
    {
        System.out.println("Confirm Money WITHDRAW : YES OR NO");
        con=sc.next();
        date2=date;
        switch(con)
        {
            case "YES":{
                System.out.println("OK! ENTER THE AMOUNT TO BE WITHDRAWN");
                am=sc.nextInt();
                if(balance[x]>=am)
                {
                    balance[x]=balance[x]-am;
                    System.out.println("THANK YOU FOR USING OUR SERVICES!");
                    System.out.println("AMOUNT SUCCESSFULLY WITHDRAWN");
                    System.out.println("YOUR NEW BALANCE : "+balance[x]);
                    st[x][z]=Integer.toString(date2)+"      "+(Integer.toString(am))+"      D";
                    z++;
                }
                else
                {
                    System.out.println("INSUFFICIENT BALANCE");
                    break;
                }
            }
            break;
            case "NO":{
                System.out.println("OK! NO PROBLEM");
            }
            break;
            default:System.out.println("WRONG CHOICE"+"\n"+"PLEASE TRY AGAIN");
            break;
        }
    }
    public void statement()
    {
        System.out.println(name[x]+"  YOUR LAST TRANSACTION DETAILS ARE AS FOLLOWS");
        for(i=0;i<z;i++)
        {
            System.out.println(st[x][i]);
        }
    }
    public void bcheck()
    {
        System.out.println(name[x]+" YOUR BALANCE IS "+balance[x]);
    }
    public void moneyt()
    {
        System.out.println("                    WELCOME TO OUR MONEY TRANSFER SECTION!               ");
        System.out.println("                    PLEASURE TO HELP YOU            ");
        System.out.println("Please Enter The Amount To Be Transfered");
        amt=sc.nextDouble();
        date2=date;
        if(balance[x]>=(amt+(0.04*amt)))
        {
            System.out.println("Please Enter The Bank Account Number Of The Person To Send The Money");
            send=sc.nextLong();
            for(i=0;i<n;i++)
            {
                if(acc[i]==send)
                {
                    x1=i;
                }
            }
            if((x1+1)>=1)
            {
               System.out.println("          DETAILS OF THE PERSON ARE AS FOLLOWS     "+"\n"+"                    PLEASE REVIEW THEM  ");
               System.out.println("                    NAME : "+name[x1]+"      ");
               System.out.println("                    PHONE : "+phone[x1]+"        ");
               System.out.println("                    ACCOUNT NUMBER : "+acc[x1]);
               System.out.println("          A FEES OF 4% WILL BE CHARGED FOR THIS TASK     ");
               System.out.println("                CONFIRM MONEY TRANSFER : YES OR NO          ");
               co=sc.next();
               if(co.equalsIgnoreCase("YES"))
               {
                   balance[x]=balance[x]-(amt+(0.04*amt));
                   balance[x1]=balance[x1]+amt;
                   System.out.println("                    THANK YOU YOUR MONEY IS SUCCESSFULLY TRANSFERED TO  "+acc[x1]);
                   st[x][z]=Integer.toString(date2)+"      "+(Double.toString(amt+(0.04*amt)))+"       D";
                   z++;
                }
               else
               System.out.println("OK! NO PROBLEM!");
            }
            else
            {
                System.out.println("Sorry No Account Found");
            }
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    public void state()
    {
        System.out.println("Enter Account Number");
        stac=sc.nextLong();
        for(i=0;i<n;i++)
        {
            if(stac==acc[i])
            {
                p=i;
                break;
            }
        }
        System.out.println(name[p]+" YOUR TRANSACTION HISTORY IS AS FOLLOWS :-");
        for(i=0;i<z;i++)
        {
            System.out.println(st[p][i]);
        }
    }
    public void search()
    {
        System.out.println("                    Welcome to Our Search Module");
        System.out.println("           Enter Bank Account Number To Display The Details");
        d=sc.nextLong();
        for(i=0;i<n;i++)
        {
            if(d==acc[i])
            {
                x2=i;
                break;
            }
        }
        if(x2>=0&&x2<n)
        {
            System.out.println("                ACCOUNT FOUND!THE DETAILS ARE AS FOLLOWS        ");
            System.out.println("            NAME : "+name[x2]);
            System.out.println("            BALANCE : "+balance[x2]);
            System.out.println("            PHONE : "+"XXXXXXX"+(phone[x2]%1000));
            System.out.println("            LOAN : "+loan[x2]);
            System.out.println("            INTEREST : "+interest[x2]);
            System.out.println("            REASON FOR LOAN ( IF ANY ) : "+reason[x2]);
            System.out.println("            FIXED DEPOSIT AMOUNT : "+fdamt[x2]);
            System.out.println("            FIXED DEPOSIT TERM : "+fdterm[x2]);
            x2=10000;
        }
        else
        System.out.println("            NO BANK ACCOUNT WITH THIS ACC. NO.      ");
    }
    public void loan()
    {
        System.out.println("            WELCOME TO OUR LOAN MODULE      ");
        System.out.println("             ALWAYS HERE TO HELP YOU     ");
        System.out.println("                   WELCOME "+name[x]);
        System.out.println("        PLEASE ENTER THE REASON FOR LOAN EXECUTION  ");
        reason[x]=sc.next();
        System.out.println("      PLEASE ENTER THE AMOUNT OF LOAN TO BE EXECUTED");
        System.out.println("WE WILL CHECK IF THERE IS ELIGIBILITY FOR YOU TO TAKE LOAN  ");
        System.out.println(x);
        lamt=sc.nextDouble();
        date2=date;
        if(lamt<=(3*balance[x]))
        {
            System.out.println("        CONGRATULATIONS!    You Are Eligible For LOAN       ");
            System.out.println("            PLEASE SELECT THE TERM FOR LOAN REPAY     ");
            System.out.println("                    1.  1 INSTALLMENT            ");
            System.out.println("                    2.  2 INSTALLMENT            ");
            System.out.println("                    3.  5 INSTALLMENT            ");
            System.out.println("                    4.  10 INSTALLMENT           ");
            lch=sc.nextInt();
            switch(lch)
            {
                case 1:{
                    System.out.println("                  OK!                  ");
                    System.out.println("YOUR INTEREST RATE FOR LOAN REPAY WILL BE 5% FOR EACH INSTALLMENT");
                    System.out.println("    IF YOU AGREE PRESS 1 OTHERWISE 2");
                    lch1=sc.nextInt();
                    switch(lch1)
                    {
                        case 1:{
                            System.out.println("                              OK! YOUR LOAN IS SUCCESFULLY ACCESSED");
                            System.out.println("                 NOTE : The Time You Repay The Loan 5% Interest Will Be Charged On It");
                            loan[x]=lamt;
                            interest[x]=0.05*loan[x];
                            install[x]=1;
                            balance[x]=balance[x]+lamt;
                            st[x][z]=Integer.toString(date2)+"      "+(Double.toString(loan[x]))+"      C";
                            z++;
                            System.out.println("                            THANK YOU FOR APPLYING THE LOAN");
                        }
                        break;
                        case 2:{
                            System.out.println("        OK! NO PROBLEM!");
                        }
                        break;
                        default:System.out.println("        WRONG CHOICE ENTERED");
                        break;
                    }
                }
                break;
                case 2:{
                    System.out.println("                  OK!                  ");
                    System.out.println("YOUR INTEREST RATE FOR LOAN REPAY WILL BE 10% FOR EACH INSTALLMENT");
                    System.out.println("    IF YOU AGREE PRESS 1 OTHERWISE 2");
                    lch1=sc.nextInt();
                    switch(lch1)
                    {
                        case 1:{
                            System.out.println("                              OK! YOUR LOAN IS SUCCESFULLY ACCESSED");
                            System.out.println("                 NOTE : Every Time You Repay The Loan 10% Interest Will Be Charged On It");
                            loan[x]=lamt;
                            interest[x]=0.1*lamt;
                            install[x]=2;
                            balance[x]=balance[x]+lamt;
                            st[x][z]=Integer.toString(date2)+"      "+(Double.toString(loan[x]))+"      C";
                            z++;
                            System.out.println("                            THANK YOU FOR APPLYING THE LOAN");
                        }
                        break;
                        case 2:{
                           System.out.println("        OK! NO PROBLEM!");
                        }
                        break;
                        default:System.out.println("        WRONG CHOICE ENTERED");
                        break;
                    }
                }
                break;
                case 3:{
                    System.out.println("                  OK!                  ");
                    System.out.println("YOUR INTEREST RATE FOR LOAN REPAY WILL BE 15% FOR EACH INSTALLEMT");
                    System.out.println("    IF YOU AGREE PRESS 1 OTHERWISE 2");
                    lch1=sc.nextInt();
                    switch(lch1)
                    {
                       case 1:{
                            System.out.println("                              OK! YOUR LOAN IS SUCCESFULLY ACCESSED");
                            System.out.println("                 NOTE : Every Time You Repay The Loan 15% Interest Will Be Charged On It");
                            loan[x]=lamt;
                            interest[x]=0.15*lamt;
                            install[x]=5;
                            balance[x]=balance[x]+lamt;
                            st[x][z]=Integer.toString(date2)+"      "+(Double.toString(loan[x]))+"      C";
                            z++;
                            System.out.println("                            THANK YOU FOR APPLYING THE LOAN");
                       }
                       break;
                       case 2:{
                            System.out.println("        OK! NO PROBLEM!");
                       }
                       break;
                       default:System.out.println("        WRONG CHOICE ENTERED");
                       break;
                    }
                }
                break;
                case 4:{
                    System.out.println("                  OK!                  ");
                    System.out.println("YOUR INTEREST RATE FOR LOAN REPAY WILL BE 20 FOR EACH INSTALLMENT%");
                    System.out.println("    IF YOU AGREE PRESS 1 OTHERWISE 2");
                    lch1=sc.nextInt();
                    switch(lch1)
                    {
                        case 1:{
                            System.out.println("                              OK! YOUR LOAN IS SUCCESFULLY ACCESSED");
                            System.out.println("                 NOTE : Every Time You Repay The Loan 20% Interest Will Be Charged On It");
                            loan[x]=lamt;
                            interest[x]=0.2*lamt;
                            install[x]=10;
                            balance[x]=balance[x]+lamt;
                            st[x][z]=Integer.toString(date2)+"      "+(Double.toString(loan[x]))+"      C";
                            z++;
                            System.out.println("                            THANK YOU FOR APPLYING THE LOAN");
                        }
                        break;
                        case 2:{
                           System.out.println("        OK! NO PROBLEM!");
                        }
                        break;
                        default:System.out.println("        WRONG CHOICE ENTERED");
                        break;
                    }
                }
                break;
                default:System.out.println("        Sorry! No Such Loan Type  ");
                break;
            }
        }
        else
        System.out.println("        Sorry! You Are Not Eligible For A Loan");
    }
    public void lrepay()
    {
        System.out.println("            WELCOME TO OUR LOAN PAYMENT MODULE      ");
        System.out.println("              ALWAYS HERE TO HELP YOU     ");
        date2=date;
        if(install[x]>0&&loan[x]>0)
        {
            repay[x]=(loan[x]/install[x])+interest[x];
            System.out.println("            WELCOME "+name[x]);
            System.out.println("      YOUR LOAN AMOUNT TO BE REPAYED IS "+repay[x]);
            System.out.println("     TO PAY NOW ENTER PAY ELSE ENTER LATER  "+"\n"+"    NOTE: AN AMOUNT EQUAL TO THE INSTALLMENT WILL BE DEDUCTED FROM YOUR ACCOUNT BALANCE( INCLUDING ALL INTERESTS )");
            rch=sc.next();
            switch(rch)
            {
                case "PAY":{
                    System.out.println("            OK!");
                    balance[x]=balance[x]-repay[x];
                    install[x]=install[x]-1;
                    loan[x]=loan[x]-(repay[x]-interest[x]);
                    st[x][z]=Integer.toString(date2)+"      "+(Double.toString(repay[x]))+"     D";
                    z++;
                    System.out.println("     THANK YOU! YOUR LOAN INSTALLMENT IS SUCCESSFULLY REPAYED   ");
                    System.out.println(name[x]+" YOUR NEW ACCOUNT BALANCE IS "+balance[x]);
                    repay[x]=0;
                    if(loan[x]==0.0)
                    interest[x]=0.0;
                }
                break;
                case "LATER":{
                    System.out.println("            OK! NO PROBLEM!      ");
                }
                break;
                default:System.out.println("            WRONG COICE ENTERED"+"\n"+" PLEASE TRY AGAIN LATER");
                break;
            }
        }
        else
        {
            System.out.println("            You Have No Installments Left");
            interest[x]=0;
            reason[x]=" NO LOAN LEFT ";
        }
    }
    public void fd()
    {
        System.out.println("            WELCOME"+name[x]+" TO OUR FIXED DEPOSIT MODULE     ");
        System.out.println("            Please Enter The Amount To Be Fixed Deposited   ");
        fdamt[x]=sc.nextDouble();
        System.out.println("                Please Enter The Term For Fixed Deposit     ");
        System.out.println("                        5 YEAR (minimum)                ");
        System.out.println("                        10 YEAR                         ");
        System.out.println("                        15 YEAR                         ");
        System.out.println("                        18 YEAR (maximum)               ");
        fdterm[x]=sc.nextInt();
        date2=date;
        switch(fdterm[x])
        {
            case 5:{
                System.out.println("              THE INTEREST FOR THE TERM YOU SELECTED IS 5% P.A.     ");
                System.out.println("                IF YOU AGREE ENTER 1 TO PAY OTHERWISE ENTER 2       ");
                fdch=sc.nextInt();
                fdinterest[x]=5;
                switch(fdch)
                {
                    case 1:{
                        System.out.println("            OK! THANK YOU FOR USING OUR SERVICES        ");
                        System.out.println("      YOUR FIXED DEPOSIT ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                        System.out.println("THE AMOUNT HAS BEEN SUCCESSFULLY DEBITED FROM YOUR SAVINGS ACCOUNT");
                        balance[x]=balance[x]-fdamt[x];
                        st[x][z]=Integer.toString(date2)+"      "+(Double.toString(fdamt[x]))+"     D";
                        z++;
                        date1=date;
                    }
                    break;
                    case 2:{
                        System.out.println("            OK! NO PROBLEM!     ");
                    }
                    break;
                    default:System.out.println("WRONG CHOICE ENTERED!");
                    break;
                }
            }
            break;
            case 10:{
                System.out.println("              THE INTEREST FOR THE TERM YOU SELECTED IS 7.5% P.A.     ");
                System.out.println("                IF YOU AGREE ENTER 1 TO PAY OTHERWISE ENTER 2       ");
                fdch=sc.nextInt();
                fdinterest[x]=7.5;
                switch(fdch)
                {
                    case 1:{
                        System.out.println("            OK! THANK YOU FOR USING OUR SERVICES        ");
                        System.out.println("      YOUR FIXED DEPOSIT ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                        System.out.println("THE AMOUNT HAS BEEN SUCCESSFULLY DEBITED FROM YOUR SAVINGS ACCOUNT");
                        balance[x]=balance[x]-fdamt[x];
                        st[x][z]=Integer.toString(date2)+"      "+(Double.toString(fdamt[x]))+"     D";
                        z++;
                        date1=date;
                    }
                    break;
                    case 2:{
                        System.out.println("            OK! NO PROBLEM!     ");
                    }
                    break;
                    default:System.out.println("WRONG CHOICE ENTERED!");
                    break;
                }
            }
            break;
            case 15:{
                System.out.println("              THE INTEREST FOR THE TERM YOU SELECTED IS 8% P.A.     ");
                System.out.println("                IF YOU AGREE ENTER 1 TO PAY OTHERWISE ENTER 2       ");
                fdch=sc.nextInt();
                fdinterest[x]=8;
                switch(fdch)
                {
                    case 1:{
                        System.out.println("            OK! THANK YOU FOR USING OUR SERVICES        ");
                        System.out.println("      YOUR FIXED DEPOSIT ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                        System.out.println("THE AMOUNT HAS BEEN SUCCESSFULLY DEBITED FROM YOUR SAVINGS ACCOUNT");
                        balance[x]=balance[x]-fdamt[x];
                        st[x][z]=Integer.toString(date2)+"      "+(Double.toString(fdamt[x]))+"     D";
                        z++;
                        date1=date;
                    }
                    break;
                    case 2:{
                        System.out.println("            OK! NO PROBLEM!     ");
                    }
                    break;
                    default:System.out.println("WRONG CHOICE ENTERED!");
                    break;
                }
            }
            break;
            case 18:{
                System.out.println("              THE INTEREST FOR THE TERM YOU SELECTED IS 9% P.A.     ");
                System.out.println("                IF YOU AGREE ENTER 1 TO PAY OTHERWISE ENTER 2       ");
                fdch=sc.nextInt();
                fdinterest[x]=9;
                switch(fdch)
                {
                    case 1:{
                        System.out.println("            OK! THANK YOU FOR USING OUR SERVICES        ");
                        System.out.println("      YOUR FIXED DEPOSIT ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                        System.out.println("THE AMOUNT HAS BEEN SUCCESSFULLY DEBITED FROM YOUR SAVINGS ACCOUNT");
                        balance[x]=balance[x]-fdamt[x];
                        st[x][z]=Integer.toString(date2)+"      "+(Double.toString(fdamt[x]))+"     D";
                        z++;
                        date1=date;
                    }
                    break;
                    case 2:{
                        System.out.println("            OK! NO PROBLEM!     ");
                    }
                    break;
                    default:System.out.println("WRONG CHOICE ENTERED!");
                    break;
                }
            }
            break;
            default:System.out.println("WRONG CHOICE ENTERED!");
            break;
        }
    }
    public void fdpay()
    {
        double v=0.0d;
        date2=date;
        if(fdamt[x]>0)
        {
            if(date>=(date1+5))
            {
                v=fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*5);
                balance[x]=balance[x]+fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*5);
                fdamt[x]=0;
                fdinterest[x]=0;
                st[x][z]=Integer.toString(date2)+"      "+(Double.toString(v))+"        C";
                z++;
                System.out.println("FIXED DEPOSIT (INCLUDING INTEREST) SUCCESSFULLY DEPOSITED IN YOUR ACCOUNT "+acc[x]);
                System.out.println("YOUR NEW ACCOUNT BALANCE IS "+balance[x]);
            }
            else
            if(date>=(date1+10))
            {
                v=fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*10);
                balance[x]=balance[x]+fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*10);
                fdamt[x]=0;
                fdinterest[x]=0;
                st[x][z]=Integer.toString(date2)+"      "+(Double.toString(v))+"        C";
                z++;
                System.out.println("FIXED DEPOSIT (INCLUDING INTEREST) SUCCESSFULLY DEPOSITED IN YOUR ACCOUNT "+acc[x]);
                System.out.println("YOUR NEW ACCOUNT BALANCE IS "+balance[x]);
            }
            else
            if(date>=(date1+15))
            {
                v=fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*15);
                balance[x]=balance[x]+fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*15);
                fdamt[x]=0;
                fdinterest[x]=0;
                st[x][z]=Integer.toString(date2)+"      "+(Double.toString(v))+"        C";
                z++;
                System.out.println("FIXED DEPOSIT (INCLUDING INTEREST) SUCCESSFULLY DEPOSITED IN YOUR ACCOUNT "+acc[x]);
                System.out.println("YOUR NEW ACCOUNT BALANCE IS "+balance[x]);
            }
            else
            if(date>=(date1+18))
            {
                v=fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*18);
                balance[x]=balance[x]+fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*18);
                fdamt[x]=0;
                fdinterest[x]=0;
                st[x][z]=Integer.toString(date2)+"      "+(Double.toString(v))+"        C";
                z++;
                System.out.println("FIXED DEPOSIT (INCLUDING INTEREST) SUCCESSFULLY DEPOSITED IN YOUR ACCOUNT "+acc[x]);
                System.out.println("YOUR NEW ACCOUNT BALANCE IS "+balance[x]);
            }
            else
            {
                System.out.println("SORRY! YOU HAVE NOT REACHED THE FD LIMIT");
            }
        }
        else
        System.out.println("Sorry! You Have No FD Associated With Your Account Number "+acc[x]);
    }
    public void date()
    {
        System.out.println("            Enter DATE In The Format DDMMYYYY");
        date=sc.nextInt();
    }
    public void fdbreak()
    {
        System.out.println("        WELCOME TO OUR FD BREAK MODULE");
        System.out.println("         YOUR FD AMOUNT IS "+fdamt[x]);
        date2=date;
        if(fdamt[x]>0)
        {
            System.out.println("    IF YOU WANT TO BREAK YOUR FD AND GAIN THE CALCULATED AMOUNT OF INTEREST ENTER 1 OTHERWISE 2");
            fdch=sc.nextInt();
            double v=0.0d;
            switch(fdch)
            {
                case 1:{
                    v=fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*((date-date1)%10000));
                    balance[x]=balance[x]+fdamt[x]+(((fdinterest[x]/100)*fdamt[x])*((date-date1)%10000));
                    System.out.println("THANK YOU! YOUR CALCULATED FIXED DEPOSIT HAS BEEN SUCCESSFULLY CREDITED IN YOUR ACCOUNT "+acc[x]);
                    System.out.println("YOUR NEW BALANCE IS "+balance[x]);
                    System.out.println((date-date1)%10000);
                    fdamt[x]=0;
                    fdinterest[x]=0;
                    st[x][z]=Integer.toString(date2)+"      "+(Double.toString(v))+"        C";
                    z++;
                }
                break;
                case 2:{
                    System.out.println("OK! NO PROBLEM!");
                }
                break;
                default:System.out.println("WRONG CHOICE ENTERED!");
                break;
            }
        }
        else
        System.out.println("Sorry! You Have No Fixed Deposit Associated With Your Account");
    }
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        project1 obj=new project1();
        obj.noc();
        obj.security();
        int r1=0,y=0;
        int choice;
        System.out.println("            Welcome To Our Banking Services!                    ");
        obj.date();
        do{
            System.out.println("            Please Select What Do You Want To Do               ");
            System.out.println("                        1.  LOGIN                       ");
            System.out.println("                        2.  SEARCH BY ACCOUNT NUMBER    ");
            System.out.println("                        3.  OPEN A NEW ACCOUNT          ");
            System.out.println("                        4.  CHECK CUSTOMER'S ACCOUNT TRANSACTION HISTORY        ");
            System.out.println("                        5.  CHANGE DATE                 ");
            System.out.println("                        6.  EXIT                        ");
            choice=sc.nextInt();
                switch(choice)
                {
                    case 1:{
                        y=obj.login(r1);
                        if(y==1)
                        {
                            int choice1;
                            do{
                                System.out.println("            WHAT DO YOU WANT TO DO WITH YOUR ACCOUNT ?           ");
                                System.out.println("            PLEASE SELECT FROM THE LIST GIVEN BELOW :-            ");
                                System.out.println("                    1. DEPOSIT MONEY                            ");
                                System.out.println("                    2. WITHDRAW MONEY                           ");
                                System.out.println("                    3. LAST TRANSACTION DETAILS                 ");
                                System.out.println("                    4. MONEY TRANSFER                           ");
                                System.out.println("                    5. CHECK BALANCE                            ");
                                System.out.println("                    6. APPLY FOR A LOAN                         ");
                                System.out.println("                    7. REPAY YOUR LOAN                          ");
                                System.out.println("                    8. APPLY FOR A FIXED DEPOSIT                ");
                                System.out.println("                    9. CHECK FOR FD COMPLETION                  ");
                                System.out.println("                    10. BREAK YOUR FIXED DEPOSIT                ");
                                System.out.println("                    11. EXIT( OR FOR ACCESSING ANOTHER ACCOUNT ) ");
                                choice1=sc.nextInt();
                                switch(choice1)
                                {
                                    case 1:{
                                       obj.deposit();
                                    }
                                    break;
                                    case 2:{
                                        obj.withdraw();
                                    }
                                    break;
                                    case 3:{
                                        obj.statement();
                                    }
                                    break;
                                    case 4:{
                                        obj.moneyt();
                                    }
                                    break;
                                    case 5:{
                                        obj.bcheck();
                                    }
                                    break;
                                    case 6:{
                                        obj.loan();
                                    }
                                    break;
                                    case 7:{
                                        obj.lrepay();
                                    }
                                    break;
                                    case 8:{
                                        obj.fd();
                                    }
                                    break;
                                    case 9:{
                                        obj.fdpay();
                                    }
                                    break;
                                    case 10:{
                                        obj.fdbreak();
                                    }
                                    break;
                                    default:System.out.println("");
                                    break;
                                }
                            }while(choice1!=11);
                        }
                        else
                        break;
                   }
                   break;
                   case 2:{
                       obj.search();
                   }
                   break;
                   case 3:{
                       obj.naccount();
                   }
                   break;
                   case 4:{
                       obj.state();
                   }
                   break;
                   case 5:{
                       obj.date();
                    }
                   break;
                   default:System.out.println("");
                   break;
            }
        }while(choice!=6);
    }
}