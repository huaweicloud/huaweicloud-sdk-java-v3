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
 * 创建保护实例数据结构
 */
public class CreateProtectedInstanceRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_subnet_id")

    private String primarySubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_ip_address")

    private String primaryIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    /**
     * 在专属主机或共享池中创建容灾站点云服务器，默认为在共享池中创建。 值为：shared或dedicated。shared：表示共享池。 dedicated：表示专属主机。
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
            TenancyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TenancyEnum(value);
            }
            return result;
        }

        public static TenancyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TenancyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public CreateProtectedInstanceRequestParams withServerGroupId(String serverGroupId) {
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

    public CreateProtectedInstanceRequestParams withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 指定的生产站点云服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public CreateProtectedInstanceRequestParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定保护实例的名称，最大支持长度为64个字节。只包含中文字符、英文字母（a～ｚ、Ａ～Ｚ）、数字（０~９）、小数点（．）、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProtectedInstanceRequestParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 指定保护实例的描述，最大支持长度为64个字节。不能包含左尖括号（<）或右尖括号（>）。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProtectedInstanceRequestParams withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 专属分布式存储池ID。 当容灾站点磁盘选择专属分布式存储时指定该字段。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateProtectedInstanceRequestParams withPrimarySubnetId(String primarySubnetId) {
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

    public CreateProtectedInstanceRequestParams withPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }

    /**
     * 容灾站点云服务器主网卡IP地址。此参数仅在传入primary_subnet_id时有效。指定primary_subnet_id时，如果不指定该参数，将自动分配容灾站点云服务器主网卡IP地址。
     * @return primaryIpAddress
     */
    public String getPrimaryIpAddress() {
        return primaryIpAddress;
    }

    public void setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
    }

    public CreateProtectedInstanceRequestParams withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateProtectedInstanceRequestParams addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateProtectedInstanceRequestParams withTags(Consumer<List<ResourceTag>> tagsSetter) {
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

    public CreateProtectedInstanceRequestParams withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 指定的容灾站点云服务器的flavor ID。 查询flavor列表，请参见查询云服务器规格变更支持列表。  说明:不指定此参数时，容灾站点云服务器的flavor ID默认和生产站点云服务器保持一致。 不同规格的云服务器在性能上存在差异，可能会对云服务器上运行的应用产生影响。为保证切换/故障切换后云服务器的性能，建议容灾站点服务器的规格（CPU、内存）不低于生产站点云服务器的规格（CPU、内存）。 生产站点云服务器和容灾站点云服务器的flavor存在匹配关系，可以通过上述接口使用生产站点云服务器过滤出满足要求的容灾站点云服务器flavor。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateProtectedInstanceRequestParams withTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * 在专属主机或共享池中创建容灾站点云服务器，默认为在共享池中创建。 值为：shared或dedicated。shared：表示共享池。 dedicated：表示专属主机。
     * @return tenancy
     */
    public TenancyEnum getTenancy() {
        return tenancy;
    }

    public void setTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
    }

    public CreateProtectedInstanceRequestParams withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机id，此属性仅在tenancy值为dedicated时有效。 若不指定此属性，系统将自动分配租户可以自动放置弹性云服务器的专属主机。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProtectedInstanceRequestParams createProtectedInstanceRequestParams =
            (CreateProtectedInstanceRequestParams) o;
        return Objects.equals(this.serverGroupId, createProtectedInstanceRequestParams.serverGroupId)
            && Objects.equals(this.serverId, createProtectedInstanceRequestParams.serverId)
            && Objects.equals(this.name, createProtectedInstanceRequestParams.name)
            && Objects.equals(this.description, createProtectedInstanceRequestParams.description)
            && Objects.equals(this.clusterId, createProtectedInstanceRequestParams.clusterId)
            && Objects.equals(this.primarySubnetId, createProtectedInstanceRequestParams.primarySubnetId)
            && Objects.equals(this.primaryIpAddress, createProtectedInstanceRequestParams.primaryIpAddress)
            && Objects.equals(this.tags, createProtectedInstanceRequestParams.tags)
            && Objects.equals(this.flavorRef, createProtectedInstanceRequestParams.flavorRef)
            && Objects.equals(this.tenancy, createProtectedInstanceRequestParams.tenancy)
            && Objects.equals(this.dedicatedHostId, createProtectedInstanceRequestParams.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId,
            serverId,
            name,
            description,
            clusterId,
            primarySubnetId,
            primaryIpAddress,
            tags,
            flavorRef,
            tenancy,
            dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProtectedInstanceRequestParams {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    primarySubnetId: ").append(toIndentedString(primarySubnetId)).append("\n");
        sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
