package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：训练用户配额响应体。
 */
public class TrainingQuotaResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public TrainingQuotaResponse withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：配额的资源类型，当前支持：job-num，作业的个数配额。 **取值范围**：不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public TrainingQuotaResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**：配额个数。 **取值范围**：不涉及。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public TrainingQuotaResponse withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**：已使用的个数。 **取值范围**：不涉及。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrainingQuotaResponse that = (TrainingQuotaResponse) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrainingQuotaResponse {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
