package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateProtectionGroupNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateProtectionGroupNameRequestBody body;

    public UpdateProtectionGroupNameRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /** 保护组ID。
     * 
     * @return serverGroupId */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public UpdateProtectionGroupNameRequest withBody(UpdateProtectionGroupNameRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateProtectionGroupNameRequest withBody(Consumer<UpdateProtectionGroupNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateProtectionGroupNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateProtectionGroupNameRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateProtectionGroupNameRequestBody body) {
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
        UpdateProtectionGroupNameRequest updateProtectionGroupNameRequest = (UpdateProtectionGroupNameRequest) o;
        return Objects.equals(this.serverGroupId, updateProtectionGroupNameRequest.serverGroupId)
            && Objects.equals(this.body, updateProtectionGroupNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectionGroupNameRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
