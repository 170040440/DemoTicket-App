package Model

class Ticket (var ticketId:String, var state:String, var priority:Number, var assignee:String){
  /*
      Attributes for class Ticket:
        - ticketId : String
        - state : String
        - priority : Number
        - assignee : String
   */

  def UnAssign: Unit ={
    /*
      This method should change the assignee ticket to null.
     */
  assignee = null;
  }

  def ReAssign(empId: String): Unit = {
    /*
      This method should change the assignee ticket to the user with the given empId.
     */
     assignee = empId;
  }

  def printTicket():Unit = {

    print("ttId : "+ticketId+", "+"state : "+state+", "+"priority : "+priority +", "+"assignee : "+assignee+" \n")
  }
}
