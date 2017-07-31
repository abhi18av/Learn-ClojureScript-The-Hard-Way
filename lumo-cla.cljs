(ns foo.core
  (:require [lumo.core :refer [*command-line-args*]]))

(println (str "Hello " (first *command-line-args*) "!"))
