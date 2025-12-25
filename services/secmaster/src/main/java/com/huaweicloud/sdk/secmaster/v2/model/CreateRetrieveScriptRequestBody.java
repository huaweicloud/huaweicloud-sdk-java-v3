package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateRetrieveScriptRequestBody
 */
public class CreateRetrieveScriptRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private ScriptCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    public CreateRetrieveScriptRequestBody withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * UUID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public CreateRetrieveScriptRequestBody withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名称
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public CreateRetrieveScriptRequestBody withCategory(ScriptCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public ScriptCategory getCategory() {
        return category;
    }

    public void setCategory(ScriptCategory category) {
        this.category = category;
    }

    public CreateRetrieveScriptRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 脚本目录分组名称，长度在1到256个字符之间。
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public CreateRetrieveScriptRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 脚本的相关描述信息，长度在1到1024个字符之间。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRetrieveScriptRequestBody withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * 脚本内容，长度在1到10240个字符之间。
     * @return script
     */
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRetrieveScriptRequestBody that = (CreateRetrieveScriptRequestBody) obj;
        return Objects.equals(this.tableId, that.tableId) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.category, that.category) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.script, that.script);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, scriptName, category, directory, description, script);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetrieveScriptRequestBody {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
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
