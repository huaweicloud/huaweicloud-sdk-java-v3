package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateMySQLCompatibilityRequestBody
 */
public class UpdateMySQLCompatibilityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    public UpdateMySQLCompatibilityRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * M兼容端口，可选范围为：0, 1024-39989。   - 如下端口不可设置： 2378，2379，2380，2400，4999，5000，5001，5100，5500，5999，6000，6001，6009，6010，6500，8015，8097，8098，8181，9090，9100，9180，9187，9200，12016，12017，20049，20050，21731，21732，32122，32123，32124，32125，32126，39001，[数据库端口, 数据库端口+10]。   - 取值为0，表示关闭M兼容端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
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
        UpdateMySQLCompatibilityRequestBody that = (UpdateMySQLCompatibilityRequestBody) obj;
        return Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMySQLCompatibilityRequestBody {\n");
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
