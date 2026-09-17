package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListPipelinesPageTagList
 */
public class ListPipelinesPageTagList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_id")

    private String updaterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ListPipelinesPageTagList withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释**： 标签ID。 **取值范围**： 不涉及。 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public ListPipelinesPageTagList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 标签名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPipelinesPageTagList withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释**： 标签颜色。 **取值范围**： 不涉及。 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ListPipelinesPageTagList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListPipelinesPageTagList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListPipelinesPageTagList withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 创建人ID。 **取值范围**： 不涉及。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ListPipelinesPageTagList withUpdaterId(String updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
     * **参数解释**： 更新人ID。 **取值范围**： 不涉及。 
     * @return updaterId
     */
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public ListPipelinesPageTagList withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListPipelinesPageTagList withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间。 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
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
        ListPipelinesPageTagList that = (ListPipelinesPageTagList) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.color, that.color) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.updaterId, that.updaterId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, name, color, projectId, domainId, creatorId, updaterId, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesPageTagList {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
