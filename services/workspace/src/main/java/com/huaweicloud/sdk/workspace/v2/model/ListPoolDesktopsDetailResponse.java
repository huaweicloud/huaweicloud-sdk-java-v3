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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_demand_free_image_desktops_num")

    private Integer onDemandFreeImageDesktopsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_demand_charge_image_desktops_num")

    private Integer onDemandChargeImageDesktopsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_free_image_desktops_num")

    private Integer periodFreeImageDesktopsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_charge_image_desktops_num")

    private Integer periodChargeImageDesktopsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inconsistent_type")

    private InconsistentTypeEnum inconsistentType;

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
     * 池桌面详情。
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

    public ListPoolDesktopsDetailResponse withOnDemandFreeImageDesktopsNum(Integer onDemandFreeImageDesktopsNum) {
        this.onDemandFreeImageDesktopsNum = onDemandFreeImageDesktopsNum;
        return this;
    }

    /**
     * 按需免费镜像桌面总数。
     * @return onDemandFreeImageDesktopsNum
     */
    public Integer getOnDemandFreeImageDesktopsNum() {
        return onDemandFreeImageDesktopsNum;
    }

    public void setOnDemandFreeImageDesktopsNum(Integer onDemandFreeImageDesktopsNum) {
        this.onDemandFreeImageDesktopsNum = onDemandFreeImageDesktopsNum;
    }

    public ListPoolDesktopsDetailResponse withOnDemandChargeImageDesktopsNum(Integer onDemandChargeImageDesktopsNum) {
        this.onDemandChargeImageDesktopsNum = onDemandChargeImageDesktopsNum;
        return this;
    }

    /**
     * 按需收费镜像桌面总数。
     * @return onDemandChargeImageDesktopsNum
     */
    public Integer getOnDemandChargeImageDesktopsNum() {
        return onDemandChargeImageDesktopsNum;
    }

    public void setOnDemandChargeImageDesktopsNum(Integer onDemandChargeImageDesktopsNum) {
        this.onDemandChargeImageDesktopsNum = onDemandChargeImageDesktopsNum;
    }

    public ListPoolDesktopsDetailResponse withPeriodFreeImageDesktopsNum(Integer periodFreeImageDesktopsNum) {
        this.periodFreeImageDesktopsNum = periodFreeImageDesktopsNum;
        return this;
    }

    /**
     * 包周期免费镜像桌面总数。
     * @return periodFreeImageDesktopsNum
     */
    public Integer getPeriodFreeImageDesktopsNum() {
        return periodFreeImageDesktopsNum;
    }

    public void setPeriodFreeImageDesktopsNum(Integer periodFreeImageDesktopsNum) {
        this.periodFreeImageDesktopsNum = periodFreeImageDesktopsNum;
    }

    public ListPoolDesktopsDetailResponse withPeriodChargeImageDesktopsNum(Integer periodChargeImageDesktopsNum) {
        this.periodChargeImageDesktopsNum = periodChargeImageDesktopsNum;
        return this;
    }

    /**
     * 包周期收费镜像桌面总数。
     * @return periodChargeImageDesktopsNum
     */
    public Integer getPeriodChargeImageDesktopsNum() {
        return periodChargeImageDesktopsNum;
    }

    public void setPeriodChargeImageDesktopsNum(Integer periodChargeImageDesktopsNum) {
        this.periodChargeImageDesktopsNum = periodChargeImageDesktopsNum;
    }

    public ListPoolDesktopsDetailResponse withInconsistentType(InconsistentTypeEnum inconsistentType) {
        this.inconsistentType = inconsistentType;
        return this;
    }

    /**
     * Get inconsistentType
     * @return inconsistentType
     */
    public InconsistentTypeEnum getInconsistentType() {
        return inconsistentType;
    }

    public void setInconsistentType(InconsistentTypeEnum inconsistentType) {
        this.inconsistentType = inconsistentType;
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
            && Objects.equals(this.periodDesktopsNum, that.periodDesktopsNum)
            && Objects.equals(this.onDemandFreeImageDesktopsNum, that.onDemandFreeImageDesktopsNum)
            && Objects.equals(this.onDemandChargeImageDesktopsNum, that.onDemandChargeImageDesktopsNum)
            && Objects.equals(this.periodFreeImageDesktopsNum, that.periodFreeImageDesktopsNum)
            && Objects.equals(this.periodChargeImageDesktopsNum, that.periodChargeImageDesktopsNum)
            && Objects.equals(this.inconsistentType, that.inconsistentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolDesktops,
            totalCount,
            onDemandDesktopsNum,
            periodDesktopsNum,
            onDemandFreeImageDesktopsNum,
            onDemandChargeImageDesktopsNum,
            periodFreeImageDesktopsNum,
            periodChargeImageDesktopsNum,
            inconsistentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolDesktopsDetailResponse {\n");
        sb.append("    poolDesktops: ").append(toIndentedString(poolDesktops)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    onDemandDesktopsNum: ").append(toIndentedString(onDemandDesktopsNum)).append("\n");
        sb.append("    periodDesktopsNum: ").append(toIndentedString(periodDesktopsNum)).append("\n");
        sb.append("    onDemandFreeImageDesktopsNum: ")
            .append(toIndentedString(onDemandFreeImageDesktopsNum))
            .append("\n");
        sb.append("    onDemandChargeImageDesktopsNum: ")
            .append(toIndentedString(onDemandChargeImageDesktopsNum))
            .append("\n");
        sb.append("    periodFreeImageDesktopsNum: ").append(toIndentedString(periodFreeImageDesktopsNum)).append("\n");
        sb.append("    periodChargeImageDesktopsNum: ")
            .append(toIndentedString(periodChargeImageDesktopsNum))
            .append("\n");
        sb.append("    inconsistentType: ").append(toIndentedString(inconsistentType)).append("\n");
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
