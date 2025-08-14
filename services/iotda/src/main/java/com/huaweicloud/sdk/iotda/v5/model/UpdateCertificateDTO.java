package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新CA证书结构体。
 */
public class UpdateCertificateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provision_enable")

    private Boolean provisionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_enable")

    private Boolean ocspEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_ssl_enable")

    private Boolean ocspSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_server_ca_id")

    private String ocspServerCaId;

    public UpdateCertificateDTO withProvisionEnable(Boolean provisionEnable) {
        this.provisionEnable = provisionEnable;
        return this;
    }

    /**
     * 是否开启自注册能力，当为true时该功能必须配合预调配功能使用，true：是，false：否。
     * @return provisionEnable
     */
    public Boolean getProvisionEnable() {
        return provisionEnable;
    }

    public void setProvisionEnable(Boolean provisionEnable) {
        this.provisionEnable = provisionEnable;
    }

    public UpdateCertificateDTO withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 预调配模板ID，该CA证书绑定的预调配模板id，当该字段传null时表示解除绑定关系。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public UpdateCertificateDTO withOcspEnable(Boolean ocspEnable) {
        this.ocspEnable = ocspEnable;
        return this;
    }

    /**
     * 是否开启该CA证书下的设备证书OCSP校验，当为true且设备证书信息中包含OCSP url时则平台会校验证书的状态，当证书状态为revoked时平台会拒绝设备连接，true：开启，false：关闭。
     * @return ocspEnable
     */
    public Boolean getOcspEnable() {
        return ocspEnable;
    }

    public void setOcspEnable(Boolean ocspEnable) {
        this.ocspEnable = ocspEnable;
    }

    public UpdateCertificateDTO withOcspSslEnable(Boolean ocspSslEnable) {
        this.ocspSslEnable = ocspSslEnable;
        return this;
    }

    /**
     * 访问ocsp服务器是否开启SSL，开启后必须配置服务器CA证书校验。
     * @return ocspSslEnable
     */
    public Boolean getOcspSslEnable() {
        return ocspSslEnable;
    }

    public void setOcspSslEnable(Boolean ocspSslEnable) {
        this.ocspSslEnable = ocspSslEnable;
    }

    public UpdateCertificateDTO withOcspServerCaId(String ocspServerCaId) {
        this.ocspServerCaId = ocspServerCaId;
        return this;
    }

    /**
     * ocsp服务器端CA证书id，当ocsp服务器为https协议时需要配置，否则认证失败。
     * @return ocspServerCaId
     */
    public String getOcspServerCaId() {
        return ocspServerCaId;
    }

    public void setOcspServerCaId(String ocspServerCaId) {
        this.ocspServerCaId = ocspServerCaId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCertificateDTO that = (UpdateCertificateDTO) obj;
        return Objects.equals(this.provisionEnable, that.provisionEnable)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.ocspEnable, that.ocspEnable)
            && Objects.equals(this.ocspSslEnable, that.ocspSslEnable)
            && Objects.equals(this.ocspServerCaId, that.ocspServerCaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provisionEnable, templateId, ocspEnable, ocspSslEnable, ocspServerCaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateDTO {\n");
        sb.append("    provisionEnable: ").append(toIndentedString(provisionEnable)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    ocspEnable: ").append(toIndentedString(ocspEnable)).append("\n");
        sb.append("    ocspSslEnable: ").append(toIndentedString(ocspSslEnable)).append("\n");
        sb.append("    ocspServerCaId: ").append(toIndentedString(ocspServerCaId)).append("\n");
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
