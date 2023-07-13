package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateResDatastructRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_config")

    private DataConfig dataConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs_config")

    private SpecsConfig specsConfig;

    public UpdateResDatastructRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据源名称:，1-64位字母、数字、下划线、中划线组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateResDatastructRequestBody withDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }

    public UpdateResDatastructRequestBody withDataConfig(Consumer<DataConfig> dataConfigSetter) {
        if (this.dataConfig == null) {
            this.dataConfig = new DataConfig();
            dataConfigSetter.accept(this.dataConfig);
        }

        return this;
    }

    /**
     * Get dataConfig
     * @return dataConfig
     */
    public DataConfig getDataConfig() {
        return dataConfig;
    }

    public void setDataConfig(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    public UpdateResDatastructRequestBody withSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
        return this;
    }

    public UpdateResDatastructRequestBody withSpecsConfig(Consumer<SpecsConfig> specsConfigSetter) {
        if (this.specsConfig == null) {
            this.specsConfig = new SpecsConfig();
            specsConfigSetter.accept(this.specsConfig);
        }

        return this;
    }

    /**
     * Get specsConfig
     * @return specsConfig
     */
    public SpecsConfig getSpecsConfig() {
        return specsConfig;
    }

    public void setSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResDatastructRequestBody that = (UpdateResDatastructRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.dataConfig, that.dataConfig)
            && Objects.equals(this.specsConfig, that.specsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataConfig, specsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResDatastructRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataConfig: ").append(toIndentedString(dataConfig)).append("\n");
        sb.append("    specsConfig: ").append(toIndentedString(specsConfig)).append("\n");
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
