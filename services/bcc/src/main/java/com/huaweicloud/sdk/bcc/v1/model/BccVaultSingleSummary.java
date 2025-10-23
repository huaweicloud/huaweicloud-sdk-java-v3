package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单个存储库summary返回body
 */
public class BccVaultSingleSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_object_type")

    private String vaultObjectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_count")

    private Long vaultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_sum_size")

    private Long vaultSumSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_used_size")

    private Long vaultUsedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_utilization_rate")

    private Double vaultUtilizationRate;

    public BccVaultSingleSummary withVaultObjectType(String vaultObjectType) {
        this.vaultObjectType = vaultObjectType;
        return this;
    }

    /**
     * vault的类型
     * @return vaultObjectType
     */
    public String getVaultObjectType() {
        return vaultObjectType;
    }

    public void setVaultObjectType(String vaultObjectType) {
        this.vaultObjectType = vaultObjectType;
    }

    public BccVaultSingleSummary withVaultCount(Long vaultCount) {
        this.vaultCount = vaultCount;
        return this;
    }

    /**
     * vault的数量
     * @return vaultCount
     */
    public Long getVaultCount() {
        return vaultCount;
    }

    public void setVaultCount(Long vaultCount) {
        this.vaultCount = vaultCount;
    }

    public BccVaultSingleSummary withVaultSumSize(Long vaultSumSize) {
        this.vaultSumSize = vaultSumSize;
        return this;
    }

    /**
     * vault的大小
     * @return vaultSumSize
     */
    public Long getVaultSumSize() {
        return vaultSumSize;
    }

    public void setVaultSumSize(Long vaultSumSize) {
        this.vaultSumSize = vaultSumSize;
    }

    public BccVaultSingleSummary withVaultUsedSize(Long vaultUsedSize) {
        this.vaultUsedSize = vaultUsedSize;
        return this;
    }

    /**
     * vault的使用大小
     * @return vaultUsedSize
     */
    public Long getVaultUsedSize() {
        return vaultUsedSize;
    }

    public void setVaultUsedSize(Long vaultUsedSize) {
        this.vaultUsedSize = vaultUsedSize;
    }

    public BccVaultSingleSummary withVaultUtilizationRate(Double vaultUtilizationRate) {
        this.vaultUtilizationRate = vaultUtilizationRate;
        return this;
    }

    /**
     * vault的使用率
     * @return vaultUtilizationRate
     */
    public Double getVaultUtilizationRate() {
        return vaultUtilizationRate;
    }

    public void setVaultUtilizationRate(Double vaultUtilizationRate) {
        this.vaultUtilizationRate = vaultUtilizationRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccVaultSingleSummary that = (BccVaultSingleSummary) obj;
        return Objects.equals(this.vaultObjectType, that.vaultObjectType)
            && Objects.equals(this.vaultCount, that.vaultCount) && Objects.equals(this.vaultSumSize, that.vaultSumSize)
            && Objects.equals(this.vaultUsedSize, that.vaultUsedSize)
            && Objects.equals(this.vaultUtilizationRate, that.vaultUtilizationRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultObjectType, vaultCount, vaultSumSize, vaultUsedSize, vaultUtilizationRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccVaultSingleSummary {\n");
        sb.append("    vaultObjectType: ").append(toIndentedString(vaultObjectType)).append("\n");
        sb.append("    vaultCount: ").append(toIndentedString(vaultCount)).append("\n");
        sb.append("    vaultSumSize: ").append(toIndentedString(vaultSumSize)).append("\n");
        sb.append("    vaultUsedSize: ").append(toIndentedString(vaultUsedSize)).append("\n");
        sb.append("    vaultUtilizationRate: ").append(toIndentedString(vaultUtilizationRate)).append("\n");
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
