package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建中心网络ER附件的请求体。
 */
public class CreateCentralNetworkErRouteTableAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_id")

    private String enterpriseRouterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_project_id")

    private String enterpriseRouterProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_region_id")

    private String enterpriseRouterRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_plane_id")

    private String centralNetworkPlaneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_table_id")

    private String enterpriseRouterTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_project_id")

    private String attachedErTableProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_region_id")

    private String attachedErTableRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_id")

    private String attachedErId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_id")

    private String attachedErTableId;

    /**
     * - HWCloud (华为云) - Ireland (爱尔兰)
     */
    public static final class HostedCloudEnum {

        /**
         * Enum HWCLOUD for value: "HWCloud"
         */
        public static final HostedCloudEnum HWCLOUD = new HostedCloudEnum("HWCloud");

        /**
         * Enum IRELAND for value: "Ireland"
         */
        public static final HostedCloudEnum IRELAND = new HostedCloudEnum("Ireland");

        private static final Map<String, HostedCloudEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostedCloudEnum> createStaticFields() {
            Map<String, HostedCloudEnum> map = new HashMap<>();
            map.put("HWCloud", HWCLOUD);
            map.put("Ireland", IRELAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostedCloudEnum(String value) {
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
        public static HostedCloudEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostedCloudEnum(value));
        }

        public static HostedCloudEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostedCloudEnum) {
                return this.value.equals(((HostedCloudEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_cloud")

    private HostedCloudEnum hostedCloud;

    public CreateCentralNetworkErRouteTableAttachment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCentralNetworkErRouteTableAttachment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCentralNetworkErRouteTableAttachment withEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
        return this;
    }

    /**
     * 企业路由器的ID。
     * @return enterpriseRouterId
     */
    public String getEnterpriseRouterId() {
        return enterpriseRouterId;
    }

    public void setEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
    }

    public CreateCentralNetworkErRouteTableAttachment withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
        return this;
    }

    /**
     * 企业路由器的项目ID。
     * @return enterpriseRouterProjectId
     */
    public String getEnterpriseRouterProjectId() {
        return enterpriseRouterProjectId;
    }

    public void setEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
    }

    public CreateCentralNetworkErRouteTableAttachment withEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
        return this;
    }

    /**
     * ER路由器的regionID。
     * @return enterpriseRouterRegionId
     */
    public String getEnterpriseRouterRegionId() {
        return enterpriseRouterRegionId;
    }

    public void setEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
    }

    public CreateCentralNetworkErRouteTableAttachment withCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
        return this;
    }

    /**
     * 中心网络平面ID。
     * @return centralNetworkPlaneId
     */
    public String getCentralNetworkPlaneId() {
        return centralNetworkPlaneId;
    }

    public void setCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
    }

    public CreateCentralNetworkErRouteTableAttachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 中心网络附件对端实例的连接ID，企业路由器的连接ID或者GDGW的连接ID。
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public CreateCentralNetworkErRouteTableAttachment withEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
        return this;
    }

    /**
     * 企业路由器的路由表ID。
     * @return enterpriseRouterTableId
     */
    public String getEnterpriseRouterTableId() {
        return enterpriseRouterTableId;
    }

    public void setEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
    }

    public CreateCentralNetworkErRouteTableAttachment withAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
        return this;
    }

    /**
     * 被挂载的企业路由器的项目ID。
     * @return attachedErTableProjectId
     */
    public String getAttachedErTableProjectId() {
        return attachedErTableProjectId;
    }

    public void setAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
    }

    public CreateCentralNetworkErRouteTableAttachment withAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
        return this;
    }

    /**
     * ER路由器的regionID。
     * @return attachedErTableRegionId
     */
    public String getAttachedErTableRegionId() {
        return attachedErTableRegionId;
    }

    public void setAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
    }

    public CreateCentralNetworkErRouteTableAttachment withAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
        return this;
    }

    /**
     * 被挂载的企业路由器ID。
     * @return attachedErId
     */
    public String getAttachedErId() {
        return attachedErId;
    }

    public void setAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
    }

    public CreateCentralNetworkErRouteTableAttachment withAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
        return this;
    }

    /**
     * 被挂载的企业路由器的路由表ID。
     * @return attachedErTableId
     */
    public String getAttachedErTableId() {
        return attachedErTableId;
    }

    public void setAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
    }

    public CreateCentralNetworkErRouteTableAttachment withHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
        return this;
    }

    /**
     * - HWCloud (华为云) - Ireland (爱尔兰)
     * @return hostedCloud
     */
    public HostedCloudEnum getHostedCloud() {
        return hostedCloud;
    }

    public void setHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCentralNetworkErRouteTableAttachment that = (CreateCentralNetworkErRouteTableAttachment) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.enterpriseRouterProjectId, that.enterpriseRouterProjectId)
            && Objects.equals(this.enterpriseRouterRegionId, that.enterpriseRouterRegionId)
            && Objects.equals(this.centralNetworkPlaneId, that.centralNetworkPlaneId)
            && Objects.equals(this.attachmentId, that.attachmentId)
            && Objects.equals(this.enterpriseRouterTableId, that.enterpriseRouterTableId)
            && Objects.equals(this.attachedErTableProjectId, that.attachedErTableProjectId)
            && Objects.equals(this.attachedErTableRegionId, that.attachedErTableRegionId)
            && Objects.equals(this.attachedErId, that.attachedErId)
            && Objects.equals(this.attachedErTableId, that.attachedErTableId)
            && Objects.equals(this.hostedCloud, that.hostedCloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            enterpriseRouterId,
            enterpriseRouterProjectId,
            enterpriseRouterRegionId,
            centralNetworkPlaneId,
            attachmentId,
            enterpriseRouterTableId,
            attachedErTableProjectId,
            attachedErTableRegionId,
            attachedErId,
            attachedErTableId,
            hostedCloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkErRouteTableAttachment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    enterpriseRouterProjectId: ").append(toIndentedString(enterpriseRouterProjectId)).append("\n");
        sb.append("    enterpriseRouterRegionId: ").append(toIndentedString(enterpriseRouterRegionId)).append("\n");
        sb.append("    centralNetworkPlaneId: ").append(toIndentedString(centralNetworkPlaneId)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    enterpriseRouterTableId: ").append(toIndentedString(enterpriseRouterTableId)).append("\n");
        sb.append("    attachedErTableProjectId: ").append(toIndentedString(attachedErTableProjectId)).append("\n");
        sb.append("    attachedErTableRegionId: ").append(toIndentedString(attachedErTableRegionId)).append("\n");
        sb.append("    attachedErId: ").append(toIndentedString(attachedErId)).append("\n");
        sb.append("    attachedErTableId: ").append(toIndentedString(attachedErTableId)).append("\n");
        sb.append("    hostedCloud: ").append(toIndentedString(hostedCloud)).append("\n");
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
