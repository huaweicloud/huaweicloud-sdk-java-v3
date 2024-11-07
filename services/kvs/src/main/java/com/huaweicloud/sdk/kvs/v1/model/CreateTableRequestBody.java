package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBody
 */
public class CreateTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_mode")
    @BsonProperty(value = "bill_mode")

    private String billMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioned_throughput")
    @BsonProperty(value = "provisioned_throughput")

    private ProvisionedThroughput provisionedThroughput;

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
    @JsonProperty(value = "pre_split_key_options")
    @BsonProperty(value = "pre_split_key_options")

    private PreSplitKeyOptions preSplitKeyOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_options")
    @BsonProperty(value = "ttl_options")

    private TtlOptions ttlOptions;

    public CreateTableRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名，仓内唯一。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CreateTableRequestBody withBillMode(String billMode) {
        this.billMode = billMode;
        return this;
    }

    /**
     * 表计费模式，可为\"provisioned\"或\"on_demand\" - 预置模式：provisioned - 按需模式：on_demand
     * @return billMode
     */
    public String getBillMode() {
        return billMode;
    }

    public void setBillMode(String billMode) {
        this.billMode = billMode;
    }

    public CreateTableRequestBody withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    public CreateTableRequestBody withProvisionedThroughput(
        Consumer<ProvisionedThroughput> provisionedThroughputSetter) {
        if (this.provisionedThroughput == null) {
            this.provisionedThroughput = new ProvisionedThroughput();
            provisionedThroughputSetter.accept(this.provisionedThroughput);
        }

        return this;
    }

    /**
     * Get provisionedThroughput
     * @return provisionedThroughput
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public CreateTableRequestBody withPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
        return this;
    }

    public CreateTableRequestBody withPrimaryKeySchema(Consumer<PrimaryKeySchema> primaryKeySchemaSetter) {
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

    public CreateTableRequestBody withLocalSecondaryIndexSchema(List<SecondaryIndex> localSecondaryIndexSchema) {
        this.localSecondaryIndexSchema = localSecondaryIndexSchema;
        return this;
    }

    public CreateTableRequestBody addLocalSecondaryIndexSchemaItem(SecondaryIndex localSecondaryIndexSchemaItem) {
        if (this.localSecondaryIndexSchema == null) {
            this.localSecondaryIndexSchema = new ArrayList<>();
        }
        this.localSecondaryIndexSchema.add(localSecondaryIndexSchemaItem);
        return this;
    }

    public CreateTableRequestBody withLocalSecondaryIndexSchema(
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

    public CreateTableRequestBody withGlobalSecondaryIndexSchema(
        List<GlobalSecondaryIndex> globalSecondaryIndexSchema) {
        this.globalSecondaryIndexSchema = globalSecondaryIndexSchema;
        return this;
    }

    public CreateTableRequestBody addGlobalSecondaryIndexSchemaItem(
        GlobalSecondaryIndex globalSecondaryIndexSchemaItem) {
        if (this.globalSecondaryIndexSchema == null) {
            this.globalSecondaryIndexSchema = new ArrayList<>();
        }
        this.globalSecondaryIndexSchema.add(globalSecondaryIndexSchemaItem);
        return this;
    }

    public CreateTableRequestBody withGlobalSecondaryIndexSchema(
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

    public CreateTableRequestBody withPreSplitKeyOptions(PreSplitKeyOptions preSplitKeyOptions) {
        this.preSplitKeyOptions = preSplitKeyOptions;
        return this;
    }

    public CreateTableRequestBody withPreSplitKeyOptions(Consumer<PreSplitKeyOptions> preSplitKeyOptionsSetter) {
        if (this.preSplitKeyOptions == null) {
            this.preSplitKeyOptions = new PreSplitKeyOptions();
            preSplitKeyOptionsSetter.accept(this.preSplitKeyOptions);
        }

        return this;
    }

    /**
     * Get preSplitKeyOptions
     * @return preSplitKeyOptions
     */
    public PreSplitKeyOptions getPreSplitKeyOptions() {
        return preSplitKeyOptions;
    }

    public void setPreSplitKeyOptions(PreSplitKeyOptions preSplitKeyOptions) {
        this.preSplitKeyOptions = preSplitKeyOptions;
    }

    public CreateTableRequestBody withTtlOptions(TtlOptions ttlOptions) {
        this.ttlOptions = ttlOptions;
        return this;
    }

    public CreateTableRequestBody withTtlOptions(Consumer<TtlOptions> ttlOptionsSetter) {
        if (this.ttlOptions == null) {
            this.ttlOptions = new TtlOptions();
            ttlOptionsSetter.accept(this.ttlOptions);
        }

        return this;
    }

    /**
     * Get ttlOptions
     * @return ttlOptions
     */
    public TtlOptions getTtlOptions() {
        return ttlOptions;
    }

    public void setTtlOptions(TtlOptions ttlOptions) {
        this.ttlOptions = ttlOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTableRequestBody that = (CreateTableRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.billMode, that.billMode)
            && Objects.equals(this.provisionedThroughput, that.provisionedThroughput)
            && Objects.equals(this.primaryKeySchema, that.primaryKeySchema)
            && Objects.equals(this.localSecondaryIndexSchema, that.localSecondaryIndexSchema)
            && Objects.equals(this.globalSecondaryIndexSchema, that.globalSecondaryIndexSchema)
            && Objects.equals(this.preSplitKeyOptions, that.preSplitKeyOptions)
            && Objects.equals(this.ttlOptions, that.ttlOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            billMode,
            provisionedThroughput,
            primaryKeySchema,
            localSecondaryIndexSchema,
            globalSecondaryIndexSchema,
            preSplitKeyOptions,
            ttlOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    billMode: ").append(toIndentedString(billMode)).append("\n");
        sb.append("    provisionedThroughput: ").append(toIndentedString(provisionedThroughput)).append("\n");
        sb.append("    primaryKeySchema: ").append(toIndentedString(primaryKeySchema)).append("\n");
        sb.append("    localSecondaryIndexSchema: ").append(toIndentedString(localSecondaryIndexSchema)).append("\n");
        sb.append("    globalSecondaryIndexSchema: ").append(toIndentedString(globalSecondaryIndexSchema)).append("\n");
        sb.append("    preSplitKeyOptions: ").append(toIndentedString(preSplitKeyOptions)).append("\n");
        sb.append("    ttlOptions: ").append(toIndentedString(ttlOptions)).append("\n");
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
