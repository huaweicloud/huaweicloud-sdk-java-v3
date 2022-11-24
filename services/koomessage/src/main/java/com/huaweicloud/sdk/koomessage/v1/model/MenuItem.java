package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MenuItem
 */
public class MenuItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_msg")

    private ExtMsg extMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_menu_items")

    private List<MenuItem> subMenuItems = null;

    public MenuItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子菜单名称。  1. 一级菜单名长度和菜单数量有关，具体约束为：     - 当菜单数量为1个时，菜单名长度范围在1-24个字符。    - 当菜单数量为2个时，菜单名长度范围在1-12个字符。    - 当菜单数量为3个时，菜单名长度范围在1-8个字符。  2. 二级菜单名长度范围恒为1-16个字符。  > 以上字符区分中英文，一个中文占2个字符，字母和数字占1个字符，且同时生效的一组菜单内名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItem withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 菜单动作类型。 - OPEN_SUBMENU：打开子菜单 - OPEN_URL：打开URL - CALLING：拨打电话 - OPEN_APP：打开APP - OPEN_QUICK：打开快应用 
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public MenuItem withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 对应值类型。对应不同action_type值，content含义如下： - action_type=OPEN_SUBMENU：不填 - action_type=OPEN_URL：参数数值为跳转URL - action_type=CALLING：参数数值为电话号码 - action_type=OPEN_APP：参数数值为APP的跳转deeplink - action_type=OPEN_QUICK：参数数值为快应用跳转的deeplink 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MenuItem withExtMsg(ExtMsg extMsg) {
        this.extMsg = extMsg;
        return this;
    }

    public MenuItem withExtMsg(Consumer<ExtMsg> extMsgSetter) {
        if (this.extMsg == null) {
            this.extMsg = new ExtMsg();
            extMsgSetter.accept(this.extMsg);
        }

        return this;
    }

    /**
     * Get extMsg
     * @return extMsg
     */
    public ExtMsg getExtMsg() {
        return extMsg;
    }

    public void setExtMsg(ExtMsg extMsg) {
        this.extMsg = extMsg;
    }

    public MenuItem withSubMenuItems(List<MenuItem> subMenuItems) {
        this.subMenuItems = subMenuItems;
        return this;
    }

    public MenuItem addSubMenuItemsItem(MenuItem subMenuItemsItem) {
        if (this.subMenuItems == null) {
            this.subMenuItems = new ArrayList<>();
        }
        this.subMenuItems.add(subMenuItemsItem);
        return this;
    }

    public MenuItem withSubMenuItems(Consumer<List<MenuItem>> subMenuItemsSetter) {
        if (this.subMenuItems == null) {
            this.subMenuItems = new ArrayList<>();
        }
        subMenuItemsSetter.accept(this.subMenuItems);
        return this;
    }

    /**
     * 子菜单配置项。  > 仅当action_type=OPEN_SUBMENU时生效，且该项内不允许再配置子菜单。 
     * @return subMenuItems
     */
    public List<MenuItem> getSubMenuItems() {
        return subMenuItems;
    }

    public void setSubMenuItems(List<MenuItem> subMenuItems) {
        this.subMenuItems = subMenuItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(this.name, menuItem.name) && Objects.equals(this.actionType, menuItem.actionType)
            && Objects.equals(this.content, menuItem.content) && Objects.equals(this.extMsg, menuItem.extMsg)
            && Objects.equals(this.subMenuItems, menuItem.subMenuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actionType, content, extMsg, subMenuItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MenuItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    extMsg: ").append(toIndentedString(extMsg)).append("\n");
        sb.append("    subMenuItems: ").append(toIndentedString(subMenuItems)).append("\n");
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
