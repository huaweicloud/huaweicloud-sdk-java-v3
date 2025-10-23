package com.huaweicloud.sdk.bcc.v1.model;

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
 * 资源配置保护结构体
 */
public class ConfigureProtectionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    /**
     * 资源保护采用的方式。分为云备份cbr和数据库db
     */
    public static final class ProtectEngineEnum {

        /**
         * Enum CBR for value: "cbr"
         */
        public static final ProtectEngineEnum CBR = new ProtectEngineEnum("cbr");

        /**
         * Enum DB for value: "db"
         */
        public static final ProtectEngineEnum DB = new ProtectEngineEnum("db");

        private static final Map<String, ProtectEngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectEngineEnum> createStaticFields() {
            Map<String, ProtectEngineEnum> map = new HashMap<>();
            map.put("cbr", CBR);
            map.put("db", DB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectEngineEnum(String value) {
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
        public static ProtectEngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectEngineEnum(value));
        }

        public static ProtectEngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectEngineEnum) {
                return this.value.equals(((ProtectEngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_engine")

    private ProtectEngineEnum protectEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_vaults")

    private List<ConfigureVaultItem> localVaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_vaults")

    private List<ConfigureVaultItem> remoteVaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_backup_policy")

    private DbBackupPolicyBody dbBackupPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_offsite_backup_policy")

    private DbOffsiteBackupPolicyBody dbOffsiteBackupPolicy;

    public ConfigureProtectionBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public ConfigureProtectionBody addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ConfigureProtectionBody withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 资源ID列表
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public ConfigureProtectionBody withProtectEngine(ProtectEngineEnum protectEngine) {
        this.protectEngine = protectEngine;
        return this;
    }

    /**
     * 资源保护采用的方式。分为云备份cbr和数据库db
     * @return protectEngine
     */
    public ProtectEngineEnum getProtectEngine() {
        return protectEngine;
    }

    public void setProtectEngine(ProtectEngineEnum protectEngine) {
        this.protectEngine = protectEngine;
    }

    public ConfigureProtectionBody withLocalVaults(List<ConfigureVaultItem> localVaults) {
        this.localVaults = localVaults;
        return this;
    }

    public ConfigureProtectionBody addLocalVaultsItem(ConfigureVaultItem localVaultsItem) {
        if (this.localVaults == null) {
            this.localVaults = new ArrayList<>();
        }
        this.localVaults.add(localVaultsItem);
        return this;
    }

    public ConfigureProtectionBody withLocalVaults(Consumer<List<ConfigureVaultItem>> localVaultsSetter) {
        if (this.localVaults == null) {
            this.localVaults = new ArrayList<>();
        }
        localVaultsSetter.accept(this.localVaults);
        return this;
    }

    /**
     * Get localVaults
     * @return localVaults
     */
    public List<ConfigureVaultItem> getLocalVaults() {
        return localVaults;
    }

    public void setLocalVaults(List<ConfigureVaultItem> localVaults) {
        this.localVaults = localVaults;
    }

    public ConfigureProtectionBody withRemoteVaults(List<ConfigureVaultItem> remoteVaults) {
        this.remoteVaults = remoteVaults;
        return this;
    }

    public ConfigureProtectionBody addRemoteVaultsItem(ConfigureVaultItem remoteVaultsItem) {
        if (this.remoteVaults == null) {
            this.remoteVaults = new ArrayList<>();
        }
        this.remoteVaults.add(remoteVaultsItem);
        return this;
    }

    public ConfigureProtectionBody withRemoteVaults(Consumer<List<ConfigureVaultItem>> remoteVaultsSetter) {
        if (this.remoteVaults == null) {
            this.remoteVaults = new ArrayList<>();
        }
        remoteVaultsSetter.accept(this.remoteVaults);
        return this;
    }

    /**
     * Get remoteVaults
     * @return remoteVaults
     */
    public List<ConfigureVaultItem> getRemoteVaults() {
        return remoteVaults;
    }

    public void setRemoteVaults(List<ConfigureVaultItem> remoteVaults) {
        this.remoteVaults = remoteVaults;
    }

    public ConfigureProtectionBody withDbBackupPolicy(DbBackupPolicyBody dbBackupPolicy) {
        this.dbBackupPolicy = dbBackupPolicy;
        return this;
    }

    public ConfigureProtectionBody withDbBackupPolicy(Consumer<DbBackupPolicyBody> dbBackupPolicySetter) {
        if (this.dbBackupPolicy == null) {
            this.dbBackupPolicy = new DbBackupPolicyBody();
            dbBackupPolicySetter.accept(this.dbBackupPolicy);
        }

        return this;
    }

    /**
     * Get dbBackupPolicy
     * @return dbBackupPolicy
     */
    public DbBackupPolicyBody getDbBackupPolicy() {
        return dbBackupPolicy;
    }

    public void setDbBackupPolicy(DbBackupPolicyBody dbBackupPolicy) {
        this.dbBackupPolicy = dbBackupPolicy;
    }

    public ConfigureProtectionBody withDbOffsiteBackupPolicy(DbOffsiteBackupPolicyBody dbOffsiteBackupPolicy) {
        this.dbOffsiteBackupPolicy = dbOffsiteBackupPolicy;
        return this;
    }

    public ConfigureProtectionBody withDbOffsiteBackupPolicy(
        Consumer<DbOffsiteBackupPolicyBody> dbOffsiteBackupPolicySetter) {
        if (this.dbOffsiteBackupPolicy == null) {
            this.dbOffsiteBackupPolicy = new DbOffsiteBackupPolicyBody();
            dbOffsiteBackupPolicySetter.accept(this.dbOffsiteBackupPolicy);
        }

        return this;
    }

    /**
     * Get dbOffsiteBackupPolicy
     * @return dbOffsiteBackupPolicy
     */
    public DbOffsiteBackupPolicyBody getDbOffsiteBackupPolicy() {
        return dbOffsiteBackupPolicy;
    }

    public void setDbOffsiteBackupPolicy(DbOffsiteBackupPolicyBody dbOffsiteBackupPolicy) {
        this.dbOffsiteBackupPolicy = dbOffsiteBackupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigureProtectionBody that = (ConfigureProtectionBody) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.protectEngine, that.protectEngine)
            && Objects.equals(this.localVaults, that.localVaults)
            && Objects.equals(this.remoteVaults, that.remoteVaults)
            && Objects.equals(this.dbBackupPolicy, that.dbBackupPolicy)
            && Objects.equals(this.dbOffsiteBackupPolicy, that.dbOffsiteBackupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, protectEngine, localVaults, remoteVaults, dbBackupPolicy, dbOffsiteBackupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigureProtectionBody {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    protectEngine: ").append(toIndentedString(protectEngine)).append("\n");
        sb.append("    localVaults: ").append(toIndentedString(localVaults)).append("\n");
        sb.append("    remoteVaults: ").append(toIndentedString(remoteVaults)).append("\n");
        sb.append("    dbBackupPolicy: ").append(toIndentedString(dbBackupPolicy)).append("\n");
        sb.append("    dbOffsiteBackupPolicy: ").append(toIndentedString(dbOffsiteBackupPolicy)).append("\n");
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
