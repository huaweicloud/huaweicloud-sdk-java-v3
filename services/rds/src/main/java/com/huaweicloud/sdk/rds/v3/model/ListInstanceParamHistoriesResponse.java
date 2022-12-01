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
public class ListInstanceParamHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<ParamGroupHistoryResult> histories = null;

    public ListInstanceParamHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 历史记录总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListInstanceParamHistoriesResponse withHistories(List<ParamGroupHistoryResult> histories) {
        this.histories = histories;
        return this;
    }

    public ListInstanceParamHistoriesResponse addHistoriesItem(ParamGroupHistoryResult historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListInstanceParamHistoriesResponse withHistories(Consumer<List<ParamGroupHistoryResult>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * host列表
     * @return histories
     */
    public List<ParamGroupHistoryResult> getHistories() {
        return histories;
    }

    public void setHistories(List<ParamGroupHistoryResult> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceParamHistoriesResponse listInstanceParamHistoriesResponse = (ListInstanceParamHistoriesResponse) o;
        return Objects.equals(this.totalCount, listInstanceParamHistoriesResponse.totalCount)
            && Objects.equals(this.histories, listInstanceParamHistoriesResponse.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceParamHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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
