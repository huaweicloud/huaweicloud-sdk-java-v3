package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateResDatastructRequestBodyBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_attrs")

    private List<ItemAttrs> itemAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_attrs")

    private List<UserAttrs> userAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behaviors")

    private BehaviorsConfig behaviors;

    public UpdateResDatastructRequestBodyBody withItemAttrs(List<ItemAttrs> itemAttrs) {
        this.itemAttrs = itemAttrs;
        return this;
    }

    public UpdateResDatastructRequestBodyBody addItemAttrsItem(ItemAttrs itemAttrsItem) {
        if (this.itemAttrs == null) {
            this.itemAttrs = new ArrayList<>();
        }
        this.itemAttrs.add(itemAttrsItem);
        return this;
    }

    public UpdateResDatastructRequestBodyBody withItemAttrs(Consumer<List<ItemAttrs>> itemAttrsSetter) {
        if (this.itemAttrs == null) {
            this.itemAttrs = new ArrayList<>();
        }
        itemAttrsSetter.accept(this.itemAttrs);
        return this;
    }

    /**
     * 物品特征信息。
     * @return itemAttrs
     */
    public List<ItemAttrs> getItemAttrs() {
        return itemAttrs;
    }

    public void setItemAttrs(List<ItemAttrs> itemAttrs) {
        this.itemAttrs = itemAttrs;
    }

    public UpdateResDatastructRequestBodyBody withUserAttrs(List<UserAttrs> userAttrs) {
        this.userAttrs = userAttrs;
        return this;
    }

    public UpdateResDatastructRequestBodyBody addUserAttrsItem(UserAttrs userAttrsItem) {
        if (this.userAttrs == null) {
            this.userAttrs = new ArrayList<>();
        }
        this.userAttrs.add(userAttrsItem);
        return this;
    }

    public UpdateResDatastructRequestBodyBody withUserAttrs(Consumer<List<UserAttrs>> userAttrsSetter) {
        if (this.userAttrs == null) {
            this.userAttrs = new ArrayList<>();
        }
        userAttrsSetter.accept(this.userAttrs);
        return this;
    }

    /**
     * 用户特征信息。
     * @return userAttrs
     */
    public List<UserAttrs> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<UserAttrs> userAttrs) {
        this.userAttrs = userAttrs;
    }

    public UpdateResDatastructRequestBodyBody withBehaviors(BehaviorsConfig behaviors) {
        this.behaviors = behaviors;
        return this;
    }

    public UpdateResDatastructRequestBodyBody withBehaviors(Consumer<BehaviorsConfig> behaviorsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResDatastructRequestBodyBody that = (UpdateResDatastructRequestBodyBody) obj;
        return Objects.equals(this.itemAttrs, that.itemAttrs) && Objects.equals(this.userAttrs, that.userAttrs)
            && Objects.equals(this.behaviors, that.behaviors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemAttrs, userAttrs, behaviors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResDatastructRequestBodyBody {\n");
        sb.append("    itemAttrs: ").append(toIndentedString(itemAttrs)).append("\n");
        sb.append("    userAttrs: ").append(toIndentedString(userAttrs)).append("\n");
        sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
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
