package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检检查项类型。 **约束限制**：不涉及。 **取值范围**：   - OS_CPU_USAGE 主机CPU利用率   - OS_MEMORY_USED 主机DDR利用率   - OS_IOSTAT_USED 主机IOStat利用率   - OS_PROCESS_INFO 主机进程状态   - OS_DISK_USAGE 磁盘空间使用率   - OS_NVIDIA_DRIVER_VERSION Nvidia驱动版本   - OS_GPU_MODEL GPU型号   - OS_VRAM_TOTAL_MIB 显存容量   - OS_CUDA_VERSION CUDA版本    - OS_CUDA_TOOLKIT_VERSION CUDA工具包版本   - OS_DOCKER_VERSION Docker版本   - OS_DOCKER_STORAGE_DRIVER Docker存储驱动   - OS_DOCKER_BACKING_FILESYSTEM Docker底层文件系统   - OS_CONTAINERD_VERSION Containerd版本   - OS_CPU_ARCHITECTURE CPU处理器架构   - OS_CPU_PROCESSORS CPU逻辑处理器数量   - OS_KERNEL_WATCHDOG_THRESH watchdog阈值   - OS_MEMORY_DEVICES 内存条数量   - OS_MEMORY_TOTAL_KB 内存总量   - OS_MEMORY_AVAILABLE_KB 内存可用量   - OS_ANON_HUGE_PAGE_KB 透明大页大小   - OS_NET_CORE_SOMAXCONN Socket最大连接数   - OS_DUMMY_NET_CARDS Dummy网卡数量   - OS_VERSION 主机OS版本   - OS_HUGE_PAGE 主机透明大页   - NPU_VERSION NPU驱动版本   - NPU_CORE_USAGE NPU 利用率   - NPU_PROC NPU 进程状态   - NPU_HEALTH NPU 芯片健康状态   - NPU_COMPATIBILITY NPU 驱动和硬件兼容性   - ASCEND_DMI_CANNCANN与驱动兼容性诊断   - ASCEND_DMI_DRIVER 驱动健康诊断   - ASCEND_DMI_NETWORK 网络健康诊断   - ASCEND_DMI_HBM HBM诊断   - ASCEND_DMI_SIGNAL_QUALITY 信号质量诊断   - UDP_PORT 源端口配置值诊断   - DEEP_BAND_WIDTH BAND WIDTH   - DEEP_AI_FLOPS Aiflops   - DEEP_EYE_DIAGRAM 眼图测试   - DEEP_AI_CORE AI Core压测   - DEEP_HBM HBM压测   - DEEP_P2P P2P压测   - DEEP_SINGLE_HCCL 单机HCCL通信带宽测试   - DEEP_MULTI_HCCL 多机HCCL参数面通信带宽测试   - NPU_MODEL NPU卡类型   - NPU_FIRMWARE NPU固件驱动版本   - NPU_MCU NPU MCU版本   - NPU_VRD NPU VRD固件版本   - ROCE_TEST RoCE网络带宽测试   - HYPER_PLANE 多机HCCL超平面通信带宽测试   - CONTAINER_TYPE_VERSION Container类型和版本   - DATA_DISK_PARTITION_TYPE 数据盘分区类型   - LOCAL_DISK_USAGE 本地磁盘利用率   - NPU_PROC_RESIDUAL NPU残留进程   - MAIN_NETWORK_CARD_MTU 主网卡MTU值   - ROCE_NETWORK_CARD_MTU ROCE网卡MTU值   - NPU_RESERVED_PORT NPU预留端口   - ENABLE_PFC_PRIORITY_QUEUE 使能PFC优先队列配置   - PFC_WATERLINE PFC水线   - SFS_CLIENT_OS_BUFFER_SIZE SFS客户端缓存大小   - NPU_PCIE NPU pcie建链信息   - NPU_LINK NPU参数面网卡link状态   - NPU_NET_HEALTH NPU网络健康   - NPU_LINK_STAT NPU光模块闪断   - NPU_WARN NPU warning告警   - NPU_VRAM_RESIDUAL NPU显存残留   - NPU_TLS TLS开关   - NPU_HCCS_HEALTH NPU hccs健康状态   - NPU_OPTICAL NPU收发光功率   - NPU_MEDIA_SNR NPU光模块Media SNR   - NPU_HOST_SNR NPU光模块Host SNR   - NPU_SERDES NPU serdes   - PORT_DOWNGRADE 端口降 Lane   - HBM_DOUBLE_BIT_ERROR 多比特 ECC   - NPU_CDR_SNR cdrSNR **默认取值**：不涉及。 
 */
