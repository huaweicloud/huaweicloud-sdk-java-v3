package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowInternetBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_id")

    private String internetBandwidthId;

    /**
     * Gets or Sets fields
     */
    public static final class FieldsEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final FieldsEnum ID = new FieldsEnum("id");

        /**
         * Enum NAME for value: "name"
         */
        public static final FieldsEnum NAME = new FieldsEnum("name");

        /**
         * Enum ISP for value: "isp"
         */
        public static final FieldsEnum ISP = new FieldsEnum("isp");

        /**
         * Enum INGRESS_SIZE for value: "ingress_size"
         */
        public static final FieldsEnum INGRESS_SIZE = new FieldsEnum("ingress_size");

        /**
         * Enum ACCESS_SITE for value: "access_site"
         */
        public static final FieldsEnum ACCESS_SITE = new FieldsEnum("access_site");

        /**
         * Enum SIZE for value: "size"
         */
        public static final FieldsEnum SIZE = new FieldsEnum("size");

        /**
         * Enum DESCRIPTION for value: "description"
         */
        public static final FieldsEnum DESCRIPTION = new FieldsEnum("description");

        /**
         * Enum CHARGE_MODE for value: "charge_mode"
         */
        public static final FieldsEnum CHARGE_MODE = new FieldsEnum("charge_mode");

        /**
         * Enum RATIO_95PEAK for value: "ratio_95peak"
         */
        public static final FieldsEnum RATIO_95PEAK = new FieldsEnum("ratio_95peak");

        /**
         * Enum FREEZEN_INFO for value: "freezen_info"
         */
        public static final FieldsEnum FREEZEN_INFO = new FieldsEnum("freezen_info");

        /**
         * Enum DOMAIN_ID for value: "domain_id"
         */
        public static final FieldsEnum DOMAIN_ID = new FieldsEnum("domain_id");

        /**
         * Enum STATUS for value: "status"
         */
        public static final FieldsEnum STATUS = new FieldsEnum("status");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final FieldsEnum CREATED_AT = new FieldsEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final FieldsEnum UPDATED_AT = new FieldsEnum("updated_at");

        /**
         * Enum IS_PRE_PAID for value: "is_pre_paid"
         */
        public static final FieldsEnum IS_PRE_PAID = new FieldsEnum("is_pre_paid");

        /**
         * Enum TYPE for value: "type"
         */
        public static final FieldsEnum TYPE = new FieldsEnum("type");

        /**
         * Enum TAGS for value: "tags"
         */
        public static final FieldsEnum TAGS = new FieldsEnum("tags");

        /**
         * Enum SYS_TAGS for value: "sys_tags"
         */
        public static final FieldsEnum SYS_TAGS = new FieldsEnum("sys_tags");

        /**
         * Enum ENTERPRISE_PROJECT_ID for value: "enterprise_project_id"
         */
        public static final FieldsEnum ENTERPRISE_PROJECT_ID = new FieldsEnum("enterprise_project_id");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("name", NAME);
            map.put("isp", ISP);
            map.put("ingress_size", INGRESS_SIZE);
            map.put("access_site", ACCESS_SITE);
            map.put("size", SIZE);
            map.put("description", DESCRIPTION);
            map.put("charge_mode", CHARGE_MODE);
            map.put("ratio_95peak", RATIO_95PEAK);
            map.put("freezen_info", FREEZEN_INFO);
            map.put("domain_id", DOMAIN_ID);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("is_pre_paid", IS_PRE_PAID);
            map.put("type", TYPE);
            map.put("tags", TAGS);
            map.put("sys_tags", SYS_TAGS);
            map.put("enterprise_project_id", ENTERPRISE_PROJECT_ID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldsEnum> fields = null;

    public ShowInternetBandwidthRequest withInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    /**
     * Get internetBandwidthId
     * @return internetBandwidthId
     */
    public String getInternetBandwidthId() {
        return internetBandwidthId;
    }

    public void setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
    }

    public ShowInternetBandwidthRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ShowInternetBandwidthRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowInternetBandwidthRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * Get fields
     * @return fields
     */
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInternetBandwidthRequest that = (ShowInternetBandwidthRequest) obj;
        return Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetBandwidthId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInternetBandwidthRequest {\n");
        sb.append("    internetBandwidthId: ").append(toIndentedString(internetBandwidthId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
