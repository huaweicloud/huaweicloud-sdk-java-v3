package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchDeleteInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_failure")

    private Boolean allFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteBody body;

    public BatchDeleteInstancesRequest withAllFailure(Boolean allFailure) {
        this.allFailure = allFailure;
        return this;
    }

    /** 是否批量删除创建失败的缓存实例。取值如下： - true，表示删除租户所有创建失败的缓存实例，此时请求参数instances可为空； - false或者其他值，表示删除instances参数数组中指定的缓存实例。
     * 
     * @return allFailure */
    public Boolean getAllFailure() {
        return allFailure;
    }

    public void setAllFailure(Boolean allFailure) {
        this.allFailure = allFailure;
    }

    public BatchDeleteInstancesRequest withBody(BatchDeleteBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteInstancesRequest withBody(Consumer<BatchDeleteBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchDeleteBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteBody body) {
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
        BatchDeleteInstancesRequest batchDeleteInstancesRequest = (BatchDeleteInstancesRequest) o;
        return Objects.equals(this.allFailure, batchDeleteInstancesRequest.allFailure)
            && Objects.equals(this.body, batchDeleteInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allFailure, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstancesRequest {\n");
        sb.append("    allFailure: ").append(toIndentedString(allFailure)).append("\n");
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
