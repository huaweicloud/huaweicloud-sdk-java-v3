package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储库summary返回body
 */
public class BccVaultDaySummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamp")

    private Long timeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_summary_list")

    private List<BccVaultSingleSummary> vaultSummaryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_summary_count")

    private Long vaultSummaryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_summary_size")

    private Long vaultSummarySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_summary_used")

    private Long vaultSummaryUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_average_utilization_rate")

    private Double vaultAverageUtilizationRate;

    public BccVaultDaySummary withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BccVaultDaySummary withTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * 时间戳
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BccVaultDaySummary withVaultSummaryList(List<BccVaultSingleSummary> vaultSummaryList) {
        this.vaultSummaryList = vaultSummaryList;
        return this;
    }

    public BccVaultDaySummary addVaultSummaryListItem(BccVaultSingleSummary vaultSummaryListItem) {
        if (this.vaultSummaryList == null) {
            this.vaultSummaryList = new ArrayList<>();
        }
        this.vaultSummaryList.add(vaultSummaryListItem);
        return this;
    }

    public BccVaultDaySummary withVaultSummaryList(Consumer<List<BccVaultSingleSummary>> vaultSummaryListSetter) {
        if (this.vaultSummaryList == null) {
            this.vaultSummaryList = new ArrayList<>();
        }
        vaultSummaryListSetter.accept(this.vaultSummaryList);
        return this;
    }

    /**
     * vault的summary列表
     * @return vaultSummaryList
     */
    public List<BccVaultSingleSummary> getVaultSummaryList() {
        return vaultSummaryList;
    }

    public void setVaultSummaryList(List<BccVaultSingleSummary> vaultSummaryList) {
        this.vaultSummaryList = vaultSummaryList;
    }

    public BccVaultDaySummary withVaultSummaryCount(Long vaultSummaryCount) {
        this.vaultSummaryCount = vaultSummaryCount;
        return this;
    }

    /**
     * 存储库summary数量
     * @return vaultSummaryCount
     */
    public Long getVaultSummaryCount() {
        return vaultSummaryCount;
    }

    public void setVaultSummaryCount(Long vaultSummaryCount) {
        this.vaultSummaryCount = vaultSummaryCount;
    }

    public BccVaultDaySummary withVaultSummarySize(Long vaultSummarySize) {
        this.vaultSummarySize = vaultSummarySize;
        return this;
    }

    /**
     * 存储库summary全部容量大小，单位GB。
     * @return vaultSummarySize
     */
    public Long getVaultSummarySize() {
        return vaultSummarySize;
    }

    public void setVaultSummarySize(Long vaultSummarySize) {
        this.vaultSummarySize = vaultSummarySize;
    }

    public BccVaultDaySummary withVaultSummaryUsed(Long vaultSummaryUsed) {
        this.vaultSummaryUsed = vaultSummaryUsed;
        return this;
    }

    /**
     * 存储库summary已用容量大小，单位MB。
     * @return vaultSummaryUsed
     */
    public Long getVaultSummaryUsed() {
        return vaultSummaryUsed;
    }

    public void setVaultSummaryUsed(Long vaultSummaryUsed) {
        this.vaultSummaryUsed = vaultSummaryUsed;
    }

    public BccVaultDaySummary withVaultAverageUtilizationRate(Double vaultAverageUtilizationRate) {
        this.vaultAverageUtilizationRate = vaultAverageUtilizationRate;
        return this;
    }

    /**
     * 存储库summary容量使用率
     * @return vaultAverageUtilizationRate
     */
    public Double getVaultAverageUtilizationRate() {
        return vaultAverageUtilizationRate;
    }

    public void setVaultAverageUtilizationRate(Double vaultAverageUtilizationRate) {
        this.vaultAverageUtilizationRate = vaultAverageUtilizationRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccVaultDaySummary that = (BccVaultDaySummary) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.timeStamp, that.timeStamp)
            && Objects.equals(this.vaultSummaryList, that.vaultSummaryList)
            && Objects.equals(this.vaultSummaryCount, that.vaultSummaryCount)
            && Objects.equals(this.vaultSummarySize, that.vaultSummarySize)
            && Objects.equals(this.vaultSummaryUsed, that.vaultSummaryUsed)
            && Objects.equals(this.vaultAverageUtilizationRate, that.vaultAverageUtilizationRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            timeStamp,
            vaultSummaryList,
            vaultSummaryCount,
            vaultSummarySize,
            vaultSummaryUsed,
            vaultAverageUtilizationRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccVaultDaySummary {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
        sb.append("    vaultSummaryList: ").append(toIndentedString(vaultSummaryList)).append("\n");
        sb.append("    vaultSummaryCount: ").append(toIndentedString(vaultSummaryCount)).append("\n");
        sb.append("    vaultSummarySize: ").append(toIndentedString(vaultSummarySize)).append("\n");
        sb.append("    vaultSummaryUsed: ").append(toIndentedString(vaultSummaryUsed)).append("\n");
        sb.append("    vaultAverageUtilizationRate: ")
            .append(toIndentedString(vaultAverageUtilizationRate))
            .append("\n");
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
