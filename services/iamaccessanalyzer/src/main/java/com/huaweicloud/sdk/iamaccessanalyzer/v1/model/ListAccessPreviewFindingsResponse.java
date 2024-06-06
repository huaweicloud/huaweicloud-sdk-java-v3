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
public class ListAccessPreviewFindingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "findings")

    private List<PreviewFinding> findings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAccessPreviewFindingsResponse withFindings(List<PreviewFinding> findings) {
        this.findings = findings;
        return this;
    }

    public ListAccessPreviewFindingsResponse addFindingsItem(PreviewFinding findingsItem) {
        if (this.findings == null) {
            this.findings = new ArrayList<>();
        }
        this.findings.add(findingsItem);
        return this;
    }

    public ListAccessPreviewFindingsResponse withFindings(Consumer<List<PreviewFinding>> findingsSetter) {
        if (this.findings == null) {
            this.findings = new ArrayList<>();
        }
        findingsSetter.accept(this.findings);
        return this;
    }

    /**
     * 访问预览生成的分析结果列表。
     * @return findings
     */
    public List<PreviewFinding> getFindings() {
        return findings;
    }

    public void setFindings(List<PreviewFinding> findings) {
        this.findings = findings;
    }

    public ListAccessPreviewFindingsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccessPreviewFindingsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAccessPreviewFindingsResponse that = (ListAccessPreviewFindingsResponse) obj;
        return Objects.equals(this.findings, that.findings) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(findings, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPreviewFindingsResponse {\n");
        sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
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
