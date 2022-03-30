# Declaration of Class

We can declare Kotlin classes by using `class` keyword.

```kotlin
class User{}
```

A Kotlin class may contain a constructor, variable, function, and class.

## Constructor
```kotlin
class User {
    var name = "kevin"
    
    // constructor
    constructor(name: String) {
        this.name = name
    }
    
    fun someFun() {
        println("name" + this.name)
    }
    
    class SomeClass {}
}
```

In Kotlin, we don't use `new` to create a new object.
Instead, we use the name of the class and initial arguments.

```kotlin
val user = User("Kim")
user.someFun()
```

## Primary Constructor
A Kotlin class has two types of constructors, one is a primary constructor, other is a secondary constructor.
```kotlin
// primary constructor 1
class User constructor() {
    
}

// primary constructor 2
class User () {
    
}

// no constuctor 
class User {
    
}

// init keyword and a constuctor 
class User(name: String, count: Int) {
    init {
        println()
    }
    
    fun someFun() {}
}
```
