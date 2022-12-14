package com.zis.androidtestunittest.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.zis.androidtestunittest.data.vos.BurgerVO

@Dao
interface BurgerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBurgers(burgers : List<BurgerVO>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(burger : BurgerVO)

    @Query("SELECT * FROM burgers")
    fun getAllBurgers() : LiveData<List<BurgerVO>>

    @Query("SELECT * FROM burgers WHERE burger_id_pk = :id")
    fun findBurgerById(id : Int) : LiveData<BurgerVO>

    @Query("SELECT * FROM burgers WHERE burger_id_pk = :id")
    fun findBurgerByIdOneShot(id : Int) : BurgerVO

    @Query("DELETE FROM burgers")
    fun deleteAllBurgers()
}