package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceProductDataObjectInfo
 */
public class ResourceProductDataObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Object chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_info")

    private Map<String, List<ShowPeriodResponseInfo>> versionInfo = null;

    public ResourceProductDataObjectInfo withChargingMode(Object chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式   - packet_cycle : 包周期   - on_demand : 按需
     * @return chargingMode
     */
    public Object getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Object chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ResourceProductDataObjectInfo withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续费
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ResourceProductDataObjectInfo withVersionInfo(Map<String, List<ShowPeriodResponseInfo>> versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    public ResourceProductDataObjectInfo putVersionInfoItem(String key, List<ShowPeriodResponseInfo> versionInfoItem) {
        if (this.versionInfo == null) {
            this.versionInfo = new HashMap<>();
        }
        this.versionInfo.put(key, versionInfoItem);
        return this;
    }

    public ResourceProductDataObjectInfo withVersionInfo(
        Consumer<Map<String, List<ShowPeriodResponseInfo>>> versionInfoSetter) {
        if (this.versionInfo == null) {
            this.versionInfo = new HashMap<>();
        }
        versionInfoSetter.accept(this.versionInfo);
        return this;
    }

    /**
     * 版本信息,key对应的值为主机开通的版本，包含如下6种输入：   - hss.version.basic ：基础版。   - hss.version.advanced ：专业版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。   - hss.version.container.enterprise ：容器版。
     * @return versionInfo
     */
    public Map<String, List<ShowPeriodResponseInfo>> getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(Map<String, List<ShowPeriodResponseInfo>> versionInfo) {
        this.versionInfo = versionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceProductDataObjectInfo that = (ResourceProductDataObjectInfo) obj;
        return Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.versionInfo, that.versionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, isAutoRenew, versionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceProductDataObjectInfo {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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
