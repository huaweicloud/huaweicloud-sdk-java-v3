package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SourceIp
 */
public class SourceIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private List<String> ip = null;

    public SourceIp withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 数据中心
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public SourceIp withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public SourceIp withIp(List<String> ip) {
        this.ip = ip;
        return this;
    }

    public SourceIp addIpItem(String ipItem) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ipItem);
        return this;
    }

    public SourceIp withIp(Consumer<List<String>> ipSetter) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        ipSetter.accept(this.ip);
        return this;
    }

    /**
     * 实例ip
     * @return ip
     */
    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceIp that = (SourceIp) obj;
        return Objects.equals(this.dataCenter, that.dataCenter) && Objects.equals(this.isp, that.isp)
            && Objects.equals(this.ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataCenter, isp, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceIp {\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
