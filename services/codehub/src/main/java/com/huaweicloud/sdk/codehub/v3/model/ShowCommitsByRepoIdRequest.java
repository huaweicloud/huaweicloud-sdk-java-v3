package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCommitsByRepoIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_date")

    private String beginDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    private String refName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_format")

    private String statFormat;

    public ShowCommitsByRepoIdRequest withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 提交作者
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ShowCommitsByRepoIdRequest withBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * 起始提交日期，格式为yyyy-MM-dd
     * @return beginDate
     */
    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public ShowCommitsByRepoIdRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 终止提交日期，格式为yyyy-MM-dd
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ShowCommitsByRepoIdRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提交信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowCommitsByRepoIdRequest withPageIndex(Integer pageIndex) {
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

    public ShowCommitsByRepoIdRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数据量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowCommitsByRepoIdRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowCommitsByRepoIdRequest withRefName(String refName) {
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

    public ShowCommitsByRepoIdRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库主键id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowCommitsByRepoIdRequest withStatFormat(String statFormat) {
        this.statFormat = statFormat;
        return this;
    }

    /**
     * 提交的文件变更详情信息（不包含diff）
     * @return statFormat
     */
    public String getStatFormat() {
        return statFormat;
    }

    public void setStatFormat(String statFormat) {
        this.statFormat = statFormat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommitsByRepoIdRequest that = (ShowCommitsByRepoIdRequest) obj;
        return Objects.equals(this.author, that.author) && Objects.equals(this.beginDate, that.beginDate)
            && Objects.equals(this.endDate, that.endDate) && Objects.equals(this.message, that.message)
            && Objects.equals(this.pageIndex, that.pageIndex) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.path, that.path) && Objects.equals(this.refName, that.refName)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.statFormat, that.statFormat);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(author, beginDate, endDate, message, pageIndex, pageSize, path, refName, repositoryId, statFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommitsByRepoIdRequest {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    statFormat: ").append(toIndentedString(statFormat)).append("\n");
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
