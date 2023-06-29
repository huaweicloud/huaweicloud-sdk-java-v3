package com.huaweicloud.sdk.hss.v5.model;

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
public class ListQuotasDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_cycle_num")

    private Integer packetCycleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_demand_num")

    private Integer onDemandNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_num")

    private Integer usedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_num")

    private Integer idleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_num")

    private Integer normalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_num")

    private Integer expiredNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_num")

    private Integer freezeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_statistics_list")

    private List<QuotaStatisticsResponseInfo> quotaStatisticsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<QuotaResourcesResponseInfo> dataList = null;

    public ListQuotasDetailResponse withPacketCycleNum(Integer packetCycleNum) {
        this.packetCycleNum = packetCycleNum;
        return this;
    }

    /**
     * 包周期配额数
     * minimum: 0
     * maximum: 10000000
     * @return packetCycleNum
     */
    public Integer getPacketCycleNum() {
        return packetCycleNum;
    }

    public void setPacketCycleNum(Integer packetCycleNum) {
        this.packetCycleNum = packetCycleNum;
    }

    public ListQuotasDetailResponse withOnDemandNum(Integer onDemandNum) {
        this.onDemandNum = onDemandNum;
        return this;
    }

    /**
     * 按需配额数
     * minimum: 0
     * maximum: 10000000
     * @return onDemandNum
     */
    public Integer getOnDemandNum() {
        return onDemandNum;
    }

    public void setOnDemandNum(Integer onDemandNum) {
        this.onDemandNum = onDemandNum;
    }

    public ListQuotasDetailResponse withUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
        return this;
    }

    /**
     * 已使用配额数
     * minimum: 0
     * maximum: 10000000
     * @return usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public ListQuotasDetailResponse withIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
        return this;
    }

    /**
     * 空闲配额数
     * minimum: 0
     * maximum: 10000000
     * @return idleNum
     */
    public Integer getIdleNum() {
        return idleNum;
    }

    public void setIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
    }

    public ListQuotasDetailResponse withNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
        return this;
    }

    /**
     * 正常配额数
     * minimum: 0
     * maximum: 10000000
     * @return normalNum
     */
    public Integer getNormalNum() {
        return normalNum;
    }

    public void setNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
    }

    public ListQuotasDetailResponse withExpiredNum(Integer expiredNum) {
        this.expiredNum = expiredNum;
        return this;
    }

    /**
     * 过期配额数
     * minimum: 0
     * maximum: 10000000
     * @return expiredNum
     */
    public Integer getExpiredNum() {
        return expiredNum;
    }

    public void setExpiredNum(Integer expiredNum) {
        this.expiredNum = expiredNum;
    }

    public ListQuotasDetailResponse withFreezeNum(Integer freezeNum) {
        this.freezeNum = freezeNum;
        return this;
    }

    /**
     * 冻结配额数
     * minimum: 0
     * maximum: 10000000
     * @return freezeNum
     */
    public Integer getFreezeNum() {
        return freezeNum;
    }

    public void setFreezeNum(Integer freezeNum) {
        this.freezeNum = freezeNum;
    }

    public ListQuotasDetailResponse withQuotaStatisticsList(List<QuotaStatisticsResponseInfo> quotaStatisticsList) {
        this.quotaStatisticsList = quotaStatisticsList;
        return this;
    }

    public ListQuotasDetailResponse addQuotaStatisticsListItem(QuotaStatisticsResponseInfo quotaStatisticsListItem) {
        if (this.quotaStatisticsList == null) {
            this.quotaStatisticsList = new ArrayList<>();
        }
        this.quotaStatisticsList.add(quotaStatisticsListItem);
        return this;
    }

    public ListQuotasDetailResponse withQuotaStatisticsList(
        Consumer<List<QuotaStatisticsResponseInfo>> quotaStatisticsListSetter) {
        if (this.quotaStatisticsList == null) {
            this.quotaStatisticsList = new ArrayList<>();
        }
        quotaStatisticsListSetter.accept(this.quotaStatisticsList);
        return this;
    }

    /**
     * 配额统计列表
     * @return quotaStatisticsList
     */
    public List<QuotaStatisticsResponseInfo> getQuotaStatisticsList() {
        return quotaStatisticsList;
    }

    public void setQuotaStatisticsList(List<QuotaStatisticsResponseInfo> quotaStatisticsList) {
        this.quotaStatisticsList = quotaStatisticsList;
    }

    public ListQuotasDetailResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 10000000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListQuotasDetailResponse withDataList(List<QuotaResourcesResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListQuotasDetailResponse addDataListItem(QuotaResourcesResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListQuotasDetailResponse withDataList(Consumer<List<QuotaResourcesResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 配额列表
     * @return dataList
     */
    public List<QuotaResourcesResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<QuotaResourcesResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotasDetailResponse that = (ListQuotasDetailResponse) obj;
        return Objects.equals(this.packetCycleNum, that.packetCycleNum)
            && Objects.equals(this.onDemandNum, that.onDemandNum) && Objects.equals(this.usedNum, that.usedNum)
            && Objects.equals(this.idleNum, that.idleNum) && Objects.equals(this.normalNum, that.normalNum)
            && Objects.equals(this.expiredNum, that.expiredNum) && Objects.equals(this.freezeNum, that.freezeNum)
            && Objects.equals(this.quotaStatisticsList, that.quotaStatisticsList)
            && Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packetCycleNum,
            onDemandNum,
            usedNum,
            idleNum,
            normalNum,
            expiredNum,
            freezeNum,
            quotaStatisticsList,
            totalNum,
            dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasDetailResponse {\n");
        sb.append("    packetCycleNum: ").append(toIndentedString(packetCycleNum)).append("\n");
        sb.append("    onDemandNum: ").append(toIndentedString(onDemandNum)).append("\n");
        sb.append("    usedNum: ").append(toIndentedString(usedNum)).append("\n");
        sb.append("    idleNum: ").append(toIndentedString(idleNum)).append("\n");
        sb.append("    normalNum: ").append(toIndentedString(normalNum)).append("\n");
        sb.append("    expiredNum: ").append(toIndentedString(expiredNum)).append("\n");
        sb.append("    freezeNum: ").append(toIndentedString(freezeNum)).append("\n");
        sb.append("    quotaStatisticsList: ").append(toIndentedString(quotaStatisticsList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
