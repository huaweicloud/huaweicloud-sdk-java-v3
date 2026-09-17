package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOperationalTaskConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private OperationalTaskConfiguration _configuration;

    public ShowOperationalTaskConfigResponse withConfiguration(OperationalTaskConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ShowOperationalTaskConfigResponse withConfiguration(
        Consumer<OperationalTaskConfiguration> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new OperationalTaskConfiguration();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public OperationalTaskConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(OperationalTaskConfiguration _configuration) {
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
        ShowOperationalTaskConfigResponse that = (ShowOperationalTaskConfigResponse) obj;
        return Objects.equals(this._configuration, that._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOperationalTaskConfigResponse {\n");
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
