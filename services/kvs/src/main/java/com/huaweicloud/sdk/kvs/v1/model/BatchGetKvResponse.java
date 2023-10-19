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
public class BatchGetKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Exceptions")
    @BsonProperty(value = "Exceptions")

    private List<ExceptItem> exceptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableKvArray")
    @BsonProperty(value = "TableKvArray")

    private List<TableBatchItem> tableKvArray = null;

    public BatchGetKvResponse withExceptions(List<ExceptItem> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    public BatchGetKvResponse addExceptionsItem(ExceptItem exceptionsItem) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        this.exceptions.add(exceptionsItem);
        return this;
    }

    public BatchGetKvResponse withExceptions(Consumer<List<ExceptItem>> exceptionsSetter) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        exceptionsSetter.accept(this.exceptions);
        return this;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public List<ExceptItem> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<ExceptItem> exceptions) {
        this.exceptions = exceptions;
    }

    public BatchGetKvResponse withTableKvArray(List<TableBatchItem> tableKvArray) {
        this.tableKvArray = tableKvArray;
        return this;
    }

    public BatchGetKvResponse addTableKvArrayItem(TableBatchItem tableKvArrayItem) {
        if (this.tableKvArray == null) {
            this.tableKvArray = new ArrayList<>();
        }
        this.tableKvArray.add(tableKvArrayItem);
        return this;
    }

    public BatchGetKvResponse withTableKvArray(Consumer<List<TableBatchItem>> tableKvArraySetter) {
        if (this.tableKvArray == null) {
            this.tableKvArray = new ArrayList<>();
        }
        tableKvArraySetter.accept(this.tableKvArray);
        return this;
    }

    /**
     * Get tableKvArray
     * @return tableKvArray
     */
    public List<TableBatchItem> getTableKvArray() {
        return tableKvArray;
    }

    public void setTableKvArray(List<TableBatchItem> tableKvArray) {
        this.tableKvArray = tableKvArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetKvResponse that = (BatchGetKvResponse) obj;
        return Objects.equals(this.exceptions, that.exceptions) && Objects.equals(this.tableKvArray, that.tableKvArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exceptions, tableKvArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetKvResponse {\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
        sb.append("    tableKvArray: ").append(toIndentedString(tableKvArray)).append("\n");
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
        return codecRegistry.get(BatchGetKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
