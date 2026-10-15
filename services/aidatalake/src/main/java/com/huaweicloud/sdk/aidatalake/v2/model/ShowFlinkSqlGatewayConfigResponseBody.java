package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL Gateway连接信息。
 */
public class ShowFlinkSqlGatewayConfigResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_gateway_token")

    private String sqlGatewayToken;

    public ShowFlinkSqlGatewayConfigResponseBody withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**：SQL Gateway的Ingress访问域名，格式为sql-gateway-{jobId}。 **取值范围**：长度为1~253个字符。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowFlinkSqlGatewayConfigResponseBody withSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
        return this;
    }

    /**
     * **参数解释**：SQL Gateway鉴权Token。 **取值范围**：已配置时固定返回 ******；未配置时不返回该字段。
     * @return sqlGatewayToken
     */
    public String getSqlGatewayToken() {
        return sqlGatewayToken;
    }

    public void setSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkSqlGatewayConfigResponseBody that = (ShowFlinkSqlGatewayConfigResponseBody) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.sqlGatewayToken, that.sqlGatewayToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, sqlGatewayToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkSqlGatewayConfigResponseBody {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    sqlGatewayToken: ").append(toIndentedString(sqlGatewayToken)).append("\n");
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
