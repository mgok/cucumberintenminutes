package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Diyelimki;
import io.cucumber.java.tr.Eğerki;
import io.cucumber.java.tr.Ozaman;
import org.junit.Assert;

import static org.junit.Assert.*;

public class StepDefinitions {
    private Integer int1;
    private Integer int2;
    private Integer result;

    @Given("We have the positive integers {int} and {int}")
    public void we_have_the_positive_integers_and(Integer int1, Integer int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    @When("I want to sum up these numbers")
    public void i_want_to_sum_up_these_numbers() {
        this.result = this.int1 + this.int2;
    }

    @Then("I should get the answer {int}")
    public void i_should_get_the_answer(Integer int1) {
        Assert.assertEquals(this.result,int1);
    }

    @Diyelimki("elimizde iki tam sayı olarak {int} ve {int} var")
    public void elimizde_iki_tam_sayı_olarak_ve_var(Integer int1, Integer int2) {
        we_have_the_positive_integers_and(int1,int2);
    }

    @Eğerki("bu sayıları toplamak istersem")
    public void bu_sayıları_toplamak_istersem() {
        i_want_to_sum_up_these_numbers();
    }

    @Ozaman("sonuç olarak {int} almalıyım")
    public void sonuç_olarak_almalıyım(Integer int1) {
        i_should_get_the_answer(int1);
    }


}
