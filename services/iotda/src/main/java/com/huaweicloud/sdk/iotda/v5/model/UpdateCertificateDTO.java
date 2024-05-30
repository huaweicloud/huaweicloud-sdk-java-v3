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
            && Objects.equals(this.templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provisionEnable, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateDTO {\n");
        sb.append("    provisionEnable: ").append(toIndentedString(provisionEnable)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
