package money.pro.app.money.model.mapper

import money.pro.app.domain.common.Mapper
import money.pro.app.domain.entities.UserEntity
import money.pro.app.money.model.UserModel

class UserModelMapper : Mapper<UserEntity, UserModel>() {
    override fun mapFrom(from: UserEntity): UserModel {
        return UserModel(id = from.id)
    }
}