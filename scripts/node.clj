(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'word-source.core
                       :output-to "out/word_source.js"
                       :output-dir "out"
                       :target :nodejs})
