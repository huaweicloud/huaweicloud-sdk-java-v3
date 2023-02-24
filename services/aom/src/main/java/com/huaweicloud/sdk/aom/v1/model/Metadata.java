package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务节点形状信息。
 */
public class Metadata  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration")
    
    private Map<String, Object> _configuration = null;
    
    public Metadata withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 形状,节点类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Metadata withConfiguration(Map<String, Object> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    

    public Metadata putConfigurationItem(String key, Object _configurationItem) {
        if(this._configuration == null) {
            this._configuration = new HashMap<>();
        }
        this._configuration.put(key, _configurationItem);
        return this;
    }

    public Metadata withConfiguration(Consumer<Map<String, Object>> _configurationSetter) {
        if(this._configuration == null) {
            this._configuration = new HashMap<>();
        }
        _configurationSetter.accept(this._configuration);
        return this;
    }
    /**
     * 配置信息。
     * @return _configuration
     */
    public Map<String, Object> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Map<String, Object> _configuration) {
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
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.type, metadata.type) &&
            Objects.equals(this._configuration, metadata._configuration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, _configuration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

