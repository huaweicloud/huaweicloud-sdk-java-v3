package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateApiGroupV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApiGroupBase body;

    public UpdateApiGroupV2Request withInstanceId(String instanceId) {
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

    public UpdateApiGroupV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 分组的编号
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateApiGroupV2Request withBody(ApiGroupBase body) {
        this.body = body;
        return this;
    }

    public UpdateApiGroupV2Request withBody(Consumer<ApiGroupBase> bodySetter) {
        if (this.body == null) {
            this.body = new ApiGroupBase();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ApiGroupBase getBody() {
        return body;
    }

    public void setBody(ApiGroupBase body) {
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
        UpdateApiGroupV2Request updateApiGroupV2Request = (UpdateApiGroupV2Request) o;
        return Objects.equals(this.instanceId, updateApiGroupV2Request.instanceId)
            && Objects.equals(this.groupId, updateApiGroupV2Request.groupId)
            && Objects.equals(this.body, updateApiGroupV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApiGroupV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
