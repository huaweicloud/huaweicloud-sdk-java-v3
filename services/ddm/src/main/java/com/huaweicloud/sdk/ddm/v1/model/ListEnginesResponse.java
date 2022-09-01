package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEnginesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engineGroups")

    @JacksonXmlProperty(localName = "engineGroups")

    private List<EngineGroupsInfo> engineGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListEnginesResponse withEngineGroups(List<EngineGroupsInfo> engineGroups) {
        this.engineGroups = engineGroups;
        return this;
    }

    public ListEnginesResponse addEngineGroupsItem(EngineGroupsInfo engineGroupsItem) {
        if (this.engineGroups == null) {
            this.engineGroups = new ArrayList<>();
        }
        this.engineGroups.add(engineGroupsItem);
        return this;
    }

    public ListEnginesResponse withEngineGroups(Consumer<List<EngineGroupsInfo>> engineGroupsSetter) {
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
    public List<EngineGroupsInfo> getEngineGroups() {
        return engineGroups;
    }

    public void setEngineGroups(List<EngineGroupsInfo> engineGroups) {
        this.engineGroups = engineGroups;
    }

    public ListEnginesResponse withOffset(Integer offset) {
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

    public ListEnginesResponse withLimit(Integer limit) {
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

    public ListEnginesResponse withTotal(Integer total) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnginesResponse listEnginesResponse = (ListEnginesResponse) o;
        return Objects.equals(this.engineGroups, listEnginesResponse.engineGroups)
            && Objects.equals(this.offset, listEnginesResponse.offset)
            && Objects.equals(this.limit, listEnginesResponse.limit)
            && Objects.equals(this.total, listEnginesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineGroups, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginesResponse {\n");
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
