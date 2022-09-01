package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的所有输入输出监控信息。
 */
public class ShowJobMonitorInfoRespPayloadJobsMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    @JacksonXmlProperty(localName = "sources")

    private List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sinks")

    @JacksonXmlProperty(localName = "sinks")

    private List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_read_rate")

    @JacksonXmlProperty(localName = "total_read_rate")

    private Double totalReadRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_write_rate")

    @JacksonXmlProperty(localName = "total_write_rate")

    private Double totalWriteRate;

    public ShowJobMonitorInfoRespPayloadJobsMetrics withSources(
        List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sources) {
        this.sources = sources;
        return this;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics addSourcesItem(
        ShowJobMonitorInfoRespPayloadJobsMetricsSources sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics withSources(
        Consumer<List<ShowJobMonitorInfoRespPayloadJobsMetricsSources>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 所有输入流。
     * @return sources
     */
    public List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> getSources() {
        return sources;
    }

    public void setSources(List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sources) {
        this.sources = sources;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics withSinks(
        List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sinks) {
        this.sinks = sinks;
        return this;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics addSinksItem(
        ShowJobMonitorInfoRespPayloadJobsMetricsSources sinksItem) {
        if (this.sinks == null) {
            this.sinks = new ArrayList<>();
        }
        this.sinks.add(sinksItem);
        return this;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics withSinks(
        Consumer<List<ShowJobMonitorInfoRespPayloadJobsMetricsSources>> sinksSetter) {
        if (this.sinks == null) {
            this.sinks = new ArrayList<>();
        }
        sinksSetter.accept(this.sinks);
        return this;
    }

    /**
     * 所有输出流。
     * @return sinks
     */
    public List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> getSinks() {
        return sinks;
    }

    public void setSinks(List<ShowJobMonitorInfoRespPayloadJobsMetricsSources> sinks) {
        this.sinks = sinks;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics withTotalReadRate(Double totalReadRate) {
        this.totalReadRate = totalReadRate;
        return this;
    }

    /**
     * 总输入速率
     * @return totalReadRate
     */
    public Double getTotalReadRate() {
        return totalReadRate;
    }

    public void setTotalReadRate(Double totalReadRate) {
        this.totalReadRate = totalReadRate;
    }

    public ShowJobMonitorInfoRespPayloadJobsMetrics withTotalWriteRate(Double totalWriteRate) {
        this.totalWriteRate = totalWriteRate;
        return this;
    }

    /**
     * 总输出速率
     * @return totalWriteRate
     */
    public Double getTotalWriteRate() {
        return totalWriteRate;
    }

    public void setTotalWriteRate(Double totalWriteRate) {
        this.totalWriteRate = totalWriteRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobMonitorInfoRespPayloadJobsMetrics showJobMonitorInfoRespPayloadJobsMetrics =
            (ShowJobMonitorInfoRespPayloadJobsMetrics) o;
        return Objects.equals(this.sources, showJobMonitorInfoRespPayloadJobsMetrics.sources)
            && Objects.equals(this.sinks, showJobMonitorInfoRespPayloadJobsMetrics.sinks)
            && Objects.equals(this.totalReadRate, showJobMonitorInfoRespPayloadJobsMetrics.totalReadRate)
            && Objects.equals(this.totalWriteRate, showJobMonitorInfoRespPayloadJobsMetrics.totalWriteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources, sinks, totalReadRate, totalWriteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobMonitorInfoRespPayloadJobsMetrics {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
        sb.append("    totalReadRate: ").append(toIndentedString(totalReadRate)).append("\n");
        sb.append("    totalWriteRate: ").append(toIndentedString(totalWriteRate)).append("\n");
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
