package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestAssigneeListItem
 */
public class MergeRequestAssigneeListItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Double id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    public MergeRequestAssigneeListItem withId(Double id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public MergeRequestAssigneeListItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MergeRequestAssigneeListItem withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 用户状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MergeRequestAssigneeListItem withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户iamId
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestAssigneeListItem that = (MergeRequestAssigneeListItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, state, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestAssigneeListItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
