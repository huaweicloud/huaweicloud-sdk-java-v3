package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IP访问限频，通过对单IP每秒访问单个节点的次数限制，实现CC攻击防御及恶意盗刷防护。
 */
public class IpFrequencyLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Integer qps;

    public IpFrequencyLimit withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，on：打开，off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IpFrequencyLimit withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * 访问阈值,单位：次/秒，取值范围：1-100000。   > 当开启ip限频时，访问阈值必填。
     * @return qps
     */
    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpFrequencyLimit that = (IpFrequencyLimit) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.qps, that.qps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, qps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpFrequencyLimit {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
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
