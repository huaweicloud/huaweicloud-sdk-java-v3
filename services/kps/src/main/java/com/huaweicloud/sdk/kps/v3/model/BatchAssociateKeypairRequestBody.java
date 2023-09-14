package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchAssociateKeypairRequestBody
 */
public class BatchAssociateKeypairRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_keypairs")

    private List<AssociateKeypairRequestBody> batchKeypairs = null;

    public BatchAssociateKeypairRequestBody withBatchKeypairs(List<AssociateKeypairRequestBody> batchKeypairs) {
        this.batchKeypairs = batchKeypairs;
        return this;
    }

    public BatchAssociateKeypairRequestBody addBatchKeypairsItem(AssociateKeypairRequestBody batchKeypairsItem) {
        if (this.batchKeypairs == null) {
            this.batchKeypairs = new ArrayList<>();
        }
        this.batchKeypairs.add(batchKeypairsItem);
        return this;
    }

    public BatchAssociateKeypairRequestBody withBatchKeypairs(
        Consumer<List<AssociateKeypairRequestBody>> batchKeypairsSetter) {
        if (this.batchKeypairs == null) {
            this.batchKeypairs = new ArrayList<>();
        }
        batchKeypairsSetter.accept(this.batchKeypairs);
        return this;
    }

    /**
     * 最多可同时选择10个弹性云服务器绑定密钥对。  约束：只支持选择相同的密钥对，弹性云服务器处于“运行中”状态，并未绑定密钥对。
     * @return batchKeypairs
     */
    public List<AssociateKeypairRequestBody> getBatchKeypairs() {
        return batchKeypairs;
    }

    public void setBatchKeypairs(List<AssociateKeypairRequestBody> batchKeypairs) {
        this.batchKeypairs = batchKeypairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAssociateKeypairRequestBody that = (BatchAssociateKeypairRequestBody) obj;
        return Objects.equals(this.batchKeypairs, that.batchKeypairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchKeypairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateKeypairRequestBody {\n");
        sb.append("    batchKeypairs: ").append(toIndentedString(batchKeypairs)).append("\n");
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
