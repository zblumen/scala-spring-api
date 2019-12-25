package scalaDemo.jpa

import com.sun.corba.se.spi.activation.Repository
import org.springframework.data.repository.CrudRepository


@Repository
trait UserRepository extends CrudRepository[Users, Long] {
  def findUserByUsername(username: String): Users
}
