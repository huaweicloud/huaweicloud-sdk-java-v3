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
 * CreateScheduleTaskRequestBody
 */
public class CreateScheduleTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 实例升级类型。
     */
    public static final class UpgradeTypeEnum {

        /**
         * Enum HOTFIX for value: "hotfix"
         */
        public static final UpgradeTypeEnum HOTFIX = new UpgradeTypeEnum("hotfix");

        private static final Map<String, UpgradeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeTypeEnum> createStaticFields() {
            Map<String, UpgradeTypeEnum> map = new HashMap<>();
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
     * 实例升级操作。
     */
    public static final class UpgradeActionEnum {

        /**
         * Enum UPGRADEAUTOCOMMIT for value: "upgradeAutoCommit"
         */
        public static final UpgradeActionEnum UPGRADEAUTOCOMMIT = new UpgradeActionEnum("upgradeAutoCommit");

        private static final Map<String, UpgradeActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeActionEnum> createStaticFields() {
            Map<String, UpgradeActionEnum> map = new HashMap<>();
            map.put("upgradeAutoCommit", UPGRADEAUTOCOMMIT);
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

    public CreateScheduleTaskRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public CreateScheduleTaskRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public CreateScheduleTaskRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例ID列表。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public CreateScheduleTaskRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateScheduleTaskRequestBody withUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * 实例升级类型。
     * @return upgradeType
     */
    public UpgradeTypeEnum getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
    }

    public CreateScheduleTaskRequestBody withUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
        return this;
    }

    /**
     * 实例升级操作。
     * @return upgradeAction
     */
    public UpgradeActionEnum getUpgradeAction() {
        return upgradeAction;
    }

    public void setUpgradeAction(UpgradeActionEnum upgradeAction) {
        this.upgradeAction = upgradeAction;
    }

    public CreateScheduleTaskRequestBody withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 实例升级目标版本。
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
        CreateScheduleTaskRequestBody that = (CreateScheduleTaskRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.upgradeType, that.upgradeType)
            && Objects.equals(this.upgradeAction, that.upgradeAction)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, startTime, upgradeType, upgradeAction, targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduleTaskRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
