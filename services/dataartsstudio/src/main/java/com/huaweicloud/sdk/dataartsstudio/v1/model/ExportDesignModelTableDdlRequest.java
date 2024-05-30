package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportDesignModelTableDdlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_names")

    private List<String> tbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_db")

    private Boolean withDb;

    public ExportDesignModelTableDdlRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ExportDesignModelTableDdlRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ExportDesignModelTableDdlRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 所属关系建模的模型ID，填写String类型替代Long类型。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ExportDesignModelTableDdlRequest withTbNames(List<String> tbNames) {
        this.tbNames = tbNames;
        return this;
    }

    public ExportDesignModelTableDdlRequest addTbNamesItem(String tbNamesItem) {
        if (this.tbNames == null) {
            this.tbNames = new ArrayList<>();
        }
        this.tbNames.add(tbNamesItem);
        return this;
    }

    public ExportDesignModelTableDdlRequest withTbNames(Consumer<List<String>> tbNamesSetter) {
        if (this.tbNames == null) {
            this.tbNames = new ArrayList<>();
        }
        tbNamesSetter.accept(this.tbNames);
        return this;
    }

    /**
     * 待导出的表名。
     * @return tbNames
     */
    public List<String> getTbNames() {
        return tbNames;
    }

    public void setTbNames(List<String> tbNames) {
        this.tbNames = tbNames;
    }

    public ExportDesignModelTableDdlRequest withWithDb(Boolean withDb) {
        this.withDb = withDb;
        return this;
    }

    /**
     * 导出的DDL包不包括数据库名。
     * @return withDb
     */
    public Boolean getWithDb() {
        return withDb;
    }

    public void setWithDb(Boolean withDb) {
        this.withDb = withDb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportDesignModelTableDdlRequest that = (ExportDesignModelTableDdlRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.tbNames, that.tbNames)
            && Objects.equals(this.withDb, that.withDb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, modelId, tbNames, withDb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportDesignModelTableDdlRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    tbNames: ").append(toIndentedString(tbNames)).append("\n");
        sb.append("    withDb: ").append(toIndentedString(withDb)).append("\n");
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
