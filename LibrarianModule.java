package org.bitlabs.LibraryManagement.corejava;
import java.util.Scanner;
class Library
{
        static String str,b,date;
        static int a,c;
        void add()
        {
        System.out.println("enter book name ,Author,edition and book_no");
        Scanner obj2=new Scanner(System.in);
        String str=obj2.nextLine();
        String author=obj2.nextLine();
        String edition=obj2.nextLine();
        int bookno=obj2.nextInt();
        System.out.println("successfully added and the details is \n book name : " +str+" booknumber : "+bookno+" author : "+author+"edition : "+edition);
        }
        void iss()
        {
        Scanner obj3=new Scanner(System.in);
        System.out.println("book name");
        str=obj3.nextLine();
        System.out.println("book_id");
        a=obj3.nextInt();
        System.out.println("issue date");
        b=obj3.nextLine();
        System.out.println("total number of book issued");
        c=obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return book date");
        date=obj3.nextLine();
        }
       int getid()
       {
          return a;
      }
      void ret(){
          System.out.println("enter student name and book_id");
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
        int bookid=sc.nextInt();
        if(a==bookid){
            System.out.println("total details");
       System.out.println("book name: "+Library.str);
       System.out.println("book id :" +Library.a);
       System.out.println("issue date: "+Library.b);
       System.out.println("total number of book issued: "+Library.c);
       System.out.println("book return date : "+Library.date);
        }else{
            System.out.println("wrong id,pls enter coorect id");
        }
      }
    void detail(){
        System.out.println("book name: "+Library.str);
       System.out.println("book id :" +Library.a);
       System.out.println("issue date: "+Library.b);
       System.out.println("total number of book issued: "+Library.c);
       System.out.println("book return date : "+Library.date); 
    }
    void exit(){
        System.exit(0);
    }
}
public class LibrarianModule {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter librarian user name");
	    String luser=sc.next();
	    System.out.println("enter password");
	    String lpass=sc.next();
	    if(luser.equals("Pavan")&&lpass.equals("Pavan@123"))
	    {
	    char r;boolean cond;
		  do{
		        System.out.println("library management system");
		        System.out.println("press 1 to add book");
		        System.out.println("press 2 issue a book");
		        System.out.println("press 3 to return a book");
		        System.out.println("press 4 to print complete issue details");
		        System.out.println("press 5 to exit");
		        Scanner obj1=new Scanner(System.in);
		        System.out.println("choose one opction " );
		        int a=obj1.nextInt();
		        switch(a)
		        {
		            case 1:
		                Library aa=new  Library();
		                aa.add();
		                break;
		                case 2:
		                Library bb=new  Library();
		                bb.iss();
		                break;
		                case 3:
		                Library cc=new  Library();
		                cc.ret();
		                break;
		                case 4:
		                Library is=new  Library();
		                is.detail();
		                break;
		                case 5:
		                Library add=new  Library();
		                add.exit();
		                break;
		                default:
		                System.out.println("invalid number");
		        }
		        System.out.println("if you want to continue select option Y/N");
		                r=obj1.next().charAt(0);
		                cond=r=='y'||r=='Y';
		               }while(cond);
		                if(r=='n'||r=='N'){
		                    Library z=new Library();
		                    z.exit();
		                }
		    }
		    else
		    {
		        System.out.println("invalid user name or password");
		    }
	}

}
