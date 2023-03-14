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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private String groups;

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

    public RulesLocal withGroups(String groups) {
        this.groups = groups;
        return this;
    }

    public RulesLocal withGroups(Consumer<String> groupsSetter) {
        if (this.groups == null) {
            this.groups = new String();
            groupsSetter.accept(this.groups);
        }

        return this;
    }

    /**
     * Get groups
     * @return groups
     */
    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RulesLocal rulesLocal = (RulesLocal) o;
        return Objects.equals(this.user, rulesLocal.user) && Objects.equals(this.group, rulesLocal.group)
            && Objects.equals(this.groups, rulesLocal.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, group, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesLocal {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
