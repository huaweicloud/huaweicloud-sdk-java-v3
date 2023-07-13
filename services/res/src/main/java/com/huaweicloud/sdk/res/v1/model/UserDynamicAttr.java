package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UserDynamicAttr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_interested_attrs")

    private Attribute userInterestedAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_interested_action_type")

    private Attribute userInterestedActionType;

    public UserDynamicAttr withUserInterestedAttrs(Attribute userInterestedAttrs) {
        this.userInterestedAttrs = userInterestedAttrs;
        return this;
    }

    public UserDynamicAttr withUserInterestedAttrs(Consumer<Attribute> userInterestedAttrsSetter) {
        if (this.userInterestedAttrs == null) {
            this.userInterestedAttrs = new Attribute();
            userInterestedAttrsSetter.accept(this.userInterestedAttrs);
        }

        return this;
    }

    /**
     * Get userInterestedAttrs
     * @return userInterestedAttrs
     */
    public Attribute getUserInterestedAttrs() {
        return userInterestedAttrs;
    }

    public void setUserInterestedAttrs(Attribute userInterestedAttrs) {
        this.userInterestedAttrs = userInterestedAttrs;
    }

    public UserDynamicAttr withUserInterestedActionType(Attribute userInterestedActionType) {
        this.userInterestedActionType = userInterestedActionType;
        return this;
    }

    public UserDynamicAttr withUserInterestedActionType(Consumer<Attribute> userInterestedActionTypeSetter) {
        if (this.userInterestedActionType == null) {
            this.userInterestedActionType = new Attribute();
            userInterestedActionTypeSetter.accept(this.userInterestedActionType);
        }

        return this;
    }

    /**
     * Get userInterestedActionType
     * @return userInterestedActionType
     */
    public Attribute getUserInterestedActionType() {
        return userInterestedActionType;
    }

    public void setUserInterestedActionType(Attribute userInterestedActionType) {
        this.userInterestedActionType = userInterestedActionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDynamicAttr that = (UserDynamicAttr) obj;
        return Objects.equals(this.userInterestedAttrs, that.userInterestedAttrs)
            && Objects.equals(this.userInterestedActionType, that.userInterestedActionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInterestedAttrs, userInterestedActionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDynamicAttr {\n");
        sb.append("    userInterestedAttrs: ").append(toIndentedString(userInterestedAttrs)).append("\n");
        sb.append("    userInterestedActionType: ").append(toIndentedString(userInterestedActionType)).append("\n");
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
