package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListRecycleBinServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_tenants")

    private String allTenants;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    /**
     * Gets or Sets expectFields
     */
    public static final class ExpectFieldsEnum {

        /**
         * Enum AVAILABLE_VALUES_POWER_STATE for value: "Available values : power_state"
         */
        public static final ExpectFieldsEnum AVAILABLE_VALUES_POWER_STATE =
            new ExpectFieldsEnum("Available values : power_state");

        /**
         * Enum HOST_STATUS for value: "host_status"
         */
        public static final ExpectFieldsEnum HOST_STATUS = new ExpectFieldsEnum("host_status");

        /**
         * Enum HOSTNAME for value: "hostname"
         */
        public static final ExpectFieldsEnum HOSTNAME = new ExpectFieldsEnum("hostname");

        /**
         * Enum HYPERVISOR_HOSTNAME for value: "hypervisor_hostname"
         */
        public static final ExpectFieldsEnum HYPERVISOR_HOSTNAME = new ExpectFieldsEnum("hypervisor_hostname");

        /**
         * Enum USER_DATA for value: "user_data"
         */
        public static final ExpectFieldsEnum USER_DATA = new ExpectFieldsEnum("user_data");

        /**
         * Enum KEY_NAME for value: "key_name"
         */
        public static final ExpectFieldsEnum KEY_NAME = new ExpectFieldsEnum("key_name");

        /**
         * Enum ROOT_DEVICE_NAME for value: "root_device_name"
         */
        public static final ExpectFieldsEnum ROOT_DEVICE_NAME = new ExpectFieldsEnum("root_device_name");

        /**
         * Enum VOLUMES_ATTACHED for value: "volumes_attached"
         */
        public static final ExpectFieldsEnum VOLUMES_ATTACHED = new ExpectFieldsEnum("volumes_attached");

        /**
         * Enum SECURITY_GROUPS for value: "security_groups"
         */
        public static final ExpectFieldsEnum SECURITY_GROUPS = new ExpectFieldsEnum("security_groups");

        /**
         * Enum ADDRESSES for value: "addresses"
         */
        public static final ExpectFieldsEnum ADDRESSES = new ExpectFieldsEnum("addresses");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final ExpectFieldsEnum IMAGE = new ExpectFieldsEnum("image");

        /**
         * Enum METADATA for value: "metadata"
         */
        public static final ExpectFieldsEnum METADATA = new ExpectFieldsEnum("metadata");

        /**
         * Enum TAGS for value: "tags"
         */
        public static final ExpectFieldsEnum TAGS = new ExpectFieldsEnum("tags");

        /**
         * Enum SYSTEM_TAGS for value: "system_tags"
         */
        public static final ExpectFieldsEnum SYSTEM_TAGS = new ExpectFieldsEnum("system_tags");

        /**
         * Enum DEDICATED_HOST_ID for value: "dedicated_host_id"
         */
        public static final ExpectFieldsEnum DEDICATED_HOST_ID = new ExpectFieldsEnum("dedicated_host_id");

        /**
         * Enum ENTERPRISE_PROJECT_ID for value: "enterprise_project_id"
         */
        public static final ExpectFieldsEnum ENTERPRISE_PROJECT_ID = new ExpectFieldsEnum("enterprise_project_id");

        /**
         * Enum CPU_OPTIONS for value: "cpu_options"
         */
        public static final ExpectFieldsEnum CPU_OPTIONS = new ExpectFieldsEnum("cpu_options");

        private static final Map<String, ExpectFieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExpectFieldsEnum> createStaticFields() {
            Map<String, ExpectFieldsEnum> map = new HashMap<>();
            map.put("Available values : power_state", AVAILABLE_VALUES_POWER_STATE);
            map.put("host_status", HOST_STATUS);
            map.put("hostname", HOSTNAME);
            map.put("hypervisor_hostname", HYPERVISOR_HOSTNAME);
            map.put("user_data", USER_DATA);
            map.put("key_name", KEY_NAME);
            map.put("root_device_name", ROOT_DEVICE_NAME);
            map.put("volumes_attached", VOLUMES_ATTACHED);
            map.put("security_groups", SECURITY_GROUPS);
            map.put("addresses", ADDRESSES);
            map.put("image", IMAGE);
            map.put("metadata", METADATA);
            map.put("tags", TAGS);
            map.put("system_tags", SYSTEM_TAGS);
            map.put("dedicated_host_id", DEDICATED_HOST_ID);
            map.put("enterprise_project_id", ENTERPRISE_PROJECT_ID);
            map.put("cpu_options", CPU_OPTIONS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExpectFieldsEnum(String value) {
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
        public static ExpectFieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExpectFieldsEnum(value));
        }

        public static ExpectFieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExpectFieldsEnum) {
                return this.value.equals(((ExpectFieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect-fields")

    private ExpectFieldsEnum expectFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_key")

    private List<String> tagsKey = null;

    public ListRecycleBinServersRequest withAllTenants(String allTenants) {
        this.allTenants = allTenants;
        return this;
    }

    /**
     * 所有租户 管理员字段 1: 返回所有租户的VM 0: 返回当前租户的VM，如果为0，与不设置该查询字段的效果一致
     * @return allTenants
     */
    public String getAllTenants() {
        return allTenants;
    }

    public void setAllTenants(String allTenants) {
        this.allTenants = allTenants;
    }

    public ListRecycleBinServersRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListRecycleBinServersRequest withExpectFields(ExpectFieldsEnum expectFields) {
        this.expectFields = expectFields;
        return this;
    }

    /**
     * Get expectFields
     * @return expectFields
     */
    public ExpectFieldsEnum getExpectFields() {
        return expectFields;
    }

    public void setExpectFields(ExpectFieldsEnum expectFields) {
        this.expectFields = expectFields;
    }

    public ListRecycleBinServersRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ListRecycleBinServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRecycleBinServersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRecycleBinServersRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListRecycleBinServersRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListRecycleBinServersRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ListRecycleBinServersRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListRecycleBinServersRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ListRecycleBinServersRequest withTagsKey(List<String> tagsKey) {
        this.tagsKey = tagsKey;
        return this;
    }

    public ListRecycleBinServersRequest addTagsKeyItem(String tagsKeyItem) {
        if (this.tagsKey == null) {
            this.tagsKey = new ArrayList<>();
        }
        this.tagsKey.add(tagsKeyItem);
        return this;
    }

    public ListRecycleBinServersRequest withTagsKey(Consumer<List<String>> tagsKeySetter) {
        if (this.tagsKey == null) {
            this.tagsKey = new ArrayList<>();
        }
        tagsKeySetter.accept(this.tagsKey);
        return this;
    }

    /**
     * Get tagsKey
     * @return tagsKey
     */
    public List<String> getTagsKey() {
        return tagsKey;
    }

    public void setTagsKey(List<String> tagsKey) {
        this.tagsKey = tagsKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRecycleBinServersRequest that = (ListRecycleBinServersRequest) obj;
        return Objects.equals(this.allTenants, that.allTenants)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.expectFields, that.expectFields) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.tagsKey, that.tagsKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(allTenants, availabilityZone, expectFields, ipAddress, limit, marker, name, offset, tags, tagsKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecycleBinServersRequest {\n");
        sb.append("    allTenants: ").append(toIndentedString(allTenants)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    expectFields: ").append(toIndentedString(expectFields)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsKey: ").append(toIndentedString(tagsKey)).append("\n");
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
