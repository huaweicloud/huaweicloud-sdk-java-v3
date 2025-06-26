package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ArtifactTag
 */
public class ArtifactTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Long repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_id")

    private Long artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_time")

    private OffsetDateTime pushTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_time")

    private OffsetDateTime pullTime;

    public ArtifactTag withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Tag ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtifactTag withRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 制品仓库ID
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ArtifactTag withArtifactId(Long artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * 制品版本ID
     * @return artifactId
     */
    public Long getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Long artifactId) {
        this.artifactId = artifactId;
    }

    public ArtifactTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * tag名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArtifactTag withPushTime(OffsetDateTime pushTime) {
        this.pushTime = pushTime;
        return this;
    }

    /**
     * tag的上传时间
     * @return pushTime
     */
    public OffsetDateTime getPushTime() {
        return pushTime;
    }

    public void setPushTime(OffsetDateTime pushTime) {
        this.pushTime = pushTime;
    }

    public ArtifactTag withPullTime(OffsetDateTime pullTime) {
        this.pullTime = pullTime;
        return this;
    }

    /**
     * tag的下载时间
     * @return pullTime
     */
    public OffsetDateTime getPullTime() {
        return pullTime;
    }

    public void setPullTime(OffsetDateTime pullTime) {
        this.pullTime = pullTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactTag that = (ArtifactTag) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.artifactId, that.artifactId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.pushTime, that.pushTime) && Objects.equals(this.pullTime, that.pullTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repositoryId, artifactId, name, pushTime, pullTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactTag {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
        sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
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
