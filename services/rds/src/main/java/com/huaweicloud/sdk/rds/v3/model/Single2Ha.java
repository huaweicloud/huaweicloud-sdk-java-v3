package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 单机转主备时必填。
 */
public class Single2Ha  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code_new_node")
    
    private String azCodeNewNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dsspool_id")
    
    private String dsspoolId;

    public Single2Ha withAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
        return this;
    }

    


    /**
     * 实例节点可用区码（AZ）。
     * @return azCodeNewNode
     */
    public String getAzCodeNewNode() {
        return azCodeNewNode;
    }

    public void setAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
    }

    public Single2Ha withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 仅在支持SQL Server数据库实例进行单机转主备时必选，有效。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Single2Ha withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    


    /**
     * 创建新节点所在专属存储池ID，仅专属云创建实例时有效。
     * @return dsspoolId
     */
    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Single2Ha single2Ha = (Single2Ha) o;
        return Objects.equals(this.azCodeNewNode, single2Ha.azCodeNewNode) &&
            Objects.equals(this.password, single2Ha.password) &&
            Objects.equals(this.dsspoolId, single2Ha.dsspoolId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(azCodeNewNode, password, dsspoolId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Single2Ha {\n");
        sb.append("    azCodeNewNode: ").append(toIndentedString(azCodeNewNode)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
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

