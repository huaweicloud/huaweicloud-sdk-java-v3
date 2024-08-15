package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规规则最新修正记录查询条件。
 */
public class RemediationExecutionStatusesSummaryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_keys")

    private List<RemediationResourceKey> resourceKeys = null;

    public RemediationExecutionStatusesSummaryRequestBody withResourceKeys(List<RemediationResourceKey> resourceKeys) {
        this.resourceKeys = resourceKeys;
        return this;
    }

    public RemediationExecutionStatusesSummaryRequestBody addResourceKeysItem(RemediationResourceKey resourceKeysItem) {
        if (this.resourceKeys == null) {
            this.resourceKeys = new ArrayList<>();
        }
        this.resourceKeys.add(resourceKeysItem);
        return this;
    }

    public RemediationExecutionStatusesSummaryRequestBody withResourceKeys(
        Consumer<List<RemediationResourceKey>> resourceKeysSetter) {
        if (this.resourceKeys == null) {
            this.resourceKeys = new ArrayList<>();
        }
        resourceKeysSetter.accept(this.resourceKeys);
        return this;
    }

    /**
     * 合规规则最新修正记录查询条件列表。
     * @return resourceKeys
     */
    public List<RemediationResourceKey> getResourceKeys() {
        return resourceKeys;
    }

    public void setResourceKeys(List<RemediationResourceKey> resourceKeys) {
        this.resourceKeys = resourceKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemediationExecutionStatusesSummaryRequestBody that = (RemediationExecutionStatusesSummaryRequestBody) obj;
        return Objects.equals(this.resourceKeys, that.resourceKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemediationExecutionStatusesSummaryRequestBody {\n");
        sb.append("    resourceKeys: ").append(toIndentedString(resourceKeys)).append("\n");
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
