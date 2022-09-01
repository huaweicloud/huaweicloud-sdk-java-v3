package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性公网IP字典对象
 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    @JacksonXmlProperty(localName = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    @JacksonXmlProperty(localName = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    @JacksonXmlProperty(localName = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    @JacksonXmlProperty(localName = "bandwidth_id")

    private String bandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_name")

    @JacksonXmlProperty(localName = "bandwidth_name")

    private String bandwidthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_share_type")

    @JacksonXmlProperty(localName = "bandwidth_share_type")

    private String bandwidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    @JacksonXmlProperty(localName = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    @JacksonXmlProperty(localName = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    @JacksonXmlProperty(localName = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_info")

    @JacksonXmlProperty(localName = "site_info")

    private String siteInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    @JacksonXmlProperty(localName = "operator")

    private Operator operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    public PublicIp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网IP唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicIp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性公网IP的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PublicIp withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 端口的ID。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public PublicIp withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 弹性公网IP的地址。
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public PublicIp withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 绑定弹性公网IP的私有IP地址。
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public PublicIp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PublicIp withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * 带宽的ID。
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public PublicIp withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /**
     * 带宽的名称。
     * @return bandwidthName
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public PublicIp withBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
        return this;
    }

    /**
     * 带宽的类型。
     * @return bandwidthShareType
     */
    public String getBandwidthShareType() {
        return bandwidthShareType;
    }

    public void setBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
    }

    public PublicIp withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽的大小。
     * minimum: 300
     * maximum: 2000
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public PublicIp withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * IP版本的信息。
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public PublicIp withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 子网所属的站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public PublicIp withSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
        return this;
    }

    /**
     * 子网所属的站点信息。
     * @return siteInfo
     */
    public String getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
    }

    public PublicIp withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public PublicIp withOperator(Consumer<Operator> operatorSetter) {
        if (this.operator == null) {
            this.operator = new Operator();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public PublicIp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP的类型。
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
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.id, publicIp.id) && Objects.equals(this.status, publicIp.status)
            && Objects.equals(this.portId, publicIp.portId)
            && Objects.equals(this.publicIpAddress, publicIp.publicIpAddress)
            && Objects.equals(this.privateIpAddress, publicIp.privateIpAddress)
            && Objects.equals(this.createTime, publicIp.createTime)
            && Objects.equals(this.bandwidthId, publicIp.bandwidthId)
            && Objects.equals(this.bandwidthName, publicIp.bandwidthName)
            && Objects.equals(this.bandwidthShareType, publicIp.bandwidthShareType)
            && Objects.equals(this.bandwidthSize, publicIp.bandwidthSize)
            && Objects.equals(this.ipVersion, publicIp.ipVersion) && Objects.equals(this.siteId, publicIp.siteId)
            && Objects.equals(this.siteInfo, publicIp.siteInfo) && Objects.equals(this.operator, publicIp.operator)
            && Objects.equals(this.type, publicIp.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            portId,
            publicIpAddress,
            privateIpAddress,
            createTime,
            bandwidthId,
            bandwidthName,
            bandwidthShareType,
            bandwidthSize,
            ipVersion,
            siteId,
            siteInfo,
            operator,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthShareType: ").append(toIndentedString(bandwidthShareType)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
