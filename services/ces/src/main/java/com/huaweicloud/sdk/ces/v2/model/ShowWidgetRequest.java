package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWidgetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "widget_id")

    private String widgetId;

    public ShowWidgetRequest withWidgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }

    /**
     * **参数解释**: 监控视图id。 **约束限制**: 不涉及。 **取值范围**: 字符串必须以wg开头，包含22个字母和数字，长度为24个字符。 **默认取值**: 不涉及。 
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
        ShowWidgetRequest that = (ShowWidgetRequest) obj;
        return Objects.equals(this.widgetId, that.widgetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widgetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWidgetRequest {\n");
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
