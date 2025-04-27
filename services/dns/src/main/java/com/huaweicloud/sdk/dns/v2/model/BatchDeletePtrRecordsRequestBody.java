package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeletePtrRecordsRequestBody
 */
public class BatchDeletePtrRecordsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingip_ids")

    private List<String> floatingipIds = null;

    public BatchDeletePtrRecordsRequestBody withFloatingipIds(List<String> floatingipIds) {
        this.floatingipIds = floatingipIds;
        return this;
    }

    public BatchDeletePtrRecordsRequestBody addFloatingipIdsItem(String floatingipIdsItem) {
        if (this.floatingipIds == null) {
            this.floatingipIds = new ArrayList<>();
        }
        this.floatingipIds.add(floatingipIdsItem);
        return this;
    }

    public BatchDeletePtrRecordsRequestBody withFloatingipIds(Consumer<List<String>> floatingipIdsSetter) {
        if (this.floatingipIds == null) {
            this.floatingipIds = new ArrayList<>();
        }
        floatingipIdsSetter.accept(this.floatingipIds);
        return this;
    }

    /**
     * 待删除反向解析记录ID列表。 最多支持50个。
     * @return floatingipIds
     */
    public List<String> getFloatingipIds() {
        return floatingipIds;
    }

    public void setFloatingipIds(List<String> floatingipIds) {
        this.floatingipIds = floatingipIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeletePtrRecordsRequestBody that = (BatchDeletePtrRecordsRequestBody) obj;
        return Objects.equals(this.floatingipIds, that.floatingipIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingipIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletePtrRecordsRequestBody {\n");
        sb.append("    floatingipIds: ").append(toIndentedString(floatingipIds)).append("\n");
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
