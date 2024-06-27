package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MindmapObject
 */
public class MindmapObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_id")

    private String folderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_root_id")

    private String folderRootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_depth")

    private Integer maxDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap")

    private String mindmap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public MindmapObject withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MindmapObject withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public MindmapObject withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * 创建人工号
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public MindmapObject withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * 文件路径
     * @return folderId
     */
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public MindmapObject withFolderRootId(String folderRootId) {
        this.folderRootId = folderRootId;
        return this;
    }

    /**
     * 根目录id
     * @return folderRootId
     */
    public String getFolderRootId() {
        return folderRootId;
    }

    public void setFolderRootId(String folderRootId) {
        this.folderRootId = folderRootId;
    }

    public MindmapObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MindmapObject withMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
        return this;
    }

    /**
     * 脑图最大深度
     * @return maxDepth
     */
    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public MindmapObject withMindmap(String mindmap) {
        this.mindmap = mindmap;
        return this;
    }

    /**
     * 脑图JSON
     * @return mindmap
     */
    public String getMindmap() {
        return mindmap;
    }

    public void setMindmap(String mindmap) {
        this.mindmap = mindmap;
    }

    public MindmapObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 脑图名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MindmapObject withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MindmapObject withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MindmapObject that = (MindmapObject) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.creatorNum, that.creatorNum) && Objects.equals(this.folderId, that.folderId)
            && Objects.equals(this.folderRootId, that.folderRootId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.maxDepth, that.maxDepth) && Objects.equals(this.mindmap, that.mindmap)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            creatorName,
            creatorNum,
            folderId,
            folderRootId,
            id,
            maxDepth,
            mindmap,
            name,
            projectId,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MindmapObject {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    folderRootId: ").append(toIndentedString(folderRootId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxDepth: ").append(toIndentedString(maxDepth)).append("\n");
        sb.append("    mindmap: ").append(toIndentedString(mindmap)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
