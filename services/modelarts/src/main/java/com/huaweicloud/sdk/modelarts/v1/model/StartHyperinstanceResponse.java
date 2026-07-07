package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartHyperinstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hps_cluster_id")

    private String hpsClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hps_id")

    private String hpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    /**
     * **参数解释**：超节点实例状态。 **约束限制**：不涉及。  **取值范围**： - PROVISIONING：超节点的创建请求已被接受，但是仍在创建过程中； - ACTIVE：超节点处于活动状态，其资源可被使用； - ERROR：超节点创建失败； - REIMAGING：超节点切换操作系统中； - TERMINATING：资源释放中； - TERMINATED：超节点资源已经被释放，其资源不再可用。 **默认取值**：不涉及。
     */
    public static final class StatusEnum {

        /**
         * Enum PROVISIONING for value: "PROVISIONING"
         */
        public static final StatusEnum PROVISIONING = new StatusEnum("PROVISIONING");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum REIMAGING for value: "REIMAGING"
         */
        public static final StatusEnum REIMAGING = new StatusEnum("REIMAGING");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final StatusEnum TERMINATING = new StatusEnum("TERMINATING");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PROVISIONING", PROVISIONING);
            map.put("ACTIVE", ACTIVE);
            map.put("ERROR", ERROR);
            map.put("REIMAGING", REIMAGING);
            map.put("TERMINATING", TERMINATING);
            map.put("TERMINATED", TERMINATED);
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
    @JsonProperty(value = "servers")

    private List<ServerResponse> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public StartHyperinstanceResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 2147483647
     * maximum: 4102376399000
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public StartHyperinstanceResponse withHpsClusterId(String hpsClusterId) {
        this.hpsClusterId = hpsClusterId;
        return this;
    }

    /**
     * **参数解释**：超节点集群网络ID。 **约束限制**：不涉及。  **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。 **默认取值**：不涉及。
     * @return hpsClusterId
     */
    public String getHpsClusterId() {
        return hpsClusterId;
    }

    public void setHpsClusterId(String hpsClusterId) {
        this.hpsClusterId = hpsClusterId;
    }

    public StartHyperinstanceResponse withHpsId(String hpsId) {
        this.hpsId = hpsId;
        return this;
    }

    /**
     * **参数解释**：超节点ID。 **约束限制**：不涉及。  **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。 **默认取值**：不涉及。
     * @return hpsId
     */
    public String getHpsId() {
        return hpsId;
    }

    public void setHpsId(String hpsId) {
        this.hpsId = hpsId;
    }

    public StartHyperinstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：Lite Server超节点ID。 **约束限制**：不涉及。  **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StartHyperinstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：实例名称。  **约束限制**：不涉及。  **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StartHyperinstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数解释**：订单ID。  **约束限制**：不涉及。  **取值范围**：^[a-zA-Z0-9]{1,64}$。 **默认取值**：不涉及。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public StartHyperinstanceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：超节点实例状态。 **约束限制**：不涉及。  **取值范围**： - PROVISIONING：超节点的创建请求已被接受，但是仍在创建过程中； - ACTIVE：超节点处于活动状态，其资源可被使用； - ERROR：超节点创建失败； - REIMAGING：超节点切换操作系统中； - TERMINATING：资源释放中； - TERMINATED：超节点资源已经被释放，其资源不再可用。 **默认取值**：不涉及。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StartHyperinstanceResponse withServers(List<ServerResponse> servers) {
        this.servers = servers;
        return this;
    }

    public StartHyperinstanceResponse addServersItem(ServerResponse serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public StartHyperinstanceResponse withServers(Consumer<List<ServerResponse>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * **参数解释**：超节点子节点实例列表。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * @return servers
     */
    public List<ServerResponse> getServers() {
        return servers;
    }

    public void setServers(List<ServerResponse> servers) {
        this.servers = servers;
    }

    public StartHyperinstanceResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 2147483647
     * maximum: 4102376399000
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public StartHyperinstanceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartHyperinstanceResponse that = (StartHyperinstanceResponse) obj;
        return Objects.equals(this.createAt, that.createAt) && Objects.equals(this.hpsClusterId, that.hpsClusterId)
            && Objects.equals(this.hpsId, that.hpsId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.servers, that.servers)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt, hpsClusterId, hpsId, id, name, orderId, status, servers, updateAt, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartHyperinstanceResponse {\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    hpsClusterId: ").append(toIndentedString(hpsClusterId)).append("\n");
        sb.append("    hpsId: ").append(toIndentedString(hpsId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
