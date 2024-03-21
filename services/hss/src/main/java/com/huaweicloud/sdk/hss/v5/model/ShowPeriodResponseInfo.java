package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowPeriodResponseInfo
 */
public class ShowPeriodResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_vals")

    private String periodVals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_unit")

    private String periodUnit;

    public ShowPeriodResponseInfo withPeriodVals(String periodVals) {
        this.periodVals = periodVals;
        return this;
    }

    /**
     * 购买时长数值串，多个用逗号分隔，如1,2,3,4,5,6,7,8,9
     * @return periodVals
     */
    public String getPeriodVals() {
        return periodVals;
    }

    public void setPeriodVals(String periodVals) {
        this.periodVals = periodVals;
    }

    public ShowPeriodResponseInfo withPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }

    /**
     * 购买时长单位   - year ：年   - month ：月   - day ：日
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPeriodResponseInfo that = (ShowPeriodResponseInfo) obj;
        return Objects.equals(this.periodVals, that.periodVals) && Objects.equals(this.periodUnit, that.periodUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodVals, periodUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPeriodResponseInfo {\n");
        sb.append("    periodVals: ").append(toIndentedString(periodVals)).append("\n");
        sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
