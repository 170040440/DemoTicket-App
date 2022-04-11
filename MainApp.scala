
object MainApp extends App {
  val employeeData1 = "Rajesh 123 Developer"
  val employeeData2 = "Suresh 345 Manager"

  /*
      Create objects employee1 and employee2 using the attributes from above variable.
      The employee data is in the form <Name>+ " " + <empId> + " " + <role>
   */
    var employee1 = new Employee("Rajesh", "123", "Developer")
    var employee2 = new Employee("Suresh", "345", "Manager")


    //Perform below operations on both employees
    //1. Assign a ticket to employee1
      TicketClient.AssignTask(employee1.empId)

    //2. Print list of all tickets
    for(ticket <- TicketClient.allTickets){
             ticket.printTicket()
           }

    //3. Reassign same ticket to employee2
    TicketClient.allTickets(0).ReAssign(employee2.empId)

    //4. Print list of all tickets
    for(ticket <- TicketClient.allTickets){
             ticket.printTicket()
             }

    //5. UnAssign ticket from employee2
    TicketClient.allTickets(0).UnAssign

    //6. Assign another ticket to employee1
       TicketClient.AssignTask(employee1.empId)

    //7. Print list of all tickets
       for(ticket <- TicketClient.allTickets){
         ticket.printTicket()
       }
}