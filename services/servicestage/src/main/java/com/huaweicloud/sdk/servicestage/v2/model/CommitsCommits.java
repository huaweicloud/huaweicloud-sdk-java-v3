package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CommitsCommits */
public class CommitsCommits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authored_date")

    private String authoredDate;

    public CommitsCommits withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /** 提交记录sha值。
     * 
     * @return sha */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public CommitsCommits withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 提交记录描述。
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommitsCommits withAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    /** 合入时间。
     * 
     * @return authoredDate */
    public String getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitsCommits commitsCommits = (CommitsCommits) o;
        return Objects.equals(this.sha, commitsCommits.sha) && Objects.equals(this.message, commitsCommits.message)
            && Objects.equals(this.authoredDate, commitsCommits.authoredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, message, authoredDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitsCommits {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
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
