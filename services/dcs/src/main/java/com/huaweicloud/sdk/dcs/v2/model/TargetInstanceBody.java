package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 目标实例信息。
 */
public class TargetInstanceBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;

    public TargetInstanceBody withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Redis实例ID（target_instance信息中必须填写）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TargetInstanceBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Redis实例名称(target_instance信息中填写)。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetInstanceBody withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * Redis密码，如果设置了密码，则必须填写。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetInstanceBody targetInstanceBody = (TargetInstanceBody) o;
        return Objects.equals(this.id, targetInstanceBody.id) &&
            Objects.equals(this.name, targetInstanceBody.name) &&
            Objects.equals(this.password, targetInstanceBody.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetInstanceBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

