package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 互联网关的相信信息对象
 */
public class ConnectGatewayResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 地址族信息 - ipv4: 仅支持ipv4模式 - dual: 支持ipv4 和 ipv6 模式
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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private String accessSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_geip_count")

    private Integer currentGeipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_site")

    private String gatewaySite;

    public ConnectGatewayResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectGatewayResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ConnectGatewayResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectGatewayResponse withDescription(String description) {
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

    public ConnectGatewayResponse withAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 地址族信息 - ipv4: 仅支持ipv4模式 - dual: 支持ipv4 和 ipv6 模式
     * @return addressFamily
     */
    public AddressFamilyEnum getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(AddressFamilyEnum addressFamily) {
        this.addressFamily = addressFamily;
    }

    public ConnectGatewayResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 网关状态 - DOWN 未使用或关联设备状态为DOWN - ACTIVE 正常 - ERROR 异常
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConnectGatewayResponse withAccessSite(String accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    /**
     * 网关站点值
     * @return accessSite
     */
    public String getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(String accessSite) {
        this.accessSite = accessSite;
    }

    public ConnectGatewayResponse withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * BGP类型AS号
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public ConnectGatewayResponse withCurrentGeipCount(Integer currentGeipCount) {
        this.currentGeipCount = currentGeipCount;
        return this;
    }

    /**
     * 当前绑定的global eip数量
     * @return currentGeipCount
     */
    public Integer getCurrentGeipCount() {
        return currentGeipCount;
    }

    public void setCurrentGeipCount(Integer currentGeipCount) {
        this.currentGeipCount = currentGeipCount;
    }

    public ConnectGatewayResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ConnectGatewayResponse withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ConnectGatewayResponse withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 带宽包id
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    public ConnectGatewayResponse withGatewaySite(String gatewaySite) {
        this.gatewaySite = gatewaySite;
        return this;
    }

    /**
     * 网关位置
     * @return gatewaySite
     */
    public String getGatewaySite() {
        return gatewaySite;
    }

    public void setGatewaySite(String gatewaySite) {
        this.gatewaySite = gatewaySite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectGatewayResponse that = (ConnectGatewayResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.addressFamily, that.addressFamily) && Objects.equals(this.status, that.status)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.currentGeipCount, that.currentGeipCount)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.gcbId, that.gcbId) && Objects.equals(this.gatewaySite, that.gatewaySite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            addressFamily,
            status,
            accessSite,
            bgpAsn,
            currentGeipCount,
            createdTime,
            updatedTime,
            gcbId,
            gatewaySite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectGatewayResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    currentGeipCount: ").append(toIndentedString(currentGeipCount)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
        sb.append("    gatewaySite: ").append(toIndentedString(gatewaySite)).append("\n");
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
