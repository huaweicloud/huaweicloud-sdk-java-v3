package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyNodes
 */
public class MysqlProxyNodes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    
    private String role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    
    
    private String azCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frozen_flag")
    
    
    private Integer frozenFlag;

    public MysqlProxyNodes withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Proxy节点id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlProxyNodes withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Proxy节点状态。 取值范围：normal、abnormal、creating和deleted。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MysqlProxyNodes withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Proxy节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public MysqlProxyNodes withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * Proxy节点角色：master和slave。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public MysqlProxyNodes withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    public MysqlProxyNodes withFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
        return this;
    }

    


    /**
     * Proxy节点是否被冻结：0-未冻结；1-冻结；2-冻结删除。
     * @return frozenFlag
     */
    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxyNodes mysqlProxyNodes = (MysqlProxyNodes) o;
        return Objects.equals(this.id, mysqlProxyNodes.id) &&
            Objects.equals(this.status, mysqlProxyNodes.status) &&
            Objects.equals(this.name, mysqlProxyNodes.name) &&
            Objects.equals(this.role, mysqlProxyNodes.role) &&
            Objects.equals(this.azCode, mysqlProxyNodes.azCode) &&
            Objects.equals(this.frozenFlag, mysqlProxyNodes.frozenFlag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, role, azCode, frozenFlag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyNodes {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    frozenFlag: ").append(toIndentedString(frozenFlag)).append("\n");
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

