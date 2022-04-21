package com.huaweicloud.sdk.drs.v3.model;

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
 * 
 */
public class CreateDataLevelCompareReq {

    /**
     * 一个任务只允许有一个未完成的数据级对比任务，该字段决定对未完成数据级对比任务的处理方式。cancel-取消后重新创建,keep-保持未完成的不再创建。
     */
    public static final class ConflictPolicyEnum {

        /**
         * Enum CANCEL for value: "cancel"
         */
        public static final ConflictPolicyEnum CANCEL = new ConflictPolicyEnum("cancel");

        /**
         * Enum KEEP for value: "keep"
         */
        public static final ConflictPolicyEnum KEEP = new ConflictPolicyEnum("keep");

        private static final Map<String, ConflictPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConflictPolicyEnum> createStaticFields() {
            Map<String, ConflictPolicyEnum> map = new HashMap<>();
            map.put("cancel", CANCEL);
            map.put("keep", KEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConflictPolicyEnum(String value) {
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
        public static ConflictPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConflictPolicyEnum(value);
            }
            return result;
        }

        public static ConflictPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConflictPolicyEnum) {
                return this.value.equals(((ConflictPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_policy")

    private ConflictPolicyEnum conflictPolicy;

    /**
     * 数据级对比类型，lines-行对比,contents-内容对比。
     */
    public static final class CompareTypeEnum {

        /**
         * Enum LINES for value: "lines"
         */
        public static final CompareTypeEnum LINES = new CompareTypeEnum("lines");

        /**
         * Enum CONTENTS for value: "contents"
         */
        public static final CompareTypeEnum CONTENTS = new CompareTypeEnum("contents");

        private static final Map<String, CompareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareTypeEnum> createStaticFields() {
            Map<String, CompareTypeEnum> map = new HashMap<>();
            map.put("lines", LINES);
            map.put("contents", CONTENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareTypeEnum(String value) {
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
        public static CompareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CompareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CompareTypeEnum(value);
            }
            return result;
        }

        public static CompareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CompareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareTypeEnum) {
                return this.value.equals(((CompareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private CompareTypeEnum compareType;

    /**
     * 数据级对比模式，取值为空时需要在compare_object_infos或者compare_object_infos_with_token传对象信息，quick_comparison-快速对比，需要加入该功能的白名单才能使用。
     */
    public static final class CompareModeEnum {

        /**
         * Enum QUICK_COMPARISON for value: "quick_comparison"
         */
        public static final CompareModeEnum QUICK_COMPARISON = new CompareModeEnum("quick_comparison");

        private static final Map<String, CompareModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareModeEnum> createStaticFields() {
            Map<String, CompareModeEnum> map = new HashMap<>();
            map.put("quick_comparison", QUICK_COMPARISON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareModeEnum(String value) {
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
        public static CompareModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CompareModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CompareModeEnum(value);
            }
            return result;
        }

        public static CompareModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CompareModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareModeEnum) {
                return this.value.equals(((CompareModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_mode")

    private CompareModeEnum compareMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_object_infos")

    private List<CompareObjectInfo> compareObjectInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_object_infos_with_token")

    private List<CompareObjectInfoWithToken> compareObjectInfosWithToken = null;

    public CreateDataLevelCompareReq withConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /**
     * 一个任务只允许有一个未完成的数据级对比任务，该字段决定对未完成数据级对比任务的处理方式。cancel-取消后重新创建,keep-保持未完成的不再创建。
     * @return conflictPolicy
     */
    public ConflictPolicyEnum getConflictPolicy() {
        return conflictPolicy;
    }

    public void setConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
    }

    public CreateDataLevelCompareReq withCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 数据级对比类型，lines-行对比,contents-内容对比。
     * @return compareType
     */
    public CompareTypeEnum getCompareType() {
        return compareType;
    }

    public void setCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
    }

    public CreateDataLevelCompareReq withCompareMode(CompareModeEnum compareMode) {
        this.compareMode = compareMode;
        return this;
    }

    /**
     * 数据级对比模式，取值为空时需要在compare_object_infos或者compare_object_infos_with_token传对象信息，quick_comparison-快速对比，需要加入该功能的白名单才能使用。
     * @return compareMode
     */
    public CompareModeEnum getCompareMode() {
        return compareMode;
    }

    public void setCompareMode(CompareModeEnum compareMode) {
        this.compareMode = compareMode;
    }

    public CreateDataLevelCompareReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 对比任务启动时间，取值为空代表立即启动。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateDataLevelCompareReq withCompareObjectInfos(List<CompareObjectInfo> compareObjectInfos) {
        this.compareObjectInfos = compareObjectInfos;
        return this;
    }

    public CreateDataLevelCompareReq addCompareObjectInfosItem(CompareObjectInfo compareObjectInfosItem) {
        if (this.compareObjectInfos == null) {
            this.compareObjectInfos = new ArrayList<>();
        }
        this.compareObjectInfos.add(compareObjectInfosItem);
        return this;
    }

    public CreateDataLevelCompareReq withCompareObjectInfos(
        Consumer<List<CompareObjectInfo>> compareObjectInfosSetter) {
        if (this.compareObjectInfos == null) {
            this.compareObjectInfos = new ArrayList<>();
        }
        compareObjectInfosSetter.accept(this.compareObjectInfos);
        return this;
    }

    /**
     * 数据级对比的对象。非“快速对比”模式时，compare_object_infos和compare_object_infos_with_token根据链路二选一传值，不允许都为空。
     * @return compareObjectInfos
     */
    public List<CompareObjectInfo> getCompareObjectInfos() {
        return compareObjectInfos;
    }

    public void setCompareObjectInfos(List<CompareObjectInfo> compareObjectInfos) {
        this.compareObjectInfos = compareObjectInfos;
    }

    public CreateDataLevelCompareReq withCompareObjectInfosWithToken(
        List<CompareObjectInfoWithToken> compareObjectInfosWithToken) {
        this.compareObjectInfosWithToken = compareObjectInfosWithToken;
        return this;
    }

    public CreateDataLevelCompareReq addCompareObjectInfosWithTokenItem(
        CompareObjectInfoWithToken compareObjectInfosWithTokenItem) {
        if (this.compareObjectInfosWithToken == null) {
            this.compareObjectInfosWithToken = new ArrayList<>();
        }
        this.compareObjectInfosWithToken.add(compareObjectInfosWithTokenItem);
        return this;
    }

    public CreateDataLevelCompareReq withCompareObjectInfosWithToken(
        Consumer<List<CompareObjectInfoWithToken>> compareObjectInfosWithTokenSetter) {
        if (this.compareObjectInfosWithToken == null) {
            this.compareObjectInfosWithToken = new ArrayList<>();
        }
        compareObjectInfosWithTokenSetter.accept(this.compareObjectInfosWithToken);
        return this;
    }

    /**
     * 数据级对比的对象（Cassandra灾备专用，带token信息）。非“快速对比”模式时，compare_object_infos和compare_object_infos_with_token根据链路二选一传值，不允许都为空。
     * @return compareObjectInfosWithToken
     */
    public List<CompareObjectInfoWithToken> getCompareObjectInfosWithToken() {
        return compareObjectInfosWithToken;
    }

    public void setCompareObjectInfosWithToken(List<CompareObjectInfoWithToken> compareObjectInfosWithToken) {
        this.compareObjectInfosWithToken = compareObjectInfosWithToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDataLevelCompareReq createDataLevelCompareReq = (CreateDataLevelCompareReq) o;
        return Objects.equals(this.conflictPolicy, createDataLevelCompareReq.conflictPolicy)
            && Objects.equals(this.compareType, createDataLevelCompareReq.compareType)
            && Objects.equals(this.compareMode, createDataLevelCompareReq.compareMode)
            && Objects.equals(this.startTime, createDataLevelCompareReq.startTime)
            && Objects.equals(this.compareObjectInfos, createDataLevelCompareReq.compareObjectInfos)
            && Objects.equals(this.compareObjectInfosWithToken, createDataLevelCompareReq.compareObjectInfosWithToken);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(conflictPolicy, compareType, compareMode, startTime, compareObjectInfos, compareObjectInfosWithToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataLevelCompareReq {\n");
        sb.append("    conflictPolicy: ").append(toIndentedString(conflictPolicy)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    compareMode: ").append(toIndentedString(compareMode)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    compareObjectInfos: ").append(toIndentedString(compareObjectInfos)).append("\n");
        sb.append("    compareObjectInfosWithToken: ")
            .append(toIndentedString(compareObjectInfosWithToken))
            .append("\n");
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
