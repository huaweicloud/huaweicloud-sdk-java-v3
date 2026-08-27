package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 触发升级请求
 */
public class ExecuteTriggerUpgradeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_execute")

    private Integer isForceExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_notify")

    private Integer isNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_params")

    private String extraParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_sids")

    private List<String> desktopSids = null;

    public ExecuteTriggerUpgradeRequestBody withIsForceExecute(Integer isForceExecute) {
        this.isForceExecute = isForceExecute;
        return this;
    }

    /**
     * 是否强制升级：0-否 1-是
     * minimum: 0
     * maximum: 1
     * @return isForceExecute
     */
    public Integer getIsForceExecute() {
        return isForceExecute;
    }

    public void setIsForceExecute(Integer isForceExecute) {
        this.isForceExecute = isForceExecute;
    }

    public ExecuteTriggerUpgradeRequestBody withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ExecuteTriggerUpgradeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 升级任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExecuteTriggerUpgradeRequestBody withIsNotify(Integer isNotify) {
        this.isNotify = isNotify;
        return this;
    }

    /**
     * 通知开启：0-未开启 1-开启
     * minimum: 0
     * maximum: 1
     * @return isNotify
     */
    public Integer getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(Integer isNotify) {
        this.isNotify = isNotify;
    }

    public ExecuteTriggerUpgradeRequestBody withExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    /**
     * 扩展参数（JSON格式）
     * @return extraParams
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    public ExecuteTriggerUpgradeRequestBody withDesktopSids(List<String> desktopSids) {
        this.desktopSids = desktopSids;
        return this;
    }

    public ExecuteTriggerUpgradeRequestBody addDesktopSidsItem(String desktopSidsItem) {
        if (this.desktopSids == null) {
            this.desktopSids = new ArrayList<>();
        }
        this.desktopSids.add(desktopSidsItem);
        return this;
    }

    public ExecuteTriggerUpgradeRequestBody withDesktopSids(Consumer<List<String>> desktopSidsSetter) {
        if (this.desktopSids == null) {
            this.desktopSids = new ArrayList<>();
        }
        desktopSidsSetter.accept(this.desktopSids);
        return this;
    }

    /**
     * 桌面sids列表
     * @return desktopSids
     */
    public List<String> getDesktopSids() {
        return desktopSids;
    }

    public void setDesktopSids(List<String> desktopSids) {
        this.desktopSids = desktopSids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteTriggerUpgradeRequestBody that = (ExecuteTriggerUpgradeRequestBody) obj;
        return Objects.equals(this.isForceExecute, that.isForceExecute)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isNotify, that.isNotify)
            && Objects.equals(this.extraParams, that.extraParams) && Objects.equals(this.desktopSids, that.desktopSids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isForceExecute, targetVersion, description, isNotify, extraParams, desktopSids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTriggerUpgradeRequestBody {\n");
        sb.append("    isForceExecute: ").append(toIndentedString(isForceExecute)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isNotify: ").append(toIndentedString(isNotify)).append("\n");
        sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
        sb.append("    desktopSids: ").append(toIndentedString(desktopSids)).append("\n");
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
