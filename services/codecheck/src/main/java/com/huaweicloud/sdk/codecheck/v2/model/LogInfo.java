package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LogInfo
 */
public class LogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis")

    private String analysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faq")

    private String faq;

    public LogInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 日志标题
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public LogInfo withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * 日志内容
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public LogInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 日志级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LogInfo withAnalysis(String analysis) {
        this.analysis = analysis;
        return this;
    }

    /**
     * 日志分析
     * @return analysis
     */
    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public LogInfo withFaq(String faq) {
        this.faq = faq;
        return this;
    }

    /**
     * 常见问题解答
     * @return faq
     */
    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogInfo logInfo = (LogInfo) o;
        return Objects.equals(this.displayName, logInfo.displayName) && Objects.equals(this.log, logInfo.log)
            && Objects.equals(this.level, logInfo.level) && Objects.equals(this.analysis, logInfo.analysis)
            && Objects.equals(this.faq, logInfo.faq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, log, level, analysis, faq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogInfo {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
        sb.append("    faq: ").append(toIndentedString(faq)).append("\n");
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
