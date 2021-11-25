package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateSharedTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSharedTagRequestBody body;

    public CreateSharedTagRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /** 共享ID
     * 
     * @return shareId */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public CreateSharedTagRequest withBody(CreateSharedTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSharedTagRequest withBody(Consumer<CreateSharedTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSharedTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateSharedTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSharedTagRequestBody body) {
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
        CreateSharedTagRequest createSharedTagRequest = (CreateSharedTagRequest) o;
        return Objects.equals(this.shareId, createSharedTagRequest.shareId)
            && Objects.equals(this.body, createSharedTagRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSharedTagRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
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
