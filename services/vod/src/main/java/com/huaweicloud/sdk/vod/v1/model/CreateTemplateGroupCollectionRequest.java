package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTemplateGroupCollectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TransTemplateGroupCollection body;

    public CreateTemplateGroupCollectionRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public CreateTemplateGroupCollectionRequest withBody(TransTemplateGroupCollection body) {
        this.body = body;
        return this;
    }

    public CreateTemplateGroupCollectionRequest withBody(Consumer<TransTemplateGroupCollection> bodySetter) {
        if (this.body == null) {
            this.body = new TransTemplateGroupCollection();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TransTemplateGroupCollection getBody() {
        return body;
    }

    public void setBody(TransTemplateGroupCollection body) {
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
        CreateTemplateGroupCollectionRequest createTemplateGroupCollectionRequest =
            (CreateTemplateGroupCollectionRequest) o;
        return Objects.equals(this.xSdkDate, createTemplateGroupCollectionRequest.xSdkDate)
            && Objects.equals(this.body, createTemplateGroupCollectionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateGroupCollectionRequest {\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
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
