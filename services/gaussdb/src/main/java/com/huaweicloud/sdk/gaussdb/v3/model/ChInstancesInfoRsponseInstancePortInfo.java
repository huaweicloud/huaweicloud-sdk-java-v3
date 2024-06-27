package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端口信息。
 */
public class ChInstancesInfoRsponseInstancePortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tep_port")

    private Integer tepPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_port")

    private Integer mysqlPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_port")

    private Integer httpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tep_secure_port")

    private Integer tepSecurePort;

    public ChInstancesInfoRsponseInstancePortInfo withTepPort(Integer tepPort) {
        this.tepPort = tepPort;
        return this;
    }

    /**
     * tep端口。取值范围：0~65535。
     * @return tepPort
     */
    public Integer getTepPort() {
        return tepPort;
    }

    public void setTepPort(Integer tepPort) {
        this.tepPort = tepPort;
    }

    public ChInstancesInfoRsponseInstancePortInfo withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * http端口。取值范围：0~65535。
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public ChInstancesInfoRsponseInstancePortInfo withMysqlPort(Integer mysqlPort) {
        this.mysqlPort = mysqlPort;
        return this;
    }

    /**
     * MySql端口号。取值范围：0~65535。
     * @return mysqlPort
     */
    public Integer getMysqlPort() {
        return mysqlPort;
    }

    public void setMysqlPort(Integer mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    public ChInstancesInfoRsponseInstancePortInfo withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * https端口号。取值范围：0~65535。
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public ChInstancesInfoRsponseInstancePortInfo withTepSecurePort(Integer tepSecurePort) {
        this.tepSecurePort = tepSecurePort;
        return this;
    }

    /**
     * tep安全端口。取值范围：0~65535。
     * @return tepSecurePort
     */
    public Integer getTepSecurePort() {
        return tepSecurePort;
    }

    public void setTepSecurePort(Integer tepSecurePort) {
        this.tepSecurePort = tepSecurePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChInstancesInfoRsponseInstancePortInfo that = (ChInstancesInfoRsponseInstancePortInfo) obj;
        return Objects.equals(this.tepPort, that.tepPort) && Objects.equals(this.httpPort, that.httpPort)
            && Objects.equals(this.mysqlPort, that.mysqlPort) && Objects.equals(this.httpsPort, that.httpsPort)
            && Objects.equals(this.tepSecurePort, that.tepSecurePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tepPort, httpPort, mysqlPort, httpsPort, tepSecurePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChInstancesInfoRsponseInstancePortInfo {\n");
        sb.append("    tepPort: ").append(toIndentedString(tepPort)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    mysqlPort: ").append(toIndentedString(mysqlPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
        sb.append("    tepSecurePort: ").append(toIndentedString(tepSecurePort)).append("\n");
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
