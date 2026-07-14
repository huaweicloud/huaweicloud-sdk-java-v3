package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 启动业务容器设置信息。
 */
public class ServiceSecurityConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Long userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Long groupId;

    public ServiceSecurityConfig withUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 启动业务容器时设置的user_id，默认可为空。 **取值范围：** [1, 60000]。
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ServiceSecurityConfig withGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 启动业务容器时设置的group_id，默认可为空。 **取值范围：** [1, 60000]。
     * @return groupId
     */
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceSecurityConfig that = (ServiceSecurityConfig) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceSecurityConfig {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
