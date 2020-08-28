package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ProtectPolicyOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_protection")
    
    private Boolean operationProtection;

    public ProtectPolicyOption withOperationProtection(Boolean operationProtection) {
        this.operationProtection = operationProtection;
        return this;
    }

    


    /**
     * 是否开启操作保护，开启为\"true\"，未开启为\"false\"。
     * @return operationProtection
     */
    public Boolean getOperationProtection() {
        return operationProtection;
    }

    public void setOperationProtection(Boolean operationProtection) {
        this.operationProtection = operationProtection;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectPolicyOption protectPolicyOption = (ProtectPolicyOption) o;
        return Objects.equals(this.operationProtection, protectPolicyOption.operationProtection);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operationProtection);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectPolicyOption {\n");
        sb.append("    operationProtection: ").append(toIndentedString(operationProtection)).append("\n");
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

