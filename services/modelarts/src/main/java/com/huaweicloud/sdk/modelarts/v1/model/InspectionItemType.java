package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检检查项类型。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多级HCCL通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE TEST网络带宽测试 
 */
public class InspectionItemType {

    /**
     * Enum OS_CPU_USAGE for value: "OS_CPU_USAGE"
     */
    public static final InspectionItemType OS_CPU_USAGE = new InspectionItemType("OS_CPU_USAGE");

    /**
     * Enum OS_MEMORY_USED for value: "OS_MEMORY_USED"
     */
    public static final InspectionItemType OS_MEMORY_USED = new InspectionItemType("OS_MEMORY_USED");

    /**
     * Enum OS_IOSTAT_USED for value: "OS_IOSTAT_USED"
     */
    public static final InspectionItemType OS_IOSTAT_USED = new InspectionItemType("OS_IOSTAT_USED");

    /**
     * Enum OS_PROCESS_INFO for value: "OS_PROCESS_INFO"
     */
    public static final InspectionItemType OS_PROCESS_INFO = new InspectionItemType("OS_PROCESS_INFO");

    /**
     * Enum OS_DISK_USAGE for value: "OS_DISK_USAGE"
     */
    public static final InspectionItemType OS_DISK_USAGE = new InspectionItemType("OS_DISK_USAGE");

    /**
     * Enum OS_VERSION for value: "OS_VERSION"
     */
    public static final InspectionItemType OS_VERSION = new InspectionItemType("OS_VERSION");

    /**
     * Enum OS_HUGE_PAGE for value: "OS_HUGE_PAGE"
     */
    public static final InspectionItemType OS_HUGE_PAGE = new InspectionItemType("OS_HUGE_PAGE");

    /**
     * Enum OS_NVIDIA_DRIVER_VERSION for value: "OS_NVIDIA_DRIVER_VERSION"
     */
    public static final InspectionItemType OS_NVIDIA_DRIVER_VERSION =
        new InspectionItemType("OS_NVIDIA_DRIVER_VERSION");

    /**
     * Enum OS_GPU_MODEL for value: "OS_GPU_MODEL"
     */
    public static final InspectionItemType OS_GPU_MODEL = new InspectionItemType("OS_GPU_MODEL");

    /**
     * Enum OS_VRAM_TOTAL_MIB for value: "OS_VRAM_TOTAL_MIB"
     */
    public static final InspectionItemType OS_VRAM_TOTAL_MIB = new InspectionItemType("OS_VRAM_TOTAL_MIB");

    /**
     * Enum OS_CUDA_VERSION for value: "OS_CUDA_VERSION"
     */
    public static final InspectionItemType OS_CUDA_VERSION = new InspectionItemType("OS_CUDA_VERSION");

    /**
     * Enum OS_CUDA_TOOLKIT_VERSION for value: "OS_CUDA_TOOLKIT_VERSION"
     */
    public static final InspectionItemType OS_CUDA_TOOLKIT_VERSION = new InspectionItemType("OS_CUDA_TOOLKIT_VERSION");

    /**
     * Enum OS_DOCKER_VERSION for value: "OS_DOCKER_VERSION"
     */
    public static final InspectionItemType OS_DOCKER_VERSION = new InspectionItemType("OS_DOCKER_VERSION");

    /**
     * Enum OS_DOCKER_STORAGE_DRIVER for value: "OS_DOCKER_STORAGE_DRIVER"
     */
    public static final InspectionItemType OS_DOCKER_STORAGE_DRIVER =
        new InspectionItemType("OS_DOCKER_STORAGE_DRIVER");

    /**
     * Enum OS_DOCKER_BACKING_FILESYSTEM for value: "OS_DOCKER_BACKING_FILESYSTEM"
     */
    public static final InspectionItemType OS_DOCKER_BACKING_FILESYSTEM =
        new InspectionItemType("OS_DOCKER_BACKING_FILESYSTEM");

    /**
     * Enum OS_CONTAINERD_VERSION for value: "OS_CONTAINERD_VERSION"
     */
    public static final InspectionItemType OS_CONTAINERD_VERSION = new InspectionItemType("OS_CONTAINERD_VERSION");

