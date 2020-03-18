
import myDependencies._

lazy val module0 = project in file ("$module0;format="norm"$") settings (libraryDependencies ++= $module0;format="word,lower"$Dependencies)

lazy val module1 = project in file ("$module1;format="norm"$") settings  (libraryDependencies ++= $module1;format="word,lower"$Dependencies)

lazy val allRootModules: Seq[ProjectReference] = Seq(
  module0,
  module1
)

lazy val allRootModulesDeps: Seq[ClasspathDependency] =
  allRootModules.map(ClasspathDependency(_, None))

lazy val root = project in file(".") settings (name := "$name;format="normalize"$") aggregate (allRootModules: _*) dependsOn (allRootModulesDeps: _*)
  
