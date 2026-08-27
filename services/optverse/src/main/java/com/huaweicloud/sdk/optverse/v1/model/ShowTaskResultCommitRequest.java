package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskResultCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evolve_task_id")

    private String evolveTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private Integer iteration;

    /**
     * **参数解释**： 信息类型。 **约束限制**： 不涉及 **取值范围**： * CODE: 代码文件 * INSIGHT: LLM的见解 * SUMMARY: 结果的汇总指标 **默认取值**： 不涉及 
     */
    public static final class TypeEnum {

        /**
         * Enum SUMMARY for value: "SUMMARY"
         */
        public static final TypeEnum SUMMARY = new TypeEnum("SUMMARY");

        /**
         * Enum INSIGHT for value: "INSIGHT"
         */
        public static final TypeEnum INSIGHT = new TypeEnum("INSIGHT");

        /**
         * Enum CODE for value: "CODE"
         */
        public static final TypeEnum CODE = new TypeEnum("CODE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SUMMARY", SUMMARY);
            map.put("INSIGHT", INSIGHT);
            map.put("CODE", CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    public ShowTaskResultCommitRequest withEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
        return this;
    }

    /**
     * **参数解释**： 演化任务标识符。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return evolveTaskId
     */
    public String getEvolveTaskId() {
        return evolveTaskId;
    }

    public void setEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
    }

    public ShowTaskResultCommitRequest withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释**： 演化任务结果的commit_id。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-256]个字符。 **默认取值**： 不涉及 
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ShowTaskResultCommitRequest withIteration(Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    /**
     * **参数解释**： 从哪个轮次开始查询。 **约束限制**： 不涉及 **取值范围**： [-1-10000]。 **默认取值**： 不涉及 
     * minimum: -1
     * maximum: 10000
     * @return iteration
     */
    public Integer getIteration() {
        return iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    public ShowTaskResultCommitRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 信息类型。 **约束限制**： 不涉及 **取值范围**： * CODE: 代码文件 * INSIGHT: LLM的见解 * SUMMARY: 结果的汇总指标 **默认取值**： 不涉及 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowTaskResultCommitRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件路径，默认值为算法文件，算法文件为空时，会自动去INSIGHT返回。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-896]个字符。 **默认取值**： 不涉及 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskResultCommitRequest that = (ShowTaskResultCommitRequest) obj;
        return Objects.equals(this.evolveTaskId, that.evolveTaskId) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.iteration, that.iteration) && Objects.equals(this.type, that.type)
            && Objects.equals(this.filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evolveTaskId, commitId, iteration, type, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResultCommitRequest {\n");
        sb.append("    evolveTaskId: ").append(toIndentedString(evolveTaskId)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
