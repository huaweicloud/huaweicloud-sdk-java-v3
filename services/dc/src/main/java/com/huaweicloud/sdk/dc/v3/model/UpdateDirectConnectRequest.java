package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDirectConnectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_id")

    private String directConnectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDirectConnectRequestBody body;

    public UpdateDirectConnectRequest withDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
        return this;
    }

    /**
     * 物理专线连接ID。
     * @return directConnectId
     */
    public String getDirectConnectId() {
        return directConnectId;
    }

    public void setDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
    }

    public UpdateDirectConnectRequest withBody(UpdateDirectConnectRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDirectConnectRequest withBody(Consumer<UpdateDirectConnectRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDirectConnectRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDirectConnectRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDirectConnectRequestBody body) {
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
        UpdateDirectConnectRequest updateDirectConnectRequest = (UpdateDirectConnectRequest) o;
        return Objects.equals(this.directConnectId, updateDirectConnectRequest.directConnectId)
            && Objects.equals(this.body, updateDirectConnectRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDirectConnectRequest {\n");
        sb.append("    directConnectId: ").append(toIndentedString(directConnectId)).append("\n");
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
