package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MenuInfoRequestBody
 */
public class MenuInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu")

    private MenusMode menu;

    public MenuInfoRequestBody withMenu(MenusMode menu) {
        this.menu = menu;
        return this;
    }

    public MenuInfoRequestBody withMenu(Consumer<MenusMode> menuSetter) {
        if (this.menu == null) {
            this.menu = new MenusMode();
            menuSetter.accept(this.menu);
        }

        return this;
    }

    /**
     * Get menu
     * @return menu
     */
    public MenusMode getMenu() {
        return menu;
    }

    public void setMenu(MenusMode menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MenuInfoRequestBody that = (MenuInfoRequestBody) obj;
        return Objects.equals(this.menu, that.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MenuInfoRequestBody {\n");
        sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
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
