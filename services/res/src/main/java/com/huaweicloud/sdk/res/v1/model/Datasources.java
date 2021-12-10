package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Datasources */
public class Datasources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_name")

    private String datasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure")

    private String structure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_config")

    private DataConfig dataConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs_config")

    private SpecsConfig specsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    public Datasources withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /** 数据源id。
     * 
     * @return datasourceId */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Datasources withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /** 名称。
     * 
     * @return datasourceName */
    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public Datasources withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Datasources withStructure(String structure) {
        this.structure = structure;
        return this;
    }

    /** 结构。
     * 
     * @return structure */
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Datasources withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /** 工作空间编号。
     * 
     * @return workspaceId */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Datasources withDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }

    public Datasources withDataConfig(Consumer<DataConfig> dataConfigSetter) {
        if (this.dataConfig == null) {
            this.dataConfig = new DataConfig();
            dataConfigSetter.accept(this.dataConfig);
        }

        return this;
    }

    /** Get dataConfig
     * 
     * @return dataConfig */
    public DataConfig getDataConfig() {
        return dataConfig;
    }

    public void setDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    public Datasources withSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
        return this;
    }

    public Datasources withSpecsConfig(Consumer<SpecsConfig> specsConfigSetter) {
        if (this.specsConfig == null) {
            this.specsConfig = new SpecsConfig();
            specsConfigSetter.accept(this.specsConfig);
        }

        return this;
    }

    /** Get specsConfig
     * 
     * @return specsConfig */
    public SpecsConfig getSpecsConfig() {
        return specsConfig;
    }

    public void setSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
    }

    public Datasources withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdAt */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Datasources withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updateAt */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Datasources datasources = (Datasources) o;
        return Objects.equals(this.datasourceId, datasources.datasourceId)
            && Objects.equals(this.datasourceName, datasources.datasourceName)
            && Objects.equals(this.status, datasources.status) && Objects.equals(this.structure, datasources.structure)
            && Objects.equals(this.workspaceId, datasources.workspaceId)
            && Objects.equals(this.dataConfig, datasources.dataConfig)
            && Objects.equals(this.specsConfig, datasources.specsConfig)
            && Objects.equals(this.createdAt, datasources.createdAt)
            && Objects.equals(this.updateAt, datasources.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceId,
            datasourceName,
            status,
            structure,
            workspaceId,
            dataConfig,
            specsConfig,
            createdAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Datasources {\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataConfig: ").append(toIndentedString(dataConfig)).append("\n");
        sb.append("    specsConfig: ").append(toIndentedString(specsConfig)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
