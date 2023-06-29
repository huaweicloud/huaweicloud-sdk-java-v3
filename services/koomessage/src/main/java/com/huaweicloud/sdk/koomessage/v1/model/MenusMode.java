package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MenusMode
 */
public class MenusMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_items")

    private List<MenuItem> menuItems = null;

    public MenusMode withMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        return this;
    }

    public MenusMode addMenuItemsItem(MenuItem menuItemsItem) {
        if (this.menuItems == null) {
            this.menuItems = new ArrayList<>();
        }
        this.menuItems.add(menuItemsItem);
        return this;
    }

    public MenusMode withMenuItems(Consumer<List<MenuItem>> menuItemsSetter) {
        if (this.menuItems == null) {
            this.menuItems = new ArrayList<>();
        }
        menuItemsSetter.accept(this.menuItems);
        return this;
    }

    /**
     * 各子菜单项配置。 
     * @return menuItems
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MenusMode that = (MenusMode) obj;
        return Objects.equals(this.menuItems, that.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MenusMode {\n");
        sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
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
