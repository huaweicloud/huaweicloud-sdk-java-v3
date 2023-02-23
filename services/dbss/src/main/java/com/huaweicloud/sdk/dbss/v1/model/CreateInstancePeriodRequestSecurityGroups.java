package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateInstancePeriodRequestSecurityGroups
 */
public class CreateInstancePeriodRequestSecurityGroups  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    public CreateInstancePeriodRequestSecurityGroups withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云服务器对应的安全组ID，会对创建云服务器中配置的网卡生效
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstancePeriodRequestSecurityGroups createInstancePeriodRequestSecurityGroups = (CreateInstancePeriodRequestSecurityGroups) o;
        return Objects.equals(this.id, createInstancePeriodRequestSecurityGroups.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstancePeriodRequestSecurityGroups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

