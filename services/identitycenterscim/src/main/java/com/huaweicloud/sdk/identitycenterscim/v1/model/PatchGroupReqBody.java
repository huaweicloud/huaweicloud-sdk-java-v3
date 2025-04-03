package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PatchGroupReqBody
 */
public class PatchGroupReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Operations")

    private List<OperationItemDto> operations = null;

    public PatchGroupReqBody withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public PatchGroupReqBody addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public PatchGroupReqBody withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 概要
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public PatchGroupReqBody withOperations(List<OperationItemDto> operations) {
        this.operations = operations;
        return this;
    }

    public PatchGroupReqBody addOperationsItem(OperationItemDto operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public PatchGroupReqBody withOperations(Consumer<List<OperationItemDto>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 要执行的修改操作列表
     * @return operations
     */
    public List<OperationItemDto> getOperations() {
        return operations;
    }

    public void setOperations(List<OperationItemDto> operations) {
        this.operations = operations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchGroupReqBody that = (PatchGroupReqBody) obj;
        return Objects.equals(this.schemas, that.schemas) && Objects.equals(this.operations, that.operations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemas, operations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchGroupReqBody {\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
