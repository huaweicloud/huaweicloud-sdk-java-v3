package com.huaweicloud.sdk.sdrs.v1.model;

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
 * 批量创建保护实例请求数据接口
 */
public class BatchCreateProtectedInstancesRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_prefix")

    private String namePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_subnet_id")

    private String primarySubnetId;

    /**
     * 在专属主机或共享池中创建容灾站点云服务器，默认为在共享池中创建。值为：shared或dedicated。shared：表示共享池。dedicated：表示专属主机。
     */
    public static final class TenancyEnum {

        /**
         * Enum SHARED for value: "shared"
         */
        public static final TenancyEnum SHARED = new TenancyEnum("shared");

        /**
         * Enum DEDICATED for value: "dedicated"
         */
        public static final TenancyEnum DEDICATED = new TenancyEnum("dedicated");

        private static final Map<String, TenancyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TenancyEnum> createStaticFields() {
            Map<String, TenancyEnum> map = new HashMap<>();
            map.put("shared", SHARED);
            map.put("dedicated", DEDICATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TenancyEnum(String value) {
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
        public static TenancyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TenancyEnum(value));
        }

        public static TenancyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TenancyEnum) {
                return this.value.equals(((TenancyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private TenancyEnum tenancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<ServerInfo> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public BatchCreateProtectedInstancesRequestParams withNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * 保护实例的名称前缀，批量创建保护实例时，为区分不同保护实例，创建过程中系统会自动在名称后加\"-0001\"的类似标记，故此时名称的长度为[1-59]个字符。只包含中文字符、英文字母（a～ｚ、Ａ～Ｚ）、数字（０~９）、小数点（．）、下划线（_）、中划线（-）。
     * @return namePrefix
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public BatchCreateProtectedInstancesRequestParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 保护实例的描述，最大支持长度为64个字符。不能包含左尖括号（<）或右尖括号（>）。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchCreateProtectedInstancesRequestParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 需要加入的保护组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public BatchCreateProtectedInstancesRequestParams withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 专属分布式存储池ID。当容灾站点磁盘选择专属分布式存储时指定该字段。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public BatchCreateProtectedInstancesRequestParams withPrimarySubnetId(String primarySubnetId) {
        this.primarySubnetId = primarySubnetId;
        return this;
    }

    /**
     * 容灾站点云服务器主网卡所在的子网subnetID，与neutron_network_id字段值一致。
     * @return primarySubnetId
     */
    public String getPrimarySubnetId() {
        return primarySubnetId;
    }

    public void setPrimarySubnetId(String primarySubnetId) {
        this.primarySubnetId = primarySubnetId;
    }

    public BatchCreateProtectedInstancesRequestParams withTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * 在专属主机或共享池中创建容灾站点云服务器，默认为在共享池中创建。值为：shared或dedicated。shared：表示共享池。dedicated：表示专属主机。
     * @return tenancy
     */
    public TenancyEnum getTenancy() {
        return tenancy;
    }

    public void setTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
    }

    public BatchCreateProtectedInstancesRequestParams withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机id，此属性仅在tenancy值为dedicated时有效。若不指定此属性，系统将自动分配租户可以自动放置弹性云服务器的专属主机。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public BatchCreateProtectedInstancesRequestParams withServers(List<ServerInfo> servers) {
        this.servers = servers;
        return this;
    }

    public BatchCreateProtectedInstancesRequestParams addServersItem(ServerInfo serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public BatchCreateProtectedInstancesRequestParams withServers(Consumer<List<ServerInfo>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 用于创建保护实例的云服务器信息列表。
     * @return servers
     */
    public List<ServerInfo> getServers() {
        return servers;
    }

    public void setServers(List<ServerInfo> servers) {
        this.servers = servers;
    }

    public BatchCreateProtectedInstancesRequestParams withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateProtectedInstancesRequestParams addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateProtectedInstancesRequestParams withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
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
        BatchCreateProtectedInstancesRequestParams that = (BatchCreateProtectedInstancesRequestParams) obj;
        return Objects.equals(this.namePrefix, that.namePrefix) && Objects.equals(this.description, that.description)
            && Objects.equals(this.serverGroupId, that.serverGroupId) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.primarySubnetId, that.primarySubnetId) && Objects.equals(this.tenancy, that.tenancy)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId) && Objects.equals(this.servers, that.servers)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePrefix,
            description,
            serverGroupId,
            clusterId,
            primarySubnetId,
            tenancy,
            dedicatedHostId,
            servers,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateProtectedInstancesRequestParams {\n");
        sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    primarySubnetId: ").append(toIndentedString(primarySubnetId)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
