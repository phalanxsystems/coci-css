(set-env!
  :resource-paths #{"src"}
  :dependencies '[[mathias/boot-sassc                       "0.1.5"             :scope "test"] ])

(require
  '[mathias.boot-sassc       :refer [sass]]
  )


(task-options!
  pom    {:project 'coci-css
          :version "0.1.0"
          :description "common css for chabad on campus projects"}
  speak  {:theme "woodblock"}
  sass   {:sass-file "style.scss" :output-dir "css"})


