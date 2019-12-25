package scalaDemo.entity

import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty
import collection.mutable._
@Entity
class Users extends Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: java.lang.Long = _
  @BeanProperty
  @Column(name = "username")
  var username: String = _
  @BeanProperty
  @Column(name = "password")
  var password: String = _
  @BeanProperty
  @Column(name = "enabled")
  var enabled: Boolean = _
}
