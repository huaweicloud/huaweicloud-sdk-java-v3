package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * GaussDB批量实例版本升级接口传参参数。
 */
public class GaussDBUpgradeInstancesVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    /**
     * 实例升级类型，包括就地升级，灰度升级、热补丁升级三种
     */
    public static final class UpgradeTypeEnum {

        /**
         * Enum INPLACE for value: "inplace"
         */
        public static final UpgradeTypeEnum INPLACE = new UpgradeTypeEnum("inplace");

        /**
         * Enum GREY for value: "grey"
         */
        public static final UpgradeTypeEnum GREY = new UpgradeTypeEnum("grey");

        /**
         * Enum HOTFIX for value: "hotfix"
         */
        public static final UpgradeTypeEnum HOTFIX = new UpgradeTypeEnum("hotfix");

        private static final Map<String, UpgradeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeTypeEnum> createStaticFields() {
            Map<String, UpgradeTypeEnum> map = new HashMap<>();
            map.put("inplace", INPLACE);
            map.put("grey", GREY);
            map.put("hotfix", HOTFIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpgradeTypeEnum(String value) {
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
        public static UpgradeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeTypeEnum(value));
        }

        public static UpgradeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradeTypeEnum) {
                return this.value.equals(((UpgradeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type")

    private UpgradeTypeEnum upgradeType;

    /**
     * 实例升级操作，就地升级无需传值。灰度升级包括升级自动提交，升级待观察，提交升级，升级回退四种。
     */
    public static final class UpgradeActionEnum {

        /**
         * Enum UPGRADEAUTOCOMMIT for value: "upgradeAutoCommit"
         */
        public static final UpgradeActionEnum UPGRADEAUTOCOMMIT = new UpgradeActionEnum("upgradeAutoCommit");

        /**
         * Enum UPGRADE for value: "upgrade"
         */
        public static final UpgradeActionEnum UPGRADE = new UpgradeActionEnum("upgrade");

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
            map.put("upgradeAutoCommit", UPGRADEAUTOCOMMIT);
            map.put("upgrade", UPGRADE);
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
    @JsonProperty(value = "target_version")

    private String targetVersion;

    public GaussDBUpgradeInstancesVersionRequest withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public GaussDBUpgradeInstancesVersionRequest addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public GaussDBUpgradeInstancesVersionRequest withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 批量实例ID
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public GaussDBUpgradeInstancesVersionRequest withUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * 实例升级类型，包括就地升级，灰度升级、热补丁升级三种
     * @return upgradeType
     */
    public UpgradeTypeEnum getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
    }

    public GaussDBUpgradeInstancesVersionRequest withUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
        return this;
    }

    /**
     * 实例升级操作，就地升级无需传值。灰度升级包括升级自动提交，升级待观察，提交升级，升级回退四种。
     * @return upgradeAction
     */
    public UpgradeActionEnum getUpgradeAction() {
        return upgradeAction;
    }

    public void setUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
    }

    public GaussDBUpgradeInstancesVersionRequest withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 批量实例升级目标版本，非必填。如果未传值灰度升级和就地升级默认升级到当前实例的优选版本，热补丁升级无需传该值，默认升级实例所有可升级热补丁。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GaussDBUpgradeInstancesVersionRequest that = (GaussDBUpgradeInstancesVersionRequest) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.upgradeType, that.upgradeType)
            && Objects.equals(this.upgradeAction, that.upgradeAction)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, upgradeType, upgradeAction, targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBUpgradeInstancesVersionRequest {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
        sb.append("    upgradeAction: ").append(toIndentedString(upgradeAction)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
