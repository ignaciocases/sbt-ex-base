// val release = settingKey[Boolean]("")
// 
// release := sys.props("release") == "true"
// 
// version in ThisBuild := {
//   val v = "1.0"
//   if (release.value) v
//   else s"$v-${gitHeadCommitSha.value}"
// }