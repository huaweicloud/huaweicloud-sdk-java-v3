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
 * 模板对象
 */
public class TemplateBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private String dbNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    /**
     * 类型 - COMPREHENSIVE：综合报表 - COMPLIANCE：合规报表 - DB_SPECIAL：数据库专项报表 - CLIENT_SPECIAL：客户端专项报表 - SQL_SPECIAL：SQL
     */
    public static final class GroupEnum {

        /**
         * Enum COMPREHENSIVE for value: "COMPREHENSIVE"
         */
        public static final GroupEnum COMPREHENSIVE = new GroupEnum("COMPREHENSIVE");

        /**
         * Enum COMPLIANCE for value: "COMPLIANCE"
         */
        public static final GroupEnum COMPLIANCE = new GroupEnum("COMPLIANCE");

        /**
         * Enum DB_SPECIAL for value: "DB_SPECIAL"
         */
        public static final GroupEnum DB_SPECIAL = new GroupEnum("DB_SPECIAL");

        /**
         * Enum CLIENT_SPECIAL for value: "CLIENT_SPECIAL"
         */
        public static final GroupEnum CLIENT_SPECIAL = new GroupEnum("CLIENT_SPECIAL");

        /**
         * Enum SQL_SPECIAL for value: "SQL_SPECIAL"
         */
        public static final GroupEnum SQL_SPECIAL = new GroupEnum("SQL_SPECIAL");

        private static final Map<String, GroupEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupEnum> createStaticFields() {
            Map<String, GroupEnum> map = new HashMap<>();
            map.put("COMPREHENSIVE", COMPREHENSIVE);
            map.put("COMPLIANCE", COMPLIANCE);
            map.put("DB_SPECIAL", DB_SPECIAL);
            map.put("CLIENT_SPECIAL", CLIENT_SPECIAL);
            map.put("SQL_SPECIAL", SQL_SPECIAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupEnum(String value) {
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
        public static GroupEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupEnum(value));
        }

        public static GroupEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupEnum) {
                return this.value.equals(((GroupEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private GroupEnum group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 状态 - OFF：已关闭 - ON：已开启
     */
    public static final class StatusEnum {

        /**
         * Enum OFF for value: "OFF"
         */
        public static final StatusEnum OFF = new StatusEnum("OFF");

        /**
         * Enum ON for value: "ON"
         */
        public static final StatusEnum ON = new StatusEnum("ON");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("OFF", OFF);
            map.put("ON", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 报表类型 - COMPREHENSIVE：数据库安全综合报表 - COMPLIANCE：数据库安全合规报表 - SOX：SOX-萨班斯报表 - PCI：行业标准安全报表 - DB_ANALYSIS：数据库服务器分析报表 - CLIENT_IP_ANALYSIS：客户端IP分析报表 - SQL_DCL_COMMAND：DCL命令报表 - SQL_DDL_COMMAND：DDL命令报表 - SQL_DML_COMMAND：DML命令报表
     */
    public static final class TypeEnum {

        /**
         * Enum COMPREHENSIVE for value: "COMPREHENSIVE"
         */
        public static final TypeEnum COMPREHENSIVE = new TypeEnum("COMPREHENSIVE");

        /**
         * Enum COMPLIANCE for value: "COMPLIANCE"
         */
        public static final TypeEnum COMPLIANCE = new TypeEnum("COMPLIANCE");

        /**
         * Enum SOX for value: "SOX"
         */
        public static final TypeEnum SOX = new TypeEnum("SOX");

        /**
         * Enum PCI for value: "PCI"
         */
        public static final TypeEnum PCI = new TypeEnum("PCI");

        /**
         * Enum DB_ANALYSIS for value: "DB_ANALYSIS"
         */
        public static final TypeEnum DB_ANALYSIS = new TypeEnum("DB_ANALYSIS");

        /**
         * Enum CLIENT_IP_ANALYSIS for value: "CLIENT_IP_ANALYSIS"
         */
        public static final TypeEnum CLIENT_IP_ANALYSIS = new TypeEnum("CLIENT_IP_ANALYSIS");

        /**
         * Enum SQL_DCL_COMMAND for value: "SQL_DCL_COMMAND"
         */
        public static final TypeEnum SQL_DCL_COMMAND = new TypeEnum("SQL_DCL_COMMAND");

        /**
         * Enum SQL_DDL_COMMAND for value: "SQL_DDL_COMMAND"
         */
        public static final TypeEnum SQL_DDL_COMMAND = new TypeEnum("SQL_DDL_COMMAND");

        /**
         * Enum SQL_DML_COMMAND for value: "SQL_DML_COMMAND"
         */
        public static final TypeEnum SQL_DML_COMMAND = new TypeEnum("SQL_DML_COMMAND");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("COMPREHENSIVE", COMPREHENSIVE);
            map.put("COMPLIANCE", COMPLIANCE);
            map.put("SOX", SOX);
            map.put("PCI", PCI);
            map.put("DB_ANALYSIS", DB_ANALYSIS);
            map.put("CLIENT_IP_ANALYSIS", CLIENT_IP_ANALYSIS);
            map.put("SQL_DCL_COMMAND", SQL_DCL_COMMAND);
            map.put("SQL_DDL_COMMAND", SQL_DDL_COMMAND);
            map.put("SQL_DML_COMMAND", SQL_DML_COMMAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public TemplateBean withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库ID
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public TemplateBean withDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    /**
     * 数据库名称
     * @return dbNames
     */
    public String getDbNames() {
        return dbNames;
    }

    public void setDbNames(String dbNames) {
        this.dbNames = dbNames;
    }

    public TemplateBean withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TemplateBean withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 周期
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public TemplateBean withGroup(GroupEnum group) {
        this.group = group;
        return this;
    }

    /**
     * 类型 - COMPREHENSIVE：综合报表 - COMPLIANCE：合规报表 - DB_SPECIAL：数据库专项报表 - CLIENT_SPECIAL：客户端专项报表 - SQL_SPECIAL：SQL
     * @return group
     */
    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    public TemplateBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateBean withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 报表模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateBean withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 - OFF：已关闭 - ON：已开启
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TemplateBean withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 报表类型 - COMPREHENSIVE：数据库安全综合报表 - COMPLIANCE：数据库安全合规报表 - SOX：SOX-萨班斯报表 - PCI：行业标准安全报表 - DB_ANALYSIS：数据库服务器分析报表 - CLIENT_IP_ANALYSIS：客户端IP分析报表 - SQL_DCL_COMMAND：DCL命令报表 - SQL_DDL_COMMAND：DDL命令报表 - SQL_DML_COMMAND：DML命令报表
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateBean that = (TemplateBean) obj;
        return Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.dbNames, that.dbNames)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.group, that.group) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbIds, dbNames, desc, frequency, group, id, name, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateBean {\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
