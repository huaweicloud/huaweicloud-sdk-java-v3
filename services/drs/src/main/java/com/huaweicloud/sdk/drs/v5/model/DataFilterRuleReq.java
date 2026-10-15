package com.huaweicloud.sdk.drs.v5.model;

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
 * 数据过滤规则请求体
 */
public class DataFilterRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "general_filtering_list")

    private List<GeneralTransformationReq> generalFilteringList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_setting_list")

    private List<DataFilteringAdvancedSetting> advancedSettingList = null;

    /**
     * 校验请求的来源场景。用于区分数据过滤规则校验是来自数据同步任务执行场景，还是来自数据对比任务执行场景。 取值：job（数据同步任务执行时的过滤规则校验）/compare（数据对比任务执行时的过滤规则校验）
     */
    public static final class SourceEnum {

        /**
         * Enum JOB for value: "job"
         */
        public static final SourceEnum JOB = new SourceEnum("job");

        /**
         * Enum COMPARE for value: "compare"
         */
        public static final SourceEnum COMPARE = new SourceEnum("compare");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("job", JOB);
            map.put("compare", COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_filter_type")

    private String dataFilterType;

    public DataFilterRuleReq withGeneralFilteringList(List<GeneralTransformationReq> generalFilteringList) {
        this.generalFilteringList = generalFilteringList;
        return this;
    }

    public DataFilterRuleReq addGeneralFilteringListItem(GeneralTransformationReq generalFilteringListItem) {
        if (this.generalFilteringList == null) {
            this.generalFilteringList = new ArrayList<>();
        }
        this.generalFilteringList.add(generalFilteringListItem);
        return this;
    }

    public DataFilterRuleReq withGeneralFilteringList(
        Consumer<List<GeneralTransformationReq>> generalFilteringListSetter) {
        if (this.generalFilteringList == null) {
            this.generalFilteringList = new ArrayList<>();
        }
        generalFilteringListSetter.accept(this.generalFilteringList);
        return this;
    }

    /**
     * 数据过滤条件列表。包含需要校验的数据过滤规则信息，当data_filter_type为common（简单条件过滤）时，此参数为必填项。列表中的每个元素代表一组过滤条件，包含过滤对象列表和源库过滤条件SQL。包含以下关键字段：filter_object_list（过滤对象列表）/source_filter_condition（源库过滤条件SQL）。适用条件：data_filter_type=common时必填。
     * @return generalFilteringList
     */
    public List<GeneralTransformationReq> getGeneralFilteringList() {
        return generalFilteringList;
    }

    public void setGeneralFilteringList(List<GeneralTransformationReq> generalFilteringList) {
        this.generalFilteringList = generalFilteringList;
    }

    public DataFilterRuleReq withAdvancedSettingList(List<DataFilteringAdvancedSetting> advancedSettingList) {
        this.advancedSettingList = advancedSettingList;
        return this;
    }

    public DataFilterRuleReq addAdvancedSettingListItem(DataFilteringAdvancedSetting advancedSettingListItem) {
        if (this.advancedSettingList == null) {
            this.advancedSettingList = new ArrayList<>();
        }
        this.advancedSettingList.add(advancedSettingListItem);
        return this;
    }

    public DataFilterRuleReq withAdvancedSettingList(
        Consumer<List<DataFilteringAdvancedSetting>> advancedSettingListSetter) {
        if (this.advancedSettingList == null) {
            this.advancedSettingList = new ArrayList<>();
        }
        advancedSettingListSetter.accept(this.advancedSettingList);
        return this;
    }

    /**
     * 数据过滤高级设置列表。用于配置关联表场景下的高级过滤规则，包含数据库名、表名、列名、索引等详细过滤配置。当前Mysql-Mysql、Mysql-TaurusDB、TaurusDB-TaurusDB、TaurusDB-Mysql、Mysql-MariaDB、MariaDB-Mysql、MariaDB-TaurusDBL链路支持此功能。适用条件：data_filter_type=config时必填。
     * @return advancedSettingList
     */
    public List<DataFilteringAdvancedSetting> getAdvancedSettingList() {
        return advancedSettingList;
    }

    public void setAdvancedSettingList(List<DataFilteringAdvancedSetting> advancedSettingList) {
        this.advancedSettingList = advancedSettingList;
    }

    public DataFilterRuleReq withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * 校验请求的来源场景。用于区分数据过滤规则校验是来自数据同步任务执行场景，还是来自数据对比任务执行场景。 取值：job（数据同步任务执行时的过滤规则校验）/compare（数据对比任务执行时的过滤规则校验）
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public DataFilterRuleReq withDataFilterType(String dataFilterType) {
        this.dataFilterType = dataFilterType;
        return this;
    }

    /**
     * 数据过滤类型。用于指定数据过滤规则的模式，common表示简单条件过滤（单表过滤条件），config表示关联表过滤（多表关联条件过滤）。 取值：common（简单条件过滤）/config（关联表过滤）。 约束：当简单条件过滤是子查询时，需要先校验关联条件，关联条件校验成功之后，需要保存关联条件。
     * @return dataFilterType
     */
    public String getDataFilterType() {
        return dataFilterType;
    }

    public void setDataFilterType(String dataFilterType) {
        this.dataFilterType = dataFilterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilterRuleReq that = (DataFilterRuleReq) obj;
        return Objects.equals(this.generalFilteringList, that.generalFilteringList)
            && Objects.equals(this.advancedSettingList, that.advancedSettingList)
            && Objects.equals(this.source, that.source) && Objects.equals(this.dataFilterType, that.dataFilterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generalFilteringList, advancedSettingList, source, dataFilterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilterRuleReq {\n");
        sb.append("    generalFilteringList: ").append(toIndentedString(generalFilteringList)).append("\n");
        sb.append("    advancedSettingList: ").append(toIndentedString(advancedSettingList)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    dataFilterType: ").append(toIndentedString(dataFilterType)).append("\n");
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
