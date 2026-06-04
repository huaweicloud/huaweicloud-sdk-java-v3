package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateIcebergTableInput
 */
public class CreateIcebergTableInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private IcebergSchema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_spec")

    private IcebergPartitionSpec partitionSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_order")

    private IcebergSortOrder writeOrder;

    public CreateIcebergTableInput withSchema(IcebergSchema schema) {
        this.schema = schema;
        return this;
    }

    public CreateIcebergTableInput withSchema(Consumer<IcebergSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new IcebergSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public IcebergSchema getSchema() {
        return schema;
    }

    public void setSchema(IcebergSchema schema) {
        this.schema = schema;
    }

    public CreateIcebergTableInput withPartitionSpec(IcebergPartitionSpec partitionSpec) {
        this.partitionSpec = partitionSpec;
        return this;
    }

    public CreateIcebergTableInput withPartitionSpec(Consumer<IcebergPartitionSpec> partitionSpecSetter) {
        if (this.partitionSpec == null) {
            this.partitionSpec = new IcebergPartitionSpec();
            partitionSpecSetter.accept(this.partitionSpec);
        }

        return this;
    }

    /**
     * Get partitionSpec
     * @return partitionSpec
     */
    public IcebergPartitionSpec getPartitionSpec() {
        return partitionSpec;
    }

    public void setPartitionSpec(IcebergPartitionSpec partitionSpec) {
        this.partitionSpec = partitionSpec;
    }

    public CreateIcebergTableInput withWriteOrder(IcebergSortOrder writeOrder) {
        this.writeOrder = writeOrder;
        return this;
    }

    public CreateIcebergTableInput withWriteOrder(Consumer<IcebergSortOrder> writeOrderSetter) {
        if (this.writeOrder == null) {
            this.writeOrder = new IcebergSortOrder();
            writeOrderSetter.accept(this.writeOrder);
        }

        return this;
    }

    /**
     * Get writeOrder
     * @return writeOrder
     */
    public IcebergSortOrder getWriteOrder() {
        return writeOrder;
    }

    public void setWriteOrder(IcebergSortOrder writeOrder) {
        this.writeOrder = writeOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIcebergTableInput that = (CreateIcebergTableInput) obj;
        return Objects.equals(this.schema, that.schema) && Objects.equals(this.partitionSpec, that.partitionSpec)
            && Objects.equals(this.writeOrder, that.writeOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, partitionSpec, writeOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIcebergTableInput {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
        sb.append("    writeOrder: ").append(toIndentedString(writeOrder)).append("\n");
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
