package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：批量打资源标签请求体。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class V2BatchCreateTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<V2ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SystemTag> sysTags = null;

    public V2BatchCreateTagsRequestBody withTags(List<V2ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public V2BatchCreateTagsRequestBody addTagsItem(V2ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public V2BatchCreateTagsRequestBody withTags(Consumer<List<V2ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：批量新增请求体标签列表，每个元素为一个V2ResourceTag对象，包含key（标签键）和value（标签值）字段。 **约束限制**：最多20个标签。 **默认取值**：不涉及。 
     * @return tags
     */
    public List<V2ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<V2ResourceTag> tags) {
        this.tags = tags;
    }

    public V2BatchCreateTagsRequestBody withSysTags(List<SystemTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public V2BatchCreateTagsRequestBody addSysTagsItem(SystemTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public V2BatchCreateTagsRequestBody withSysTags(Consumer<List<SystemTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释**：系统标签列表，每个元素为一个SystemTag对象，包含key（系统标签键）和value（系统标签值）字段。 **约束限制**：不涉及。 
     * @return sysTags
     */
    public List<SystemTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SystemTag> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2BatchCreateTagsRequestBody that = (V2BatchCreateTagsRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2BatchCreateTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
