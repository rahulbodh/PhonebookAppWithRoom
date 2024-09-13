package com.rahul.phonebookappwithroom.Repos

import androidx.lifecycle.LiveData
import com.rahul.phonebookappwithroom.db.ContactDao
import com.rahul.phonebookappwithroom.db.ContactEntity

class ContactRepository(private val contactDao: ContactDao) {
    val allContacts: LiveData<List<ContactEntity>> = contactDao.getAllContacts()

    suspend fun insert(contact: ContactEntity) {
        contactDao.insertContact(contact)
    }

    suspend fun deleteAll() {
        contactDao.deleteAllContacts()
    }
}

