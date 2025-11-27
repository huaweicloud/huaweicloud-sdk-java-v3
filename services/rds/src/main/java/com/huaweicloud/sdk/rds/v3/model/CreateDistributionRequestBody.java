package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分发服务器信息。
 */
public class CreateDistributionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributor_instance_id")

    private String distributorInstanceId;

    public CreateDistributionRequestBody withDistributorInstanceId(String distributorInstanceId) {
        this.distributorInstanceId = distributorInstanceId;
        return this;
    }

    /**
     * 配置为分发服务器的实例id。
     * @return distributorInstanceId
     */
    public String getDistributorInstanceId() {
        return distributorInstanceId;
    }

    public void setDistributorInstanceId(String distributorInstanceId) {
        this.distributorInstanceId = distributorInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDistributionRequestBody that = (CreateDistributionRequestBody) obj;
        return Objects.equals(this.distributorInstanceId, that.distributorInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distributorInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDistributionRequestBody {\n");
        sb.append("    distributorInstanceId: ").append(toIndentedString(distributorInstanceId)).append("\n");
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
