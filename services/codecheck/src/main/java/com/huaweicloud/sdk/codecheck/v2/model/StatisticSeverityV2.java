package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * StatisticSeverityV2
 */
public class StatisticSeverityV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    @JacksonXmlProperty(localName = "critical")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "major")

    @JacksonXmlProperty(localName = "major")

    private Integer major;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minor")

    @JacksonXmlProperty(localName = "minor")

    private Integer minor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    @JacksonXmlProperty(localName = "suggestion")

    private Integer suggestion;

    public StatisticSeverityV2 withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 致命问题数
     * @return critical
     */
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public StatisticSeverityV2 withMajor(Integer major) {
        this.major = major;
        return this;
    }

    /**
     * 严重问题数
     * @return major
     */
    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public StatisticSeverityV2 withMinor(Integer minor) {
        this.minor = minor;
        return this;
    }

    /**
     * 一般问题数
     * @return minor
     */
    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    public StatisticSeverityV2 withSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 提示问题数
     * @return suggestion
     */
    public Integer getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticSeverityV2 statisticSeverityV2 = (StatisticSeverityV2) o;
        return Objects.equals(this.critical, statisticSeverityV2.critical)
            && Objects.equals(this.major, statisticSeverityV2.major)
            && Objects.equals(this.minor, statisticSeverityV2.minor)
            && Objects.equals(this.suggestion, statisticSeverityV2.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical, major, minor, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticSeverityV2 {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    major: ").append(toIndentedString(major)).append("\n");
        sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
