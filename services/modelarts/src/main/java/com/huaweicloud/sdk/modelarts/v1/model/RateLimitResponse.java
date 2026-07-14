package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 流量控制配置。
 */
public class RateLimitResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public RateLimitResponse withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 服务流量限制是指指定单位内一个服务能够被访问的次数上限。 **取值范围：** 1-10000。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public RateLimitResponse withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释：** 流量限制单元。 **取值范围：** - NANOS（纳秒）。 - MICROS（微秒）。 - MILLIS（毫秒）。 - SECONDS（秒）。 - MINUTES（分钟）。 - HOURS（小时）。 - DAYS（天）。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateLimitResponse that = (RateLimitResponse) obj;
        return Objects.equals(this.num, that.num) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateLimitResponse {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
