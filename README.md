# scala-pf-syntax-idea

Sample repo for [...](...).


## Problem

The existing (as of Scala 2.12.6) syntaxes for defining a partial function leave one case to be unnecessarily complicated. This sample tries to show how a currently invalid syntax could be used, to allow a partial function with an explicit return type to be defined (but the set of input types being taken from the `case` clauses), without resorting to use of `PartialFunction`.


## Try it out

```
$ sbt test
```

The [Test.scala](test/scala/Test.scala) has sample code on various current ways of declaring a pf, and the suggested one:

- `val pf = { case 0 => "zero" } : PartialFunction[Any, String]`
- `val pf: PartialFunction[Any,String] = { case 0 => "zero" }`
- `def pf: String = { case 0 => "zero" }`

## References

- [Scala partial functions (without a PhD)](http://blog.bruchez.name/2011/10/scala-partial-functions-without-phd.html) (blog post, Oct 2011)
  - great walk-through of Scala's partial functions from every aspect
- ["Type inference craps out"](http://www.scala-archive.org/Type-inference-craps-out-tt2134282.html#a2134476) (Scala Users, May 2010)
  - an old mailing list discussion that shows some ways to define a partial function with a return type
 