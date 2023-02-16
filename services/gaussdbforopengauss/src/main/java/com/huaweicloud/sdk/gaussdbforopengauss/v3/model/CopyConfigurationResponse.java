package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CopyConfigurationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_id")
    
    
    private String configId;

    public CopyConfigurationResponse withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    


    /**
     * 复制后的参数模板ID。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopyConfigurationResponse copyConfigurationResponse = (CopyConfigurationResponse) o;
        return Objects.equals(this.configId, copyConfigurationResponse.configId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyConfigurationResponse {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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

