package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListImageScanPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all")

    private Boolean isAll;

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
    @JsonProperty(value = "total_registry_num")

    private Integer totalRegistryNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_list")

    private List<ImageScanPolicyRespInfoRegistryList> registryList = null;

    public ListImageScanPolicyResponse withIsAll(Boolean isAll) {
        this.isAll = isAll;
        return this;
    }

    /**
     * 扫描全部镜像 | true:扫描全部镜像 false:指定镜像扫描
     * @return isAll
     */
    public Boolean getIsAll() {
        return isAll;
    }

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public ListImageScanPolicyResponse withEnabled(Boolean enabled) {
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

    public ListImageScanPolicyResponse withScanCycle(Integer scanCycle) {
        this.scanCycle = scanCycle;
        return this;
    }

    /**
     * 定时扫描周期 | 3 每三天 7 每一周 14 每两周
     * @return scanCycle
     */
    public Integer getScanCycle() {
        return scanCycle;
    }

    public void setScanCycle(Integer scanCycle) {
        this.scanCycle = scanCycle;
    }

    public ListImageScanPolicyResponse withScanScope(Integer scanScope) {
        this.scanScope = scanScope;
        return this;
    }

    /**
     * 扫描风险类型 | 0:无 0x0fffff:全部 0x0f0000:漏洞 0x00f000:基线检查 0x000f00:恶意文件 0x0000f0:敏感信息 0x00000f:软件合规
     * @return scanScope
     */
    public Integer getScanScope() {
        return scanScope;
    }

    public void setScanScope(Integer scanScope) {
        this.scanScope = scanScope;
    }

    public ListImageScanPolicyResponse withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * 扫描限速 单位：个/h | 0 不限制
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ListImageScanPolicyResponse withTimeScope(Integer timeScope) {
        this.timeScope = timeScope;
        return this;
    }

    /**
     * 时间范围 单位：天 | 0 全部镜像 1 3 7
     * @return timeScope
     */
    public Integer getTimeScope() {
        return timeScope;
    }

    public void setTimeScope(Integer timeScope) {
        this.timeScope = timeScope;
    }

    public ListImageScanPolicyResponse withTotalRegistryNum(Integer totalRegistryNum) {
        this.totalRegistryNum = totalRegistryNum;
        return this;
    }

    /**
     * 镜像仓库列表总数
     * @return totalRegistryNum
     */
    public Integer getTotalRegistryNum() {
        return totalRegistryNum;
    }

    public void setTotalRegistryNum(Integer totalRegistryNum) {
        this.totalRegistryNum = totalRegistryNum;
    }

    public ListImageScanPolicyResponse withRegistryList(List<ImageScanPolicyRespInfoRegistryList> registryList) {
        this.registryList = registryList;
        return this;
    }

    public ListImageScanPolicyResponse addRegistryListItem(ImageScanPolicyRespInfoRegistryList registryListItem) {
        if (this.registryList == null) {
            this.registryList = new ArrayList<>();
        }
        this.registryList.add(registryListItem);
        return this;
    }

    public ListImageScanPolicyResponse withRegistryList(
        Consumer<List<ImageScanPolicyRespInfoRegistryList>> registryListSetter) {
        if (this.registryList == null) {
            this.registryList = new ArrayList<>();
        }
        registryListSetter.accept(this.registryList);
        return this;
    }

    /**
     * 镜像列表
     * @return registryList
     */
    public List<ImageScanPolicyRespInfoRegistryList> getRegistryList() {
        return registryList;
    }

    public void setRegistryList(List<ImageScanPolicyRespInfoRegistryList> registryList) {
        this.registryList = registryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageScanPolicyResponse that = (ListImageScanPolicyResponse) obj;
        return Objects.equals(this.isAll, that.isAll) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.scanCycle, that.scanCycle) && Objects.equals(this.scanScope, that.scanScope)
            && Objects.equals(this.rateLimit, that.rateLimit) && Objects.equals(this.timeScope, that.timeScope)
            && Objects.equals(this.totalRegistryNum, that.totalRegistryNum)
            && Objects.equals(this.registryList, that.registryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAll, enabled, scanCycle, scanScope, rateLimit, timeScope, totalRegistryNum, registryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageScanPolicyResponse {\n");
        sb.append("    isAll: ").append(toIndentedString(isAll)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    scanCycle: ").append(toIndentedString(scanCycle)).append("\n");
        sb.append("    scanScope: ").append(toIndentedString(scanScope)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    timeScope: ").append(toIndentedString(timeScope)).append("\n");
        sb.append("    totalRegistryNum: ").append(toIndentedString(totalRegistryNum)).append("\n");
        sb.append("    registryList: ").append(toIndentedString(registryList)).append("\n");
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
