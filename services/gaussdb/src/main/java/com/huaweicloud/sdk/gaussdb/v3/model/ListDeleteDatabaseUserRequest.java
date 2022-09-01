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
 * ListDeleteDatabaseUserRequest
 */
public class ListDeleteDatabaseUserRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    @JacksonXmlProperty(localName = "host")
    
    private String host;

    public ListDeleteDatabaseUserRequest withName(String name) {
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

    

    public ListDeleteDatabaseUserRequest withHost(String host) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeleteDatabaseUserRequest listDeleteDatabaseUserRequest = (ListDeleteDatabaseUserRequest) o;
        return Objects.equals(this.name, listDeleteDatabaseUserRequest.name) &&
            Objects.equals(this.host, listDeleteDatabaseUserRequest.host);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeleteDatabaseUserRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

