package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateDashboardWidgetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "widget_ids")

    private List<String> widgetIds = null;

    public CreateDashboardWidgetsResponse withWidgetIds(List<String> widgetIds) {
        this.widgetIds = widgetIds;
        return this;
    }

    public CreateDashboardWidgetsResponse addWidgetIdsItem(String widgetIdsItem) {
        if (this.widgetIds == null) {
            this.widgetIds = new ArrayList<>();
        }
        this.widgetIds.add(widgetIdsItem);
        return this;
    }

    public CreateDashboardWidgetsResponse withWidgetIds(Consumer<List<String>> widgetIdsSetter) {
        if (this.widgetIds == null) {
            this.widgetIds = new ArrayList<>();
        }
        widgetIdsSetter.accept(this.widgetIds);
        return this;
    }

    /**
     * **参数解释** 批量创建监控视图返回结果 
     * @return widgetIds
     */
    public List<String> getWidgetIds() {
        return widgetIds;
    }

    public void setWidgetIds(List<String> widgetIds) {
        this.widgetIds = widgetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDashboardWidgetsResponse that = (CreateDashboardWidgetsResponse) obj;
        return Objects.equals(this.widgetIds, that.widgetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widgetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDashboardWidgetsResponse {\n");
        sb.append("    widgetIds: ").append(toIndentedString(widgetIds)).append("\n");
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
