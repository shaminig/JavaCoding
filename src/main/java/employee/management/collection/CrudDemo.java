package employee.management.collection;

import java.util.*;

public class CrudDemo {
    public static void main(String[] args) {
        Collection<Employee> empList = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            {
                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");
                System.out.println("ENTER YOU CHOICE");
                ch = s.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("-------------------");
                        System.out.println("Enter the employee number");
                        int eNo = s.nextInt();
                        System.out.println("Enter the employee name");
                        String eName = s1.nextLine();
                        System.out.println("Enter the salary");
                        int salary = s.nextInt();
                        empList.add(new Employee(eNo, eName, salary));
                        System.out.println("-------------------");
                        break;
                    case 2:
                        System.out.println("-------------------");
                        Iterator<Employee> i = empList.iterator();
                        if (i.hasNext()) {
                            Employee e = i.next();
                            System.out.println(e);
                        }else{
                            System.out.println("Record not found");
                        }
                        System.out.println("-------------------");
                        break;
                    case 3:
                        boolean found = false;
                        System.out.println("Enter the employee number to be searched");
                        int eno = s.nextInt();
                        System.out.println("-------------------");
                        i = empList.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            if (e.getENo() == eno) {
                                System.out.println(e);
                                found = true;
                            }

                        }
                        if (!found == true) {
                            System.out.println("Record not found");
                        }
                        System.out.println("-------------------");
                        break;

                    case 4:
                        found = false;
                        System.out.println("Enter the employee number to be deleted");
                        eno = s.nextInt();
                        System.out.println("-------------------");
                        i = empList.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            if (e.getENo() == eno) {
                                i.remove();
                                found = true;
                            }
                        }
                        if (!found == true) {
                            System.out.println("Record not found");
                        } else {
                            System.out.println("Deleted successfully");
                        }
                        System.out.println("-------------------");
                        break;
                    case 5:
                        found = false;
                        System.out.println("Enter the eno to be updated");
                        eno = s.nextInt();
                        System.out.println("-------------------");
                        ListIterator<Employee> li = ((ArrayList<Employee>) empList).listIterator();
                        while (li.hasNext()) {
                            Employee e = li.next();
                            if (e.getENo() == eno) {
                                System.out.println("Enter the new name");
                                eName = s1.nextLine();
                                System.out.println("Enter the new salary");
                                salary = s1.nextInt();
                                li.set(new Employee(eno, eName, salary));
                                found = true;
                            }

                        }
                        if (!found == true) {
                            System.out.println("Record not found");
                        } else {
                            System.out.println("Updated successfully");
                        }
                        System.out.println("-------------------");
                        break;
                }
            }
        } while (ch != 0);
    }
}
