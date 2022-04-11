package Services
import Model.Ticket
import scala.util.Random
object TicketClient {
  /*
    Attribute for TicketClient
      - allTickets : List of all ticket objects created.
   */
  var allTickets : List[Ticket] = List();

  def AssignTask(empId: String): Unit = {
    /*
      This method should create a new ticket with random ticketId and assign it to
      the user with this empId. Ticket state should be CREATED and priority should be 1.
      After creation of every new ticket, add it to allTickets List.
     */
     var ticketId = Random.alphanumeric.take(10).mkString
         val newTicket = new Ticket(ticketId,"CREATED", 1, empId)
         allTickets = allTickets ::: List(newTicket)
  }

}
