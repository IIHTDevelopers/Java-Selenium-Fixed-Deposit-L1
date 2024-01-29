package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
        

        money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

        money_control_element.put("investment_amount_input", "");
        money_control_element.put("investment_period_input", "");
        money_control_element.put("rate_of_return_input", "");
        money_control_element.put("interest_frequency_radio", "");
        money_control_element.put("tax_rate_input", "");
        money_control_element.put("submit_button", "");
        money_control_element.put("reset_button", "");
        money_control_element.put("total_payment_span", "");
        money_control_element.put("total_interest_span", "");
        money_control_element.put("total_corpus_span", "");
        money_control_element.put("post_tax_amount_span", "");

        
    }
}
