package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像详情返回体
 */
public class ImageDetailRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip_type")

    private String chipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_id")

    private String sourceResourceId;

    public ImageDetailRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageDetailRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageDetailRsp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 镜像类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageDetailRsp withChipType(String chipType) {
        this.chipType = chipType;
        return this;
    }

    /**
     * 镜像芯片类型
     * @return chipType
     */
    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    public ImageDetailRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageDetailRsp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ImageDetailRsp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ImageDetailRsp withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像版本列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ImageDetailRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 镜像创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ImageDetailRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 镜像更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ImageDetailRsp withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源项目名称
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ImageDetailRsp withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ImageDetailRsp withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * 源资源id
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    public void setSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetailRsp imageDetailRsp = (ImageDetailRsp) o;
        return Objects.equals(this.name, imageDetailRsp.name) && Objects.equals(this.id, imageDetailRsp.id)
            && Objects.equals(this.type, imageDetailRsp.type) && Objects.equals(this.chipType, imageDetailRsp.chipType)
            && Objects.equals(this.description, imageDetailRsp.description)
            && Objects.equals(this.tags, imageDetailRsp.tags)
            && Objects.equals(this.createTime, imageDetailRsp.createTime)
            && Objects.equals(this.updateTime, imageDetailRsp.updateTime)
            && Objects.equals(this.sourceProjectName, imageDetailRsp.sourceProjectName)
            && Objects.equals(this.sourceProjectId, imageDetailRsp.sourceProjectId)
            && Objects.equals(this.sourceResourceId, imageDetailRsp.sourceResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            type,
            chipType,
            description,
            tags,
            createTime,
            updateTime,
            sourceProjectName,
            sourceProjectId,
            sourceResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetailRsp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    chipType: ").append(toIndentedString(chipType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceResourceId: ").append(toIndentedString(sourceResourceId)).append("\n");
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