    /**
     * Enum OS_CPU_ARCHITECTURE for value: "OS_CPU_ARCHITECTURE"
     */
    public static final InspectionItemType OS_CPU_ARCHITECTURE = new InspectionItemType("OS_CPU_ARCHITECTURE");

    /**
     * Enum OS_CPU_PROCESSORS for value: "OS_CPU_PROCESSORS"
     */
    public static final InspectionItemType OS_CPU_PROCESSORS = new InspectionItemType("OS_CPU_PROCESSORS");

    /**
     * Enum OS_KERNEL_WATCHDOG_THRESH for value: "OS_KERNEL_WATCHDOG_THRESH"
     */
    public static final InspectionItemType OS_KERNEL_WATCHDOG_THRESH =
        new InspectionItemType("OS_KERNEL_WATCHDOG_THRESH");

    /**
     * Enum OS_MEMORY_DEVICES for value: "OS_MEMORY_DEVICES"
     */
    public static final InspectionItemType OS_MEMORY_DEVICES = new InspectionItemType("OS_MEMORY_DEVICES");

    /**
     * Enum OS_MEMORY_TOTAL_KB for value: "OS_MEMORY_TOTAL_KB"
     */
    public static final InspectionItemType OS_MEMORY_TOTAL_KB = new InspectionItemType("OS_MEMORY_TOTAL_KB");

    /**
     * Enum OS_MEMORY_AVAILABLE_KB for value: "OS_MEMORY_AVAILABLE_KB"
     */
    public static final InspectionItemType OS_MEMORY_AVAILABLE_KB = new InspectionItemType("OS_MEMORY_AVAILABLE_KB");

    /**
     * Enum OS_ANON_HUGE_PAGE_KB for value: "OS_ANON_HUGE_PAGE_KB"
     */
    public static final InspectionItemType OS_ANON_HUGE_PAGE_KB = new InspectionItemType("OS_ANON_HUGE_PAGE_KB");

    /**
     * Enum OS_NET_CORE_SOMAXCONN for value: "OS_NET_CORE_SOMAXCONN"
     */
    public static final InspectionItemType OS_NET_CORE_SOMAXCONN = new InspectionItemType("OS_NET_CORE_SOMAXCONN");

    /**
     * Enum OS_DUMMY_NET_CARDS for value: "OS_DUMMY_NET_CARDS"
     */
    public static final InspectionItemType OS_DUMMY_NET_CARDS = new InspectionItemType("OS_DUMMY_NET_CARDS");

    /**
     * Enum NPU_VERSION for value: "NPU_VERSION"
     */
    public static final InspectionItemType NPU_VERSION = new InspectionItemType("NPU_VERSION");

    /**
     * Enum NPU_CORE_USAGE for value: "NPU_CORE_USAGE"
     */
    public static final InspectionItemType NPU_CORE_USAGE = new InspectionItemType("NPU_CORE_USAGE");

    /**
     * Enum NPU_PROC for value: "NPU_PROC"
     */
    public static final InspectionItemType NPU_PROC = new InspectionItemType("NPU_PROC");

    /**
     * Enum NPU_HEALTH for value: "NPU_HEALTH"
     */
    public static final InspectionItemType NPU_HEALTH = new InspectionItemType("NPU_HEALTH");

    /**
     * Enum NPU_COMPATIBILITY for value: "NPU_COMPATIBILITY"
     */
    public static final InspectionItemType NPU_COMPATIBILITY = new InspectionItemType("NPU_COMPATIBILITY");

    /**
     * Enum ASCEND_DMI_CANN for value: "ASCEND_DMI_CANN"
     */
    public static final InspectionItemType ASCEND_DMI_CANN = new InspectionItemType("ASCEND_DMI_CANN");

    /**
     * Enum ASCEND_DMI_DRIVER for value: "ASCEND_DMI_DRIVER"
     */
    public static final InspectionItemType ASCEND_DMI_DRIVER = new InspectionItemType("ASCEND_DMI_DRIVER");

