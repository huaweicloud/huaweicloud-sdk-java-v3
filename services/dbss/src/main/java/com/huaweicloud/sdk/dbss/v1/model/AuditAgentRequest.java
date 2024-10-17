package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AuditAgentRequest
 */
public class AuditAgentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    /**
     * 模式 - 0：创建agent - 1：选择已有agent
     */
    public static final class ModeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ModeEnum NUMBER_0 = new ModeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ModeEnum NUMBER_1 = new ModeEnum(1);

        private static final Map<Integer, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ModeEnum> createStaticFields() {
            Map<Integer, ModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    /**
     * agent类型 - APP：应用端 - DB：数据库端
     */
    public static final class AgentTypeEnum {

        /**
         * Enum APP for value: "APP"
         */
        public static final AgentTypeEnum APP = new AgentTypeEnum("APP");

        /**
         * Enum DB for value: "DB"
         */
        public static final AgentTypeEnum DB = new AgentTypeEnum("DB");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("DB", DB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentTypeEnum(String value) {
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
        public static AgentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentTypeEnum(value));
        }

        public static AgentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentTypeEnum) {
                return this.value.equals(((AgentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentTypeEnum agentType;

    /**
     * agent OS类型: - LINUX64_X86 - LINUX64_ARM - WINDOWS64
     */
    public static final class AgentOsEnum {

        /**
         * Enum LINUX64_X86 for value: "LINUX64_X86"
         */
        public static final AgentOsEnum LINUX64_X86 = new AgentOsEnum("LINUX64_X86");

        /**
         * Enum LINUX64_ARM for value: "LINUX64_ARM"
         */
        public static final AgentOsEnum LINUX64_ARM = new AgentOsEnum("LINUX64_ARM");

        /**
         * Enum WINDOWS64 for value: "WINDOWS64"
         */
        public static final AgentOsEnum WINDOWS64 = new AgentOsEnum("WINDOWS64");

        private static final Map<String, AgentOsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentOsEnum> createStaticFields() {
            Map<String, AgentOsEnum> map = new HashMap<>();
            map.put("LINUX64_X86", LINUX64_X86);
            map.put("LINUX64_ARM", LINUX64_ARM);
            map.put("WINDOWS64", WINDOWS64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentOsEnum(String value) {
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
        public static AgentOsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentOsEnum(value));
        }

        public static AgentOsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentOsEnum) {
                return this.value.equals(((AgentOsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_os")

    private AgentOsEnum agentOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ip")

    private String agentIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_nic")

    private String agentNic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_threshold")

    private Integer cpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_threshold")

    private Integer memThreshold;

    public AuditAgentRequest withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID, 可在查询数据库列表接口的ID字段获取。
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public AuditAgentRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 模式 - 0：创建agent - 1：选择已有agent
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AuditAgentRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 选择已有agent时必输
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AuditAgentRequest withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * agent类型 - APP：应用端 - DB：数据库端
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    public AuditAgentRequest withAgentOs(AgentOsEnum agentOs) {
        this.agentOs = agentOs;
        return this;
    }

    /**
     * agent OS类型: - LINUX64_X86 - LINUX64_ARM - WINDOWS64
     * @return agentOs
     */
    public AgentOsEnum getAgentOs() {
        return agentOs;
    }

    public void setAgentOs(AgentOsEnum agentOs) {
        this.agentOs = agentOs;
    }

    public AuditAgentRequest withAgentIp(String agentIp) {
        this.agentIp = agentIp;
        return this;
    }

    /**
     * agent IP，安装节点类型为应用端时必输。
     * @return agentIp
     */
    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public AuditAgentRequest withAgentNic(String agentNic) {
        this.agentNic = agentNic;
        return this;
    }

    /**
     * agent审计网卡名称
     * @return agentNic
     */
    public String getAgentNic() {
        return agentNic;
    }

    public void setAgentNic(String agentNic) {
        this.agentNic = agentNic;
    }

    public AuditAgentRequest withCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * CPU阈值
     * @return cpuThreshold
     */
    public Integer getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public AuditAgentRequest withMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
        return this;
    }

    /**
     * 内存阈值
     * @return memThreshold
     */
    public Integer getMemThreshold() {
        return memThreshold;
    }

    public void setMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditAgentRequest that = (AuditAgentRequest) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentType, that.agentType)
            && Objects.equals(this.agentOs, that.agentOs) && Objects.equals(this.agentIp, that.agentIp)
            && Objects.equals(this.agentNic, that.agentNic) && Objects.equals(this.cpuThreshold, that.cpuThreshold)
            && Objects.equals(this.memThreshold, that.memThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, mode, agentId, agentType, agentOs, agentIp, agentNic, cpuThreshold, memThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditAgentRequest {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    agentOs: ").append(toIndentedString(agentOs)).append("\n");
        sb.append("    agentIp: ").append(toIndentedString(agentIp)).append("\n");
        sb.append("    agentNic: ").append(toIndentedString(agentNic)).append("\n");
        sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
        sb.append("    memThreshold: ").append(toIndentedString(memThreshold)).append("\n");
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
