package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HyperinstanceGroupCreateRequest
 */
public class HyperinstanceGroupCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_id")

    private String hyperinstanceClusterId;

    public HyperinstanceGroupCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group名称。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HyperinstanceGroupCreateRequest withHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
        return this;
    }

    /**
     * **参数解释**：超节点集群ID。 **默认取值**：不涉及。
     * @return hyperinstanceClusterId
     */
    public String getHyperinstanceClusterId() {
        return hyperinstanceClusterId;
    }

    public void setHyperinstanceClusterId(String hyperinstanceClusterId) {
        this.hyperinstanceClusterId = hyperinstanceClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperinstanceGroupCreateRequest that = (HyperinstanceGroupCreateRequest) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.hyperinstanceClusterId, that.hyperinstanceClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hyperinstanceClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperinstanceGroupCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hyperinstanceClusterId: ").append(toIndentedString(hyperinstanceClusterId)).append("\n");
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
