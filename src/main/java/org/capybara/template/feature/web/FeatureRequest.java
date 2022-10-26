package org.capybara.template.feature.web;

import javax.validation.constraints.NotEmpty;

public class FeatureRequest {

    @NotEmpty
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
