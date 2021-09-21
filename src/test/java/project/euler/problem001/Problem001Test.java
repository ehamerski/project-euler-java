package project.euler.problem001;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Problem001Test {

    @ParameterizedTest
    @ValueSource(longs = { 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 })
    void sumWithSuccess(long limit) {
        long s1 = Problem001.sum1(limit);
        long s2 = Problem001.sum2(limit);
        long s3 = Problem001.sum3(limit);
        assertTrue(s1 > 0 && s2 > 0 && s3 > 0 && s1 == s2 && s2 == s3);
    }

    @ParameterizedTest
    @ValueSource(longs = { 10000000000L })
    void sumWithFailure(long limit) {
        long s1 = Problem001.sum1(limit);
        long s2 = Problem001.sum2(limit);
        long s3 = Problem001.sum3(limit);
        assertFalse(s1 > 0 && s2 > 0 && s3 > 0 && s1 == s2 && s2 == s3);
    }

}
