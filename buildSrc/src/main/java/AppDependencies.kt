import org.gradle.kotlin.dsl.DependencyHandlerScope

const val composeVersion = "1.2.0-alpha06"

fun DependencyHandlerScope.impl() {
    //addD(dep = "com.squareup.leakcanary:leakcanary-android:2.8.1")

    //Base
    addD(dep = "androidx.core:core-ktx:1.8.0-alpha06")
    addD(dep = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    addD(dep = "androidx.appcompat:appcompat:1.4.1")
    addD(dep = "androidx.fragment:fragment-ktx:1.4.1")

    //Dagger-2
    addD(dep = "com.google.dagger:dagger:2.41")
    addD(dep = "com.google.dagger:dagger-compiler:2.41", method = kapt)

    //Retrofit
    addD(dep = "com.squareup.retrofit2:retrofit:2.9.0")
    addD(dep = "com.squareup.retrofit2:converter-gson:2.9.0")

//Lifecycle
    with("2.5.0-alpha05") {
        listOf(
            "androidx.lifecycle:lifecycle-runtime-ktx:$this",
            "androidx.lifecycle:lifecycle-viewmodel-ktx:$this"
        ).forEach { addD(dep = it) }
    }
}

val listPlugins = listOf(
    "com.android.application",
    "org.jetbrains.kotlin.android",
    "kotlin-kapt"
)

private fun DependencyHandlerScope.addD(method: String = imp, dep: Any) = add(method, dep)
private val imp get() = "implementation"
private val kapt get() = "kapt"




