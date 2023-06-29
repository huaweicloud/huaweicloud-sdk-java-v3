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
public class ExportSlowSqlTemplatesDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_templates")

    private List<SlowSqlTemplate> slowSqlTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportSlowSqlTemplatesDetailsResponse withSlowSqlTemplates(List<SlowSqlTemplate> slowSqlTemplates) {
        this.slowSqlTemplates = slowSqlTemplates;
        return this;
    }

    public ExportSlowSqlTemplatesDetailsResponse addSlowSqlTemplatesItem(SlowSqlTemplate slowSqlTemplatesItem) {
        if (this.slowSqlTemplates == null) {
            this.slowSqlTemplates = new ArrayList<>();
        }
        this.slowSqlTemplates.add(slowSqlTemplatesItem);
        return this;
    }

    public ExportSlowSqlTemplatesDetailsResponse withSlowSqlTemplates(
        Consumer<List<SlowSqlTemplate>> slowSqlTemplatesSetter) {
        if (this.slowSqlTemplates == null) {
            this.slowSqlTemplates = new ArrayList<>();
        }
        slowSqlTemplatesSetter.accept(this.slowSqlTemplates);
        return this;
    }

    /**
     * 慢日志模板数据列表。
     * @return slowSqlTemplates
     */
    public List<SlowSqlTemplate> getSlowSqlTemplates() {
        return slowSqlTemplates;
    }

    public void setSlowSqlTemplates(List<SlowSqlTemplate> slowSqlTemplates) {
        this.slowSqlTemplates = slowSqlTemplates;
    }

    public ExportSlowSqlTemplatesDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 慢日志模板总数。
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
        ExportSlowSqlTemplatesDetailsResponse that = (ExportSlowSqlTemplatesDetailsResponse) obj;
        return Objects.equals(this.slowSqlTemplates, that.slowSqlTemplates)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowSqlTemplates, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSlowSqlTemplatesDetailsResponse {\n");
        sb.append("    slowSqlTemplates: ").append(toIndentedString(slowSqlTemplates)).append("\n");
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
