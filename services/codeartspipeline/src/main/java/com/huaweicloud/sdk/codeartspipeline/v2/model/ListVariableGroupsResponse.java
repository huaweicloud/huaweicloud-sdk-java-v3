package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ListVariableGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_variable_groups")

    private List<ListVariableGroupsRespPipelineVariableGroups> pipelineVariableGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListVariableGroupsResponse withPipelineVariableGroups(
        List<ListVariableGroupsRespPipelineVariableGroups> pipelineVariableGroups) {
        this.pipelineVariableGroups = pipelineVariableGroups;
        return this;
    }

    public ListVariableGroupsResponse addPipelineVariableGroupsItem(
        ListVariableGroupsRespPipelineVariableGroups pipelineVariableGroupsItem) {
        if (this.pipelineVariableGroups == null) {
            this.pipelineVariableGroups = new ArrayList<>();
        }
        this.pipelineVariableGroups.add(pipelineVariableGroupsItem);
        return this;
    }

    public ListVariableGroupsResponse withPipelineVariableGroups(
        Consumer<List<ListVariableGroupsRespPipelineVariableGroups>> pipelineVariableGroupsSetter) {
        if (this.pipelineVariableGroups == null) {
            this.pipelineVariableGroups = new ArrayList<>();
        }
        pipelineVariableGroupsSetter.accept(this.pipelineVariableGroups);
        return this;
    }

    /**
     * 详情列表
     * @return pipelineVariableGroups
     */
    public List<ListVariableGroupsRespPipelineVariableGroups> getPipelineVariableGroups() {
        return pipelineVariableGroups;
    }

    public void setPipelineVariableGroups(List<ListVariableGroupsRespPipelineVariableGroups> pipelineVariableGroups) {
        this.pipelineVariableGroups = pipelineVariableGroups;
    }

    public ListVariableGroupsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVariableGroupsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单页条数·
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVariableGroupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总条目数量。 **取值范围**： 大于等于0。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVariableGroupsResponse that = (ListVariableGroupsResponse) obj;
        return Objects.equals(this.pipelineVariableGroups, that.pipelineVariableGroups)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineVariableGroups, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVariableGroupsResponse {\n");
        sb.append("    pipelineVariableGroups: ").append(toIndentedString(pipelineVariableGroups)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
