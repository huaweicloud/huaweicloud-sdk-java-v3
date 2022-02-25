package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchDeleteMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteMemberRequestBody body;

    public BatchDeleteMembersRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /** 后端服务器组ID。
     * 
     * @return poolId */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public BatchDeleteMembersRequest withBody(BatchDeleteMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteMembersRequest withBody(Consumer<BatchDeleteMemberRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteMemberRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchDeleteMemberRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteMemberRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteMembersRequest batchDeleteMembersRequest = (BatchDeleteMembersRequest) o;
        return Objects.equals(this.poolId, batchDeleteMembersRequest.poolId)
            && Objects.equals(this.body, batchDeleteMembersRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMembersRequest {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
