package com.huaweicloud.sdk.secmaster.v1.model;

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
public class UpdateMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_type")

    private String metricType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_dimension")

    private Integer metricDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_ttl")

    private Long cacheTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_period")

    private Long reportPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_column")

    private String effectiveColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_query_range")

    private Integer maxQueryRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "derived_metrics")

    private List<MetricMetaDataDerivedMetrics> derivedMetrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compound_expression")

    private String compoundExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_format")

    private List<LayoutMetricFormat> metricFormat = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_expand_dim")

    private MetricDimensionExpandParam metricExpandDim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public UpdateMetricsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateMetricsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 指标Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateMetricsResponse withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * 指标类型， 当前仅支持创建日志类型指标
     * @return metricType
     */
    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public UpdateMetricsResponse withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型, 当前仅支持创建统计指标
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public UpdateMetricsResponse withMetricDimension(Integer metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * 指标结果维度，0维：单个数字，2维：图表或表格，3+维：多标签图表, metric_type为DERIVED必填，其他类型选填（COMPOUND时必为0）
     * minimum: 0
     * maximum: 5
     * @return metricDimension
     */
    public Integer getMetricDimension() {
        return metricDimension;
    }

    public void setMetricDimension(Integer metricDimension) {
        this.metricDimension = metricDimension;
    }

    public UpdateMetricsResponse withCacheTtl(Long cacheTtl) {
        this.cacheTtl = cacheTtl;
        return this;
    }

    /**
     * 缓存生命周期，单位s
     * minimum: 0
     * maximum: 86400
     * @return cacheTtl
     */
    public Long getCacheTtl() {
        return cacheTtl;
    }

    public void setCacheTtl(Long cacheTtl) {
        this.cacheTtl = cacheTtl;
    }

    public UpdateMetricsResponse withReportPeriod(Long reportPeriod) {
        this.reportPeriod = reportPeriod;
        return this;
    }

    /**
     * 上报周期，埋点指标时必填，单位s
     * minimum: 0
     * maximum: 864000
     * @return reportPeriod
     */
    public Long getReportPeriod() {
        return reportPeriod;
    }

    public void setReportPeriod(Long reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public UpdateMetricsResponse withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否为系统指标
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public UpdateMetricsResponse withEffectiveColumn(String effectiveColumn) {
        this.effectiveColumn = effectiveColumn;
        return this;
    }

    /**
     * 生效的列, 当有该参数时，使用指定列作为指标数据结果
     * @return effectiveColumn
     */
    public String getEffectiveColumn() {
        return effectiveColumn;
    }

    public void setEffectiveColumn(String effectiveColumn) {
        this.effectiveColumn = effectiveColumn;
    }

    public UpdateMetricsResponse withMaxQueryRange(Integer maxQueryRange) {
        this.maxQueryRange = maxQueryRange;
        return this;
    }

    /**
     * 指标支持的最大检索范围，单位：天；复合指标时，数值为derived_metrics列表元素中最小值
     * minimum: 0
     * maximum: 864000
     * @return maxQueryRange
     */
    public Integer getMaxQueryRange() {
        return maxQueryRange;
    }

    public void setMaxQueryRange(Integer maxQueryRange) {
        this.maxQueryRange = maxQueryRange;
    }

    public UpdateMetricsResponse withDerivedMetrics(List<MetricMetaDataDerivedMetrics> derivedMetrics) {
        this.derivedMetrics = derivedMetrics;
        return this;
    }

    public UpdateMetricsResponse addDerivedMetricsItem(MetricMetaDataDerivedMetrics derivedMetricsItem) {
        if (this.derivedMetrics == null) {
            this.derivedMetrics = new ArrayList<>();
        }
        this.derivedMetrics.add(derivedMetricsItem);
        return this;
    }

    public UpdateMetricsResponse withDerivedMetrics(Consumer<List<MetricMetaDataDerivedMetrics>> derivedMetricsSetter) {
        if (this.derivedMetrics == null) {
            this.derivedMetrics = new ArrayList<>();
        }
        derivedMetricsSetter.accept(this.derivedMetrics);
        return this;
    }

    /**
     * 衍生指标列表，非复合指标时只有一个元素，复合指标时，为各衍生指标的定义
     * @return derivedMetrics
     */
    public List<MetricMetaDataDerivedMetrics> getDerivedMetrics() {
        return derivedMetrics;
    }

    public void setDerivedMetrics(List<MetricMetaDataDerivedMetrics> derivedMetrics) {
        this.derivedMetrics = derivedMetrics;
    }

    public UpdateMetricsResponse withCompoundExpression(String compoundExpression) {
        this.compoundExpression = compoundExpression;
        return this;
    }

    /**
     * metric_type为DERIVED时填写, 复合指标的表达式
     * @return compoundExpression
     */
    public String getCompoundExpression() {
        return compoundExpression;
    }

    public void setCompoundExpression(String compoundExpression) {
        this.compoundExpression = compoundExpression;
    }

    public UpdateMetricsResponse withMetricFormat(List<LayoutMetricFormat> metricFormat) {
        this.metricFormat = metricFormat;
        return this;
    }

    public UpdateMetricsResponse addMetricFormatItem(LayoutMetricFormat metricFormatItem) {
        if (this.metricFormat == null) {
            this.metricFormat = new ArrayList<>();
        }
        this.metricFormat.add(metricFormatItem);
        return this;
    }

    public UpdateMetricsResponse withMetricFormat(Consumer<List<LayoutMetricFormat>> metricFormatSetter) {
        if (this.metricFormat == null) {
            this.metricFormat = new ArrayList<>();
        }
        metricFormatSetter.accept(this.metricFormat);
        return this;
    }

    /**
     * 指标格式
     * @return metricFormat
     */
    public List<LayoutMetricFormat> getMetricFormat() {
        return metricFormat;
    }

    public void setMetricFormat(List<LayoutMetricFormat> metricFormat) {
        this.metricFormat = metricFormat;
    }

    public UpdateMetricsResponse withMetricExpandDim(MetricDimensionExpandParam metricExpandDim) {
        this.metricExpandDim = metricExpandDim;
        return this;
    }

    public UpdateMetricsResponse withMetricExpandDim(Consumer<MetricDimensionExpandParam> metricExpandDimSetter) {
        if (this.metricExpandDim == null) {
            this.metricExpandDim = new MetricDimensionExpandParam();
            metricExpandDimSetter.accept(this.metricExpandDim);
        }

        return this;
    }

    /**
     * Get metricExpandDim
     * @return metricExpandDim
     */
    public MetricDimensionExpandParam getMetricExpandDim() {
        return metricExpandDim;
    }

    public void setMetricExpandDim(MetricDimensionExpandParam metricExpandDim) {
        this.metricExpandDim = metricExpandDim;
    }

    public UpdateMetricsResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安全云脑版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateMetricsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMetricsResponse that = (UpdateMetricsResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.metricType, that.metricType) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.metricDimension, that.metricDimension)
            && Objects.equals(this.cacheTtl, that.cacheTtl) && Objects.equals(this.reportPeriod, that.reportPeriod)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn)
            && Objects.equals(this.effectiveColumn, that.effectiveColumn)
            && Objects.equals(this.maxQueryRange, that.maxQueryRange)
            && Objects.equals(this.derivedMetrics, that.derivedMetrics)
            && Objects.equals(this.compoundExpression, that.compoundExpression)
            && Objects.equals(this.metricFormat, that.metricFormat)
            && Objects.equals(this.metricExpandDim, that.metricExpandDim) && Objects.equals(this.version, that.version)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            metricType,
            dataType,
            metricDimension,
            cacheTtl,
            reportPeriod,
            isBuiltIn,
            effectiveColumn,
            maxQueryRange,
            derivedMetrics,
            compoundExpression,
            metricFormat,
            metricExpandDim,
            version,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMetricsResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    metricDimension: ").append(toIndentedString(metricDimension)).append("\n");
        sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
        sb.append("    reportPeriod: ").append(toIndentedString(reportPeriod)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    effectiveColumn: ").append(toIndentedString(effectiveColumn)).append("\n");
        sb.append("    maxQueryRange: ").append(toIndentedString(maxQueryRange)).append("\n");
        sb.append("    derivedMetrics: ").append(toIndentedString(derivedMetrics)).append("\n");
        sb.append("    compoundExpression: ").append(toIndentedString(compoundExpression)).append("\n");
        sb.append("    metricFormat: ").append(toIndentedString(metricFormat)).append("\n");
        sb.append("    metricExpandDim: ").append(toIndentedString(metricExpandDim)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
