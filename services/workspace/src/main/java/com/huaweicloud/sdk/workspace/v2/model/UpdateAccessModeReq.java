package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改接入方式请求。
 */
public class UpdateAccessModeReq {

    /**
     * 接入模式。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
     */
    public static final class AccessModeEnum {

        /**
         * Enum INTERNET for value: "INTERNET"
         */
        public static final AccessModeEnum INTERNET = new AccessModeEnum("INTERNET");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final AccessModeEnum DEDICATED = new AccessModeEnum("DEDICATED");

        /**
         * Enum BOTH for value: "BOTH"
         */
        public static final AccessModeEnum BOTH = new AccessModeEnum("BOTH");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("INTERNET", INTERNET);
            map.put("DEDICATED", DEDICATED);
            map.put("BOTH", BOTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
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
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_cidrs")

    private String dedicatedCidrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_shared_vpc_dedicated_param")

    private ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam;

    public UpdateAccessModeReq withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入模式。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public UpdateAccessModeReq withDedicatedCidrs(String dedicatedCidrs) {
        this.dedicatedCidrs = dedicatedCidrs;
        return this;
    }

    /**
     * 专线接入网段列表，多个网段信息用分号隔开，列表长度不超过5。
     * @return dedicatedCidrs
     */
    public String getDedicatedCidrs() {
        return dedicatedCidrs;
    }

    public void setDedicatedCidrs(String dedicatedCidrs) {
        this.dedicatedCidrs = dedicatedCidrs;
    }

    public UpdateAccessModeReq withApplySharedVpcDedicatedParam(
        ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
        return this;
    }

    public UpdateAccessModeReq withApplySharedVpcDedicatedParam(
        Consumer<ApplySharedVpcDedicatedParam> applySharedVpcDedicatedParamSetter) {
        if (this.applySharedVpcDedicatedParam == null) {
            this.applySharedVpcDedicatedParam = new ApplySharedVpcDedicatedParam();
            applySharedVpcDedicatedParamSetter.accept(this.applySharedVpcDedicatedParam);
        }

        return this;
    }

    /**
     * Get applySharedVpcDedicatedParam
     * @return applySharedVpcDedicatedParam
     */
    public ApplySharedVpcDedicatedParam getApplySharedVpcDedicatedParam() {
        return applySharedVpcDedicatedParam;
    }

    public void setApplySharedVpcDedicatedParam(ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccessModeReq that = (UpdateAccessModeReq) obj;
        return Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.dedicatedCidrs, that.dedicatedCidrs)
            && Objects.equals(this.applySharedVpcDedicatedParam, that.applySharedVpcDedicatedParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMode, dedicatedCidrs, applySharedVpcDedicatedParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessModeReq {\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dedicatedCidrs: ").append(toIndentedString(dedicatedCidrs)).append("\n");
        sb.append("    applySharedVpcDedicatedParam: ")
            .append(toIndentedString(applySharedVpcDedicatedParam))
            .append("\n");
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
