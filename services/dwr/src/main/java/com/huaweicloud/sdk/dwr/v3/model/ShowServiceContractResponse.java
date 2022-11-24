package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowServiceContractResponse extends SdkResponse {

    /**
     * 服务协议类型,默认为use_public_action_privacy_statement。
     */
    public static final class AgreementTypeEnum {

        /**
         * Enum USE_PUBLIC_ACTION_PRIVACY_STATEMENT for value: "use_public_action_privacy_statement"
         */
        public static final AgreementTypeEnum USE_PUBLIC_ACTION_PRIVACY_STATEMENT =
            new AgreementTypeEnum("use_public_action_privacy_statement");

        private static final Map<String, AgreementTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgreementTypeEnum> createStaticFields() {
            Map<String, AgreementTypeEnum> map = new HashMap<>();
            map.put("use_public_action_privacy_statement", USE_PUBLIC_ACTION_PRIVACY_STATEMENT);
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
            AgreementTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AgreementTypeEnum(value);
            }
            return result;
        }

        public static AgreementTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AgreementTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public ShowServiceContractResponse withAgreementType(AgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * 服务协议类型,默认为use_public_action_privacy_statement。
     * @return agreementType
     */
    public AgreementTypeEnum getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementTypeEnum agreementType) {
        this.agreementType = agreementType;
    }

    public ShowServiceContractResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 同意时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowServiceContractResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ShowServiceContractResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ShowServiceContractResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public ShowServiceContractResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServiceContractResponse showServiceContractResponse = (ShowServiceContractResponse) o;
        return Objects.equals(this.agreementType, showServiceContractResponse.agreementType)
            && Objects.equals(this.createTime, showServiceContractResponse.createTime)
            && Objects.equals(this.xRequestId, showServiceContractResponse.xRequestId)
            && Objects.equals(this.connection, showServiceContractResponse.connection)
            && Objects.equals(this.contentLength, showServiceContractResponse.contentLength)
            && Objects.equals(this.date, showServiceContractResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementType, createTime, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServiceContractResponse {\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
