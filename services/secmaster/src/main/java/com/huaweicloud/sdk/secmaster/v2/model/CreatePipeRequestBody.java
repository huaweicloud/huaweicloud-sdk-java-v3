package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePipeRequestBody
 */
public class CreatePipeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_alias")

    private String pipeAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private PipeCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private PipeSchema schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_setting")

    private PipeStorageSetting storageSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private TableDisplaySetting displaySetting;

    public CreatePipeRequestBody withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * 管道名称
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public CreatePipeRequestBody withPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
        return this;
    }

    /**
     * 管道别名
     * @return pipeAlias
     */
    public String getPipeAlias() {
        return pipeAlias;
    }

    public void setPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
    }

    public CreatePipeRequestBody withCategory(PipeCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public PipeCategory getCategory() {
        return category;
    }

    public void setCategory(PipeCategory category) {
        this.category = category;
    }

    public CreatePipeRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * directory 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public CreatePipeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 管道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePipeRequestBody withSchema(PipeSchema schema) {
        this.schema = schema;
        return this;
    }

    public CreatePipeRequestBody withSchema(Consumer<PipeSchema> schemaSetter) {
        if (this.schema == null) {
            this.schema = new PipeSchema();
            schemaSetter.accept(this.schema);
        }

        return this;
    }

    /**
     * Get schema
     * @return schema
     */
    public PipeSchema getSchema() {
        return schema;
    }

    public void setSchema(PipeSchema schema) {
        this.schema = schema;
    }

    public CreatePipeRequestBody withStorageSetting(PipeStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
        return this;
    }

    public CreatePipeRequestBody withStorageSetting(Consumer<PipeStorageSetting> storageSettingSetter) {
        if (this.storageSetting == null) {
            this.storageSetting = new PipeStorageSetting();
            storageSettingSetter.accept(this.storageSetting);
        }

        return this;
    }

    /**
     * Get storageSetting
     * @return storageSetting
     */
    public PipeStorageSetting getStorageSetting() {
        return storageSetting;
    }

    public void setStorageSetting(PipeStorageSetting storageSetting) {
        this.storageSetting = storageSetting;
    }

    public CreatePipeRequestBody withDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public CreatePipeRequestBody withDisplaySetting(Consumer<TableDisplaySetting> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new TableDisplaySetting();
            displaySettingSetter.accept(this.displaySetting);
        }

        return this;
    }

    /**
     * Get displaySetting
     * @return displaySetting
     */
    public TableDisplaySetting getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(TableDisplaySetting displaySetting) {
        this.displaySetting = displaySetting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePipeRequestBody that = (CreatePipeRequestBody) obj;
        return Objects.equals(this.pipeName, that.pipeName) && Objects.equals(this.pipeAlias, that.pipeAlias)
            && Objects.equals(this.category, that.category) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.storageSetting, that.storageSetting)
            && Objects.equals(this.displaySetting, that.displaySetting);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(pipeName, pipeAlias, category, directory, description, schema, storageSetting, displaySetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePipeRequestBody {\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    pipeAlias: ").append(toIndentedString(pipeAlias)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    storageSetting: ").append(toIndentedString(storageSetting)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
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
