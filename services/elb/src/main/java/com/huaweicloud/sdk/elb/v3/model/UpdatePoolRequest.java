package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdatePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePoolRequestBody body;

    public UpdatePoolRequest withPoolId(String poolId) {
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

    public UpdatePoolRequest withBody(UpdatePoolRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePoolRequest withBody(Consumer<UpdatePoolRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePoolRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdatePoolRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePoolRequestBody body) {
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
        UpdatePoolRequest updatePoolRequest = (UpdatePoolRequest) o;
        return Objects.equals(this.poolId, updatePoolRequest.poolId)
            && Objects.equals(this.body, updatePoolRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolRequest {\n");
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
