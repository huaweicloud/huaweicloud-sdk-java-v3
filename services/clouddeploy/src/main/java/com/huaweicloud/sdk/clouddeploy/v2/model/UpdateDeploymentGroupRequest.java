package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDeploymentGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeploymentGroupUpdateRequest body;

    public UpdateDeploymentGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 主机组ID
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateDeploymentGroupRequest withBody(DeploymentGroupUpdateRequest body) {
        this.body = body;
        return this;
    }

    public UpdateDeploymentGroupRequest withBody(Consumer<DeploymentGroupUpdateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new DeploymentGroupUpdateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DeploymentGroupUpdateRequest getBody() {
        return body;
    }

    public void setBody(DeploymentGroupUpdateRequest body) {
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
        UpdateDeploymentGroupRequest updateDeploymentGroupRequest = (UpdateDeploymentGroupRequest) o;
        return Objects.equals(this.groupId, updateDeploymentGroupRequest.groupId)
            && Objects.equals(this.body, updateDeploymentGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeploymentGroupRequest {\n");
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
