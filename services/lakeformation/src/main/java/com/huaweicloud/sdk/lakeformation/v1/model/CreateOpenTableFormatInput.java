package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 开源湖表格式结构体
 */
public class CreateOpenTableFormatInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_iceberg_table_input")

    private CreateIcebergTableInput createIcebergTableInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_lance_table_input")

    private CreateLanceTableInput createLanceTableInput;

    public CreateOpenTableFormatInput withCreateIcebergTableInput(CreateIcebergTableInput createIcebergTableInput) {
        this.createIcebergTableInput = createIcebergTableInput;
        return this;
    }

    public CreateOpenTableFormatInput withCreateIcebergTableInput(
        Consumer<CreateIcebergTableInput> createIcebergTableInputSetter) {
        if (this.createIcebergTableInput == null) {
            this.createIcebergTableInput = new CreateIcebergTableInput();
            createIcebergTableInputSetter.accept(this.createIcebergTableInput);
        }

        return this;
    }

    /**
     * Get createIcebergTableInput
     * @return createIcebergTableInput
     */
    public CreateIcebergTableInput getCreateIcebergTableInput() {
        return createIcebergTableInput;
    }

    public void setCreateIcebergTableInput(CreateIcebergTableInput createIcebergTableInput) {
        this.createIcebergTableInput = createIcebergTableInput;
    }

    public CreateOpenTableFormatInput withCreateLanceTableInput(CreateLanceTableInput createLanceTableInput) {
        this.createLanceTableInput = createLanceTableInput;
        return this;
    }

    public CreateOpenTableFormatInput withCreateLanceTableInput(
        Consumer<CreateLanceTableInput> createLanceTableInputSetter) {
        if (this.createLanceTableInput == null) {
            this.createLanceTableInput = new CreateLanceTableInput();
            createLanceTableInputSetter.accept(this.createLanceTableInput);
        }

        return this;
    }

    /**
     * Get createLanceTableInput
     * @return createLanceTableInput
     */
    public CreateLanceTableInput getCreateLanceTableInput() {
        return createLanceTableInput;
    }

    public void setCreateLanceTableInput(CreateLanceTableInput createLanceTableInput) {
        this.createLanceTableInput = createLanceTableInput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpenTableFormatInput that = (CreateOpenTableFormatInput) obj;
        return Objects.equals(this.createIcebergTableInput, that.createIcebergTableInput)
            && Objects.equals(this.createLanceTableInput, that.createLanceTableInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createIcebergTableInput, createLanceTableInput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpenTableFormatInput {\n");
        sb.append("    createIcebergTableInput: ").append(toIndentedString(createIcebergTableInput)).append("\n");
        sb.append("    createLanceTableInput: ").append(toIndentedString(createLanceTableInput)).append("\n");
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
