
```scala
package bio4j.model.test

import vertexTypes._
import propertyTypes._
import bio4j.model._
import shapeless.record.FieldType

object vertices {

  // stupid implementation
    case class UserImpl(
      val id: String,
      val name: String,
      val since: Int
    )
  
  // now users are user ->> "hey Joe" 
  case object user extends Vertex(User) { type Rep = UserImpl;

    
    // provide implicits here for all properties
    // or elsewhere
    implicit object readId extends ReadProperty(id) {

      @Override
      def apply(vRep: FieldType[user.type, UserImpl]): String = (vRep:UserImpl).id
    }

    // probably better object + implicit, not implicit object
    implicit object readSince extends ReadProperty(since) {

      @Override
      def apply(vRep: FieldType[user.type, user.Rep]): since.Rep = (vRep:UserImpl).since
    }
  }
}

class UserSuite extends org.scalatest.FunSuite {

  import vertices._  

  test("retrieve properties") {

    import vertexTypes.User._
    import user._
    val x = user ->> UserImpl(
                                id = "1ad3a34df",
                                name = "Robustiano Satrústegui",
                                since = 2349965
                              )

    val x_id = x.get(id)
    // too bad, no witness for since
    // val x_since = x.get(since)
    // add it here!
    // implicit val Iknowit = User has since
    // but no way of retrieving it!
    // hahaha
    // val x_since = x.get(since)
    val x_since = x.get(since)
    val x_since_again = x get since

    println (user +" get "+ id +": "+ x_id)
    println (user +" get "+ since +": "+ x_since.toString)

  }
}
```


------

### Index

+ src
  + test
    + scala
      + bio4j
        + model
          + [propertyTypes.scala][test/scala/bio4j/model/propertyTypes.scala]
          + [vertices.scala][test/scala/bio4j/model/vertices.scala]
          + [relationships.scala][test/scala/bio4j/model/relationships.scala]
          + [vertexTypes.scala][test/scala/bio4j/model/vertexTypes.scala]
          + [edgeTypes.scala][test/scala/bio4j/model/edgeTypes.scala]
  + main
    + scala
      + bio4j
        + model
          + [properties.scala][main/scala/bio4j/model/properties.scala]
          + [edges.scala][main/scala/bio4j/model/edges.scala]
          + [vertices.scala][main/scala/bio4j/model/vertices.scala]
          + [relationships.scala][main/scala/bio4j/model/relationships.scala]
          + [relationshipTypes.scala][main/scala/bio4j/model/relationshipTypes.scala]
          + [vertexTypes.scala][main/scala/bio4j/model/vertexTypes.scala]
          + [edgeTypes.scala][main/scala/bio4j/model/edgeTypes.scala]

[test/scala/bio4j/model/propertyTypes.scala]: propertyTypes.scala.md
[test/scala/bio4j/model/vertices.scala]: vertices.scala.md
[test/scala/bio4j/model/relationships.scala]: relationships.scala.md
[test/scala/bio4j/model/vertexTypes.scala]: vertexTypes.scala.md
[test/scala/bio4j/model/edgeTypes.scala]: edgeTypes.scala.md
[main/scala/bio4j/model/properties.scala]: ../../../../main/scala/bio4j/model/properties.scala.md
[main/scala/bio4j/model/edges.scala]: ../../../../main/scala/bio4j/model/edges.scala.md
[main/scala/bio4j/model/vertices.scala]: ../../../../main/scala/bio4j/model/vertices.scala.md
[main/scala/bio4j/model/relationships.scala]: ../../../../main/scala/bio4j/model/relationships.scala.md
[main/scala/bio4j/model/relationshipTypes.scala]: ../../../../main/scala/bio4j/model/relationshipTypes.scala.md
[main/scala/bio4j/model/vertexTypes.scala]: ../../../../main/scala/bio4j/model/vertexTypes.scala.md
[main/scala/bio4j/model/edgeTypes.scala]: ../../../../main/scala/bio4j/model/edgeTypes.scala.md