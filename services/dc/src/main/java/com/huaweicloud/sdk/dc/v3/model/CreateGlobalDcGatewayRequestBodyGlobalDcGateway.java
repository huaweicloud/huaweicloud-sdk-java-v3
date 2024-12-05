package com.huaweicloud.sdk.dc.v3.model;

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
 * CreateGlobalDcGatewayRequestBodyGlobalDcGateway
 */
public class CreateGlobalDcGatewayRequestBodyGlobalDcGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 地址簇类型
     */
    public static final class AddressFamilyEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final AddressFamilyEnum IPV4 = new AddressFamilyEnum("ipv4");

        /**
         * Enum DUAL for value: "dual"
         */
        public static final AddressFamilyEnum DUAL = new AddressFamilyEnum("dual");

        private static final Map<String, AddressFamilyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AddressFamilyEnum> createStaticFields() {
            Map<String, AddressFamilyEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("dual", DUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AddressFamilyEnum(String value) {
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
        public static AddressFamilyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressFamilyEnum(value));
        }

        public static AddressFamilyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressFamilyEnum) {
                return this.value.equals(((AddressFamilyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private AddressFamilyEnum addressFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags> tags = null;

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 全球接入网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * BGP模式的AS号
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 地址簇类型
     * @return addressFamily
     */
    public AddressFamilyEnum getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withTags(
        List<CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway addTagsItem(
        CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway withTags(
        Consumer<List<CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateGlobalDcGatewayRequestBodyGlobalDcGatewayTags> tags) {
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
        CreateGlobalDcGatewayRequestBodyGlobalDcGateway that = (CreateGlobalDcGatewayRequestBodyGlobalDcGateway) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.addressFamily, that.addressFamily) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, name, description, bgpAsn, enterpriseProjectId, addressFamily, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalDcGatewayRequestBodyGlobalDcGateway {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
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
