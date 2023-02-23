package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改设备设备配置结构体。
 */
public class UpdateDesireds  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    

    private Object config;

    public UpdateDesireds withConfig(Object config) {
        this.config = config;
        return this;
    }

    


    /**
     * 设备配置，内容由产品的$config服务定义。
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDesireds updateDesireds = (UpdateDesireds) o;
        return Objects.equals(this.config, updateDesireds.config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesireds {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

