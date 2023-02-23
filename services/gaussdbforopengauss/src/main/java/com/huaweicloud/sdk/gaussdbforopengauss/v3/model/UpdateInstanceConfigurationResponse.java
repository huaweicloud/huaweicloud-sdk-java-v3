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
public class UpdateInstanceConfigurationResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restart_required")
    

    private Boolean restartRequired;

    public UpdateInstanceConfigurationResponse withRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
        return this;
    }

    


    /**
     * 实例是否需要重启。  - “true”需要重启。 - “false”不需要重启。
     * @return restartRequired
     */
    public Boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceConfigurationResponse updateInstanceConfigurationResponse = (UpdateInstanceConfigurationResponse) o;
        return Objects.equals(this.restartRequired, updateInstanceConfigurationResponse.restartRequired);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restartRequired);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceConfigurationResponse {\n");
        sb.append("    restartRequired: ").append(toIndentedString(restartRequired)).append("\n");
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

