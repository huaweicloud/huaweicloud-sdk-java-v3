package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LiveDomainModifyReq
 */
public class LiveDomainModifyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private String domain;

    /**
     * 直播域名状态，通过修改此字段，实现域名的启用和停用。注意：域名处于“配置中”状态时，不允对该域名执行启停操作。
     */
    public static final class StatusEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final StatusEnum ON = new StatusEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final StatusEnum OFF = new StatusEnum("off");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    public LiveDomainModifyReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播域名，不允许修改
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LiveDomainModifyReq withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 直播域名状态，通过修改此字段，实现域名的启用和停用。注意：域名处于“配置中”状态时，不允对该域名执行启停操作。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDomainModifyReq liveDomainModifyReq = (LiveDomainModifyReq) o;
        return Objects.equals(this.domain, liveDomainModifyReq.domain)
            && Objects.equals(this.status, liveDomainModifyReq.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDomainModifyReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
