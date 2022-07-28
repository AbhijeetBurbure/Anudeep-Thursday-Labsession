class EmployeeInfo
{
               public static void main(String args[])
                  {

                        System.out.println("Name" +   "    Year of Joining     " + "Address" );

                        Employee a=new Employee("Robert",  1994, "64C-WallsStreet");

                        a.E1();

                        Employee b=new Employee("Sam",  2000, "   68D-WallsStreet");

                        b.E2();

                        Employee c=new Employee("John", 2002, "  70F-WallsStreet");

                        c.E3();

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
void E1()
                      {
                           System.out.println(Name+ "        " +Year + "         "     +Address);                                          
                       }
void E2()
                      {
                          System.out.println(Name+ "          " +Year + "        "     +Address);                                          
                       }
void E3()
                     {
                           System.out.println(Name+ "          "+Year + "        "     +Address);                                          
                       }
}

