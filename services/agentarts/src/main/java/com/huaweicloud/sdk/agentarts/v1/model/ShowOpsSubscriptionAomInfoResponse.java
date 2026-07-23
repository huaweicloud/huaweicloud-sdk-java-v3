package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOpsSubscriptionAomInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_id")

    private String promId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_name")

    private String promName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code_id")

    private String accessCodeId;

    public ShowOpsSubscriptionAomInfoResponse withPromId(String promId) {
        this.promId = promId;
        return this;
    }

    /**
     * 普罗实例id
     * @return promId
     */
    public String getPromId() {
        return promId;
    }

    public void setPromId(String promId) {
        this.promId = promId;
    }

    public ShowOpsSubscriptionAomInfoResponse withPromName(String promName) {
        this.promName = promName;
        return this;
    }

    /**
     * 普罗实例名称
     * @return promName
     */
    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public ShowOpsSubscriptionAomInfoResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /**
     * aom访问码
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public ShowOpsSubscriptionAomInfoResponse withAccessCodeId(String accessCodeId) {
        this.accessCodeId = accessCodeId;
        return this;
    }

    /**
     * aom访问码id
     * @return accessCodeId
     */
    public String getAccessCodeId() {
        return accessCodeId;
    }

    public void setAccessCodeId(String accessCodeId) {
        this.accessCodeId = accessCodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsSubscriptionAomInfoResponse that = (ShowOpsSubscriptionAomInfoResponse) obj;
        return Objects.equals(this.promId, that.promId) && Objects.equals(this.promName, that.promName)
            && Objects.equals(this.accessCode, that.accessCode) && Objects.equals(this.accessCodeId, that.accessCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promId, promName, accessCode, accessCodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSubscriptionAomInfoResponse {\n");
        sb.append("    promId: ").append(toIndentedString(promId)).append("\n");
        sb.append("    promName: ").append(toIndentedString(promName)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    accessCodeId: ").append(toIndentedString(accessCodeId)).append("\n");
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
