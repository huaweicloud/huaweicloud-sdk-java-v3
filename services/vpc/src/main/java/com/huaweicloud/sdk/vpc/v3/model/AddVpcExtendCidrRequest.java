package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AddVpcExtendCidrRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddVpcExtendCidrRequestBody body;

    public AddVpcExtendCidrRequest withVpcId(String vpcId) {
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

    public AddVpcExtendCidrRequest withBody(AddVpcExtendCidrRequestBody body) {
        this.body = body;
        return this;
    }

    public AddVpcExtendCidrRequest withBody(Consumer<AddVpcExtendCidrRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddVpcExtendCidrRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AddVpcExtendCidrRequestBody getBody() {
        return body;
    }

    public void setBody(AddVpcExtendCidrRequestBody body) {
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
        AddVpcExtendCidrRequest addVpcExtendCidrRequest = (AddVpcExtendCidrRequest) o;
        return Objects.equals(this.vpcId, addVpcExtendCidrRequest.vpcId)
            && Objects.equals(this.body, addVpcExtendCidrRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVpcExtendCidrRequest {\n");
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
