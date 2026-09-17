package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsEvaluationTaskTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<OpsTmsTag> sysTags = null;

    public ListOpsEvaluationTaskTagsResponse withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListOpsEvaluationTaskTagsResponse addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListOpsEvaluationTaskTagsResponse withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源绑定的自定义标签列表。
     * @return tags
     */
    public List<OpsTmsTag> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTag> tags) {
        this.tags = tags;
    }

    public ListOpsEvaluationTaskTagsResponse withSysTags(List<OpsTmsTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListOpsEvaluationTaskTagsResponse addSysTagsItem(OpsTmsTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListOpsEvaluationTaskTagsResponse withSysTags(Consumer<List<OpsTmsTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释：** 资源绑定的系统标签列表。
     * @return sysTags
     */
    public List<OpsTmsTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<OpsTmsTag> sysTags) {
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
        ListOpsEvaluationTaskTagsResponse that = (ListOpsEvaluationTaskTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTaskTagsResponse {\n");
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
