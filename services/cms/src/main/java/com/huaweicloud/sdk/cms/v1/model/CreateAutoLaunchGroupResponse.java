package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAutoLaunchGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_group_id")

    private String autoLaunchGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private Integer errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public CreateAutoLaunchGroupResponse withAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
        return this;
    }

    /**
     * 创建好的智能购买组
     * @return autoLaunchGroupId
     */
    public String getAutoLaunchGroupId() {
        return autoLaunchGroupId;
    }

    public void setAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
    }

    public CreateAutoLaunchGroupResponse withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码  请求失败时，响应体中必需包含错误 请求成功时，不在响应消息体中包含错误码
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public CreateAutoLaunchGroupResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述 请求失败时，响应体中必需包含错误 请求成功时，不在响应消息体中包含错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAutoLaunchGroupResponse createAutoLaunchGroupResponse = (CreateAutoLaunchGroupResponse) o;
        return Objects.equals(this.autoLaunchGroupId, createAutoLaunchGroupResponse.autoLaunchGroupId)
            && Objects.equals(this.errorCode, createAutoLaunchGroupResponse.errorCode)
            && Objects.equals(this.errorMsg, createAutoLaunchGroupResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLaunchGroupId, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAutoLaunchGroupResponse {\n");
        sb.append("    autoLaunchGroupId: ").append(toIndentedString(autoLaunchGroupId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
