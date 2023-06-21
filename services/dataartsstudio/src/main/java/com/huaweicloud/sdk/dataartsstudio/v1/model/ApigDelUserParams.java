package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取DataArtsStudio工作空间角色信息
 */
public class ApigDelUserParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private Object userIds;

    public ApigDelUserParams withUserIds(Object userIds) {
        this.userIds = userIds;
        return this;
    }

    /**
     * 用户组列表
     * @return userIds
     */
    public Object getUserIds() {
        return userIds;
    }

    public void setUserIds(Object userIds) {
        this.userIds = userIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApigDelUserParams apigDelUserParams = (ApigDelUserParams) o;
        return Objects.equals(this.userIds, apigDelUserParams.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigDelUserParams {\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
