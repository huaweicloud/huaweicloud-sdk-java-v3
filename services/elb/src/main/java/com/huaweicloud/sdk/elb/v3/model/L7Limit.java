package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * L7Limit
 */
public class L7Limit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Integer connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cps")

    private Integer cps;

    public L7Limit withConnection(Integer connection) {
        this.connection = connection;
        return this;
    }

    /**
     * **参数解释**：负载均衡实例的七层规格的最大并发连接数限速值。  **取值范围**：不涉及
     * @return connection
     */
    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public L7Limit withCps(Integer cps) {
        this.cps = cps;
        return this;
    }

    /**
     * **参数解释**：负载均衡实例的七层规格的每秒新建连接数限速值。  **取值范围**：不涉及
     * @return cps
     */
    public Integer getCps() {
        return cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        L7Limit that = (L7Limit) obj;
        return Objects.equals(this.connection, that.connection) && Objects.equals(this.cps, that.cps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, cps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7Limit {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    cps: ").append(toIndentedString(cps)).append("\n");
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
