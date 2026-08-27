package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量绑定供应商到模型组请求。
 */
public class BatchBindProvidersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_ids")

    private List<String> providerIds = null;

    public BatchBindProvidersReq withProviderIds(List<String> providerIds) {
        this.providerIds = providerIds;
        return this;
    }

    public BatchBindProvidersReq addProviderIdsItem(String providerIdsItem) {
        if (this.providerIds == null) {
            this.providerIds = new ArrayList<>();
        }
        this.providerIds.add(providerIdsItem);
        return this;
    }

    public BatchBindProvidersReq withProviderIds(Consumer<List<String>> providerIdsSetter) {
        if (this.providerIds == null) {
            this.providerIds = new ArrayList<>();
        }
        providerIdsSetter.accept(this.providerIds);
        return this;
    }

    /**
     * 供应商id列表。
     * @return providerIds
     */
    public List<String> getProviderIds() {
        return providerIds;
    }

    public void setProviderIds(List<String> providerIds) {
        this.providerIds = providerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBindProvidersReq that = (BatchBindProvidersReq) obj;
        return Objects.equals(this.providerIds, that.providerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBindProvidersReq {\n");
        sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
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
