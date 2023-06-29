package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApplicationConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private List<ApplicationConfigConfiguration1> _configuration = null;

    public ShowApplicationConfigurationResponse withConfiguration(
        List<ApplicationConfigConfiguration1> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ShowApplicationConfigurationResponse addConfigurationItem(
        ApplicationConfigConfiguration1 _configurationItem) {
        if (this._configuration == null) {
            this._configuration = new ArrayList<>();
        }
        this._configuration.add(_configurationItem);
        return this;
    }

    public ShowApplicationConfigurationResponse withConfiguration(
        Consumer<List<ApplicationConfigConfiguration1>> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new ArrayList<>();
        }
        _configurationSetter.accept(this._configuration);
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public List<ApplicationConfigConfiguration1> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(List<ApplicationConfigConfiguration1> _configuration) {
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
        ShowApplicationConfigurationResponse that = (ShowApplicationConfigurationResponse) obj;
        return Objects.equals(this._configuration, that._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationConfigurationResponse {\n");
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
