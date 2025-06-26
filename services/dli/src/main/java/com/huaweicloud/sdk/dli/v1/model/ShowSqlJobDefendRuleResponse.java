package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSqlJobDefendRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_uuid")

    private String ruleUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    /**
     * 规则类型
     */
    public static final class RuleIdEnum {

        /**
         * Enum STATIC_0001 for value: "static_0001"
         */
        public static final RuleIdEnum STATIC_0001 = new RuleIdEnum("static_0001");

        /**
         * Enum STATIC_0002 for value: "static_0002"
         */
        public static final RuleIdEnum STATIC_0002 = new RuleIdEnum("static_0002");

        /**
         * Enum STATIC_0003 for value: "static_0003"
         */
        public static final RuleIdEnum STATIC_0003 = new RuleIdEnum("static_0003");

        /**
         * Enum STATIC_0004 for value: "static_0004"
         */
        public static final RuleIdEnum STATIC_0004 = new RuleIdEnum("static_0004");

        /**
         * Enum STATIC_0005 for value: "static_0005"
         */
        public static final RuleIdEnum STATIC_0005 = new RuleIdEnum("static_0005");

        /**
         * Enum STATIC_0006 for value: "static_0006"
         */
        public static final RuleIdEnum STATIC_0006 = new RuleIdEnum("static_0006");

        /**
         * Enum STATIC_0007 for value: "static_0007"
         */
        public static final RuleIdEnum STATIC_0007 = new RuleIdEnum("static_0007");

        /**
         * Enum STATIC_0008 for value: "static_0008"
         */
        public static final RuleIdEnum STATIC_0008 = new RuleIdEnum("static_0008");

        /**
         * Enum STATIC_0009 for value: "static_0009"
         */
        public static final RuleIdEnum STATIC_0009 = new RuleIdEnum("static_0009");

        /**
         * Enum STATIC_0010 for value: "static_0010"
         */
        public static final RuleIdEnum STATIC_0010 = new RuleIdEnum("static_0010");

        /**
         * Enum STATIC_0011 for value: "static_0011"
         */
        public static final RuleIdEnum STATIC_0011 = new RuleIdEnum("static_0011");

        /**
         * Enum STATIC_0012 for value: "static_0012"
         */
        public static final RuleIdEnum STATIC_0012 = new RuleIdEnum("static_0012");

        /**
         * Enum STATIC_0013 for value: "static_0013"
         */
        public static final RuleIdEnum STATIC_0013 = new RuleIdEnum("static_0013");

        /**
         * Enum STATIC_0014 for value: "static_0014"
         */
        public static final RuleIdEnum STATIC_0014 = new RuleIdEnum("static_0014");

        /**
         * Enum STATIC_0015 for value: "static_0015"
         */
        public static final RuleIdEnum STATIC_0015 = new RuleIdEnum("static_0015");

        /**
         * Enum STATIC_0016 for value: "static_0016"
         */
        public static final RuleIdEnum STATIC_0016 = new RuleIdEnum("static_0016");

        /**
         * Enum STATIC_0017 for value: "static_0017"
         */
        public static final RuleIdEnum STATIC_0017 = new RuleIdEnum("static_0017");

        /**
         * Enum DYNAMIC_0001 for value: "dynamic_0001"
         */
        public static final RuleIdEnum DYNAMIC_0001 = new RuleIdEnum("dynamic_0001");

        /**
         * Enum DYNAMIC_0002 for value: "dynamic_0002"
         */
        public static final RuleIdEnum DYNAMIC_0002 = new RuleIdEnum("dynamic_0002");

        /**
         * Enum DYNAMIC_0003 for value: "dynamic_0003"
         */
        public static final RuleIdEnum DYNAMIC_0003 = new RuleIdEnum("dynamic_0003");

        /**
         * Enum DYNAMIC_0004 for value: "dynamic_0004"
         */
        public static final RuleIdEnum DYNAMIC_0004 = new RuleIdEnum("dynamic_0004");

        /**
         * Enum DYNAMIC_0005 for value: "dynamic_0005"
         */
        public static final RuleIdEnum DYNAMIC_0005 = new RuleIdEnum("dynamic_0005");

        /**
         * Enum DYNAMIC_0006 for value: "dynamic_0006"
         */
        public static final RuleIdEnum DYNAMIC_0006 = new RuleIdEnum("dynamic_0006");

        /**
         * Enum DYNAMIC_0007 for value: "dynamic_0007"
         */
        public static final RuleIdEnum DYNAMIC_0007 = new RuleIdEnum("dynamic_0007");

        /**
         * Enum DYNAMIC_0008 for value: "dynamic_0008"
         */
        public static final RuleIdEnum DYNAMIC_0008 = new RuleIdEnum("dynamic_0008");

        /**
         * Enum DYNAMIC_0009 for value: "dynamic_0009"
         */
        public static final RuleIdEnum DYNAMIC_0009 = new RuleIdEnum("dynamic_0009");

        /**
         * Enum DYNAMIC_0010 for value: "dynamic_0010"
         */
        public static final RuleIdEnum DYNAMIC_0010 = new RuleIdEnum("dynamic_0010");

        /**
         * Enum DYNAMIC_0011 for value: "dynamic_0011"
         */
        public static final RuleIdEnum DYNAMIC_0011 = new RuleIdEnum("dynamic_0011");

        /**
         * Enum DYNAMIC_0012 for value: "dynamic_0012"
         */
        public static final RuleIdEnum DYNAMIC_0012 = new RuleIdEnum("dynamic_0012");

        /**
         * Enum RUNNING_0001 for value: "running_0001"
         */
        public static final RuleIdEnum RUNNING_0001 = new RuleIdEnum("running_0001");

        /**
         * Enum RUNNING_0002 for value: "running_0002"
         */
        public static final RuleIdEnum RUNNING_0002 = new RuleIdEnum("running_0002");

        /**
         * Enum RUNNING_0003 for value: "running_0003"
         */
        public static final RuleIdEnum RUNNING_0003 = new RuleIdEnum("running_0003");

        /**
         * Enum RUNNING_0004 for value: "running_0004"
         */
        public static final RuleIdEnum RUNNING_0004 = new RuleIdEnum("running_0004");

        /**
         * Enum RUNNING_0005 for value: "running_0005"
         */
        public static final RuleIdEnum RUNNING_0005 = new RuleIdEnum("running_0005");

        /**
         * Enum RUNNING_0006 for value: "running_0006"
         */
        public static final RuleIdEnum RUNNING_0006 = new RuleIdEnum("running_0006");

        /**
         * Enum RUNNING_0007 for value: "running_0007"
         */
        public static final RuleIdEnum RUNNING_0007 = new RuleIdEnum("running_0007");

        /**
         * Enum RUNNING_0008 for value: "running_0008"
         */
        public static final RuleIdEnum RUNNING_0008 = new RuleIdEnum("running_0008");

        /**
         * Enum RUNNING_0009 for value: "running_0009"
         */
        public static final RuleIdEnum RUNNING_0009 = new RuleIdEnum("running_0009");

        /**
         * Enum RUNNING_0010 for value: "running_0010"
         */
        public static final RuleIdEnum RUNNING_0010 = new RuleIdEnum("running_0010");

        /**
         * Enum RUNNING_0011 for value: "running_0011"
         */
        public static final RuleIdEnum RUNNING_0011 = new RuleIdEnum("running_0011");

        /**
         * Enum RUNNING_0012 for value: "running_0012"
         */
        public static final RuleIdEnum RUNNING_0012 = new RuleIdEnum("running_0012");

        /**
         * Enum RUNNING_0013 for value: "running_0013"
         */
        public static final RuleIdEnum RUNNING_0013 = new RuleIdEnum("running_0013");

        /**
         * Enum RUNNING_0014 for value: "running_0014"
         */
        public static final RuleIdEnum RUNNING_0014 = new RuleIdEnum("running_0014");

        /**
         * Enum RUNNING_0015 for value: "running_0015"
         */
        public static final RuleIdEnum RUNNING_0015 = new RuleIdEnum("running_0015");

        private static final Map<String, RuleIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleIdEnum> createStaticFields() {
            Map<String, RuleIdEnum> map = new HashMap<>();
            map.put("static_0001", STATIC_0001);
            map.put("static_0002", STATIC_0002);
            map.put("static_0003", STATIC_0003);
            map.put("static_0004", STATIC_0004);
            map.put("static_0005", STATIC_0005);
            map.put("static_0006", STATIC_0006);
            map.put("static_0007", STATIC_0007);
            map.put("static_0008", STATIC_0008);
            map.put("static_0009", STATIC_0009);
            map.put("static_0010", STATIC_0010);
            map.put("static_0011", STATIC_0011);
            map.put("static_0012", STATIC_0012);
            map.put("static_0013", STATIC_0013);
            map.put("static_0014", STATIC_0014);
            map.put("static_0015", STATIC_0015);
            map.put("static_0016", STATIC_0016);
            map.put("static_0017", STATIC_0017);
            map.put("dynamic_0001", DYNAMIC_0001);
            map.put("dynamic_0002", DYNAMIC_0002);
            map.put("dynamic_0003", DYNAMIC_0003);
            map.put("dynamic_0004", DYNAMIC_0004);
            map.put("dynamic_0005", DYNAMIC_0005);
            map.put("dynamic_0006", DYNAMIC_0006);
            map.put("dynamic_0007", DYNAMIC_0007);
            map.put("dynamic_0008", DYNAMIC_0008);
            map.put("dynamic_0009", DYNAMIC_0009);
            map.put("dynamic_0010", DYNAMIC_0010);
            map.put("dynamic_0011", DYNAMIC_0011);
            map.put("dynamic_0012", DYNAMIC_0012);
            map.put("running_0001", RUNNING_0001);
            map.put("running_0002", RUNNING_0002);
            map.put("running_0003", RUNNING_0003);
            map.put("running_0004", RUNNING_0004);
            map.put("running_0005", RUNNING_0005);
            map.put("running_0006", RUNNING_0006);
            map.put("running_0007", RUNNING_0007);
            map.put("running_0008", RUNNING_0008);
            map.put("running_0009", RUNNING_0009);
            map.put("running_0010", RUNNING_0010);
            map.put("running_0011", RUNNING_0011);
            map.put("running_0012", RUNNING_0012);
            map.put("running_0013", RUNNING_0013);
            map.put("running_0014", RUNNING_0014);
            map.put("running_0015", RUNNING_0015);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleIdEnum(String value) {
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
        public static RuleIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleIdEnum(value));
        }

        public static RuleIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleIdEnum) {
                return this.value.equals(((RuleIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private RuleIdEnum ruleId;

    /**
     * 规则状态类型
     */
    public static final class CategoryEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final CategoryEnum STATIC = new CategoryEnum("static");

        /**
         * Enum DYNAMIC for value: "dynamic"
         */
        public static final CategoryEnum DYNAMIC = new CategoryEnum("dynamic");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final CategoryEnum RUNNING = new CategoryEnum("running");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("dynamic", DYNAMIC);
            map.put("running", RUNNING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_rules")

    private Object engineRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_names")

    private List<String> queueNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_desc")

    private String sysDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ShowSqlJobDefendRuleResponse withRuleUuid(String ruleUuid) {
        this.ruleUuid = ruleUuid;
        return this;
    }

    /**
     * 规则唯一标识
     * @return ruleUuid
     */
    public String getRuleUuid() {
        return ruleUuid;
    }

    public void setRuleUuid(String ruleUuid) {
        this.ruleUuid = ruleUuid;
    }

    public ShowSqlJobDefendRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目编号
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowSqlJobDefendRuleResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ShowSqlJobDefendRuleResponse withRuleId(RuleIdEnum ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则类型
     * @return ruleId
     */
    public RuleIdEnum getRuleId() {
        return ruleId;
    }

    public void setRuleId(RuleIdEnum ruleId) {
        this.ruleId = ruleId;
    }

    public ShowSqlJobDefendRuleResponse withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 规则状态类型
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ShowSqlJobDefendRuleResponse withEngineRules(Object engineRules) {
        this.engineRules = engineRules;
        return this;
    }

    /**
     * 规则详情
     * @return engineRules
     */
    public Object getEngineRules() {
        return engineRules;
    }

    public void setEngineRules(Object engineRules) {
        this.engineRules = engineRules;
    }

    public ShowSqlJobDefendRuleResponse withQueueNames(List<String> queueNames) {
        this.queueNames = queueNames;
        return this;
    }

    public ShowSqlJobDefendRuleResponse addQueueNamesItem(String queueNamesItem) {
        if (this.queueNames == null) {
            this.queueNames = new ArrayList<>();
        }
        this.queueNames.add(queueNamesItem);
        return this;
    }

    public ShowSqlJobDefendRuleResponse withQueueNames(Consumer<List<String>> queueNamesSetter) {
        if (this.queueNames == null) {
            this.queueNames = new ArrayList<>();
        }
        queueNamesSetter.accept(this.queueNames);
        return this;
    }

    /**
     * 队列名称
     * @return queueNames
     */
    public List<String> getQueueNames() {
        return queueNames;
    }

    public void setQueueNames(List<String> queueNames) {
        this.queueNames = queueNames;
    }

    public ShowSqlJobDefendRuleResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 用户规则描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ShowSqlJobDefendRuleResponse withSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
        return this;
    }

    /**
     * 系统规则描述
     * @return sysDesc
     */
    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    public ShowSqlJobDefendRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSqlJobDefendRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlJobDefendRuleResponse that = (ShowSqlJobDefendRuleResponse) obj;
        return Objects.equals(this.ruleUuid, that.ruleUuid) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.category, that.category) && Objects.equals(this.engineRules, that.engineRules)
            && Objects.equals(this.queueNames, that.queueNames) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.sysDesc, that.sysDesc) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleUuid,
            projectId,
            ruleName,
            ruleId,
            category,
            engineRules,
            queueNames,
            desc,
            sysDesc,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlJobDefendRuleResponse {\n");
        sb.append("    ruleUuid: ").append(toIndentedString(ruleUuid)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    engineRules: ").append(toIndentedString(engineRules)).append("\n");
        sb.append("    queueNames: ").append(toIndentedString(queueNames)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    sysDesc: ").append(toIndentedString(sysDesc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
