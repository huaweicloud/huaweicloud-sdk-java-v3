package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListBasicAwInfoListSupportsSearchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private String pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private String pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SearchRequest body;

    public ListBasicAwInfoListSupportsSearchRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListBasicAwInfoListSupportsSearchRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public ListBasicAwInfoListSupportsSearchRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页多少记录
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public ListBasicAwInfoListSupportsSearchRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父目录ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ListBasicAwInfoListSupportsSearchRequest withBody(SearchRequest body) {
        this.body = body;
        return this;
    }

    public ListBasicAwInfoListSupportsSearchRequest withBody(Consumer<SearchRequest> bodySetter) {
        if (this.body == null) {
            this.body = new SearchRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SearchRequest getBody() {
        return body;
    }

    public void setBody(SearchRequest body) {
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
        ListBasicAwInfoListSupportsSearchRequest that = (ListBasicAwInfoListSupportsSearchRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, pageNo, pageSize, parentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBasicAwInfoListSupportsSearchRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
