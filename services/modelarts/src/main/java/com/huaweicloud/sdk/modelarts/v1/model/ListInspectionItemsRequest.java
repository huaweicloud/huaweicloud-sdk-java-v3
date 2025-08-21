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
public class ListInspectionItemsRequest {

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
         * Enum HOST_STRESS_TEST for value: "HOST_STRESS_TEST"
         */
        public static final ItemCategoryEnum HOST_STRESS_TEST = new ItemCategoryEnum("HOST_STRESS_TEST");

        private static final Map<String, ItemCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemCategoryEnum> createStaticFields() {
            Map<String, ItemCategoryEnum> map = new HashMap<>();
            map.put("HOST_CONFIG_STATUS", HOST_CONFIG_STATUS);
            map.put("NPU_HEALTH_CHECK", NPU_HEALTH_CHECK);
            map.put("NETWORK_STATUS", NETWORK_STATUS);
            map.put("NPU_PERFORMANCE", NPU_PERFORMANCE);
            map.put("NPU_STRESS_TEST", NPU_STRESS_TEST);
            map.put("NETWORK_STRESS_TEST", NETWORK_STRESS_TEST);
            map.put("HOST_STRESS_TEST", HOST_STRESS_TEST);
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
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE   - OS_MEMORY_USED   - OS_IOSTAT_USED   - OS_PROCESS_INFO   - OS_DISK_USAGE   - OS_VERSION   - OS_HUGE_PAGE   - NPU_VERSION   - NPU_CORE_USAGE   - NPU_PROC   - NPU_HEALTH   - NPU_COMPATIBILITY   - DEEP_BAND_WIDTH   - DEEP_AI_FLOPS   - DEEP_EYE_DIAGRAM   - DEEP_AI_CORE   - DEEP_HBM   - DEEP_P2P   - DEEP_SINGLE_HCCL   - DEEP_MULTI_HCCL   - CODE_DIR 训练作业代码目录   - BOOT_FILE 训练作业启动文件   - WORKING_DIR 训练作业工作目录   - DATA_INFO 训练作业数据存储信息   - RESTART_POLICY 训练作业重启策略   - START_COMMAND 训练作业启动命令信息   - ENVIRONMENT 训练作业环境变量信息   - SUPER_PARAMETERS 训练作业算法超参信息   - IMAGE_INFO 训练作业镜像信息   - CREATION_METHOD 训练作业创建方式信息   - POOL_INFO 训练作业资源池信息   - PRIORITY 训练作业优先级信息   - SFS_TURBO 训练作业sfs turbo信息   - RESOURCE_INFO 训练作业实例信息   - CCE_VERSION CCE集群版本   - NODE_AGENT_VERSION node-agent版本   - VOLCANO_VERSION volcano版本   - HUAWEI_NPU_VERSION huawei-NPU版本   - GPU_BETA_VERSION GPU-beta版本   - MA MA生命周期状态   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE TEST网络带宽测试 **默认取值**：不涉及。 
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
     * **参数解释**：巡检项执行状态。 **约束限制**：不涉及。 **取值范围**：   - RUNNING：执行中   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     */
    public static final class ExecuteStatusEnum {

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

    public ListInspectionItemsRequest withJobId(String jobId) {
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

    public ListInspectionItemsRequest withOffset(Integer offset) {
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

    public ListInspectionItemsRequest withLimit(Integer limit) {
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

    public ListInspectionItemsRequest withInspectionType(InspectionTypeEnum inspectionType) {
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

    public ListInspectionItemsRequest withItemCategory(ItemCategoryEnum itemCategory) {
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

    public ListInspectionItemsRequest withItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * **参数解释**：巡检检查项类型，不指定检查项时返回所有类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE   - OS_MEMORY_USED   - OS_IOSTAT_USED   - OS_PROCESS_INFO   - OS_DISK_USAGE   - OS_VERSION   - OS_HUGE_PAGE   - NPU_VERSION   - NPU_CORE_USAGE   - NPU_PROC   - NPU_HEALTH   - NPU_COMPATIBILITY   - DEEP_BAND_WIDTH   - DEEP_AI_FLOPS   - DEEP_EYE_DIAGRAM   - DEEP_AI_CORE   - DEEP_HBM   - DEEP_P2P   - DEEP_SINGLE_HCCL   - DEEP_MULTI_HCCL   - CODE_DIR 训练作业代码目录   - BOOT_FILE 训练作业启动文件   - WORKING_DIR 训练作业工作目录   - DATA_INFO 训练作业数据存储信息   - RESTART_POLICY 训练作业重启策略   - START_COMMAND 训练作业启动命令信息   - ENVIRONMENT 训练作业环境变量信息   - SUPER_PARAMETERS 训练作业算法超参信息   - IMAGE_INFO 训练作业镜像信息   - CREATION_METHOD 训练作业创建方式信息   - POOL_INFO 训练作业资源池信息   - PRIORITY 训练作业优先级信息   - SFS_TURBO 训练作业sfs turbo信息   - RESOURCE_INFO 训练作业实例信息   - CCE_VERSION CCE集群版本   - NODE_AGENT_VERSION node-agent版本   - VOLCANO_VERSION volcano版本   - HUAWEI_NPU_VERSION huawei-NPU版本   - GPU_BETA_VERSION GPU-beta版本   - MA MA生命周期状态   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE TEST网络带宽测试 **默认取值**：不涉及。 
     * @return itemType
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
    }

    public ListInspectionItemsRequest withExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * **参数解释**：巡检项执行状态。 **约束限制**：不涉及。 **取值范围**：   - RUNNING：执行中   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     * @return executeStatus
     */
    public ExecuteStatusEnum getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
    }

    public ListInspectionItemsRequest withResultStatus(ResultStatusEnum resultStatus) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionItemsRequest that = (ListInspectionItemsRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.inspectionType, that.inspectionType)
            && Objects.equals(this.itemCategory, that.itemCategory) && Objects.equals(this.itemType, that.itemType)
            && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.resultStatus, that.resultStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, offset, limit, inspectionType, itemCategory, itemType, executeStatus, resultStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionItemsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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
