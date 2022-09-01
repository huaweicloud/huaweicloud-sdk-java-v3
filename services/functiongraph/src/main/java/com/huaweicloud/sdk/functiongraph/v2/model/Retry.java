package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 重试策略
 */
public class Retry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    @JacksonXmlProperty(localName = "delay")

    private Long delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_attempts")

    @JacksonXmlProperty(localName = "max_attempts")

    private Long maxAttempts;

    public Retry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 重试策略名称，在单个流程中，名称需要唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Retry withDelay(Long delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 重试间隔，单位：秒。若不传，默认为1
     * minimum: 1
     * maximum: 30
     * @return delay
     */
    public Long getDelay() {
        return delay;
    }

    public void setDelay(Long delay) {
        this.delay = delay;
    }

    public Retry withMaxAttempts(Long maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }

    /**
     * 最大重试次数，。若不传，默认为3
     * minimum: 1
     * maximum: 8
     * @return maxAttempts
     */
    public Long getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(Long maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Retry retry = (Retry) o;
        return Objects.equals(this.name, retry.name) && Objects.equals(this.delay, retry.delay)
            && Objects.equals(this.maxAttempts, retry.maxAttempts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, delay, maxAttempts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Retry {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
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
