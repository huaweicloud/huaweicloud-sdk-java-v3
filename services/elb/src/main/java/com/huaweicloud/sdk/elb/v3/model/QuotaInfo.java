package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：配额信息，包括总配额和已使用配额。
 */
public class QuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    private String quotaKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_limit")

    private Integer quotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public QuotaInfo withQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * **参数解释**：配额类型。  **取值范围**： - loadbalancer：负载均衡器配额。 - listener：监听器配额。 - ipgroup：IP地址组配额。 - pool：后端服务器组配额。 - member：后端服务器配额。 - healthmonitor：健康检查配额。 - l7policy：转发策略配额。 - certificate：证书配额。 - security_policy：自定义安全策略配额。 - listeners_per_loadbalancer：单个LB实例下的监听器配额。 - listeners_per_pool：单个pool关联的监听器配额。 - members_per_pool：单个pool下的member的配额。 - condition_per_policy：单个转发策略下所有转发规则的condition总数配额。 - ipgroup_bindings：单个IP地址组可以关联的监听器数量配额。 - ipgroup_max_length：单个监听器下关联的所有IP地址组的ip列表中的IP总数不能超过ipgroup_max_length。 - ipgroups_per_listener：单个监听器下的IP地址组配额。 - pools_per_l7policy：单个转发策略下的后端服务器组配额。 - l7policies_per_listener：单个监听器下的转发策略配额。 - free_instance_members_per_pool：单个pool实例下的免费member配额。 - free_instance_listeners_per_loadbalancer：单个LB实例下的免费监听器配额。
     * @return quotaKey
     */
    public String getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
    }

    public QuotaInfo withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * **参数解释**：总配额。  **取值范围**： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public QuotaInfo withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**：已使用配额。  **取值范围**：大于等于0。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public QuotaInfo withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**：配额单位。  **取值范围**：count，表示个数。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaInfo that = (QuotaInfo) obj;
        return Objects.equals(this.quotaKey, that.quotaKey) && Objects.equals(this.quotaLimit, that.quotaLimit)
            && Objects.equals(this.used, that.used) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey, quotaLimit, used, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaInfo {\n");
        sb.append("    quotaKey: ").append(toIndentedString(quotaKey)).append("\n");
        sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
