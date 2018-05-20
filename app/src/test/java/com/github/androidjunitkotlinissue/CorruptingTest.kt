package com.github.androidjunitkotlinissue

import org.junit.Test

/**
 * @author Eryk Mariankowski <eryk.mariankowski></eryk.mariankowski>@247.codes> on 20.05.18.
 */
class CorruptingTest {

    @Test
    fun asd() {
        Thread.sleep(10000)
        throw RuntimeException()
    }

}
