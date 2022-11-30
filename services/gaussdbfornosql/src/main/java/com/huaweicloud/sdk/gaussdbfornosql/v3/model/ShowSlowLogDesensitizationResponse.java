package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSlowLogDesensitizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desensitization_status")

    private String desensitizationStatus;

    public ShowSlowLogDesensitizationResponse withDesensitizationStatus(String desensitizationStatus) {
        this.desensitizationStatus = desensitizationStatus;
        return this;
    }

    /**
     * 实例慢日志脱敏开启状态，取值：  - on 开启  - off 关闭
     * @return desensitizationStatus
     */
    public String getDesensitizationStatus() {
        return desensitizationStatus;
    }

    public void setDesensitizationStatus(String desensitizationStatus) {
        this.desensitizationStatus = desensitizationStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSlowLogDesensitizationResponse showSlowLogDesensitizationResponse = (ShowSlowLogDesensitizationResponse) o;
        return Objects.equals(this.desensitizationStatus, showSlowLogDesensitizationResponse.desensitizationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desensitizationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogDesensitizationResponse {\n");
        sb.append("    desensitizationStatus: ").append(toIndentedString(desensitizationStatus)).append("\n");
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
