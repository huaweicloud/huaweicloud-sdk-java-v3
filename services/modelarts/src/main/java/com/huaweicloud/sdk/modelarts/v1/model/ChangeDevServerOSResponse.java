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
public class ChangeDevServerOSResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    /**
     * **参数解释**：计费模式。 **取值范围**： - [COMMON：同时支持包周期和按需](tag:hws,hws_hk) - POST_PAID：按需模式 - [PRE_PAID：包周期](tag:hws,hws_hk)
     */
    public static final class ChargingModeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ChargingModeEnum COMMON = new ChargingModeEnum("COMMON");

        /**
         * Enum POST_PAID for value: "POST_PAID"
         */
        public static final ChargingModeEnum POST_PAID = new ChargingModeEnum("POST_PAID");

        /**
         * Enum PRE_PAID for value: "PRE_PAID"
         */
        public static final ChargingModeEnum PRE_PAID = new ChargingModeEnum("PRE_PAID");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("POST_PAID", POST_PAID);
            map.put("PRE_PAID", PRE_PAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_server")

    private CloudServer cloudServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints_response")

    private List<Endpoints> endpointsResponse = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_name")

    private String keyPairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    /**
     * **参数解释**：实例状态。表示实例的当前运行状态，用于监控实例的生命周期和健康状况。 **取值范围**： - CREATE_FAILED: 创建失败 - CREATING: 创建中 - DELETED: 已删除 - DELETE_FAILED: 删除失败 - DELETING: 删除中 - ERROR: 错误 - RUNNING: 运行中 - STARTING: 启动中 - START_FAILED: 启动失败 - STOPPED: 已停止 - STOPPING: 停止中 - STOP_FAILED: 停止失败 - REBOOTING: 重启中 - REBOOT_FAILED: 重启失败 - CHANGINGOS: 切换操作系统中 - CHANGINGOS_FAILED: 切换操作系统失败 - REINSTALLINGOS: 重装操作系统中 - REINSTALLINGOS_FAILED: 重装操作系统失败
     */
    public static final class StatusEnum {

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");

        /**
         * Enum START_FAILED for value: "START_FAILED"
         */
        public static final StatusEnum START_FAILED = new StatusEnum("START_FAILED");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StatusEnum STOPPING = new StatusEnum("STOPPING");

        /**
         * Enum STOP_FAILED for value: "STOP_FAILED"
         */
        public static final StatusEnum STOP_FAILED = new StatusEnum("STOP_FAILED");

        /**
         * Enum REBOOTING for value: "REBOOTING"
         */
        public static final StatusEnum REBOOTING = new StatusEnum("REBOOTING");

        /**
         * Enum REBOOT_FAILED for value: "REBOOT_FAILED"
         */
        public static final StatusEnum REBOOT_FAILED = new StatusEnum("REBOOT_FAILED");

        /**
         * Enum CHANGINGOS for value: "CHANGINGOS"
         */
        public static final StatusEnum CHANGINGOS = new StatusEnum("CHANGINGOS");

        /**
         * Enum CHANGINGOS_FAILED for value: "CHANGINGOS_FAILED"
         */
        public static final StatusEnum CHANGINGOS_FAILED = new StatusEnum("CHANGINGOS_FAILED");

        /**
         * Enum REINSTALLINGOS for value: "REINSTALLINGOS"
         */
        public static final StatusEnum REINSTALLINGOS = new StatusEnum("REINSTALLINGOS");

        /**
         * Enum REINSTALLINGOS_FAILED for value: "REINSTALLINGOS_FAILED"
         */
        public static final StatusEnum REINSTALLINGOS_FAILED = new StatusEnum("REINSTALLINGOS_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CREATING", CREATING);
            map.put("DELETED", DELETED);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("DELETING", DELETING);
            map.put("ERROR", ERROR);
            map.put("RUNNING", RUNNING);
            map.put("STARTING", STARTING);
            map.put("START_FAILED", START_FAILED);
            map.put("STOPPED", STOPPED);
            map.put("STOPPING", STOPPING);
            map.put("STOP_FAILED", STOP_FAILED);
            map.put("REBOOTING", REBOOTING);
            map.put("REBOOT_FAILED", REBOOT_FAILED);
            map.put("CHANGINGOS", CHANGINGOS);
            map.put("CHANGINGOS_FAILED", CHANGINGOS_FAILED);
            map.put("REINSTALLINGOS", REINSTALLINGOS);
            map.put("REINSTALLINGOS_FAILED", REINSTALLINGOS_FAILED);
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
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointsRes> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<ServerVolume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ServerImageResponse image;

    /**
     * **参数解释**：服务器归属类型。 **取值范围**： - [HPS：超节点服务器](tag:hws,hws_hk) - [SPOD：整柜服务器](tag:hws,hws_hk) - [SERVER：单台服务器](tag:hws,hws_hk)
     */
    public static final class CategoryEnum {

        /**
         * Enum SPOD for value: "SPOD"
         */
        public static final CategoryEnum SPOD = new CategoryEnum("SPOD");

        /**
         * Enum SERVER for value: "SERVER"
         */
        public static final CategoryEnum SERVER = new CategoryEnum("SERVER");

        /**
         * Enum HPS for value: "HPS"
         */
        public static final CategoryEnum HPS = new CategoryEnum("HPS");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("SPOD", SPOD);
            map.put("SERVER", SERVER);
            map.put("HPS", HPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_hps")

    private ServerHpsInfo serverHps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ChangeDevServerOSResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **取值范围**：不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ChangeDevServerOSResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：更新时间。 **取值范围**：不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ChangeDevServerOSResponse withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**：计费模式。 **取值范围**： - [COMMON：同时支持包周期和按需](tag:hws,hws_hk) - POST_PAID：按需模式 - [PRE_PAID：包周期](tag:hws,hws_hk)
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ChangeDevServerOSResponse withCloudServer(CloudServer cloudServer) {
        this.cloudServer = cloudServer;
        return this;
    }

    public ChangeDevServerOSResponse withCloudServer(Consumer<CloudServer> cloudServerSetter) {
        if (this.cloudServer == null) {
            this.cloudServer = new CloudServer();
            cloudServerSetter.accept(this.cloudServer);
        }

        return this;
    }

    /**
     * Get cloudServer
     * @return cloudServer
     */
    public CloudServer getCloudServer() {
        return cloudServer;
    }

    public void setCloudServer(CloudServer cloudServer) {
        this.cloudServer = cloudServer;
    }

    public ChangeDevServerOSResponse withEndpointsResponse(List<Endpoints> endpointsResponse) {
        this.endpointsResponse = endpointsResponse;
        return this;
    }

    public ChangeDevServerOSResponse addEndpointsResponseItem(Endpoints endpointsResponseItem) {
        if (this.endpointsResponse == null) {
            this.endpointsResponse = new ArrayList<>();
        }
        this.endpointsResponse.add(endpointsResponseItem);
        return this;
    }

    public ChangeDevServerOSResponse withEndpointsResponse(Consumer<List<Endpoints>> endpointsResponseSetter) {
        if (this.endpointsResponse == null) {
            this.endpointsResponse = new ArrayList<>();
        }
        endpointsResponseSetter.accept(this.endpointsResponse);
        return this;
    }

    /**
     * **参数解释**：实例私有IP信息。
     * @return endpointsResponse
     */
    public List<Endpoints> getEndpointsResponse() {
        return endpointsResponse;
    }

    public void setEndpointsResponse(List<Endpoints> endpointsResponse) {
        this.endpointsResponse = endpointsResponse;
    }

    public ChangeDevServerOSResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：实例规格名称。 **取值范围**：^.{1,128}$。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ChangeDevServerOSResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：实例ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChangeDevServerOSResponse withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * **参数解释**：密钥对名称。 **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。
     * @return keyPairName
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public ChangeDevServerOSResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：实例名称。 **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChangeDevServerOSResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数解释**：订单ID。 **取值范围**：^[a-zA-Z0-9]{1,64}$。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ChangeDevServerOSResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：实例状态。表示实例的当前运行状态，用于监控实例的生命周期和健康状况。 **取值范围**： - CREATE_FAILED: 创建失败 - CREATING: 创建中 - DELETED: 已删除 - DELETE_FAILED: 删除失败 - DELETING: 删除中 - ERROR: 错误 - RUNNING: 运行中 - STARTING: 启动中 - START_FAILED: 启动失败 - STOPPED: 已停止 - STOPPING: 停止中 - STOP_FAILED: 停止失败 - REBOOTING: 重启中 - REBOOT_FAILED: 重启失败 - CHANGINGOS: 切换操作系统中 - CHANGINGOS_FAILED: 切换操作系统失败 - REINSTALLINGOS: 重装操作系统中 - REINSTALLINGOS_FAILED: 重装操作系统失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ChangeDevServerOSResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：实例所在虚拟私有云ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ChangeDevServerOSResponse withEndpoints(List<EndpointsRes> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ChangeDevServerOSResponse addEndpointsItem(EndpointsRes endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ChangeDevServerOSResponse withEndpoints(Consumer<List<EndpointsRes>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**：服务器私有IP信息。
     * @return endpoints
     */
    public List<EndpointsRes> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointsRes> endpoints) {
        this.endpoints = endpoints;
    }

    public ChangeDevServerOSResponse withVolumes(List<ServerVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ChangeDevServerOSResponse addVolumesItem(ServerVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ChangeDevServerOSResponse withVolumes(Consumer<List<ServerVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * **参数解释**：挂载硬盘信息。
     * @return volumes
     */
    public List<ServerVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<ServerVolume> volumes) {
        this.volumes = volumes;
    }

    public ChangeDevServerOSResponse withImage(ServerImageResponse image) {
        this.image = image;
        return this;
    }

    public ChangeDevServerOSResponse withImage(Consumer<ServerImageResponse> imageSetter) {
        if (this.image == null) {
            this.image = new ServerImageResponse();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ServerImageResponse getImage() {
        return image;
    }

    public void setImage(ServerImageResponse image) {
        this.image = image;
    }

    public ChangeDevServerOSResponse withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：服务器归属类型。 **取值范围**： - [HPS：超节点服务器](tag:hws,hws_hk) - [SPOD：整柜服务器](tag:hws,hws_hk) - [SERVER：单台服务器](tag:hws,hws_hk)
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ChangeDevServerOSResponse withServerHps(ServerHpsInfo serverHps) {
        this.serverHps = serverHps;
        return this;
    }

    public ChangeDevServerOSResponse withServerHps(Consumer<ServerHpsInfo> serverHpsSetter) {
        if (this.serverHps == null) {
            this.serverHps = new ServerHpsInfo();
            serverHpsSetter.accept(this.serverHps);
        }

        return this;
    }

    /**
     * Get serverHps
     * @return serverHps
     */
    public ServerHpsInfo getServerHps() {
        return serverHps;
    }

    public void setServerHps(ServerHpsInfo serverHps) {
        this.serverHps = serverHps;
    }

    public ChangeDevServerOSResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**：实例所在子网的ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ChangeDevServerOSResponse withXRequestId(String xRequestId) {
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
        ChangeDevServerOSResponse that = (ChangeDevServerOSResponse) obj;
        return Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.cloudServer, that.cloudServer)
            && Objects.equals(this.endpointsResponse, that.endpointsResponse)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.id, that.id)
            && Objects.equals(this.keyPairName, that.keyPairName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.volumes, that.volumes) && Objects.equals(this.image, that.image)
            && Objects.equals(this.category, that.category) && Objects.equals(this.serverHps, that.serverHps)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt,
            updateAt,
            chargingMode,
            cloudServer,
            endpointsResponse,
            flavor,
            id,
            keyPairName,
            name,
            orderId,
            status,
            vpcId,
            endpoints,
            volumes,
            image,
            category,
            serverHps,
            subnetId,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDevServerOSResponse {\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cloudServer: ").append(toIndentedString(cloudServer)).append("\n");
        sb.append("    endpointsResponse: ").append(toIndentedString(endpointsResponse)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    serverHps: ").append(toIndentedString(serverHps)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
