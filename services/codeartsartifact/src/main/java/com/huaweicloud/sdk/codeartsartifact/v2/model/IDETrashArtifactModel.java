package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDETrashArtifactModel
 */
public class IDETrashArtifactModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    public IDETrashArtifactModel withId(String id) {
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

    public IDETrashArtifactModel withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 类型
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public IDETrashArtifactModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 当前仓库状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IDETrashArtifactModel withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 待还原的文件路径
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDETrashArtifactModel that = (IDETrashArtifactModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.format, that.format)
            && Objects.equals(this.status, that.status) && Objects.equals(this.uri, that.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, format, status, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDETrashArtifactModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
