import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    Taschenrechner test = new Taschenrechner();

    @Test
    void int_Addition_Simple_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = -2;

        int result = test.int_Addition(zahl1,zahl2);

        assertThat(result,is(-5));
    }

    @Test
    void int_Addition_Simple_Negative_Test() {
        int zahl1 = -2;
        int zahl2 = -2;

        int result = test.int_Addition(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void int_Addition_MaxValue_Positive_Test() {
        int zahl1 = Integer.MAX_VALUE;
        int zahl2 = Integer.MAX_VALUE;

        int result = test.int_Addition(zahl1,zahl2);

        assertThat(result,is(-2));
    }

    @Test
    void float_Addition_Simple_Positive_Test() {
        float zahl1 = -3;
        float zahl2 = -2;

        float result = test.float_Addition(zahl1,zahl2);

        assertThat(result,is(-5.0F));
    }

    @Test
    void float_Addition_Simple_Negative_Test() {
        float zahl1 = -2;
        float zahl2 = -2;

        float result = test.float_Addition(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void float_Addition_MaxValue_Negative_Test() {
        float zahl1 = Float.MAX_VALUE;
        float zahl2 = Float.MAX_VALUE;

        float result = test.float_Addition(zahl1,zahl2);

        assertThat(result,is(not(-2))); // InfinityF ist richtiges Ergebnis
    }

    @Test
    void int_Subtraktion_Simple_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = -2;

        int result = test.int_Subtraktion(zahl1,zahl2);

        assertThat(result,is(-1));
    }

    @Test
    void int_Subtraktion_Simple_Negative_Test() {
        int zahl1 = -2;
        int zahl2 = -2;

        int result = test.int_Subtraktion(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void int_Subtraktion_MinValue_Positive_Test() {
        int zahl1 = Integer.MIN_VALUE;
        int zahl2 = Integer.MIN_VALUE;

        int result = test.int_Subtraktion(zahl1,zahl2);

        assertThat(result,is(0));
    }

    @Test
    void float_Subtraktion_Simple_Positive_Test() {
        float zahl1 = -3;
        float zahl2 = -2;

        float result = test.float_Subtraktion(zahl1,zahl2);

        assertThat(result,is(-1.0F));
    }

    @Test
    void float_Subtraktion_Simple_Negative_Test() {
        float zahl1 = -2;
        float zahl2 = -2;

        float result = test.float_Subtraktion(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void float_Subktraktion_MinValue_Negative_Test() {
        float zahl1 = Float.MIN_VALUE;
        float zahl2 = Float.MIN_VALUE;

        float result = test.float_Subtraktion(zahl1,zahl2);

        assertThat(result,is(not(-2))); // -InfinityF ist richtiges Ergebnis
    }

    @Test
    void int_Multiplikation_Simple_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = -2;

        int result = test.int_Multiplikation(zahl1,zahl2);

        assertThat(result,is(6));
    }

    @Test
    void int_Multiplikation_Simple_Zero_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = 0;

        int result = test.int_Multiplikation(zahl1,zahl2);

        assertThat(result,is(0));
    }

    @Test
    void int_Multiplikation_Simple_Negative_Test() {
        int zahl1 = -2;
        int zahl2 = -2;

        int result = test.int_Multiplikation(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void int_Multiplikation_MaxValue_Positive_Test() {
        int zahl1 = Integer.MAX_VALUE;
        int zahl2 = Integer.MAX_VALUE;

        int result = test.int_Multiplikation(zahl1,zahl2);

        assertThat(result,is(1));
    }

    @Test
    void float_Multiplikation_Simple_Positive_Test() {
        float zahl1 = -3;
        float zahl2 = -2;

        float result = test.float_Multiplikation(zahl1,zahl2);

        assertThat(result,is(6.0F));
    }

    @Test
    void float_Multiplikation_Simple_Zero_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = 0;

        float result = test.float_Multiplikation(zahl1,zahl2);

        assertThat(result,is(-0.0F));
    }

    @Test
    void float_Multiplikation_Simple_Negative_Test() {
        float zahl1 = -2;
        float zahl2 = -2;

        float result = test.float_Multiplikation(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void float_Multiplikation_MaxValue_Negative_Test() {
        float zahl1 = Float.MAX_VALUE;
        float zahl2 = Float.MAX_VALUE;

        float result = test.float_Multiplikation(zahl1,zahl2);

        assertThat(result,is(not(-2))); // InfinityF ist richtiges Ergebnis
    }

    @Test
    void int_Division_Simple_Positive_Test() {
        int zahl1 = -3;
        int zahl2 = -1;

        int result = test.int_Division(zahl1,zahl2);

        assertThat(result,is(3));
    }

    /* @Test(expected = java.lang.ArithmeticException.class)
    void int_Division_ArithmeticException_Negative_Test() {
        int zahl1 = -3;
        int zahl2 = 0;

        int result = test.int_Division(zahl1,zahl2);

        assertThat(result,is(0));
    } */ 

    @Test
    void int_Division_Simple_Negative_Test() {
        int zahl1 = -2;
        int zahl2 = -2;

        int result = test.int_Division(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void int_Division_MaxValue_Positive_Test() {
        int zahl1 = Integer.MAX_VALUE;
        int zahl2 = Integer.MAX_VALUE;

        int result = test.int_Division(zahl1,zahl2);

        assertThat(result,is(1));
    }

    @Test
    void float_Division_Simple_Positive_Test() {
        float zahl1 = -3;
        float zahl2 = -1;

        float result = test.float_Division(zahl1,zahl2);

        assertThat(result,is(3.0F));
    }

    @Test
    void float_Division_Simple_Zero_Negative_Test() {
        int zahl1 = -3;
        int zahl2 = 0;

        float result = test.float_Division(zahl1,zahl2);

        assertThat(result,is(not(-0.0F))); // -InfinityF richtiges Ergebnis
    }

    @Test
    void float_Division_Simple_Negative_Test() {
        float zahl1 = -2;
        float zahl2 = -2;

        float result = test.float_Division(zahl1,zahl2);

        assertThat(result,is(not(-5)));
    }

    @Test
    void float_Division_MaxValue_Positive_Test() {
        float zahl1 = Float.MAX_VALUE;
        float zahl2 = Float.MAX_VALUE;

        float result = test.float_Division(zahl1,zahl2);

        assertThat(result,is(1.0F));
    }


}