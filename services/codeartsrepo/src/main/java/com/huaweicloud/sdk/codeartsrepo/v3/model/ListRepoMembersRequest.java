package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRepoMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    private String repositoryUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    public ListRepoMembersRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * 第几页
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ListRepoMembersRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示size
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListRepoMembersRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    /**
     * 仓库uuid(由CreateRepository接口返回)
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public ListRepoMembersRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 搜索关键字
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepoMembersRequest that = (ListRepoMembersRequest) obj;
        return Objects.equals(this.pageIndex, that.pageIndex) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.repositoryUuid, that.repositoryUuid) && Objects.equals(this.subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageIndex, pageSize, repositoryUuid, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepoMembersRequest {\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
