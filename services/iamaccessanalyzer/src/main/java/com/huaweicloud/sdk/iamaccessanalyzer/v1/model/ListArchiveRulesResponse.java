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
public class ListArchiveRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_rules")

    private List<ArchiveRuleSummary> archiveRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListArchiveRulesResponse withArchiveRules(List<ArchiveRuleSummary> archiveRules) {
        this.archiveRules = archiveRules;
        return this;
    }

    public ListArchiveRulesResponse addArchiveRulesItem(ArchiveRuleSummary archiveRulesItem) {
        if (this.archiveRules == null) {
            this.archiveRules = new ArrayList<>();
        }
        this.archiveRules.add(archiveRulesItem);
        return this;
    }

    public ListArchiveRulesResponse withArchiveRules(Consumer<List<ArchiveRuleSummary>> archiveRulesSetter) {
        if (this.archiveRules == null) {
            this.archiveRules = new ArrayList<>();
        }
        archiveRulesSetter.accept(this.archiveRules);
        return this;
    }

    /**
     * 为指定分析器创建的存档规则的列表。
     * @return archiveRules
     */
    public List<ArchiveRuleSummary> getArchiveRules() {
        return archiveRules;
    }

    public void setArchiveRules(List<ArchiveRuleSummary> archiveRules) {
        this.archiveRules = archiveRules;
    }

    public ListArchiveRulesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListArchiveRulesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListArchiveRulesResponse that = (ListArchiveRulesResponse) obj;
        return Objects.equals(this.archiveRules, that.archiveRules) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveRules, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListArchiveRulesResponse {\n");
        sb.append("    archiveRules: ").append(toIndentedString(archiveRules)).append("\n");
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
