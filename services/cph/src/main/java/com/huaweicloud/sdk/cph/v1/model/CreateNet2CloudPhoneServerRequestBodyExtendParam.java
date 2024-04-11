package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计费模式参数。
 */
public class CreateNet2CloudPhoneServerRequestBodyExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费类型。  [- 0：包周期](tag:hws,hws_hk,cmcc) [- 1：按需](tag:fcs)
     * minimum: -128
     * maximum: 128
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。 - 2：月 - 3：年
     * minimum: -128
     * maximum: 128
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。 当订购周期为月时，取值范围[1, 9]。 当订购周期为年时，取值范围[1,10]。
     * minimum: -128
     * maximum: 128
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动付款。默认不自动付款。 - 1：自动付款 - 0：不自动付款
     * minimum: -128
     * maximum: 128
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。默认不自动续订。 - 1：自动续订 - 0：不自动续订
     * minimum: -128
     * maximum: 128
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreateNet2CloudPhoneServerRequestBodyExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBodyExtendParam that = (CreateNet2CloudPhoneServerRequestBodyExtendParam) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, periodType, periodNum, isAutoPay, isAutoRenew, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBodyExtendParam {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
