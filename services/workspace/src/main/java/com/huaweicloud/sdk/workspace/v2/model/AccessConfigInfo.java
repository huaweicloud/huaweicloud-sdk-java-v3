package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接入配置信息。
 */
public class AccessConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    /**
     * 备份模式是否开启。 - ON:开启。 - OFF:关闭。
     */
    public static final class BackupModeEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final BackupModeEnum ON = new BackupModeEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final BackupModeEnum OFF = new BackupModeEnum("OFF");

        private static final Map<String, BackupModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupModeEnum> createStaticFields() {
            Map<String, BackupModeEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupModeEnum(String value) {
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
        public static BackupModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackupModeEnum(value));
        }

        public static BackupModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupModeEnum) {
                return this.value.equals(((BackupModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_mode")

    private BackupModeEnum backupMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_info")

    private List<BackupInfo> backupInfo = null;

    public AccessConfigInfo withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点Id。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public AccessConfigInfo withBackupMode(BackupModeEnum backupMode) {
        this.backupMode = backupMode;
        return this;
    }

    /**
     * 备份模式是否开启。 - ON:开启。 - OFF:关闭。
     * @return backupMode
     */
    public BackupModeEnum getBackupMode() {
        return backupMode;
    }

    public void setBackupMode(BackupModeEnum backupMode) {
        this.backupMode = backupMode;
    }

    public AccessConfigInfo withBackupInfo(List<BackupInfo> backupInfo) {
        this.backupInfo = backupInfo;
        return this;
    }

    public AccessConfigInfo addBackupInfoItem(BackupInfo backupInfoItem) {
        if (this.backupInfo == null) {
            this.backupInfo = new ArrayList<>();
        }
        this.backupInfo.add(backupInfoItem);
        return this;
    }

    public AccessConfigInfo withBackupInfo(Consumer<List<BackupInfo>> backupInfoSetter) {
        if (this.backupInfo == null) {
            this.backupInfo = new ArrayList<>();
        }
        backupInfoSetter.accept(this.backupInfo);
        return this;
    }

    /**
     * 备份信息。
     * @return backupInfo
     */
    public List<BackupInfo> getBackupInfo() {
        return backupInfo;
    }

    public void setBackupInfo(List<BackupInfo> backupInfo) {
        this.backupInfo = backupInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigInfo that = (AccessConfigInfo) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.backupMode, that.backupMode)
            && Objects.equals(this.backupInfo, that.backupInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, backupMode, backupInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigInfo {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    backupMode: ").append(toIndentedString(backupMode)).append("\n");
        sb.append("    backupInfo: ").append(toIndentedString(backupInfo)).append("\n");
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
