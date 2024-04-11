package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddDesignEntityTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_id")

    private String attrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public AddDesignEntityTagsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public AddDesignEntityTagsRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public AddDesignEntityTagsRequest withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * 表的ID。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public AddDesignEntityTagsRequest withAttrId(String attrId) {
        this.attrId = attrId;
        return this;
    }

    /**
     * 属性的ID。
     * @return attrId
     */
    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public AddDesignEntityTagsRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AddDesignEntityTagsRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AddDesignEntityTagsRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签名。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDesignEntityTagsRequest that = (AddDesignEntityTagsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.entityId, that.entityId) && Objects.equals(this.attrId, that.attrId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, entityId, attrId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDesignEntityTagsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
