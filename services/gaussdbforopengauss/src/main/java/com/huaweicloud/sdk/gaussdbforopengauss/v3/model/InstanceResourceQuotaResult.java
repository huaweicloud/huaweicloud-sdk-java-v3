package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceResourceQuotaResult
 */
public class InstanceResourceQuotaResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public InstanceResourceQuotaResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 资源类型 **取值范围**: instance：实例类型资源。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceResourceQuotaResult withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**: 资源的总配额 **取值范围**: 不涉及 
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public InstanceResourceQuotaResult withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**: 已使用的资源配额 **取值范围**: 不涉及 
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
        InstanceResourceQuotaResult that = (InstanceResourceQuotaResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceResourceQuotaResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
