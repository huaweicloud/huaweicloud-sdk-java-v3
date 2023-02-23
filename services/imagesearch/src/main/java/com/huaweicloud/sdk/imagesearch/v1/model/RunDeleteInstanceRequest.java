package com.huaweicloud.sdk.imagesearch.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunDeleteInstanceRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    

    private String instanceName;

    public RunDeleteInstanceRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunDeleteInstanceRequest runDeleteInstanceRequest = (RunDeleteInstanceRequest) o;
        return Objects.equals(this.instanceName, runDeleteInstanceRequest.instanceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunDeleteInstanceRequest {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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

