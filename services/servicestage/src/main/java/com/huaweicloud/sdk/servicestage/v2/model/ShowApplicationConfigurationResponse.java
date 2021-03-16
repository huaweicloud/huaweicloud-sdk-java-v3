package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationListConfigConfiguration1;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowApplicationConfigurationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration")
    
    private List<ApplicationListConfigConfiguration1> _configuration = null;
    
    public ShowApplicationConfigurationResponse withConfiguration(List<ApplicationListConfigConfiguration1> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    
    public ShowApplicationConfigurationResponse addConfigurationItem(ApplicationListConfigConfiguration1 _configurationItem) {
        this._configuration.add(_configurationItem);
        return this;
    }

    public ShowApplicationConfigurationResponse withConfiguration(Consumer<List<ApplicationListConfigConfiguration1>> _configurationSetter) {
        if(this._configuration == null ){
            this._configuration = new ArrayList<>();
        }
        _configurationSetter.accept(this._configuration);
        return this;
    }

    /**
     * 应用配置列表。
     * @return _configuration
     */
    public List<ApplicationListConfigConfiguration1> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(List<ApplicationListConfigConfiguration1> _configuration) {
        this._configuration = _configuration;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApplicationConfigurationResponse showApplicationConfigurationResponse = (ShowApplicationConfigurationResponse) o;
        return Objects.equals(this._configuration, showApplicationConfigurationResponse._configuration);
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

