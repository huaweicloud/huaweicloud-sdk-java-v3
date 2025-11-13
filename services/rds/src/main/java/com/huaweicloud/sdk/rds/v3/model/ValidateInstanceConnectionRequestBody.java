package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户登录连接测试信息。
 */
public class ValidateInstanceConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private ValidateConnectionUserInfo userInfo;

    public ValidateInstanceConnectionRequestBody withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 连接目标实例id
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public ValidateInstanceConnectionRequestBody withUserInfo(ValidateConnectionUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public ValidateInstanceConnectionRequestBody withUserInfo(Consumer<ValidateConnectionUserInfo> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new ValidateConnectionUserInfo();
            userInfoSetter.accept(this.userInfo);
        }

        return this;
    }

    /**
     * Get userInfo
     * @return userInfo
     */
    public ValidateConnectionUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(ValidateConnectionUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateInstanceConnectionRequestBody that = (ValidateInstanceConnectionRequestBody) obj;
        return Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.userInfo, that.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetInstanceId, userInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateInstanceConnectionRequestBody {\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
