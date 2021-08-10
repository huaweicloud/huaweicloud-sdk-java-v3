package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchCreateVpcTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateVpcTagsRequestBody body;

    public BatchCreateVpcTagsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 功能说明：虚拟私有云唯一标识 取值范围：合法UUID 约束：ID对应的VPC必须存在
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public BatchCreateVpcTagsRequest withBody(BatchCreateVpcTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateVpcTagsRequest withBody(Consumer<BatchCreateVpcTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateVpcTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchCreateVpcTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateVpcTagsRequestBody body) {
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
        BatchCreateVpcTagsRequest batchCreateVpcTagsRequest = (BatchCreateVpcTagsRequest) o;
        return Objects.equals(this.vpcId, batchCreateVpcTagsRequest.vpcId)
            && Objects.equals(this.body, batchCreateVpcTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVpcTagsRequest {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
