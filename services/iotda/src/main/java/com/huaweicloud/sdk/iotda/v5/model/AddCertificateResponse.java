package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_name")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_code")

    private String verifyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provision_enable")

    private Boolean provisionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private String createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    public AddCertificateResponse withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * CA证书ID，在上传CA证书时由平台分配的唯一标识。
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public AddCertificateResponse withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * CA证书CN名称。
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public AddCertificateResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * CA证书所有者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AddCertificateResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * CA证书验证状态。true代表证书已通过验证，可进行设备证书认证接入。false代表证书未通过验证。
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public AddCertificateResponse withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /**
     * CA证书验证码。
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public AddCertificateResponse withProvisionEnable(Boolean provisionEnable) {
        this.provisionEnable = provisionEnable;
        return this;
    }

    /**
     * 是否开启自注册能力，当为true时该功能必须配合自注册模板使用，true：是，false：否。
     * @return provisionEnable
     */
    public Boolean getProvisionEnable() {
        return provisionEnable;
    }

    public void setProvisionEnable(Boolean provisionEnable) {
        this.provisionEnable = provisionEnable;
    }

    public AddCertificateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 绑定的自注册模板ID。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public AddCertificateResponse withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建证书日期。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public AddCertificateResponse withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * CA证书生效日期。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public AddCertificateResponse withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * CA证书失效日期。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddCertificateResponse that = (AddCertificateResponse) obj;
        return Objects.equals(this.certificateId, that.certificateId) && Objects.equals(this.cnName, that.cnName)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.status, that.status)
            && Objects.equals(this.verifyCode, that.verifyCode)
            && Objects.equals(this.provisionEnable, that.provisionEnable)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.createDate, that.createDate)
            && Objects.equals(this.effectiveDate, that.effectiveDate)
            && Objects.equals(this.expiryDate, that.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId,
            cnName,
            owner,
            status,
            verifyCode,
            provisionEnable,
            templateId,
            createDate,
            effectiveDate,
            expiryDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCertificateResponse {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    provisionEnable: ").append(toIndentedString(provisionEnable)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
