package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AddResourceGroupsResourcesBatchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResourcesReq body;

    public AddResourceGroupsResourcesBatchRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 当前资源所在分组信息，以rg开头，后跟22位由字母或数字组成的字符串
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AddResourceGroupsResourcesBatchRequest withBody(ResourcesReq body) {
        this.body = body;
        return this;
    }

    public AddResourceGroupsResourcesBatchRequest withBody(Consumer<ResourcesReq> bodySetter) {
        if (this.body == null) {
            this.body = new ResourcesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ResourcesReq getBody() {
        return body;
    }

    public void setBody(ResourcesReq body) {
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
        AddResourceGroupsResourcesBatchRequest addResourceGroupsResourcesBatchRequest =
            (AddResourceGroupsResourcesBatchRequest) o;
        return Objects.equals(this.groupId, addResourceGroupsResourcesBatchRequest.groupId)
            && Objects.equals(this.body, addResourceGroupsResourcesBatchRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddResourceGroupsResourcesBatchRequest {\n");
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
