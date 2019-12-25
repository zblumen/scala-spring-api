package scalaDemo.jpa

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import scalaDemo.entity.Users


@Repository
trait UserRepository extends CrudRepository[Users, java.lang.Long] {
  def findUserByUsername(username: String): Users
}
