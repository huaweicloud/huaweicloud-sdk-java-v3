package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTemplateGroupCollectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_collection_id")

    private String groupCollectionId;

    public DeleteTemplateGroupCollectionRequest withXSdkDate(String xSdkDate) {
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

    public DeleteTemplateGroupCollectionRequest withGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
        return this;
    }

    /**
     * 模板组集合id 
     * @return groupCollectionId
     */
    public String getGroupCollectionId() {
        return groupCollectionId;
    }

    public void setGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTemplateGroupCollectionRequest deleteTemplateGroupCollectionRequest =
            (DeleteTemplateGroupCollectionRequest) o;
        return Objects.equals(this.xSdkDate, deleteTemplateGroupCollectionRequest.xSdkDate)
            && Objects.equals(this.groupCollectionId, deleteTemplateGroupCollectionRequest.groupCollectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate, groupCollectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTemplateGroupCollectionRequest {\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    groupCollectionId: ").append(toIndentedString(groupCollectionId)).append("\n");
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
