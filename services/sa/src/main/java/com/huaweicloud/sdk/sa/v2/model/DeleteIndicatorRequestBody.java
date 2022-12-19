package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * delete indicator request body
 */
public class DeleteIndicatorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_ids")

    private List<String> batchIds = null;

    public DeleteIndicatorRequestBody withBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
        return this;
    }

    public DeleteIndicatorRequestBody addBatchIdsItem(String batchIdsItem) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        this.batchIds.add(batchIdsItem);
        return this;
    }

    public DeleteIndicatorRequestBody withBatchIds(Consumer<List<String>> batchIdsSetter) {
        if (this.batchIds == null) {
            this.batchIds = new ArrayList<>();
        }
        batchIdsSetter.accept(this.batchIds);
        return this;
    }

    /**
     * id list
     * @return batchIds
     */
    public List<String> getBatchIds() {
        return batchIds;
    }

    public void setBatchIds(List<String> batchIds) {
        this.batchIds = batchIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteIndicatorRequestBody deleteIndicatorRequestBody = (DeleteIndicatorRequestBody) o;
        return Objects.equals(this.batchIds, deleteIndicatorRequestBody.batchIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIndicatorRequestBody {\n");
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
