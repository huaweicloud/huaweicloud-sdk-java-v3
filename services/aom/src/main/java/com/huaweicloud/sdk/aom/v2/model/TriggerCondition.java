package com.huaweicloud.sdk.aom.v2.model;

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
 * TriggerCondition
 */
public class TriggerCondition {

    /**
     * 指标查询模式。 - “AOM”：AOM原生 - “PROM”：AOM Prometheus - “NATIVE_PROM”：原生Prometheus
     */
    public static final class MetricQueryModeEnum {

        /**
         * Enum AOM for value: "AOM"
         */
        public static final MetricQueryModeEnum AOM = new MetricQueryModeEnum("AOM");

        /**
         * Enum PROM for value: "PROM"
         */
        public static final MetricQueryModeEnum PROM = new MetricQueryModeEnum("PROM");

        /**
         * Enum NATIVE_PROM for value: "NATIVE_PROM"
         */
        public static final MetricQueryModeEnum NATIVE_PROM = new MetricQueryModeEnum("NATIVE_PROM");

        private static final Map<String, MetricQueryModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricQueryModeEnum> createStaticFields() {
            Map<String, MetricQueryModeEnum> map = new HashMap<>();
            map.put("AOM", AOM);
            map.put("PROM", PROM);
            map.put("NATIVE_PROM", NATIVE_PROM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricQueryModeEnum(String value) {
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
        public static MetricQueryModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricQueryModeEnum(value));
        }

        public static MetricQueryModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricQueryModeEnum) {
                return this.value.equals(((MetricQueryModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_query_mode")

    private MetricQueryModeEnum metricQueryMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_namespace")

    private String metricNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_unit")

    private String metricUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_labels")

    private List<String> metricLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promql")

    private String promql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promql_expr")

    private List<String> promqlExpr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_times")

    private String triggerTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_interval")

    private String triggerInterval;

    /**
     * 触发频率的类型： - “FIXED_RATE”：固定间隔 - “HOURLY”：每小时 - “DAILY”：每天 - “WEEKLY”：每周 - “CRON”：Cron表达式
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum FIXED_RATE for value: "FIXED_RATE"
         */
        public static final TriggerTypeEnum FIXED_RATE = new TriggerTypeEnum("FIXED_RATE");

        /**
         * Enum HOURLY for value: "HOURLY"
         */
        public static final TriggerTypeEnum HOURLY = new TriggerTypeEnum("HOURLY");

        /**
         * Enum DAILY for value: "DAILY"
         */
        public static final TriggerTypeEnum DAILY = new TriggerTypeEnum("DAILY");

        /**
         * Enum WEEKLY for value: "WEEKLY"
         */
        public static final TriggerTypeEnum WEEKLY = new TriggerTypeEnum("WEEKLY");

        /**
         * Enum CRON for value: "CRON"
         */
        public static final TriggerTypeEnum CRON = new TriggerTypeEnum("CRON");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("FIXED_RATE", FIXED_RATE);
            map.put("HOURLY", HOURLY);
            map.put("DAILY", DAILY);
            map.put("WEEKLY", WEEKLY);
            map.put("CRON", CRON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promql_for")

    private String promqlFor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_type")

    private String aggregationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholds")

    private Map<String, String> thresholds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_window")

    private String aggregationWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb")

    private CmdbInfo cmdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_match")

    private String queryMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_param")

    private String queryParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_monitor_level")

    private String aomMonitorLevel;

    /**
     * 聚合方式。 - “by”：不分组 - “avg” - “max” - “min” - “sum”
     */
    public static final class AggregateTypeEnum {

        /**
         * Enum BY for value: "by"
         */
        public static final AggregateTypeEnum BY = new AggregateTypeEnum("by");

        /**
         * Enum AVG for value: "avg"
         */
        public static final AggregateTypeEnum AVG = new AggregateTypeEnum("avg");

        /**
         * Enum MAX for value: "max"
         */
        public static final AggregateTypeEnum MAX = new AggregateTypeEnum("max");

        /**
         * Enum MIN for value: "min"
         */
        public static final AggregateTypeEnum MIN = new AggregateTypeEnum("min");

        /**
         * Enum SUM for value: "sum"
         */
        public static final AggregateTypeEnum SUM = new AggregateTypeEnum("sum");

        private static final Map<String, AggregateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AggregateTypeEnum> createStaticFields() {
            Map<String, AggregateTypeEnum> map = new HashMap<>();
            map.put("by", BY);
            map.put("avg", AVG);
            map.put("max", MAX);
            map.put("min", MIN);
            map.put("sum", SUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AggregateTypeEnum(String value) {
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
        public static AggregateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AggregateTypeEnum(value));
        }

        public static AggregateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AggregateTypeEnum) {
                return this.value.equals(((AggregateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate_type")

    private AggregateTypeEnum aggregateType;

    /**
     * 当配置方式为全量指标时可选择的指标运算方式。 - “single”：单个指标进行运算 - “mix”：多个指标进行混合运算
     */
    public static final class MetricStatisticMethodEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final MetricStatisticMethodEnum SINGLE = new MetricStatisticMethodEnum("single");

        /**
         * Enum MIX for value: "mix"
         */
        public static final MetricStatisticMethodEnum MIX = new MetricStatisticMethodEnum("mix");

        private static final Map<String, MetricStatisticMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricStatisticMethodEnum> createStaticFields() {
            Map<String, MetricStatisticMethodEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("mix", MIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricStatisticMethodEnum(String value) {
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
        public static MetricStatisticMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricStatisticMethodEnum(value));
        }

        public static MetricStatisticMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricStatisticMethodEnum) {
                return this.value.equals(((MetricStatisticMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_statistic_method")

    private MetricStatisticMethodEnum metricStatisticMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mix_promql")

    private String mixPromql;

    public TriggerCondition withMetricQueryMode(MetricQueryModeEnum metricQueryMode) {
        this.metricQueryMode = metricQueryMode;
        return this;
    }

    /**
     * 指标查询模式。 - “AOM”：AOM原生 - “PROM”：AOM Prometheus - “NATIVE_PROM”：原生Prometheus
     * @return metricQueryMode
     */
    public MetricQueryModeEnum getMetricQueryMode() {
        return metricQueryMode;
    }

    public void setMetricQueryMode(MetricQueryModeEnum metricQueryMode) {
        this.metricQueryMode = metricQueryMode;
    }

    public TriggerCondition withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * 指标命名空间。
     * @return metricNamespace
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    public TriggerCondition withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public TriggerCondition withMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
        return this;
    }

    /**
     * 指标单位。
     * @return metricUnit
     */
    public String getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public TriggerCondition withMetricLabels(List<String> metricLabels) {
        this.metricLabels = metricLabels;
        return this;
    }

    public TriggerCondition addMetricLabelsItem(String metricLabelsItem) {
        if (this.metricLabels == null) {
            this.metricLabels = new ArrayList<>();
        }
        this.metricLabels.add(metricLabelsItem);
        return this;
    }

    public TriggerCondition withMetricLabels(Consumer<List<String>> metricLabelsSetter) {
        if (this.metricLabels == null) {
            this.metricLabels = new ArrayList<>();
        }
        metricLabelsSetter.accept(this.metricLabels);
        return this;
    }

    /**
     * 指标维度。
     * @return metricLabels
     */
    public List<String> getMetricLabels() {
        return metricLabels;
    }

    public void setMetricLabels(List<String> metricLabels) {
        this.metricLabels = metricLabels;
    }

    public TriggerCondition withPromql(String promql) {
        this.promql = promql;
        return this;
    }

    /**
     * Prometheus语句。
     * @return promql
     */
    public String getPromql() {
        return promql;
    }

    public void setPromql(String promql) {
        this.promql = promql;
    }

    public TriggerCondition withPromqlExpr(List<String> promqlExpr) {
        this.promqlExpr = promqlExpr;
        return this;
    }

    public TriggerCondition addPromqlExprItem(String promqlExprItem) {
        if (this.promqlExpr == null) {
            this.promqlExpr = new ArrayList<>();
        }
        this.promqlExpr.add(promqlExprItem);
        return this;
    }

    public TriggerCondition withPromqlExpr(Consumer<List<String>> promqlExprSetter) {
        if (this.promqlExpr == null) {
            this.promqlExpr = new ArrayList<>();
        }
        promqlExprSetter.accept(this.promqlExpr);
        return this;
    }

    /**
     * Prometheus语句模板。
     * @return promqlExpr
     */
    public List<String> getPromqlExpr() {
        return promqlExpr;
    }

    public void setPromqlExpr(List<String> promqlExpr) {
        this.promqlExpr = promqlExpr;
    }

    public TriggerCondition withTriggerTimes(String triggerTimes) {
        this.triggerTimes = triggerTimes;
        return this;
    }

    /**
     * 连续周期个数。
     * @return triggerTimes
     */
    public String getTriggerTimes() {
        return triggerTimes;
    }

    public void setTriggerTimes(String triggerTimes) {
        this.triggerTimes = triggerTimes;
    }

    public TriggerCondition withTriggerInterval(String triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }

    /**
     * 检查频率周期。 - 当trigger_type 为“HOURLY”时，填“” - 当trigger_type为“DAILY”时，格式为：“小时” 例如 每天凌晨三点\"03:00\" - 当trigger_type为“WEEKLY”时，格式为：“星期 小时”例如每周一凌晨三点 “1 03:00” - 当trigger_type为“CRON”时，格式为 标准CRON表达式 - 当trigger_type为“FIXED_RATE”时，秒的取值为15s，30s，分钟为 1~59，小时为 1~24。例如：“15s”，“30s”，“1min”，“1h”
     * @return triggerInterval
     */
    public String getTriggerInterval() {
        return triggerInterval;
    }

    public void setTriggerInterval(String triggerInterval) {
        this.triggerInterval = triggerInterval;
    }

    public TriggerCondition withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发频率的类型： - “FIXED_RATE”：固定间隔 - “HOURLY”：每小时 - “DAILY”：每天 - “WEEKLY”：每周 - “CRON”：Cron表达式
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public TriggerCondition withPromqlFor(String promqlFor) {
        this.promqlFor = promqlFor;
        return this;
    }

    /**
     * Prometheus原生监控时长。
     * @return promqlFor
     */
    public String getPromqlFor() {
        return promqlFor;
    }

    public void setPromqlFor(String promqlFor) {
        this.promqlFor = promqlFor;
    }

    public TriggerCondition withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * 统计方式： - average - minimum - maximum - sum - sampleCount
     * @return aggregationType
     */
    public String getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    public TriggerCondition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 判断条件：“>”,“<”,“=”,“>=”,“<=”
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public TriggerCondition withThresholds(Map<String, String> thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public TriggerCondition putThresholdsItem(String key, String thresholdsItem) {
        if (this.thresholds == null) {
            this.thresholds = new HashMap<>();
        }
        this.thresholds.put(key, thresholdsItem);
        return this;
    }

    public TriggerCondition withThresholds(Consumer<Map<String, String>> thresholdsSetter) {
        if (this.thresholds == null) {
            this.thresholds = new HashMap<>();
        }
        thresholdsSetter.accept(this.thresholds);
        return this;
    }

    /**
     * 键值对形式，键为告警级别，值为告警阈值
     * @return thresholds
     */
    public Map<String, String> getThresholds() {
        return thresholds;
    }

    public void setThresholds(Map<String, String> thresholds) {
        this.thresholds = thresholds;
    }

    public TriggerCondition withAggregationWindow(String aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
        return this;
    }

    /**
     * 统计周期。 - “15s” - “30s” - “1m” - “5m” - “15m” - “1h”
     * @return aggregationWindow
     */
    public String getAggregationWindow() {
        return aggregationWindow;
    }

    public void setAggregationWindow(String aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
    }

    public TriggerCondition withCmdb(CmdbInfo cmdb) {
        this.cmdb = cmdb;
        return this;
    }

    public TriggerCondition withCmdb(Consumer<CmdbInfo> cmdbSetter) {
        if (this.cmdb == null) {
            this.cmdb = new CmdbInfo();
            cmdbSetter.accept(this.cmdb);
        }

        return this;
    }

    /**
     * Get cmdb
     * @return cmdb
     */
    public CmdbInfo getCmdb() {
        return cmdb;
    }

    public void setCmdb(CmdbInfo cmdb) {
        this.cmdb = cmdb;
    }

    public TriggerCondition withQueryMatch(String queryMatch) {
        this.queryMatch = queryMatch;
        return this;
    }

    /**
     * 查询筛选条件。
     * @return queryMatch
     */
    public String getQueryMatch() {
        return queryMatch;
    }

    public void setQueryMatch(String queryMatch) {
        this.queryMatch = queryMatch;
    }

    public TriggerCondition withQueryParam(String queryParam) {
        this.queryParam = queryParam;
        return this;
    }

    /**
     * 查询参数
     * @return queryParam
     */
    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public TriggerCondition withAomMonitorLevel(String aomMonitorLevel) {
        this.aomMonitorLevel = aomMonitorLevel;
        return this;
    }

    /**
     * 监控层级。
     * @return aomMonitorLevel
     */
    public String getAomMonitorLevel() {
        return aomMonitorLevel;
    }

    public void setAomMonitorLevel(String aomMonitorLevel) {
        this.aomMonitorLevel = aomMonitorLevel;
    }

    public TriggerCondition withAggregateType(AggregateTypeEnum aggregateType) {
        this.aggregateType = aggregateType;
        return this;
    }

    /**
     * 聚合方式。 - “by”：不分组 - “avg” - “max” - “min” - “sum”
     * @return aggregateType
     */
    public AggregateTypeEnum getAggregateType() {
        return aggregateType;
    }

    public void setAggregateType(AggregateTypeEnum aggregateType) {
        this.aggregateType = aggregateType;
    }

    public TriggerCondition withMetricStatisticMethod(MetricStatisticMethodEnum metricStatisticMethod) {
        this.metricStatisticMethod = metricStatisticMethod;
        return this;
    }

    /**
     * 当配置方式为全量指标时可选择的指标运算方式。 - “single”：单个指标进行运算 - “mix”：多个指标进行混合运算
     * @return metricStatisticMethod
     */
    public MetricStatisticMethodEnum getMetricStatisticMethod() {
        return metricStatisticMethod;
    }

    public void setMetricStatisticMethod(MetricStatisticMethodEnum metricStatisticMethod) {
        this.metricStatisticMethod = metricStatisticMethod;
    }

    public TriggerCondition withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 混合运算的表达式。
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public TriggerCondition withMixPromql(String mixPromql) {
        this.mixPromql = mixPromql;
        return this;
    }

    /**
     * 混合运算的promQL。
     * @return mixPromql
     */
    public String getMixPromql() {
        return mixPromql;
    }

    public void setMixPromql(String mixPromql) {
        this.mixPromql = mixPromql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerCondition that = (TriggerCondition) obj;
        return Objects.equals(this.metricQueryMode, that.metricQueryMode)
            && Objects.equals(this.metricNamespace, that.metricNamespace)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.metricUnit, that.metricUnit)
            && Objects.equals(this.metricLabels, that.metricLabels) && Objects.equals(this.promql, that.promql)
            && Objects.equals(this.promqlExpr, that.promqlExpr) && Objects.equals(this.triggerTimes, that.triggerTimes)
            && Objects.equals(this.triggerInterval, that.triggerInterval)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.promqlFor, that.promqlFor)
            && Objects.equals(this.aggregationType, that.aggregationType)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.thresholds, that.thresholds)
            && Objects.equals(this.aggregationWindow, that.aggregationWindow) && Objects.equals(this.cmdb, that.cmdb)
            && Objects.equals(this.queryMatch, that.queryMatch) && Objects.equals(this.queryParam, that.queryParam)
            && Objects.equals(this.aomMonitorLevel, that.aomMonitorLevel)
            && Objects.equals(this.aggregateType, that.aggregateType)
            && Objects.equals(this.metricStatisticMethod, that.metricStatisticMethod)
            && Objects.equals(this.expression, that.expression) && Objects.equals(this.mixPromql, that.mixPromql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricQueryMode,
            metricNamespace,
            metricName,
            metricUnit,
            metricLabels,
            promql,
            promqlExpr,
            triggerTimes,
            triggerInterval,
            triggerType,
            promqlFor,
            aggregationType,
            operator,
            thresholds,
            aggregationWindow,
            cmdb,
            queryMatch,
            queryParam,
            aomMonitorLevel,
            aggregateType,
            metricStatisticMethod,
            expression,
            mixPromql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerCondition {\n");
        sb.append("    metricQueryMode: ").append(toIndentedString(metricQueryMode)).append("\n");
        sb.append("    metricNamespace: ").append(toIndentedString(metricNamespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricUnit: ").append(toIndentedString(metricUnit)).append("\n");
        sb.append("    metricLabels: ").append(toIndentedString(metricLabels)).append("\n");
        sb.append("    promql: ").append(toIndentedString(promql)).append("\n");
        sb.append("    promqlExpr: ").append(toIndentedString(promqlExpr)).append("\n");
        sb.append("    triggerTimes: ").append(toIndentedString(triggerTimes)).append("\n");
        sb.append("    triggerInterval: ").append(toIndentedString(triggerInterval)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    promqlFor: ").append(toIndentedString(promqlFor)).append("\n");
        sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    aggregationWindow: ").append(toIndentedString(aggregationWindow)).append("\n");
        sb.append("    cmdb: ").append(toIndentedString(cmdb)).append("\n");
        sb.append("    queryMatch: ").append(toIndentedString(queryMatch)).append("\n");
        sb.append("    queryParam: ").append(toIndentedString(queryParam)).append("\n");
        sb.append("    aomMonitorLevel: ").append(toIndentedString(aomMonitorLevel)).append("\n");
        sb.append("    aggregateType: ").append(toIndentedString(aggregateType)).append("\n");
        sb.append("    metricStatisticMethod: ").append(toIndentedString(metricStatisticMethod)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    mixPromql: ").append(toIndentedString(mixPromql)).append("\n");
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
