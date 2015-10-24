(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'word-source.core
   :output-to "out/word_source.js"
   :output-dir "out"})
