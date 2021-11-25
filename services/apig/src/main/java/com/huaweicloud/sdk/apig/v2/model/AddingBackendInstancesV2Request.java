package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AddingBackendInstancesV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VpcMemberCreate body;

    public AddingBackendInstancesV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AddingBackendInstancesV2Request withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /** VPC通道的编号
     * 
     * @return vpcChannelId */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public AddingBackendInstancesV2Request withBody(VpcMemberCreate body) {
        this.body = body;
        return this;
    }

    public AddingBackendInstancesV2Request withBody(Consumer<VpcMemberCreate> bodySetter) {
        if (this.body == null) {
            this.body = new VpcMemberCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public VpcMemberCreate getBody() {
        return body;
    }

    public void setBody(VpcMemberCreate body) {
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
        AddingBackendInstancesV2Request addingBackendInstancesV2Request = (AddingBackendInstancesV2Request) o;
        return Objects.equals(this.instanceId, addingBackendInstancesV2Request.instanceId)
            && Objects.equals(this.vpcChannelId, addingBackendInstancesV2Request.vpcChannelId)
            && Objects.equals(this.body, addingBackendInstancesV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, vpcChannelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddingBackendInstancesV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
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
