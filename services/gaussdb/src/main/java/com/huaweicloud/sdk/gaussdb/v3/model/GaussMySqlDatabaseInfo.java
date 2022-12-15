package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 已授权数据库用户信息。
 */
public class GaussMySqlDatabaseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly")
    
    
    private Boolean readonly;

    public GaussMySqlDatabaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GaussMySqlDatabaseInfo withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public GaussMySqlDatabaseInfo withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    


    /**
     * 是否为只读权限： - true，表示只读。 - false，表示可读写。
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
        GaussMySqlDatabaseInfo gaussMySqlDatabaseInfo = (GaussMySqlDatabaseInfo) o;
        return Objects.equals(this.name, gaussMySqlDatabaseInfo.name) &&
            Objects.equals(this.host, gaussMySqlDatabaseInfo.host) &&
            Objects.equals(this.readonly, gaussMySqlDatabaseInfo.readonly);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host, readonly);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussMySqlDatabaseInfo {\n");
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

