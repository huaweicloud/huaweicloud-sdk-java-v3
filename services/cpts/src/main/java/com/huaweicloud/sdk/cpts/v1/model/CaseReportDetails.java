package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseReportDetails
 */
public class CaseReportDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customTransactions")

    private List<CaseReportDetail> customTransactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailDatas")

    private List<CaseReportDetail> detailDatas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance")

    private CaseReportDetail performance;

    public CaseReportDetails withCustomTransactions(List<CaseReportDetail> customTransactions) {
        this.customTransactions = customTransactions;
        return this;
    }

    public CaseReportDetails addCustomTransactionsItem(CaseReportDetail customTransactionsItem) {
        if (this.customTransactions == null) {
            this.customTransactions = new ArrayList<>();
        }
        this.customTransactions.add(customTransactionsItem);
        return this;
    }

    public CaseReportDetails withCustomTransactions(Consumer<List<CaseReportDetail>> customTransactionsSetter) {
        if (this.customTransactions == null) {
            this.customTransactions = new ArrayList<>();
        }
        customTransactionsSetter.accept(this.customTransactions);
        return this;
    }

    /**
     * 用例下所有事务的基本性能数据信息
     * @return customTransactions
     */
    public List<CaseReportDetail> getCustomTransactions() {
        return customTransactions;
    }

    public void setCustomTransactions(List<CaseReportDetail> customTransactions) {
        this.customTransactions = customTransactions;
    }

    public CaseReportDetails withDetailDatas(List<CaseReportDetail> detailDatas) {
        this.detailDatas = detailDatas;
        return this;
    }

    public CaseReportDetails addDetailDatasItem(CaseReportDetail detailDatasItem) {
        if (this.detailDatas == null) {
            this.detailDatas = new ArrayList<>();
        }
        this.detailDatas.add(detailDatasItem);
        return this;
    }

    public CaseReportDetails withDetailDatas(Consumer<List<CaseReportDetail>> detailDatasSetter) {
        if (this.detailDatas == null) {
            this.detailDatas = new ArrayList<>();
        }
        detailDatasSetter.accept(this.detailDatas);
        return this;
    }

    /**
     * 用例下所有aw的基本性能数据信息
     * @return detailDatas
     */
    public List<CaseReportDetail> getDetailDatas() {
        return detailDatas;
    }

    public void setDetailDatas(List<CaseReportDetail> detailDatas) {
        this.detailDatas = detailDatas;
    }

    public CaseReportDetails withPerformance(CaseReportDetail performance) {
        this.performance = performance;
        return this;
    }

    public CaseReportDetails withPerformance(Consumer<CaseReportDetail> performanceSetter) {
        if (this.performance == null) {
            this.performance = new CaseReportDetail();
            performanceSetter.accept(this.performance);
        }

        return this;
    }

    /**
     * Get performance
     * @return performance
     */
    public CaseReportDetail getPerformance() {
        return performance;
    }

    public void setPerformance(CaseReportDetail performance) {
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
        CaseReportDetails that = (CaseReportDetails) obj;
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
        sb.append("class CaseReportDetails {\n");
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
