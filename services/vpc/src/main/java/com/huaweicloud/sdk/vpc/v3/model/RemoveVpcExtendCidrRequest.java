package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class RemoveVpcExtendCidrRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RemoveVpcExtendCidrRequestBody body;

    public RemoveVpcExtendCidrRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** VPC资源ID
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RemoveVpcExtendCidrRequest withBody(RemoveVpcExtendCidrRequestBody body) {
        this.body = body;
        return this;
    }

    public RemoveVpcExtendCidrRequest withBody(Consumer<RemoveVpcExtendCidrRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RemoveVpcExtendCidrRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RemoveVpcExtendCidrRequestBody getBody() {
        return body;
    }

    public void setBody(RemoveVpcExtendCidrRequestBody body) {
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
        RemoveVpcExtendCidrRequest removeVpcExtendCidrRequest = (RemoveVpcExtendCidrRequest) o;
        return Objects.equals(this.vpcId, removeVpcExtendCidrRequest.vpcId)
            && Objects.equals(this.body, removeVpcExtendCidrRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveVpcExtendCidrRequest {\n");
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
