package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListDdmEnginesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_groups")

    private List<EngineGroupInfo> engineGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListDdmEnginesResponse withEngineGroups(List<EngineGroupInfo> engineGroups) {
        this.engineGroups = engineGroups;
        return this;
    }

    public ListDdmEnginesResponse addEngineGroupsItem(EngineGroupInfo engineGroupsItem) {
        if (this.engineGroups == null) {
            this.engineGroups = new ArrayList<>();
        }
        this.engineGroups.add(engineGroupsItem);
        return this;
    }

    public ListDdmEnginesResponse withEngineGroups(Consumer<List<EngineGroupInfo>> engineGroupsSetter) {
        if (this.engineGroups == null) {
            this.engineGroups = new ArrayList<>();
        }
        engineGroupsSetter.accept(this.engineGroups);
        return this;
    }

    /**
     * 引擎信息列表。
     * @return engineGroups
     */
    public List<EngineGroupInfo> getEngineGroups() {
        return engineGroups;
    }

    public void setEngineGroups(List<EngineGroupInfo> engineGroups) {
        this.engineGroups = engineGroups;
    }

    public ListDdmEnginesResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数: 起始值。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDdmEnginesResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数：每页多少条。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDdmEnginesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 引擎信息总数。
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
        ListDdmEnginesResponse that = (ListDdmEnginesResponse) obj;
        return Objects.equals(this.engineGroups, that.engineGroups) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineGroups, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDdmEnginesResponse {\n");
        sb.append("    engineGroups: ").append(toIndentedString(engineGroups)).append("\n");
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
