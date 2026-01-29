package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 源端复制状态 copystate与migrationcycle忽略大小写，但必须满足一些搭配，否则更新失败，接口报错： migrationcycle状态为 checking时，copystate只能为unavailable/waiting setting时， waiting/premigready/premiging/premiged/premigfailed replicating时，init/replicate/deleting/stopping/error/stopped syncing时，syncing/cloning/deleting/stopping/error/stopped cutovering时，cutovering/deleting/stopping/error/stopped cutovered时，finished/deleting/stopping/error/stopped
 */
public class PutCopyStateReq {

    /**
     * 源端服务器状态 unavailable: 环境校验不通过 waiting: 等待 init: 初始化 replicate: 复制 syncing: 持续同步 stopping: 暂停中 stopped: 已暂停 skipping: 跳过中 deleting: 删除中 clearing: 清理快照资源中 cleared: 清理快照资源完成 clearfailed: 清理快照资源失败 premigready: 迁移演练就绪 premiging: 迁移演练中 premiged: 迁移演练完成 premigfailed: 迁移演练失败 cloning: 等待克隆完成 cutovering: 启动目的端中 finished: 启动目的端完成 error: 错误
     */
    public static final class CopystateEnum {

        /**
         * Enum UNAVAILABLE for value: "unavailable"
         */
        public static final CopystateEnum UNAVAILABLE = new CopystateEnum("unavailable");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final CopystateEnum WAITING = new CopystateEnum("waiting");

        /**
         * Enum INIT for value: "init"
         */
        public static final CopystateEnum INIT = new CopystateEnum("init");

        /**
         * Enum REPLICATE for value: "replicate"
         */
        public static final CopystateEnum REPLICATE = new CopystateEnum("replicate");

        /**
         * Enum SYNCING for value: "syncing"
         */
        public static final CopystateEnum SYNCING = new CopystateEnum("syncing");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final CopystateEnum STOPPING = new CopystateEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final CopystateEnum STOPPED = new CopystateEnum("stopped");

        /**
         * Enum SKIPPING for value: "skipping"
         */
        public static final CopystateEnum SKIPPING = new CopystateEnum("skipping");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final CopystateEnum DELETING = new CopystateEnum("deleting");

        /**
         * Enum CLEARING for value: "clearing"
         */
        public static final CopystateEnum CLEARING = new CopystateEnum("clearing");

        /**
         * Enum CLEARED for value: "cleared"
         */
        public static final CopystateEnum CLEARED = new CopystateEnum("cleared");

        /**
         * Enum CLEARFAILED for value: "clearfailed"
         */
        public static final CopystateEnum CLEARFAILED = new CopystateEnum("clearfailed");

        /**
         * Enum PREMIGREADY for value: "premigready"
         */
        public static final CopystateEnum PREMIGREADY = new CopystateEnum("premigready");

        /**
         * Enum PREMIGING for value: "premiging"
         */
        public static final CopystateEnum PREMIGING = new CopystateEnum("premiging");

        /**
         * Enum PREMIGED for value: "premiged"
         */
        public static final CopystateEnum PREMIGED = new CopystateEnum("premiged");

        /**
         * Enum PREMIGFAILED for value: "premigfailed"
         */
        public static final CopystateEnum PREMIGFAILED = new CopystateEnum("premigfailed");

        /**
         * Enum CLONING for value: "cloning"
         */
        public static final CopystateEnum CLONING = new CopystateEnum("cloning");

        /**
         * Enum CUTOVERING for value: "cutovering"
         */
        public static final CopystateEnum CUTOVERING = new CopystateEnum("cutovering");

        /**
         * Enum FINISHED for value: "finished"
         */
        public static final CopystateEnum FINISHED = new CopystateEnum("finished");

        /**
         * Enum ERROR for value: "error"
         */
        public static final CopystateEnum ERROR = new CopystateEnum("error");

        private static final Map<String, CopystateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CopystateEnum> createStaticFields() {
            Map<String, CopystateEnum> map = new HashMap<>();
            map.put("unavailable", UNAVAILABLE);
            map.put("waiting", WAITING);
            map.put("init", INIT);
            map.put("replicate", REPLICATE);
            map.put("syncing", SYNCING);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("skipping", SKIPPING);
            map.put("deleting", DELETING);
            map.put("clearing", CLEARING);
            map.put("cleared", CLEARED);
            map.put("clearfailed", CLEARFAILED);
            map.put("premigready", PREMIGREADY);
            map.put("premiging", PREMIGING);
            map.put("premiged", PREMIGED);
            map.put("premigfailed", PREMIGFAILED);
            map.put("cloning", CLONING);
            map.put("cutovering", CUTOVERING);
            map.put("finished", FINISHED);
            map.put("error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CopystateEnum(String value) {
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
        public static CopystateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CopystateEnum(value));
        }

