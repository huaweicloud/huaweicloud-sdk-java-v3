package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListConfigHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_num")

    private Integer historyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<HistoryInfo> histories = null;

    public ListConfigHistoriesResponse withHistoryNum(Integer historyNum) {
        this.historyNum = historyNum;
        return this;
    }

    /**
     * 实例参数修改记录个数
     * @return historyNum
     */
    public Integer getHistoryNum() {
        return historyNum;
    }

    public void setHistoryNum(Integer historyNum) {
        this.historyNum = historyNum;
    }

    public ListConfigHistoriesResponse withHistories(List<HistoryInfo> histories) {
        this.histories = histories;
        return this;
    }

    public ListConfigHistoriesResponse addHistoriesItem(HistoryInfo historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListConfigHistoriesResponse withHistories(Consumer<List<HistoryInfo>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 实力参数修改记录详情
     * @return histories
     */
    public List<HistoryInfo> getHistories() {
        return histories;
    }

    public void setHistories(List<HistoryInfo> histories) {
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
        ListConfigHistoriesResponse listConfigHistoriesResponse = (ListConfigHistoriesResponse) o;
        return Objects.equals(this.historyNum, listConfigHistoriesResponse.historyNum)
            && Objects.equals(this.histories, listConfigHistoriesResponse.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyNum, histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigHistoriesResponse {\n");
        sb.append("    historyNum: ").append(toIndentedString(historyNum)).append("\n");
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
