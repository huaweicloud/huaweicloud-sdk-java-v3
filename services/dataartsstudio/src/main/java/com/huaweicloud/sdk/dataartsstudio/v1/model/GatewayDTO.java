package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GatewayDTO
 */
public class GatewayDTO {

    /**
     * 网关类型
     */
    public static final class ApigTypeEnum {

        /**
         * Enum APIG for value: "APIG"
         */
        public static final ApigTypeEnum APIG = new ApigTypeEnum("APIG");

        /**
         * Enum APIGW for value: "APIGW"
         */
        public static final ApigTypeEnum APIGW = new ApigTypeEnum("APIGW");

        /**
         * Enum ROMA_APIC for value: "ROMA_APIC"
         */
        public static final ApigTypeEnum ROMA_APIC = new ApigTypeEnum("ROMA_APIC");

        private static final Map<String, ApigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApigTypeEnum> createStaticFields() {
            Map<String, ApigTypeEnum> map = new HashMap<>();
            map.put("APIG", APIG);
            map.put("APIGW", APIGW);
            map.put("ROMA_APIC", ROMA_APIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApigTypeEnum(String value) {
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
        public static ApigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApigTypeEnum(value));
        }

        public static ApigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApigTypeEnum) {
                return this.value.equals(((ApigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_type")

    private ApigTypeEnum apigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_instance_id")

    private String apigInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id_in_apig")

    private String groupIdInApig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    public GatewayDTO withApigType(ApigTypeEnum apigType) {
        this.apigType = apigType;
        return this;
    }

    /**
     * 网关类型
     * @return apigType
     */
    public ApigTypeEnum getApigType() {
        return apigType;
    }

    public void setApigType(ApigTypeEnum apigType) {
        this.apigType = apigType;
    }

    public GatewayDTO withApigInstanceId(String apigInstanceId) {
        this.apigInstanceId = apigInstanceId;
        return this;
    }

    /**
     * 网关实例id
     * @return apigInstanceId
     */
    public String getApigInstanceId() {
        return apigInstanceId;
    }

    public void setApigInstanceId(String apigInstanceId) {
        this.apigInstanceId = apigInstanceId;
    }

    public GatewayDTO withGroupIdInApig(String groupIdInApig) {
        this.groupIdInApig = groupIdInApig;
        return this;
    }

    /**
     * 网关分组id
     * @return groupIdInApig
     */
    public String getGroupIdInApig() {
        return groupIdInApig;
    }

    public void setGroupIdInApig(String groupIdInApig) {
        this.groupIdInApig = groupIdInApig;
    }

    public GatewayDTO withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * roma网关集成应用id
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GatewayDTO that = (GatewayDTO) obj;
        return Objects.equals(this.apigType, that.apigType) && Objects.equals(this.apigInstanceId, that.apigInstanceId)
            && Objects.equals(this.groupIdInApig, that.groupIdInApig) && Objects.equals(this.romaAppId, that.romaAppId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apigType, apigInstanceId, groupIdInApig, romaAppId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GatewayDTO {\n");
        sb.append("    apigType: ").append(toIndentedString(apigType)).append("\n");
        sb.append("    apigInstanceId: ").append(toIndentedString(apigInstanceId)).append("\n");
        sb.append("    groupIdInApig: ").append(toIndentedString(groupIdInApig)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
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
