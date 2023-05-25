package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTemplateGroupCollectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyTemplateGroupCollection body;

    public UpdateTemplateGroupCollectionRequest withXSdkDate(String xSdkDate) {
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

    public UpdateTemplateGroupCollectionRequest withBody(ModifyTemplateGroupCollection body) {
        this.body = body;
        return this;
    }

    public UpdateTemplateGroupCollectionRequest withBody(Consumer<ModifyTemplateGroupCollection> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyTemplateGroupCollection();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyTemplateGroupCollection getBody() {
        return body;
    }

    public void setBody(ModifyTemplateGroupCollection body) {
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
        UpdateTemplateGroupCollectionRequest updateTemplateGroupCollectionRequest =
            (UpdateTemplateGroupCollectionRequest) o;
        return Objects.equals(this.xSdkDate, updateTemplateGroupCollectionRequest.xSdkDate)
            && Objects.equals(this.body, updateTemplateGroupCollectionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplateGroupCollectionRequest {\n");
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
