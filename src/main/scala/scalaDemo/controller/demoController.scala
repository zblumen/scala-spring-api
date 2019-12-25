package scalaDemo.controller

import java.util.Optional

import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}
import scalaDemo.entity.Users
import scalaDemo.service.UserService


@RestController
@RequestMapping(path = Array("/api"))
class UserController(@Autowired val userService: UserService, @Autowired val dataSource: DataSource) {
  @GetMapping(path = Array("/users"))
  def getAllUsers(): java.lang.Iterable[Users] = {
    userService.listUsers
  }
  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): Optional[Users] = {
    userService.getUser(id)
  }
  @PostMapping(path = Array("/users"))
  def createUser(@RequestBody users: Users): ResponseEntity[Long] = {
    val id = userService.createUser(users)
    new ResponseEntity(id, new HttpHeaders, HttpStatus.CREATED)
  }
}