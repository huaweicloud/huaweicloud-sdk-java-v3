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
public class ListAllOpsAgentTuningTaskTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagValuesForTMS> tags = null;

    public ListAllOpsAgentTuningTaskTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释：** 总记录数。 **取值范围：** 非负整数。
     * minimum: 0
     * maximum: 20
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListAllOpsAgentTuningTaskTagsResponse withTags(List<OpsTasksTagValuesForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public ListAllOpsAgentTuningTaskTagsResponse addTagsItem(OpsTasksTagValuesForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListAllOpsAgentTuningTaskTagsResponse withTags(Consumer<List<OpsTasksTagValuesForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签统计结果列表。 **取值范围：** 数组长度0-1000。
     * @return tags
     */
    public List<OpsTasksTagValuesForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagValuesForTMS> tags) {
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
        ListAllOpsAgentTuningTaskTagsResponse that = (ListAllOpsAgentTuningTaskTagsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllOpsAgentTuningTaskTagsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
