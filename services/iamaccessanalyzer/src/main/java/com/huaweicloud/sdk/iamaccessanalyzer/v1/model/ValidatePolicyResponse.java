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
public class ValidatePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "findings")

    private List<ValidatePolicyFinding> findings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ValidatePolicyResponse withFindings(List<ValidatePolicyFinding> findings) {
        this.findings = findings;
        return this;
    }

    public ValidatePolicyResponse addFindingsItem(ValidatePolicyFinding findingsItem) {
        if (this.findings == null) {
            this.findings = new ArrayList<>();
        }
        this.findings.add(findingsItem);
        return this;
    }

    public ValidatePolicyResponse withFindings(Consumer<List<ValidatePolicyFinding>> findingsSetter) {
        if (this.findings == null) {
            this.findings = new ArrayList<>();
        }
        findingsSetter.accept(this.findings);
        return this;
    }

    /**
     * Get findings
     * @return findings
     */
    public List<ValidatePolicyFinding> getFindings() {
        return findings;
    }

    public void setFindings(List<ValidatePolicyFinding> findings) {
        this.findings = findings;
    }

    public ValidatePolicyResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ValidatePolicyResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ValidatePolicyResponse that = (ValidatePolicyResponse) obj;
        return Objects.equals(this.findings, that.findings) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(findings, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidatePolicyResponse {\n");
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
