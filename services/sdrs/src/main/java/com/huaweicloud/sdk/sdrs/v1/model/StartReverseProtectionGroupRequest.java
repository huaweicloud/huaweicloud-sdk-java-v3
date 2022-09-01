package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StartReverseProtectionGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ReverseProtectionGroupRequestBody body;

    public StartReverseProtectionGroupRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public StartReverseProtectionGroupRequest withBody(ReverseProtectionGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public StartReverseProtectionGroupRequest withBody(Consumer<ReverseProtectionGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ReverseProtectionGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ReverseProtectionGroupRequestBody getBody() {
        return body;
    }

    public void setBody(ReverseProtectionGroupRequestBody body) {
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
        StartReverseProtectionGroupRequest startReverseProtectionGroupRequest = (StartReverseProtectionGroupRequest) o;
        return Objects.equals(this.serverGroupId, startReverseProtectionGroupRequest.serverGroupId)
            && Objects.equals(this.body, startReverseProtectionGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartReverseProtectionGroupRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
