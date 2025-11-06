package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipelineBasicDto
 */
public class PipelineBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public PipelineBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 流水线id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PipelineBasicDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 流水线url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public PipelineBasicDto withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * 流水线关联sha值
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public PipelineBasicDto withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 流水线ref
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public PipelineBasicDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 流水线状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineBasicDto that = (PipelineBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.sha, that.sha) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, webUrl, sha, ref, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
