package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListServerOfferingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_code")

    private String zoneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_mode")

    private List<PayMode> payMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private List<Integer> periodNum = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListServerOfferingsRequest withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * 地区编码
     * @return zoneCode
     */
    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public ListServerOfferingsRequest withPayMode(List<PayMode> payMode) {
        this.payMode = payMode;
        return this;
    }

    public ListServerOfferingsRequest addPayModeItem(PayMode payModeItem) {
        if (this.payMode == null) {
            this.payMode = new ArrayList<>();
        }
        this.payMode.add(payModeItem);
        return this;
    }

    public ListServerOfferingsRequest withPayMode(Consumer<List<PayMode>> payModeSetter) {
        if (this.payMode == null) {
            this.payMode = new ArrayList<>();
        }
        payModeSetter.accept(this.payMode);
        return this;
    }

    /**
     * 付费模式
     * @return payMode
     */
    public List<PayMode> getPayMode() {
        return payMode;
    }

    public void setPayMode(List<PayMode> payMode) {
        this.payMode = payMode;
    }

    public ListServerOfferingsRequest withPeriodNum(List<Integer> periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public ListServerOfferingsRequest addPeriodNumItem(Integer periodNumItem) {
        if (this.periodNum == null) {
            this.periodNum = new ArrayList<>();
        }
        this.periodNum.add(periodNumItem);
        return this;
    }

    public ListServerOfferingsRequest withPeriodNum(Consumer<List<Integer>> periodNumSetter) {
        if (this.periodNum == null) {
            this.periodNum = new ArrayList<>();
        }
        periodNumSetter.accept(this.periodNum);
        return this;
    }

    /**
     * 购买时长
     * @return periodNum
     */
    public List<Integer> getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(List<Integer> periodNum) {
        this.periodNum = periodNum;
    }

    public ListServerOfferingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServerOfferingsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标识
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerOfferingsRequest that = (ListServerOfferingsRequest) obj;
        return Objects.equals(this.zoneCode, that.zoneCode) && Objects.equals(this.payMode, that.payMode)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneCode, payMode, periodNum, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerOfferingsRequest {\n");
        sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
        sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
