package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 维度信息列表。       **约束限制** 不涉及 
 */
public class DimensionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**： 资源类型。 **约束限制** view参数取值为柱状图 条形图 环形柱状图 表格时，则filter_type参数不支持指定资源 **取值范围**： - all_instances: 全部资源 - specific_instances: 指定资源 **默认取值** 不涉及 
     */
    public static final class FilterTypeEnum {

        /**
         * Enum ALL_INSTANCES for value: "all_instances"
         */
        public static final FilterTypeEnum ALL_INSTANCES = new FilterTypeEnum("all_instances");

        /**
         * Enum SPECIFIC_INSTANCES for value: "specific_instances"
         */
        public static final FilterTypeEnum SPECIFIC_INSTANCES = new FilterTypeEnum("specific_instances");

        private static final Map<String, FilterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterTypeEnum> createStaticFields() {
            Map<String, FilterTypeEnum> map = new HashMap<>();
            map.put("all_instances", ALL_INSTANCES);
            map.put("specific_instances", SPECIFIC_INSTANCES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterTypeEnum(String value) {
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
        public static FilterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterTypeEnum(value));
        }

        public static FilterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterTypeEnum) {
                return this.value.equals(((FilterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_type")

    private FilterTypeEnum filterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public DimensionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 维度名称。 **约束限制** 不涉及 **取值范围**： 多维度用逗号分隔，各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/en-us/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。。必须以字母开头，只能包含0-9/a-z/A-Z/_/-，多维度用\",\"分隔，每个维度的最大长度为32。总长度为[1,131]个字符。目前最大支持4个维度。举例：单维度场景：instance_id；多维度场景：instance_id,disk **默认取值** 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DimensionInfo withFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * **参数解释**： 资源类型。 **约束限制** view参数取值为柱状图 条形图 环形柱状图 表格时，则filter_type参数不支持指定资源 **取值范围**： - all_instances: 全部资源 - specific_instances: 指定资源 **默认取值** 不涉及 
     * @return filterType
     */
    public FilterTypeEnum getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
    }

    public DimensionInfo withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public DimensionInfo addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public DimensionInfo withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**： 维度值列表。 **约束限制** 包含的维度值对象个数为[0,200] 
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionInfo that = (DimensionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.filterType, that.filterType)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filterType, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
