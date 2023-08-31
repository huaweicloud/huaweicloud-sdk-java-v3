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
public class BatchUpdateWidgetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "widgets")

    private List<BatchUpdateWidgetInfo> widgets = null;

    public BatchUpdateWidgetsResponse withWidgets(List<BatchUpdateWidgetInfo> widgets) {
        this.widgets = widgets;
        return this;
    }

    public BatchUpdateWidgetsResponse addWidgetsItem(BatchUpdateWidgetInfo widgetsItem) {
        if (this.widgets == null) {
            this.widgets = new ArrayList<>();
        }
        this.widgets.add(widgetsItem);
        return this;
    }

    public BatchUpdateWidgetsResponse withWidgets(Consumer<List<BatchUpdateWidgetInfo>> widgetsSetter) {
        if (this.widgets == null) {
            this.widgets = new ArrayList<>();
        }
        widgetsSetter.accept(this.widgets);
        return this;
    }

    /**
     * 更新结果列表
     * @return widgets
     */
    public List<BatchUpdateWidgetInfo> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<BatchUpdateWidgetInfo> widgets) {
        this.widgets = widgets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateWidgetsResponse that = (BatchUpdateWidgetsResponse) obj;
        return Objects.equals(this.widgets, that.widgets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widgets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateWidgetsResponse {\n");
        sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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
