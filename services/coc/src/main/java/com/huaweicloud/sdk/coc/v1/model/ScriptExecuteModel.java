package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScriptExecuteModel
 */
public class ScriptExecuteModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_param")

    private ScriptExecuteParam executeParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_batches")

    private List<ExecuteInstancesBatchInfo> executeBatches = null;

    public ScriptExecuteModel withExecuteParam(ScriptExecuteParam executeParam) {
        this.executeParam = executeParam;
        return this;
    }

    public ScriptExecuteModel withExecuteParam(Consumer<ScriptExecuteParam> executeParamSetter) {
        if (this.executeParam == null) {
            this.executeParam = new ScriptExecuteParam();
            executeParamSetter.accept(this.executeParam);
        }

        return this;
    }

    /**
     * Get executeParam
     * @return executeParam
     */
    public ScriptExecuteParam getExecuteParam() {
        return executeParam;
    }

    public void setExecuteParam(ScriptExecuteParam executeParam) {
        this.executeParam = executeParam;
    }

    public ScriptExecuteModel withExecuteBatches(List<ExecuteInstancesBatchInfo> executeBatches) {
        this.executeBatches = executeBatches;
        return this;
    }

    public ScriptExecuteModel addExecuteBatchesItem(ExecuteInstancesBatchInfo executeBatchesItem) {
        if (this.executeBatches == null) {
            this.executeBatches = new ArrayList<>();
        }
        this.executeBatches.add(executeBatchesItem);
        return this;
    }

    public ScriptExecuteModel withExecuteBatches(Consumer<List<ExecuteInstancesBatchInfo>> executeBatchesSetter) {
        if (this.executeBatches == null) {
            this.executeBatches = new ArrayList<>();
        }
        executeBatchesSetter.accept(this.executeBatches);
        return this;
    }

    /**
     * 目标实例分批信息
     * @return executeBatches
     */
    public List<ExecuteInstancesBatchInfo> getExecuteBatches() {
        return executeBatches;
    }

    public void setExecuteBatches(List<ExecuteInstancesBatchInfo> executeBatches) {
        this.executeBatches = executeBatches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecuteModel that = (ScriptExecuteModel) obj;
        return Objects.equals(this.executeParam, that.executeParam)
            && Objects.equals(this.executeBatches, that.executeBatches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeParam, executeBatches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecuteModel {\n");
        sb.append("    executeParam: ").append(toIndentedString(executeParam)).append("\n");
        sb.append("    executeBatches: ").append(toIndentedString(executeBatches)).append("\n");
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
