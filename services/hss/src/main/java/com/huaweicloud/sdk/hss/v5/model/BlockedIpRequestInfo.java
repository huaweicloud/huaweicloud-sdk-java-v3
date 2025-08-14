package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解除拦截的IP详情
 */
public class BlockedIpRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_type")

    private String loginType;

    public BlockedIpRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public BlockedIpRequestInfo withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 攻击源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public BlockedIpRequestInfo withLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }

    /**
     * 登录类型，包含如下: - \"mysql\" # mysql服务 - \"rdp\" # rdp服务 - \"ssh\" # ssh服务 - \"vsftp\" # vsftp服务
     * @return loginType
     */
    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlockedIpRequestInfo that = (BlockedIpRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.loginType, that.loginType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, srcIp, loginType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockedIpRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    loginType: ").append(toIndentedString(loginType)).append("\n");
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
