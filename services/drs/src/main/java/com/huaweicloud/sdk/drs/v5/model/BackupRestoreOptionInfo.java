package com.huaweicloud.sdk.drs.v5.model;

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
 * 备份迁移参数。
 */
public class BackupRestoreOptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cover")

    private Boolean isCover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_restore")

    private Boolean isDefaultRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_last_backup")

    private Boolean isLastBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_precheck")

    private Boolean isPrecheck;

    /**
     * 恢复模式：  “full”表示全量迁移。  “incre”表示增量迁移 。
     */
    public static final class RecoveryModeEnum {

        /**
         * Enum FULL for value: "full"
         */
        public static final RecoveryModeEnum FULL = new RecoveryModeEnum("full");

        /**
         * Enum INCRE for value: "incre"
         */
        public static final RecoveryModeEnum INCRE = new RecoveryModeEnum("incre");

        private static final Map<String, RecoveryModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecoveryModeEnum> createStaticFields() {
            Map<String, RecoveryModeEnum> map = new HashMap<>();
            map.put("full", FULL);
            map.put("incre", INCRE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecoveryModeEnum(String value) {
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
        public static RecoveryModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecoveryModeEnum(value));
        }

        public static RecoveryModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecoveryModeEnum) {
                return this.value.equals(((RecoveryModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_mode")

    private RecoveryModeEnum recoveryMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private List<String> dbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_db_name_map")

    private Map<String, String> resetDbNameMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_backup_file")

    private Boolean isDeleteBackupFile;

    public BackupRestoreOptionInfo withIsCover(Boolean isCover) {
        this.isCover = isCover;
        return this;
    }

    /**
     * 是否覆盖目标数据库，不填默认为false。  值为“true”表示覆盖。  值为“false”表示不覆盖。
     * @return isCover
     */
    public Boolean getIsCover() {
        return isCover;
    }

    public void setIsCover(Boolean isCover) {
        this.isCover = isCover;
    }

    public BackupRestoreOptionInfo withIsDefaultRestore(Boolean isDefaultRestore) {
        this.isDefaultRestore = isDefaultRestore;
        return this;
    }

    /**
     * 是否默认恢复，默认恢复所有数据库。  “true”是代表默认恢复还原备份文件中的全部数据库。  “false”代表需要在db_names这个字段中指定需要恢复的数据库名。
     * @return isDefaultRestore
     */
    public Boolean getIsDefaultRestore() {
        return isDefaultRestore;
    }

    public void setIsDefaultRestore(Boolean isDefaultRestore) {
        this.isDefaultRestore = isDefaultRestore;
    }

    public BackupRestoreOptionInfo withIsLastBackup(Boolean isLastBackup) {
        this.isLastBackup = isLastBackup;
        return this;
    }

    /**
     * 一次典型的增量恢复过程，会涉及多次恢复增量备份。每个增量备份恢复均会使目标数据库保持还原中状态，此时数据库不可读写，直至最后一个增量备份恢复完成后，数据库才能变成可用状态。此后数据库将无法继续进行增量恢复，所以确定为最后一个备份的场景有：  一次性全量迁移，后续将不再进行增量恢复时，设置该字段值为“true”。  增量恢复流程中，确定为最后割接阶段的最后一个增量备份时，设置该字段值为“false”。
     * @return isLastBackup
     */
    public Boolean getIsLastBackup() {
        return isLastBackup;
    }

    public void setIsLastBackup(Boolean isLastBackup) {
        this.isLastBackup = isLastBackup;
    }

    public BackupRestoreOptionInfo withIsPrecheck(Boolean isPrecheck) {
        this.isPrecheck = isPrecheck;
        return this;
    }

    /**
     * 是否执行预校验。 true：执行。 false：不执行。
     * @return isPrecheck
     */
    public Boolean getIsPrecheck() {
        return isPrecheck;
    }

    public void setIsPrecheck(Boolean isPrecheck) {
        this.isPrecheck = isPrecheck;
    }

    public BackupRestoreOptionInfo withRecoveryMode(RecoveryModeEnum recoveryMode) {
        this.recoveryMode = recoveryMode;
        return this;
    }

    /**
     * 恢复模式：  “full”表示全量迁移。  “incre”表示增量迁移 。
     * @return recoveryMode
     */
    public RecoveryModeEnum getRecoveryMode() {
        return recoveryMode;
    }

    public void setRecoveryMode(RecoveryModeEnum recoveryMode) {
        this.recoveryMode = recoveryMode;
    }

    public BackupRestoreOptionInfo withDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public BackupRestoreOptionInfo addDbNamesItem(String dbNamesItem) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbNamesItem);
        return this;
    }

    public BackupRestoreOptionInfo withDbNames(Consumer<List<String>> dbNamesSetter) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        dbNamesSetter.accept(this.dbNames);
        return this;
    }

    /**
     * 数据库名称。
     * @return dbNames
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }

    public BackupRestoreOptionInfo withResetDbNameMap(Map<String, String> resetDbNameMap) {
        this.resetDbNameMap = resetDbNameMap;
        return this;
    }

    public BackupRestoreOptionInfo putResetDbNameMapItem(String key, String resetDbNameMapItem) {
        if (this.resetDbNameMap == null) {
            this.resetDbNameMap = new HashMap<>();
        }
        this.resetDbNameMap.put(key, resetDbNameMapItem);
        return this;
    }

    public BackupRestoreOptionInfo withResetDbNameMap(Consumer<Map<String, String>> resetDbNameMapSetter) {
        if (this.resetDbNameMap == null) {
            this.resetDbNameMap = new HashMap<>();
        }
        resetDbNameMapSetter.accept(this.resetDbNameMap);
        return this;
    }

    /**
     * 该字段为一个map，目前使用格式key是\"\"，value是新数据库名字。 该功能将忽略备份文件中原有的数据库名，通过DRS将其恢复为指定的新数据库名。 使用条件： - 备份文件中只有一个数据库。 - 备份文件是全量备份类型（待恢复备份类型选择：全量备份），且是一次性恢复（最后一个备份选择：是）。
     * @return resetDbNameMap
     */
    public Map<String, String> getResetDbNameMap() {
        return resetDbNameMap;
    }

    public void setResetDbNameMap(Map<String, String> resetDbNameMap) {
        this.resetDbNameMap = resetDbNameMap;
    }

    public BackupRestoreOptionInfo withIsDeleteBackupFile(Boolean isDeleteBackupFile) {
        this.isDeleteBackupFile = isDeleteBackupFile;
        return this;
    }

    /**
     * 该参数控制使用OBS桶中备份文件恢复时，当任务结束时是否删除下载到RDS for SQL server磁盘中的OBS备份文件，默认删除。 - true 删除 - false 不删除
     * @return isDeleteBackupFile
     */
    public Boolean getIsDeleteBackupFile() {
        return isDeleteBackupFile;
    }

    public void setIsDeleteBackupFile(Boolean isDeleteBackupFile) {
        this.isDeleteBackupFile = isDeleteBackupFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupRestoreOptionInfo that = (BackupRestoreOptionInfo) obj;
        return Objects.equals(this.isCover, that.isCover)
            && Objects.equals(this.isDefaultRestore, that.isDefaultRestore)
            && Objects.equals(this.isLastBackup, that.isLastBackup) && Objects.equals(this.isPrecheck, that.isPrecheck)
            && Objects.equals(this.recoveryMode, that.recoveryMode) && Objects.equals(this.dbNames, that.dbNames)
            && Objects.equals(this.resetDbNameMap, that.resetDbNameMap)
            && Objects.equals(this.isDeleteBackupFile, that.isDeleteBackupFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCover,
            isDefaultRestore,
            isLastBackup,
            isPrecheck,
            recoveryMode,
            dbNames,
            resetDbNameMap,
            isDeleteBackupFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestoreOptionInfo {\n");
        sb.append("    isCover: ").append(toIndentedString(isCover)).append("\n");
        sb.append("    isDefaultRestore: ").append(toIndentedString(isDefaultRestore)).append("\n");
        sb.append("    isLastBackup: ").append(toIndentedString(isLastBackup)).append("\n");
        sb.append("    isPrecheck: ").append(toIndentedString(isPrecheck)).append("\n");
        sb.append("    recoveryMode: ").append(toIndentedString(recoveryMode)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    resetDbNameMap: ").append(toIndentedString(resetDbNameMap)).append("\n");
        sb.append("    isDeleteBackupFile: ").append(toIndentedString(isDeleteBackupFile)).append("\n");
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
