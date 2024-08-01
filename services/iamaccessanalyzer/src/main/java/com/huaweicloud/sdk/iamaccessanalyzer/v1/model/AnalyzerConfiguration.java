package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分析器的配置项。
 */
public class AnalyzerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_access")

    private AnalyzerConfigurationUnusedAccess unusedAccess;

    public AnalyzerConfiguration withUnusedAccess(AnalyzerConfigurationUnusedAccess unusedAccess) {
        this.unusedAccess = unusedAccess;
        return this;
    }

    public AnalyzerConfiguration withUnusedAccess(Consumer<AnalyzerConfigurationUnusedAccess> unusedAccessSetter) {
        if (this.unusedAccess == null) {
            this.unusedAccess = new AnalyzerConfigurationUnusedAccess();
            unusedAccessSetter.accept(this.unusedAccess);
        }

        return this;
    }

    /**
     * Get unusedAccess
     * @return unusedAccess
     */
    public AnalyzerConfigurationUnusedAccess getUnusedAccess() {
        return unusedAccess;
    }

    public void setUnusedAccess(AnalyzerConfigurationUnusedAccess unusedAccess) {
        this.unusedAccess = unusedAccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyzerConfiguration that = (AnalyzerConfiguration) obj;
        return Objects.equals(this.unusedAccess, that.unusedAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unusedAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzerConfiguration {\n");
        sb.append("    unusedAccess: ").append(toIndentedString(unusedAccess)).append("\n");
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
