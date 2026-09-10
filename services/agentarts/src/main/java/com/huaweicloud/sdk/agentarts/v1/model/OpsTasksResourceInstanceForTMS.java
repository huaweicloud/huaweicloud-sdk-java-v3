package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpsTasksResourceInstanceForTMS
 */
public class OpsTasksResourceInstanceForTMS {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private Object resourceDetail;

    public OpsTasksResourceInstanceForTMS withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源实例ID。 **取值范围：** 无。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public OpsTasksResourceInstanceForTMS withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释：** 资源实例名称。 **取值范围：** 无。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public OpsTasksResourceInstanceForTMS withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public OpsTasksResourceInstanceForTMS addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpsTasksResourceInstanceForTMS withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表，没有标签默认为空数组。 **取值范围：** 数组长度为0-20。
     * @return tags
     */
    public List<OpsTasksTagForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
    }

    public OpsTasksResourceInstanceForTMS withResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /**
     * **参数解释：** 资源详情，资源对象用于扩展。默认为空。 **取值范围：** 不涉及。
     * @return resourceDetail
     */
    public Object getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTasksResourceInstanceForTMS that = (OpsTasksResourceInstanceForTMS) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.resourceDetail, that.resourceDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, tags, resourceDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTasksResourceInstanceForTMS {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
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
