package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置在线数据迁移任务结构体
 */
public class SetOnlineMigrationTaskBody {

    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。 - 全量迁移：该模式为Redis的一次性迁移，适用于可中断业务的迁移场景。   全量迁移过程中，如果源Redis有数据更新，这部分更新数据不会被迁移到目标Redis。 - 增量迁移：该模式为Redis的持续性迁移，适用于对业务中断敏感的迁移场景。   增量迁移阶段通过解析日志等技术， 持续保持源Redis和目标端Redis的数据一致。 取值范围： - full_amount_migration：表示全量迁移。 - incremental_migration：表示增量迁移。 
     */
    public static final class MigrationMethodEnum {

        /**
         * Enum FULL_AMOUNT_MIGRATION for value: "full_amount_migration"
         */
        public static final MigrationMethodEnum FULL_AMOUNT_MIGRATION =
            new MigrationMethodEnum("full_amount_migration");

        /**
         * Enum INCREMENTAL_MIGRATION for value: "incremental_migration"
         */
        public static final MigrationMethodEnum INCREMENTAL_MIGRATION =
            new MigrationMethodEnum("incremental_migration");

        private static final Map<String, MigrationMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationMethodEnum> createStaticFields() {
            Map<String, MigrationMethodEnum> map = new HashMap<>();
            map.put("full_amount_migration", FULL_AMOUNT_MIGRATION);
            map.put("incremental_migration", INCREMENTAL_MIGRATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationMethodEnum(String value) {
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
        public static MigrationMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MigrationMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationMethodEnum(value);
            }
            return result;
        }

        public static MigrationMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MigrationMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationMethodEnum) {
                return this.value.equals(((MigrationMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_method")

    @JacksonXmlProperty(localName = "migration_method")

    private MigrationMethodEnum migrationMethod;

    /**
     * 自动重连，根据参数决定是否自动重连。 自动重连模式在遇到网络等异常情况时，会无限自动重试。 自动重连模式在无法进行增量同步时，会触发全量同步，增加带宽占用，请谨慎选择。 取值范围： - auto：自动重连。 - manual：手动重连。 
     */
    public static final class ResumeModeEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final ResumeModeEnum AUTO = new ResumeModeEnum("auto");

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final ResumeModeEnum MANUAL = new ResumeModeEnum("manual");

        private static final Map<String, ResumeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResumeModeEnum> createStaticFields() {
            Map<String, ResumeModeEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("manual", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResumeModeEnum(String value) {
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
        public static ResumeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResumeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResumeModeEnum(value);
            }
            return result;
        }

        public static ResumeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResumeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResumeModeEnum) {
                return this.value.equals(((ResumeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_mode")

    @JacksonXmlProperty(localName = "resume_mode")

    private ResumeModeEnum resumeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_limit_mb")

    @JacksonXmlProperty(localName = "bandwidth_limit_mb")

    private String bandwidthLimitMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance")

    @JacksonXmlProperty(localName = "source_instance")

    private ConfigMigrationInstanceBody sourceInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance")

    @JacksonXmlProperty(localName = "target_instance")

    private ConfigMigrationInstanceBody targetInstance;

    public SetOnlineMigrationTaskBody withMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
        return this;
    }

    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。 - 全量迁移：该模式为Redis的一次性迁移，适用于可中断业务的迁移场景。   全量迁移过程中，如果源Redis有数据更新，这部分更新数据不会被迁移到目标Redis。 - 增量迁移：该模式为Redis的持续性迁移，适用于对业务中断敏感的迁移场景。   增量迁移阶段通过解析日志等技术， 持续保持源Redis和目标端Redis的数据一致。 取值范围： - full_amount_migration：表示全量迁移。 - incremental_migration：表示增量迁移。 
     * @return migrationMethod
     */
    public MigrationMethodEnum getMigrationMethod() {
        return migrationMethod;
    }

    public void setMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
    }

    public SetOnlineMigrationTaskBody withResumeMode(ResumeModeEnum resumeMode) {
        this.resumeMode = resumeMode;
        return this;
    }

    /**
     * 自动重连，根据参数决定是否自动重连。 自动重连模式在遇到网络等异常情况时，会无限自动重试。 自动重连模式在无法进行增量同步时，会触发全量同步，增加带宽占用，请谨慎选择。 取值范围： - auto：自动重连。 - manual：手动重连。 
     * @return resumeMode
     */
    public ResumeModeEnum getResumeMode() {
        return resumeMode;
    }

    public void setResumeMode(ResumeModeEnum resumeMode) {
        this.resumeMode = resumeMode;
    }

    public SetOnlineMigrationTaskBody withBandwidthLimitMb(String bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

    /**
     * 带宽限制，当迁移方式为增量迁移时，为保证业务正常运行，您可以启用带宽限制功能，当数据同步速度达到带宽限制时，将限制同步速度的继续增长。 -限制为MB/s -取值范围：1-10,241(大于0小于10,241的整数)
     * @return bandwidthLimitMb
     */
    public String getBandwidthLimitMb() {
        return bandwidthLimitMb;
    }

    public void setBandwidthLimitMb(String bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
    }

    public SetOnlineMigrationTaskBody withSourceInstance(ConfigMigrationInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
        return this;
    }

    public SetOnlineMigrationTaskBody withSourceInstance(Consumer<ConfigMigrationInstanceBody> sourceInstanceSetter) {
        if (this.sourceInstance == null) {
            this.sourceInstance = new ConfigMigrationInstanceBody();
            sourceInstanceSetter.accept(this.sourceInstance);
        }

        return this;
    }

    /**
     * Get sourceInstance
     * @return sourceInstance
     */
    public ConfigMigrationInstanceBody getSourceInstance() {
        return sourceInstance;
    }

    public void setSourceInstance(ConfigMigrationInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
    }

    public SetOnlineMigrationTaskBody withTargetInstance(ConfigMigrationInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public SetOnlineMigrationTaskBody withTargetInstance(Consumer<ConfigMigrationInstanceBody> targetInstanceSetter) {
        if (this.targetInstance == null) {
            this.targetInstance = new ConfigMigrationInstanceBody();
            targetInstanceSetter.accept(this.targetInstance);
        }

        return this;
    }

    /**
     * Get targetInstance
     * @return targetInstance
     */
    public ConfigMigrationInstanceBody getTargetInstance() {
        return targetInstance;
    }

    public void setTargetInstance(ConfigMigrationInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetOnlineMigrationTaskBody setOnlineMigrationTaskBody = (SetOnlineMigrationTaskBody) o;
        return Objects.equals(this.migrationMethod, setOnlineMigrationTaskBody.migrationMethod)
            && Objects.equals(this.resumeMode, setOnlineMigrationTaskBody.resumeMode)
            && Objects.equals(this.bandwidthLimitMb, setOnlineMigrationTaskBody.bandwidthLimitMb)
            && Objects.equals(this.sourceInstance, setOnlineMigrationTaskBody.sourceInstance)
            && Objects.equals(this.targetInstance, setOnlineMigrationTaskBody.targetInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationMethod, resumeMode, bandwidthLimitMb, sourceInstance, targetInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOnlineMigrationTaskBody {\n");
        sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
        sb.append("    resumeMode: ").append(toIndentedString(resumeMode)).append("\n");
        sb.append("    bandwidthLimitMb: ").append(toIndentedString(bandwidthLimitMb)).append("\n");
        sb.append("    sourceInstance: ").append(toIndentedString(sourceInstance)).append("\n");
        sb.append("    targetInstance: ").append(toIndentedString(targetInstance)).append("\n");
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
