package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群的内网连接信息。 **取值范围**： 不涉及。
 */
public class Endpoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_info")

    private String connectInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jdbc_url")

    private String jdbcUrl;

    public Endpoints withConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }

    /**
     * **参数解释**： 内网连接信息。 **取值范围**： 不涉及。
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
     * **参数解释**： 内网JDBC URL。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： jdbc:postgresql://<connect_info>/<YOUR_DATABASE_NAME>
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
        Endpoints that = (Endpoints) obj;
        return Objects.equals(this.connectInfo, that.connectInfo) && Objects.equals(this.jdbcUrl, that.jdbcUrl);
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
