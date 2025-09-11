package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WidgetIdItem
 */
public class WidgetIdItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "widget_id")

    private String widgetId;

    public WidgetIdItem withWidgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }

    /**
     * **参数解释** 视图id **取值范围** 字符串必须以wg开头，包含22个字母和数字，长度为24个字符。 
     * @return widgetId
     */
    public String getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WidgetIdItem that = (WidgetIdItem) obj;
        return Objects.equals(this.widgetId, that.widgetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widgetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WidgetIdItem {\n");
        sb.append("    widgetId: ").append(toIndentedString(widgetId)).append("\n");
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
