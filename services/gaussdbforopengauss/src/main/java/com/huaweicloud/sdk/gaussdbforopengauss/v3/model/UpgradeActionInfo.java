package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 升级操作信息。
 */
public class UpgradeActionInfo {

    /**
     * 升级操作,upgrade=升级,upgradeAutoCommit=升级自动提交,commit=提交,rollback=回滚。
     */
    public static final class UpgradeActionEnum {

        /**
         * Enum UPGRADE for value: "upgrade"
         */
        public static final UpgradeActionEnum UPGRADE = new UpgradeActionEnum("upgrade");

        /**
         * Enum UPGRADEAUTOCOMMIT for value: "upgradeAutoCommit"
         */
        public static final UpgradeActionEnum UPGRADEAUTOCOMMIT = new UpgradeActionEnum("upgradeAutoCommit");

        /**
         * Enum COMMIT for value: "commit"
         */
        public static final UpgradeActionEnum COMMIT = new UpgradeActionEnum("commit");

        /**
         * Enum ROLLBACK for value: "rollback"
         */
        public static final UpgradeActionEnum ROLLBACK = new UpgradeActionEnum("rollback");

        private static final Map<String, UpgradeActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeActionEnum> createStaticFields() {
            Map<String, UpgradeActionEnum> map = new HashMap<>();
            map.put("upgrade", UPGRADE);
            map.put("upgradeAutoCommit", UPGRADEAUTOCOMMIT);
            map.put("commit", COMMIT);
            map.put("rollback", ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpgradeActionEnum(String value) {
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
        public static UpgradeActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeActionEnum(value));
        }

        public static UpgradeActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradeActionEnum) {
                return this.value.equals(((UpgradeActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_action")

    private UpgradeActionEnum upgradeAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public UpgradeActionInfo withUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
        return this;
    }

    /**
     * 升级操作,upgrade=升级,upgradeAutoCommit=升级自动提交,commit=提交,rollback=回滚。
     * @return upgradeAction
     */
    public UpgradeActionEnum getUpgradeAction() {
        return upgradeAction;
    }

    public void setUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
    }

    public UpgradeActionInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 可用，不可用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeActionInfo that = (UpgradeActionInfo) obj;
        return Objects.equals(this.upgradeAction, that.upgradeAction) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeAction, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeActionInfo {\n");
        sb.append("    upgradeAction: ").append(toIndentedString(upgradeAction)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
