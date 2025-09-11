package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ***参数解释*** 批量查询指标数据请求体 ***约束限制*** 不涉及 
 */
public class BatchListSpecifiedMetricDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_dimension")

    private String metricDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public BatchListSpecifiedMetricDataRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public BatchListSpecifiedMetricDataRequestBody withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**： 资源的监控指标名称，各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 必须以字母开头，只能包含0-9/a-z/A-Z/_/-。字符长度最短为1，最大为64。如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率。         **默认取值**： 不涉及。 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public BatchListSpecifiedMetricDataRequestBody withMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * **参数解释**: 指标维度, 多维度逗号分隔。 **约束限制**: 不涉及。 **取值范围**: 必须以字母开头，只能包含0-9/a-z/A-Z/_/-/,。每个维度必须以字母开头，每个维度长度最短1，最长32，多个维度直接用,分隔。 **默认取值**: 不涉及。 
     * @return metricDimension
     */
    public String getMetricDimension() {
        return metricDimension;
    }

    public void setMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
    }

    public BatchListSpecifiedMetricDataRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释**: 查询监控数据的开始时间，格式为时间戳, 单位毫秒。 **约束限制**: from必须小于to, to和from的时间间隔必须在5分钟内。 **取值范围**: 最小值为0。 **默认取值**: 不涉及。 
     * minimum: 0
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public BatchListSpecifiedMetricDataRequestBody withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释**: 查询监控数据的结束时间，格式为时间戳, 单位毫秒。 **约束限制**: from必须小于to, to和from的时间间隔必须在5分钟内。 **取值范围**: 最小值为0。 **默认取值**: 不涉及。 
     * minimum: 0
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public BatchListSpecifiedMetricDataRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 分页大小。 **约束限制**: 不涉及。 **取值范围**: 最小值为1，最大值为1000。 **默认取值**: 100。 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public BatchListSpecifiedMetricDataRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 分页偏移量。 **约束限制**: 不涉及。 **取值范围**: 最小值为0，最大值为9999999。 **默认取值**: 0。 
     * minimum: 0
     * maximum: 9999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListSpecifiedMetricDataRequestBody that = (BatchListSpecifiedMetricDataRequestBody) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.metricDimension, that.metricDimension) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, metricName, metricDimension, from, to, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListSpecifiedMetricDataRequestBody {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricDimension: ").append(toIndentedString(metricDimension)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
