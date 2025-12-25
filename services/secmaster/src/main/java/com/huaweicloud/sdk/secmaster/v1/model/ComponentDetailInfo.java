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
 * 插件定义简介
 */
public class ComponentDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_version")

    private String historyVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainer")

    private String maintainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    /**
     * **参数解释**: 升级 - NEED_UPGRADE 需要升级 - UPGRADING 升级中 - SUCCESS_UPGRADE 升级成功 - FAIL_UPGRADE 升级失败  **约束限制** 不涉及 **取值范围**: - NEED_UPGRADE - UPGRADING - SUCCESS_UPGRADE - FAIL_UPGRADE  **默认值** 不涉及
     */
    public static final class UpgradeEnum {

        /**
         * Enum NEED_UPGRADE for value: "NEED_UPGRADE"
         */
        public static final UpgradeEnum NEED_UPGRADE = new UpgradeEnum("NEED_UPGRADE");

        /**
         * Enum UPGRADING for value: "UPGRADING"
         */
        public static final UpgradeEnum UPGRADING = new UpgradeEnum("UPGRADING");

        /**
         * Enum SUCCESS_UPGRADE for value: "SUCCESS_UPGRADE"
         */
        public static final UpgradeEnum SUCCESS_UPGRADE = new UpgradeEnum("SUCCESS_UPGRADE");

        /**
         * Enum FAIL_UPGRADE for value: "FAIL_UPGRADE"
         */
        public static final UpgradeEnum FAIL_UPGRADE = new UpgradeEnum("FAIL_UPGRADE");

        private static final Map<String, UpgradeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeEnum> createStaticFields() {
            Map<String, UpgradeEnum> map = new HashMap<>();
            map.put("NEED_UPGRADE", NEED_UPGRADE);
            map.put("UPGRADING", UPGRADING);
            map.put("SUCCESS_UPGRADE", SUCCESS_UPGRADE);
            map.put("FAIL_UPGRADE", FAIL_UPGRADE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpgradeEnum(String value) {
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
        public static UpgradeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeEnum(value));
        }

        public static UpgradeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradeEnum) {
                return this.value.equals(((UpgradeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade")

    private UpgradeEnum upgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_fail_message")

    private String upgradeFailMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ComponentDetailInfo withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id.
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ComponentDetailInfo withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ComponentDetailInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ComponentDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 相关描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentDetailInfo withHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }

    /**
     * 历史版本
     * @return historyVersion
     */
    public String getHistoryVersion() {
        return historyVersion;
    }

    public void setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
    }

    public ComponentDetailInfo withMaintainer(String maintainer) {
        this.maintainer = maintainer;
        return this;
    }

    /**
     * 保持
     * @return maintainer
     */
    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public ComponentDetailInfo withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ComponentDetailInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ComponentDetailInfo withUpgrade(UpgradeEnum upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * **参数解释**: 升级 - NEED_UPGRADE 需要升级 - UPGRADING 升级中 - SUCCESS_UPGRADE 升级成功 - FAIL_UPGRADE 升级失败  **约束限制** 不涉及 **取值范围**: - NEED_UPGRADE - UPGRADING - SUCCESS_UPGRADE - FAIL_UPGRADE  **默认值** 不涉及
     * @return upgrade
     */
    public UpgradeEnum getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(UpgradeEnum upgrade) {
        this.upgrade = upgrade;
    }

    public ComponentDetailInfo withUpgradeFailMessage(String upgradeFailMessage) {
        this.upgradeFailMessage = upgradeFailMessage;
        return this;
    }

    /**
     * 更新失败的消息
     * @return upgradeFailMessage
     */
    public String getUpgradeFailMessage() {
        return upgradeFailMessage;
    }

    public void setUpgradeFailMessage(String upgradeFailMessage) {
        this.upgradeFailMessage = upgradeFailMessage;
    }

    public ComponentDetailInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安全云脑版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentDetailInfo that = (ComponentDetailInfo) obj;
        return Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.historyVersion, that.historyVersion)
            && Objects.equals(this.maintainer, that.maintainer) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.upgrade, that.upgrade)
            && Objects.equals(this.upgradeFailMessage, that.upgradeFailMessage)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId,
            componentName,
            createTime,
            description,
            historyVersion,
            maintainer,
            timeZone,
            updateTime,
            upgrade,
            upgradeFailMessage,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentDetailInfo {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    historyVersion: ").append(toIndentedString(historyVersion)).append("\n");
        sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
        sb.append("    upgradeFailMessage: ").append(toIndentedString(upgradeFailMessage)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
