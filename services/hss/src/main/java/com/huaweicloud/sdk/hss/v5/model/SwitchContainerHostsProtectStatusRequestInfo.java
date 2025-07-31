package com.huaweicloud.sdk.hss.v5.model;

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
 * SwitchContainerHostsProtectStatusRequestInfo
 */
public class SwitchContainerHostsProtectStatusRequestInfo {

    /**
     * 开通的版本，包含如下：   - hss.version.null：无   - hss.version.container.enterprise：容器版 
     */
    public static final class VersionEnum {

        /**
         * Enum HSS_VERSION_NULL for value: "hss.version.null"
         */
        public static final VersionEnum HSS_VERSION_NULL = new VersionEnum("hss.version.null");

        /**
         * Enum HSS_VERSION_CONTAINER_ENTERPRISE for value: "hss.version.container.enterprise"
         */
        public static final VersionEnum HSS_VERSION_CONTAINER_ENTERPRISE =
            new VersionEnum("hss.version.container.enterprise");

        private static final Map<String, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionEnum> createStaticFields() {
            Map<String, VersionEnum> map = new HashMap<>();
            map.put("hss.version.null", HSS_VERSION_NULL);
            map.put("hss.version.container.enterprise", HSS_VERSION_CONTAINER_ENTERPRISE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionEnum(String value) {
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
        public static VersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private VersionEnum version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    public SwitchContainerHostsProtectStatusRequestInfo withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * 开通的版本，包含如下：   - hss.version.null：无   - hss.version.container.enterprise：容器版 
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式，包含如下：  - packet_cycle：包周期  - on_demand：按需 
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源实例ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public SwitchContainerHostsProtectStatusRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 服务器列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public SwitchContainerHostsProtectStatusRequestInfo addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SwitchContainerHostsProtectStatusRequestInfo withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签
     * @return tags
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchContainerHostsProtectStatusRequestInfo that = (SwitchContainerHostsProtectStatusRequestInfo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.hostIdList, that.hostIdList)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, chargingMode, resourceId, hostIdList, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchContainerHostsProtectStatusRequestInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
