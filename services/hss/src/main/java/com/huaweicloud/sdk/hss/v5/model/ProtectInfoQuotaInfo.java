package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护配额信息
 */
public class ProtectInfoQuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_quota_num")

    private Integer expiredQuotaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "about_to_expire_quota_num")

    private Integer aboutToExpireQuotaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_use_enterprise_rate")

    private Float userUseEnterpriseRate;

    public ProtectInfoQuotaInfo withExpiredQuotaNum(Integer expiredQuotaNum) {
        this.expiredQuotaNum = expiredQuotaNum;
        return this;
    }

    /**
     * **参数解释**: 已经到期的配额 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return expiredQuotaNum
     */
    public Integer getExpiredQuotaNum() {
        return expiredQuotaNum;
    }

    public void setExpiredQuotaNum(Integer expiredQuotaNum) {
        this.expiredQuotaNum = expiredQuotaNum;
    }

    public ProtectInfoQuotaInfo withAboutToExpireQuotaNum(Integer aboutToExpireQuotaNum) {
        this.aboutToExpireQuotaNum = aboutToExpireQuotaNum;
        return this;
    }

    /**
     * **参数解释**: 即将到期的配额 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return aboutToExpireQuotaNum
     */
    public Integer getAboutToExpireQuotaNum() {
        return aboutToExpireQuotaNum;
    }

    public void setAboutToExpireQuotaNum(Integer aboutToExpireQuotaNum) {
        this.aboutToExpireQuotaNum = aboutToExpireQuotaNum;
    }

    public ProtectInfoQuotaInfo withUserUseEnterpriseRate(Float userUseEnterpriseRate) {
        this.userUseEnterpriseRate = userUseEnterpriseRate;
        return this;
    }

    /**
     * **参数解释**: 使用企业版的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userUseEnterpriseRate
     */
    public Float getUserUseEnterpriseRate() {
        return userUseEnterpriseRate;
    }

    public void setUserUseEnterpriseRate(Float userUseEnterpriseRate) {
        this.userUseEnterpriseRate = userUseEnterpriseRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectInfoQuotaInfo that = (ProtectInfoQuotaInfo) obj;
        return Objects.equals(this.expiredQuotaNum, that.expiredQuotaNum)
            && Objects.equals(this.aboutToExpireQuotaNum, that.aboutToExpireQuotaNum)
            && Objects.equals(this.userUseEnterpriseRate, that.userUseEnterpriseRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiredQuotaNum, aboutToExpireQuotaNum, userUseEnterpriseRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectInfoQuotaInfo {\n");
        sb.append("    expiredQuotaNum: ").append(toIndentedString(expiredQuotaNum)).append("\n");
        sb.append("    aboutToExpireQuotaNum: ").append(toIndentedString(aboutToExpireQuotaNum)).append("\n");
        sb.append("    userUseEnterpriseRate: ").append(toIndentedString(userUseEnterpriseRate)).append("\n");
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
