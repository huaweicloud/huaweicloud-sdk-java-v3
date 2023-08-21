package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * cdn域名安全服务约束信息
 */
public class CdnDomainTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint")

    private String constraint;

    public CdnDomainTags withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * 约束原因
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public CdnDomainTags withConstraint(String constraint) {
        this.constraint = constraint;
        return this;
    }

    /**
     * 约束内容
     * @return constraint
     */
    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdnDomainTags that = (CdnDomainTags) obj;
        return Objects.equals(this.notes, that.notes) && Objects.equals(this.constraint, that.constraint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, constraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdnDomainTags {\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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
