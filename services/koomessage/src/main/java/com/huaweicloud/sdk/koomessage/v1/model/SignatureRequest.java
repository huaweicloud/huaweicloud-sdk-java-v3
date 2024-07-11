package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 短信签名请求体。
 */
public class SignatureRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    private String signatureName;

    /**
     * 签名类型。PROMOTION_TYPE：营销类，NOTIFY_TYPE：通知类。
     */
    public static final class SignatureTypeEnum {

        /**
         * Enum PROMOTION_TYPE for value: "PROMOTION_TYPE"
         */
        public static final SignatureTypeEnum PROMOTION_TYPE = new SignatureTypeEnum("PROMOTION_TYPE");

        /**
         * Enum NOTIFY_TYPE for value: "NOTIFY_TYPE"
         */
        public static final SignatureTypeEnum NOTIFY_TYPE = new SignatureTypeEnum("NOTIFY_TYPE");

        private static final Map<String, SignatureTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignatureTypeEnum> createStaticFields() {
            Map<String, SignatureTypeEnum> map = new HashMap<>();
            map.put("PROMOTION_TYPE", PROMOTION_TYPE);
            map.put("NOTIFY_TYPE", NOTIFY_TYPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignatureTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SignatureTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SignatureTypeEnum(value));
        }

        public static SignatureTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignatureTypeEnum) {
                return this.value.equals(((SignatureTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private SignatureTypeEnum signatureType;

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
    @JsonProperty(value = "signature_source")

    private Integer signatureSource;

    /**
     * 是否涉及第三方权益。若为yes，则还需要传入授权委托书。yes：涉及，no：不涉及。
     */
    public static final class IsInvolvedThirdEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final IsInvolvedThirdEnum YES = new IsInvolvedThirdEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final IsInvolvedThirdEnum NO = new IsInvolvedThirdEnum("no");

        private static final Map<String, IsInvolvedThirdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsInvolvedThirdEnum> createStaticFields() {
            Map<String, IsInvolvedThirdEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsInvolvedThirdEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsInvolvedThirdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsInvolvedThirdEnum(value));
        }

        public static IsInvolvedThirdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsInvolvedThirdEnum) {
                return this.value.equals(((IsInvolvedThirdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_involved_third")

    private IsInvolvedThirdEnum isInvolvedThird;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_attorney_file_id")

    private String powerAttorneyFileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_title_content")

    private String sourceTitleContent;

    public SignatureRequest withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称。
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public SignatureRequest withSignatureType(SignatureTypeEnum signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名类型。PROMOTION_TYPE：营销类，NOTIFY_TYPE：通知类。
     * @return signatureType
     */
    public SignatureTypeEnum getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(SignatureTypeEnum signatureType) {
        this.signatureType = signatureType;
    }

    public SignatureRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 短信应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SignatureRequest withApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
        return this;
    }

    /**
     * 申请说明。
     * @return applyDesc
     */
    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public SignatureRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 营业执照文件ID。调用上传申请文件接口获取。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public SignatureRequest withSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
        return this;
    }

    /**
     * 签名来源。0：企事业单位的全称或简称，1：工信部备案网站的全称或简称，2：APP应用的全称或简称，3：公众号或小程序的全称或简称，4：电商平台店铺名的全称或简称，5：商标名的全称或简称。
     * @return signatureSource
     */
    public Integer getSignatureSource() {
        return signatureSource;
    }

    public void setSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
    }

    public SignatureRequest withIsInvolvedThird(IsInvolvedThirdEnum isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
        return this;
    }

    /**
     * 是否涉及第三方权益。若为yes，则还需要传入授权委托书。yes：涉及，no：不涉及。
     * @return isInvolvedThird
     */
    public IsInvolvedThirdEnum getIsInvolvedThird() {
        return isInvolvedThird;
    }

    public void setIsInvolvedThird(IsInvolvedThirdEnum isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
    }

    public SignatureRequest withPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
        return this;
    }

    /**
     * 授权委托书文件ID。调用上传申请文件接口获取。
     * @return powerAttorneyFileId
     */
    public String getPowerAttorneyFileId() {
        return powerAttorneyFileId;
    }

    public void setPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
    }

    public SignatureRequest withSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
        return this;
    }

    /**
     * 签名来源标题内容，填写内容需和签名来源对应，具体如下。 - 网站域名：仅当“签名来源”为“工信部备案网站的全称或简称”时，需要输入工信部备案网站域名，如huawei.com。 - APP应用下载地址：仅当“签名来源”为“APP应用的全称或简称”时，需要填写。 - 公众号或者小程序的全称：仅当“签名来源”为“公众号或小程序的全称或简称”时，需要填写。 - 电商平台店铺地址：仅当“签名来源”为“电商平台店铺名的全称或简称”时，需要填写。
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
        SignatureRequest that = (SignatureRequest) obj;
        return Objects.equals(this.signatureName, that.signatureName)
            && Objects.equals(this.signatureType, that.signatureType) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.applyDesc, that.applyDesc) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.signatureSource, that.signatureSource)
            && Objects.equals(this.isInvolvedThird, that.isInvolvedThird)
            && Objects.equals(this.powerAttorneyFileId, that.powerAttorneyFileId)
            && Objects.equals(this.sourceTitleContent, that.sourceTitleContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureName,
            signatureType,
            appId,
            applyDesc,
            fileId,
            signatureSource,
            isInvolvedThird,
            powerAttorneyFileId,
            sourceTitleContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignatureRequest {\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    applyDesc: ").append(toIndentedString(applyDesc)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    signatureSource: ").append(toIndentedString(signatureSource)).append("\n");
        sb.append("    isInvolvedThird: ").append(toIndentedString(isInvolvedThird)).append("\n");
        sb.append("    powerAttorneyFileId: ").append(toIndentedString(powerAttorneyFileId)).append("\n");
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
