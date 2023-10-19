package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ShowAgencyRequest {

    /**
     * 委托类型,JOB_TRUST-任务委托,ADMIN_TRUST-系统委托
     */
    public static final class AgencyTypeEnum {

        /**
         * Enum JOB_TRUST for value: "JOB_TRUST"
         */
        public static final AgencyTypeEnum JOB_TRUST = new AgencyTypeEnum("JOB_TRUST");

        /**
         * Enum ADMIN_TRUST for value: "ADMIN_TRUST"
         */
        public static final AgencyTypeEnum ADMIN_TRUST = new AgencyTypeEnum("ADMIN_TRUST");

        private static final Map<String, AgencyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyTypeEnum> createStaticFields() {
            Map<String, AgencyTypeEnum> map = new HashMap<>();
            map.put("JOB_TRUST", JOB_TRUST);
            map.put("ADMIN_TRUST", ADMIN_TRUST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyTypeEnum(String value) {
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
        public static AgencyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyTypeEnum(value));
        }

        public static AgencyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyTypeEnum) {
                return this.value.equals(((AgencyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_type")

    private AgencyTypeEnum agencyType;

    public ShowAgencyRequest withAgencyType(AgencyTypeEnum agencyType) {
        this.agencyType = agencyType;
        return this;
    }

    /**
     * 委托类型,JOB_TRUST-任务委托,ADMIN_TRUST-系统委托
     * @return agencyType
     */
    public AgencyTypeEnum getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(AgencyTypeEnum agencyType) {
        this.agencyType = agencyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyRequest that = (ShowAgencyRequest) obj;
        return Objects.equals(this.agencyType, that.agencyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyRequest {\n");
        sb.append("    agencyType: ").append(toIndentedString(agencyType)).append("\n");
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
