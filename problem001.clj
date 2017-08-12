(ns euler001.core
  (:gen-class))

(defn filter-multiples
  [coll n]
  (filter #(= (mod % n) 0) coll))

(defn filter-multiple-list
  [coll & args]
  (set (reduce into (map #(partial (filter-multiples coll %)) args
                         ))))
(defn sum
  [coll]
  (reduce + coll))

(defn -main
  [& args]
  (println (sum (filter-multiple-list (range 1000) 3 5))))
