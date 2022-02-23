workspace(name = "bzpytest")

load("@bazel_tools//tools/jdk:remote_java_repository.bzl", "remote_java_repository")

remote_java_repository(
  name = "remote_jdk8_linux_x86",
  prefix = "remote_jdk8", # Can be used with --java_runtime_version=openjdk_canary_11
  version = "8",            # or --java_runtime_version=11
  exec_compatible_with = [
    "@platforms//os:linux",
    "@platforms//cpu:x86_64",
  ],
  urls = [
    "https://cdn.azul.com/zulu/bin/zulu8.60.0.21-ca-jdk8.0.322-linux_x64.zip"
  ],
  sha256 = "7d616c9e5004765db8262b05837b99e5503546cdab51e36322fc114227dc0e77",
  strip_prefix = "zulu8.60.0.21-ca-jdk8.0.322-linux_x64"
)


remote_java_repository(
  name = "remote_jdk8_macos_x86",
  prefix = "remote_jdk8", # Can be used with --java_runtime_version=openjdk_canary_11
  version = "8",            # or --java_runtime_version=11
  exec_compatible_with = [
    "@platforms//os:macos",
    "@platforms//cpu:arm64",
  ],
  urls = [
    "https://cdn.azul.com/zulu/bin/zulu8.60.0.21-ca-jdk8.0.322-macosx_x64.zip"
  ],
  sha256 = "f7399d7548a50c30abbd5944ede0dae40843e2f127954898d39c1b9d924ca3c3",
  strip_prefix = "zulu8.60.0.21-ca-jdk8.0.322-macosx_x64"
)

remote_java_repository(
  name = "remote_jdk8_macos_arm64",
  prefix = "remote_jdk8", # Can be used with --java_runtime_version=openjdk_canary_11
  version = "8",            # or --java_runtime_version=11
  exec_compatible_with = [
    "@platforms//os:macos",
    "@platforms//cpu:arm64",
  ],
  urls = [
    "https://cdn.azul.com/zulu/bin/zulu8.60.0.21-ca-jdk8.0.322-macosx_aarch64.zip"
  ],
  sha256 = "51e83d8a2f96cd7ebf29f0b4f5db87f93744b44ed35da958dbe8dad70be73af3",
  strip_prefix = "zulu8.60.0.21-ca-jdk8.0.322-macosx_aarch64"
)


load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

http_archive(
    name = "rules_proto",
    sha256 = "602e7161d9195e50246177e7c55b2f39950a9cf7366f74ed5f22fd45750cd208",
    strip_prefix = "rules_proto-97d8af4dc474595af3900dd85cb3a29ad28cc313",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_proto/archive/97d8af4dc474595af3900dd85cb3a29ad28cc313.tar.gz",
        "https://github.com/bazelbuild/rules_proto/archive/97d8af4dc474595af3900dd85cb3a29ad28cc313.tar.gz",
    ],
)
load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

skylib_version = "1.0.3"
http_archive(
    name = "bazel_skylib",
    sha256 = "1c531376ac7e5a180e0237938a2536de0c54d93f5c278634818e0efc952dd56c",
    type = "tar.gz",
    url = "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib-{}.tar.gz".format(skylib_version, skylib_version),
)

rules_scala_version = "e7a948ad1948058a7a5ddfbd9d1629d6db839933"
http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "76e1abb8a54f61ada974e6e9af689c59fd9f0518b49be6be7a631ce9fa45f236",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

# Stores Scala version and other configuration
# 2.12 is a default version, other versions can be use by passing them explicitly:
# scala_config(scala_version = "2.11.12")
load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

# optional: setup ScalaTest toolchain and dependencies
load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()
