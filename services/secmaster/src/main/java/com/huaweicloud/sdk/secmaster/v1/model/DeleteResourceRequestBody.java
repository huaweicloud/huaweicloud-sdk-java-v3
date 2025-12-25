package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除资产请求body体
 */
public class DeleteResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_ids")

    private List<String> batchIds = null;

    public DeleteResourceRequestBody withBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
        return this;
    }

    public DeleteResourceRequestBody addBatchIdsItem(String batchIdsItem) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        this.batchIds.add(batchIdsItem);
        return this;
    }

    public DeleteResourceRequestBody withBatchIds(Consumer<List<String>> batchIdsSetter) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        batchIdsSetter.accept(this.batchIds);
        return this;
    }

    /**
     * 删除资产ID列表
     * @return batchIds
     */
    public List<String> getBatchIds() {
        return batchIds;
    }

    public void setBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteResourceRequestBody that = (DeleteResourceRequestBody) obj;
        return Objects.equals(this.batchIds, that.batchIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceRequestBody {\n");
        sb.append("    batchIds: ").append(toIndentedString(batchIds)).append("\n");
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
