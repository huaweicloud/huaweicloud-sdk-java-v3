package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAnalyzerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer")

    private AnalyzerSummary analyzer;

    public ShowAnalyzerResponse withAnalyzer(AnalyzerSummary analyzer) {
        this.analyzer = analyzer;
        return this;
    }

    public ShowAnalyzerResponse withAnalyzer(Consumer<AnalyzerSummary> analyzerSetter) {
        if (this.analyzer == null) {
            this.analyzer = new AnalyzerSummary();
            analyzerSetter.accept(this.analyzer);
        }

        return this;
    }

    /**
     * Get analyzer
     * @return analyzer
     */
    public AnalyzerSummary getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(AnalyzerSummary analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAnalyzerResponse that = (ShowAnalyzerResponse) obj;
        return Objects.equals(this.analyzer, that.analyzer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAnalyzerResponse {\n");
        sb.append("    analyzer: ").append(toIndentedString(analyzer)).append("\n");
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
