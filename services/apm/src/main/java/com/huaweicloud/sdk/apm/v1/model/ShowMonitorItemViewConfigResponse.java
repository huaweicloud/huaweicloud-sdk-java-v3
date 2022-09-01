package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMonitorItemViewConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_name")

    @JacksonXmlProperty(localName = "collector_name")

    private String collectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_row_list")

    @JacksonXmlProperty(localName = "view_row_list")

    private List<ViewRow> viewRowList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    @JacksonXmlProperty(localName = "style")

    private String style;

    public ShowMonitorItemViewConfigResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowMonitorItemViewConfigResponse withCollectorName(String collectorName) {
        this.collectorName = collectorName;
        return this;
    }

    /**
     * 采集器名称
     * @return collectorName
     */
    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public ShowMonitorItemViewConfigResponse withViewRowList(List<ViewRow> viewRowList) {
        this.viewRowList = viewRowList;
        return this;
    }

    public ShowMonitorItemViewConfigResponse addViewRowListItem(ViewRow viewRowListItem) {
        if (this.viewRowList == null) {
            this.viewRowList = new ArrayList<>();
        }
        this.viewRowList.add(viewRowListItem);
        return this;
    }

    public ShowMonitorItemViewConfigResponse withViewRowList(Consumer<List<ViewRow>> viewRowListSetter) {
        if (this.viewRowList == null) {
            this.viewRowList = new ArrayList<>();
        }
        viewRowListSetter.accept(this.viewRowList);
        return this;
    }

    /**
     * 视图的列表，内部每个List代表的是一行图表
     * @return viewRowList
     */
    public List<ViewRow> getViewRowList() {
        return viewRowList;
    }

    public void setViewRowList(List<ViewRow> viewRowList) {
        this.viewRowList = viewRowList;
    }

    public ShowMonitorItemViewConfigResponse withStyle(String style) {
        this.style = style;
        return this;
    }

    /**
     * 类型
     * @return style
     */
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMonitorItemViewConfigResponse showMonitorItemViewConfigResponse = (ShowMonitorItemViewConfigResponse) o;
        return Objects.equals(this.title, showMonitorItemViewConfigResponse.title)
            && Objects.equals(this.collectorName, showMonitorItemViewConfigResponse.collectorName)
            && Objects.equals(this.viewRowList, showMonitorItemViewConfigResponse.viewRowList)
            && Objects.equals(this.style, showMonitorItemViewConfigResponse.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, collectorName, viewRowList, style);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonitorItemViewConfigResponse {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
        sb.append("    viewRowList: ").append(toIndentedString(viewRowList)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
