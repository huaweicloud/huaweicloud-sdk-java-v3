package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCollectConfigResponseBodyDataList
 */
public class ListCollectConfigResponseBodyDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_all_num")

    private BigDecimal accountAllNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_successful_num")

    private BigDecimal accountSuccessfulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc")

    private String csvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<ListCollectConfigResponseBodyDatasets> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private BigDecimal lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_all_num")

    private BigDecimal logAllNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_in_num")

    private BigDecimal logInNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_in_num_last_one_hour")

    private BigDecimal logInNumLastOneHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    public ListCollectConfigResponseBodyDataList withAccountAllNum(BigDecimal accountAllNum) {
        this.accountAllNum = accountAllNum;
        return this;
    }

    /**
     * 接入账号总数量
     * minimum: 0
     * maximum: 1E+4
     * @return accountAllNum
     */
    public BigDecimal getAccountAllNum() {
        return accountAllNum;
    }

    public void setAccountAllNum(BigDecimal accountAllNum) {
        this.accountAllNum = accountAllNum;
    }

    public ListCollectConfigResponseBodyDataList withAccountSuccessfulNum(BigDecimal accountSuccessfulNum) {
        this.accountSuccessfulNum = accountSuccessfulNum;
        return this;
    }

    /**
     * 成功接入账号数量
     * minimum: 0
     * maximum: 1E+4
     * @return accountSuccessfulNum
     */
    public BigDecimal getAccountSuccessfulNum() {
        return accountSuccessfulNum;
    }

    public void setAccountSuccessfulNum(BigDecimal accountSuccessfulNum) {
        this.accountSuccessfulNum = accountSuccessfulNum;
    }

    public ListCollectConfigResponseBodyDataList withCsvc(String csvc) {
        this.csvc = csvc;
        return this;
    }

    /**
     * 云产品ID
     * @return csvc
     */
    public String getCsvc() {
        return csvc;
    }

    public void setCsvc(String csvc) {
        this.csvc = csvc;
    }

    public ListCollectConfigResponseBodyDataList withDatasets(List<ListCollectConfigResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ListCollectConfigResponseBodyDataList addDatasetsItem(ListCollectConfigResponseBodyDatasets datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ListCollectConfigResponseBodyDataList withDatasets(
        Consumer<List<ListCollectConfigResponseBodyDatasets>> datasetsSetter) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        datasetsSetter.accept(this.datasets);
        return this;
    }

    /**
     * 日志数据
     * @return datasets
     */
    public List<ListCollectConfigResponseBodyDatasets> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<ListCollectConfigResponseBodyDatasets> datasets) {
        this.datasets = datasets;
    }

    public ListCollectConfigResponseBodyDataList withLastModifiedTime(BigDecimal lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 上次修改时间
     * minimum: 0
     * maximum: 1E+4
     * @return lastModifiedTime
     */
    public BigDecimal getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(BigDecimal lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ListCollectConfigResponseBodyDataList withLogAllNum(BigDecimal logAllNum) {
        this.logAllNum = logAllNum;
        return this;
    }

    /**
     * 日志总数量
     * minimum: 0
     * maximum: 1E+4
     * @return logAllNum
     */
    public BigDecimal getLogAllNum() {
        return logAllNum;
    }

    public void setLogAllNum(BigDecimal logAllNum) {
        this.logAllNum = logAllNum;
    }

    public ListCollectConfigResponseBodyDataList withLogInNum(BigDecimal logInNum) {
        this.logInNum = logInNum;
        return this;
    }

    /**
     * 接入日志数量
     * minimum: 0
     * maximum: 1E+4
     * @return logInNum
     */
    public BigDecimal getLogInNum() {
        return logInNum;
    }

    public void setLogInNum(BigDecimal logInNum) {
        this.logInNum = logInNum;
    }

    public ListCollectConfigResponseBodyDataList withLogInNumLastOneHour(BigDecimal logInNumLastOneHour) {
        this.logInNumLastOneHour = logInNumLastOneHour;
        return this;
    }

    /**
     * 过去一个小时接入
     * minimum: 0
     * maximum: 1E+4
     * @return logInNumLastOneHour
     */
    public BigDecimal getLogInNumLastOneHour() {
        return logInNumLastOneHour;
    }

    public void setLogInNumLastOneHour(BigDecimal logInNumLastOneHour) {
        this.logInNumLastOneHour = logInNumLastOneHour;
    }

    public ListCollectConfigResponseBodyDataList withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 状态
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public ListCollectConfigResponseBodyDataList withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 云厂商ID
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyDataList that = (ListCollectConfigResponseBodyDataList) obj;
        return Objects.equals(this.accountAllNum, that.accountAllNum)
            && Objects.equals(this.accountSuccessfulNum, that.accountSuccessfulNum)
            && Objects.equals(this.csvc, that.csvc) && Objects.equals(this.datasets, that.datasets)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime)
            && Objects.equals(this.logAllNum, that.logAllNum) && Objects.equals(this.logInNum, that.logInNum)
            && Objects.equals(this.logInNumLastOneHour, that.logInNumLastOneHour)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.vendor, that.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAllNum,
            accountSuccessfulNum,
            csvc,
            datasets,
            lastModifiedTime,
            logAllNum,
            logInNum,
            logInNumLastOneHour,
            processStatus,
            vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyDataList {\n");
        sb.append("    accountAllNum: ").append(toIndentedString(accountAllNum)).append("\n");
        sb.append("    accountSuccessfulNum: ").append(toIndentedString(accountSuccessfulNum)).append("\n");
        sb.append("    csvc: ").append(toIndentedString(csvc)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    logAllNum: ").append(toIndentedString(logAllNum)).append("\n");
        sb.append("    logInNum: ").append(toIndentedString(logInNum)).append("\n");
        sb.append("    logInNumLastOneHour: ").append(toIndentedString(logInNumLastOneHour)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
