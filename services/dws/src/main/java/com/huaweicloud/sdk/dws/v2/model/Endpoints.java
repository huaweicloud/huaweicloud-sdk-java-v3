package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Endpoints  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connect_info")
    
    private String connectInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jdbc_url")
    
    private String jdbcUrl;

    public Endpoints withConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }

    


    /**
     * 内网连接信息。
     * @return connectInfo
     */
    public String getConnectInfo() {
        return connectInfo;
    }

    public void setConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
    }

    public Endpoints withJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }

    


    /**
     * 内网JDBC URL，默认格式如下： jdbc:postgresql://< connect_info>/<YOUR_DATABASE_NAME>
     * @return jdbcUrl
     */
    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoints endpoints = (Endpoints) o;
        return Objects.equals(this.connectInfo, endpoints.connectInfo) &&
            Objects.equals(this.jdbcUrl, endpoints.jdbcUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connectInfo, jdbcUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoints {\n");
        sb.append("    connectInfo: ").append(toIndentedString(connectInfo)).append("\n");
        sb.append("    jdbcUrl: ").append(toIndentedString(jdbcUrl)).append("\n");
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

