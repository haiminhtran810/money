package money.pro.app.data.model.mappers

import money.pro.app.data.model.UserData
import money.pro.app.domain.common.Mapper
import money.pro.app.domain.entities.UserEntity

class UserDataMapper : Mapper<UserData, UserEntity>() {
    override fun mapFrom(from: UserData): UserEntity {
        return UserEntity(id = from.id)
    }
}