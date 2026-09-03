package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业资源信息及标签。
 */
public class ResourceInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private Object resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTagResp> tags = null;

    public ResourceInstance withResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /**
     * **参数解释**：资源详情，当前为空对象。 **取值范围**：不涉及。
     * @return resourceDetail
     */
    public Object getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ResourceInstance withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **取值范围**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ResourceInstance withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**：训练作业ID。 **取值范围**：不涉及。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceInstance withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**：训练作业名称。 **取值范围**：不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceInstance withTags(List<TmsTagResp> tags) {
        this.tags = tags;
        return this;
    }

    public ResourceInstance addTagsItem(TmsTagResp tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceInstance withTags(Consumer<List<TmsTagResp>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：该训练作业上的标签列表。无标签的作业返回空数组。 **取值范围**：不涉及。
     * @return tags
     */
    public List<TmsTagResp> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagResp> tags) {
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
        ResourceInstance that = (ResourceInstance) obj;
        return Objects.equals(this.resourceDetail, that.resourceDetail)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceDetail, workspaceId, resourceId, resourceName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstance {\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