        public static CopystateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CopystateEnum) {
                return this.value.equals(((CopystateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copystate")

    private CopystateEnum copystate;

    /**
     * 迁移周期 no_ready:未就绪 ready_for_test:已就绪 testing:测试中 tested:测试完成 cutovering:启动目的端中 cutovered:启动目的端完成 checking:检查中 setting:设置中 replicating:复制中 syncing:同步中
     */
    public static final class MigrationcycleEnum {

        /**
         * Enum NO_READY for value: "no_ready"
         */
        public static final MigrationcycleEnum NO_READY = new MigrationcycleEnum("no_ready");

        /**
         * Enum READY_FOR_TEST for value: "ready_for_test"
         */
        public static final MigrationcycleEnum READY_FOR_TEST = new MigrationcycleEnum("ready_for_test");

        /**
         * Enum TESTING for value: "testing"
         */
        public static final MigrationcycleEnum TESTING = new MigrationcycleEnum("testing");

        /**
         * Enum TESTED for value: "tested"
         */
        public static final MigrationcycleEnum TESTED = new MigrationcycleEnum("tested");

        /**
         * Enum CUTOVERING for value: "cutovering"
         */
        public static final MigrationcycleEnum CUTOVERING = new MigrationcycleEnum("cutovering");

        /**
         * Enum CUTOVERED for value: "cutovered"
         */
        public static final MigrationcycleEnum CUTOVERED = new MigrationcycleEnum("cutovered");

        /**
         * Enum CHECKING for value: "checking"
         */
        public static final MigrationcycleEnum CHECKING = new MigrationcycleEnum("checking");

        /**
         * Enum SETTING for value: "setting"
         */
        public static final MigrationcycleEnum SETTING = new MigrationcycleEnum("setting");

        /**
         * Enum REPLICATING for value: "replicating"
         */
        public static final MigrationcycleEnum REPLICATING = new MigrationcycleEnum("replicating");

        /**
         * Enum SYNCING for value: "syncing"
         */
        public static final MigrationcycleEnum SYNCING = new MigrationcycleEnum("syncing");

        private static final Map<String, MigrationcycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationcycleEnum> createStaticFields() {
            Map<String, MigrationcycleEnum> map = new HashMap<>();
            map.put("no_ready", NO_READY);
            map.put("ready_for_test", READY_FOR_TEST);
            map.put("testing", TESTING);
            map.put("tested", TESTED);
            map.put("cutovering", CUTOVERING);
            map.put("cutovered", CUTOVERED);
            map.put("checking", CHECKING);
            map.put("setting", SETTING);
            map.put("replicating", REPLICATING);
            map.put("syncing", SYNCING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationcycleEnum(String value) {
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
        public static MigrationcycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrationcycleEnum(value));
        }

        public static MigrationcycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationcycleEnum) {
                return this.value.equals(((MigrationcycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrationcycle")

    private MigrationcycleEnum migrationcycle;

    public PutCopyStateReq withCopystate(CopystateEnum copystate) {
        this.copystate = copystate;
        return this;
    }

    /**
     * 源端服务器状态 unavailable: 环境校验不通过 waiting: 等待 init: 初始化 replicate: 复制 syncing: 持续同步 stopping: 暂停中 stopped: 已暂停 skipping: 跳过中 deleting: 删除中 clearing: 清理快照资源中 cleared: 清理快照资源完成 clearfailed: 清理快照资源失败 premigready: 迁移演练就绪 premiging: 迁移演练中 premiged: 迁移演练完成 premigfailed: 迁移演练失败 cloning: 等待克隆完成 cutovering: 启动目的端中 finished: 启动目的端完成 error: 错误
     * @return copystate
     */
    public CopystateEnum getCopystate() {
        return copystate;
    }

    public void setCopystate(CopystateEnum copystate) {
        this.copystate = copystate;
    }

    public PutCopyStateReq withMigrationcycle(MigrationcycleEnum migrationcycle) {
        this.migrationcycle = migrationcycle;
        return this;
    }

    /**
     * 迁移周期 no_ready:未就绪 ready_for_test:已就绪 testing:测试中 tested:测试完成 cutovering:启动目的端中 cutovered:启动目的端完成 checking:检查中 setting:设置中 replicating:复制中 syncing:同步中
     * @return migrationcycle
     */
    public MigrationcycleEnum getMigrationcycle() {
        return migrationcycle;
    }

    public void setMigrationcycle(MigrationcycleEnum migrationcycle) {
        this.migrationcycle = migrationcycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutCopyStateReq that = (PutCopyStateReq) obj;
        return Objects.equals(this.copystate, that.copystate)
            && Objects.equals(this.migrationcycle, that.migrationcycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(copystate, migrationcycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutCopyStateReq {\n");
        sb.append("    copystate: ").append(toIndentedString(copystate)).append("\n");
        sb.append("    migrationcycle: ").append(toIndentedString(migrationcycle)).append("\n");
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
