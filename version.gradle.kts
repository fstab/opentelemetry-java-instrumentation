allprojects {
  if (findProperty("otel.stable") != "true") {
    version = "1.9.0-alpha"
  } else {
    version = "1.9.0"
  }
}
