package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** QualificationCategoryConfidence */
public class QualificationCategoryConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Float category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_issue_date")

    private Float initialIssueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private Float issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private Float expiryDate;

    public QualificationCategoryConfidence withCategory(Float category) {
        this.category = category;
        return this;
    }

    /** 诚信考核信息（非必有，依赖对应从业资格证板式）。
     * 
     * @return category */
    public Float getCategory() {
        return category;
    }

    public void setCategory(Float category) {
        this.category = category;
    }

    public QualificationCategoryConfidence withInitialIssueDate(Float initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
        return this;
    }

    /** 初次领证日期（非必有，依赖对应从业资格证板式）
     * 
     * @return initialIssueDate */
    public Float getInitialIssueDate() {
        return initialIssueDate;
    }

    public void setInitialIssueDate(Float initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
    }

    public QualificationCategoryConfidence withIssueDate(Float issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 有效起始日期（非必有，依赖对应从业资格证板式）
     * 
     * @return issueDate */
    public Float getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Float issueDate) {
        this.issueDate = issueDate;
    }

    public QualificationCategoryConfidence withExpiryDate(Float expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /** 有效期至
     * 
     * @return expiryDate */
    public Float getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Float expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualificationCategoryConfidence qualificationCategoryConfidence = (QualificationCategoryConfidence) o;
        return Objects.equals(this.category, qualificationCategoryConfidence.category)
            && Objects.equals(this.initialIssueDate, qualificationCategoryConfidence.initialIssueDate)
            && Objects.equals(this.issueDate, qualificationCategoryConfidence.issueDate)
            && Objects.equals(this.expiryDate, qualificationCategoryConfidence.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, initialIssueDate, issueDate, expiryDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualificationCategoryConfidence {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    initialIssueDate: ").append(toIndentedString(initialIssueDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
