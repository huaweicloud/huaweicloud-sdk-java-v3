package com.huaweicloud.sdk.cce.v3.model;

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
 * MasterEIPResponseSpec
 */
public class MasterEIPResponseSpec {

    /**
     * **参数解释**： 绑定动作 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     */
    public static final class ActionEnum {

        /**
         * Enum BIND for value: "bind"
         */
        public static final ActionEnum BIND = new ActionEnum("bind");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("bind", BIND);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private MasterEIPResponseSpecSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elasticIp")

    private String elasticIp;

    public MasterEIPResponseSpec withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 绑定动作 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public MasterEIPResponseSpec withSpec(MasterEIPResponseSpecSpec spec) {
        this.spec = spec;
        return this;
    }

    public MasterEIPResponseSpec withSpec(Consumer<MasterEIPResponseSpecSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new MasterEIPResponseSpecSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public MasterEIPResponseSpecSpec getSpec() {
        return spec;
    }

    public void setSpec(MasterEIPResponseSpecSpec spec) {
        this.spec = spec;
    }

    public MasterEIPResponseSpec withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return elasticIp
     */
    public String getElasticIp() {
        return elasticIp;
    }

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterEIPResponseSpec that = (MasterEIPResponseSpec) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.elasticIp, that.elasticIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, spec, elasticIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterEIPResponseSpec {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    elasticIp: ").append(toIndentedString(elasticIp)).append("\n");
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
