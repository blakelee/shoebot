import accountdetails.AccountDetailsEditor
import cells.Cells
import circledrawer.CircleDrawer
import counter.Counter
import crud.Crud
import flightbooker.FlightBooker
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.stage.StageStyle

import temperature.TemperatureConverter
import timer.Timer
import tornadofx.*
import kotlin.reflect.KClass
import kotlin.reflect.primaryConstructor

class Launcher : App(Solutions::class)

class Solutions : View("7 GUIs Launcher") {

    val openStages = arrayListOf<Stage>()

    override val root = vbox {
        padding = Insets(10.0)
        spacing = 10.0
        alignment = Pos.CENTER

        val map = mapOf("Counter" to AccountDetailsEditor::class,
                "Temperature Converter" to TemperatureConverter::class,
                "Flight Booker" to FlightBooker::class,
                "Timer" to Timer::class,
                "CRUD" to Crud::class,
                "Circle Drawer" to CircleDrawer::class,
                "Cells" to Cells::class)

        for ((name, kClass) in map.entries) {
            button(name) {
                prefWidth = 200.0
                setOnAction {
                    val view = kClass.primaryConstructor?.call()
                    val stage = Stage()
                    stage.isResizable = false
                    stage.scene = Scene(view?.root)
                    stage.title = name
                    stage.show()
                    openStages.add(stage)
                }
            }
        }
    }

    init {
        primaryStage.setOnCloseRequest {
            for (s in openStages) {
                s.close()
            }
        }
    }
}