package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 绑定计算集群请求体。
 */
public class CreateComputingClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_id")

    private String cceClusterId;

    public CreateComputingClusterReq withCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    /**
     * CCE集群ID。
     * @return cceClusterId
     */
    public String getCceClusterId() {
        return cceClusterId;
    }

    public void setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateComputingClusterReq that = (CreateComputingClusterReq) obj;
        return Objects.equals(this.cceClusterId, that.cceClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cceClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComputingClusterReq {\n");
        sb.append("    cceClusterId: ").append(toIndentedString(cceClusterId)).append("\n");
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
