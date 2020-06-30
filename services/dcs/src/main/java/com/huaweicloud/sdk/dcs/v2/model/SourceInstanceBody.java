package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源实例信息。
 */
public class SourceInstanceBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addrs")
    
    private String addrs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;

    public SourceInstanceBody withAddrs(String addrs) {
        this.addrs = addrs;
        return this;
    }

    


    /**
     * Redis实例名称(source_instance信息中填写)。
     * @return addrs
     */
    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public SourceInstanceBody withPassword(String password) {
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
        SourceInstanceBody sourceInstanceBody = (SourceInstanceBody) o;
        return Objects.equals(this.addrs, sourceInstanceBody.addrs) &&
            Objects.equals(this.password, sourceInstanceBody.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addrs, password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceInstanceBody {\n");
        sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
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

