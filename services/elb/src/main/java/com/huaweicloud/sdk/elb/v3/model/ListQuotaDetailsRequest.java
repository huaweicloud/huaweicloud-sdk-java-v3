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
     * 资源类型。  取值： loadbalancer、listener、ipgroup、pool、member、members_per_pool、 healthmonitor、l7policy、certificate、security_policy、 ipgroup_bindings、ipgroup_max_length。  members_per_pool表示一个pool下最多可关联的member数量。  ipgroup_bindings表示一个ipgroup下最多可关联的listener数量。  ipgroup_max_length表示一个ipgroup下最多设置的ip地址数量。  支持多值查询，查询条件格式：quota_key=xxx&quota_key=xxx。
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
