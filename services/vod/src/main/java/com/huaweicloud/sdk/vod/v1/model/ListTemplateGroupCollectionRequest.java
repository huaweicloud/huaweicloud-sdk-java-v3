package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTemplateGroupCollectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_collection_id")

    private String groupCollectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTemplateGroupCollectionRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListTemplateGroupCollectionRequest withXSdkDate(String xSdkDate) {
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

    public ListTemplateGroupCollectionRequest withGroupCollectionId(String groupCollectionId) {
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

    public ListTemplateGroupCollectionRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。默认为0。指定group_collection_id时该参数无效。<br/> 
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTemplateGroupCollectionRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数。默认为10，范围[1,100]。指定group_collection_id时该参数无效。<br/> 
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateGroupCollectionRequest listTemplateGroupCollectionRequest = (ListTemplateGroupCollectionRequest) o;
        return Objects.equals(this.authorization, listTemplateGroupCollectionRequest.authorization)
            && Objects.equals(this.xSdkDate, listTemplateGroupCollectionRequest.xSdkDate)
            && Objects.equals(this.groupCollectionId, listTemplateGroupCollectionRequest.groupCollectionId)
            && Objects.equals(this.offset, listTemplateGroupCollectionRequest.offset)
            && Objects.equals(this.limit, listTemplateGroupCollectionRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, groupCollectionId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateGroupCollectionRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    groupCollectionId: ").append(toIndentedString(groupCollectionId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
