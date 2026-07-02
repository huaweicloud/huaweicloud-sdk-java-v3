package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  打开或延期备份合规锁配置的请求体。  **约束限制**：  不涉及。
 */
public class BackupVaultLockRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_vaultlock_info")

    private BackupVaultLockInfoRequest backupVaultlockInfo;

    /**
     * **参数解释**：  操作类型。  **约束限制**：  当前只支持开启和延期。不区分大小写。  **取值范围**： - enable：开启。 - extend：延期。  **默认取值**：  enable。
     */
    public static final class ActionEnum {

        /**
         * Enum ENABLE for value: "enable"
         */
        public static final ActionEnum ENABLE = new ActionEnum("enable");

        /**
         * Enum EXTEND for value: "extend"
         */
        public static final ActionEnum EXTEND = new ActionEnum("extend");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("extend", EXTEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    public BackupVaultLockRequest withBackupVaultlockInfo(BackupVaultLockInfoRequest backupVaultlockInfo) {
        this.backupVaultlockInfo = backupVaultlockInfo;
        return this;
    }

    public BackupVaultLockRequest withBackupVaultlockInfo(
        Consumer<BackupVaultLockInfoRequest> backupVaultlockInfoSetter) {
        if (this.backupVaultlockInfo == null) {
            this.backupVaultlockInfo = new BackupVaultLockInfoRequest();
            backupVaultlockInfoSetter.accept(this.backupVaultlockInfo);
        }

        return this;
    }

    /**
     * Get backupVaultlockInfo
     * @return backupVaultlockInfo
     */
    public BackupVaultLockInfoRequest getBackupVaultlockInfo() {
        return backupVaultlockInfo;
    }

    public void setBackupVaultlockInfo(BackupVaultLockInfoRequest backupVaultlockInfo) {
        this.backupVaultlockInfo = backupVaultlockInfo;
    }

    public BackupVaultLockRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：  操作类型。  **约束限制**：  当前只支持开启和延期。不区分大小写。  **取值范围**： - enable：开启。 - extend：延期。  **默认取值**：  enable。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupVaultLockRequest that = (BackupVaultLockRequest) obj;
        return Objects.equals(this.backupVaultlockInfo, that.backupVaultlockInfo)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupVaultlockInfo, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupVaultLockRequest {\n");
        sb.append("    backupVaultlockInfo: ").append(toIndentedString(backupVaultlockInfo)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
