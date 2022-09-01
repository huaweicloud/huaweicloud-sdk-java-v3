package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询保护实例数据结构
 */
public class ShowProtectedInstanceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_server")

    @JacksonXmlProperty(localName = "source_server")

    private String sourceServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    @JacksonXmlProperty(localName = "target_server")

    private String targetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private MetadataParams metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    @JacksonXmlProperty(localName = "attachment")

    private List<ProtectedInstanceAttachment> attachment = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    @JacksonXmlProperty(localName = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_station")

    @JacksonXmlProperty(localName = "priority_station")

    private String priorityStation;

    public ShowProtectedInstanceParams withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 保护实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProtectedInstanceParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 保护实例的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProtectedInstanceParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 保护实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProtectedInstanceParams withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 保护实例的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowProtectedInstanceParams withSourceServer(String sourceServer) {
        this.sourceServer = sourceServer;
        return this;
    }

    /**
     * 生产站点云服务器ID。
     * @return sourceServer
     */
    public String getSourceServer() {
        return sourceServer;
    }

    public void setSourceServer(String sourceServer) {
        this.sourceServer = sourceServer;
    }

    public ShowProtectedInstanceParams withTargetServer(String targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    /**
     * 容灾站点云服务器ID。
     * @return targetServer
     */
    public String getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(String targetServer) {
        this.targetServer = targetServer;
    }

    public ShowProtectedInstanceParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ShowProtectedInstanceParams withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。默认格式为：\"yyyy-MM-dd HH:mm:ss.SSS\"，例：\"2019-04-01 12:00:00.000\"。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowProtectedInstanceParams withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。默认格式为：\"yyyy-MM-dd HH:mm:ss.SSS\"，例：\"2019-04-01 12:00:00.000\"。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowProtectedInstanceParams withMetadata(MetadataParams metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowProtectedInstanceParams withMetadata(Consumer<MetadataParams> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetadataParams();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetadataParams getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataParams metadata) {
        this.metadata = metadata;
    }

    public ShowProtectedInstanceParams withAttachment(List<ProtectedInstanceAttachment> attachment) {
        this.attachment = attachment;
        return this;
    }

    public ShowProtectedInstanceParams addAttachmentItem(ProtectedInstanceAttachment attachmentItem) {
        if (this.attachment == null) {
            this.attachment = new ArrayList<>();
        }
        this.attachment.add(attachmentItem);
        return this;
    }

    public ShowProtectedInstanceParams withAttachment(Consumer<List<ProtectedInstanceAttachment>> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new ArrayList<>();
        }
        attachmentSetter.accept(this.attachment);
        return this;
    }

    /**
     * 挂载的复制对列表。
     * @return attachment
     */
    public List<ProtectedInstanceAttachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<ProtectedInstanceAttachment> attachment) {
        this.attachment = attachment;
    }

    public ShowProtectedInstanceParams withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowProtectedInstanceParams addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowProtectedInstanceParams withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ShowProtectedInstanceParams withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 保护实例的同步进度。单位：百分比（%）。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ShowProtectedInstanceParams withPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
        return this;
    }

    /**
     * 标识保护实例所在保护组的当前生产站点可用区。source：表示当前生产站点可用区为保护组source_availability_zone的值。target：表示当前生产站点可用区为保护组的target_availability_zone的值。
     * @return priorityStation
     */
    public String getPriorityStation() {
        return priorityStation;
    }

    public void setPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProtectedInstanceParams showProtectedInstanceParams = (ShowProtectedInstanceParams) o;
        return Objects.equals(this.id, showProtectedInstanceParams.id)
            && Objects.equals(this.name, showProtectedInstanceParams.name)
            && Objects.equals(this.description, showProtectedInstanceParams.description)
            && Objects.equals(this.status, showProtectedInstanceParams.status)
            && Objects.equals(this.sourceServer, showProtectedInstanceParams.sourceServer)
            && Objects.equals(this.targetServer, showProtectedInstanceParams.targetServer)
            && Objects.equals(this.serverGroupId, showProtectedInstanceParams.serverGroupId)
            && Objects.equals(this.createdAt, showProtectedInstanceParams.createdAt)
            && Objects.equals(this.updatedAt, showProtectedInstanceParams.updatedAt)
            && Objects.equals(this.metadata, showProtectedInstanceParams.metadata)
            && Objects.equals(this.attachment, showProtectedInstanceParams.attachment)
            && Objects.equals(this.tags, showProtectedInstanceParams.tags)
            && Objects.equals(this.progress, showProtectedInstanceParams.progress)
            && Objects.equals(this.priorityStation, showProtectedInstanceParams.priorityStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            sourceServer,
            targetServer,
            serverGroupId,
            createdAt,
            updatedAt,
            metadata,
            attachment,
            tags,
            progress,
            priorityStation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectedInstanceParams {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sourceServer: ").append(toIndentedString(sourceServer)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    priorityStation: ").append(toIndentedString(priorityStation)).append("\n");
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
