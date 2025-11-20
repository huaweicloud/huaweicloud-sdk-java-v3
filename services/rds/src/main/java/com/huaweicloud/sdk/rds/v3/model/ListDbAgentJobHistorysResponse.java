package com.huaweicloud.sdk.rds.v3.model;

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
public class ListDbAgentJobHistorysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "historys")

    private List<ListDbAgentJobHistorysResult> historys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDbAgentJobHistorysResponse withHistorys(List<ListDbAgentJobHistorysResult> historys) {
        this.historys = historys;
        return this;
    }

    public ListDbAgentJobHistorysResponse addHistorysItem(ListDbAgentJobHistorysResult historysItem) {
        if (this.historys == null) {
            this.historys = new ArrayList<>();
        }
        this.historys.add(historysItem);
        return this;
    }

    public ListDbAgentJobHistorysResponse withHistorys(Consumer<List<ListDbAgentJobHistorysResult>> historysSetter) {
        if (this.historys == null) {
            this.historys = new ArrayList<>();
        }
        historysSetter.accept(this.historys);
        return this;
    }

    /**
     * 执行历史列表。
     * @return historys
     */
    public List<ListDbAgentJobHistorysResult> getHistorys() {
        return historys;
    }

    public void setHistorys(List<ListDbAgentJobHistorysResult> historys) {
        this.historys = historys;
    }

    public ListDbAgentJobHistorysResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 执行历史总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbAgentJobHistorysResponse that = (ListDbAgentJobHistorysResponse) obj;
        return Objects.equals(this.historys, that.historys) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historys, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbAgentJobHistorysResponse {\n");
        sb.append("    historys: ").append(toIndentedString(historys)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
