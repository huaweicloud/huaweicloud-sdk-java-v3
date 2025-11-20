package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务端证书配置结构体
 */
public class ServerCertificateConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_stapling_enable")

    private Boolean ocspStaplingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_server_ca_id")

    private String ocspServerCaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_ssl_enable")

    private Boolean ocspSslEnable;

    public ServerCertificateConfig withOcspStaplingEnable(Boolean ocspStaplingEnable) {
        this.ocspStaplingEnable = ocspStaplingEnable;
        return this;
    }

    /**
     * 是否开启服务端OCSP装订
     * @return ocspStaplingEnable
     */
    public Boolean getOcspStaplingEnable() {
        return ocspStaplingEnable;
    }

    public void setOcspStaplingEnable(Boolean ocspStaplingEnable) {
        this.ocspStaplingEnable = ocspStaplingEnable;
    }

    public ServerCertificateConfig withOcspServerCaId(String ocspServerCaId) {
        this.ocspServerCaId = ocspServerCaId;
        return this;
    }

    /**
     * ocsp服务器端CA证书id，仅当ocsp服务器为https协议时支持配置。
     * @return ocspServerCaId
     */
    public String getOcspServerCaId() {
        return ocspServerCaId;
    }

    public void setOcspServerCaId(String ocspServerCaId) {
        this.ocspServerCaId = ocspServerCaId;
    }

    public ServerCertificateConfig withOcspSslEnable(Boolean ocspSslEnable) {
        this.ocspSslEnable = ocspSslEnable;
        return this;
    }

    /**
     * 访问ocsp服务器是否开启SSL
     * @return ocspSslEnable
     */
    public Boolean getOcspSslEnable() {
        return ocspSslEnable;
    }

    public void setOcspSslEnable(Boolean ocspSslEnable) {
        this.ocspSslEnable = ocspSslEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerCertificateConfig that = (ServerCertificateConfig) obj;
        return Objects.equals(this.ocspStaplingEnable, that.ocspStaplingEnable)
            && Objects.equals(this.ocspServerCaId, that.ocspServerCaId)
            && Objects.equals(this.ocspSslEnable, that.ocspSslEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ocspStaplingEnable, ocspServerCaId, ocspSslEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerCertificateConfig {\n");
        sb.append("    ocspStaplingEnable: ").append(toIndentedString(ocspStaplingEnable)).append("\n");
        sb.append("    ocspServerCaId: ").append(toIndentedString(ocspServerCaId)).append("\n");
        sb.append("    ocspSslEnable: ").append(toIndentedString(ocspSslEnable)).append("\n");
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
