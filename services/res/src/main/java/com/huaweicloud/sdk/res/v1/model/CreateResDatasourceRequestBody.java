package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class CreateResDatasourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_name")

    private String datasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs_config")

    private SpecsConfig specsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_config")

    private DataConfig dataConfig;

    public CreateResDatasourceRequestBody withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /** 数据源名称，1-64位字母、数字、下划线、中划线组合。
     * 
     * @return datasourceName */
    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public CreateResDatasourceRequestBody withSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
        return this;
    }

    public CreateResDatasourceRequestBody withSpecsConfig(Consumer<SpecsConfig> specsConfigSetter) {
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

    public CreateResDatasourceRequestBody withDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }

    public CreateResDatasourceRequestBody withDataConfig(Consumer<DataConfig> dataConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResDatasourceRequestBody createResDatasourceRequestBody = (CreateResDatasourceRequestBody) o;
        return Objects.equals(this.datasourceName, createResDatasourceRequestBody.datasourceName)
            && Objects.equals(this.specsConfig, createResDatasourceRequestBody.specsConfig)
            && Objects.equals(this.dataConfig, createResDatasourceRequestBody.dataConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceName, specsConfig, dataConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResDatasourceRequestBody {\n");
        sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
        sb.append("    specsConfig: ").append(toIndentedString(specsConfig)).append("\n");
        sb.append("    dataConfig: ").append(toIndentedString(dataConfig)).append("\n");
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
