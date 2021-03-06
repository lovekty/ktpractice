package me.tony.practice.jfx.krystal

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * @author tony.zhuby
 */
class MyApp : Application() {
    override fun start(stage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("/scene.fxml"))
        val scene = Scene(root)
        scene.stylesheets.add(javaClass.getResource("/styles.css")!!.toExternalForm())
        stage.title = "hello krystal"
        stage.scene = scene
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(MyApp::class.java, *args)
        }
    }
}