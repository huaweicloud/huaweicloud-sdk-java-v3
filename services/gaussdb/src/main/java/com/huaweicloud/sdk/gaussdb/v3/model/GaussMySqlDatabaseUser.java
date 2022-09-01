package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 需要授权的用户信息
 */
public class GaussMySqlDatabaseUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    @JacksonXmlProperty(localName = "host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly")
    
    @JacksonXmlProperty(localName = "readonly")
    
    private Boolean readonly;

    public GaussMySqlDatabaseUser withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GaussMySqlDatabaseUser withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public GaussMySqlDatabaseUser withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    


    /**
     * 是否为只读权限：true表示只读,false表示可读写。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussMySqlDatabaseUser gaussMySqlDatabaseUser = (GaussMySqlDatabaseUser) o;
        return Objects.equals(this.name, gaussMySqlDatabaseUser.name) &&
            Objects.equals(this.host, gaussMySqlDatabaseUser.host) &&
            Objects.equals(this.readonly, gaussMySqlDatabaseUser.readonly);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host, readonly);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussMySqlDatabaseUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

