package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCloudConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCloudConnectionRequestBody body;

    public UpdateCloudConnectionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云连接实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateCloudConnectionRequest withBody(UpdateCloudConnectionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCloudConnectionRequest withBody(Consumer<UpdateCloudConnectionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCloudConnectionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCloudConnectionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCloudConnectionRequestBody body) {
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
        UpdateCloudConnectionRequest updateCloudConnectionRequest = (UpdateCloudConnectionRequest) o;
        return Objects.equals(this.id, updateCloudConnectionRequest.id)
            && Objects.equals(this.body, updateCloudConnectionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudConnectionRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
