
import myDependencies._

lazy val module0 = (project in file("$module0;format="norm"$"))
                    .settings(libraryDependencies ++= $module0;format="word,lower"$Dependencies)

lazy val module1 =  (project in file("$module1;format="norm"$"))
                    .settings(libraryDependencies ++= $module1;format="word,lower"$Dependencies)

lazy val module2 = ( project in file("$module2;format="norm"$"))
                    .settings(libraryDependencies ++= $module2;format="word,lower"$Dependencies)

lazy val module3 =  (project in file("$module3;format="norm"$"))
                    .settings(libraryDependencies ++= $module3;format="word,lower"$Dependencies)

lazy val module4 = (project in file("$module4;format="norm"$"))
                    .settings(libraryDependencies ++= $module4;format="word,lower"$Dependencies)

lazy val module5 = (project in file("$module5;format="norm"$"))
                    .settings(libraryDependencies ++= $module5;format="word,lower"$Dependencies)



lazy val allRootModules: Seq[ProjectReference] = Seq(
  module0,
  module1,
  module2,
  module3,
  module4,
  module5
)

lazy val allRootModulesDeps: Seq[ClasspathDependency] =
  allRootModules.map(ClasspathDependency(_, None))

lazy val root = (project in file("."))
                .settings(name := "$name;format="normalize"$")
                .aggregate(allRootModules: _*)
                .dependsOn(allRootModulesDeps: _*)