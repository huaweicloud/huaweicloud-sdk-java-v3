package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Proxy绑定解绑弹性公网IP请求体。
 */
public class SwitchGaussMySqlProxyEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind")

    private String bind;

    public SwitchGaussMySqlProxyEipRequestBody withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 待绑定的弹性公网IP地址。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public SwitchGaussMySqlProxyEipRequestBody withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 弹性公网IP地址对应的ID。请求为绑定弹性公网IP时需传入该参数，请求为解绑弹性公网IP时无需传入。
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public SwitchGaussMySqlProxyEipRequestBody withBind(String bind) {
        this.bind = bind;
        return this;
    }

    /**
     * 请求是否为绑定弹性公网IP。  取值范围： - true：表示请求为绑定弹性公网IP。 - false：表示请求为解绑弹性公网IP。
     * @return bind
     */
    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchGaussMySqlProxyEipRequestBody that = (SwitchGaussMySqlProxyEipRequestBody) obj;
        return Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.publicIpId, that.publicIpId)
            && Objects.equals(this.bind, that.bind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIp, publicIpId, bind);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlProxyEipRequestBody {\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    bind: ").append(toIndentedString(bind)).append("\n");
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
