package accountdetails

import tornadofx.getProperty
import tornadofx.property


class AccountDetails (email: String? = null, password: String? = null,
                      size: String? = null, link: String? = null,
                      keywords: String? = null,
                      notificationEmail: String? = null,
                      siteType: String? = null, carrier: Int,
                      phoneNumber: String? = null) {

    var email by property(email)
    fun emailProperty() = getProperty(AccountDetails::email)

    var password by property(password)
    fun passwordProperty() = getProperty(AccountDetails::password)

    var size by property(size)
    fun sizeProperty() = getProperty(AccountDetails::size)

    var link by property(link)
    fun linkProperty() = getProperty(AccountDetails::link)

    var keywords by property(keywords)
    fun keywordsProperty() = getProperty(AccountDetails::keywords)

    var notificationEmail by property(notificationEmail)
    fun notificationEmailProperty() = getProperty(AccountDetails::notificationEmail)

    var carrier by property(carrier)
    fun carrierProperty() = getProperty(AccountDetails::carrier)

    var phoneNumber by property(phoneNumber)
    fun phoneNumberProperty() = getProperty(AccountDetails::phoneNumber)
}