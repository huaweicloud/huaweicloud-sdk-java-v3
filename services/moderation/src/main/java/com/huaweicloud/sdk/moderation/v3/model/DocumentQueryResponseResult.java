package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业审核结果，当作业状态为succeeded时存在。
 */
public class DocumentQueryResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<DocumentQueryResponseResultDetails> details = null;

    public DocumentQueryResponseResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 文档审核结果是否通过。 block：包含敏感信息，不通过 review：需要人工复检 pass：不包含敏感信息，通过
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public DocumentQueryResponseResult withDetails(List<DocumentQueryResponseResultDetails> details) {
        this.details = details;
        return this;
    }

    public DocumentQueryResponseResult addDetailsItem(DocumentQueryResponseResultDetails detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public DocumentQueryResponseResult withDetails(Consumer<List<DocumentQueryResponseResultDetails>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 审核详情
     * @return details
     */
    public List<DocumentQueryResponseResultDetails> getDetails() {
        return details;
    }

    public void setDetails(List<DocumentQueryResponseResultDetails> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentQueryResponseResult that = (DocumentQueryResponseResult) obj;
        return Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentQueryResponseResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
