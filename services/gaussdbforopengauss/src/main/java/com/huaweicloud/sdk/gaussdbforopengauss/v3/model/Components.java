package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 组件列表
 */
public class Components  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    public Components withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 组件id，当组件类型为DN，组件id为6001，则对应的值为dn_6001。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Components withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 节点类型，取值为“master”、“slave”，分别对应于主节点、备节点。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public Components withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Components components = (Components) o;
        return Objects.equals(this.id, components.id) &&
            Objects.equals(this.role, components.role) &&
            Objects.equals(this.status, components.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, role, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Components {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

