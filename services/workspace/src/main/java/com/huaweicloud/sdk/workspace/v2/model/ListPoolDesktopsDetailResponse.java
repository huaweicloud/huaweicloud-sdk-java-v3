package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListPoolDesktopsDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_desktops")

    private List<PoolDesktopsDetailInfo> poolDesktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_demand_desktops_num")

    private Integer onDemandDesktopsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_desktops_num")

    private Integer periodDesktopsNum;

    public ListPoolDesktopsDetailResponse withPoolDesktops(List<PoolDesktopsDetailInfo> poolDesktops) {
        this.poolDesktops = poolDesktops;
        return this;
    }

    public ListPoolDesktopsDetailResponse addPoolDesktopsItem(PoolDesktopsDetailInfo poolDesktopsItem) {
        if (this.poolDesktops == null) {
            this.poolDesktops = new ArrayList<>();
        }
        this.poolDesktops.add(poolDesktopsItem);
        return this;
    }

    public ListPoolDesktopsDetailResponse withPoolDesktops(Consumer<List<PoolDesktopsDetailInfo>> poolDesktopsSetter) {
        if (this.poolDesktops == null) {
            this.poolDesktops = new ArrayList<>();
        }
        poolDesktopsSetter.accept(this.poolDesktops);
        return this;
    }

    /**
     * 池桌面详情
     * @return poolDesktops
     */
    public List<PoolDesktopsDetailInfo> getPoolDesktops() {
        return poolDesktops;
    }

    public void setPoolDesktops(List<PoolDesktopsDetailInfo> poolDesktops) {
        this.poolDesktops = poolDesktops;
    }

    public ListPoolDesktopsDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 桌面总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPoolDesktopsDetailResponse withOnDemandDesktopsNum(Integer onDemandDesktopsNum) {
        this.onDemandDesktopsNum = onDemandDesktopsNum;
        return this;
    }

    /**
     * 按需桌面总数。
     * @return onDemandDesktopsNum
     */
    public Integer getOnDemandDesktopsNum() {
        return onDemandDesktopsNum;
    }

    public void setOnDemandDesktopsNum(Integer onDemandDesktopsNum) {
        this.onDemandDesktopsNum = onDemandDesktopsNum;
    }

    public ListPoolDesktopsDetailResponse withPeriodDesktopsNum(Integer periodDesktopsNum) {
        this.periodDesktopsNum = periodDesktopsNum;
        return this;
    }

    /**
     * 包周期桌面总数。
     * @return periodDesktopsNum
     */
    public Integer getPeriodDesktopsNum() {
        return periodDesktopsNum;
    }

    public void setPeriodDesktopsNum(Integer periodDesktopsNum) {
        this.periodDesktopsNum = periodDesktopsNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPoolDesktopsDetailResponse that = (ListPoolDesktopsDetailResponse) obj;
        return Objects.equals(this.poolDesktops, that.poolDesktops) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.onDemandDesktopsNum, that.onDemandDesktopsNum)
            && Objects.equals(this.periodDesktopsNum, that.periodDesktopsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolDesktops, totalCount, onDemandDesktopsNum, periodDesktopsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolDesktopsDetailResponse {\n");
        sb.append("    poolDesktops: ").append(toIndentedString(poolDesktops)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    onDemandDesktopsNum: ").append(toIndentedString(onDemandDesktopsNum)).append("\n");
        sb.append("    periodDesktopsNum: ").append(toIndentedString(periodDesktopsNum)).append("\n");
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
