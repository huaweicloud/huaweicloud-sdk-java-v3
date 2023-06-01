package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteAutoLaunchGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_group_id")

    private String autoLaunchGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteAutoLaunchGroupReqV2 body;

    public DeleteAutoLaunchGroupRequest withAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
        return this;
    }

    /**
     * 智能购买组ID
     * @return autoLaunchGroupId
     */
    public String getAutoLaunchGroupId() {
        return autoLaunchGroupId;
    }

    public void setAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
    }

    public DeleteAutoLaunchGroupRequest withBody(DeleteAutoLaunchGroupReqV2 body) {
        this.body = body;
        return this;
    }

    public DeleteAutoLaunchGroupRequest withBody(Consumer<DeleteAutoLaunchGroupReqV2> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteAutoLaunchGroupReqV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteAutoLaunchGroupReqV2 getBody() {
        return body;
    }

    public void setBody(DeleteAutoLaunchGroupReqV2 body) {
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
        DeleteAutoLaunchGroupRequest deleteAutoLaunchGroupRequest = (DeleteAutoLaunchGroupRequest) o;
        return Objects.equals(this.autoLaunchGroupId, deleteAutoLaunchGroupRequest.autoLaunchGroupId)
            && Objects.equals(this.body, deleteAutoLaunchGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLaunchGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAutoLaunchGroupRequest {\n");
        sb.append("    autoLaunchGroupId: ").append(toIndentedString(autoLaunchGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
