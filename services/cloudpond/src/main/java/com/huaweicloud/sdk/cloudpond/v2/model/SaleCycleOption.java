package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 销售周期信息
 */
public class SaleCycleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_mode")

    private PayMode payMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodType periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private List<Integer> periodNum = null;

    public SaleCycleOption withPayMode(PayMode payMode) {
        this.payMode = payMode;
        return this;
    }

    /**
     * Get payMode
     * @return payMode
     */
    public PayMode getPayMode() {
        return payMode;
    }

    public void setPayMode(PayMode payMode) {
        this.payMode = payMode;
    }

    public SaleCycleOption withPeriodType(PeriodType periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get periodType
     * @return periodType
     */
    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    public SaleCycleOption withPeriodNum(List<Integer> periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public SaleCycleOption addPeriodNumItem(Integer periodNumItem) {
        if (this.periodNum == null) {
            this.periodNum = new ArrayList<>();
        }
        this.periodNum.add(periodNumItem);
        return this;
    }

    public SaleCycleOption withPeriodNum(Consumer<List<Integer>> periodNumSetter) {
        if (this.periodNum == null) {
            this.periodNum = new ArrayList<>();
        }
        periodNumSetter.accept(this.periodNum);
        return this;
    }

    /**
     * 销售周期取值
     * @return periodNum
     */
    public List<Integer> getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(List<Integer> periodNum) {
        this.periodNum = periodNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaleCycleOption that = (SaleCycleOption) obj;
        return Objects.equals(this.payMode, that.payMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payMode, periodType, periodNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaleCycleOption {\n");
        sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
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