public class ReqInspectionItemType {

    /**
     * Enum OS_CPU_USAGE for value: "OS_CPU_USAGE"
     */
    public static final ReqInspectionItemType OS_CPU_USAGE = new ReqInspectionItemType("OS_CPU_USAGE");

    /**
     * Enum OS_MEMORY_USED for value: "OS_MEMORY_USED"
     */
    public static final ReqInspectionItemType OS_MEMORY_USED = new ReqInspectionItemType("OS_MEMORY_USED");

    /**
     * Enum OS_IOSTAT_USED for value: "OS_IOSTAT_USED"
     */
    public static final ReqInspectionItemType OS_IOSTAT_USED = new ReqInspectionItemType("OS_IOSTAT_USED");

    /**
     * Enum OS_PROCESS_INFO for value: "OS_PROCESS_INFO"
     */
    public static final ReqInspectionItemType OS_PROCESS_INFO = new ReqInspectionItemType("OS_PROCESS_INFO");

    /**
     * Enum OS_DISK_USAGE for value: "OS_DISK_USAGE"
     */
    public static final ReqInspectionItemType OS_DISK_USAGE = new ReqInspectionItemType("OS_DISK_USAGE");

    /**
     * Enum OS_VERSION for value: "OS_VERSION"
     */
    public static final ReqInspectionItemType OS_VERSION = new ReqInspectionItemType("OS_VERSION");

    /**
     * Enum OS_HUGE_PAGE for value: "OS_HUGE_PAGE"
     */
    public static final ReqInspectionItemType OS_HUGE_PAGE = new ReqInspectionItemType("OS_HUGE_PAGE");

    /**
     * Enum OS_NVIDIA_DRIVER_VERSION for value: "OS_NVIDIA_DRIVER_VERSION"
     */
    public static final ReqInspectionItemType OS_NVIDIA_DRIVER_VERSION =
        new ReqInspectionItemType("OS_NVIDIA_DRIVER_VERSION");

    /**
     * Enum OS_GPU_MODEL for value: "OS_GPU_MODEL"
     */
    public static final ReqInspectionItemType OS_GPU_MODEL = new ReqInspectionItemType("OS_GPU_MODEL");

    /**
     * Enum OS_VRAM_TOTAL_MIB for value: "OS_VRAM_TOTAL_MIB"
     */
    public static final ReqInspectionItemType OS_VRAM_TOTAL_MIB = new ReqInspectionItemType("OS_VRAM_TOTAL_MIB");

    /**
     * Enum OS_CUDA_VERSION for value: "OS_CUDA_VERSION"
     */
    public static final ReqInspectionItemType OS_CUDA_VERSION = new ReqInspectionItemType("OS_CUDA_VERSION");

    /**
     * Enum OS_CUDA_TOOLKIT_VERSION for value: "OS_CUDA_TOOLKIT_VERSION"
     */
    public static final ReqInspectionItemType OS_CUDA_TOOLKIT_VERSION =
        new ReqInspectionItemType("OS_CUDA_TOOLKIT_VERSION");

    /**
     * Enum OS_DOCKER_VERSION for value: "OS_DOCKER_VERSION"
     */
    public static final ReqInspectionItemType OS_DOCKER_VERSION = new ReqInspectionItemType("OS_DOCKER_VERSION");

