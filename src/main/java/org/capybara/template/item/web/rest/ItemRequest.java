package org.capybara.template.item.web.rest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static org.capybara.template.item.model.ItemModel.CONSTRAINT_NAME_MAX_SIZE;
import static org.capybara.template.item.model.ItemModel.CONSTRAINT_NAME_MIN_SIZE;

public class ItemRequest {

    //<editor-fold desc="Fields">

    private String name = null;

    //</editor-fold>

    //<editor-fold desc="Primitive accessors">

    @NotBlank
    @Size(min = CONSTRAINT_NAME_MIN_SIZE, max = CONSTRAINT_NAME_MAX_SIZE)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //</editor-fold>

    //<editor-fold desc="Object methods">

    @Override
    public String toString() {
        return String.format(
                "ItemRequest[name='%s']",
                getName());
    }

    //</editor-fold>

}
