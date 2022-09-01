package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CouponQuotaV2
 */
public class CouponQuotaV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    @JacksonXmlProperty(localName = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    @JacksonXmlProperty(localName = "quota_type")

    private Integer quotaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    @JacksonXmlProperty(localName = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_value")

    @JacksonXmlProperty(localName = "quota_value")

    private Double quotaValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_status")

    @JacksonXmlProperty(localName = "quota_status")

    private Integer quotaStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance")

    @JacksonXmlProperty(localName = "balance")

    private Double balance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    @JacksonXmlProperty(localName = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    @JacksonXmlProperty(localName = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    @JacksonXmlProperty(localName = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_infos")

    @JacksonXmlProperty(localName = "limit_infos")

    private List<QuotaLimitInfo> limitInfos = null;

    public CouponQuotaV2 withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * 优惠券额度ID。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public CouponQuotaV2 withQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * 优惠券额度的类型： 0：代金券额度1：现金券额度
     * @return quotaType
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    public CouponQuotaV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CouponQuotaV2 withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后一次更新时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public CouponQuotaV2 withQuotaValue(Double quotaValue) {
        this.quotaValue = quotaValue;
        return this;
    }

    /**
     * 优惠券额度的值，精确到小数点后2位。
     * @return quotaValue
     */
    public Double getQuotaValue() {
        return quotaValue;
    }

    public void setQuotaValue(Double quotaValue) {
        this.quotaValue = quotaValue;
    }

    public CouponQuotaV2 withQuotaStatus(Integer quotaStatus) {
        this.quotaStatus = quotaStatus;
        return this;
    }

    /**
     * 优惠券额度的状态： 0：正常3：失效（过期失效和人工设置失效）4：额度调整中（伙伴可以查看该额度，但不能使用该额度发放优惠券）5：冻结
     * @return quotaStatus
     */
    public Integer getQuotaStatus() {
        return quotaStatus;
    }

    public void setQuotaStatus(Integer quotaStatus) {
        this.quotaStatus = quotaStatus;
    }

    public CouponQuotaV2 withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 剩余的优惠券额度，精确到小数点后2位。
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CouponQuotaV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 面额单位。 1：元。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public CouponQuotaV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 CNY：人民币
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CouponQuotaV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public CouponQuotaV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CouponQuotaV2 withLimitInfos(List<QuotaLimitInfo> limitInfos) {
        this.limitInfos = limitInfos;
        return this;
    }

    public CouponQuotaV2 addLimitInfosItem(QuotaLimitInfo limitInfosItem) {
        if (this.limitInfos == null) {
            this.limitInfos = new ArrayList<>();
        }
        this.limitInfos.add(limitInfosItem);
        return this;
    }

    public CouponQuotaV2 withLimitInfos(Consumer<List<QuotaLimitInfo>> limitInfosSetter) {
        if (this.limitInfos == null) {
            this.limitInfos = new ArrayList<>();
        }
        limitInfosSetter.accept(this.limitInfos);
        return this;
    }

    /**
     * 优惠券额度上的限制属性，具体参见表2。
     * @return limitInfos
     */
    public List<QuotaLimitInfo> getLimitInfos() {
        return limitInfos;
    }

    public void setLimitInfos(List<QuotaLimitInfo> limitInfos) {
        this.limitInfos = limitInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponQuotaV2 couponQuotaV2 = (CouponQuotaV2) o;
        return Objects.equals(this.quotaId, couponQuotaV2.quotaId)
            && Objects.equals(this.quotaType, couponQuotaV2.quotaType)
            && Objects.equals(this.createTime, couponQuotaV2.createTime)
            && Objects.equals(this.lastUpdateTime, couponQuotaV2.lastUpdateTime)
            && Objects.equals(this.quotaValue, couponQuotaV2.quotaValue)
            && Objects.equals(this.quotaStatus, couponQuotaV2.quotaStatus)
            && Objects.equals(this.balance, couponQuotaV2.balance)
            && Objects.equals(this.measureId, couponQuotaV2.measureId)
            && Objects.equals(this.currency, couponQuotaV2.currency)
            && Objects.equals(this.effectiveTime, couponQuotaV2.effectiveTime)
            && Objects.equals(this.expireTime, couponQuotaV2.expireTime)
            && Objects.equals(this.limitInfos, couponQuotaV2.limitInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaId,
            quotaType,
            createTime,
            lastUpdateTime,
            quotaValue,
            quotaStatus,
            balance,
            measureId,
            currency,
            effectiveTime,
            expireTime,
            limitInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponQuotaV2 {\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    quotaValue: ").append(toIndentedString(quotaValue)).append("\n");
        sb.append("    quotaStatus: ").append(toIndentedString(quotaStatus)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    limitInfos: ").append(toIndentedString(limitInfos)).append("\n");
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
