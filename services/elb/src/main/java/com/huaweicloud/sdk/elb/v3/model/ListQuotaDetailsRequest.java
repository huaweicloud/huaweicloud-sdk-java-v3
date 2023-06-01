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
     * 资源类型。  取值： loadbalancer、listener、ipgroup、pool、member、healthmonitor、l7policy、certificate、security_policy、listeners_per_loadbalancer、listeners_per_pool、members_per_pool、condition_per_policy、ipgroup_bindings、ipgroup_bindings。  支持多值查询，查询条件格式：quota_key=xxx&quota_key=xxx。
     * @return quotaKey
     */
    public List<String> getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(List<String> quotaKey) {
        this.quotaKey = quotaKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotaDetailsRequest listQuotaDetailsRequest = (ListQuotaDetailsRequest) o;
        return Objects.equals(this.quotaKey, listQuotaDetailsRequest.quotaKey);
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
