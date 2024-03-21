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
public class ShowGlobalEipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

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
         * Enum DESCRIPTION for value: "description"
         */
        public static final FieldsEnum DESCRIPTION = new FieldsEnum("description");

        /**
         * Enum DOMAIN_ID for value: "domain_id"
         */
        public static final FieldsEnum DOMAIN_ID = new FieldsEnum("domain_id");

        /**
         * Enum ACCESS_SITE for value: "access_site"
         */
        public static final FieldsEnum ACCESS_SITE = new FieldsEnum("access_site");

        /**
         * Enum GEIP_POOL_NAME for value: "geip_pool_name"
         */
        public static final FieldsEnum GEIP_POOL_NAME = new FieldsEnum("geip_pool_name");

        /**
         * Enum ISP for value: "isp"
         */
        public static final FieldsEnum ISP = new FieldsEnum("isp");

        /**
         * Enum IP_VERSION for value: "ip_version"
         */
        public static final FieldsEnum IP_VERSION = new FieldsEnum("ip_version");

        /**
         * Enum IP_ADDRESS for value: "ip_address"
         */
        public static final FieldsEnum IP_ADDRESS = new FieldsEnum("ip_address");

        /**
         * Enum IPV6_ADDRESS for value: "ipv6_address"
         */
        public static final FieldsEnum IPV6_ADDRESS = new FieldsEnum("ipv6_address");

        /**
         * Enum FREEZEN for value: "freezen"
         */
        public static final FieldsEnum FREEZEN = new FieldsEnum("freezen");

        /**
         * Enum FREEZEN_INFO for value: "freezen_info"
         */
        public static final FieldsEnum FREEZEN_INFO = new FieldsEnum("freezen_info");

        /**
         * Enum POLLUTED for value: "polluted"
         */
        public static final FieldsEnum POLLUTED = new FieldsEnum("polluted");

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
         * Enum INTERNET_BANDWIDTH_INFO for value: "internet_bandwidth_info"
         */
        public static final FieldsEnum INTERNET_BANDWIDTH_INFO = new FieldsEnum("internet_bandwidth_info");

        /**
         * Enum GLOBAL_CONNECTION_BANDWIDTH_INFO for value: "global_connection_bandwidth_info"
         */
        public static final FieldsEnum GLOBAL_CONNECTION_BANDWIDTH_INFO =
            new FieldsEnum("global_connection_bandwidth_info");

        /**
         * Enum ASSOCIATE_INSTANCE_INFO for value: "associate_instance_info"
         */
        public static final FieldsEnum ASSOCIATE_INSTANCE_INFO = new FieldsEnum("associate_instance_info");

        /**
         * Enum IS_PRE_PAID for value: "is_pre_paid"
         */
        public static final FieldsEnum IS_PRE_PAID = new FieldsEnum("is_pre_paid");

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
            map.put("description", DESCRIPTION);
            map.put("domain_id", DOMAIN_ID);
            map.put("access_site", ACCESS_SITE);
            map.put("geip_pool_name", GEIP_POOL_NAME);
            map.put("isp", ISP);
            map.put("ip_version", IP_VERSION);
            map.put("ip_address", IP_ADDRESS);
            map.put("ipv6_address", IPV6_ADDRESS);
            map.put("freezen", FREEZEN);
            map.put("freezen_info", FREEZEN_INFO);
            map.put("polluted", POLLUTED);
            map.put("status", STATUS);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("internet_bandwidth_info", INTERNET_BANDWIDTH_INFO);
            map.put("global_connection_bandwidth_info", GLOBAL_CONNECTION_BANDWIDTH_INFO);
            map.put("associate_instance_info", ASSOCIATE_INSTANCE_INFO);
            map.put("is_pre_paid", IS_PRE_PAID);
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

    public ShowGlobalEipRequest withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * Get globalEipId
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public ShowGlobalEipRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ShowGlobalEipRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowGlobalEipRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
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
        ShowGlobalEipRequest that = (ShowGlobalEipRequest) obj;
        return Objects.equals(this.globalEipId, that.globalEipId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalEipRequest {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
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