    /**
     * Enum OS_DOCKER_STORAGE_DRIVER for value: "OS_DOCKER_STORAGE_DRIVER"
     */
    public static final ReqInspectionItemType OS_DOCKER_STORAGE_DRIVER =
        new ReqInspectionItemType("OS_DOCKER_STORAGE_DRIVER");

    /**
     * Enum OS_DOCKER_BACKING_FILESYSTEM for value: "OS_DOCKER_BACKING_FILESYSTEM"
     */
    public static final ReqInspectionItemType OS_DOCKER_BACKING_FILESYSTEM =
        new ReqInspectionItemType("OS_DOCKER_BACKING_FILESYSTEM");

    /**
     * Enum OS_CONTAINERD_VERSION for value: "OS_CONTAINERD_VERSION"
     */
    public static final ReqInspectionItemType OS_CONTAINERD_VERSION =
        new ReqInspectionItemType("OS_CONTAINERD_VERSION");

    /**
     * Enum OS_CPU_ARCHITECTURE for value: "OS_CPU_ARCHITECTURE"
     */
    public static final ReqInspectionItemType OS_CPU_ARCHITECTURE = new ReqInspectionItemType("OS_CPU_ARCHITECTURE");

    /**
     * Enum OS_CPU_PROCESSORS for value: "OS_CPU_PROCESSORS"
     */
    public static final ReqInspectionItemType OS_CPU_PROCESSORS = new ReqInspectionItemType("OS_CPU_PROCESSORS");

    /**
     * Enum OS_KERNEL_WATCHDOG_THRESH for value: "OS_KERNEL_WATCHDOG_THRESH"
     */
    public static final ReqInspectionItemType OS_KERNEL_WATCHDOG_THRESH =
        new ReqInspectionItemType("OS_KERNEL_WATCHDOG_THRESH");

    /**
     * Enum OS_MEMORY_DEVICES for value: "OS_MEMORY_DEVICES"
     */
    public static final ReqInspectionItemType OS_MEMORY_DEVICES = new ReqInspectionItemType("OS_MEMORY_DEVICES");

    /**
     * Enum OS_MEMORY_TOTAL_KB for value: "OS_MEMORY_TOTAL_KB"
     */
    public static final ReqInspectionItemType OS_MEMORY_TOTAL_KB = new ReqInspectionItemType("OS_MEMORY_TOTAL_KB");

    /**
     * Enum OS_MEMORY_AVAILABLE_KB for value: "OS_MEMORY_AVAILABLE_KB"
     */
    public static final ReqInspectionItemType OS_MEMORY_AVAILABLE_KB =
        new ReqInspectionItemType("OS_MEMORY_AVAILABLE_KB");

    /**
     * Enum OS_ANON_HUGE_PAGE_KB for value: "OS_ANON_HUGE_PAGE_KB"
     */
    public static final ReqInspectionItemType OS_ANON_HUGE_PAGE_KB = new ReqInspectionItemType("OS_ANON_HUGE_PAGE_KB");

    /**
     * Enum OS_NET_CORE_SOMAXCONN for value: "OS_NET_CORE_SOMAXCONN"
     */
    public static final ReqInspectionItemType OS_NET_CORE_SOMAXCONN =
        new ReqInspectionItemType("OS_NET_CORE_SOMAXCONN");

    /**
     * Enum OS_DUMMY_NET_CARDS for value: "OS_DUMMY_NET_CARDS"
     */
    public static final ReqInspectionItemType OS_DUMMY_NET_CARDS = new ReqInspectionItemType("OS_DUMMY_NET_CARDS");

    /**
     * Enum NPU_VERSION for value: "NPU_VERSION"
     */
    public static final ReqInspectionItemType NPU_VERSION = new ReqInspectionItemType("NPU_VERSION");

    /**
     * Enum NPU_CORE_USAGE for value: "NPU_CORE_USAGE"
     */
    public static final ReqInspectionItemType NPU_CORE_USAGE = new ReqInspectionItemType("NPU_CORE_USAGE");

    /**
     * Enum NPU_PROC for value: "NPU_PROC"
     */
    public static final ReqInspectionItemType NPU_PROC = new ReqInspectionItemType("NPU_PROC");

