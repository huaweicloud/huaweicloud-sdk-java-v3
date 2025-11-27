package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：规格指标信息。
 */
public class FlavorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Integer connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cps")

    private Integer cps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_connection")

    private Integer tlsConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_cps")

    private Integer tlsCps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Integer qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lcu")

    private Integer lcu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_cps")

    private Integer httpsCps;

    public FlavorInfo withConnection(Integer connection) {
        this.connection = connection;
        return this;
    }

    /**
     * **参数解释**：最大并发连接数。单位：个。  **取值范围**：不涉及
     * @return connection
     */
    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public FlavorInfo withCps(Integer cps) {
        this.cps = cps;
        return this;
    }

    /**
     * **参数解释**：每秒新建连接数。单位：个。  **取值范围**：不涉及
     * @return cps
     */
    public Integer getCps() {
        return cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    public FlavorInfo withTlsConnection(Integer tlsConnection) {
        this.tlsConnection = tlsConnection;
        return this;
    }

    /**
     * **参数解释**：tls最大并发连接数。单位：个。  **取值范围**：不涉及
     * @return tlsConnection
     */
    public Integer getTlsConnection() {
        return tlsConnection;
    }

    public void setTlsConnection(Integer tlsConnection) {
        this.tlsConnection = tlsConnection;
    }

    public FlavorInfo withTlsCps(Integer tlsCps) {
        this.tlsCps = tlsCps;
        return this;
    }

    /**
     * **参数解释**：tls每秒新建连接数。单位：个。  **取值范围**：不涉及
     * @return tlsCps
     */
    public Integer getTlsCps() {
        return tlsCps;
    }

    public void setTlsCps(Integer tlsCps) {
        this.tlsCps = tlsCps;
    }

    public FlavorInfo withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * **参数解释**：每秒查询速率。单位：个。仅7层LB有该指标。  **取值范围**：不涉及
     * @return qps
     */
    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

    public FlavorInfo withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * **参数解释**：带宽。单位：Kbit/s。  **取值范围**：不涉及
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public FlavorInfo withLcu(Integer lcu) {
        this.lcu = lcu;
        return this;
    }

    /**
     * **参数解释**：当前flavor对应的lcu数量。单位：个。  **取值范围**：不涉及  > LCU是用来衡量独享型ELB处理性能综合指标，LCU值越大，性能越好。
     * @return lcu
     */
    public Integer getLcu() {
        return lcu;
    }

    public void setLcu(Integer lcu) {
        this.lcu = lcu;
    }

    public FlavorInfo withHttpsCps(Integer httpsCps) {
        this.httpsCps = httpsCps;
        return this;
    }

    /**
     * **参数解释**：https新建连接数，仅7层LB有该指标。单位：个。  **取值范围**：不涉及
     * @return httpsCps
     */
    public Integer getHttpsCps() {
        return httpsCps;
    }

    public void setHttpsCps(Integer httpsCps) {
        this.httpsCps = httpsCps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorInfo that = (FlavorInfo) obj;
        return Objects.equals(this.connection, that.connection) && Objects.equals(this.cps, that.cps)
            && Objects.equals(this.tlsConnection, that.tlsConnection) && Objects.equals(this.tlsCps, that.tlsCps)
            && Objects.equals(this.qps, that.qps) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.lcu, that.lcu) && Objects.equals(this.httpsCps, that.httpsCps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, cps, tlsConnection, tlsCps, qps, bandwidth, lcu, httpsCps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfo {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    cps: ").append(toIndentedString(cps)).append("\n");
        sb.append("    tlsConnection: ").append(toIndentedString(tlsConnection)).append("\n");
        sb.append("    tlsCps: ").append(toIndentedString(tlsCps)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    lcu: ").append(toIndentedString(lcu)).append("\n");
        sb.append("    httpsCps: ").append(toIndentedString(httpsCps)).append("\n");
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
