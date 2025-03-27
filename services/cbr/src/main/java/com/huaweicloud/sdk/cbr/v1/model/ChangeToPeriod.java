package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeToPeriod
 */
public class ChangeToPeriod {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_url")

    private String consoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_ids")

    private List<String> vaultIds = null;

    public ChangeToPeriod withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式，当前仅可选择：pre_paid
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ChangeToPeriod withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 创建类型，按年(year)或者按月(month)
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ChangeToPeriod withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 创建类型的数量，按年或按月的个数
     * minimum: 1
     * maximum: 9
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ChangeToPeriod withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 到期后是否自动续期，默认不续期
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ChangeToPeriod withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动付费，默认为不自动付费
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ChangeToPeriod withConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }

    /**
     * 跳转URL
     * @return consoleUrl
     */
    public String getConsoleUrl() {
        return consoleUrl;
    }

    public void setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
    }

    public ChangeToPeriod withVaultIds(List<String> vaultIds) {
        this.vaultIds = vaultIds;
        return this;
    }

    public ChangeToPeriod addVaultIdsItem(String vaultIdsItem) {
        if (this.vaultIds == null) {
            this.vaultIds = new ArrayList<>();
        }
        this.vaultIds.add(vaultIdsItem);
        return this;
    }

    public ChangeToPeriod withVaultIds(Consumer<List<String>> vaultIdsSetter) {
        if (this.vaultIds == null) {
            this.vaultIds = new ArrayList<>();
        }
        vaultIdsSetter.accept(this.vaultIds);
        return this;
    }

    /**
     * 资源列表
     * @return vaultIds
     */
    public List<String> getVaultIds() {
        return vaultIds;
    }

    public void setVaultIds(List<String> vaultIds) {
        this.vaultIds = vaultIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeToPeriod that = (ChangeToPeriod) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.consoleUrl, that.consoleUrl)
            && Objects.equals(this.vaultIds, that.vaultIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, periodType, periodNum, isAutoRenew, isAutoPay, consoleUrl, vaultIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeToPeriod {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
        sb.append("    vaultIds: ").append(toIndentedString(vaultIds)).append("\n");
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
