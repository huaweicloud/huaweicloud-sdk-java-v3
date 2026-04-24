package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面资源包。
 */
public class DesktopResourceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_package_name")

    private String resourcePackageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_resource_spec_code")

    private String desktopResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    public DesktopResourceItem withResourcePackageName(String resourcePackageName) {
        this.resourcePackageName = resourcePackageName;
        return this;
    }

    /**
     * 资源包名称。
     * @return resourcePackageName
     */
    public String getResourcePackageName() {
        return resourcePackageName;
    }

    public void setResourcePackageName(String resourcePackageName) {
        this.resourcePackageName = resourcePackageName;
    }

    public DesktopResourceItem withDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
        return this;
    }

    /**
     * 桌面产品编码。
     * @return desktopResourceSpecCode
     */
    public String getDesktopResourceSpecCode() {
        return desktopResourceSpecCode;
    }

    public void setDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
    }

    public DesktopResourceItem withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源包产品编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public DesktopResourceItem withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间，格式：yyyy-MM-ddTHH:mm:ssZ（2025-04-12T17:30:00Z）。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public DesktopResourceItem withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。
     * minimum: 0
     * maximum: 255
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopResourceItem that = (DesktopResourceItem) obj;
        return Objects.equals(this.resourcePackageName, that.resourcePackageName)
            && Objects.equals(this.desktopResourceSpecCode, that.desktopResourceSpecCode)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourcePackageName, desktopResourceSpecCode, resourceSpecCode, effectiveTime, isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopResourceItem {\n");
        sb.append("    resourcePackageName: ").append(toIndentedString(resourcePackageName)).append("\n");
        sb.append("    desktopResourceSpecCode: ").append(toIndentedString(desktopResourceSpecCode)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
