package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 代码解释器请求体。
 */
public class UpdateCoreCodeInterpreterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreToolsObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreToolsTag> tags = null;

    public UpdateCoreCodeInterpreterRequestBody withObservability(CoreToolsObservability observability) {
        this.observability = observability;
        return this;
    }

    public UpdateCoreCodeInterpreterRequestBody withObservability(
        Consumer<CoreToolsObservability> observabilitySetter) {
        if (this.observability == null) {
            this.observability = new CoreToolsObservability();
            observabilitySetter.accept(this.observability);
        }

        return this;
    }

    /**
     * Get observability
     * @return observability
     */
    public CoreToolsObservability getObservability() {
        return observability;
    }

    public void setObservability(CoreToolsObservability observability) {
        this.observability = observability;
    }

    public UpdateCoreCodeInterpreterRequestBody withTags(List<CoreToolsTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreCodeInterpreterRequestBody addTagsItem(CoreToolsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreCodeInterpreterRequestBody withTags(Consumer<List<CoreToolsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签。 **约束范围：** 不涉及。 **取值范围：** 最多20个，且键值不能重复。 **默认取值：** 不涉及。
     * @return tags
     */
    public List<CoreToolsTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreToolsTag> tags) {
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
        UpdateCoreCodeInterpreterRequestBody that = (UpdateCoreCodeInterpreterRequestBody) obj;
        return Objects.equals(this.observability, that.observability) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(observability, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreCodeInterpreterRequestBody {\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
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
