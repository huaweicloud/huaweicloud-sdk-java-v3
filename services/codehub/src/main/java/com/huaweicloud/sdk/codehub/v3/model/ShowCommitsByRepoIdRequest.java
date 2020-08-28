package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowCommitsByRepoIdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="author")
    
    private String author;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_date")
    
    private String beginDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_date")
    
    private String endDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_index")
    
    private Integer pageIndex = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private Integer pageSize = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ref_name")
    
    private String refName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_id")
    
    private Integer repositoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stat_format")
    
    private String statFormat;

    public ShowCommitsByRepoIdRequest withAuthor(String author) {
        this.author = author;
        return this;
    }

    


    /**
     * Get author
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
     * Get beginDate
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
     * Get endDate
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
     * Get message
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
     * Get pageIndex
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
     * Get pageSize
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
     * Get path
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
     * Get refName
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
     * Get repositoryId
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
     * Get statFormat
     * @return statFormat
     */
    public String getStatFormat() {
        return statFormat;
    }

    public void setStatFormat(String statFormat) {
        this.statFormat = statFormat;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCommitsByRepoIdRequest showCommitsByRepoIdRequest = (ShowCommitsByRepoIdRequest) o;
        return Objects.equals(this.author, showCommitsByRepoIdRequest.author) &&
            Objects.equals(this.beginDate, showCommitsByRepoIdRequest.beginDate) &&
            Objects.equals(this.endDate, showCommitsByRepoIdRequest.endDate) &&
            Objects.equals(this.message, showCommitsByRepoIdRequest.message) &&
            Objects.equals(this.pageIndex, showCommitsByRepoIdRequest.pageIndex) &&
            Objects.equals(this.pageSize, showCommitsByRepoIdRequest.pageSize) &&
            Objects.equals(this.path, showCommitsByRepoIdRequest.path) &&
            Objects.equals(this.refName, showCommitsByRepoIdRequest.refName) &&
            Objects.equals(this.repositoryId, showCommitsByRepoIdRequest.repositoryId) &&
            Objects.equals(this.statFormat, showCommitsByRepoIdRequest.statFormat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, beginDate, endDate, message, pageIndex, pageSize, path, refName, repositoryId, statFormat);
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

