package com.huaweicloud.sdk.vpn.v5.model;

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
 * CreateP2cVgwRequestBodyContent
 */
public class CreateP2cVgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_subnet")

    private String connectSubnet;

    /**
     * P2C VPN网关的规格类型
     */
    public static final class FlavorEnum {

        /**
         * Enum PROFESSIONAL1 for value: "Professional1"
         */
        public static final FlavorEnum PROFESSIONAL1 = new FlavorEnum("Professional1");

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("Professional1", PROFESSIONAL1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlavorEnum(String value) {
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
        public static FlavorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlavorEnum(value));
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlavorEnum) {
                return this.value.equals(((FlavorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorEnum flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private CreateP2cRequestEip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection_number")

    private Integer maxConnectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    public CreateP2cVgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * P2C VPN网关名称。1-64字符，中文、英文、数字包含下划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateP2cVgwRequestBodyContent withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * P2C VPN网关所连接的VPC的ID。标准UUID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateP2cVgwRequestBodyContent withConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
        return this;
    }

    /**
     * P2C VPN网关所使用的VPC子网ID。标准的UUID
     * @return connectSubnet
     */
    public String getConnectSubnet() {
        return connectSubnet;
    }

    public void setConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
    }

    public CreateP2cVgwRequestBodyContent withFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * P2C VPN网关的规格类型
     * @return flavor
     */
    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }

    public CreateP2cVgwRequestBodyContent withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public CreateP2cVgwRequestBodyContent addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public CreateP2cVgwRequestBodyContent withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 不填时自动为P2C VPN网关选择可用区。如果需要指定可用区可以通过查询VPN网关可用区查询可用区列表
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public CreateP2cVgwRequestBodyContent withEip(CreateP2cRequestEip eip) {
        this.eip = eip;
        return this;
    }

    public CreateP2cVgwRequestBodyContent withEip(Consumer<CreateP2cRequestEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new CreateP2cRequestEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public CreateP2cRequestEip getEip() {
        return eip;
    }

    public void setEip(CreateP2cRequestEip eip) {
        this.eip = eip;
    }

    public CreateP2cVgwRequestBodyContent withMaxConnectionNumber(Integer maxConnectionNumber) {
        this.maxConnectionNumber = maxConnectionNumber;
        return this;
    }

    /**
     * 最大并发客户端连接数，且不超过规格的最大连接数
     * minimum: 10
     * maximum: 500
     * @return maxConnectionNumber
     */
    public Integer getMaxConnectionNumber() {
        return maxConnectionNumber;
    }

    public void setMaxConnectionNumber(Integer maxConnectionNumber) {
        this.maxConnectionNumber = maxConnectionNumber;
    }

    public CreateP2cVgwRequestBodyContent withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateP2cVgwRequestBodyContent withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateP2cVgwRequestBodyContent addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateP2cVgwRequestBodyContent withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
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
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
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
        CreateP2cVgwRequestBodyContent that = (CreateP2cVgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.connectSubnet, that.connectSubnet) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.maxConnectionNumber, that.maxConnectionNumber)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            vpcId,
            connectSubnet,
            flavor,
            availabilityZoneIds,
            eip,
            maxConnectionNumber,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateP2cVgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    connectSubnet: ").append(toIndentedString(connectSubnet)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    maxConnectionNumber: ").append(toIndentedString(maxConnectionNumber)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
