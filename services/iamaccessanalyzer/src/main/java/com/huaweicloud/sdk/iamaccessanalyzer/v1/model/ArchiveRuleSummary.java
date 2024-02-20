package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 为指定分析器创建的存档规则的列表。
 */
public class ArchiveRuleSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<FindingFilter> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    public ArchiveRuleSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建归档规则的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ArchiveRuleSummary withFilters(List<FindingFilter> filters) {
        this.filters = filters;
        return this;
    }

    public ArchiveRuleSummary addFiltersItem(FindingFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ArchiveRuleSummary withFilters(Consumer<List<FindingFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * Get filters
     * @return filters
     */
    public List<FindingFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<FindingFilter> filters) {
        this.filters = filters;
    }

    public ArchiveRuleSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存档规则的唯一标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArchiveRuleSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建归档规则的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArchiveRuleSummary withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 上次更新存档规则的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ArchiveRuleSummary withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 唯一的资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArchiveRuleSummary that = (ArchiveRuleSummary) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.filters, that.filters)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.urn, that.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, filters, id, name, updatedAt, urn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArchiveRuleSummary {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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
