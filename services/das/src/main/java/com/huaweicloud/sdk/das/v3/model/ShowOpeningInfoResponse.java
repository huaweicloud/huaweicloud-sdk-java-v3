package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOpeningInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_quota_exceed")

    private Boolean isQuotaExceed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_num")

    private Integer quotaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_num")

    private Integer usedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_charge")

    private Boolean isCharge;

    public ShowOpeningInfoResponse withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * 是否开通
     * @return open
     */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public ShowOpeningInfoResponse withIsQuotaExceed(Boolean isQuotaExceed) {
        this.isQuotaExceed = isQuotaExceed;
        return this;
    }

    /**
     * 配额是否超过
     * @return isQuotaExceed
     */
    public Boolean getIsQuotaExceed() {
        return isQuotaExceed;
    }

    public void setIsQuotaExceed(Boolean isQuotaExceed) {
        this.isQuotaExceed = isQuotaExceed;
    }

    public ShowOpeningInfoResponse withQuotaNum(Integer quotaNum) {
        this.quotaNum = quotaNum;
        return this;
    }

    /**
     * 开通配额总数
     * @return quotaNum
     */
    public Integer getQuotaNum() {
        return quotaNum;
    }

    public void setQuotaNum(Integer quotaNum) {
        this.quotaNum = quotaNum;
    }

    public ShowOpeningInfoResponse withUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
        return this;
    }

    /**
     * 已使用配额数量
     * @return usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public ShowOpeningInfoResponse withIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
        return this;
    }

    /**
     * 是否付费
     * @return isCharge
     */
    public Boolean getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpeningInfoResponse that = (ShowOpeningInfoResponse) obj;
        return Objects.equals(this.open, that.open) && Objects.equals(this.isQuotaExceed, that.isQuotaExceed)
            && Objects.equals(this.quotaNum, that.quotaNum) && Objects.equals(this.usedNum, that.usedNum)
            && Objects.equals(this.isCharge, that.isCharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(open, isQuotaExceed, quotaNum, usedNum, isCharge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpeningInfoResponse {\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    isQuotaExceed: ").append(toIndentedString(isQuotaExceed)).append("\n");
        sb.append("    quotaNum: ").append(toIndentedString(quotaNum)).append("\n");
        sb.append("    usedNum: ").append(toIndentedString(usedNum)).append("\n");
        sb.append("    isCharge: ").append(toIndentedString(isCharge)).append("\n");
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