    /**
     * Enum NPU_HEALTH for value: "NPU_HEALTH"
     */
    public static final ReqInspectionItemType NPU_HEALTH = new ReqInspectionItemType("NPU_HEALTH");

    /**
     * Enum NPU_COMPATIBILITY for value: "NPU_COMPATIBILITY"
     */
    public static final ReqInspectionItemType NPU_COMPATIBILITY = new ReqInspectionItemType("NPU_COMPATIBILITY");

    /**
     * Enum ASCEND_DMI_CANN for value: "ASCEND_DMI_CANN"
     */
    public static final ReqInspectionItemType ASCEND_DMI_CANN = new ReqInspectionItemType("ASCEND_DMI_CANN");

    /**
     * Enum ASCEND_DMI_DRIVER for value: "ASCEND_DMI_DRIVER"
     */
    public static final ReqInspectionItemType ASCEND_DMI_DRIVER = new ReqInspectionItemType("ASCEND_DMI_DRIVER");

    /**
     * Enum ASCEND_DMI_NETWORK for value: "ASCEND_DMI_NETWORK"
     */
    public static final ReqInspectionItemType ASCEND_DMI_NETWORK = new ReqInspectionItemType("ASCEND_DMI_NETWORK");

    /**
     * Enum ASCEND_DMI_HBM for value: "ASCEND_DMI_HBM"
     */
    public static final ReqInspectionItemType ASCEND_DMI_HBM = new ReqInspectionItemType("ASCEND_DMI_HBM");

    /**
     * Enum ASCEND_DMI_SIGNAL_QUALITY for value: "ASCEND_DMI_SIGNAL_QUALITY"
     */
    public static final ReqInspectionItemType ASCEND_DMI_SIGNAL_QUALITY =
        new ReqInspectionItemType("ASCEND_DMI_SIGNAL_QUALITY");

    /**
     * Enum UDP_PORT for value: "UDP_PORT"
     */
    public static final ReqInspectionItemType UDP_PORT = new ReqInspectionItemType("UDP_PORT");

    /**
     * Enum DEEP_BAND_WIDTH for value: "DEEP_BAND_WIDTH"
     */
    public static final ReqInspectionItemType DEEP_BAND_WIDTH = new ReqInspectionItemType("DEEP_BAND_WIDTH");

    /**
     * Enum DEEP_AI_FLOPS for value: "DEEP_AI_FLOPS"
     */
    public static final ReqInspectionItemType DEEP_AI_FLOPS = new ReqInspectionItemType("DEEP_AI_FLOPS");

    /**
     * Enum DEEP_EYE_DIAGRAM for value: "DEEP_EYE_DIAGRAM"
     */
    public static final ReqInspectionItemType DEEP_EYE_DIAGRAM = new ReqInspectionItemType("DEEP_EYE_DIAGRAM");

    /**
     * Enum DEEP_AI_CORE for value: "DEEP_AI_CORE"
     */
    public static final ReqInspectionItemType DEEP_AI_CORE = new ReqInspectionItemType("DEEP_AI_CORE");

    /**
     * Enum DEEP_HBM for value: "DEEP_HBM"
     */
    public static final ReqInspectionItemType DEEP_HBM = new ReqInspectionItemType("DEEP_HBM");

    /**
     * Enum DEEP_P2P for value: "DEEP_P2P"
     */
    public static final ReqInspectionItemType DEEP_P2P = new ReqInspectionItemType("DEEP_P2P");

    /**
     * Enum DEEP_SINGLE_HCCL for value: "DEEP_SINGLE_HCCL"
     */
    public static final ReqInspectionItemType DEEP_SINGLE_HCCL = new ReqInspectionItemType("DEEP_SINGLE_HCCL");

    /**
     * Enum DEEP_MULTI_HCCL for value: "DEEP_MULTI_HCCL"
     */
    public static final ReqInspectionItemType DEEP_MULTI_HCCL = new ReqInspectionItemType("DEEP_MULTI_HCCL");

