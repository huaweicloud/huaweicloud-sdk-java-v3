package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 批量分配桌面策略。
 */
public class AssignModelInfo {

    /**
     * 分配的维度，当前支持  - USER: “用户为维度” - DESKTOP:“桌面为维度”两种。
     */
    public static final class AssignDimensionEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final AssignDimensionEnum USER = new AssignDimensionEnum("USER");

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final AssignDimensionEnum DESKTOP = new AssignDimensionEnum("DESKTOP");

        private static final Map<String, AssignDimensionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssignDimensionEnum> createStaticFields() {
            Map<String, AssignDimensionEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("DESKTOP", DESKTOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssignDimensionEnum(String value) {
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
        public static AssignDimensionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssignDimensionEnum(value));
        }

        public static AssignDimensionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssignDimensionEnum) {
                return this.value.equals(((AssignDimensionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_dimension")

    private AssignDimensionEnum assignDimension;

    /**
     * 优先分配的策略，策略名为规则为{维度}_{子策略}  - USER_NO_DESKTOP:  用户维度-无桌面 - USER_FIXED_DESKTOP_NUM: 用户维度-桌面个数固定 - DESKTOP_ASSIGN_USER_PRIORITY： 桌面维度-用户优先 - DESKTOP_ASSIGN_FIXED_USER： 桌面维度-固定用户 - DESKTOP_ASSIGN_USERS_OR_GROUPS： 桌面维度-为每台桌面分配所选的所有用户（组） - FIXED_RELATION: 使用参数中的固定分配关系
     */
    public static final class PriorityStrategyEnum {

        /**
         * Enum USER_NO_DESKTOP for value: "USER_NO_DESKTOP"
         */
        public static final PriorityStrategyEnum USER_NO_DESKTOP = new PriorityStrategyEnum("USER_NO_DESKTOP");

        /**
         * Enum USER_FIXED_DESKTOP_NUM for value: "USER_FIXED_DESKTOP_NUM"
         */
        public static final PriorityStrategyEnum USER_FIXED_DESKTOP_NUM =
            new PriorityStrategyEnum("USER_FIXED_DESKTOP_NUM");

        /**
         * Enum DESKTOP_ASSIGN_USER_PRIORITY for value: "DESKTOP_ASSIGN_USER_PRIORITY"
         */
        public static final PriorityStrategyEnum DESKTOP_ASSIGN_USER_PRIORITY =
            new PriorityStrategyEnum("DESKTOP_ASSIGN_USER_PRIORITY");

        /**
         * Enum DESKTOP_ASSIGN_FIXED_USER for value: "DESKTOP_ASSIGN_FIXED_USER"
         */
        public static final PriorityStrategyEnum DESKTOP_ASSIGN_FIXED_USER =
            new PriorityStrategyEnum("DESKTOP_ASSIGN_FIXED_USER");

        /**
         * Enum DESKTOP_ASSIGN_USERS_OR_GROUPS for value: "DESKTOP_ASSIGN_USERS_OR_GROUPS"
         */
        public static final PriorityStrategyEnum DESKTOP_ASSIGN_USERS_OR_GROUPS =
            new PriorityStrategyEnum("DESKTOP_ASSIGN_USERS_OR_GROUPS");

        /**
         * Enum FIXED_RELATION for value: "FIXED_RELATION"
         */
        public static final PriorityStrategyEnum FIXED_RELATION = new PriorityStrategyEnum("FIXED_RELATION");

        private static final Map<String, PriorityStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PriorityStrategyEnum> createStaticFields() {
            Map<String, PriorityStrategyEnum> map = new HashMap<>();
            map.put("USER_NO_DESKTOP", USER_NO_DESKTOP);
            map.put("USER_FIXED_DESKTOP_NUM", USER_FIXED_DESKTOP_NUM);
            map.put("DESKTOP_ASSIGN_USER_PRIORITY", DESKTOP_ASSIGN_USER_PRIORITY);
            map.put("DESKTOP_ASSIGN_FIXED_USER", DESKTOP_ASSIGN_FIXED_USER);
            map.put("DESKTOP_ASSIGN_USERS_OR_GROUPS", DESKTOP_ASSIGN_USERS_OR_GROUPS);
            map.put("FIXED_RELATION", FIXED_RELATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PriorityStrategyEnum(String value) {
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
        public static PriorityStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PriorityStrategyEnum(value));
        }

        public static PriorityStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityStrategyEnum) {
                return this.value.equals(((PriorityStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_strategy")

    private PriorityStrategyEnum priorityStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_assigin_user_num")

    private Integer desktopAssiginUserNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_assigin_desktop_num")

    private Integer userAssiginDesktopNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    public AssignModelInfo withAssignDimension(AssignDimensionEnum assignDimension) {
        this.assignDimension = assignDimension;
        return this;
    }

    /**
     * 分配的维度，当前支持  - USER: “用户为维度” - DESKTOP:“桌面为维度”两种。
     * @return assignDimension
     */
    public AssignDimensionEnum getAssignDimension() {
        return assignDimension;
    }

    public void setAssignDimension(AssignDimensionEnum assignDimension) {
        this.assignDimension = assignDimension;
    }

    public AssignModelInfo withPriorityStrategy(PriorityStrategyEnum priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }

    /**
     * 优先分配的策略，策略名为规则为{维度}_{子策略}  - USER_NO_DESKTOP:  用户维度-无桌面 - USER_FIXED_DESKTOP_NUM: 用户维度-桌面个数固定 - DESKTOP_ASSIGN_USER_PRIORITY： 桌面维度-用户优先 - DESKTOP_ASSIGN_FIXED_USER： 桌面维度-固定用户 - DESKTOP_ASSIGN_USERS_OR_GROUPS： 桌面维度-为每台桌面分配所选的所有用户（组） - FIXED_RELATION: 使用参数中的固定分配关系
     * @return priorityStrategy
     */
    public PriorityStrategyEnum getPriorityStrategy() {
        return priorityStrategy;
    }

    public void setPriorityStrategy(PriorityStrategyEnum priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
    }

    public AssignModelInfo withDesktopAssiginUserNum(Integer desktopAssiginUserNum) {
        this.desktopAssiginUserNum = desktopAssiginUserNum;
        return this;
    }

    /**
     * 每个桌面自动分配的用户数，当子策略为 DESKTOP_ASSIGN_FIXED_USER 必填。
     * minimum: 0
     * maximum: 100
     * @return desktopAssiginUserNum
     */
    public Integer getDesktopAssiginUserNum() {
        return desktopAssiginUserNum;
    }

    public void setDesktopAssiginUserNum(Integer desktopAssiginUserNum) {
        this.desktopAssiginUserNum = desktopAssiginUserNum;
    }

    public AssignModelInfo withUserAssiginDesktopNum(Integer userAssiginDesktopNum) {
        this.userAssiginDesktopNum = userAssiginDesktopNum;
        return this;
    }

    /**
     * 每个用户自动分配桌面数，当子策略为 USER_NO_DESKTOP、USER_FIXED_DESKTOP_NUM必填。
     * minimum: 0
     * maximum: 100
     * @return userAssiginDesktopNum
     */
    public Integer getUserAssiginDesktopNum() {
        return userAssiginDesktopNum;
    }

    public void setUserAssiginDesktopNum(Integer userAssiginDesktopNum) {
        this.userAssiginDesktopNum = userAssiginDesktopNum;
    }

    public AssignModelInfo withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略，如果指定了桌面名称则优先使用指定的桌面名称。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssignModelInfo that = (AssignModelInfo) obj;
        return Objects.equals(this.assignDimension, that.assignDimension)
            && Objects.equals(this.priorityStrategy, that.priorityStrategy)
            && Objects.equals(this.desktopAssiginUserNum, that.desktopAssiginUserNum)
            && Objects.equals(this.userAssiginDesktopNum, that.userAssiginDesktopNum)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(assignDimension, priorityStrategy, desktopAssiginUserNum, userAssiginDesktopNum, desktopNamePolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignModelInfo {\n");
        sb.append("    assignDimension: ").append(toIndentedString(assignDimension)).append("\n");
        sb.append("    priorityStrategy: ").append(toIndentedString(priorityStrategy)).append("\n");
        sb.append("    desktopAssiginUserNum: ").append(toIndentedString(desktopAssiginUserNum)).append("\n");
        sb.append("    userAssiginDesktopNum: ").append(toIndentedString(userAssiginDesktopNum)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
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
