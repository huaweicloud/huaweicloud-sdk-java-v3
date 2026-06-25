package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源指标数据模型。
 */
public class MetricsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private MetricTableItem table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ResourceMetricsMetadata metadata;

    public MetricsItem withTable(MetricTableItem table) {
        this.table = table;
        return this;
    }

    public MetricsItem withTable(Consumer<MetricTableItem> tableSetter) {
        if (this.table == null) {
            this.table = new MetricTableItem();
            tableSetter.accept(this.table);
        }

        return this;
    }

    /**
     * Get table
     * @return table
     */
    public MetricTableItem getTable() {
        return table;
    }

    public void setTable(MetricTableItem table) {
        this.table = table;
    }

    public MetricsItem withMetadata(ResourceMetricsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public MetricsItem withMetadata(Consumer<ResourceMetricsMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ResourceMetricsMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ResourceMetricsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ResourceMetricsMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricsItem that = (MetricsItem) obj;
        return Objects.equals(this.table, that.table) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsItem {\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