    /**
     * Enum ASCEND_DMI_NETWORK for value: "ASCEND_DMI_NETWORK"
     */
    public static final InspectionItemType ASCEND_DMI_NETWORK = new InspectionItemType("ASCEND_DMI_NETWORK");

    /**
     * Enum ASCEND_DMI_HBM for value: "ASCEND_DMI_HBM"
     */
    public static final InspectionItemType ASCEND_DMI_HBM = new InspectionItemType("ASCEND_DMI_HBM");

    /**
     * Enum ASCEND_DMI_SIGNAL_QUALITY for value: "ASCEND_DMI_SIGNAL_QUALITY"
     */
    public static final InspectionItemType ASCEND_DMI_SIGNAL_QUALITY =
        new InspectionItemType("ASCEND_DMI_SIGNAL_QUALITY");

    /**
     * Enum UDP_PORT for value: "UDP_PORT"
     */
    public static final InspectionItemType UDP_PORT = new InspectionItemType("UDP_PORT");

    /**
     * Enum DEEP_BAND_WIDTH for value: "DEEP_BAND_WIDTH"
     */
    public static final InspectionItemType DEEP_BAND_WIDTH = new InspectionItemType("DEEP_BAND_WIDTH");

    /**
     * Enum DEEP_AI_FLOPS for value: "DEEP_AI_FLOPS"
     */
    public static final InspectionItemType DEEP_AI_FLOPS = new InspectionItemType("DEEP_AI_FLOPS");

    /**
     * Enum DEEP_EYE_DIAGRAM for value: "DEEP_EYE_DIAGRAM"
     */
    public static final InspectionItemType DEEP_EYE_DIAGRAM = new InspectionItemType("DEEP_EYE_DIAGRAM");

    /**
     * Enum DEEP_AI_CORE for value: "DEEP_AI_CORE"
     */
    public static final InspectionItemType DEEP_AI_CORE = new InspectionItemType("DEEP_AI_CORE");

    /**
     * Enum DEEP_HBM for value: "DEEP_HBM"
     */
    public static final InspectionItemType DEEP_HBM = new InspectionItemType("DEEP_HBM");

    /**
     * Enum DEEP_P2P for value: "DEEP_P2P"
     */
    public static final InspectionItemType DEEP_P2P = new InspectionItemType("DEEP_P2P");

    /**
     * Enum DEEP_SINGLE_HCCL for value: "DEEP_SINGLE_HCCL"
     */
    public static final InspectionItemType DEEP_SINGLE_HCCL = new InspectionItemType("DEEP_SINGLE_HCCL");

    /**
     * Enum DEEP_MULTI_HCCL for value: "DEEP_MULTI_HCCL"
     */
    public static final InspectionItemType DEEP_MULTI_HCCL = new InspectionItemType("DEEP_MULTI_HCCL");

    /**
     * Enum NPU_MODEL for value: "NPU_MODEL"
     */
    public static final InspectionItemType NPU_MODEL = new InspectionItemType("NPU_MODEL");

    /**
     * Enum NPU_FIRMWARE for value: "NPU_FIRMWARE"
     */
    public static final InspectionItemType NPU_FIRMWARE = new InspectionItemType("NPU_FIRMWARE");

    /**
     * Enum NPU_MCU for value: "NPU_MCU"
     */
    public static final InspectionItemType NPU_MCU = new InspectionItemType("NPU_MCU");

    /**
     * Enum NPU_VRD for value: "NPU_VRD"
     */
    public static final InspectionItemType NPU_VRD = new InspectionItemType("NPU_VRD");

    /**
     * Enum ROCE_TEST for value: "ROCE_TEST"
     */
    public static final InspectionItemType ROCE_TEST = new InspectionItemType("ROCE_TEST");

    private static final Map<String, InspectionItemType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InspectionItemType> createStaticFields() {
        Map<String, InspectionItemType> map = new HashMap<>();
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

    InspectionItemType(String value) {
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
    public static InspectionItemType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionItemType(value));
    }

    public static InspectionItemType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InspectionItemType) {
            return this.value.equals(((InspectionItemType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
