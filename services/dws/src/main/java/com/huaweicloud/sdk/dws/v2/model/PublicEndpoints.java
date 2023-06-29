package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PublicEndpoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_connect_info")

    private String publicConnectInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jdbc_url")

    private String jdbcUrl;

    public PublicEndpoints withPublicConnectInfo(String publicConnectInfo) {
        this.publicConnectInfo = publicConnectInfo;
        return this;
    }

    /**
     * 公网连接信息
     * @return publicConnectInfo
     */
    public String getPublicConnectInfo() {
        return publicConnectInfo;
    }

    public void setPublicConnectInfo(String publicConnectInfo) {
        this.publicConnectInfo = publicConnectInfo;
    }

    public PublicEndpoints withJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }

    /**
     * 公网JDBC URL，默认格式如下： jdbc:postgresql://<public_connect_info>/<YOUR_DATABASE_name>
     * @return jdbcUrl
     */
    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicEndpoints that = (PublicEndpoints) obj;
        return Objects.equals(this.publicConnectInfo, that.publicConnectInfo)
            && Objects.equals(this.jdbcUrl, that.jdbcUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicConnectInfo, jdbcUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicEndpoints {\n");
        sb.append("    publicConnectInfo: ").append(toIndentedString(publicConnectInfo)).append("\n");
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
