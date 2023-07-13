package com.huaweicloud.sdk.das.v3.model;

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
public class ExportTopSqlTemplatesDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_sql_templates")

    private List<TopSqlTemplate> topSqlTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportTopSqlTemplatesDetailsResponse withTopSqlTemplates(List<TopSqlTemplate> topSqlTemplates) {
        this.topSqlTemplates = topSqlTemplates;
        return this;
    }

    public ExportTopSqlTemplatesDetailsResponse addTopSqlTemplatesItem(TopSqlTemplate topSqlTemplatesItem) {
        if (this.topSqlTemplates == null) {
            this.topSqlTemplates = new ArrayList<>();
        }
        this.topSqlTemplates.add(topSqlTemplatesItem);
        return this;
    }

    public ExportTopSqlTemplatesDetailsResponse withTopSqlTemplates(
        Consumer<List<TopSqlTemplate>> topSqlTemplatesSetter) {
        if (this.topSqlTemplates == null) {
            this.topSqlTemplates = new ArrayList<>();
        }
        topSqlTemplatesSetter.accept(this.topSqlTemplates);
        return this;
    }

    /**
     * SQL模板列表。
     * @return topSqlTemplates
     */
    public List<TopSqlTemplate> getTopSqlTemplates() {
        return topSqlTemplates;
    }

    public void setTopSqlTemplates(List<TopSqlTemplate> topSqlTemplates) {
        this.topSqlTemplates = topSqlTemplates;
    }

    public ExportTopSqlTemplatesDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * SQL模板总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTopSqlTemplatesDetailsResponse that = (ExportTopSqlTemplatesDetailsResponse) obj;
        return Objects.equals(this.topSqlTemplates, that.topSqlTemplates)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topSqlTemplates, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTopSqlTemplatesDetailsResponse {\n");
        sb.append("    topSqlTemplates: ").append(toIndentedString(topSqlTemplates)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
