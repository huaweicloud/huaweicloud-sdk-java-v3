package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

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
public class ListAnalyzersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzers")

    private List<AnalyzerSummary> analyzers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAnalyzersResponse withAnalyzers(List<AnalyzerSummary> analyzers) {
        this.analyzers = analyzers;
        return this;
    }

    public ListAnalyzersResponse addAnalyzersItem(AnalyzerSummary analyzersItem) {
        if (this.analyzers == null) {
            this.analyzers = new ArrayList<>();
        }
        this.analyzers.add(analyzersItem);
        return this;
    }

    public ListAnalyzersResponse withAnalyzers(Consumer<List<AnalyzerSummary>> analyzersSetter) {
        if (this.analyzers == null) {
            this.analyzers = new ArrayList<>();
        }
        analyzersSetter.accept(this.analyzers);
        return this;
    }

    /**
     * 分析器列表信息。
     * @return analyzers
     */
    public List<AnalyzerSummary> getAnalyzers() {
        return analyzers;
    }

    public void setAnalyzers(List<AnalyzerSummary> analyzers) {
        this.analyzers = analyzers;
    }

    public ListAnalyzersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAnalyzersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAnalyzersResponse that = (ListAnalyzersResponse) obj;
        return Objects.equals(this.analyzers, that.analyzers) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzers, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAnalyzersResponse {\n");
        sb.append("    analyzers: ").append(toIndentedString(analyzers)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
