class EmployeeInformation
{
               public static void main(String args[])
               {

                        System.out.println("Name" +   "      Year of Joining     " + "    Address" );

                        Employee a=new Employee("Robert",1994, "     64C-WallsStreet");

                        a.display();

                        Employee b=new Employee("Sam   ",2000, "     68D-WallsStreet");

                        b.display();

                        Employee c=new Employee("John  ",2002, "     70F-WallsStreet");

                        c.display();

                 }
}

class Employee
{
                        String Name;
                        int Year;
                        String Address;
                        Employee(String name,int years, String address)
                       {
                            Name=name;
                            Year=years;
                            Address=address;
                        }
void display()
                       {
                        System.out.println(Name+ "        " +Year + "         "     +Address);                                          
                        }

}

