package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListTemplateGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListTemplateGroupRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /** 使用AK/SK方式认证时必选，携带的鉴权信息。
     * 
     * @return authorization */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListTemplateGroupRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /** 使用AK/SK方式认证时必选，请求的发生时间。
     * 
     * @return xSdkDate */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListTemplateGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 模板组id
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListTemplateGroupRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 模板启用状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListTemplateGroupRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 分页编号。 默认为0，指定group_id时该参数无效。
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListTemplateGroupRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 每页记录数。 默认为10，范围[1,100]。指定group_id时该参数无效。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateGroupRequest listTemplateGroupRequest = (ListTemplateGroupRequest) o;
        return Objects.equals(this.authorization, listTemplateGroupRequest.authorization)
            && Objects.equals(this.xSdkDate, listTemplateGroupRequest.xSdkDate)
            && Objects.equals(this.groupId, listTemplateGroupRequest.groupId)
            && Objects.equals(this.status, listTemplateGroupRequest.status)
            && Objects.equals(this.page, listTemplateGroupRequest.page)
            && Objects.equals(this.size, listTemplateGroupRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, groupId, status, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateGroupRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
