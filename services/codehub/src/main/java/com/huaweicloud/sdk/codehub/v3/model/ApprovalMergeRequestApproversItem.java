package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApprovalMergeRequestApproversItem
 */
public class ApprovalMergeRequestApproversItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Double id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    public ApprovalMergeRequestApproversItem withId(Double id) {
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

    public ApprovalMergeRequestApproversItem withName(String name) {
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

    public ApprovalMergeRequestApproversItem withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ApprovalMergeRequestApproversItem withState(String state) {
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

    public ApprovalMergeRequestApproversItem withUsername(String username) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApprovalMergeRequestApproversItem approvalMergeRequestApproversItem = (ApprovalMergeRequestApproversItem) o;
        return Objects.equals(this.id, approvalMergeRequestApproversItem.id)
            && Objects.equals(this.name, approvalMergeRequestApproversItem.name)
            && Objects.equals(this.nickName, approvalMergeRequestApproversItem.nickName)
            && Objects.equals(this.state, approvalMergeRequestApproversItem.state)
            && Objects.equals(this.username, approvalMergeRequestApproversItem.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickName, state, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalMergeRequestApproversItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
