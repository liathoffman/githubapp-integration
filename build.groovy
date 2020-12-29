stage("test") {
  echo "success!"
}
stage("test") {
  echo "this should trigger a build!"
}
stage("test") {
  echo "another build!"
}