package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * values.yaml中的数据，数据结构以具体的模板为准
 */
public class ChartValueValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private Object basic;

    public ChartValueValues withBasic(Object basic) {
        this.basic = basic;
        return this;
    }

    /**
     * Get basic
     * @return basic
     */
    public Object getBasic() {
        return basic;
    }

    public void setBasic(Object basic) {
        this.basic = basic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChartValueValues that = (ChartValueValues) obj;
        return Objects.equals(this.basic, that.basic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartValueValues {\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
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
