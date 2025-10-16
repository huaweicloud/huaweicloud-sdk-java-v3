package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListDistributionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributor_instance_id")

    private String distributorInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributor_instance_name")

    private String distributorInstanceName;

    public ListDistributionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。normal，abnormal，creating，createfail
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDistributionResponse withDistributorInstanceId(String distributorInstanceId) {
        this.distributorInstanceId = distributorInstanceId;
        return this;
    }

    /**
     * 分发服务器实例id。
     * @return distributorInstanceId
     */
    public String getDistributorInstanceId() {
        return distributorInstanceId;
    }

    public void setDistributorInstanceId(String distributorInstanceId) {
        this.distributorInstanceId = distributorInstanceId;
    }

    public ListDistributionResponse withDistributorInstanceName(String distributorInstanceName) {
        this.distributorInstanceName = distributorInstanceName;
        return this;
    }

    /**
     * 分发服务器实例名称。
     * @return distributorInstanceName
     */
    public String getDistributorInstanceName() {
        return distributorInstanceName;
    }

    public void setDistributorInstanceName(String distributorInstanceName) {
        this.distributorInstanceName = distributorInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDistributionResponse that = (ListDistributionResponse) obj;
        return Objects.equals(this.status, that.status)
            && Objects.equals(this.distributorInstanceId, that.distributorInstanceId)
            && Objects.equals(this.distributorInstanceName, that.distributorInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, distributorInstanceId, distributorInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDistributionResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    distributorInstanceId: ").append(toIndentedString(distributorInstanceId)).append("\n");
        sb.append("    distributorInstanceName: ").append(toIndentedString(distributorInstanceName)).append("\n");
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
