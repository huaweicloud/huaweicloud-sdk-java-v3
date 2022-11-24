package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateMenuRequestBody
 */
public class UpdateMenuRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu")

    private Menus menu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_reason")

    private String changeReason;

    public UpdateMenuRequestBody withMenu(Menus menu) {
        this.menu = menu;
        return this;
    }

    public UpdateMenuRequestBody withMenu(Consumer<Menus> menuSetter) {
        if (this.menu == null) {
            this.menu = new Menus();
            menuSetter.accept(this.menu);
        }

        return this;
    }

    /**
     * Get menu
     * @return menu
     */
    public Menus getMenu() {
        return menu;
    }

    public void setMenu(Menus menu) {
        this.menu = menu;
    }

    public UpdateMenuRequestBody withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * 修改原因。
     * @return changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMenuRequestBody updateMenuRequestBody = (UpdateMenuRequestBody) o;
        return Objects.equals(this.menu, updateMenuRequestBody.menu)
            && Objects.equals(this.changeReason, updateMenuRequestBody.changeReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu, changeReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMenuRequestBody {\n");
        sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
