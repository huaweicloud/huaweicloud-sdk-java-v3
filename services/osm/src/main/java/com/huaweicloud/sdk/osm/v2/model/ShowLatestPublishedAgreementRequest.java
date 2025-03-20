package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowLatestPublishedAgreementRequest {

    /**
     * 协议类型，0 新建工单-普通用户，1 新建工单-ISV用户，2 授权
     */
    public static final class AgreementTypeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final AgreementTypeEnum _0 = new AgreementTypeEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final AgreementTypeEnum _1 = new AgreementTypeEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final AgreementTypeEnum _2 = new AgreementTypeEnum("2");

        private static final Map<String, AgreementTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgreementTypeEnum> createStaticFields() {
            Map<String, AgreementTypeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgreementTypeEnum(String value) {
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
        public static AgreementTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgreementTypeEnum(value));
        }

        public static AgreementTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgreementTypeEnum) {
                return this.value.equals(((AgreementTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_type")

    private AgreementTypeEnum agreementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    private String xTimeZone;

    public ShowLatestPublishedAgreementRequest withAgreementType(AgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * 协议类型，0 新建工单-普通用户，1 新建工单-ISV用户，2 授权
     * @return agreementType
     */
    public AgreementTypeEnum getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
    }

    public ShowLatestPublishedAgreementRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ShowLatestPublishedAgreementRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowLatestPublishedAgreementRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestPublishedAgreementRequest that = (ShowLatestPublishedAgreementRequest) obj;
        return Objects.equals(this.agreementType, that.agreementType) && Objects.equals(this.xSite, that.xSite)
            && Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.xTimeZone, that.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementType, xSite, xLanguage, xTimeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestPublishedAgreementRequest {\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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
