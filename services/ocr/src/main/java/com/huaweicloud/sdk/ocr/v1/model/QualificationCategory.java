package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QualificationCategory
 */
public class QualificationCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_issue_date")

    private String initialIssueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    public QualificationCategory withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 诚信考核信息（非必有，依赖对应从业资格证板式）。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public QualificationCategory withInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
        return this;
    }

    /**
     * 初次领证日期（非必有，依赖对应从业资格证板式） 
     * @return initialIssueDate
     */
    public String getInitialIssueDate() {
        return initialIssueDate;
    }

    public void setInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
    }

    public QualificationCategory withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 有效起始日期（非必有，依赖对应从业资格证板式） 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public QualificationCategory withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效期至 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
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
        QualificationCategory qualificationCategory = (QualificationCategory) o;
        return Objects.equals(this.category, qualificationCategory.category)
            && Objects.equals(this.initialIssueDate, qualificationCategory.initialIssueDate)
            && Objects.equals(this.issueDate, qualificationCategory.issueDate)
            && Objects.equals(this.expiryDate, qualificationCategory.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, initialIssueDate, issueDate, expiryDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualificationCategory {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    initialIssueDate: ").append(toIndentedString(initialIssueDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
