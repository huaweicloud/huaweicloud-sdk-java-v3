package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WidgetDisplayMode
 */
public class WidgetDisplayMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_widget_num")

    private Integer rowWidgetNum;

    public WidgetDisplayMode withRowWidgetNum(Integer rowWidgetNum) {
        this.rowWidgetNum = rowWidgetNum;
        return this;
    }

    /**
     * **参数解释** 每行展示视图数量 **取值范围** - 0:表示自定义坐标 - 1:代表每行1个视图 - 2:代表每行2个视图 - 3:代表每行3个视图 
     * minimum: 0
     * maximum: 3
     * @return rowWidgetNum
     */
    public Integer getRowWidgetNum() {
        return rowWidgetNum;
    }

    public void setRowWidgetNum(Integer rowWidgetNum) {
        this.rowWidgetNum = rowWidgetNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WidgetDisplayMode that = (WidgetDisplayMode) obj;
        return Objects.equals(this.rowWidgetNum, that.rowWidgetNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowWidgetNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WidgetDisplayMode {\n");
        sb.append("    rowWidgetNum: ").append(toIndentedString(rowWidgetNum)).append("\n");
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
