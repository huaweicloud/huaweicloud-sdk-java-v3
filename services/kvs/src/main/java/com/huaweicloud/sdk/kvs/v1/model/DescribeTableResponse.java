package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeTableResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKeySchema")
    @BsonProperty(value = "PrimaryKeySchema")

    private PrimaryKeySchema primaryKeySchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Local2ndIndexSchema")
    @BsonProperty(value = "Local2ndIndexSchema")

    private List<LsiIndex> local2ndIndexSchema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Global2ndIndexSchema")
    @BsonProperty(value = "Global2ndIndexSchema")

    private List<GsiIndex> global2ndIndexSchema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RuntimeInfo")
    @BsonProperty(value = "RuntimeInfo")

    private RuntimeInfo runtimeInfo;

    public DescribeTableResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get tableName
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DescribeTableResponse withPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
        return this;
    }

    public DescribeTableResponse withPrimaryKeySchema(Consumer<PrimaryKeySchema> primaryKeySchemaSetter) {
        if (this.primaryKeySchema == null) {
            this.primaryKeySchema = new PrimaryKeySchema();
            primaryKeySchemaSetter.accept(this.primaryKeySchema);
        }

        return this;
    }

    /**
     * Get primaryKeySchema
     * @return primaryKeySchema
     */
    public PrimaryKeySchema getPrimaryKeySchema() {
        return primaryKeySchema;
    }

    public void setPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
    }

    public DescribeTableResponse withLocal2ndIndexSchema(List<LsiIndex> local2ndIndexSchema) {
        this.local2ndIndexSchema = local2ndIndexSchema;
        return this;
    }

    public DescribeTableResponse addLocal2ndIndexSchemaItem(LsiIndex local2ndIndexSchemaItem) {
        if (this.local2ndIndexSchema == null) {
            this.local2ndIndexSchema = new ArrayList<>();
        }
        this.local2ndIndexSchema.add(local2ndIndexSchemaItem);
        return this;
    }

    public DescribeTableResponse withLocal2ndIndexSchema(Consumer<List<LsiIndex>> local2ndIndexSchemaSetter) {
        if (this.local2ndIndexSchema == null) {
            this.local2ndIndexSchema = new ArrayList<>();
        }
        local2ndIndexSchemaSetter.accept(this.local2ndIndexSchema);
        return this;
    }

    /**
     * Get local2ndIndexSchema
     * @return local2ndIndexSchema
     */
    public List<LsiIndex> getLocal2ndIndexSchema() {
        return local2ndIndexSchema;
    }

    public void setLocal2ndIndexSchema(List<LsiIndex> local2ndIndexSchema) {
        this.local2ndIndexSchema = local2ndIndexSchema;
    }

    public DescribeTableResponse withGlobal2ndIndexSchema(List<GsiIndex> global2ndIndexSchema) {
        this.global2ndIndexSchema = global2ndIndexSchema;
        return this;
    }

    public DescribeTableResponse addGlobal2ndIndexSchemaItem(GsiIndex global2ndIndexSchemaItem) {
        if (this.global2ndIndexSchema == null) {
            this.global2ndIndexSchema = new ArrayList<>();
        }
        this.global2ndIndexSchema.add(global2ndIndexSchemaItem);
        return this;
    }

    public DescribeTableResponse withGlobal2ndIndexSchema(Consumer<List<GsiIndex>> global2ndIndexSchemaSetter) {
        if (this.global2ndIndexSchema == null) {
            this.global2ndIndexSchema = new ArrayList<>();
        }
        global2ndIndexSchemaSetter.accept(this.global2ndIndexSchema);
        return this;
    }

    /**
     * Get global2ndIndexSchema
     * @return global2ndIndexSchema
     */
    public List<GsiIndex> getGlobal2ndIndexSchema() {
        return global2ndIndexSchema;
    }

    public void setGlobal2ndIndexSchema(List<GsiIndex> global2ndIndexSchema) {
        this.global2ndIndexSchema = global2ndIndexSchema;
    }

    public DescribeTableResponse withRuntimeInfo(RuntimeInfo runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
        return this;
    }

    public DescribeTableResponse withRuntimeInfo(Consumer<RuntimeInfo> runtimeInfoSetter) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new RuntimeInfo();
            runtimeInfoSetter.accept(this.runtimeInfo);
        }

        return this;
    }

    /**
     * Get runtimeInfo
     * @return runtimeInfo
     */
    public RuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(RuntimeInfo runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeTableResponse that = (DescribeTableResponse) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.primaryKeySchema, that.primaryKeySchema)
            && Objects.equals(this.local2ndIndexSchema, that.local2ndIndexSchema)
            && Objects.equals(this.global2ndIndexSchema, that.global2ndIndexSchema)
            && Objects.equals(this.runtimeInfo, that.runtimeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, primaryKeySchema, local2ndIndexSchema, global2ndIndexSchema, runtimeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeTableResponse {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKeySchema: ").append(toIndentedString(primaryKeySchema)).append("\n");
        sb.append("    local2ndIndexSchema: ").append(toIndentedString(local2ndIndexSchema)).append("\n");
        sb.append("    global2ndIndexSchema: ").append(toIndentedString(global2ndIndexSchema)).append("\n");
        sb.append("    runtimeInfo: ").append(toIndentedString(runtimeInfo)).append("\n");
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

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(DescribeTableResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
