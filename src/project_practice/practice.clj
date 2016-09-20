(ns project-practice.practice
  (:require [camel-snake-kebab.core :as csk]))

(csk/->snake_case "going to snake case")
(csk/->camelCase "going to camel case")
(csk/->kebab-case "going to kebab case")
