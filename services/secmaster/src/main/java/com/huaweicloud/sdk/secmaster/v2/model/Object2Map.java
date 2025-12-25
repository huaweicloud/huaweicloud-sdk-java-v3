package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 外层 Map&lt;String, Object&gt;，键为字符串，值为包含 Metric2Map 和 string 的对象
 */
public class Object2Map {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private Map<String, BigDecimal> metric = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public Object2Map withMetric(Map<String, BigDecimal> metric) {
        this.metric = metric;
        return this;
    }

    public Object2Map putMetricItem(String key, BigDecimal metricItem) {
        if (this.metric == null) {
            this.metric = new HashMap<>();
        }
        this.metric.put(key, metricItem);
        return this;
    }

    public Object2Map withMetric(Consumer<Map<String, BigDecimal>> metricSetter) {
        if (this.metric == null) {
            this.metric = new HashMap<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 表示一个 Map<String, BigDecimal>，用于存储高精度数值类型的指标
     * @return metric
     */
    public Map<String, BigDecimal> getMetric() {
        return metric;
    }

    public void setMetric(Map<String, BigDecimal> metric) {
        this.metric = metric;
    }

    public Object2Map withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 目录状态相关描述
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object2Map that = (Object2Map) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Object2Map {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
