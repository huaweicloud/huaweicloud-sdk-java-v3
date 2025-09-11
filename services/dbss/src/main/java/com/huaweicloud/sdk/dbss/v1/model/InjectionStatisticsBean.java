package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InjectionStatisticsBean
 */
public class InjectionStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "injection_num")

    private Long injectionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public InjectionStatisticsBean withInjectionNum(Long injectionNum) {
        this.injectionNum = injectionNum;
        return this;
    }

    /**
     * 注入数量
     * @return injectionNum
     */
    public Long getInjectionNum() {
        return injectionNum;
    }

    public void setInjectionNum(Long injectionNum) {
        this.injectionNum = injectionNum;
    }

    public InjectionStatisticsBean withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InjectionStatisticsBean that = (InjectionStatisticsBean) obj;
        return Objects.equals(this.injectionNum, that.injectionNum) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(injectionNum, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InjectionStatisticsBean {\n");
        sb.append("    injectionNum: ").append(toIndentedString(injectionNum)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
