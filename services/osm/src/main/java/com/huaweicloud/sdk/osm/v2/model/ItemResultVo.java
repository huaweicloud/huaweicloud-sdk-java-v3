package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ItemResultVo
 */
public class ItemResultVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    /**
     * 是否可见
     */
    public static final class VisibleEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final VisibleEnum NUMBER_0 = new VisibleEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final VisibleEnum NUMBER_1 = new VisibleEnum(1);

        private static final Map<Integer, VisibleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, VisibleEnum> createStaticFields() {
            Map<Integer, VisibleEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        VisibleEnum(Integer value) {
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
        public static VisibleEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibleEnum(value));
        }

        public static VisibleEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibleEnum) {
                return this.value.equals(((VisibleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private VisibleEnum visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_id")

    private String checkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    /**
     * 问题等级 0:未执行，3 正常，4 异常；可用于判断检查项执行结果
     */
    public static final class ProblemLevelEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProblemLevelEnum NUMBER_0 = new ProblemLevelEnum(0);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ProblemLevelEnum NUMBER_3 = new ProblemLevelEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final ProblemLevelEnum NUMBER_4 = new ProblemLevelEnum(4);

        private static final Map<Integer, ProblemLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProblemLevelEnum> createStaticFields() {
            Map<Integer, ProblemLevelEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProblemLevelEnum(Integer value) {
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
        public static ProblemLevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProblemLevelEnum(value));
        }

        public static ProblemLevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProblemLevelEnum) {
                return this.value.equals(((ProblemLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "problem_level")

    private ProblemLevelEnum problemLevel;

    public ItemResultVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态
     * minimum: 0
     * maximum: 100
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ItemResultVo withVisible(VisibleEnum visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 是否可见
     * @return visible
     */
    public VisibleEnum getVisible() {
        return visible;
    }

    public void setVisible(VisibleEnum visible) {
        this.visible = visible;
    }

    public ItemResultVo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 检查项的大类Id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ItemResultVo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 检查项的大类名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ItemResultVo withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * 检查项ID
     * @return checkId
     */
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public ItemResultVo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * 执行状态
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ItemResultVo withProblemLevel(ProblemLevelEnum problemLevel) {
        this.problemLevel = problemLevel;
        return this;
    }

    /**
     * 问题等级 0:未执行，3 正常，4 异常；可用于判断检查项执行结果
     * @return problemLevel
     */
    public ProblemLevelEnum getProblemLevel() {
        return problemLevel;
    }

    public void setProblemLevel(ProblemLevelEnum problemLevel) {
        this.problemLevel = problemLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemResultVo that = (ItemResultVo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.checkId, that.checkId) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.problemLevel, that.problemLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, visible, resourceId, resourceName, checkId, checkName, problemLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemResultVo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    problemLevel: ").append(toIndentedString(problemLevel)).append("\n");
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
