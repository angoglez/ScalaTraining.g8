case class Contact(name:String, phone: String)

trait ContactsService[E] {

  def addContact() : Either[E,Contact]
  // you should add others

}