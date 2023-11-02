package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListScalingHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<ScalingHistory> histories = null;

    public ListScalingHistoryResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 伸缩历史总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListScalingHistoryResponse withHistories(List<ScalingHistory> histories) {
        this.histories = histories;
        return this;
    }

    public ListScalingHistoryResponse addHistoriesItem(ScalingHistory historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListScalingHistoryResponse withHistories(Consumer<List<ScalingHistory>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 伸缩历史列表
     * @return histories
     */
    public List<ScalingHistory> getHistories() {
        return histories;
    }

    public void setHistories(List<ScalingHistory> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScalingHistoryResponse that = (ListScalingHistoryResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.histories, that.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingHistoryResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
