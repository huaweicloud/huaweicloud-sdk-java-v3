package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSupportKeyStringResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_key_str")

    private Boolean supportKeyStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_detail_version")

    private String instanceDetailVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowSupportKeyStringResponse withSupportKeyStr(Boolean supportKeyStr) {
        this.supportKeyStr = supportKeyStr;
        return this;
    }

    /**
     * 实例是否使用关键字自治限流功能。true：可用，false：不可用
     * @return supportKeyStr
     */
    public Boolean getSupportKeyStr() {
        return supportKeyStr;
    }

    public void setSupportKeyStr(Boolean supportKeyStr) {
        this.supportKeyStr = supportKeyStr;
    }

    public ShowSupportKeyStringResponse withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public ShowSupportKeyStringResponse withInstanceDetailVersion(String instanceDetailVersion) {
        this.instanceDetailVersion = instanceDetailVersion;
        return this;
    }

    /**
     * 实例详细版本号
     * @return instanceDetailVersion
     */
    public String getInstanceDetailVersion() {
        return instanceDetailVersion;
    }

    public void setInstanceDetailVersion(String instanceDetailVersion) {
        this.instanceDetailVersion = instanceDetailVersion;
    }

    public ShowSupportKeyStringResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 当support_key_str为False时展示errorMsg
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSupportKeyStringResponse that = (ShowSupportKeyStringResponse) obj;
        return Objects.equals(this.supportKeyStr, that.supportKeyStr)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceDetailVersion, that.instanceDetailVersion)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportKeyStr, instanceType, instanceDetailVersion, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSupportKeyStringResponse {\n");
        sb.append("    supportKeyStr: ").append(toIndentedString(supportKeyStr)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceDetailVersion: ").append(toIndentedString(instanceDetailVersion)).append("\n");
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
