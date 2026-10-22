package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetHyperinstanceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_count_limit")

    private String npuCountLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_count")

    private String npuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperinstance_cluster_id")

    private String hyperinstanceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    public GetHyperinstanceGroupResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：hyperinstance-group ID。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetHyperinstanceGroupResponse withName(String name) {
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

    public GetHyperinstanceGroupResponse withNpuCountLimit(String npuCountLimit) {
        this.npuCountLimit = npuCountLimit;
        return this;
    }

    /**
     * **参数解释**：npu数量限制。 **默认取值**：不涉及。
     * @return npuCountLimit
     */
    public String getNpuCountLimit() {
        return npuCountLimit;
    }

    public void setNpuCountLimit(String npuCountLimit) {
        this.npuCountLimit = npuCountLimit;
    }

    public GetHyperinstanceGroupResponse withNpuCount(String npuCount) {
        this.npuCount = npuCount;
        return this;
    }

    /**
     * **参数解释**：npu数量。 **默认取值**：不涉及。
     * @return npuCount
     */
    public String getNpuCount() {
        return npuCount;
    }

    public void setNpuCount(String npuCount) {
        this.npuCount = npuCount;
    }

    public GetHyperinstanceGroupResponse withHyperinstanceClusterId(String hyperinstanceClusterId) {
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

    public GetHyperinstanceGroupResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **默认取值**：不涉及。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public GetHyperinstanceGroupResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：更新时间。 **默认取值**：不涉及。
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetHyperinstanceGroupResponse that = (GetHyperinstanceGroupResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.npuCountLimit, that.npuCountLimit) && Objects.equals(this.npuCount, that.npuCount)
            && Objects.equals(this.hyperinstanceClusterId, that.hyperinstanceClusterId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, npuCountLimit, npuCount, hyperinstanceClusterId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHyperinstanceGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    npuCountLimit: ").append(toIndentedString(npuCountLimit)).append("\n");
        sb.append("    npuCount: ").append(toIndentedString(npuCount)).append("\n");
        sb.append("    hyperinstanceClusterId: ").append(toIndentedString(hyperinstanceClusterId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
