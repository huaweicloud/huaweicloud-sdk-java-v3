package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSubAppRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_app_id")

    private String subAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SubAppUpdateParam body;

    public UpdateSubAppRequest withSubAppId(String subAppId) {
        this.subAppId = subAppId;
        return this;
    }

    /**
     * 子应用id
     * @return subAppId
     */
    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public UpdateSubAppRequest withBody(SubAppUpdateParam body) {
        this.body = body;
        return this;
    }

    public UpdateSubAppRequest withBody(Consumer<SubAppUpdateParam> bodySetter) {
        if (this.body == null) {
            this.body = new SubAppUpdateParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SubAppUpdateParam getBody() {
        return body;
    }

    public void setBody(SubAppUpdateParam body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSubAppRequest that = (UpdateSubAppRequest) obj;
        return Objects.equals(this.subAppId, that.subAppId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subAppId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubAppRequest {\n");
        sb.append("    subAppId: ").append(toIndentedString(subAppId)).append("\n");
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
