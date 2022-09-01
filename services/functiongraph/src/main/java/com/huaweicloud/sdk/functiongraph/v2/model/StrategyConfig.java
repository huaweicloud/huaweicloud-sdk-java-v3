package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 函数策略配置。
 */
public class StrategyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    @JacksonXmlProperty(localName = "concurrency")

    private Integer concurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent_num")

    @JacksonXmlProperty(localName = "concurrent_num")

    private Integer concurrentNum;

    public StrategyConfig withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * 单函数最大实例数，v1取值0和-1，v2取值-1到1000
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public StrategyConfig withConcurrentNum(Integer concurrentNum) {
        this.concurrentNum = concurrentNum;
        return this;
    }

    /**
     * 单实例最大并发数，v2版本才支持，取值-1到200000
     * @return concurrentNum
     */
    public Integer getConcurrentNum() {
        return concurrentNum;
    }

    public void setConcurrentNum(Integer concurrentNum) {
        this.concurrentNum = concurrentNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StrategyConfig strategyConfig = (StrategyConfig) o;
        return Objects.equals(this.concurrency, strategyConfig.concurrency)
            && Objects.equals(this.concurrentNum, strategyConfig.concurrentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(concurrency, concurrentNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StrategyConfig {\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    concurrentNum: ").append(toIndentedString(concurrentNum)).append("\n");
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
