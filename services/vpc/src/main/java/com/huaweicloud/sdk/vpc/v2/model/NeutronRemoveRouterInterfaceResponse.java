package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronRemoveRouterInterfaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    /**
     * 路由器添加的子网对应的ID
     */
    public static final class SubnetIdEnum {

        /**
         * Enum _0_9A_F_8_0_9A_F_4_0_9A_F_4_0_9A_F_4_0_9A_F_12_ for value: "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"
         */
        public static final SubnetIdEnum _0_9A_F_8_0_9A_F_4_0_9A_F_4_0_9A_F_4_0_9A_F_12_ =
            new SubnetIdEnum("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");

        private static final Map<String, SubnetIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubnetIdEnum> createStaticFields() {
            Map<String, SubnetIdEnum> map = new HashMap<>();
            map.put("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}",
                _0_9A_F_8_0_9A_F_4_0_9A_F_4_0_9A_F_4_0_9A_F_12_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubnetIdEnum(String value) {
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
        public static SubnetIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubnetIdEnum(value));
        }

        public static SubnetIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubnetIdEnum) {
                return this.value.equals(((SubnetIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private SubnetIdEnum subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public NeutronRemoveRouterInterfaceResponse withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 路由器添加的端口对应的ID
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public NeutronRemoveRouterInterfaceResponse withSubnetId(SubnetIdEnum subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 路由器添加的子网对应的ID
     * @return subnetId
     */
    public SubnetIdEnum getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(SubnetIdEnum subnetId) {
        this.subnetId = subnetId;
    }

    public NeutronRemoveRouterInterfaceResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronRemoveRouterInterfaceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NeutronRemoveRouterInterfaceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 路由器的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronRemoveRouterInterfaceResponse that = (NeutronRemoveRouterInterfaceResponse) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, subnetId, tenantId, projectId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronRemoveRouterInterfaceResponse {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
