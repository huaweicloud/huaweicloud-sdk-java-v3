package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BuildHistory
 */
public class BuildHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty_layer")

    private Boolean emptyLayer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediaType")

    private String mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    public BuildHistory withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 构建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BuildHistory withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 构建命令
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public BuildHistory withEmptyLayer(Boolean emptyLayer) {
        this.emptyLayer = emptyLayer;
        return this;
    }

    /**
     * 是否空层
     * @return emptyLayer
     */
    public Boolean getEmptyLayer() {
        return emptyLayer;
    }

    public void setEmptyLayer(Boolean emptyLayer) {
        this.emptyLayer = emptyLayer;
    }

    public BuildHistory withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 镜像层格式
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public BuildHistory withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 镜像层大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public BuildHistory withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 镜像层sha256信息
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildHistory that = (BuildHistory) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.emptyLayer, that.emptyLayer) && Objects.equals(this.mediaType, that.mediaType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.digest, that.digest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, createdBy, emptyLayer, mediaType, size, digest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildHistory {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    emptyLayer: ").append(toIndentedString(emptyLayer)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
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
