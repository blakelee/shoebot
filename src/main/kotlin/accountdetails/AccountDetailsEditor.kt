package accountdetails

import carriers
import javafx.beans.property.SimpleBooleanProperty
import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.Priority
import tornadofx.*

class AccountDetailsEditor : View("Account Settings") {

    val detailsModel: AccountDetailsModel by inject()

    override val root = form {

        fieldset {
            hgrow = Priority.ALWAYS //Set all fields to extend to edge of form
            labelPosition = Orientation.HORIZONTAL
            paddingBottom = -15.0

            field("*Email Address") {
                textfield(detailsModel.email)
            }

            field("*Password") {
                passwordfield(detailsModel.password)
                /*checkbox("Show Password", isPasswordChecked) {
                    setOnAction { showPassword() }
                }*/
            }

            field("*Size") {
                textfield(detailsModel.size) {

                }
            }

            field("Tweet Keywords") {
                textfield(detailsModel.keywords)
            }

            field("Early Links") {
                textfield(detailsModel.link)
            }

            field("Notification Email") {
                textfield(detailsModel.notificationEmail)
            }


            titledpane("Text Notification") {
                alignment = Pos.BOTTOM_CENTER
                isCollapsible = false
                hbox {
                    alignment = Pos.CENTER
                    spacing = 5.0
                    label("Carrier")
                    combobox<String> {
                        items = carriers
                    }
                    label("Phone Number")
                    textfield(detailsModel.phoneNumber) {
                        hgrow = Priority.ALWAYS //Set all fields to extend to edge of form
                    }
                }
            }

            field {
                hbox {
                    alignment = Pos.CENTER_RIGHT
                    button("Save") {
                        disableProperty().bind(detailsModel.dirtyStateProperty())
                    }
                }
            }
        }
    }
}

//Validates the fields
private fun save(){

}
