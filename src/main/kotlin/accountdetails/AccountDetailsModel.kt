package accountdetails

import tornadofx.ItemViewModel
import tornadofx.property


class AccountDetailsModel : ItemViewModel<AccountDetails>() {
    var email = bind {item?.emailProperty()}
    var password = bind {item?.passwordProperty()}
    var size = bind {item?.sizeProperty()}
    var link = bind {item?.linkProperty()}
    var keywords = bind {item?.keywordsProperty()}
    var notificationEmail = bind {item?.notificationEmailProperty()}
    var carrier = bind {item?.carrierProperty()}
    var phoneNumber = bind {item?.phoneNumberProperty()}
}