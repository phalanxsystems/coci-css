(set-env!
  :resource-paths #{"src"})


(task-options!
  pom    {:project 'coci-css
          :version "0.1.0"
          :description "common css for chabad on campus projects"}
  speak  {:theme "woodblock"})


