package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListSessionWaitEventStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_info")

    private List<SessionWaitEventStatisticInfo> waitEventInfo = null;

    public ListSessionWaitEventStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 统计总条数。 **取值范围**: 不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSessionWaitEventStatisticsResponse withWaitEventInfo(List<SessionWaitEventStatisticInfo> waitEventInfo) {
        this.waitEventInfo = waitEventInfo;
        return this;
    }

    public ListSessionWaitEventStatisticsResponse addWaitEventInfoItem(
        SessionWaitEventStatisticInfo waitEventInfoItem) {
        if (this.waitEventInfo == null) {
            this.waitEventInfo = new ArrayList<>();
        }
        this.waitEventInfo.add(waitEventInfoItem);
        return this;
    }

    public ListSessionWaitEventStatisticsResponse withWaitEventInfo(
        Consumer<List<SessionWaitEventStatisticInfo>> waitEventInfoSetter) {
        if (this.waitEventInfo == null) {
            this.waitEventInfo = new ArrayList<>();
        }
        waitEventInfoSetter.accept(this.waitEventInfo);
        return this;
    }

    /**
     * **参数解释**: 统计数据。 
     * @return waitEventInfo
     */
    public List<SessionWaitEventStatisticInfo> getWaitEventInfo() {
        return waitEventInfo;
    }

    public void setWaitEventInfo(List<SessionWaitEventStatisticInfo> waitEventInfo) {
        this.waitEventInfo = waitEventInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionWaitEventStatisticsResponse that = (ListSessionWaitEventStatisticsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.waitEventInfo, that.waitEventInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, waitEventInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionWaitEventStatisticsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    waitEventInfo: ").append(toIndentedString(waitEventInfo)).append("\n");
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
