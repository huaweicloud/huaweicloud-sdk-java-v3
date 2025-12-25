package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigurationInfoDto
 */
public class ConfigurationInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private List<ConfigurationDetail> _configuration = null;

    public ConfigurationInfoDto withConfiguration(List<ConfigurationDetail> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ConfigurationInfoDto addConfigurationItem(ConfigurationDetail _configurationItem) {
        if (this._configuration == null) {
            this._configuration = new ArrayList<>();
        }
        this._configuration.add(_configurationItem);
        return this;
    }

    public ConfigurationInfoDto withConfiguration(Consumer<List<ConfigurationDetail>> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new ArrayList<>();
        }
        _configurationSetter.accept(this._configuration);
        return this;
    }

    /**
     * 节点配置信息
     * @return _configuration
     */
    public List<ConfigurationDetail> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(List<ConfigurationDetail> _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationInfoDto that = (ConfigurationInfoDto) obj;
        return Objects.equals(this._configuration, that._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationInfoDto {\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
