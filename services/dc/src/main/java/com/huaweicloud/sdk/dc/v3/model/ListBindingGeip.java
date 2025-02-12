package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GEIP列表的响应体
 */
public class ListBindingGeip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segment_id")

    private String globalEipSegmentId;

    /**
     * geip的绑定状态
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("ERROR", ERROR);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private StatusEnum status;

    /**
     * geip类型：IP_ADDRESS/IP_SEGMENT
     */
    public static final class TypeEnum {

        /**
         * Enum IP_ADDRESS for value: "IP_ADDRESS"
         */
        public static final TypeEnum IP_ADDRESS = new TypeEnum("IP_ADDRESS");

        /**
         * Enum IP_SEGMENT for value: "IP_SEGMENT"
         */
        public static final TypeEnum IP_SEGMENT = new TypeEnum("IP_SEGMENT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("IP_ADDRESS", IP_ADDRESS);
            map.put("IP_SEGMENT", IP_SEGMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private String addressFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ie_vtep_ip")

    private String ieVtepIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    public ListBindingGeip withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * geip的id
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public ListBindingGeip withGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
        return this;
    }

    /**
     * 网段geip的id
     * @return globalEipSegmentId
     */
    public String getGlobalEipSegmentId() {
        return globalEipSegmentId;
    }

    public void setGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
    }

    public ListBindingGeip withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * geip的绑定状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListBindingGeip withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * geip类型：IP_ADDRESS/IP_SEGMENT
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListBindingGeip withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * geip绑定失败的原因
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ListBindingGeip withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * geip的地址ip/mask
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ListBindingGeip withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * geip的地址簇
     * @return addressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    public ListBindingGeip withIeVtepIp(String ieVtepIp) {
        this.ieVtepIp = ieVtepIp;
        return this;
    }

    /**
     * CloudPond的集群vtepIp
     * @return ieVtepIp
     */
    public String getIeVtepIp() {
        return ieVtepIp;
    }

    public void setIeVtepIp(String ieVtepIp) {
        this.ieVtepIp = ieVtepIp;
    }

    public ListBindingGeip withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * geip绑定时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ListBindingGeip withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 带宽包的id
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBindingGeip that = (ListBindingGeip) obj;
        return Objects.equals(this.globalEipId, that.globalEipId)
            && Objects.equals(this.globalEipSegmentId, that.globalEipSegmentId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.addressFamily, that.addressFamily) && Objects.equals(this.ieVtepIp, that.ieVtepIp)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.gcbId, that.gcbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId,
            globalEipSegmentId,
            status,
            type,
            errorMessage,
            cidr,
            addressFamily,
            ieVtepIp,
            createdTime,
            gcbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBindingGeip {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
        sb.append("    globalEipSegmentId: ").append(toIndentedString(globalEipSegmentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    ieVtepIp: ").append(toIndentedString(ieVtepIp)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
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
