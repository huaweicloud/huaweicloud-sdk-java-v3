package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddWorkloadQueueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    public AddWorkloadQueueResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * 响应编码。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public AddWorkloadQueueResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * 响应信息。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddWorkloadQueueResponse addWorkloadQueueResponse = (AddWorkloadQueueResponse) o;
        return Objects.equals(this.workloadResCode, addWorkloadQueueResponse.workloadResCode)
            && Objects.equals(this.workloadResStr, addWorkloadQueueResponse.workloadResStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddWorkloadQueueResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
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
