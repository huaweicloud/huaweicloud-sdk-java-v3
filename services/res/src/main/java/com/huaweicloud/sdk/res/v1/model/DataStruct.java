package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataStruct
 */
public class DataStruct {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behaviors")

    private BehaviorsConfig behaviors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_attrs")

    private List<ItemAttrs> itemAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_attrs")

    private List<UserAttrs> userAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_dynamic_attr")

    private UserDynamicAttr userDynamicAttr;

    public DataStruct withBehaviors(BehaviorsConfig behaviors) {
        this.behaviors = behaviors;
        return this;
    }

    public DataStruct withBehaviors(Consumer<BehaviorsConfig> behaviorsSetter) {
        if (this.behaviors == null) {
            this.behaviors = new BehaviorsConfig();
            behaviorsSetter.accept(this.behaviors);
        }

        return this;
    }

    /**
     * Get behaviors
     * @return behaviors
     */
    public BehaviorsConfig getBehaviors() {
        return behaviors;
    }

    public void setBehaviors(BehaviorsConfig behaviors) {
        this.behaviors = behaviors;
    }

    public DataStruct withItemAttrs(List<ItemAttrs> itemAttrs) {
        this.itemAttrs = itemAttrs;
        return this;
    }

    public DataStruct addItemAttrsItem(ItemAttrs itemAttrsItem) {
        if (this.itemAttrs == null) {
            this.itemAttrs = new ArrayList<>();
        }
        this.itemAttrs.add(itemAttrsItem);
        return this;
    }

    public DataStruct withItemAttrs(Consumer<List<ItemAttrs>> itemAttrsSetter) {
        if (this.itemAttrs == null) {
            this.itemAttrs = new ArrayList<>();
        }
        itemAttrsSetter.accept(this.itemAttrs);
        return this;
    }

    /**
     * 物品参数。
     * @return itemAttrs
     */
    public List<ItemAttrs> getItemAttrs() {
        return itemAttrs;
    }

    public void setItemAttrs(List<ItemAttrs> itemAttrs) {
        this.itemAttrs = itemAttrs;
    }

    public DataStruct withUserAttrs(List<UserAttrs> userAttrs) {
        this.userAttrs = userAttrs;
        return this;
    }

    public DataStruct addUserAttrsItem(UserAttrs userAttrsItem) {
        if (this.userAttrs == null) {
            this.userAttrs = new ArrayList<>();
        }
        this.userAttrs.add(userAttrsItem);
        return this;
    }

    public DataStruct withUserAttrs(Consumer<List<UserAttrs>> userAttrsSetter) {
        if (this.userAttrs == null) {
            this.userAttrs = new ArrayList<>();
        }
        userAttrsSetter.accept(this.userAttrs);
        return this;
    }

    /**
     * 用户参数。
     * @return userAttrs
     */
    public List<UserAttrs> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrs> userAttrs) {
        this.userAttrs = userAttrs;
    }

    public DataStruct withUserDynamicAttr(UserDynamicAttr userDynamicAttr) {
        this.userDynamicAttr = userDynamicAttr;
        return this;
    }

    public DataStruct withUserDynamicAttr(Consumer<UserDynamicAttr> userDynamicAttrSetter) {
        if (this.userDynamicAttr == null) {
            this.userDynamicAttr = new UserDynamicAttr();
            userDynamicAttrSetter.accept(this.userDynamicAttr);
        }

        return this;
    }

    /**
     * Get userDynamicAttr
     * @return userDynamicAttr
     */
    public UserDynamicAttr getUserDynamicAttr() {
        return userDynamicAttr;
    }

    public void setUserDynamicAttr(UserDynamicAttr userDynamicAttr) {
        this.userDynamicAttr = userDynamicAttr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataStruct dataStruct = (DataStruct) o;
        return Objects.equals(this.behaviors, dataStruct.behaviors)
            && Objects.equals(this.itemAttrs, dataStruct.itemAttrs)
            && Objects.equals(this.userAttrs, dataStruct.userAttrs)
            && Objects.equals(this.userDynamicAttr, dataStruct.userDynamicAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(behaviors, itemAttrs, userAttrs, userDynamicAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataStruct {\n");
        sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
        sb.append("    itemAttrs: ").append(toIndentedString(itemAttrs)).append("\n");
        sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
        sb.append("    userDynamicAttr: ").append(toIndentedString(userDynamicAttr)).append("\n");
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
