package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务的动态属性
 */
public class SvcSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ip")

    private String clusterIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_ips")

    private List<String> externalIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_name")

    private String externalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<SvcPort> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private Map<String, String> selector = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public SvcSpec withClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
        return this;
    }

    /**
     * 虚拟服务IP地址
     * @return clusterIp
     */
    public String getClusterIp() {
        return clusterIp;
    }

    public void setClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
    }

    public SvcSpec withExternalIps(List<String> externalIps) {
        this.externalIps = externalIps;
        return this;
    }

    public SvcSpec addExternalIpsItem(String externalIpsItem) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<>();
        }
        this.externalIps.add(externalIpsItem);
        return this;
    }

    public SvcSpec withExternalIps(Consumer<List<String>> externalIpsSetter) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<>();
        }
        externalIpsSetter.accept(this.externalIps);
        return this;
    }

    /**
     * 外部IP列表 --- 暂不支持
     * @return externalIps
     */
    public List<String> getExternalIps() {
        return externalIps;
    }

    public void setExternalIps(List<String> externalIps) {
        this.externalIps = externalIps;
    }

    public SvcSpec withExternalName(String externalName) {
        this.externalName = externalName;
        return this;
    }

    /**
     * 外部域名 --- 暂不支持
     * @return externalName
     */
    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public SvcSpec withPorts(List<SvcPort> ports) {
        this.ports = ports;
        return this;
    }

    public SvcSpec addPortsItem(SvcPort portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public SvcSpec withPorts(Consumer<List<SvcPort>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 服务需要暴露的端口列表
     * @return ports
     */
    public List<SvcPort> getPorts() {
        return ports;
    }

    public void setPorts(List<SvcPort> ports) {
        this.ports = ports;
    }

    public SvcSpec withSelector(Map<String, String> selector) {
        this.selector = selector;
        return this;
    }

    public SvcSpec putSelectorItem(String key, String selectorItem) {
        if (this.selector == null) {
            this.selector = new HashMap<>();
        }
        this.selector.put(key, selectorItem);
        return this;
    }

    public SvcSpec withSelector(Consumer<Map<String, String>> selectorSetter) {
        if (this.selector == null) {
            this.selector = new HashMap<>();
        }
        selectorSetter.accept(this.selector);
        return this;
    }

    /**
     * 标签选择器，将选择具有指定Label标签的Pod作为管理范围
     * @return selector
     */
    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(Map<String, String> selector) {
        this.selector = selector;
    }

    public SvcSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 服务的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SvcSpec svcSpec = (SvcSpec) o;
        return Objects.equals(this.clusterIp, svcSpec.clusterIp)
            && Objects.equals(this.externalIps, svcSpec.externalIps)
            && Objects.equals(this.externalName, svcSpec.externalName) && Objects.equals(this.ports, svcSpec.ports)
            && Objects.equals(this.selector, svcSpec.selector) && Objects.equals(this.type, svcSpec.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterIp, externalIps, externalName, ports, selector, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SvcSpec {\n");
        sb.append("    clusterIp: ").append(toIndentedString(clusterIp)).append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
