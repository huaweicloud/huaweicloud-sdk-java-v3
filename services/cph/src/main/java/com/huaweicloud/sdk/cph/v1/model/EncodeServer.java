package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 编码容器信息。
 */
public class EncodeServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_name")

    private String encodeServerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_id")

    private String encodeServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_ip")

    private String encodeServerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_infos")

    private List<EncodeServerAccessInfo> accessInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_server_ipv6")

    private String encodeServerIpv6;

    public EncodeServer withEncodeServerName(String encodeServerName) {
        this.encodeServerName = encodeServerName;
        return this;
    }

    /**
     * 编码服务的名称，不大于64个字节。
     * @return encodeServerName
     */
    public String getEncodeServerName() {
        return encodeServerName;
    }

    public void setEncodeServerName(String encodeServerName) {
        this.encodeServerName = encodeServerName;
    }

    public EncodeServer withEncodeServerId(String encodeServerId) {
        this.encodeServerId = encodeServerId;
        return this;
    }

    /**
     * 编码服务的唯一标识ID，不大于32个字节。
     * @return encodeServerId
     */
    public String getEncodeServerId() {
        return encodeServerId;
    }

    public void setEncodeServerId(String encodeServerId) {
        this.encodeServerId = encodeServerId;
    }

    public EncodeServer withEncodeServerIp(String encodeServerIp) {
        this.encodeServerIp = encodeServerIp;
        return this;
    }

    /**
     * 编码服务IP地址。
     * @return encodeServerIp
     */
    public String getEncodeServerIp() {
        return encodeServerIp;
    }

    public void setEncodeServerIp(String encodeServerIp) {
        this.encodeServerIp = encodeServerIp;
    }

    public EncodeServer withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器ID，不大于32个字节。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public EncodeServer withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 编码服务登录密钥名称。
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public EncodeServer withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 编码服务类型。 - 0：服务器 - 1：容器
     * minimum: -128
     * maximum: 128
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public EncodeServer withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 编码服务状态。 - 1：运行中 - 2：异常 - 3：重启中 - 0、4、5：创建中
     * minimum: -128
     * maximum: 128
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public EncodeServer withAccessInfos(List<EncodeServerAccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
        return this;
    }

    public EncodeServer addAccessInfosItem(EncodeServerAccessInfo accessInfosItem) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        this.accessInfos.add(accessInfosItem);
        return this;
    }

    public EncodeServer withAccessInfos(Consumer<List<EncodeServerAccessInfo>> accessInfosSetter) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        accessInfosSetter.accept(this.accessInfos);
        return this;
    }

    /**
     * 编码服务的访问信息。
     * @return accessInfos
     */
    public List<EncodeServerAccessInfo> getAccessInfos() {
        return accessInfos;
    }

    public void setAccessInfos(List<EncodeServerAccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
    }

    public EncodeServer withEncodeServerIpv6(String encodeServerIpv6) {
        this.encodeServerIpv6 = encodeServerIpv6;
        return this;
    }

    /**
     * 编码服务IPv6地址。
     * @return encodeServerIpv6
     */
    public String getEncodeServerIpv6() {
        return encodeServerIpv6;
    }

    public void setEncodeServerIpv6(String encodeServerIpv6) {
        this.encodeServerIpv6 = encodeServerIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncodeServer that = (EncodeServer) obj;
        return Objects.equals(this.encodeServerName, that.encodeServerName)
            && Objects.equals(this.encodeServerId, that.encodeServerId)
            && Objects.equals(this.encodeServerIp, that.encodeServerIp) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.keypairName, that.keypairName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.accessInfos, that.accessInfos)
            && Objects.equals(this.encodeServerIpv6, that.encodeServerIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeServerName,
            encodeServerId,
            encodeServerIp,
            serverId,
            keypairName,
            type,
            status,
            accessInfos,
            encodeServerIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncodeServer {\n");
        sb.append("    encodeServerName: ").append(toIndentedString(encodeServerName)).append("\n");
        sb.append("    encodeServerId: ").append(toIndentedString(encodeServerId)).append("\n");
        sb.append("    encodeServerIp: ").append(toIndentedString(encodeServerIp)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessInfos: ").append(toIndentedString(accessInfos)).append("\n");
        sb.append("    encodeServerIpv6: ").append(toIndentedString(encodeServerIpv6)).append("\n");
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
