package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInspectionNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     */
    public static final class InspectionTypeEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final InspectionTypeEnum STANDARD = new InspectionTypeEnum("STANDARD");

        /**
         * Enum DEEP for value: "DEEP"
         */
        public static final InspectionTypeEnum DEEP = new InspectionTypeEnum("DEEP");

        private static final Map<String, InspectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InspectionTypeEnum> createStaticFields() {
            Map<String, InspectionTypeEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("DEEP", DEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InspectionTypeEnum(String value) {
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
        public static InspectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionTypeEnum(value));
        }

        public static InspectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InspectionTypeEnum) {
                return this.value.equals(((InspectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_type")

    private InspectionTypeEnum inspectionType;

    /**
     * **参数解释**：巡检类目。 **约束限制**：不涉及。 **取值范围**：   - HOST_CONFIG_STATUS：主机配置和状态   - NPU_HEALTH_CHECK：NPU健康检查   - NETWORK_STATUS：网络状态   - NPU_PERFORMANCE：NPU性能诊断   - NPU_STRESS_TEST：NPU压测   - NETWORK_STRESS_TEST：网络压测   - HOST_STRESS_TEST：主机压测 **默认取值**：不涉及。 
     */
    public static final class ItemCategoryEnum {

        /**
         * Enum HOST_CONFIG_STATUS for value: "HOST_CONFIG_STATUS"
         */
        public static final ItemCategoryEnum HOST_CONFIG_STATUS = new ItemCategoryEnum("HOST_CONFIG_STATUS");

        /**
         * Enum NPU_HEALTH_CHECK for value: "NPU_HEALTH_CHECK"
         */
        public static final ItemCategoryEnum NPU_HEALTH_CHECK = new ItemCategoryEnum("NPU_HEALTH_CHECK");

        /**
         * Enum NETWORK_STATUS for value: "NETWORK_STATUS"
         */
        public static final ItemCategoryEnum NETWORK_STATUS = new ItemCategoryEnum("NETWORK_STATUS");

        /**
         * Enum NPU_PERFORMANCE for value: "NPU_PERFORMANCE"
         */
        public static final ItemCategoryEnum NPU_PERFORMANCE = new ItemCategoryEnum("NPU_PERFORMANCE");

        /**
         * Enum NPU_STRESS_TEST for value: "NPU_STRESS_TEST"
         */
        public static final ItemCategoryEnum NPU_STRESS_TEST = new ItemCategoryEnum("NPU_STRESS_TEST");

        /**
         * Enum NETWORK_STRESS_TEST for value: "NETWORK_STRESS_TEST"
         */
        public static final ItemCategoryEnum NETWORK_STRESS_TEST = new ItemCategoryEnum("NETWORK_STRESS_TEST");

        /**
         * Enum HOST_STRESS_TES for value: "HOST_STRESS_TES"
         */
        public static final ItemCategoryEnum HOST_STRESS_TES = new ItemCategoryEnum("HOST_STRESS_TES");

        private static final Map<String, ItemCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemCategoryEnum> createStaticFields() {
            Map<String, ItemCategoryEnum> map = new HashMap<>();
            map.put("HOST_CONFIG_STATUS", HOST_CONFIG_STATUS);
            map.put("NPU_HEALTH_CHECK", NPU_HEALTH_CHECK);
            map.put("NETWORK_STATUS", NETWORK_STATUS);
            map.put("NPU_PERFORMANCE", NPU_PERFORMANCE);
            map.put("NPU_STRESS_TEST", NPU_STRESS_TEST);
            map.put("NETWORK_STRESS_TEST", NETWORK_STRESS_TEST);
            map.put("HOST_STRESS_TES", HOST_STRESS_TES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ItemCategoryEnum(String value) {
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
        public static ItemCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ItemCategoryEnum(value));
        }

        public static ItemCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ItemCategoryEnum) {
                return this.value.equals(((ItemCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category")

    private ItemCategoryEnum itemCategory;

    /**
     * **参数解释**：巡检项执行状态。 **约束限制**：不涉及。 **取值范围**：   - WAITING：排队中   - RUNNING：执行中   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     */
    public static final class ExecuteStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final ExecuteStatusEnum WAITING = new ExecuteStatusEnum("WAITING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final ExecuteStatusEnum RUNNING = new ExecuteStatusEnum("RUNNING");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final ExecuteStatusEnum ABNORMAL = new ExecuteStatusEnum("ABNORMAL");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ExecuteStatusEnum NORMAL = new ExecuteStatusEnum("NORMAL");

        private static final Map<String, ExecuteStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecuteStatusEnum> createStaticFields() {
            Map<String, ExecuteStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("RUNNING", RUNNING);
            map.put("ABNORMAL", ABNORMAL);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecuteStatusEnum(String value) {
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
        public static ExecuteStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExecuteStatusEnum(value));
        }

        public static ExecuteStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecuteStatusEnum) {
                return this.value.equals(((ExecuteStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private ExecuteStatusEnum executeStatus;

    /**
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     */
    public static final class ResultStatusEnum {

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final ResultStatusEnum ABNORMAL = new ResultStatusEnum("ABNORMAL");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ResultStatusEnum NORMAL = new ResultStatusEnum("NORMAL");

        private static final Map<String, ResultStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultStatusEnum> createStaticFields() {
            Map<String, ResultStatusEnum> map = new HashMap<>();
            map.put("ABNORMAL", ABNORMAL);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultStatusEnum(String value) {
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
        public static ResultStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultStatusEnum(value));
        }

        public static ResultStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultStatusEnum) {
                return this.value.equals(((ResultStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatusEnum resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    /**
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多机HCCL参数面通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE网络带宽测试   - HYPER_PLANE 多机HCCL超平面通信带宽测试   - CONTAINER_TYPE_VERSION Container类型和版本   - DATA_DISK_PARTITION_TYPE 数据盘分区类型   - LOCAL_DISK_USAGE 本地磁盘利用率   - NPU_PROC_RESIDUAL NPU残留进程   - MAIN_NETWORK_CARD_MTU 主网卡MTU值   - ROCE_NETWORK_CARD_MTU ROCE网卡MTU值   - NPU_RESERVED_PORT NPU预留端口   - ENABLE_PFC_PRIORITY_QUEUE 使能PFC优先队列配置   - PFC_WATERLINE PFC水线   - SFS_CLIENT_OS_BUFFER_SIZE SFS客户端缓存大小   - NPU_PCIE NPU pcie建链信息   - NPU_LINK NPU参数面网卡link状态   - NPU_NET_HEALTH NPU网络健康   - NPU_LINK_STAT NPU光模块闪断   - NPU_WARN NPU warning告警   - NPU_VRAM_RESIDUAL NPU显存残留   - NPU_TLS TLS开关   - NPU_HCCS_HEALTH NPU hccs健康状态   - NPU_OPTICAL NPU收发光功率   - NPU_MEDIA_SNR NPU光模块Media SNR   - NPU_HOST_SNR NPU光模块Host SNR   - NPU_SERDES NPU serdes   - PORT_DOWNGRADE 端口降 Lane   - HBM_DOUBLE_BIT_ERROR 多比特 ECC   - NPU_CDR_SNR cdrSNR 
     */
    public static final class ItemTypeEnum {

        /**
         * Enum OS_CPU_USAGE for value: "OS_CPU_USAGE"
         */
        public static final ItemTypeEnum OS_CPU_USAGE = new ItemTypeEnum("OS_CPU_USAGE");

        /**
         * Enum OS_MEMORY_USED for value: "OS_MEMORY_USED"
         */
        public static final ItemTypeEnum OS_MEMORY_USED = new ItemTypeEnum("OS_MEMORY_USED");

        /**
         * Enum OS_IOSTAT_USED for value: "OS_IOSTAT_USED"
         */
        public static final ItemTypeEnum OS_IOSTAT_USED = new ItemTypeEnum("OS_IOSTAT_USED");

        /**
         * Enum OS_PROCESS_INFO for value: "OS_PROCESS_INFO"
         */
        public static final ItemTypeEnum OS_PROCESS_INFO = new ItemTypeEnum("OS_PROCESS_INFO");

        /**
         * Enum OS_DISK_USAGE for value: "OS_DISK_USAGE"
         */
        public static final ItemTypeEnum OS_DISK_USAGE = new ItemTypeEnum("OS_DISK_USAGE");

        /**
         * Enum OS_VERSION for value: "OS_VERSION"
         */
        public static final ItemTypeEnum OS_VERSION = new ItemTypeEnum("OS_VERSION");

        /**
         * Enum OS_HUGE_PAGE for value: "OS_HUGE_PAGE"
         */
        public static final ItemTypeEnum OS_HUGE_PAGE = new ItemTypeEnum("OS_HUGE_PAGE");

        /**
         * Enum OS_NVIDIA_DRIVER_VERSION for value: "OS_NVIDIA_DRIVER_VERSION"
         */
        public static final ItemTypeEnum OS_NVIDIA_DRIVER_VERSION = new ItemTypeEnum("OS_NVIDIA_DRIVER_VERSION");

        /**
         * Enum OS_GPU_MODEL for value: "OS_GPU_MODEL"
         */
        public static final ItemTypeEnum OS_GPU_MODEL = new ItemTypeEnum("OS_GPU_MODEL");

        /**
         * Enum OS_VRAM_TOTAL_MIB for value: "OS_VRAM_TOTAL_MIB"
         */
        public static final ItemTypeEnum OS_VRAM_TOTAL_MIB = new ItemTypeEnum("OS_VRAM_TOTAL_MIB");

        /**
         * Enum OS_CUDA_VERSION for value: "OS_CUDA_VERSION"
         */
        public static final ItemTypeEnum OS_CUDA_VERSION = new ItemTypeEnum("OS_CUDA_VERSION");

        /**
         * Enum OS_CUDA_TOOLKIT_VERSION for value: "OS_CUDA_TOOLKIT_VERSION"
         */
        public static final ItemTypeEnum OS_CUDA_TOOLKIT_VERSION = new ItemTypeEnum("OS_CUDA_TOOLKIT_VERSION");

        /**
         * Enum OS_DOCKER_VERSION for value: "OS_DOCKER_VERSION"
         */
        public static final ItemTypeEnum OS_DOCKER_VERSION = new ItemTypeEnum("OS_DOCKER_VERSION");

        /**
         * Enum OS_DOCKER_STORAGE_DRIVER for value: "OS_DOCKER_STORAGE_DRIVER"
         */
        public static final ItemTypeEnum OS_DOCKER_STORAGE_DRIVER = new ItemTypeEnum("OS_DOCKER_STORAGE_DRIVER");

        /**
         * Enum OS_DOCKER_BACKING_FILESYSTEM for value: "OS_DOCKER_BACKING_FILESYSTEM"
         */
        public static final ItemTypeEnum OS_DOCKER_BACKING_FILESYSTEM =
            new ItemTypeEnum("OS_DOCKER_BACKING_FILESYSTEM");

        /**
         * Enum OS_CONTAINERD_VERSION for value: "OS_CONTAINERD_VERSION"
         */
        public static final ItemTypeEnum OS_CONTAINERD_VERSION = new ItemTypeEnum("OS_CONTAINERD_VERSION");

        /**
         * Enum OS_CPU_ARCHITECTURE for value: "OS_CPU_ARCHITECTURE"
         */
        public static final ItemTypeEnum OS_CPU_ARCHITECTURE = new ItemTypeEnum("OS_CPU_ARCHITECTURE");

        /**
         * Enum OS_CPU_PROCESSORS for value: "OS_CPU_PROCESSORS"
         */
        public static final ItemTypeEnum OS_CPU_PROCESSORS = new ItemTypeEnum("OS_CPU_PROCESSORS");

        /**
         * Enum OS_KERNEL_WATCHDOG_THRESH for value: "OS_KERNEL_WATCHDOG_THRESH"
         */
        public static final ItemTypeEnum OS_KERNEL_WATCHDOG_THRESH = new ItemTypeEnum("OS_KERNEL_WATCHDOG_THRESH");

        /**
         * Enum OS_MEMORY_DEVICES for value: "OS_MEMORY_DEVICES"
         */
        public static final ItemTypeEnum OS_MEMORY_DEVICES = new ItemTypeEnum("OS_MEMORY_DEVICES");

        /**
         * Enum OS_MEMORY_TOTAL_KB for value: "OS_MEMORY_TOTAL_KB"
         */
        public static final ItemTypeEnum OS_MEMORY_TOTAL_KB = new ItemTypeEnum("OS_MEMORY_TOTAL_KB");

        /**
         * Enum OS_MEMORY_AVAILABLE_KB for value: "OS_MEMORY_AVAILABLE_KB"
         */
        public static final ItemTypeEnum OS_MEMORY_AVAILABLE_KB = new ItemTypeEnum("OS_MEMORY_AVAILABLE_KB");

        /**
         * Enum OS_ANON_HUGE_PAGE_KB for value: "OS_ANON_HUGE_PAGE_KB"
         */
        public static final ItemTypeEnum OS_ANON_HUGE_PAGE_KB = new ItemTypeEnum("OS_ANON_HUGE_PAGE_KB");

        /**
         * Enum OS_NET_CORE_SOMAXCONN for value: "OS_NET_CORE_SOMAXCONN"
         */
        public static final ItemTypeEnum OS_NET_CORE_SOMAXCONN = new ItemTypeEnum("OS_NET_CORE_SOMAXCONN");

        /**
         * Enum OS_DUMMY_NET_CARDS for value: "OS_DUMMY_NET_CARDS"
         */
        public static final ItemTypeEnum OS_DUMMY_NET_CARDS = new ItemTypeEnum("OS_DUMMY_NET_CARDS");

        /**
         * Enum NPU_VERSION for value: "NPU_VERSION"
         */
        public static final ItemTypeEnum NPU_VERSION = new ItemTypeEnum("NPU_VERSION");

        /**
         * Enum NPU_CORE_USAGE for value: "NPU_CORE_USAGE"
         */
        public static final ItemTypeEnum NPU_CORE_USAGE = new ItemTypeEnum("NPU_CORE_USAGE");

        /**
         * Enum NPU_PROC for value: "NPU_PROC"
         */
        public static final ItemTypeEnum NPU_PROC = new ItemTypeEnum("NPU_PROC");

        /**
         * Enum NPU_HEALTH for value: "NPU_HEALTH"
         */
        public static final ItemTypeEnum NPU_HEALTH = new ItemTypeEnum("NPU_HEALTH");

        /**
         * Enum NPU_COMPATIBILITY for value: "NPU_COMPATIBILITY"
         */
        public static final ItemTypeEnum NPU_COMPATIBILITY = new ItemTypeEnum("NPU_COMPATIBILITY");

        /**
         * Enum ASCEND_DMI_CANN for value: "ASCEND_DMI_CANN"
         */
        public static final ItemTypeEnum ASCEND_DMI_CANN = new ItemTypeEnum("ASCEND_DMI_CANN");

        /**
         * Enum ASCEND_DMI_DRIVER for value: "ASCEND_DMI_DRIVER"
         */
        public static final ItemTypeEnum ASCEND_DMI_DRIVER = new ItemTypeEnum("ASCEND_DMI_DRIVER");

        /**
         * Enum ASCEND_DMI_NETWORK for value: "ASCEND_DMI_NETWORK"
         */
        public static final ItemTypeEnum ASCEND_DMI_NETWORK = new ItemTypeEnum("ASCEND_DMI_NETWORK");

        /**
         * Enum ASCEND_DMI_HBM for value: "ASCEND_DMI_HBM"
         */
        public static final ItemTypeEnum ASCEND_DMI_HBM = new ItemTypeEnum("ASCEND_DMI_HBM");

        /**
         * Enum ASCEND_DMI_SIGNAL_QUALITY for value: "ASCEND_DMI_SIGNAL_QUALITY"
         */
        public static final ItemTypeEnum ASCEND_DMI_SIGNAL_QUALITY = new ItemTypeEnum("ASCEND_DMI_SIGNAL_QUALITY");

        /**
         * Enum UDP_PORT for value: "UDP_PORT"
         */
        public static final ItemTypeEnum UDP_PORT = new ItemTypeEnum("UDP_PORT");

        /**
         * Enum DEEP_BAND_WIDTH for value: "DEEP_BAND_WIDTH"
         */
        public static final ItemTypeEnum DEEP_BAND_WIDTH = new ItemTypeEnum("DEEP_BAND_WIDTH");

        /**
         * Enum DEEP_AI_FLOPS for value: "DEEP_AI_FLOPS"
         */
        public static final ItemTypeEnum DEEP_AI_FLOPS = new ItemTypeEnum("DEEP_AI_FLOPS");

        /**
         * Enum DEEP_EYE_DIAGRAM for value: "DEEP_EYE_DIAGRAM"
         */
        public static final ItemTypeEnum DEEP_EYE_DIAGRAM = new ItemTypeEnum("DEEP_EYE_DIAGRAM");

        /**
         * Enum DEEP_AI_CORE for value: "DEEP_AI_CORE"
         */
        public static final ItemTypeEnum DEEP_AI_CORE = new ItemTypeEnum("DEEP_AI_CORE");

        /**
         * Enum DEEP_HBM for value: "DEEP_HBM"
         */
        public static final ItemTypeEnum DEEP_HBM = new ItemTypeEnum("DEEP_HBM");

        /**
         * Enum DEEP_P2P for value: "DEEP_P2P"
         */
        public static final ItemTypeEnum DEEP_P2P = new ItemTypeEnum("DEEP_P2P");

        /**
         * Enum DEEP_SINGLE_HCCL for value: "DEEP_SINGLE_HCCL"
         */
        public static final ItemTypeEnum DEEP_SINGLE_HCCL = new ItemTypeEnum("DEEP_SINGLE_HCCL");

        /**
         * Enum DEEP_MULTI_HCCL for value: "DEEP_MULTI_HCCL"
         */
        public static final ItemTypeEnum DEEP_MULTI_HCCL = new ItemTypeEnum("DEEP_MULTI_HCCL");

        /**
         * Enum NPU_MODEL for value: "NPU_MODEL"
         */
        public static final ItemTypeEnum NPU_MODEL = new ItemTypeEnum("NPU_MODEL");

        /**
         * Enum NPU_FIRMWARE for value: "NPU_FIRMWARE"
         */
        public static final ItemTypeEnum NPU_FIRMWARE = new ItemTypeEnum("NPU_FIRMWARE");

        /**
         * Enum NPU_MCU for value: "NPU_MCU"
         */
        public static final ItemTypeEnum NPU_MCU = new ItemTypeEnum("NPU_MCU");

        /**
         * Enum NPU_VRD for value: "NPU_VRD"
         */
        public static final ItemTypeEnum NPU_VRD = new ItemTypeEnum("NPU_VRD");

        /**
         * Enum ROCE_TEST for value: "ROCE_TEST"
         */
        public static final ItemTypeEnum ROCE_TEST = new ItemTypeEnum("ROCE_TEST");

        /**
         * Enum HYPER_PLANE for value: "HYPER_PLANE"
         */
        public static final ItemTypeEnum HYPER_PLANE = new ItemTypeEnum("HYPER_PLANE");

        /**
         * Enum CONTAINER_TYPE_VERSION for value: "CONTAINER_TYPE_VERSION"
         */
        public static final ItemTypeEnum CONTAINER_TYPE_VERSION = new ItemTypeEnum("CONTAINER_TYPE_VERSION");

        /**
         * Enum DATA_DISK_PARTITION_TYPE for value: "DATA_DISK_PARTITION_TYPE"
         */
        public static final ItemTypeEnum DATA_DISK_PARTITION_TYPE = new ItemTypeEnum("DATA_DISK_PARTITION_TYPE");

        /**
         * Enum LOCAL_DISK_USAGE for value: "LOCAL_DISK_USAGE"
         */
        public static final ItemTypeEnum LOCAL_DISK_USAGE = new ItemTypeEnum("LOCAL_DISK_USAGE");

        /**
         * Enum NPU_PROC_RESIDUAL for value: "NPU_PROC_RESIDUAL"
         */
        public static final ItemTypeEnum NPU_PROC_RESIDUAL = new ItemTypeEnum("NPU_PROC_RESIDUAL");

        /**
         * Enum MAIN_NETWORK_CARD_MTU for value: "MAIN_NETWORK_CARD_MTU"
         */
        public static final ItemTypeEnum MAIN_NETWORK_CARD_MTU = new ItemTypeEnum("MAIN_NETWORK_CARD_MTU");

        /**
         * Enum ROCE_NETWORK_CARD_MTU for value: "ROCE_NETWORK_CARD_MTU"
         */
        public static final ItemTypeEnum ROCE_NETWORK_CARD_MTU = new ItemTypeEnum("ROCE_NETWORK_CARD_MTU");

        /**
         * Enum NPU_RESERVED_PORT for value: "NPU_RESERVED_PORT"
         */
        public static final ItemTypeEnum NPU_RESERVED_PORT = new ItemTypeEnum("NPU_RESERVED_PORT");

        /**
         * Enum ENABLE_PFC_PRIORITY_QUEUE for value: "ENABLE_PFC_PRIORITY_QUEUE"
         */
        public static final ItemTypeEnum ENABLE_PFC_PRIORITY_QUEUE = new ItemTypeEnum("ENABLE_PFC_PRIORITY_QUEUE");

        /**
         * Enum PFC_WATERLINE for value: "PFC_WATERLINE"
         */
        public static final ItemTypeEnum PFC_WATERLINE = new ItemTypeEnum("PFC_WATERLINE");

        /**
         * Enum SFS_CLIENT_OS_BUFFER_SIZE for value: "SFS_CLIENT_OS_BUFFER_SIZE"
         */
        public static final ItemTypeEnum SFS_CLIENT_OS_BUFFER_SIZE = new ItemTypeEnum("SFS_CLIENT_OS_BUFFER_SIZE");

        /**
         * Enum NPU_PCIE for value: "NPU_PCIE"
         */
        public static final ItemTypeEnum NPU_PCIE = new ItemTypeEnum("NPU_PCIE");

        /**
         * Enum NPU_LINK for value: "NPU_LINK"
         */
        public static final ItemTypeEnum NPU_LINK = new ItemTypeEnum("NPU_LINK");

        /**
         * Enum NPU_NET_HEALTH for value: "NPU_NET_HEALTH"
         */
        public static final ItemTypeEnum NPU_NET_HEALTH = new ItemTypeEnum("NPU_NET_HEALTH");

        /**
         * Enum NPU_LINK_STAT for value: "NPU_LINK_STAT"
         */
        public static final ItemTypeEnum NPU_LINK_STAT = new ItemTypeEnum("NPU_LINK_STAT");

        /**
         * Enum NPU_WARN for value: "NPU_WARN"
         */
        public static final ItemTypeEnum NPU_WARN = new ItemTypeEnum("NPU_WARN");

        /**
         * Enum NPU_VRAM_RESIDUAL for value: "NPU_VRAM_RESIDUAL"
         */
        public static final ItemTypeEnum NPU_VRAM_RESIDUAL = new ItemTypeEnum("NPU_VRAM_RESIDUAL");

        /**
         * Enum NPU_TLS for value: "NPU_TLS"
         */
        public static final ItemTypeEnum NPU_TLS = new ItemTypeEnum("NPU_TLS");

        /**
         * Enum NPU_HCCS_HEALTH for value: "NPU_HCCS_HEALTH"
         */
        public static final ItemTypeEnum NPU_HCCS_HEALTH = new ItemTypeEnum("NPU_HCCS_HEALTH");

        /**
         * Enum NPU_OPTICAL for value: "NPU_OPTICAL"
         */
        public static final ItemTypeEnum NPU_OPTICAL = new ItemTypeEnum("NPU_OPTICAL");

        /**
         * Enum NPU_MEDIA_SNR for value: "NPU_MEDIA_SNR"
         */
        public static final ItemTypeEnum NPU_MEDIA_SNR = new ItemTypeEnum("NPU_MEDIA_SNR");

        /**
         * Enum NPU_HOST_SNR for value: "NPU_HOST_SNR"
         */
        public static final ItemTypeEnum NPU_HOST_SNR = new ItemTypeEnum("NPU_HOST_SNR");

        /**
         * Enum NPU_SERDES for value: "NPU_SERDES"
         */
        public static final ItemTypeEnum NPU_SERDES = new ItemTypeEnum("NPU_SERDES");

        /**
         * Enum PORT_DOWNGRADE for value: "PORT_DOWNGRADE"
         */
        public static final ItemTypeEnum PORT_DOWNGRADE = new ItemTypeEnum("PORT_DOWNGRADE");

        /**
         * Enum HBM_DOUBLE_BIT_ERROR for value: "HBM_DOUBLE_BIT_ERROR"
         */
        public static final ItemTypeEnum HBM_DOUBLE_BIT_ERROR = new ItemTypeEnum("HBM_DOUBLE_BIT_ERROR");

        /**
         * Enum NPU_CDR_SNR for value: "NPU_CDR_SNR"
         */
        public static final ItemTypeEnum NPU_CDR_SNR = new ItemTypeEnum("NPU_CDR_SNR");

        private static final Map<String, ItemTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemTypeEnum> createStaticFields() {
            Map<String, ItemTypeEnum> map = new HashMap<>();
            map.put("OS_CPU_USAGE", OS_CPU_USAGE);
            map.put("OS_MEMORY_USED", OS_MEMORY_USED);
            map.put("OS_IOSTAT_USED", OS_IOSTAT_USED);
            map.put("OS_PROCESS_INFO", OS_PROCESS_INFO);
            map.put("OS_DISK_USAGE", OS_DISK_USAGE);
            map.put("OS_VERSION", OS_VERSION);
            map.put("OS_HUGE_PAGE", OS_HUGE_PAGE);
            map.put("OS_NVIDIA_DRIVER_VERSION", OS_NVIDIA_DRIVER_VERSION);
            map.put("OS_GPU_MODEL", OS_GPU_MODEL);
            map.put("OS_VRAM_TOTAL_MIB", OS_VRAM_TOTAL_MIB);
            map.put("OS_CUDA_VERSION", OS_CUDA_VERSION);
            map.put("OS_CUDA_TOOLKIT_VERSION", OS_CUDA_TOOLKIT_VERSION);
            map.put("OS_DOCKER_VERSION", OS_DOCKER_VERSION);
            map.put("OS_DOCKER_STORAGE_DRIVER", OS_DOCKER_STORAGE_DRIVER);
            map.put("OS_DOCKER_BACKING_FILESYSTEM", OS_DOCKER_BACKING_FILESYSTEM);
            map.put("OS_CONTAINERD_VERSION", OS_CONTAINERD_VERSION);
            map.put("OS_CPU_ARCHITECTURE", OS_CPU_ARCHITECTURE);
            map.put("OS_CPU_PROCESSORS", OS_CPU_PROCESSORS);
            map.put("OS_KERNEL_WATCHDOG_THRESH", OS_KERNEL_WATCHDOG_THRESH);
            map.put("OS_MEMORY_DEVICES", OS_MEMORY_DEVICES);
            map.put("OS_MEMORY_TOTAL_KB", OS_MEMORY_TOTAL_KB);
            map.put("OS_MEMORY_AVAILABLE_KB", OS_MEMORY_AVAILABLE_KB);
            map.put("OS_ANON_HUGE_PAGE_KB", OS_ANON_HUGE_PAGE_KB);
            map.put("OS_NET_CORE_SOMAXCONN", OS_NET_CORE_SOMAXCONN);
            map.put("OS_DUMMY_NET_CARDS", OS_DUMMY_NET_CARDS);
            map.put("NPU_VERSION", NPU_VERSION);
            map.put("NPU_CORE_USAGE", NPU_CORE_USAGE);
            map.put("NPU_PROC", NPU_PROC);
            map.put("NPU_HEALTH", NPU_HEALTH);
            map.put("NPU_COMPATIBILITY", NPU_COMPATIBILITY);
            map.put("ASCEND_DMI_CANN", ASCEND_DMI_CANN);
            map.put("ASCEND_DMI_DRIVER", ASCEND_DMI_DRIVER);
            map.put("ASCEND_DMI_NETWORK", ASCEND_DMI_NETWORK);
            map.put("ASCEND_DMI_HBM", ASCEND_DMI_HBM);
            map.put("ASCEND_DMI_SIGNAL_QUALITY", ASCEND_DMI_SIGNAL_QUALITY);
            map.put("UDP_PORT", UDP_PORT);
            map.put("DEEP_BAND_WIDTH", DEEP_BAND_WIDTH);
            map.put("DEEP_AI_FLOPS", DEEP_AI_FLOPS);
            map.put("DEEP_EYE_DIAGRAM", DEEP_EYE_DIAGRAM);
            map.put("DEEP_AI_CORE", DEEP_AI_CORE);
            map.put("DEEP_HBM", DEEP_HBM);
            map.put("DEEP_P2P", DEEP_P2P);
            map.put("DEEP_SINGLE_HCCL", DEEP_SINGLE_HCCL);
            map.put("DEEP_MULTI_HCCL", DEEP_MULTI_HCCL);
            map.put("NPU_MODEL", NPU_MODEL);
            map.put("NPU_FIRMWARE", NPU_FIRMWARE);
            map.put("NPU_MCU", NPU_MCU);
            map.put("NPU_VRD", NPU_VRD);
            map.put("ROCE_TEST", ROCE_TEST);
            map.put("HYPER_PLANE", HYPER_PLANE);
            map.put("CONTAINER_TYPE_VERSION", CONTAINER_TYPE_VERSION);
            map.put("DATA_DISK_PARTITION_TYPE", DATA_DISK_PARTITION_TYPE);
            map.put("LOCAL_DISK_USAGE", LOCAL_DISK_USAGE);
            map.put("NPU_PROC_RESIDUAL", NPU_PROC_RESIDUAL);
            map.put("MAIN_NETWORK_CARD_MTU", MAIN_NETWORK_CARD_MTU);
            map.put("ROCE_NETWORK_CARD_MTU", ROCE_NETWORK_CARD_MTU);
            map.put("NPU_RESERVED_PORT", NPU_RESERVED_PORT);
            map.put("ENABLE_PFC_PRIORITY_QUEUE", ENABLE_PFC_PRIORITY_QUEUE);
            map.put("PFC_WATERLINE", PFC_WATERLINE);
            map.put("SFS_CLIENT_OS_BUFFER_SIZE", SFS_CLIENT_OS_BUFFER_SIZE);
            map.put("NPU_PCIE", NPU_PCIE);
            map.put("NPU_LINK", NPU_LINK);
            map.put("NPU_NET_HEALTH", NPU_NET_HEALTH);
            map.put("NPU_LINK_STAT", NPU_LINK_STAT);
            map.put("NPU_WARN", NPU_WARN);
            map.put("NPU_VRAM_RESIDUAL", NPU_VRAM_RESIDUAL);
            map.put("NPU_TLS", NPU_TLS);
            map.put("NPU_HCCS_HEALTH", NPU_HCCS_HEALTH);
            map.put("NPU_OPTICAL", NPU_OPTICAL);
            map.put("NPU_MEDIA_SNR", NPU_MEDIA_SNR);
            map.put("NPU_HOST_SNR", NPU_HOST_SNR);
            map.put("NPU_SERDES", NPU_SERDES);
            map.put("PORT_DOWNGRADE", PORT_DOWNGRADE);
            map.put("HBM_DOUBLE_BIT_ERROR", HBM_DOUBLE_BIT_ERROR);
            map.put("NPU_CDR_SNR", NPU_CDR_SNR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ItemTypeEnum(String value) {
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
        public static ItemTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ItemTypeEnum(value));
        }

        public static ItemTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ItemTypeEnum) {
                return this.value.equals(((ItemTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private ItemTypeEnum itemType;

    /**
     * **参数解释**：巡检类目。 **约束限制**：不涉及。 **取值范围**：   - HOST_CONFIG_STATUS：主机配置和状态   - NPU_HEALTH_CHECK：NPU健康检查   - NPU_PERFORMANCE：NPU性能诊断   - NPU_STRESS_TEST：NPU压测   - NETWORK_STRESS_TEST：网络压测 **默认取值**：不涉及。 
     */
    public static final class ItemCategoriesEnum {

        /**
         * Enum HOST_CONFIG_STATUS for value: "HOST_CONFIG_STATUS"
         */
        public static final ItemCategoriesEnum HOST_CONFIG_STATUS = new ItemCategoriesEnum("HOST_CONFIG_STATUS");

        /**
         * Enum NPU_HEALTH_CHECK for value: "NPU_HEALTH_CHECK"
         */
        public static final ItemCategoriesEnum NPU_HEALTH_CHECK = new ItemCategoriesEnum("NPU_HEALTH_CHECK");

        /**
         * Enum NPU_PERFORMANCE for value: "NPU_PERFORMANCE"
         */
        public static final ItemCategoriesEnum NPU_PERFORMANCE = new ItemCategoriesEnum("NPU_PERFORMANCE");

        /**
         * Enum NPU_STRESS_TEST for value: "NPU_STRESS_TEST"
         */
        public static final ItemCategoriesEnum NPU_STRESS_TEST = new ItemCategoriesEnum("NPU_STRESS_TEST");

        /**
         * Enum NETWORK_STRESS_TEST for value: "NETWORK_STRESS_TEST"
         */
        public static final ItemCategoriesEnum NETWORK_STRESS_TEST = new ItemCategoriesEnum("NETWORK_STRESS_TEST");

        private static final Map<String, ItemCategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemCategoriesEnum> createStaticFields() {
            Map<String, ItemCategoriesEnum> map = new HashMap<>();
            map.put("HOST_CONFIG_STATUS", HOST_CONFIG_STATUS);
            map.put("NPU_HEALTH_CHECK", NPU_HEALTH_CHECK);
            map.put("NPU_PERFORMANCE", NPU_PERFORMANCE);
            map.put("NPU_STRESS_TEST", NPU_STRESS_TEST);
            map.put("NETWORK_STRESS_TEST", NETWORK_STRESS_TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ItemCategoriesEnum(String value) {
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
        public static ItemCategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ItemCategoriesEnum(value));
        }

        public static ItemCategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ItemCategoriesEnum) {
                return this.value.equals(((ItemCategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_categories")

    private ItemCategoriesEnum itemCategories;

    /**
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多机HCCL参数面通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE网络带宽测试   - HYPER_PLANE 多机HCCL超平面通信带宽测试   - CONTAINER_TYPE_VERSION Container类型和版本   - DATA_DISK_PARTITION_TYPE 数据盘分区类型   - LOCAL_DISK_USAGE 本地磁盘利用率   - NPU_PROC_RESIDUAL NPU残留进程   - MAIN_NETWORK_CARD_MTU 主网卡MTU值   - ROCE_NETWORK_CARD_MTU ROCE网卡MTU值   - NPU_RESERVED_PORT NPU预留端口   - ENABLE_PFC_PRIORITY_QUEUE 使能PFC优先队列配置   - PFC_WATERLINE PFC水线   - SFS_CLIENT_OS_BUFFER_SIZE SFS客户端缓存大小   - NPU_PCIE NPU pcie建链信息   - NPU_LINK NPU参数面网卡link状态   - NPU_NET_HEALTH NPU网络健康   - NPU_LINK_STAT NPU光模块闪断   - NPU_WARN NPU warning告警   - NPU_VRAM_RESIDUAL NPU显存残留   - NPU_TLS TLS开关   - NPU_HCCS_HEALTH NPU hccs健康状态   - NPU_OPTICAL NPU收发光功率   - NPU_MEDIA_SNR NPU光模块Media SNR   - NPU_HOST_SNR NPU光模块Host SNR   - NPU_SERDES NPU serdes   - PORT_DOWNGRADE 端口降 Lane   - HBM_DOUBLE_BIT_ERROR 多比特 ECC   - NPU_CDR_SNR cdrSNR 
     */
    public static final class ItemTypesEnum {

        /**
         * Enum OS_CPU_USAGE for value: "OS_CPU_USAGE"
         */
        public static final ItemTypesEnum OS_CPU_USAGE = new ItemTypesEnum("OS_CPU_USAGE");

        /**
         * Enum OS_MEMORY_USED for value: "OS_MEMORY_USED"
         */
        public static final ItemTypesEnum OS_MEMORY_USED = new ItemTypesEnum("OS_MEMORY_USED");

        /**
         * Enum OS_IOSTAT_USED for value: "OS_IOSTAT_USED"
         */
        public static final ItemTypesEnum OS_IOSTAT_USED = new ItemTypesEnum("OS_IOSTAT_USED");

        /**
         * Enum OS_PROCESS_INFO for value: "OS_PROCESS_INFO"
         */
        public static final ItemTypesEnum OS_PROCESS_INFO = new ItemTypesEnum("OS_PROCESS_INFO");

        /**
         * Enum OS_DISK_USAGE for value: "OS_DISK_USAGE"
         */
        public static final ItemTypesEnum OS_DISK_USAGE = new ItemTypesEnum("OS_DISK_USAGE");

        /**
         * Enum OS_VERSION for value: "OS_VERSION"
         */
        public static final ItemTypesEnum OS_VERSION = new ItemTypesEnum("OS_VERSION");

        /**
         * Enum OS_HUGE_PAGE for value: "OS_HUGE_PAGE"
         */
        public static final ItemTypesEnum OS_HUGE_PAGE = new ItemTypesEnum("OS_HUGE_PAGE");

        /**
         * Enum OS_NVIDIA_DRIVER_VERSION for value: "OS_NVIDIA_DRIVER_VERSION"
         */
        public static final ItemTypesEnum OS_NVIDIA_DRIVER_VERSION = new ItemTypesEnum("OS_NVIDIA_DRIVER_VERSION");

        /**
         * Enum OS_GPU_MODEL for value: "OS_GPU_MODEL"
         */
        public static final ItemTypesEnum OS_GPU_MODEL = new ItemTypesEnum("OS_GPU_MODEL");

        /**
         * Enum OS_VRAM_TOTAL_MIB for value: "OS_VRAM_TOTAL_MIB"
         */
        public static final ItemTypesEnum OS_VRAM_TOTAL_MIB = new ItemTypesEnum("OS_VRAM_TOTAL_MIB");

        /**
         * Enum OS_CUDA_VERSION for value: "OS_CUDA_VERSION"
         */
        public static final ItemTypesEnum OS_CUDA_VERSION = new ItemTypesEnum("OS_CUDA_VERSION");

        /**
         * Enum OS_CUDA_TOOLKIT_VERSION for value: "OS_CUDA_TOOLKIT_VERSION"
         */
        public static final ItemTypesEnum OS_CUDA_TOOLKIT_VERSION = new ItemTypesEnum("OS_CUDA_TOOLKIT_VERSION");

        /**
         * Enum OS_DOCKER_VERSION for value: "OS_DOCKER_VERSION"
         */
        public static final ItemTypesEnum OS_DOCKER_VERSION = new ItemTypesEnum("OS_DOCKER_VERSION");

        /**
         * Enum OS_DOCKER_STORAGE_DRIVER for value: "OS_DOCKER_STORAGE_DRIVER"
         */
        public static final ItemTypesEnum OS_DOCKER_STORAGE_DRIVER = new ItemTypesEnum("OS_DOCKER_STORAGE_DRIVER");

        /**
         * Enum OS_DOCKER_BACKING_FILESYSTEM for value: "OS_DOCKER_BACKING_FILESYSTEM"
         */
        public static final ItemTypesEnum OS_DOCKER_BACKING_FILESYSTEM =
            new ItemTypesEnum("OS_DOCKER_BACKING_FILESYSTEM");

        /**
         * Enum OS_CONTAINERD_VERSION for value: "OS_CONTAINERD_VERSION"
         */
        public static final ItemTypesEnum OS_CONTAINERD_VERSION = new ItemTypesEnum("OS_CONTAINERD_VERSION");

        /**
         * Enum OS_CPU_ARCHITECTURE for value: "OS_CPU_ARCHITECTURE"
         */
        public static final ItemTypesEnum OS_CPU_ARCHITECTURE = new ItemTypesEnum("OS_CPU_ARCHITECTURE");

        /**
         * Enum OS_CPU_PROCESSORS for value: "OS_CPU_PROCESSORS"
         */
        public static final ItemTypesEnum OS_CPU_PROCESSORS = new ItemTypesEnum("OS_CPU_PROCESSORS");

        /**
         * Enum OS_KERNEL_WATCHDOG_THRESH for value: "OS_KERNEL_WATCHDOG_THRESH"
         */
        public static final ItemTypesEnum OS_KERNEL_WATCHDOG_THRESH = new ItemTypesEnum("OS_KERNEL_WATCHDOG_THRESH");

        /**
         * Enum OS_MEMORY_DEVICES for value: "OS_MEMORY_DEVICES"
         */
        public static final ItemTypesEnum OS_MEMORY_DEVICES = new ItemTypesEnum("OS_MEMORY_DEVICES");

        /**
         * Enum OS_MEMORY_TOTAL_KB for value: "OS_MEMORY_TOTAL_KB"
         */
        public static final ItemTypesEnum OS_MEMORY_TOTAL_KB = new ItemTypesEnum("OS_MEMORY_TOTAL_KB");

        /**
         * Enum OS_MEMORY_AVAILABLE_KB for value: "OS_MEMORY_AVAILABLE_KB"
         */
        public static final ItemTypesEnum OS_MEMORY_AVAILABLE_KB = new ItemTypesEnum("OS_MEMORY_AVAILABLE_KB");

        /**
         * Enum OS_ANON_HUGE_PAGE_KB for value: "OS_ANON_HUGE_PAGE_KB"
         */
        public static final ItemTypesEnum OS_ANON_HUGE_PAGE_KB = new ItemTypesEnum("OS_ANON_HUGE_PAGE_KB");

        /**
         * Enum OS_NET_CORE_SOMAXCONN for value: "OS_NET_CORE_SOMAXCONN"
         */
        public static final ItemTypesEnum OS_NET_CORE_SOMAXCONN = new ItemTypesEnum("OS_NET_CORE_SOMAXCONN");

        /**
         * Enum OS_DUMMY_NET_CARDS for value: "OS_DUMMY_NET_CARDS"
         */
        public static final ItemTypesEnum OS_DUMMY_NET_CARDS = new ItemTypesEnum("OS_DUMMY_NET_CARDS");

        /**
         * Enum NPU_VERSION for value: "NPU_VERSION"
         */
        public static final ItemTypesEnum NPU_VERSION = new ItemTypesEnum("NPU_VERSION");

        /**
         * Enum NPU_CORE_USAGE for value: "NPU_CORE_USAGE"
         */
        public static final ItemTypesEnum NPU_CORE_USAGE = new ItemTypesEnum("NPU_CORE_USAGE");

        /**
         * Enum NPU_PROC for value: "NPU_PROC"
         */
        public static final ItemTypesEnum NPU_PROC = new ItemTypesEnum("NPU_PROC");

        /**
         * Enum NPU_HEALTH for value: "NPU_HEALTH"
         */
        public static final ItemTypesEnum NPU_HEALTH = new ItemTypesEnum("NPU_HEALTH");

        /**
         * Enum NPU_COMPATIBILITY for value: "NPU_COMPATIBILITY"
         */
        public static final ItemTypesEnum NPU_COMPATIBILITY = new ItemTypesEnum("NPU_COMPATIBILITY");

        /**
         * Enum ASCEND_DMI_CANN for value: "ASCEND_DMI_CANN"
         */
        public static final ItemTypesEnum ASCEND_DMI_CANN = new ItemTypesEnum("ASCEND_DMI_CANN");

        /**
         * Enum ASCEND_DMI_DRIVER for value: "ASCEND_DMI_DRIVER"
         */
        public static final ItemTypesEnum ASCEND_DMI_DRIVER = new ItemTypesEnum("ASCEND_DMI_DRIVER");

        /**
         * Enum ASCEND_DMI_NETWORK for value: "ASCEND_DMI_NETWORK"
         */
        public static final ItemTypesEnum ASCEND_DMI_NETWORK = new ItemTypesEnum("ASCEND_DMI_NETWORK");

        /**
         * Enum ASCEND_DMI_HBM for value: "ASCEND_DMI_HBM"
         */
        public static final ItemTypesEnum ASCEND_DMI_HBM = new ItemTypesEnum("ASCEND_DMI_HBM");

        /**
         * Enum ASCEND_DMI_SIGNAL_QUALITY for value: "ASCEND_DMI_SIGNAL_QUALITY"
         */
        public static final ItemTypesEnum ASCEND_DMI_SIGNAL_QUALITY = new ItemTypesEnum("ASCEND_DMI_SIGNAL_QUALITY");

        /**
         * Enum UDP_PORT for value: "UDP_PORT"
         */
        public static final ItemTypesEnum UDP_PORT = new ItemTypesEnum("UDP_PORT");

        /**
         * Enum DEEP_BAND_WIDTH for value: "DEEP_BAND_WIDTH"
         */
        public static final ItemTypesEnum DEEP_BAND_WIDTH = new ItemTypesEnum("DEEP_BAND_WIDTH");

        /**
         * Enum DEEP_AI_FLOPS for value: "DEEP_AI_FLOPS"
         */
        public static final ItemTypesEnum DEEP_AI_FLOPS = new ItemTypesEnum("DEEP_AI_FLOPS");

        /**
         * Enum DEEP_EYE_DIAGRAM for value: "DEEP_EYE_DIAGRAM"
         */
        public static final ItemTypesEnum DEEP_EYE_DIAGRAM = new ItemTypesEnum("DEEP_EYE_DIAGRAM");

        /**
         * Enum DEEP_AI_CORE for value: "DEEP_AI_CORE"
         */
        public static final ItemTypesEnum DEEP_AI_CORE = new ItemTypesEnum("DEEP_AI_CORE");

        /**
         * Enum DEEP_HBM for value: "DEEP_HBM"
         */
        public static final ItemTypesEnum DEEP_HBM = new ItemTypesEnum("DEEP_HBM");

        /**
         * Enum DEEP_P2P for value: "DEEP_P2P"
         */
        public static final ItemTypesEnum DEEP_P2P = new ItemTypesEnum("DEEP_P2P");

        /**
         * Enum DEEP_SINGLE_HCCL for value: "DEEP_SINGLE_HCCL"
         */
        public static final ItemTypesEnum DEEP_SINGLE_HCCL = new ItemTypesEnum("DEEP_SINGLE_HCCL");

        /**
         * Enum DEEP_MULTI_HCCL for value: "DEEP_MULTI_HCCL"
         */
        public static final ItemTypesEnum DEEP_MULTI_HCCL = new ItemTypesEnum("DEEP_MULTI_HCCL");

        /**
         * Enum NPU_MODEL for value: "NPU_MODEL"
         */
        public static final ItemTypesEnum NPU_MODEL = new ItemTypesEnum("NPU_MODEL");

        /**
         * Enum NPU_FIRMWARE for value: "NPU_FIRMWARE"
         */
        public static final ItemTypesEnum NPU_FIRMWARE = new ItemTypesEnum("NPU_FIRMWARE");

        /**
         * Enum NPU_MCU for value: "NPU_MCU"
         */
        public static final ItemTypesEnum NPU_MCU = new ItemTypesEnum("NPU_MCU");

        /**
         * Enum NPU_VRD for value: "NPU_VRD"
         */
        public static final ItemTypesEnum NPU_VRD = new ItemTypesEnum("NPU_VRD");

        /**
         * Enum ROCE_TEST for value: "ROCE_TEST"
         */
        public static final ItemTypesEnum ROCE_TEST = new ItemTypesEnum("ROCE_TEST");

        /**
         * Enum HYPER_PLANE for value: "HYPER_PLANE"
         */
        public static final ItemTypesEnum HYPER_PLANE = new ItemTypesEnum("HYPER_PLANE");

        /**
         * Enum CONTAINER_TYPE_VERSION for value: "CONTAINER_TYPE_VERSION"
         */
        public static final ItemTypesEnum CONTAINER_TYPE_VERSION = new ItemTypesEnum("CONTAINER_TYPE_VERSION");

        /**
         * Enum DATA_DISK_PARTITION_TYPE for value: "DATA_DISK_PARTITION_TYPE"
         */
        public static final ItemTypesEnum DATA_DISK_PARTITION_TYPE = new ItemTypesEnum("DATA_DISK_PARTITION_TYPE");

        /**
         * Enum LOCAL_DISK_USAGE for value: "LOCAL_DISK_USAGE"
         */
        public static final ItemTypesEnum LOCAL_DISK_USAGE = new ItemTypesEnum("LOCAL_DISK_USAGE");

        /**
         * Enum NPU_PROC_RESIDUAL for value: "NPU_PROC_RESIDUAL"
         */
        public static final ItemTypesEnum NPU_PROC_RESIDUAL = new ItemTypesEnum("NPU_PROC_RESIDUAL");

        /**
         * Enum MAIN_NETWORK_CARD_MTU for value: "MAIN_NETWORK_CARD_MTU"
         */
        public static final ItemTypesEnum MAIN_NETWORK_CARD_MTU = new ItemTypesEnum("MAIN_NETWORK_CARD_MTU");

        /**
         * Enum ROCE_NETWORK_CARD_MTU for value: "ROCE_NETWORK_CARD_MTU"
         */
        public static final ItemTypesEnum ROCE_NETWORK_CARD_MTU = new ItemTypesEnum("ROCE_NETWORK_CARD_MTU");

        /**
         * Enum NPU_RESERVED_PORT for value: "NPU_RESERVED_PORT"
         */
        public static final ItemTypesEnum NPU_RESERVED_PORT = new ItemTypesEnum("NPU_RESERVED_PORT");

        /**
         * Enum ENABLE_PFC_PRIORITY_QUEUE for value: "ENABLE_PFC_PRIORITY_QUEUE"
         */
        public static final ItemTypesEnum ENABLE_PFC_PRIORITY_QUEUE = new ItemTypesEnum("ENABLE_PFC_PRIORITY_QUEUE");

        /**
         * Enum PFC_WATERLINE for value: "PFC_WATERLINE"
         */
        public static final ItemTypesEnum PFC_WATERLINE = new ItemTypesEnum("PFC_WATERLINE");

        /**
         * Enum SFS_CLIENT_OS_BUFFER_SIZE for value: "SFS_CLIENT_OS_BUFFER_SIZE"
         */
        public static final ItemTypesEnum SFS_CLIENT_OS_BUFFER_SIZE = new ItemTypesEnum("SFS_CLIENT_OS_BUFFER_SIZE");

        /**
         * Enum NPU_PCIE for value: "NPU_PCIE"
         */
        public static final ItemTypesEnum NPU_PCIE = new ItemTypesEnum("NPU_PCIE");

        /**
         * Enum NPU_LINK for value: "NPU_LINK"
         */
        public static final ItemTypesEnum NPU_LINK = new ItemTypesEnum("NPU_LINK");

        /**
         * Enum NPU_NET_HEALTH for value: "NPU_NET_HEALTH"
         */
        public static final ItemTypesEnum NPU_NET_HEALTH = new ItemTypesEnum("NPU_NET_HEALTH");

        /**
         * Enum NPU_LINK_STAT for value: "NPU_LINK_STAT"
         */
        public static final ItemTypesEnum NPU_LINK_STAT = new ItemTypesEnum("NPU_LINK_STAT");

        /**
         * Enum NPU_WARN for value: "NPU_WARN"
         */
        public static final ItemTypesEnum NPU_WARN = new ItemTypesEnum("NPU_WARN");

        /**
         * Enum NPU_VRAM_RESIDUAL for value: "NPU_VRAM_RESIDUAL"
         */
        public static final ItemTypesEnum NPU_VRAM_RESIDUAL = new ItemTypesEnum("NPU_VRAM_RESIDUAL");

        /**
         * Enum NPU_TLS for value: "NPU_TLS"
         */
        public static final ItemTypesEnum NPU_TLS = new ItemTypesEnum("NPU_TLS");

        /**
         * Enum NPU_HCCS_HEALTH for value: "NPU_HCCS_HEALTH"
         */
        public static final ItemTypesEnum NPU_HCCS_HEALTH = new ItemTypesEnum("NPU_HCCS_HEALTH");

        /**
         * Enum NPU_OPTICAL for value: "NPU_OPTICAL"
         */
        public static final ItemTypesEnum NPU_OPTICAL = new ItemTypesEnum("NPU_OPTICAL");

        /**
         * Enum NPU_MEDIA_SNR for value: "NPU_MEDIA_SNR"
         */
        public static final ItemTypesEnum NPU_MEDIA_SNR = new ItemTypesEnum("NPU_MEDIA_SNR");

        /**
         * Enum NPU_HOST_SNR for value: "NPU_HOST_SNR"
         */
        public static final ItemTypesEnum NPU_HOST_SNR = new ItemTypesEnum("NPU_HOST_SNR");

        /**
         * Enum NPU_SERDES for value: "NPU_SERDES"
         */
        public static final ItemTypesEnum NPU_SERDES = new ItemTypesEnum("NPU_SERDES");

        /**
         * Enum PORT_DOWNGRADE for value: "PORT_DOWNGRADE"
         */
        public static final ItemTypesEnum PORT_DOWNGRADE = new ItemTypesEnum("PORT_DOWNGRADE");

        /**
         * Enum HBM_DOUBLE_BIT_ERROR for value: "HBM_DOUBLE_BIT_ERROR"
         */
        public static final ItemTypesEnum HBM_DOUBLE_BIT_ERROR = new ItemTypesEnum("HBM_DOUBLE_BIT_ERROR");

        /**
         * Enum NPU_CDR_SNR for value: "NPU_CDR_SNR"
         */
        public static final ItemTypesEnum NPU_CDR_SNR = new ItemTypesEnum("NPU_CDR_SNR");

        private static final Map<String, ItemTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemTypesEnum> createStaticFields() {
            Map<String, ItemTypesEnum> map = new HashMap<>();
            map.put("OS_CPU_USAGE", OS_CPU_USAGE);
            map.put("OS_MEMORY_USED", OS_MEMORY_USED);
            map.put("OS_IOSTAT_USED", OS_IOSTAT_USED);
            map.put("OS_PROCESS_INFO", OS_PROCESS_INFO);
            map.put("OS_DISK_USAGE", OS_DISK_USAGE);
            map.put("OS_VERSION", OS_VERSION);
            map.put("OS_HUGE_PAGE", OS_HUGE_PAGE);
            map.put("OS_NVIDIA_DRIVER_VERSION", OS_NVIDIA_DRIVER_VERSION);
            map.put("OS_GPU_MODEL", OS_GPU_MODEL);
            map.put("OS_VRAM_TOTAL_MIB", OS_VRAM_TOTAL_MIB);
            map.put("OS_CUDA_VERSION", OS_CUDA_VERSION);
            map.put("OS_CUDA_TOOLKIT_VERSION", OS_CUDA_TOOLKIT_VERSION);
            map.put("OS_DOCKER_VERSION", OS_DOCKER_VERSION);
            map.put("OS_DOCKER_STORAGE_DRIVER", OS_DOCKER_STORAGE_DRIVER);
            map.put("OS_DOCKER_BACKING_FILESYSTEM", OS_DOCKER_BACKING_FILESYSTEM);
            map.put("OS_CONTAINERD_VERSION", OS_CONTAINERD_VERSION);
            map.put("OS_CPU_ARCHITECTURE", OS_CPU_ARCHITECTURE);
            map.put("OS_CPU_PROCESSORS", OS_CPU_PROCESSORS);
            map.put("OS_KERNEL_WATCHDOG_THRESH", OS_KERNEL_WATCHDOG_THRESH);
            map.put("OS_MEMORY_DEVICES", OS_MEMORY_DEVICES);
            map.put("OS_MEMORY_TOTAL_KB", OS_MEMORY_TOTAL_KB);
            map.put("OS_MEMORY_AVAILABLE_KB", OS_MEMORY_AVAILABLE_KB);
            map.put("OS_ANON_HUGE_PAGE_KB", OS_ANON_HUGE_PAGE_KB);
            map.put("OS_NET_CORE_SOMAXCONN", OS_NET_CORE_SOMAXCONN);
            map.put("OS_DUMMY_NET_CARDS", OS_DUMMY_NET_CARDS);
            map.put("NPU_VERSION", NPU_VERSION);
            map.put("NPU_CORE_USAGE", NPU_CORE_USAGE);
            map.put("NPU_PROC", NPU_PROC);
            map.put("NPU_HEALTH", NPU_HEALTH);
            map.put("NPU_COMPATIBILITY", NPU_COMPATIBILITY);
            map.put("ASCEND_DMI_CANN", ASCEND_DMI_CANN);
            map.put("ASCEND_DMI_DRIVER", ASCEND_DMI_DRIVER);
            map.put("ASCEND_DMI_NETWORK", ASCEND_DMI_NETWORK);
            map.put("ASCEND_DMI_HBM", ASCEND_DMI_HBM);
            map.put("ASCEND_DMI_SIGNAL_QUALITY", ASCEND_DMI_SIGNAL_QUALITY);
            map.put("UDP_PORT", UDP_PORT);
            map.put("DEEP_BAND_WIDTH", DEEP_BAND_WIDTH);
            map.put("DEEP_AI_FLOPS", DEEP_AI_FLOPS);
            map.put("DEEP_EYE_DIAGRAM", DEEP_EYE_DIAGRAM);
            map.put("DEEP_AI_CORE", DEEP_AI_CORE);
            map.put("DEEP_HBM", DEEP_HBM);
            map.put("DEEP_P2P", DEEP_P2P);
            map.put("DEEP_SINGLE_HCCL", DEEP_SINGLE_HCCL);
            map.put("DEEP_MULTI_HCCL", DEEP_MULTI_HCCL);
            map.put("NPU_MODEL", NPU_MODEL);
            map.put("NPU_FIRMWARE", NPU_FIRMWARE);
            map.put("NPU_MCU", NPU_MCU);
            map.put("NPU_VRD", NPU_VRD);
            map.put("ROCE_TEST", ROCE_TEST);
            map.put("HYPER_PLANE", HYPER_PLANE);
            map.put("CONTAINER_TYPE_VERSION", CONTAINER_TYPE_VERSION);
            map.put("DATA_DISK_PARTITION_TYPE", DATA_DISK_PARTITION_TYPE);
            map.put("LOCAL_DISK_USAGE", LOCAL_DISK_USAGE);
            map.put("NPU_PROC_RESIDUAL", NPU_PROC_RESIDUAL);
            map.put("MAIN_NETWORK_CARD_MTU", MAIN_NETWORK_CARD_MTU);
            map.put("ROCE_NETWORK_CARD_MTU", ROCE_NETWORK_CARD_MTU);
            map.put("NPU_RESERVED_PORT", NPU_RESERVED_PORT);
            map.put("ENABLE_PFC_PRIORITY_QUEUE", ENABLE_PFC_PRIORITY_QUEUE);
            map.put("PFC_WATERLINE", PFC_WATERLINE);
            map.put("SFS_CLIENT_OS_BUFFER_SIZE", SFS_CLIENT_OS_BUFFER_SIZE);
            map.put("NPU_PCIE", NPU_PCIE);
            map.put("NPU_LINK", NPU_LINK);
            map.put("NPU_NET_HEALTH", NPU_NET_HEALTH);
            map.put("NPU_LINK_STAT", NPU_LINK_STAT);
            map.put("NPU_WARN", NPU_WARN);
            map.put("NPU_VRAM_RESIDUAL", NPU_VRAM_RESIDUAL);
            map.put("NPU_TLS", NPU_TLS);
            map.put("NPU_HCCS_HEALTH", NPU_HCCS_HEALTH);
            map.put("NPU_OPTICAL", NPU_OPTICAL);
            map.put("NPU_MEDIA_SNR", NPU_MEDIA_SNR);
            map.put("NPU_HOST_SNR", NPU_HOST_SNR);
            map.put("NPU_SERDES", NPU_SERDES);
            map.put("PORT_DOWNGRADE", PORT_DOWNGRADE);
            map.put("HBM_DOUBLE_BIT_ERROR", HBM_DOUBLE_BIT_ERROR);
            map.put("NPU_CDR_SNR", NPU_CDR_SNR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ItemTypesEnum(String value) {
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
        public static ItemTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ItemTypesEnum(value));
        }

        public static ItemTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ItemTypesEnum) {
                return this.value.equals(((ItemTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_types")

    private ItemTypesEnum itemTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public ListInspectionNodesRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：作业ID。 **约束限制**：不涉及。 **取值范围**：长度为32的英文字符、数字的组合。 **默认取值**：不涉及。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListInspectionNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：[0,1000000000]。 **默认取值**：0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInspectionNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：[1,100]。 **默认取值**：10。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInspectionNodesRequest withInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     * @return inspectionType
     */
    public InspectionTypeEnum getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
    }

    public ListInspectionNodesRequest withItemCategory(ItemCategoryEnum itemCategory) {
        this.itemCategory = itemCategory;
        return this;
    }

    /**
     * **参数解释**：巡检类目。 **约束限制**：不涉及。 **取值范围**：   - HOST_CONFIG_STATUS：主机配置和状态   - NPU_HEALTH_CHECK：NPU健康检查   - NETWORK_STATUS：网络状态   - NPU_PERFORMANCE：NPU性能诊断   - NPU_STRESS_TEST：NPU压测   - NETWORK_STRESS_TEST：网络压测   - HOST_STRESS_TEST：主机压测 **默认取值**：不涉及。 
     * @return itemCategory
     */
    public ItemCategoryEnum getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategoryEnum itemCategory) {
        this.itemCategory = itemCategory;
    }

    public ListInspectionNodesRequest withExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * **参数解释**：巡检项执行状态。 **约束限制**：不涉及。 **取值范围**：   - WAITING：排队中   - RUNNING：执行中   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     * @return executeStatus
     */
    public ExecuteStatusEnum getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
    }

    public ListInspectionNodesRequest withResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     * @return resultStatus
     */
    public ResultStatusEnum getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ListInspectionNodesRequest withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称关键字。 **约束限制**：不涉及。 **取值范围**：长度为[0,50]的字符串。 **默认取值**：不涉及。 
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ListInspectionNodesRequest withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * **参数解释**：节点IP关键字。 **约束限制**：不涉及。 **取值范围**：长度为[0,50]的字符串。 **默认取值**：不涉及。 
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public ListInspectionNodesRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**：服务器ID关键字。 **约束限制**：不涉及。 **取值范围**：长度为[0,50]的字符串。 **默认取值**：不涉及。 
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListInspectionNodesRequest withItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多机HCCL参数面通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE网络带宽测试   - HYPER_PLANE 多机HCCL超平面通信带宽测试   - CONTAINER_TYPE_VERSION Container类型和版本   - DATA_DISK_PARTITION_TYPE 数据盘分区类型   - LOCAL_DISK_USAGE 本地磁盘利用率   - NPU_PROC_RESIDUAL NPU残留进程   - MAIN_NETWORK_CARD_MTU 主网卡MTU值   - ROCE_NETWORK_CARD_MTU ROCE网卡MTU值   - NPU_RESERVED_PORT NPU预留端口   - ENABLE_PFC_PRIORITY_QUEUE 使能PFC优先队列配置   - PFC_WATERLINE PFC水线   - SFS_CLIENT_OS_BUFFER_SIZE SFS客户端缓存大小   - NPU_PCIE NPU pcie建链信息   - NPU_LINK NPU参数面网卡link状态   - NPU_NET_HEALTH NPU网络健康   - NPU_LINK_STAT NPU光模块闪断   - NPU_WARN NPU warning告警   - NPU_VRAM_RESIDUAL NPU显存残留   - NPU_TLS TLS开关   - NPU_HCCS_HEALTH NPU hccs健康状态   - NPU_OPTICAL NPU收发光功率   - NPU_MEDIA_SNR NPU光模块Media SNR   - NPU_HOST_SNR NPU光模块Host SNR   - NPU_SERDES NPU serdes   - PORT_DOWNGRADE 端口降 Lane   - HBM_DOUBLE_BIT_ERROR 多比特 ECC   - NPU_CDR_SNR cdrSNR 
     * @return itemType
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
    }

    public ListInspectionNodesRequest withItemCategories(ItemCategoriesEnum itemCategories) {
        this.itemCategories = itemCategories;
        return this;
    }

    /**
     * **参数解释**：巡检类目。 **约束限制**：不涉及。 **取值范围**：   - HOST_CONFIG_STATUS：主机配置和状态   - NPU_HEALTH_CHECK：NPU健康检查   - NPU_PERFORMANCE：NPU性能诊断   - NPU_STRESS_TEST：NPU压测   - NETWORK_STRESS_TEST：网络压测 **默认取值**：不涉及。 
     * @return itemCategories
     */
    public ItemCategoriesEnum getItemCategories() {
        return itemCategories;
    }

    public void setItemCategories(ItemCategoriesEnum itemCategories) {
        this.itemCategories = itemCategories;
    }

    public ListInspectionNodesRequest withItemTypes(ItemTypesEnum itemTypes) {
        this.itemTypes = itemTypes;
        return this;
    }

    /**
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多机HCCL参数面通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE网络带宽测试   - HYPER_PLANE 多机HCCL超平面通信带宽测试   - CONTAINER_TYPE_VERSION Container类型和版本   - DATA_DISK_PARTITION_TYPE 数据盘分区类型   - LOCAL_DISK_USAGE 本地磁盘利用率   - NPU_PROC_RESIDUAL NPU残留进程   - MAIN_NETWORK_CARD_MTU 主网卡MTU值   - ROCE_NETWORK_CARD_MTU ROCE网卡MTU值   - NPU_RESERVED_PORT NPU预留端口   - ENABLE_PFC_PRIORITY_QUEUE 使能PFC优先队列配置   - PFC_WATERLINE PFC水线   - SFS_CLIENT_OS_BUFFER_SIZE SFS客户端缓存大小   - NPU_PCIE NPU pcie建链信息   - NPU_LINK NPU参数面网卡link状态   - NPU_NET_HEALTH NPU网络健康   - NPU_LINK_STAT NPU光模块闪断   - NPU_WARN NPU warning告警   - NPU_VRAM_RESIDUAL NPU显存残留   - NPU_TLS TLS开关   - NPU_HCCS_HEALTH NPU hccs健康状态   - NPU_OPTICAL NPU收发光功率   - NPU_MEDIA_SNR NPU光模块Media SNR   - NPU_HOST_SNR NPU光模块Host SNR   - NPU_SERDES NPU serdes   - PORT_DOWNGRADE 端口降 Lane   - HBM_DOUBLE_BIT_ERROR 多比特 ECC   - NPU_CDR_SNR cdrSNR 
     * @return itemTypes
     */
    public ItemTypesEnum getItemTypes() {
        return itemTypes;
    }

    public void setItemTypes(ItemTypesEnum itemTypes) {
        this.itemTypes = itemTypes;
    }

    public ListInspectionNodesRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：节点ID。 **约束限制**：不涉及。 **取值范围**：长度为[0,64]的字符串。 **默认取值**：不涉及。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionNodesRequest that = (ListInspectionNodesRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.inspectionType, that.inspectionType)
            && Objects.equals(this.itemCategory, that.itemCategory)
            && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.resultStatus, that.resultStatus) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.nodeIp, that.nodeIp) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.itemType, that.itemType) && Objects.equals(this.itemCategories, that.itemCategories)
            && Objects.equals(this.itemTypes, that.itemTypes) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            offset,
            limit,
            inspectionType,
            itemCategory,
            executeStatus,
            resultStatus,
            nodeName,
            nodeIp,
            serverId,
            itemType,
            itemCategories,
            itemTypes,
            nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionNodesRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    itemCategories: ").append(toIndentedString(itemCategories)).append("\n");
        sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
