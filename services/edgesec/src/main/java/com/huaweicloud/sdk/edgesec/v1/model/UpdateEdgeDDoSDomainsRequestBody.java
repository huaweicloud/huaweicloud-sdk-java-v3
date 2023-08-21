package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateEdgeDDoSDomainsRequestBody
 */
public class UpdateEdgeDDoSDomainsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 防护开关（0:关，1:开）
     */
    public static final class ProtectedSwitchEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProtectedSwitchEnum NUMBER_0 = new ProtectedSwitchEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProtectedSwitchEnum NUMBER_1 = new ProtectedSwitchEnum(1);

        private static final Map<Integer, ProtectedSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtectedSwitchEnum> createStaticFields() {
            Map<Integer, ProtectedSwitchEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtectedSwitchEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectedSwitchEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectedSwitchEnum(value));
        }

        public static ProtectedSwitchEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectedSwitchEnum) {
                return this.value.equals(((ProtectedSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_switch")

    private ProtectedSwitchEnum protectedSwitch;

    public UpdateEdgeDDoSDomainsRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateEdgeDDoSDomainsRequestBody withProtectedSwitch(ProtectedSwitchEnum protectedSwitch) {
        this.protectedSwitch = protectedSwitch;
        return this;
    }

    /**
     * 防护开关（0:关，1:开）
     * @return protectedSwitch
     */
    public ProtectedSwitchEnum getProtectedSwitch() {
        return protectedSwitch;
    }

    public void setProtectedSwitch(ProtectedSwitchEnum protectedSwitch) {
        this.protectedSwitch = protectedSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEdgeDDoSDomainsRequestBody that = (UpdateEdgeDDoSDomainsRequestBody) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.protectedSwitch, that.protectedSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, protectedSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeDDoSDomainsRequestBody {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    protectedSwitch: ").append(toIndentedString(protectedSwitch)).append("\n");
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
