package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FileUpdate
 */
public class FileUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    public FileUpdate withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提交描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FileUpdate withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 经base64编码的文件内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FileUpdate withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * 文件的sha值。
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileUpdate that = (FileUpdate) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.content, that.content)
            && Objects.equals(this.sha, that.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, content, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileUpdate {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
