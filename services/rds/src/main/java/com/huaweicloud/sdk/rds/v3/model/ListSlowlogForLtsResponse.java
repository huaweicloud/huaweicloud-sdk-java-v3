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
public class ListSlowlogForLtsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<MysqlSlowLogDetailsItem> slowLogList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_query_time")

    private String longQueryTime;

    public ListSlowlogForLtsResponse withSlowLogList(List<MysqlSlowLogDetailsItem> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ListSlowlogForLtsResponse addSlowLogListItem(MysqlSlowLogDetailsItem slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListSlowlogForLtsResponse withSlowLogList(Consumer<List<MysqlSlowLogDetailsItem>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * 日志数据集合。
     * @return slowLogList
     */
    public List<MysqlSlowLogDetailsItem> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<MysqlSlowLogDetailsItem> slowLogList) {
        this.slowLogList = slowLogList;
    }

    public ListSlowlogForLtsResponse withLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
        return this;
    }

    /**
     * 当前慢日志阈值时间。
     * @return longQueryTime
     */
    public String getLongQueryTime() {
        return longQueryTime;
    }

    public void setLongQueryTime(String longQueryTime) {
        this.longQueryTime = longQueryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSlowlogForLtsResponse that = (ListSlowlogForLtsResponse) obj;
        return Objects.equals(this.slowLogList, that.slowLogList)
            && Objects.equals(this.longQueryTime, that.longQueryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogList, longQueryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowlogForLtsResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
        sb.append("    longQueryTime: ").append(toIndentedString(longQueryTime)).append("\n");
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
