(ns com.lendup.citadel.providers.mocky)

(defprotocol Foo
  (hello [this] "Says hello"))

(def bar
  (reify Foo
    (hello [this] "hello, world")))

(when-not (satisfies? Foo bar)
  (throw (Exception. "bar doesn't satisfy Foo")))
