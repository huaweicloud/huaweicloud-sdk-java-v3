package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启动App实例时输入的配置
 */
public class AppInstanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pgsql_instance_config")

    private PGSQLInstanceConfig pgsqlInstanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_instance_config")

    private ModelServiceInstanceConfig modelInstanceConfig;

    public AppInstanceConfig withPgsqlInstanceConfig(PGSQLInstanceConfig pgsqlInstanceConfig) {
        this.pgsqlInstanceConfig = pgsqlInstanceConfig;
        return this;
    }

    public AppInstanceConfig withPgsqlInstanceConfig(Consumer<PGSQLInstanceConfig> pgsqlInstanceConfigSetter) {
        if (this.pgsqlInstanceConfig == null) {
            this.pgsqlInstanceConfig = new PGSQLInstanceConfig();
            pgsqlInstanceConfigSetter.accept(this.pgsqlInstanceConfig);
        }

        return this;
    }

    /**
     * Get pgsqlInstanceConfig
     * @return pgsqlInstanceConfig
     */
    public PGSQLInstanceConfig getPgsqlInstanceConfig() {
        return pgsqlInstanceConfig;
    }

    public void setPgsqlInstanceConfig(PGSQLInstanceConfig pgsqlInstanceConfig) {
        this.pgsqlInstanceConfig = pgsqlInstanceConfig;
    }

    public AppInstanceConfig withModelInstanceConfig(ModelServiceInstanceConfig modelInstanceConfig) {
        this.modelInstanceConfig = modelInstanceConfig;
        return this;
    }

    public AppInstanceConfig withModelInstanceConfig(Consumer<ModelServiceInstanceConfig> modelInstanceConfigSetter) {
        if (this.modelInstanceConfig == null) {
            this.modelInstanceConfig = new ModelServiceInstanceConfig();
            modelInstanceConfigSetter.accept(this.modelInstanceConfig);
        }

        return this;
    }

    /**
     * Get modelInstanceConfig
     * @return modelInstanceConfig
     */
    public ModelServiceInstanceConfig getModelInstanceConfig() {
        return modelInstanceConfig;
    }

    public void setModelInstanceConfig(ModelServiceInstanceConfig modelInstanceConfig) {
        this.modelInstanceConfig = modelInstanceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppInstanceConfig that = (AppInstanceConfig) obj;
        return Objects.equals(this.pgsqlInstanceConfig, that.pgsqlInstanceConfig)
            && Objects.equals(this.modelInstanceConfig, that.modelInstanceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pgsqlInstanceConfig, modelInstanceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInstanceConfig {\n");
        sb.append("    pgsqlInstanceConfig: ").append(toIndentedString(pgsqlInstanceConfig)).append("\n");
        sb.append("    modelInstanceConfig: ").append(toIndentedString(modelInstanceConfig)).append("\n");
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
