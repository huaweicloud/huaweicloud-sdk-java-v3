package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListQuotaDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    private List<String> quotaKey = null;

    public ListQuotaDetailsRequest withQuotaKey(List<String> quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    public ListQuotaDetailsRequest addQuotaKeyItem(String quotaKeyItem) {
        if (this.quotaKey == null) {
            this.quotaKey = new ArrayList<>();
        }
        this.quotaKey.add(quotaKeyItem);
        return this;
    }

    public ListQuotaDetailsRequest withQuotaKey(Consumer<List<String>> quotaKeySetter) {
        if (this.quotaKey == null) {
            this.quotaKey = new ArrayList<>();
        }
        quotaKeySetter.accept(this.quotaKey);
        return this;
    }

    /**
     * **参数解释**：配额类型。支持多值查询，查询条件格式：quota_key=xxx&quota_key=xxx。  **约束限制**：不涉及  **取值范围**： - loadbalancer：负载均衡器配额。 - listener：监听器配额。 - ipgroup：IP地址组配额。 - pool：后端服务器组配额。 - member：后端服务器配额。 - healthmonitor：健康检查配额。 - l7policy：转发策略配额。 - certificate：证书配额。 - security_policy：自定义安全策略配额。 - listeners_per_loadbalancer：单个LB实例下的监听器配额。 - listeners_per_pool：单个pool关联的监听器配额。 - members_per_pool：单个pool下的member的配额。 - condition_per_policy：单个转发策略下所有转发规则的condition总数配额。 - ipgroup_bindings：单个IP地址组可以关联的监听器数量配额。 - ipgroup_max_length：单个监听器下关联的所有IP地址组的ip列表中的IP总数不能超过ipgroup_max_length。 - ipgroups_per_listener：单个监听器下的IP地址组配额。 - pools_per_l7policy：单个转发策略下的后端服务器组配额。 - l7policies_per_listener：单个监听器下的转发策略配额。 - free_instance_members_per_pool：单个pool实例下的免费member配额。 - free_instance_listeners_per_loadbalancer：单个LB实例下的免费监听器配额。  **默认取值**：不涉及
     * @return quotaKey
     */
    public List<String> getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(List<String> quotaKey) {
        this.quotaKey = quotaKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotaDetailsRequest that = (ListQuotaDetailsRequest) obj;
        return Objects.equals(this.quotaKey, that.quotaKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaDetailsRequest {\n");
        sb.append("    quotaKey: ").append(toIndentedString(quotaKey)).append("\n");
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
