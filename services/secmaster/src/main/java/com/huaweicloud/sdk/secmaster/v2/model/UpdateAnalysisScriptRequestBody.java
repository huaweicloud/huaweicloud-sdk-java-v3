package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAnalysisScriptRequestBody
 */
public class UpdateAnalysisScriptRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_type")

    private AnalysisScriptType scriptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieve_table_id")

    private String retrieveTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private List<AnalysisScriptParam> owner = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<AnalysisScriptParam> scriptParams = null;

    public UpdateAnalysisScriptRequestBody withScriptName(String scriptName) {
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

    public UpdateAnalysisScriptRequestBody withDirectory(String directory) {
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

    public UpdateAnalysisScriptRequestBody withDescription(String description) {
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

    public UpdateAnalysisScriptRequestBody withScriptType(AnalysisScriptType scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * Get scriptType
     * @return scriptType
     */
    public AnalysisScriptType getScriptType() {
        return scriptType;
    }

    public void setScriptType(AnalysisScriptType scriptType) {
        this.scriptType = scriptType;
    }

    public UpdateAnalysisScriptRequestBody withRetrieveTableId(String retrieveTableId) {
        this.retrieveTableId = retrieveTableId;
        return this;
    }

    /**
     * UUID
     * @return retrieveTableId
     */
    public String getRetrieveTableId() {
        return retrieveTableId;
    }

    public void setRetrieveTableId(String retrieveTableId) {
        this.retrieveTableId = retrieveTableId;
    }

    public UpdateAnalysisScriptRequestBody withScript(String script) {
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

    public UpdateAnalysisScriptRequestBody withOwner(List<AnalysisScriptParam> owner) {
        this.owner = owner;
        return this;
    }

    public UpdateAnalysisScriptRequestBody addOwnerItem(AnalysisScriptParam ownerItem) {
        if (this.owner == null) {
            this.owner = new ArrayList<>();
        }
        this.owner.add(ownerItem);
        return this;
    }

    public UpdateAnalysisScriptRequestBody withOwner(Consumer<List<AnalysisScriptParam>> ownerSetter) {
        if (this.owner == null) {
            this.owner = new ArrayList<>();
        }
        ownerSetter.accept(this.owner);
        return this;
    }

    /**
     * 分析脚本参数列表
     * @return owner
     */
    public List<AnalysisScriptParam> getOwner() {
        return owner;
    }

    public void setOwner(List<AnalysisScriptParam> owner) {
        this.owner = owner;
    }

    public UpdateAnalysisScriptRequestBody withScriptParams(List<AnalysisScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public UpdateAnalysisScriptRequestBody addScriptParamsItem(AnalysisScriptParam scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public UpdateAnalysisScriptRequestBody withScriptParams(Consumer<List<AnalysisScriptParam>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 分析脚本参数列表
     * @return scriptParams
     */
    public List<AnalysisScriptParam> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<AnalysisScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAnalysisScriptRequestBody that = (UpdateAnalysisScriptRequestBody) obj;
        return Objects.equals(this.scriptName, that.scriptName) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.description, that.description) && Objects.equals(this.scriptType, that.scriptType)
            && Objects.equals(this.retrieveTableId, that.retrieveTableId) && Objects.equals(this.script, that.script)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.scriptParams, that.scriptParams);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scriptName, directory, description, scriptType, retrieveTableId, script, owner, scriptParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnalysisScriptRequestBody {\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    retrieveTableId: ").append(toIndentedString(retrieveTableId)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
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
