package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddRelationsInfo
 */
public class AddRelationsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<RelationInfo> relations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_to_iterator")

    private Boolean addToIterator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    public AddRelationsInfo withRelations(List<RelationInfo> relations) {
        this.relations = relations;
        return this;
    }

    public AddRelationsInfo addRelationsItem(RelationInfo relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public AddRelationsInfo withRelations(Consumer<List<RelationInfo>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * Get relations
     * @return relations
     */
    public List<RelationInfo> getRelations() {
        return relations;
    }

    public void setRelations(List<RelationInfo> relations) {
        this.relations = relations;
    }

    public AddRelationsInfo withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型id
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public AddRelationsInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public AddRelationsInfo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 测试套id
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public AddRelationsInfo withAddToIterator(Boolean addToIterator) {
        this.addToIterator = addToIterator;
        return this;
    }

    /**
     * 是否将需求添加到迭代
     * @return addToIterator
     */
    public Boolean getAddToIterator() {
        return addToIterator;
    }

    public void setAddToIterator(Boolean addToIterator) {
        this.addToIterator = addToIterator;
    }

    public AddRelationsInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRelationsInfo that = (AddRelationsInfo) obj;
        return Objects.equals(this.relations, that.relations) && Objects.equals(this.trackerId, that.trackerId)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.addToIterator, that.addToIterator)
            && Objects.equals(this.projectUuid, that.projectUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relations, trackerId, versionUri, taskUri, addToIterator, projectUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRelationsInfo {\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    addToIterator: ").append(toIndentedString(addToIterator)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
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
