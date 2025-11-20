package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAnalyzerReqBody
 */
public class UpdateAnalyzerReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private AnalyzerConfiguration _configuration;

    public UpdateAnalyzerReqBody withConfiguration(AnalyzerConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public UpdateAnalyzerReqBody withConfiguration(Consumer<AnalyzerConfiguration> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new AnalyzerConfiguration();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public AnalyzerConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(AnalyzerConfiguration _configuration) {
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
        UpdateAnalyzerReqBody that = (UpdateAnalyzerReqBody) obj;
        return Objects.equals(this._configuration, that._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnalyzerReqBody {\n");
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
