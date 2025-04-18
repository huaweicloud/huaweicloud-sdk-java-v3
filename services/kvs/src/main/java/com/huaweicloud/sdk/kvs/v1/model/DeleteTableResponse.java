package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.Codec;
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
public class DeleteTableResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_schema")
    @BsonProperty(value = "primary_key_schema")

    private PrimaryKeySchema primaryKeySchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_secondary_index_schema")
    @BsonProperty(value = "local_secondary_index_schema")

    private List<SecondaryIndex> localSecondaryIndexSchema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_secondary_index_schema")
    @BsonProperty(value = "global_secondary_index_schema")

    private List<GlobalSecondaryIndex> globalSecondaryIndexSchema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_time_info")
    @BsonProperty(value = "run_time_info")

    private RunTimeInfo runTimeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_specification")
    @BsonProperty(value = "ttl_specification")

    private TtlSpecification ttlSpecification;

    private static Codec<DeleteTableResponse> codec;

    public DeleteTableResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DeleteTableResponse withPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
        return this;
    }

    public DeleteTableResponse withPrimaryKeySchema(Consumer<PrimaryKeySchema> primaryKeySchemaSetter) {
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

    public DeleteTableResponse withLocalSecondaryIndexSchema(List<SecondaryIndex> localSecondaryIndexSchema) {
        this.localSecondaryIndexSchema = localSecondaryIndexSchema;
        return this;
    }

    public DeleteTableResponse addLocalSecondaryIndexSchemaItem(SecondaryIndex localSecondaryIndexSchemaItem) {
        if (this.localSecondaryIndexSchema == null) {
            this.localSecondaryIndexSchema = new ArrayList<>();
        }
        this.localSecondaryIndexSchema.add(localSecondaryIndexSchemaItem);
        return this;
    }

    public DeleteTableResponse withLocalSecondaryIndexSchema(
        Consumer<List<SecondaryIndex>> localSecondaryIndexSchemaSetter) {
        if (this.localSecondaryIndexSchema == null) {
            this.localSecondaryIndexSchema = new ArrayList<>();
        }
        localSecondaryIndexSchemaSetter.accept(this.localSecondaryIndexSchema);
        return this;
    }

    /**
     * 本地二级索引模板，可以多个。
     * @return localSecondaryIndexSchema
     */
    public List<SecondaryIndex> getLocalSecondaryIndexSchema() {
        return localSecondaryIndexSchema;
    }

    public void setLocalSecondaryIndexSchema(List<SecondaryIndex> localSecondaryIndexSchema) {
        this.localSecondaryIndexSchema = localSecondaryIndexSchema;
    }

    public DeleteTableResponse withGlobalSecondaryIndexSchema(List<GlobalSecondaryIndex> globalSecondaryIndexSchema) {
        this.globalSecondaryIndexSchema = globalSecondaryIndexSchema;
        return this;
    }

    public DeleteTableResponse addGlobalSecondaryIndexSchemaItem(GlobalSecondaryIndex globalSecondaryIndexSchemaItem) {
        if (this.globalSecondaryIndexSchema == null) {
            this.globalSecondaryIndexSchema = new ArrayList<>();
        }
        this.globalSecondaryIndexSchema.add(globalSecondaryIndexSchemaItem);
        return this;
    }

    public DeleteTableResponse withGlobalSecondaryIndexSchema(
        Consumer<List<GlobalSecondaryIndex>> globalSecondaryIndexSchemaSetter) {
        if (this.globalSecondaryIndexSchema == null) {
            this.globalSecondaryIndexSchema = new ArrayList<>();
        }
        globalSecondaryIndexSchemaSetter.accept(this.globalSecondaryIndexSchema);
        return this;
    }

    /**
     * 全局二级索引模板。
     * @return globalSecondaryIndexSchema
     */
    public List<GlobalSecondaryIndex> getGlobalSecondaryIndexSchema() {
        return globalSecondaryIndexSchema;
    }

    public void setGlobalSecondaryIndexSchema(List<GlobalSecondaryIndex> globalSecondaryIndexSchema) {
        this.globalSecondaryIndexSchema = globalSecondaryIndexSchema;
    }

    public DeleteTableResponse withRunTimeInfo(RunTimeInfo runTimeInfo) {
        this.runTimeInfo = runTimeInfo;
        return this;
    }

    public DeleteTableResponse withRunTimeInfo(Consumer<RunTimeInfo> runTimeInfoSetter) {
        if (this.runTimeInfo == null) {
            this.runTimeInfo = new RunTimeInfo();
            runTimeInfoSetter.accept(this.runTimeInfo);
        }

        return this;
    }

    /**
     * Get runTimeInfo
     * @return runTimeInfo
     */
    public RunTimeInfo getRunTimeInfo() {
        return runTimeInfo;
    }

    public void setRunTimeInfo(RunTimeInfo runTimeInfo) {
        this.runTimeInfo = runTimeInfo;
    }

    public DeleteTableResponse withTtlSpecification(TtlSpecification ttlSpecification) {
        this.ttlSpecification = ttlSpecification;
        return this;
    }

    public DeleteTableResponse withTtlSpecification(Consumer<TtlSpecification> ttlSpecificationSetter) {
        if (this.ttlSpecification == null) {
            this.ttlSpecification = new TtlSpecification();
            ttlSpecificationSetter.accept(this.ttlSpecification);
        }

        return this;
    }

    /**
     * Get ttlSpecification
     * @return ttlSpecification
     */
    public TtlSpecification getTtlSpecification() {
        return ttlSpecification;
    }

    public void setTtlSpecification(TtlSpecification ttlSpecification) {
        this.ttlSpecification = ttlSpecification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTableResponse that = (DeleteTableResponse) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.primaryKeySchema, that.primaryKeySchema)
            && Objects.equals(this.localSecondaryIndexSchema, that.localSecondaryIndexSchema)
            && Objects.equals(this.globalSecondaryIndexSchema, that.globalSecondaryIndexSchema)
            && Objects.equals(this.runTimeInfo, that.runTimeInfo)
            && Objects.equals(this.ttlSpecification, that.ttlSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            primaryKeySchema,
            localSecondaryIndexSchema,
            globalSecondaryIndexSchema,
            runTimeInfo,
            ttlSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTableResponse {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKeySchema: ").append(toIndentedString(primaryKeySchema)).append("\n");
        sb.append("    localSecondaryIndexSchema: ").append(toIndentedString(localSecondaryIndexSchema)).append("\n");
        sb.append("    globalSecondaryIndexSchema: ").append(toIndentedString(globalSecondaryIndexSchema)).append("\n");
        sb.append("    runTimeInfo: ").append(toIndentedString(runTimeInfo)).append("\n");
        sb.append("    ttlSpecification: ").append(toIndentedString(ttlSpecification)).append("\n");
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
        if (codec == null) {
            codec = codecRegistry.get(DeleteTableResponse.class);
        }
        return codec.decode(reader, DecoderContext.builder().build());
    }
}
