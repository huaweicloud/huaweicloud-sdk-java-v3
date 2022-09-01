package com.huaweicloud.sdk.cdn.v1.model;

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
 * OriginRangeBody
 */
public class OriginRangeBody {

    /**
     * range状态（\"off\"/\"on\"）
     */
    public static final class RangeStatusEnum {

        /**
         * Enum OFF for value: "off"
         */
        public static final RangeStatusEnum OFF = new RangeStatusEnum("off");

        /**
         * Enum ON for value: "on"
         */
        public static final RangeStatusEnum ON = new RangeStatusEnum("on");

        private static final Map<String, RangeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RangeStatusEnum> createStaticFields() {
            Map<String, RangeStatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RangeStatusEnum(String value) {
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
        public static RangeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RangeStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RangeStatusEnum(value);
            }
            return result;
        }

        public static RangeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RangeStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RangeStatusEnum) {
                return this.value.equals(((RangeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_status")

    @JacksonXmlProperty(localName = "range_status")

    private RangeStatusEnum rangeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    public OriginRangeBody withRangeStatus(RangeStatusEnum rangeStatus) {
        this.rangeStatus = rangeStatus;
        return this;
    }

    /**
     * range状态（\"off\"/\"on\"）
     * @return rangeStatus
     */
    public RangeStatusEnum getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(RangeStatusEnum rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    public OriginRangeBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 加速域名id。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginRangeBody originRangeBody = (OriginRangeBody) o;
        return Objects.equals(this.rangeStatus, originRangeBody.rangeStatus)
            && Objects.equals(this.domainId, originRangeBody.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rangeStatus, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginRangeBody {\n");
        sb.append("    rangeStatus: ").append(toIndentedString(rangeStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
