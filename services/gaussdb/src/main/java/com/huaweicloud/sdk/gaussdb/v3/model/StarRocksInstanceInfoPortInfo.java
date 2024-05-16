package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端口信息。
 */
public class StarRocksInstanceInfoPortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_port")

    private Integer mysqlPort;

    public StarRocksInstanceInfoPortInfo withMysqlPort(Integer mysqlPort) {
        this.mysqlPort = mysqlPort;
        return this;
    }

    /**
     * MySQL端口号。默认3306。
     * @return mysqlPort
     */
    public Integer getMysqlPort() {
        return mysqlPort;
    }

    public void setMysqlPort(Integer mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksInstanceInfoPortInfo that = (StarRocksInstanceInfoPortInfo) obj;
        return Objects.equals(this.mysqlPort, that.mysqlPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mysqlPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksInstanceInfoPortInfo {\n");
        sb.append("    mysqlPort: ").append(toIndentedString(mysqlPort)).append("\n");
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