    /**
     * Enum NPU_MODEL for value: "NPU_MODEL"
     */
    public static final ReqInspectionItemType NPU_MODEL = new ReqInspectionItemType("NPU_MODEL");

    /**
     * Enum NPU_FIRMWARE for value: "NPU_FIRMWARE"
     */
    public static final ReqInspectionItemType NPU_FIRMWARE = new ReqInspectionItemType("NPU_FIRMWARE");

    /**
     * Enum NPU_MCU for value: "NPU_MCU"
     */
    public static final ReqInspectionItemType NPU_MCU = new ReqInspectionItemType("NPU_MCU");

    /**
     * Enum NPU_VRD for value: "NPU_VRD"
     */
    public static final ReqInspectionItemType NPU_VRD = new ReqInspectionItemType("NPU_VRD");

    /**
     * Enum ROCE_TEST for value: "ROCE_TEST"
     */
    public static final ReqInspectionItemType ROCE_TEST = new ReqInspectionItemType("ROCE_TEST");

    /**
     * Enum HYPER_PLANE for value: "HYPER_PLANE"
     */
    public static final ReqInspectionItemType HYPER_PLANE = new ReqInspectionItemType("HYPER_PLANE");

    /**
     * Enum CONTAINER_TYPE_VERSION for value: "CONTAINER_TYPE_VERSION"
     */
    public static final ReqInspectionItemType CONTAINER_TYPE_VERSION =
        new ReqInspectionItemType("CONTAINER_TYPE_VERSION");

    /**
     * Enum DATA_DISK_PARTITION_TYPE for value: "DATA_DISK_PARTITION_TYPE"
     */
    public static final ReqInspectionItemType DATA_DISK_PARTITION_TYPE =
        new ReqInspectionItemType("DATA_DISK_PARTITION_TYPE");

    /**
     * Enum LOCAL_DISK_USAGE for value: "LOCAL_DISK_USAGE"
     */
    public static final ReqInspectionItemType LOCAL_DISK_USAGE = new ReqInspectionItemType("LOCAL_DISK_USAGE");

    /**
     * Enum NPU_PROC_RESIDUAL for value: "NPU_PROC_RESIDUAL"
     */
    public static final ReqInspectionItemType NPU_PROC_RESIDUAL = new ReqInspectionItemType("NPU_PROC_RESIDUAL");

    /**
     * Enum MAIN_NETWORK_CARD_MTU for value: "MAIN_NETWORK_CARD_MTU"
     */
    public static final ReqInspectionItemType MAIN_NETWORK_CARD_MTU =
        new ReqInspectionItemType("MAIN_NETWORK_CARD_MTU");

    /**
     * Enum ROCE_NETWORK_CARD_MTU for value: "ROCE_NETWORK_CARD_MTU"
     */
    public static final ReqInspectionItemType ROCE_NETWORK_CARD_MTU =
        new ReqInspectionItemType("ROCE_NETWORK_CARD_MTU");

    /**
     * Enum NPU_RESERVED_PORT for value: "NPU_RESERVED_PORT"
     */
    public static final ReqInspectionItemType NPU_RESERVED_PORT = new ReqInspectionItemType("NPU_RESERVED_PORT");

    /**
     * Enum ENABLE_PFC_PRIORITY_QUEUE for value: "ENABLE_PFC_PRIORITY_QUEUE"
     */
    public static final ReqInspectionItemType ENABLE_PFC_PRIORITY_QUEUE =
        new ReqInspectionItemType("ENABLE_PFC_PRIORITY_QUEUE");

    /**
     * Enum PFC_WATERLINE for value: "PFC_WATERLINE"
     */
    public static final ReqInspectionItemType PFC_WATERLINE = new ReqInspectionItemType("PFC_WATERLINE");

    /**
     * Enum SFS_CLIENT_OS_BUFFER_SIZE for value: "SFS_CLIENT_OS_BUFFER_SIZE"
     */
    public static final ReqInspectionItemType SFS_CLIENT_OS_BUFFER_SIZE =
        new ReqInspectionItemType("SFS_CLIENT_OS_BUFFER_SIZE");

