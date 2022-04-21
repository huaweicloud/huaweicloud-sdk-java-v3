package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格内容信息。
 */
public class FlavorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Integer connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cps")

    private Integer cps;

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
     * 并发数。
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
     * 新建数。
     * @return cps
     */
    public Integer getCps() {
        return cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    public FlavorInfo withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * 7层每秒查询数。
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
     * 带宽。
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
     * 当前flavor对应的lcu数量。LCU是用来衡量独享型ELB处理性能综合指标，LCU值越大，性能越好。
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
     * https新建连接数。
     * @return httpsCps
     */
    public Integer getHttpsCps() {
        return httpsCps;
    }

    public void setHttpsCps(Integer httpsCps) {
        this.httpsCps = httpsCps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorInfo flavorInfo = (FlavorInfo) o;
        return Objects.equals(this.connection, flavorInfo.connection) && Objects.equals(this.cps, flavorInfo.cps)
            && Objects.equals(this.qps, flavorInfo.qps) && Objects.equals(this.bandwidth, flavorInfo.bandwidth)
            && Objects.equals(this.lcu, flavorInfo.lcu) && Objects.equals(this.httpsCps, flavorInfo.httpsCps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, cps, qps, bandwidth, lcu, httpsCps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfo {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    cps: ").append(toIndentedString(cps)).append("\n");
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
