(ns foo.core
  (:require [planck.core :refer [*command-line-args*]]))

(println (str "Hello " (first *command-line-args*) "!"))