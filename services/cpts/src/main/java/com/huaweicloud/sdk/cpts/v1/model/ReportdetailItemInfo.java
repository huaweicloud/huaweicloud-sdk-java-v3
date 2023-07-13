package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportdetailItemInfo
 */
public class ReportdetailItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customTransactions")

    private List<String> customTransactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailDatas")

    private List<DetailDataInfo> detailDatas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance")

    private PerformanceInfo performance;

    public ReportdetailItemInfo withCustomTransactions(List<String> customTransactions) {
        this.customTransactions = customTransactions;
        return this;
    }

    public ReportdetailItemInfo addCustomTransactionsItem(String customTransactionsItem) {
        if (this.customTransactions == null) {
            this.customTransactions = new ArrayList<>();
        }
        this.customTransactions.add(customTransactionsItem);
        return this;
    }

    public ReportdetailItemInfo withCustomTransactions(Consumer<List<String>> customTransactionsSetter) {
        if (this.customTransactions == null) {
            this.customTransactions = new ArrayList<>();
        }
        customTransactionsSetter.accept(this.customTransactions);
        return this;
    }

    /**
     * 自定义事务数据
     * @return customTransactions
     */
    public List<String> getCustomTransactions() {
        return customTransactions;
    }

    public void setCustomTransactions(List<String> customTransactions) {
        this.customTransactions = customTransactions;
    }

    public ReportdetailItemInfo withDetailDatas(List<DetailDataInfo> detailDatas) {
        this.detailDatas = detailDatas;
        return this;
    }

    public ReportdetailItemInfo addDetailDatasItem(DetailDataInfo detailDatasItem) {
        if (this.detailDatas == null) {
            this.detailDatas = new ArrayList<>();
        }
        this.detailDatas.add(detailDatasItem);
        return this;
    }

    public ReportdetailItemInfo withDetailDatas(Consumer<List<DetailDataInfo>> detailDatasSetter) {
        if (this.detailDatas == null) {
            this.detailDatas = new ArrayList<>();
        }
        detailDatasSetter.accept(this.detailDatas);
        return this;
    }

    /**
     * aw数据
     * @return detailDatas
     */
    public List<DetailDataInfo> getDetailDatas() {
        return detailDatas;
    }

    public void setDetailDatas(List<DetailDataInfo> detailDatas) {
        this.detailDatas = detailDatas;
    }

    public ReportdetailItemInfo withPerformance(PerformanceInfo performance) {
        this.performance = performance;
        return this;
    }

    public ReportdetailItemInfo withPerformance(Consumer<PerformanceInfo> performanceSetter) {
        if (this.performance == null) {
            this.performance = new PerformanceInfo();
            performanceSetter.accept(this.performance);
        }

        return this;
    }

    /**
     * Get performance
     * @return performance
     */
    public PerformanceInfo getPerformance() {
        return performance;
    }

    public void setPerformance(PerformanceInfo performance) {
        this.performance = performance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportdetailItemInfo that = (ReportdetailItemInfo) obj;
        return Objects.equals(this.customTransactions, that.customTransactions)
            && Objects.equals(this.detailDatas, that.detailDatas) && Objects.equals(this.performance, that.performance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customTransactions, detailDatas, performance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportdetailItemInfo {\n");
        sb.append("    customTransactions: ").append(toIndentedString(customTransactions)).append("\n");
        sb.append("    detailDatas: ").append(toIndentedString(detailDatas)).append("\n");
        sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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
