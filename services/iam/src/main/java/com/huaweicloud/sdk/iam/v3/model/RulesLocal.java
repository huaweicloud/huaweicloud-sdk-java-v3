package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 联邦用户映射到IAM中的身份信息
 */
public class RulesLocal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private RulesLocalUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private RulesLocalGroup group;

    public RulesLocal withUser(RulesLocalUser user) {
        this.user = user;
        return this;
    }

    public RulesLocal withUser(Consumer<RulesLocalUser> userSetter) {
        if (this.user == null) {
            this.user = new RulesLocalUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public RulesLocalUser getUser() {
        return user;
    }

    public void setUser(RulesLocalUser user) {
        this.user = user;
    }

    public RulesLocal withGroup(RulesLocalGroup group) {
        this.group = group;
        return this;
    }

    public RulesLocal withGroup(Consumer<RulesLocalGroup> groupSetter) {
        if (this.group == null) {
            this.group = new RulesLocalGroup();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public RulesLocalGroup getGroup() {
        return group;
    }

    public void setGroup(RulesLocalGroup group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RulesLocal that = (RulesLocal) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesLocal {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
