// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    //One Element in list
    "Median of [6.0] is correct" { 
        val list : List<Float> = listOf(6.0f)
        median(list) shouldBe (6.0f plusOrMinus tolerance)
    }
    //Two Elements in list
    "Median of [6.0,2.0] is correct" {
        val list : List<Float> = listOf(6.0f,2.0f)
        median(list) shouldBe (4.0f plusOrMinus tolerance)
    }
    //Three Elements in list
    "Median of [5.5,4.5,2.0] is correct" {
        val list : List<Float> = listOf(5.5f,4.5f,2.0f)
        median(list) shouldBe (4.5f plusOrMinus tolerance)
    }
    //Four Elements in list
    "Median of [6.0,5.5,4.5,2.0] is correct" {
        val list : List<Float> = listOf(6.0f,5.5f,4.5f,2.0f)
        median(list) shouldBe (5.0f plusOrMinus tolerance)
    }
})
