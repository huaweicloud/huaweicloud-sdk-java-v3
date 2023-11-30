package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PrincipalRule
 */
public class PrincipalRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private String principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_name")

    private String principalName;

    /**
     * 授权操作类型。  - putRecords：上传数据。 - getRecords：下载数据。
     */
    public static final class ActionTypeEnum {

        /**
         * Enum PUTRECORDS for value: "putRecords"
         */
        public static final ActionTypeEnum PUTRECORDS = new ActionTypeEnum("putRecords");

        /**
         * Enum GETRECORDS for value: "getRecords"
         */
        public static final ActionTypeEnum GETRECORDS = new ActionTypeEnum("getRecords");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("putRecords", PUTRECORDS);
            map.put("getRecords", GETRECORDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionTypeEnum(String value) {
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
        public static ActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    /**
     * 授权影响类型。  - accept：允许该授权操作。
     */
    public static final class EffectEnum {

        /**
         * Enum ACCEPT for value: "accept"
         */
        public static final EffectEnum ACCEPT = new EffectEnum("accept");

        private static final Map<String, EffectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectEnum> createStaticFields() {
            Map<String, EffectEnum> map = new HashMap<>();
            map.put("accept", ACCEPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectEnum(String value) {
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
        public static EffectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectEnum(value));
        }

        public static EffectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectEnum) {
                return this.value.equals(((EffectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private EffectEnum effect;

    public PrincipalRule withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * 授权用户ID。
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public PrincipalRule withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * 授权用户名。  如果授权给租户下的所有子用户，格式为：domainName.*；如果授权给租户下的指定子用户，则格式为：domainName.userName
     * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public PrincipalRule withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 授权操作类型。  - putRecords：上传数据。 - getRecords：下载数据。
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public PrincipalRule withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 授权影响类型。  - accept：允许该授权操作。
     * @return effect
     */
    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrincipalRule that = (PrincipalRule) obj;
        return Objects.equals(this.principal, that.principal) && Objects.equals(this.principalName, that.principalName)
            && Objects.equals(this.actionType, that.actionType) && Objects.equals(this.effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, principalName, actionType, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrincipalRule {\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
