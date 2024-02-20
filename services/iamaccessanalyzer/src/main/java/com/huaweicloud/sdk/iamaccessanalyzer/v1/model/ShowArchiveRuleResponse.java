package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowArchiveRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_rule")

    private ArchiveRuleSummary archiveRule;

    public ShowArchiveRuleResponse withArchiveRule(ArchiveRuleSummary archiveRule) {
        this.archiveRule = archiveRule;
        return this;
    }

    public ShowArchiveRuleResponse withArchiveRule(Consumer<ArchiveRuleSummary> archiveRuleSetter) {
        if (this.archiveRule == null) {
            this.archiveRule = new ArchiveRuleSummary();
            archiveRuleSetter.accept(this.archiveRule);
        }

        return this;
    }

    /**
     * Get archiveRule
     * @return archiveRule
     */
    public ArchiveRuleSummary getArchiveRule() {
        return archiveRule;
    }

    public void setArchiveRule(ArchiveRuleSummary archiveRule) {
        this.archiveRule = archiveRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowArchiveRuleResponse that = (ShowArchiveRuleResponse) obj;
        return Objects.equals(this.archiveRule, that.archiveRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowArchiveRuleResponse {\n");
        sb.append("    archiveRule: ").append(toIndentedString(archiveRule)).append("\n");
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
