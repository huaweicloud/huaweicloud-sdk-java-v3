package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视图基础模型类
 */
public class ViewBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_name")

    @JacksonXmlProperty(localName = "collector_name")

    private String collectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_set")

    @JacksonXmlProperty(localName = "metric_set")

    private String metricSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向
     */
    public static final class TableDirectionEnum {

        /**
         * Enum H for value: "H"
         */
        public static final TableDirectionEnum H = new TableDirectionEnum("H");

        /**
         * Enum V for value: "V"
         */
        public static final TableDirectionEnum V = new TableDirectionEnum("V");

        private static final Map<String, TableDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableDirectionEnum> createStaticFields() {
            Map<String, TableDirectionEnum> map = new HashMap<>();
            map.put("H", H);
            map.put("V", V);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableDirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TableDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TableDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TableDirectionEnum(value);
            }
            return result;
        }

        public static TableDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TableDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableDirectionEnum) {
                return this.value.equals(((TableDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_direction")

    @JacksonXmlProperty(localName = "table_direction")

    private TableDirectionEnum tableDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    @JacksonXmlProperty(localName = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_item_list")

    @JacksonXmlProperty(localName = "field_item_list")

    private List<FieldItem> fieldItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span")

    @JacksonXmlProperty(localName = "span")

    private Boolean span;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_field")

    @JacksonXmlProperty(localName = "span_field")

    private String spanField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    @JacksonXmlProperty(localName = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest")

    @JacksonXmlProperty(localName = "latest")

    private String latest;

    /**
     * 视图类型
     */
    public static final class ViewTypeEnum {

        /**
         * Enum TREND for value: "trend"
         */
        public static final ViewTypeEnum TREND = new ViewTypeEnum("trend");

        /**
         * Enum SUMTABLE for value: "sumtable"
         */
        public static final ViewTypeEnum SUMTABLE = new ViewTypeEnum("sumtable");

        /**
         * Enum RAWTABLE for value: "rawtable"
         */
        public static final ViewTypeEnum RAWTABLE = new ViewTypeEnum("rawtable");

        private static final Map<String, ViewTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewTypeEnum> createStaticFields() {
            Map<String, ViewTypeEnum> map = new HashMap<>();
            map.put("trend", TREND);
            map.put("sumtable", SUMTABLE);
            map.put("rawtable", RAWTABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ViewTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ViewTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ViewTypeEnum(value);
            }
            return result;
        }

        public static ViewTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ViewTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewTypeEnum) {
                return this.value.equals(((ViewTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_type")

    @JacksonXmlProperty(localName = "view_type")

    private ViewTypeEnum viewType;

    public ViewBase withCollectorName(String collectorName) {
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

    public ViewBase withMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }

    /**
     * 视图对应的指标集的名称
     * @return metricSet
     */
    public String getMetricSet() {
        return metricSet;
    }

    public void setMetricSet(String metricSet) {
        this.metricSet = metricSet;
    }

    public ViewBase withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 图标所需展示的标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ViewBase withTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
        return this;
    }

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向
     * @return tableDirection
     */
    public TableDirectionEnum getTableDirection() {
        return tableDirection;
    }

    public void setTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
    }

    public ViewBase withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组规则
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ViewBase withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 过滤列表模型
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ViewBase withFieldItemList(List<FieldItem> fieldItemList) {
        this.fieldItemList = fieldItemList;
        return this;
    }

    public ViewBase addFieldItemListItem(FieldItem fieldItemListItem) {
        if (this.fieldItemList == null) {
            this.fieldItemList = new ArrayList<>();
        }
        this.fieldItemList.add(fieldItemListItem);
        return this;
    }

    public ViewBase withFieldItemList(Consumer<List<FieldItem>> fieldItemListSetter) {
        if (this.fieldItemList == null) {
            this.fieldItemList = new ArrayList<>();
        }
        fieldItemListSetter.accept(this.fieldItemList);
        return this;
    }

    /**
     * 所需展示的字段列表模型
     * @return fieldItemList
     */
    public List<FieldItem> getFieldItemList() {
        return fieldItemList;
    }

    public void setFieldItemList(List<FieldItem> fieldItemList) {
        this.fieldItemList = fieldItemList;
    }

    public ViewBase withSpan(Boolean span) {
        this.span = span;
        return this;
    }

    /**
     * span信息
     * @return span
     */
    public Boolean getSpan() {
        return span;
    }

    public void setSpan(Boolean span) {
        this.span = span;
    }

    public ViewBase withSpanField(String spanField) {
        this.spanField = spanField;
        return this;
    }

    /**
     * span字段属性
     * @return spanField
     */
    public String getSpanField() {
        return spanField;
    }

    public void setSpanField(String spanField) {
        this.spanField = spanField;
    }

    public ViewBase withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序规则
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ViewBase withLatest(String latest) {
        this.latest = latest;
        return this;
    }

    /**
     * 是否只展示最近一笔数据
     * @return latest
     */
    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public ViewBase withViewType(ViewTypeEnum viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * 视图类型
     * @return viewType
     */
    public ViewTypeEnum getViewType() {
        return viewType;
    }

    public void setViewType(ViewTypeEnum viewType) {
        this.viewType = viewType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViewBase viewBase = (ViewBase) o;
        return Objects.equals(this.collectorName, viewBase.collectorName)
            && Objects.equals(this.metricSet, viewBase.metricSet) && Objects.equals(this.title, viewBase.title)
            && Objects.equals(this.tableDirection, viewBase.tableDirection)
            && Objects.equals(this.groupBy, viewBase.groupBy) && Objects.equals(this.filter, viewBase.filter)
            && Objects.equals(this.fieldItemList, viewBase.fieldItemList) && Objects.equals(this.span, viewBase.span)
            && Objects.equals(this.spanField, viewBase.spanField) && Objects.equals(this.orderBy, viewBase.orderBy)
            && Objects.equals(this.latest, viewBase.latest) && Objects.equals(this.viewType, viewBase.viewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectorName,
            metricSet,
            title,
            tableDirection,
            groupBy,
            filter,
            fieldItemList,
            span,
            spanField,
            orderBy,
            latest,
            viewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewBase {\n");
        sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
        sb.append("    metricSet: ").append(toIndentedString(metricSet)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    tableDirection: ").append(toIndentedString(tableDirection)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    fieldItemList: ").append(toIndentedString(fieldItemList)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
        sb.append("    spanField: ").append(toIndentedString(spanField)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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
