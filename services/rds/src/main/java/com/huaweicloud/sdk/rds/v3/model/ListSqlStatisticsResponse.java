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
public class ListSqlStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_view_last_time")

    private Long resetViewLastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<Statistic> list = null;

    public ListSqlStatisticsResponse withResetViewLastTime(Long resetViewLastTime) {
        this.resetViewLastTime = resetViewLastTime;
        return this;
    }

    /**
     * 最新重置时间
     * @return resetViewLastTime
     */
    public Long getResetViewLastTime() {
        return resetViewLastTime;
    }

    public void setResetViewLastTime(Long resetViewLastTime) {
        this.resetViewLastTime = resetViewLastTime;
    }

    public ListSqlStatisticsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总的个数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListSqlStatisticsResponse withList(List<Statistic> list) {
        this.list = list;
        return this;
    }

    public ListSqlStatisticsResponse addListItem(Statistic listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListSqlStatisticsResponse withList(Consumer<List<Statistic>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 数据列表
     * @return list
     */
    public List<Statistic> getList() {
        return list;
    }

    public void setList(List<Statistic> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlStatisticsResponse that = (ListSqlStatisticsResponse) obj;
        return Objects.equals(this.resetViewLastTime, that.resetViewLastTime)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resetViewLastTime, totalCount, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlStatisticsResponse {\n");
        sb.append("    resetViewLastTime: ").append(toIndentedString(resetViewLastTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
