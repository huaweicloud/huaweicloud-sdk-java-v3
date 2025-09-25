package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 周期镜像扫描策略
 */
public class CycleImageScanPolicyReqInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_cycle")

    private Integer scanCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_scope")

    private Integer scanScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_scope")

    private Integer timeScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_info")

    private List<CycleImageScanPolicyReqInfoRegistryInfo> registryInfo = null;

    public CycleImageScanPolicyReqInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 定时扫描策略开关
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CycleImageScanPolicyReqInfo withScanCycle(Integer scanCycle) {
        this.scanCycle = scanCycle;
        return this;
    }

    /**
     * 定时扫描周期 | 3 每三天 7 每一周 14 每两周
     * minimum: 0
     * maximum: 31
     * @return scanCycle
     */
    public Integer getScanCycle() {
        return scanCycle;
    }

    public void setScanCycle(Integer scanCycle) {
        this.scanCycle = scanCycle;
    }

    public CycleImageScanPolicyReqInfo withScanScope(Integer scanScope) {
        this.scanScope = scanScope;
        return this;
    }

    /**
     * 扫描风险类型 | 0:无 0x7fffffff:全部 0x000f0000:漏洞 0x0000f000:基线检查 0x00000f00:恶意文件 0x000000f0:敏感信息 0x0000000f:软件合规
     * minimum: 0
     * maximum: 2147483547
     * @return scanScope
     */
    public Integer getScanScope() {
        return scanScope;
    }

    public void setScanScope(Integer scanScope) {
        this.scanScope = scanScope;
    }

    public CycleImageScanPolicyReqInfo withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * 扫描限速 单位：个/h | 0 不限制
     * minimum: 0
     * maximum: 1001
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public CycleImageScanPolicyReqInfo withTimeScope(Integer timeScope) {
        this.timeScope = timeScope;
        return this;
    }

    /**
     * 时间范围 单位：天 | 0 全部镜像 1 3 7
     * minimum: 0
     * maximum: 365
     * @return timeScope
     */
    public Integer getTimeScope() {
        return timeScope;
    }

    public void setTimeScope(Integer timeScope) {
        this.timeScope = timeScope;
    }

    public CycleImageScanPolicyReqInfo withRegistryInfo(List<CycleImageScanPolicyReqInfoRegistryInfo> registryInfo) {
        this.registryInfo = registryInfo;
        return this;
    }

    public CycleImageScanPolicyReqInfo addRegistryInfoItem(CycleImageScanPolicyReqInfoRegistryInfo registryInfoItem) {
        if (this.registryInfo == null) {
            this.registryInfo = new ArrayList<>();
        }
        this.registryInfo.add(registryInfoItem);
        return this;
    }

    public CycleImageScanPolicyReqInfo withRegistryInfo(
        Consumer<List<CycleImageScanPolicyReqInfoRegistryInfo>> registryInfoSetter) {
        if (this.registryInfo == null) {
            this.registryInfo = new ArrayList<>();
        }
        registryInfoSetter.accept(this.registryInfo);
        return this;
    }

    /**
     * 镜像仓库列表
     * @return registryInfo
     */
    public List<CycleImageScanPolicyReqInfoRegistryInfo> getRegistryInfo() {
        return registryInfo;
    }

    public void setRegistryInfo(List<CycleImageScanPolicyReqInfoRegistryInfo> registryInfo) {
        this.registryInfo = registryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CycleImageScanPolicyReqInfo that = (CycleImageScanPolicyReqInfo) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.scanCycle, that.scanCycle)
            && Objects.equals(this.scanScope, that.scanScope) && Objects.equals(this.rateLimit, that.rateLimit)
            && Objects.equals(this.timeScope, that.timeScope) && Objects.equals(this.registryInfo, that.registryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, scanCycle, scanScope, rateLimit, timeScope, registryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CycleImageScanPolicyReqInfo {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    scanCycle: ").append(toIndentedString(scanCycle)).append("\n");
        sb.append("    scanScope: ").append(toIndentedString(scanScope)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    timeScope: ").append(toIndentedString(timeScope)).append("\n");
        sb.append("    registryInfo: ").append(toIndentedString(registryInfo)).append("\n");
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
