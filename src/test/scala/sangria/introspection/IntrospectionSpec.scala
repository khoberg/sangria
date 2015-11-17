package sangria.introspection

import org.scalatest.{Matchers, WordSpec}
import sangria.execution.Executor
import sangria.parser.QueryParser
import sangria.schema._
import sangria.util.AwaitSupport
import sangria.validation.QueryValidator

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

class IntrospectionSpec extends WordSpec with Matchers with AwaitSupport {
  "Introspection" should {
    "executes an introspection query" in {
      val schema = Schema(ObjectType[Unit, Unit]("QueryRoot", Nil))

      Executor(schema).execute(introspectionQuery).await should be (Map(
        "data" → Map(
          "__schema" → Map(
            "queryType" → Map(
              "name" → "QueryRoot"),
            "mutationType" → null,
            "types" → Vector(
              Map(
                "inputFields" → null,
                "name" → "QueryRoot",
                "description" → null,
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Nil,
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__Directive",
                "description" → "A Directive provides a way to describe alternate runtime execution and type validation behavior in a GraphQL document.\n\nIn some cases, you need to provide options to alter GraphQL’s execution behavior in ways field arguments will not suffice, such as conditionally including or skipping a field. Directives provide this by describing additional information to the executor.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "name",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "String",
                        "ofType" → null))),
                  Map(
                    "name" → "description",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "args",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "LIST",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "NON_NULL",
                          "name" → null,
                          "ofType" → Map(
                            "kind" → "OBJECT",
                            "name" → "__InputValue"))))),
                  Map(
                    "name" → "onOperation",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null))),
                  Map(
                    "name" → "onFragment",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null))),
                  Map(
                    "name" → "onField",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null)))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "__EnumValue",
                "description" → "One possible value for a given Enum. Enum values are unique values, not a placeholder for a string or numeric value. However an Enum value is returned in a JSON response as a string.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "name",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "String",
                        "ofType" → null))),
                  Map(
                    "name" → "description",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "isDeprecated",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null))),
                  Map(
                    "name" → "deprecationReason",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__Field",
                "description" → "Object and Interface types are described by a list of Fields, each of which has a name, potentially a list of arguments, and a return type.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "name",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "String",
                        "ofType" → null))),
                  Map(
                    "name" → "description",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "args",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "LIST",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "NON_NULL",
                          "name" → null,
                          "ofType" → Map(
                            "kind" → "OBJECT",
                            "name" → "__InputValue"))))),
                  Map(
                    "name" → "type",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "OBJECT",
                        "name" → "__Type",
                        "ofType" → null))),
                  Map(
                    "name" → "isDeprecated",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null))),
                  Map(
                    "name" → "deprecationReason",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__InputValue",
                "description" → "Arguments provided to Fields or Directives and the input fields of an InputObject are represented as Input Values which describe their type and optionally a default value.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "name",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "String",
                        "ofType" → null))),
                  Map(
                    "name" → "description",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "type",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "OBJECT",
                        "name" → "__Type",
                        "ofType" → null))),
                  Map(
                    "name" → "defaultValue",
                    "description" → "A GraphQL-formatted string representing the default value for this input value.",
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__Schema",
                "description" → "A GraphQL Schema defines the capabilities of a GraphQL server. It exposes all available types and directives on the server, as well as the entry points for query and mutation operations.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "types",
                    "description" → "A list of all types supported by this server.",
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "LIST",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "NON_NULL",
                          "name" → null,
                          "ofType" → Map(
                            "kind" → "OBJECT",
                            "name" → "__Type"))))),
                  Map(
                    "name" → "queryType",
                    "description" → "The type that query operations will be rooted at.",
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "OBJECT",
                        "name" → "__Type",
                        "ofType" → null))),
                  Map(
                    "name" → "mutationType",
                    "description" → "If this server supports mutation, the type that mutation operations will be rooted at.",
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "OBJECT",
                      "name" → "__Type",
                      "ofType" → null)),
                  Map(
                    "name" → "directives",
                    "description" → "A list of all directives supported by this server.",
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "LIST",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "NON_NULL",
                          "name" → null,
                          "ofType" → Map(
                            "kind" → "OBJECT",
                            "name" → "__Directive")))))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__Type",
                "description" → "The fundamental unit of any GraphQL Schema is the type. There are many kinds of types in GraphQL as represented by the `__TypeKind` enum.\n\nDepending on the kind of a type, certain fields describe information about that type. Scalar types provide no information beyond a name and description, while Enum types provide their values. Object and Interface types provide the fields they describe. Abstract types, Union and Interface, provide the Object types possible at runtime. List and NonNull types compose other types.",
                "interfaces" → Nil,
                "enumValues" → null,
                "fields" → Vector(
                  Map(
                    "name" → "kind",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "ENUM",
                        "name" → "__TypeKind",
                        "ofType" → null))),
                  Map(
                    "name" → "name",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "description",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "SCALAR",
                      "name" → "String",
                      "ofType" → null)),
                  Map(
                    "name" → "fields",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Vector(
                      Map(
                        "name" → "includeDeprecated",
                        "description" → null,
                        "type" → Map(
                          "kind" → "SCALAR",
                          "name" → "Boolean",
                          "ofType" → null),
                        "defaultValue" → "false")),
                    "type" → Map(
                      "kind" → "LIST",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "NON_NULL",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "OBJECT",
                          "name" → "__Field",
                          "ofType" → null)))),
                  Map(
                    "name" → "interfaces",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "LIST",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "NON_NULL",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "OBJECT",
                          "name" → "__Type",
                          "ofType" → null)))),
                  Map(
                    "name" → "possibleTypes",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "LIST",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "NON_NULL",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "OBJECT",
                          "name" → "__Type",
                          "ofType" → null)))),
                  Map(
                    "name" → "enumValues",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Vector(
                      Map(
                        "name" → "includeDeprecated",
                        "description" → null,
                        "type" → Map(
                          "kind" → "SCALAR",
                          "name" → "Boolean",
                          "ofType" → null),
                        "defaultValue" → "false")),
                    "type" → Map(
                      "kind" → "LIST",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "NON_NULL",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "OBJECT",
                          "name" → "__EnumValue",
                          "ofType" → null)))),
                  Map(
                    "name" → "inputFields",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "LIST",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "NON_NULL",
                        "name" → null,
                        "ofType" → Map(
                          "kind" → "OBJECT",
                          "name" → "__InputValue",
                          "ofType" → null)))),
                  Map(
                    "name" → "ofType",
                    "description" → null,
                    "isDeprecated" → false,
                    "deprecationReason" → null,
                    "args" → Nil,
                    "type" → Map(
                      "kind" → "OBJECT",
                      "name" → "__Type",
                      "ofType" → null))
                ),
                "kind" → "OBJECT",
                "possibleTypes" → null
              ),
              Map(
                "inputFields" → null,
                "name" → "__TypeKind",
                "description" → "An enum describing what kind of type a given `__Type` is.",
                "interfaces" → null,
                "enumValues" → Vector(
                  Map(
                    "name" → "SCALAR",
                    "description" → "Indicates this type is a scalar.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "OBJECT",
                    "description" → "Indicates this type is an object. `fields` and `interfaces` are valid fields.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "INTERFACE",
                    "description" → "Indicates this type is an interface. `fields` and `possibleTypes` are valid fields.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "UNION",
                    "description" → "Indicates this type is a union. `possibleTypes` is a valid field.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "ENUM",
                    "description" → "Indicates this type is an enum. `enumValues` is a valid field.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "INPUT_OBJECT",
                    "description" → "Indicates this type is an input object. `inputFields` is a valid field.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "LIST",
                    "description" → "Indicates this type is a list. `ofType` is a valid field.",
                    "isDeprecated" → false,
                    "deprecationReason" → null),
                  Map(
                    "name" → "NON_NULL",
                    "description" → "Indicates this type is a non-null. `ofType` is a valid field.",
                    "isDeprecated" → false,
                    "deprecationReason" → null)
                ),
                "fields" → null,
                "kind" → "ENUM",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "BigDecimal",
                "description" → null,
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "BigInt",
                "description" → "Arbitrary big integer value",
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "Boolean",
                "description" → null,
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "Float",
                "description" → null,
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "ID",
                "description" → null,
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "Int",
                "description" → "32-bit integer value",
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "Long",
                "description" → "64-bit integer value",
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null),
              Map(
                "inputFields" → null,
                "name" → "String",
                "description" → null,
                "interfaces" → null,
                "enumValues" → null,
                "fields" → null,
                "kind" → "SCALAR",
                "possibleTypes" → null)),
            "directives" → Vector(
              Map(
                "name" → "include",
                "description" → "Directs the executor to include this field or fragment only when the `if` argument is true.",
                "onOperation" → false,
                "onFragment" → true,
                "onField" → true,
                "args" → Vector(
                  Map(
                    "name" → "if",
                    "description" → "Included when true.",
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null)),
                    "defaultValue" → null))),
              Map(
                "name" → "skip",
                "description" → "Directs the executor to skip this field or fragment when the `if` argument is true.",
                "onOperation" → false,
                "onFragment" → true,
                "onField" → true,
                "args" → Vector(
                  Map(
                    "name" → "if",
                    "description" → "Included when true.",
                    "type" → Map(
                      "kind" → "NON_NULL",
                      "name" → null,
                      "ofType" → Map(
                        "kind" → "SCALAR",
                        "name" → "Boolean",
                        "ofType" → null)),
                    "defaultValue" → null))))))))
    }

    "introspects on input object" in {
      val inputType = InputObjectType("TestInputObject", List(
        InputField("a", OptionInputType(StringType), defaultValue = "foo"),
        InputField("b", OptionInputType(ListInputType(OptionInputType(StringType))))
      ))

      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("field", OptionType(StringType),
          arguments = Argument("complex", OptionInputType(inputType)) :: Nil,
          resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __schema {
              types {
                kind
                name
                inputFields {
                  name
                  type { ...TypeRef }
                  defaultValue
                }
              }
            }
          }

          fragment TypeRef on __Type {
            kind
            name
            ofType {
              kind
              name
              ofType {
                kind
                name
                ofType {
                  kind
                  name
                }
              }
            }
          }
        """
      )

      val BuiltInTypes = List(
        Map(
          "kind" → "OBJECT",
          "name" → "TestType",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__Directive",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__EnumValue",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__Field",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__InputValue",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__Schema",
          "inputFields" → null
        ),
        Map(
          "kind" → "OBJECT",
          "name" → "__Type",
          "inputFields" → null
        ),
        Map(
          "kind" → "ENUM",
          "name" → "__TypeKind",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "BigDecimal",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "BigInt",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "Boolean",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "Float",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "ID",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "Int",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "Long",
          "inputFields" → null
        ),
        Map(
          "kind" → "SCALAR",
          "name" → "String",
          "inputFields" → null
        )
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__schema" → Map(
            "types" → (List(
              Map(
                "kind" → "INPUT_OBJECT",
                "name" → "TestInputObject",
                "inputFields" → List(
                  Map(
                    "name" → "a",
                    "type" →
                      Map(
                        "kind" → "SCALAR",
                        "name" → "String",
                        "ofType" → null
                      ),
                    "defaultValue" → "foo"
                  ),
                  Map(
                    "name" → "b",
                    "type" →
                      Map(
                        "kind" → "LIST",
                        "name" → null,
                        "ofType" →
                          Map(
                            "kind" → "SCALAR",
                            "name" → "String",
                            "ofType" → null
                          )
                      ),
                    "defaultValue" → null
                  )
                )
              )
            ) ++ BuiltInTypes)
          )
        )
      ))
    }

    "supports the __type root field" in {
      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("testField", OptionType(StringType), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type(name: "TestType") {
              name
            }
          }
        """
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__type" → Map(
            "name" → "TestType"
          )
        )
      ))
    }

    "identifies deprecated fields" in {
      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("nonDeprecated", OptionType(StringType), resolve = _ ⇒ None),
        Field("deprecated", OptionType(StringType), deprecationReason = Some("Removed in 1.0"), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type(name: "TestType") {
              name
              fields(includeDeprecated: true) {
                name
                isDeprecated,
                deprecationReason
              }
            }
          }
        """
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__type" → Map(
            "name" → "TestType",
            "fields" → List(
              Map(
                "name" → "nonDeprecated",
                "isDeprecated" → false,
                "deprecationReason" → null
              ),
              Map(
                "name" → "deprecated",
                "isDeprecated" → true,
                "deprecationReason" → "Removed in 1.0"
              )
            )
          )
        )
      ))
    }

    "respects the includeDeprecated parameter for fields" in {
      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("nonDeprecated", OptionType(StringType), resolve = _ ⇒ None),
        Field("deprecated", OptionType(StringType), deprecationReason = Some("Removed in 1.0"), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type(name: "TestType") {
              name
              trueFields: fields(includeDeprecated: true) {
                name
              }
              falseFields: fields(includeDeprecated: false) {
                name
              }
              omittedFields: fields {
                name
              }
            }
          }
        """
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__type" → Map(
            "name" → "TestType",
            "trueFields" → List(
              Map(
                "name" → "nonDeprecated"
              ),
              Map(
                "name" → "deprecated"
              )
            ),
            "falseFields" → List(
              Map(
                "name" → "nonDeprecated"
              )
            ),
            "omittedFields" → List(
              Map(
                "name" → "nonDeprecated"
              )
            )
          )
        )
      ))
    }

    "identifies deprecated enum values" in {
      val testEnum = EnumType[Int]("TestEnum", values = List(
        EnumValue("NONDEPRECATED", value = 1),
        EnumValue("DEPRECATED", value = 2, deprecationReason = Some("Removed in 1.0")),
        EnumValue("ALSONONDEPRECATED", value = 3)))

      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("testEnum", OptionType(testEnum), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type(name: "TestEnum") {
              name
              enumValues(includeDeprecated: true) {
                name
                isDeprecated,
                deprecationReason
              }
            }
          }
        """
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__type" → Map(
            "name" → "TestEnum",
            "enumValues" → List(
              Map(
                "name" → "NONDEPRECATED",
                "isDeprecated" → false,
                "deprecationReason" → null
              ),
              Map(
                "name" → "DEPRECATED",
                "isDeprecated" → true,
                "deprecationReason" → "Removed in 1.0"
              ),
              Map(
                "name" → "ALSONONDEPRECATED",
                "isDeprecated" → false,
                "deprecationReason" → null
              )
            )
          )
        )
      ))
    }

    "respects the includeDeprecated parameter for enum values" in {
      val testEnum = EnumType[Int]("TestEnum", values = List(
        EnumValue("NONDEPRECATED", value = 1),
        EnumValue("DEPRECATED", value = 2, deprecationReason = Some("Removed in 1.0")),
        EnumValue("ALSONONDEPRECATED", value = 3)))

      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("testEnum", OptionType(testEnum), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type(name: "TestEnum") {
              name
              trueValues: enumValues(includeDeprecated: true) {
                name
              }
              falseValues: enumValues(includeDeprecated: false) {
                name
              }
              omittedValues: enumValues {
                name
              }
            }
          }
        """
      )

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "__type" → Map(
            "name" → "TestEnum",
            "trueValues" → List(
              Map(
                "name" → "NONDEPRECATED"
              ),
              Map(
                "name" → "DEPRECATED"
              ),
              Map(
                "name" → "ALSONONDEPRECATED"
              )
            ),
            "falseValues" → List(
              Map(
                "name" → "NONDEPRECATED"
              ),
              Map(
                "name" → "ALSONONDEPRECATED"
              )
            ),
            "omittedValues" → List(
              Map(
                "name" → "NONDEPRECATED"
              ),
              Map(
                "name" → "ALSONONDEPRECATED"
              )
            )
          )
        )
      ))
    }

    "fails as expected on the __type root field without an arg" in {
      val testType = ObjectType("TestType", fields[Unit, Unit](
        Field("testField", OptionType(StringType), resolve = _ ⇒ None)
      ))

      val schema = Schema(testType)

      val Success(query) = QueryParser.parse(
        """
          {
            __type {
              name
            }
          }
        """
      )

      val result = Executor(schema, queryValidator = QueryValidator.empty).execute(query).await.asInstanceOf[Map[String, Any]]

      result("data") should be (Map("__type" → null))
      result("errors").asInstanceOf[Seq[Map[String, Any]]](0)("message").asInstanceOf[String] should include (
        "Null value was provided for the NotNull Type 'String!' at path 'name'.")
    }

    "exposes descriptions on types and fields" in {
      val schema = Schema(ObjectType[Unit, Unit]("QueryRoot", Nil))

      val Success(query) = QueryParser.parse(
        """
          {
            schemaType: __type(name: "__Schema") {
              name,
              description,
              fields {
                name,
                description
              }
            }
          }
        """)

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "schemaType" → Map(
            "name" → "__Schema",
            "description" → (
              "A GraphQL Schema defines the capabilities of a " +
              "GraphQL server. It exposes all available types and " +
              "directives on the server, as well as the entry " +
              "points for query and mutation operations."),
            "fields" → List(
              Map(
                "name" → "types",
                "description" → "A list of all types supported by this server."
              ),
              Map(
                "name" → "queryType",
                "description" → "The type that query operations will be rooted at."
              ),
              Map(
                "name" → "mutationType",
                "description" → (
                  "If this server supports mutation, the type that " +
                  "mutation operations will be rooted at.")
              ),
              Map(
                "name" → "directives",
                "description" → "A list of all directives supported by this server."
              )
            )
          )
        )
      ))
    }

    "exposes descriptions on enums" in {
      val schema = Schema(ObjectType[Unit, Unit]("QueryRoot", Nil))

      val Success(query) = QueryParser.parse(
        """
          {
            typeKindType: __type(name: "__TypeKind") {
              name,
              description,
              enumValues {
                name,
                description
              }
            }
          }
        """)

      Executor(schema).execute(query).await should be (Map(
        "data" → Map(
          "typeKindType" → Map(
            "name" → "__TypeKind",
            "description" → "An enum describing what kind of type a given `__Type` is.",
            "enumValues" → List(
              Map(
                "description" → "Indicates this type is a scalar.",
                "name" → "SCALAR"
              ),
              Map(
                "description" → (
                  "Indicates this type is an object. " +
                  "`fields` and `interfaces` are valid fields."),
                "name" → "OBJECT"
              ),
              Map(
                "description" → (
                  "Indicates this type is an interface. " +
                  "`fields` and `possibleTypes` are valid fields."),
                "name" → "INTERFACE"
              ),
              Map(
                "description" → (
                  "Indicates this type is a union. " +
                  "`possibleTypes` is a valid field."),
                "name" → "UNION"
              ),
              Map(
                "description" → (
                  "Indicates this type is an enum. " +
                  "`enumValues` is a valid field."),
                "name" → "ENUM"
              ),
              Map(
                "description" → (
                  "Indicates this type is an input object. " +
                  "`inputFields` is a valid field."),
                "name" → "INPUT_OBJECT"
              ),
              Map(
                "description" → (
                  "Indicates this type is a list. " +
                  "`ofType` is a valid field."),
                "name" → "LIST"
              ),
              Map(
                "description" → (
                  "Indicates this type is a non-null. " +
                  "`ofType` is a valid field."),
                "name" → "NON_NULL"
              )
            )
          )
        )
      ))
    }
  }
}