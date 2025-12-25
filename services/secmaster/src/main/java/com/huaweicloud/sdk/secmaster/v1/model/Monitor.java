package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 监视器
 */
public class Monitor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_idle")

    private String cpuIdle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private String cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_count")

    private String diskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_usage")

    private String diskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "down_pps")

    private String downPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_status")

    private NodeHealthStatus healthStatus;

    /**
     * **参数解释**: 节点是否成功收到心跳信号 - ONLINE 在线 - OFFLINE 离线  **约束限制** 不涉及 **取值范围**: - ONLINE - OFFLINE  **默认值** 不涉及
     */
    public static final class HeartBeatEnum {

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final HeartBeatEnum ONLINE = new HeartBeatEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final HeartBeatEnum OFFLINE = new HeartBeatEnum("OFFLINE");

        private static final Map<String, HeartBeatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HeartBeatEnum> createStaticFields() {
            Map<String, HeartBeatEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HeartBeatEnum(String value) {
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
        public static HeartBeatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HeartBeatEnum(value));
        }

        public static HeartBeatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HeartBeatEnum) {
                return this.value.equals(((HeartBeatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heart_beat")

    private HeartBeatEnum heartBeat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heart_beat_time")

    private Long heartBeatTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_cache")

    private String memoryCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_count")

    private String memoryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_free")

    private String memoryFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_shared")

    private String memoryShared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_usage")

    private String memoryUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mini_on_online")

    private String miniOnOnline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_rate")

    private String readRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up_pps")

    private String upPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_rate")

    private String writeRate;

    public Monitor withCpuIdle(String cpuIdle) {
        this.cpuIdle = cpuIdle;
        return this;
    }

    /**
     * CPU 空闲时间的百分比
     * @return cpuIdle
     */
    public String getCpuIdle() {
        return cpuIdle;
    }

    public void setCpuIdle(String cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

    public Monitor withCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * CPU 当前的使用率
     * @return cpuUsage
     */
    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Monitor withDiskCount(String diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    /**
     * 系统中磁盘设备的数量
     * @return diskCount
     */
    public String getDiskCount() {
        return diskCount;
    }

    public void setDiskCount(String diskCount) {
        this.diskCount = diskCount;
    }

    public Monitor withDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * 当前磁盘空间使用量
     * @return diskUsage
     */
    public String getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
    }

    public Monitor withDownPps(String downPps) {
        this.downPps = downPps;
        return this;
    }

    /**
     * 下载数据包每秒数量
     * @return downPps
     */
    public String getDownPps() {
        return downPps;
    }

    public void setDownPps(String downPps) {
        this.downPps = downPps;
    }

    public Monitor withHealthStatus(NodeHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     * @return healthStatus
     */
    public NodeHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(NodeHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Monitor withHeartBeat(HeartBeatEnum heartBeat) {
        this.heartBeat = heartBeat;
        return this;
    }

    /**
     * **参数解释**: 节点是否成功收到心跳信号 - ONLINE 在线 - OFFLINE 离线  **约束限制** 不涉及 **取值范围**: - ONLINE - OFFLINE  **默认值** 不涉及
     * @return heartBeat
     */
    public HeartBeatEnum getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(HeartBeatEnum heartBeat) {
        this.heartBeat = heartBeat;
    }

    public Monitor withHeartBeatTime(Long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
        return this;
    }

    /**
     * 最后一次接收到心跳信号的时间
     * minimum: 0
     * maximum: 9223372036854775800
     * @return heartBeatTime
     */
    public Long getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(Long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }

    public Monitor withMemoryCache(String memoryCache) {
        this.memoryCache = memoryCache;
        return this;
    }

    /**
     * 缓存数据的内存大小
     * @return memoryCache
     */
    public String getMemoryCache() {
        return memoryCache;
    }

    public void setMemoryCache(String memoryCache) {
        this.memoryCache = memoryCache;
    }

    public Monitor withMemoryCount(String memoryCount) {
        this.memoryCount = memoryCount;
        return this;
    }

    /**
     * 物理内存条数量
     * @return memoryCount
     */
    public String getMemoryCount() {
        return memoryCount;
    }

    public void setMemoryCount(String memoryCount) {
        this.memoryCount = memoryCount;
    }

    public Monitor withMemoryFree(String memoryFree) {
        this.memoryFree = memoryFree;
        return this;
    }

    /**
     * 当前空闲的物理内存量
     * @return memoryFree
     */
    public String getMemoryFree() {
        return memoryFree;
    }

    public void setMemoryFree(String memoryFree) {
        this.memoryFree = memoryFree;
    }

    public Monitor withMemoryShared(String memoryShared) {
        this.memoryShared = memoryShared;
        return this;
    }

    /**
     * 多个进程共享使用的内存总量
     * @return memoryShared
     */
    public String getMemoryShared() {
        return memoryShared;
    }

    public void setMemoryShared(String memoryShared) {
        this.memoryShared = memoryShared;
    }

    public Monitor withMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * 已使用的物理内存量
     * @return memoryUsage
     */
    public String getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Monitor withMiniOnOnline(String miniOnOnline) {
        this.miniOnOnline = miniOnOnline;
        return this;
    }

    /**
     * 是否在线
     * @return miniOnOnline
     */
    public String getMiniOnOnline() {
        return miniOnOnline;
    }

    public void setMiniOnOnline(String miniOnOnline) {
        this.miniOnOnline = miniOnOnline;
    }

    public Monitor withReadRate(String readRate) {
        this.readRate = readRate;
        return this;
    }

    /**
     * 磁盘读取速率
     * @return readRate
     */
    public String getReadRate() {
        return readRate;
    }

    public void setReadRate(String readRate) {
        this.readRate = readRate;
    }

    public Monitor withUpPps(String upPps) {
        this.upPps = upPps;
        return this;
    }

    /**
     * 上传数据包每秒数量
     * @return upPps
     */
    public String getUpPps() {
        return upPps;
    }

    public void setUpPps(String upPps) {
        this.upPps = upPps;
    }

    public Monitor withWriteRate(String writeRate) {
        this.writeRate = writeRate;
        return this;
    }

    /**
     * 磁盘写入速率
     * @return writeRate
     */
    public String getWriteRate() {
        return writeRate;
    }

    public void setWriteRate(String writeRate) {
        this.writeRate = writeRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Monitor that = (Monitor) obj;
        return Objects.equals(this.cpuIdle, that.cpuIdle) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.diskCount, that.diskCount) && Objects.equals(this.diskUsage, that.diskUsage)
            && Objects.equals(this.downPps, that.downPps) && Objects.equals(this.healthStatus, that.healthStatus)
            && Objects.equals(this.heartBeat, that.heartBeat) && Objects.equals(this.heartBeatTime, that.heartBeatTime)
            && Objects.equals(this.memoryCache, that.memoryCache) && Objects.equals(this.memoryCount, that.memoryCount)
            && Objects.equals(this.memoryFree, that.memoryFree) && Objects.equals(this.memoryShared, that.memoryShared)
            && Objects.equals(this.memoryUsage, that.memoryUsage)
            && Objects.equals(this.miniOnOnline, that.miniOnOnline) && Objects.equals(this.readRate, that.readRate)
            && Objects.equals(this.upPps, that.upPps) && Objects.equals(this.writeRate, that.writeRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuIdle,
            cpuUsage,
            diskCount,
            diskUsage,
            downPps,
            healthStatus,
            heartBeat,
            heartBeatTime,
            memoryCache,
            memoryCount,
            memoryFree,
            memoryShared,
            memoryUsage,
            miniOnOnline,
            readRate,
            upPps,
            writeRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Monitor {\n");
        sb.append("    cpuIdle: ").append(toIndentedString(cpuIdle)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    diskCount: ").append(toIndentedString(diskCount)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    downPps: ").append(toIndentedString(downPps)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    heartBeat: ").append(toIndentedString(heartBeat)).append("\n");
        sb.append("    heartBeatTime: ").append(toIndentedString(heartBeatTime)).append("\n");
        sb.append("    memoryCache: ").append(toIndentedString(memoryCache)).append("\n");
        sb.append("    memoryCount: ").append(toIndentedString(memoryCount)).append("\n");
        sb.append("    memoryFree: ").append(toIndentedString(memoryFree)).append("\n");
        sb.append("    memoryShared: ").append(toIndentedString(memoryShared)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    miniOnOnline: ").append(toIndentedString(miniOnOnline)).append("\n");
        sb.append("    readRate: ").append(toIndentedString(readRate)).append("\n");
        sb.append("    upPps: ").append(toIndentedString(upPps)).append("\n");
        sb.append("    writeRate: ").append(toIndentedString(writeRate)).append("\n");
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