    /**
     * Enum NPU_PCIE for value: "NPU_PCIE"
     */
    public static final ReqInspectionItemType NPU_PCIE = new ReqInspectionItemType("NPU_PCIE");

    /**
     * Enum NPU_LINK for value: "NPU_LINK"
     */
    public static final ReqInspectionItemType NPU_LINK = new ReqInspectionItemType("NPU_LINK");

    /**
     * Enum NPU_NET_HEALTH for value: "NPU_NET_HEALTH"
     */
    public static final ReqInspectionItemType NPU_NET_HEALTH = new ReqInspectionItemType("NPU_NET_HEALTH");

    /**
     * Enum NPU_LINK_STAT for value: "NPU_LINK_STAT"
     */
    public static final ReqInspectionItemType NPU_LINK_STAT = new ReqInspectionItemType("NPU_LINK_STAT");

    /**
     * Enum NPU_WARN for value: "NPU_WARN"
     */
    public static final ReqInspectionItemType NPU_WARN = new ReqInspectionItemType("NPU_WARN");

    /**
     * Enum NPU_VRAM_RESIDUAL for value: "NPU_VRAM_RESIDUAL"
     */
    public static final ReqInspectionItemType NPU_VRAM_RESIDUAL = new ReqInspectionItemType("NPU_VRAM_RESIDUAL");

    /**
     * Enum NPU_TLS for value: "NPU_TLS"
     */
    public static final ReqInspectionItemType NPU_TLS = new ReqInspectionItemType("NPU_TLS");

    /**
     * Enum NPU_HCCS_HEALTH for value: "NPU_HCCS_HEALTH"
     */
    public static final ReqInspectionItemType NPU_HCCS_HEALTH = new ReqInspectionItemType("NPU_HCCS_HEALTH");

    /**
     * Enum NPU_OPTICAL for value: "NPU_OPTICAL"
     */
    public static final ReqInspectionItemType NPU_OPTICAL = new ReqInspectionItemType("NPU_OPTICAL");

    /**
     * Enum NPU_MEDIA_SNR for value: "NPU_MEDIA_SNR"
     */
    public static final ReqInspectionItemType NPU_MEDIA_SNR = new ReqInspectionItemType("NPU_MEDIA_SNR");

    /**
     * Enum NPU_HOST_SNR for value: "NPU_HOST_SNR"
     */
    public static final ReqInspectionItemType NPU_HOST_SNR = new ReqInspectionItemType("NPU_HOST_SNR");

    /**
     * Enum NPU_SERDES for value: "NPU_SERDES"
     */
    public static final ReqInspectionItemType NPU_SERDES = new ReqInspectionItemType("NPU_SERDES");

    /**
     * Enum PORT_DOWNGRADE for value: "PORT_DOWNGRADE"
     */
    public static final ReqInspectionItemType PORT_DOWNGRADE = new ReqInspectionItemType("PORT_DOWNGRADE");

    /**
     * Enum HBM_DOUBLE_BIT_ERROR for value: "HBM_DOUBLE_BIT_ERROR"
     */
    public static final ReqInspectionItemType HBM_DOUBLE_BIT_ERROR = new ReqInspectionItemType("HBM_DOUBLE_BIT_ERROR");

    /**
     * Enum NPU_CDR_SNR for value: "NPU_CDR_SNR"
     */
    public static final ReqInspectionItemType NPU_CDR_SNR = new ReqInspectionItemType("NPU_CDR_SNR");

    private static final Map<String, ReqInspectionItemType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ReqInspectionItemType> createStaticFields() {
        Map<String, ReqInspectionItemType> map = new HashMap<>();
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

    ReqInspectionItemType(String value) {
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
    public static ReqInspectionItemType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReqInspectionItemType(value));
    }

    public static ReqInspectionItemType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ReqInspectionItemType) {
            return this.value.equals(((ReqInspectionItemType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
