package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ResetUserPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public ResetUserPasswordResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /** 操作是否成功。
     * 
     * @return success */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ResetUserPasswordResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** DDM实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResetUserPasswordResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** DDM账号名称
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetUserPasswordResponse resetUserPasswordResponse = (ResetUserPasswordResponse) o;
        return Objects.equals(this.success, resetUserPasswordResponse.success)
            && Objects.equals(this.instanceId, resetUserPasswordResponse.instanceId)
            && Objects.equals(this.userName, resetUserPasswordResponse.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, instanceId, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetUserPasswordResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
