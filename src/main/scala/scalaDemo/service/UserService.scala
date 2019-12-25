package scalaDemo.service

import java.util.Optional

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.{PostAuthorize, PreAuthorize}
import org.springframework.stereotype.Service
import scalaDemo.entity.Users
import scalaDemo.jpa.UserRepository

@Service
class UserService(@Autowired private val userRepository: UserRepository) {
  @PreAuthorize("hasRole('admin')")
  def listUsers(): java.lang.Iterable[Users] = {
    userRepository.findAll
  }
  @PreAuthorize("hasRole('user')")
  @PostAuthorize("returnObject.username==principal.username || hasRole('admin')")
  def getUser(id: Long): Optional[Users] = {
    userRepository.findById(id)
  }
  @PreAuthorize("hasRole('admin')")
  def createUser(users: Users): Long = {
    userRepository.save(users)
    users.id
  }
}
