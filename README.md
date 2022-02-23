# Tiny toy repo


Just a little repo setting up java, and scala and works with the bazelfe tool. 


`./bazel build src/...`


Should succeed...

then say remove the dependencies from `src/main/scala/com/example/BUILD` and re-run the build. and it should auto-repair and fix itself when you build again. 