package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产物发布请求体
 */
public class PublishArtifactsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_artifacts")

    private List<ArtifactsPublish> publishArtifacts = null;

    public PublishArtifactsBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public PublishArtifactsBody withPublishArtifacts(List<ArtifactsPublish> publishArtifacts) {
        this.publishArtifacts = publishArtifacts;
        return this;
    }

    public PublishArtifactsBody addPublishArtifactsItem(ArtifactsPublish publishArtifactsItem) {
        if (this.publishArtifacts == null) {
            this.publishArtifacts = new ArrayList<>();
        }
        this.publishArtifacts.add(publishArtifactsItem);
        return this;
    }

    public PublishArtifactsBody withPublishArtifacts(Consumer<List<ArtifactsPublish>> publishArtifactsSetter) {
        if (this.publishArtifacts == null) {
            this.publishArtifacts = new ArrayList<>();
        }
        publishArtifactsSetter.accept(this.publishArtifacts);
        return this;
    }

    /**
     * 产物发布请求列表
     * @return publishArtifacts
     */
    public List<ArtifactsPublish> getPublishArtifacts() {
        return publishArtifacts;
    }

    public void setPublishArtifacts(List<ArtifactsPublish> publishArtifacts) {
        this.publishArtifacts = publishArtifacts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishArtifactsBody that = (PublishArtifactsBody) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.publishArtifacts, that.publishArtifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, publishArtifacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishArtifactsBody {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    publishArtifacts: ").append(toIndentedString(publishArtifacts)).append("\n");
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
