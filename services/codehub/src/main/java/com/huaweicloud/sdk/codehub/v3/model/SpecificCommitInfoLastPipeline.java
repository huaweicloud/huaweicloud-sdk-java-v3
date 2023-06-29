package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流水线信息
 */
public class SpecificCommitInfoLastPipeline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    public SpecificCommitInfoLastPipeline withId(Integer id) {
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

    public SpecificCommitInfoLastPipeline withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * 提交对应的SHA id
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public SpecificCommitInfoLastPipeline withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 分支名
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public SpecificCommitInfoLastPipeline withStatus(String status) {
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

    public SpecificCommitInfoLastPipeline withWebUrl(String webUrl) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecificCommitInfoLastPipeline that = (SpecificCommitInfoLastPipeline) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.ref, that.ref) && Objects.equals(this.status, that.status)
            && Objects.equals(this.webUrl, that.webUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sha, ref, status, webUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecificCommitInfoLastPipeline {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
