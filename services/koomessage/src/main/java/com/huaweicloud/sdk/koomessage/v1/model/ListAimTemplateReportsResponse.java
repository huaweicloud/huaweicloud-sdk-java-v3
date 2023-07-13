package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListAimTemplateReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_reports")

    private List<AIMTemplateReport> templateReports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListAimTemplateReportsResponse withTemplateReports(List<AIMTemplateReport> templateReports) {
        this.templateReports = templateReports;
        return this;
    }

    public ListAimTemplateReportsResponse addTemplateReportsItem(AIMTemplateReport templateReportsItem) {
        if (this.templateReports == null) {
            this.templateReports = new ArrayList<>();
        }
        this.templateReports.add(templateReportsItem);
        return this;
    }

    public ListAimTemplateReportsResponse withTemplateReports(Consumer<List<AIMTemplateReport>> templateReportsSetter) {
        if (this.templateReports == null) {
            this.templateReports = new ArrayList<>();
        }
        templateReportsSetter.accept(this.templateReports);
        return this;
    }

    /**
     * 查询模板报表结果集。
     * @return templateReports
     */
    public List<AIMTemplateReport> getTemplateReports() {
        return templateReports;
    }

    public void setTemplateReports(List<AIMTemplateReport> templateReports) {
        this.templateReports = templateReports;
    }

    public ListAimTemplateReportsResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAimTemplateReportsResponse withPageInfo(Consumer<Page> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new Page();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public Page getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Page pageInfo) {
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
        ListAimTemplateReportsResponse that = (ListAimTemplateReportsResponse) obj;
        return Objects.equals(this.templateReports, that.templateReports)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateReports, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplateReportsResponse {\n");
        sb.append("    templateReports: ").append(toIndentedString(templateReports)).append("\n");
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
