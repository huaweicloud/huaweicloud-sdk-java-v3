package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchGetKvRequestBody
 */
public class BatchGetKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_get_kv_opers")
    @BsonProperty(value = "batch_get_kv_opers")

    private List<BatchGetKvOfTable> batchGetKvOpers = null;

    public BatchGetKvRequestBody withBatchGetKvOpers(List<BatchGetKvOfTable> batchGetKvOpers) {
        this.batchGetKvOpers = batchGetKvOpers;
        return this;
    }

    public BatchGetKvRequestBody addBatchGetKvOpersItem(BatchGetKvOfTable batchGetKvOpersItem) {
        if (this.batchGetKvOpers == null) {
            this.batchGetKvOpers = new ArrayList<>();
        }
        this.batchGetKvOpers.add(batchGetKvOpersItem);
        return this;
    }

    public BatchGetKvRequestBody withBatchGetKvOpers(Consumer<List<BatchGetKvOfTable>> batchGetKvOpersSetter) {
        if (this.batchGetKvOpers == null) {
            this.batchGetKvOpers = new ArrayList<>();
        }
        batchGetKvOpersSetter.accept(this.batchGetKvOpers);
        return this;
    }

    /**
     * 按照table分类组织的get操作。
     * @return batchGetKvOpers
     */
    public List<BatchGetKvOfTable> getBatchGetKvOpers() {
        return batchGetKvOpers;
    }

    public void setBatchGetKvOpers(List<BatchGetKvOfTable> batchGetKvOpers) {
        this.batchGetKvOpers = batchGetKvOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetKvRequestBody that = (BatchGetKvRequestBody) obj;
        return Objects.equals(this.batchGetKvOpers, that.batchGetKvOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchGetKvOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetKvRequestBody {\n");
        sb.append("    batchGetKvOpers: ").append(toIndentedString(batchGetKvOpers)).append("\n");
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
