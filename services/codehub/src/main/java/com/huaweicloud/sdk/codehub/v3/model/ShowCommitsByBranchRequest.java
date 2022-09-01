package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCommitsByBranchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    @JacksonXmlProperty(localName = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    @JacksonXmlProperty(localName = "ref_name")

    private String refName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    @JacksonXmlProperty(localName = "repository_name")

    private String repositoryName;

    public ShowCommitsByBranchRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 仓库组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowCommitsByBranchRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * 分页索引
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ShowCommitsByBranchRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页索引
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowCommitsByBranchRequest withRefName(String refName) {
        this.refName = refName;
        return this;
    }

    /**
     * 分支或标签名，支持SHA格式
     * @return refName
     */
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public ShowCommitsByBranchRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 仓库名
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCommitsByBranchRequest showCommitsByBranchRequest = (ShowCommitsByBranchRequest) o;
        return Objects.equals(this.groupName, showCommitsByBranchRequest.groupName)
            && Objects.equals(this.pageIndex, showCommitsByBranchRequest.pageIndex)
            && Objects.equals(this.pageSize, showCommitsByBranchRequest.pageSize)
            && Objects.equals(this.refName, showCommitsByBranchRequest.refName)
            && Objects.equals(this.repositoryName, showCommitsByBranchRequest.repositoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, pageIndex, pageSize, refName, repositoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommitsByBranchRequest {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
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
