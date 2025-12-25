package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceArtifactResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private String mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_media_type")

    private String manifestMediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_time")

    private String pullTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_time")

    private String pushTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ArtifactTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_overview")

    private Map<String, NativeReportSummary> scanOverview = null;

    public ShowInstanceArtifactResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 制品摘要
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ShowInstanceArtifactResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 制品ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowInstanceArtifactResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库ID
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowInstanceArtifactResponse withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 仓库名称
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ShowInstanceArtifactResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 制品类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowInstanceArtifactResponse withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ShowInstanceArtifactResponse withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 制品MIME类型
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public ShowInstanceArtifactResponse withManifestMediaType(String manifestMediaType) {
        this.manifestMediaType = manifestMediaType;
        return this;
    }

    /**
     * 制品元数据MIME类型
     * @return manifestMediaType
     */
    public String getManifestMediaType() {
        return manifestMediaType;
    }

    public void setManifestMediaType(String manifestMediaType) {
        this.manifestMediaType = manifestMediaType;
    }

    public ShowInstanceArtifactResponse withPullTime(String pullTime) {
        this.pullTime = pullTime;
        return this;
    }

    /**
     * 最近一次拉取时间
     * @return pullTime
     */
    public String getPullTime() {
        return pullTime;
    }

    public void setPullTime(String pullTime) {
        this.pullTime = pullTime;
    }

    public ShowInstanceArtifactResponse withPushTime(String pushTime) {
        this.pushTime = pushTime;
        return this;
    }

    /**
     * 最近一次上传时间
     * @return pushTime
     */
    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }

    public ShowInstanceArtifactResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 制品大小，单位：Byte
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowInstanceArtifactResponse withTags(List<ArtifactTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowInstanceArtifactResponse addTagsItem(ArtifactTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowInstanceArtifactResponse withTags(Consumer<List<ArtifactTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 制品版本的Tag列表
     * @return tags
     */
    public List<ArtifactTag> getTags() {
        return tags;
    }

    public void setTags(List<ArtifactTag> tags) {
        this.tags = tags;
    }

    public ShowInstanceArtifactResponse withScanOverview(Map<String, NativeReportSummary> scanOverview) {
        this.scanOverview = scanOverview;
        return this;
    }

    public ShowInstanceArtifactResponse putScanOverviewItem(String key, NativeReportSummary scanOverviewItem) {
        if (this.scanOverview == null) {
            this.scanOverview = new HashMap<>();
        }
        this.scanOverview.put(key, scanOverviewItem);
        return this;
    }

    public ShowInstanceArtifactResponse withScanOverview(
        Consumer<Map<String, NativeReportSummary>> scanOverviewSetter) {
        if (this.scanOverview == null) {
            this.scanOverview = new HashMap<>();
        }
        scanOverviewSetter.accept(this.scanOverview);
        return this;
    }

    /**
     * 制品扫描摘要,支持制品扫描报告类型为application/vnd.security.vulnerability.report; version=1.1的制品扫描摘要
     * @return scanOverview
     */
    public Map<String, NativeReportSummary> getScanOverview() {
        return scanOverview;
    }

    public void setScanOverview(Map<String, NativeReportSummary> scanOverview) {
        this.scanOverview = scanOverview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceArtifactResponse that = (ShowInstanceArtifactResponse) obj;
        return Objects.equals(this.digest, that.digest) && Objects.equals(this.id, that.id)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.repositoryName, that.repositoryName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.mediaType, that.mediaType)
            && Objects.equals(this.manifestMediaType, that.manifestMediaType)
            && Objects.equals(this.pullTime, that.pullTime) && Objects.equals(this.pushTime, that.pushTime)
            && Objects.equals(this.size, that.size) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.scanOverview, that.scanOverview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digest,
            id,
            repositoryId,
            repositoryName,
            type,
            namespaceId,
            mediaType,
            manifestMediaType,
            pullTime,
            pushTime,
            size,
            tags,
            scanOverview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceArtifactResponse {\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    manifestMediaType: ").append(toIndentedString(manifestMediaType)).append("\n");
        sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
        sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    scanOverview: ").append(toIndentedString(scanOverview)).append("\n");
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
