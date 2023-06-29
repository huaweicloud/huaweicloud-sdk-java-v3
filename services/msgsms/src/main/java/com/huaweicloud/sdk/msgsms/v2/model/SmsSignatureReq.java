package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsSignatureReq
 */
public class SmsSignatureReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_desc")

    private String applyDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_involved_third")

    private String isInvolvedThird;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_attorney_fileid")

    private String powerAttorneyFileid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    private String signatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_source")

    private Integer signatureSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private String signatureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_title_content")

    private String sourceTitleContent;

    public SmsSignatureReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用主键ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SmsSignatureReq withApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
        return this;
    }

    /**
     * 申请说明
     * @return applyDesc
     */
    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public SmsSignatureReq withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 营业执照文件ID
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public SmsSignatureReq withIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
        return this;
    }

    /**
     * 是否涉及第三方权益 1. Yes: 是 2. No:
     * @return isInvolvedThird
     */
    public String getIsInvolvedThird() {
        return isInvolvedThird;
    }

    public void setIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
    }

    public SmsSignatureReq withPowerAttorneyFileid(String powerAttorneyFileid) {
        this.powerAttorneyFileid = powerAttorneyFileid;
        return this;
    }

    /**
     * 授权委托书文件ID
     * @return powerAttorneyFileid
     */
    public String getPowerAttorneyFileid() {
        return powerAttorneyFileid;
    }

    public void setPowerAttorneyFileid(String powerAttorneyFileid) {
        this.powerAttorneyFileid = powerAttorneyFileid;
    }

    public SmsSignatureReq withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public SmsSignatureReq withSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
        return this;
    }

    /**
     * 签名来源。支持枚举值： 1. 0：企事业单位的全称或简称 2. 1：工信部备案网站的全称或简称 3. 2： APP应用的全称或简称 4. 3：公众号或小程序的全称或简称 5. 4：电商平台店铺名的全称或简称 6. 5：商标名的全称或简称
     * minimum: 0
     * maximum: 2147483647
     * @return signatureSource
     */
    public Integer getSignatureSource() {
        return signatureSource;
    }

    public void setSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
    }

    public SmsSignatureReq withSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名类型。支持枚举值： 1. VERIFY_CODE_TYPE: 验证码类 2. PROMOTION_TYPE: 推广类 3. NOTIFY_TYPE: 通知类
     * @return signatureType
     */
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public SmsSignatureReq withSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
        return this;
    }

    /**
     * 签名来源标题内容
     * @return sourceTitleContent
     */
    public String getSourceTitleContent() {
        return sourceTitleContent;
    }

    public void setSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsSignatureReq that = (SmsSignatureReq) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.applyDesc, that.applyDesc)
            && Objects.equals(this.fileId, that.fileId) && Objects.equals(this.isInvolvedThird, that.isInvolvedThird)
            && Objects.equals(this.powerAttorneyFileid, that.powerAttorneyFileid)
            && Objects.equals(this.signatureName, that.signatureName)
            && Objects.equals(this.signatureSource, that.signatureSource)
            && Objects.equals(this.signatureType, that.signatureType)
            && Objects.equals(this.sourceTitleContent, that.sourceTitleContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            applyDesc,
            fileId,
            isInvolvedThird,
            powerAttorneyFileid,
            signatureName,
            signatureSource,
            signatureType,
            sourceTitleContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsSignatureReq {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    applyDesc: ").append(toIndentedString(applyDesc)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    isInvolvedThird: ").append(toIndentedString(isInvolvedThird)).append("\n");
        sb.append("    powerAttorneyFileid: ").append(toIndentedString(powerAttorneyFileid)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureSource: ").append(toIndentedString(signatureSource)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    sourceTitleContent: ").append(toIndentedString(sourceTitleContent)).append("\n");
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
