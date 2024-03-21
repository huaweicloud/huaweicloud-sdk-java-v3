package com.huaweicloud.sdk.nat.v2.model;

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
public class ListNatGatewaySnatRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_address")

    private List<String> floatingIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    private List<String> floatingIpId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private List<String> natGatewayId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    /**
     * SNAT规则的状态。 取值为： \"ACTIVE\": 可用 \"PENDING_CREATE\"：创建中 \"PENDING_UPDATE\"：更新中 \"PENDING_DELETE\"：删除中 \"EIP_FREEZED\"：EIP冻结 \"INACTIVE\"：不可用
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /**
         * Enum EIP_FREEZED for value: "EIP_FREEZED"
         */
        public static final StatusEnum EIP_FREEZED = new StatusEnum("EIP_FREEZED");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("EIP_FREEZED", EIP_FREEZED);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListNatGatewaySnatRulesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 解冻/冻结状态。 取值范围： \"true\"：解冻 \"false\"：冻结
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListNatGatewaySnatRulesRequest withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 可以是网段或者主机格式，与network_id参数二选一。 Source_type=0时，cidr必须是vpc子网网段的子集(不能相等）; Source_type=1时，cidr必须指定专线侧网段。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ListNatGatewaySnatRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回的个数。 取值范围：0~2000。 默认值：2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListNatGatewaySnatRulesRequest withFloatingIpAddress(List<String> floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    public ListNatGatewaySnatRulesRequest addFloatingIpAddressItem(String floatingIpAddressItem) {
        if (this.floatingIpAddress == null) {
            this.floatingIpAddress = new ArrayList<>();
        }
        this.floatingIpAddress.add(floatingIpAddressItem);
        return this;
    }

    public ListNatGatewaySnatRulesRequest withFloatingIpAddress(Consumer<List<String>> floatingIpAddressSetter) {
        if (this.floatingIpAddress == null) {
            this.floatingIpAddress = new ArrayList<>();
        }
        floatingIpAddressSetter.accept(this.floatingIpAddress);
        return this;
    }

    /**
     * 功能说明：弹性公网IP。
     * @return floatingIpAddress
     */
    public List<String> getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(List<String> floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public ListNatGatewaySnatRulesRequest withFloatingIpId(List<String> floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    public ListNatGatewaySnatRulesRequest addFloatingIpIdItem(String floatingIpIdItem) {
        if (this.floatingIpId == null) {
            this.floatingIpId = new ArrayList<>();
        }
        this.floatingIpId.add(floatingIpIdItem);
        return this;
    }

    public ListNatGatewaySnatRulesRequest withFloatingIpId(Consumer<List<String>> floatingIpIdSetter) {
        if (this.floatingIpId == null) {
            this.floatingIpId = new ArrayList<>();
        }
        floatingIpIdSetter.accept(this.floatingIpId);
        return this;
    }

    /**
     * 功能说明：弹性公网IP的id。
     * @return floatingIpId
     */
    public List<String> getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(List<String> floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public ListNatGatewaySnatRulesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListNatGatewaySnatRulesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SNAT规则的描述，长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListNatGatewaySnatRulesRequest withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * SNAT规则的创建时间，格式是yyyy-mm-dd hh:mm:ss.SSSSSS。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListNatGatewaySnatRulesRequest withNatGatewayId(List<String> natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    public ListNatGatewaySnatRulesRequest addNatGatewayIdItem(String natGatewayIdItem) {
        if (this.natGatewayId == null) {
            this.natGatewayId = new ArrayList<>();
        }
        this.natGatewayId.add(natGatewayIdItem);
        return this;
    }

    public ListNatGatewaySnatRulesRequest withNatGatewayId(Consumer<List<String>> natGatewayIdSetter) {
        if (this.natGatewayId == null) {
            this.natGatewayId = new ArrayList<>();
        }
        natGatewayIdSetter.accept(this.natGatewayId);
        return this;
    }

    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public List<String> getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(List<String> natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public ListNatGatewaySnatRulesRequest withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 规则使用的网络id。与cidr参数二选一。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public ListNatGatewaySnatRulesRequest withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 0：VPC侧，可以指定network_id 或者cidr 1：专线侧，只能指定cidr 不输入默认为0（VPC）
     * minimum: 0
     * maximum: 1
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public ListNatGatewaySnatRulesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * SNAT规则的状态。 取值为： \"ACTIVE\": 可用 \"PENDING_CREATE\"：创建中 \"PENDING_UPDATE\"：更新中 \"PENDING_DELETE\"：删除中 \"EIP_FREEZED\"：EIP冻结 \"INACTIVE\"：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListNatGatewaySnatRulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询的起始资源ID，表示从指定资源的下一条记录开始查询。 - 若不传入marker和limit参数，查询结果返回第一页全部资源记录（默认2000条）。 - 若不传入marker参数，limit为10，查询结果返回第1~10条资源记录。 - 若marker为第10条记录的资源ID，limit为10，查询结果返回第11~20条资源记录。 - 若marker为第10条记录的资源ID，不传入limit参数，查询结果返回第11条及之后的资源记录（默认2000条）。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNatGatewaySnatRulesRequest that = (ListNatGatewaySnatRulesRequest) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.floatingIpAddress, that.floatingIpAddress)
            && Objects.equals(this.floatingIpId, that.floatingIpId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.natGatewayId, that.natGatewayId) && Objects.equals(this.networkId, that.networkId)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            cidr,
            limit,
            floatingIpAddress,
            floatingIpId,
            id,
            description,
            createdAt,
            natGatewayId,
            networkId,
            sourceType,
            status,
            marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaySnatRulesRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
