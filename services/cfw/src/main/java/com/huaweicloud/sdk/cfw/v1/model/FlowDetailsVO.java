package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlowDetailsVO
 */
public class FlowDetailsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<ItemVO> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private String associateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_time")

    private Long lastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<ItemVO> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_byte")

    private Double requestByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_byte")

    private Double responseByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private Long sessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<ItemVO> srcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<ItemVO> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public FlowDetailsVO withApps(List<ItemVO> apps) {
        this.apps = apps;
        return this;
    }

    public FlowDetailsVO addAppsItem(ItemVO appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public FlowDetailsVO withApps(Consumer<List<ItemVO>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * **参数解释**： 应用统计 **取值范围**： 不涉及
     * @return apps
     */
    public List<ItemVO> getApps() {
        return apps;
    }

    public void setApps(List<ItemVO> apps) {
        this.apps = apps;
    }

    public FlowDetailsVO withAssociateInstanceType(String associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    /**
     * **参数解释**： 关联资产类型 **取值范围**： 不涉及
     * @return associateInstanceType
     */
    public String getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(String associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public FlowDetailsVO withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * **参数解释**： 关联资产名称 **取值范围**： 不涉及
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public FlowDetailsVO withItem(String item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**： 聚合项 **取值范围**： 不涉及
     * @return item
     */
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public FlowDetailsVO withLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    /**
     * **参数解释**： 最近访问时间 **取值范围**： 不涉及
     * @return lastTime
     */
    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public FlowDetailsVO withPorts(List<ItemVO> ports) {
        this.ports = ports;
        return this;
    }

    public FlowDetailsVO addPortsItem(ItemVO portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public FlowDetailsVO withPorts(Consumer<List<ItemVO>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * **参数解释**： 端口统计 **取值范围**： 不涉及
     * @return ports
     */
    public List<ItemVO> getPorts() {
        return ports;
    }

    public void setPorts(List<ItemVO> ports) {
        this.ports = ports;
    }

    public FlowDetailsVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 地区 **取值范围**： 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public FlowDetailsVO withRequestByte(Double requestByte) {
        this.requestByte = requestByte;
        return this;
    }

    /**
     * **参数解释**： 请求字节数 **取值范围**： 不涉及
     * @return requestByte
     */
    public Double getRequestByte() {
        return requestByte;
    }

    public void setRequestByte(Double requestByte) {
        this.requestByte = requestByte;
    }

    public FlowDetailsVO withResponseByte(Double responseByte) {
        this.responseByte = responseByte;
        return this;
    }

    /**
     * **参数解释**： 响应字节数 **取值范围**： 不涉及
     * @return responseByte
     */
    public Double getResponseByte() {
        return responseByte;
    }

    public void setResponseByte(Double responseByte) {
        this.responseByte = responseByte;
    }

    public FlowDetailsVO withSessions(Long sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * **参数解释**： 会话数量 **取值范围**： 不涉及
     * @return sessions
     */
    public Long getSessions() {
        return sessions;
    }

    public void setSessions(Long sessions) {
        this.sessions = sessions;
    }

    public FlowDetailsVO withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * **参数解释**： 标签 **取值范围**： 不涉及
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public FlowDetailsVO withSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public FlowDetailsVO addSrcIpItem(ItemVO srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public FlowDetailsVO withSrcIp(Consumer<List<ItemVO>> srcIpSetter) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        srcIpSetter.accept(this.srcIp);
        return this;
    }

    /**
     * **参数解释**： 源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public List<ItemVO> getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
    }

    public FlowDetailsVO withDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public FlowDetailsVO addDstIpItem(ItemVO dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public FlowDetailsVO withDstIp(Consumer<List<ItemVO>> dstIpSetter) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        dstIpSetter.accept(this.dstIp);
        return this;
    }

    /**
     * **参数解释**： 目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public List<ItemVO> getDstIp() {
        return dstIp;
    }

    public void setDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
    }

    public FlowDetailsVO withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议 **取值范围**： 不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowDetailsVO that = (FlowDetailsVO) obj;
        return Objects.equals(this.apps, that.apps)
            && Objects.equals(this.associateInstanceType, that.associateInstanceType)
            && Objects.equals(this.deviceName, that.deviceName) && Objects.equals(this.item, that.item)
            && Objects.equals(this.lastTime, that.lastTime) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.region, that.region) && Objects.equals(this.requestByte, that.requestByte)
            && Objects.equals(this.responseByte, that.responseByte) && Objects.equals(this.sessions, that.sessions)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps,
            associateInstanceType,
            deviceName,
            item,
            lastTime,
            ports,
            region,
            requestByte,
            responseByte,
            sessions,
            tags,
            srcIp,
            dstIp,
            protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowDetailsVO {\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    requestByte: ").append(toIndentedString(requestByte)).append("\n");
        sb.append("    responseByte: ").append(toIndentedString(responseByte)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
