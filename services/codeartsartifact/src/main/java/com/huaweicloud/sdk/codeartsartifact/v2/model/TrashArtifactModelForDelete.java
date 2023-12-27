package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrashArtifactModelForDelete
 */
public class TrashArtifactModelForDelete {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fomat")

    private String fomat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_pattern")

    private String includePattern;

    public TrashArtifactModelForDelete withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 仓库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrashArtifactModelForDelete withFomat(String fomat) {
        this.fomat = fomat;
        return this;
    }

    /**
     * 仓库类型
     * @return fomat
     */
    public String getFomat() {
        return fomat;
    }

    public void setFomat(String fomat) {
        this.fomat = fomat;
    }

    public TrashArtifactModelForDelete withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TrashArtifactModelForDelete withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TrashArtifactModelForDelete withIncludePattern(String includePattern) {
        this.includePattern = includePattern;
        return this;
    }

    /**
     * 路径白名单
     * @return includePattern
     */
    public String getIncludePattern() {
        return includePattern;
    }

    public void setIncludePattern(String includePattern) {
        this.includePattern = includePattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrashArtifactModelForDelete that = (TrashArtifactModelForDelete) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fomat, that.fomat)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.status, that.status)
            && Objects.equals(this.includePattern, that.includePattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fomat, uri, status, includePattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrashArtifactModelForDelete {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fomat: ").append(toIndentedString(fomat)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    includePattern: ").append(toIndentedString(includePattern)).append("\n");
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
