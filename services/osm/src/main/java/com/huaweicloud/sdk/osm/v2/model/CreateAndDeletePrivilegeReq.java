package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateAndDeletePrivilegeReq
 */
public class CreateAndDeletePrivilegeReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privilege")
    
    private String privilege;

    public CreateAndDeletePrivilegeReq withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 执行的操作(create|delete)
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    

    public CreateAndDeletePrivilegeReq withPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    


    /**
     * 权限标识
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAndDeletePrivilegeReq createAndDeletePrivilegeReq = (CreateAndDeletePrivilegeReq) o;
        return Objects.equals(this.operation, createAndDeletePrivilegeReq.operation) &&
            Objects.equals(this.privilege, createAndDeletePrivilegeReq.privilege);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operation, privilege);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAndDeletePrivilegeReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

