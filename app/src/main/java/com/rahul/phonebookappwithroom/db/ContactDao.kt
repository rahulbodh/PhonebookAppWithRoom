package com.rahul.phonebookappwithroom.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao {

    @Insert
    suspend fun insertContact(contactEntity: ContactEntity)

    @Query("SELECT * FROM contacts_table")
    suspend fun getAllContacts(): List<ContactEntity>

    @Delete
    suspend fun deleteContact(contactEntity: ContactEntity)

    @Query("DELETE FROM contacts_table")
    suspend fun deleteAllContacts()
}