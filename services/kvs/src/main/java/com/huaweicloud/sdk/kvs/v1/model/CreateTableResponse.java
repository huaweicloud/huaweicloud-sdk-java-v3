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
public class CreateTableResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Temporary")
    @BsonProperty(value = "Temporary")

    private Boolean temporary;

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
    @JsonProperty(value = "PreSplitKeyOptions")
    @BsonProperty(value = "PreSplitKeyOptions")

    private PreSplitKeyOptions preSplitKeyOptions;

    public CreateTableResponse withTableName(String tableName) {
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

    public CreateTableResponse withTemporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }

    /**
     * Get temporary
     * @return temporary
     */
    public Boolean getTemporary() {
        return temporary;
    }

    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }

    public CreateTableResponse withPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
        return this;
    }

    public CreateTableResponse withPrimaryKeySchema(Consumer<PrimaryKeySchema> primaryKeySchemaSetter) {
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

    public CreateTableResponse withLocal2ndIndexSchema(List<LsiIndex> local2ndIndexSchema) {
        this.local2ndIndexSchema = local2ndIndexSchema;
        return this;
    }

    public CreateTableResponse addLocal2ndIndexSchemaItem(LsiIndex local2ndIndexSchemaItem) {
        if (this.local2ndIndexSchema == null) {
            this.local2ndIndexSchema = new ArrayList<>();
        }
        this.local2ndIndexSchema.add(local2ndIndexSchemaItem);
        return this;
    }

    public CreateTableResponse withLocal2ndIndexSchema(Consumer<List<LsiIndex>> local2ndIndexSchemaSetter) {
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

    public CreateTableResponse withGlobal2ndIndexSchema(List<GsiIndex> global2ndIndexSchema) {
        this.global2ndIndexSchema = global2ndIndexSchema;
        return this;
    }

    public CreateTableResponse addGlobal2ndIndexSchemaItem(GsiIndex global2ndIndexSchemaItem) {
        if (this.global2ndIndexSchema == null) {
            this.global2ndIndexSchema = new ArrayList<>();
        }
        this.global2ndIndexSchema.add(global2ndIndexSchemaItem);
        return this;
    }

    public CreateTableResponse withGlobal2ndIndexSchema(Consumer<List<GsiIndex>> global2ndIndexSchemaSetter) {
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

    public CreateTableResponse withPreSplitKeyOptions(PreSplitKeyOptions preSplitKeyOptions) {
        this.preSplitKeyOptions = preSplitKeyOptions;
        return this;
    }

    public CreateTableResponse withPreSplitKeyOptions(Consumer<PreSplitKeyOptions> preSplitKeyOptionsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTableResponse that = (CreateTableResponse) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.temporary, that.temporary)
            && Objects.equals(this.primaryKeySchema, that.primaryKeySchema)
            && Objects.equals(this.local2ndIndexSchema, that.local2ndIndexSchema)
            && Objects.equals(this.global2ndIndexSchema, that.global2ndIndexSchema)
            && Objects.equals(this.preSplitKeyOptions, that.preSplitKeyOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            temporary,
            primaryKeySchema,
            local2ndIndexSchema,
            global2ndIndexSchema,
            preSplitKeyOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableResponse {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
        sb.append("    primaryKeySchema: ").append(toIndentedString(primaryKeySchema)).append("\n");
        sb.append("    local2ndIndexSchema: ").append(toIndentedString(local2ndIndexSchema)).append("\n");
        sb.append("    global2ndIndexSchema: ").append(toIndentedString(global2ndIndexSchema)).append("\n");
        sb.append("    preSplitKeyOptions: ").append(toIndentedString(preSplitKeyOptions)).append("\n");
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
        return codecRegistry.get(CreateTableResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
