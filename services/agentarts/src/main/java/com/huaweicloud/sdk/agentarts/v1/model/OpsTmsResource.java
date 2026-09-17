package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** TMS资源实例信息，包含资源ID、详情、标签等。 **约束限制：** 不涉及。
 */
public class OpsTmsResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private Object resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<OpsTmsTag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public OpsTmsResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源的唯一标识符。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public OpsTmsResource withResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /**
     * **参数解释：** 资源详细信息对象。 **约束限制：** 不涉及。
     * @return resourceDetail
     */
    public Object getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public OpsTmsResource withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public OpsTmsResource addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpsTmsResource withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源绑定的自定义标签列表。数组元素为OpsTmsTag对象，包含key和value字段。 **约束限制：** 不涉及。
     * @return tags
     */
    public List<OpsTmsTag> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTag> tags) {
        this.tags = tags;
    }

    public OpsTmsResource withSysTags(List<OpsTmsTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public OpsTmsResource addSysTagsItem(OpsTmsTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public OpsTmsResource withSysTags(Consumer<List<OpsTmsTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释：** 资源绑定的系统标签列表。数组元素为OpsTmsTag对象，包含key和value字段。 **约束限制：** 不涉及。
     * @return sysTags
     */
    public List<OpsTmsTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<OpsTmsTag> sysTags) {
        this.sysTags = sysTags;
    }

    public OpsTmsResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTmsResource that = (OpsTmsResource) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceDetail, that.resourceDetail) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, sysTags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTmsResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
