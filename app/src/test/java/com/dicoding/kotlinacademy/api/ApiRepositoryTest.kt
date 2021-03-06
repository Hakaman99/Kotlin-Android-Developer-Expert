package com.dicoding.kotlinacademy.api

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by root on 3/1/18.
 */
class ApiRepositoryTest {
    @Test
    fun testDoRequest() {
        val apiRepository = mock(ApiRepository::class.java)
        val url = "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?l=English%20Premier%20League"
        apiRepository.doRequest(url)
        verify(apiRepository).doRequest(url)
    }
}