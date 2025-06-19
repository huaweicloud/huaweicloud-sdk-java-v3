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
public class ShowSqlJobSystemDefendRuleResponse extends SdkResponse {

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
         * Enum DYNAMIC_0001 for value: "dynamic_0001"
         */
        public static final RuleIdEnum DYNAMIC_0001 = new RuleIdEnum("dynamic_0001");

        /**
         * Enum DYNAMIC_0002 for value: "dynamic_0002"
         */
        public static final RuleIdEnum DYNAMIC_0002 = new RuleIdEnum("dynamic_0002");

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
            map.put("dynamic_0001", DYNAMIC_0001);
            map.put("dynamic_0002", DYNAMIC_0002);
            map.put("running_0002", RUNNING_0002);
            map.put("running_0003", RUNNING_0003);
            map.put("running_0004", RUNNING_0004);
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
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engines")

    private List<String> engines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_limit")

    private Boolean noLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private SysRuleParam param;

    public ShowSqlJobSystemDefendRuleResponse withRuleId(RuleIdEnum ruleId) {
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

    public ShowSqlJobSystemDefendRuleResponse withCategory(CategoryEnum category) {
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

    public ShowSqlJobSystemDefendRuleResponse withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ShowSqlJobSystemDefendRuleResponse addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ShowSqlJobSystemDefendRuleResponse withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 可执行的动作
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ShowSqlJobSystemDefendRuleResponse withEngines(List<String> engines) {
        this.engines = engines;
        return this;
    }

    public ShowSqlJobSystemDefendRuleResponse addEnginesItem(String enginesItem) {
        if (this.engines == null) {
            this.engines = new ArrayList<>();
        }
        this.engines.add(enginesItem);
        return this;
    }

    public ShowSqlJobSystemDefendRuleResponse withEngines(Consumer<List<String>> enginesSetter) {
        if (this.engines == null) {
            this.engines = new ArrayList<>();
        }
        enginesSetter.accept(this.engines);
        return this;
    }

    /**
     * 支持的引擎
     * @return engines
     */
    public List<String> getEngines() {
        return engines;
    }

    public void setEngines(List<String> engines) {
        this.engines = engines;
    }

    public ShowSqlJobSystemDefendRuleResponse withNoLimit(Boolean noLimit) {
        this.noLimit = noLimit;
        return this;
    }

    /**
     * 规则是否有限制值
     * @return noLimit
     */
    public Boolean getNoLimit() {
        return noLimit;
    }

    public void setNoLimit(Boolean noLimit) {
        this.noLimit = noLimit;
    }

    public ShowSqlJobSystemDefendRuleResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 规则描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ShowSqlJobSystemDefendRuleResponse withParam(SysRuleParam param) {
        this.param = param;
        return this;
    }

    public ShowSqlJobSystemDefendRuleResponse withParam(Consumer<SysRuleParam> paramSetter) {
        if (this.param == null) {
            this.param = new SysRuleParam();
            paramSetter.accept(this.param);
        }

        return this;
    }

    /**
     * Get param
     * @return param
     */
    public SysRuleParam getParam() {
        return param;
    }

    public void setParam(SysRuleParam param) {
        this.param = param;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlJobSystemDefendRuleResponse that = (ShowSqlJobSystemDefendRuleResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.category, that.category)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.engines, that.engines)
            && Objects.equals(this.noLimit, that.noLimit) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.param, that.param);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, category, actions, engines, noLimit, desc, param);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlJobSystemDefendRuleResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
        sb.append("    noLimit: ").append(toIndentedString(noLimit)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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
