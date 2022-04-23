import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementations(files: ConfigurableFileCollection) {
    implList.forEach { add(impl, it)}
    kaptList.forEach { add(kapt, it) }

    //Local library
    add(impl, files)
}







