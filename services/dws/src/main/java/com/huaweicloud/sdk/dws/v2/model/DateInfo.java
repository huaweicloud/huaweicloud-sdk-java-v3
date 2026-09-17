package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DateInfo
 */
public class DateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_type")

    private String dateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_start")

    private String dateStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_end")

    private String dateEnd;

    public DateInfo withDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }

    /**
     * **参数解释**： 日期类型，如每月1号执行则为1th。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dateType
     */
    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public DateInfo withDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    /**
     * **参数解释**： 开始时间，如：04:00:00。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dateStart
     */
    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public DateInfo withDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }

    /**
     * **参数解释**： 结束时间，如：08:00:00。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dateEnd
     */
    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateInfo that = (DateInfo) obj;
        return Objects.equals(this.dateType, that.dateType) && Objects.equals(this.dateStart, that.dateStart)
            && Objects.equals(this.dateEnd, that.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateType, dateStart, dateEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateInfo {\n");
        sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
        sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
        sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
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
