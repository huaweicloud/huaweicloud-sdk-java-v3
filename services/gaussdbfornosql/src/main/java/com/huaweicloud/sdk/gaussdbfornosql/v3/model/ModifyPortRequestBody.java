package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyPortRequestBody
 */
public class ModifyPortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public ModifyPortRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 新端口号。端口有效范围为2100~9500，暂不支持8636、8637和8638。GaussDB(for Mongo)副本集4.0数据库实例端口有效范围为2100~9500，暂不支持8636、8637和8638。 GaussDB(for Cassandra)数据库实例端口有效范围为2100~9500，暂不支持7000，7001，7199，8636，8479，8484，8999，8018，2180，2887，3887，8079，8091，8092。 GaussDB(for Redis)数据库实例端口有效范围为1024~65535，暂不支持2180、2887、3887、6377、6378、6380、8018、8079、8091、8479、8484、8999、12017、12333、50069。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyPortRequestBody that = (ModifyPortRequestBody) obj;
        return Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPortRequestBody {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
