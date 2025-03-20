package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作系统补丁批准过滤规则
 */
public class PatchRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_filters")

    private List<PatchFilter> patchFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_level")

    private String complianceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_after_days")

    private Integer approveAfterDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_until_date")

    private Long approveUntilDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_non_security")

    private Boolean enableNonSecurity;

    public PatchRule withPatchFilters(List<PatchFilter> patchFilters) {
        this.patchFilters = patchFilters;
        return this;
    }

    public PatchRule addPatchFiltersItem(PatchFilter patchFiltersItem) {
        if (this.patchFilters == null) {
            this.patchFilters = new ArrayList<>();
        }
        this.patchFilters.add(patchFiltersItem);
        return this;
    }

    public PatchRule withPatchFilters(Consumer<List<PatchFilter>> patchFiltersSetter) {
        if (this.patchFilters == null) {
            this.patchFilters = new ArrayList<>();
        }
        patchFiltersSetter.accept(this.patchFilters);
        return this;
    }

    /**
     * 批准规则过滤
     * @return patchFilters
     */
    public List<PatchFilter> getPatchFilters() {
        return patchFilters;
    }

    public void setPatchFilters(List<PatchFilter> patchFilters) {
        this.patchFilters = patchFilters;
    }

    public PatchRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public PatchRule withComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    /**
     * 合规性报告级别
     * @return complianceLevel
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    public PatchRule withApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
        return this;
    }

    /**
     * 指定天数后批准补丁，指定的天数
     * minimum: 0
     * maximum: 365
     * @return approveAfterDays
     */
    public Integer getApproveAfterDays() {
        return approveAfterDays;
    }

    public void setApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
    }

    public PatchRule withApproveUntilDate(Long approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
        return this;
    }

    /**
     * 批准指定日期之前发布的补丁,指定的日期时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return approveUntilDate
     */
    public Long getApproveUntilDate() {
        return approveUntilDate;
    }

    public void setApproveUntilDate(Long approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
    }

    public PatchRule withEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
        return this;
    }

    /**
     * 是否包括非安全性更新
     * @return enableNonSecurity
     */
    public Boolean getEnableNonSecurity() {
        return enableNonSecurity;
    }

    public void setEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchRule that = (PatchRule) obj;
        return Objects.equals(this.patchFilters, that.patchFilters) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.complianceLevel, that.complianceLevel)
            && Objects.equals(this.approveAfterDays, that.approveAfterDays)
            && Objects.equals(this.approveUntilDate, that.approveUntilDate)
            && Objects.equals(this.enableNonSecurity, that.enableNonSecurity);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(patchFilters, ruleName, complianceLevel, approveAfterDays, approveUntilDate, enableNonSecurity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchRule {\n");
        sb.append("    patchFilters: ").append(toIndentedString(patchFilters)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
        sb.append("    approveAfterDays: ").append(toIndentedString(approveAfterDays)).append("\n");
        sb.append("    approveUntilDate: ").append(toIndentedString(approveUntilDate)).append("\n");
        sb.append("    enableNonSecurity: ").append(toIndentedString(enableNonSecurity)).append("\n");
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
