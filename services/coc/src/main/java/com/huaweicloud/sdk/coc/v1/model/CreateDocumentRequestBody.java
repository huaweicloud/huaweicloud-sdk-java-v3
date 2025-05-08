package com.huaweicloud.sdk.coc.v1.model;

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
 * CreateDocumentRequestBody
 */
public class CreateDocumentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 风险等级。 - LOW：低。 - MEDIUM：中。 - HIGH：高。
     */
    public static final class RiskLevelEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskLevelEnum LOW = new RiskLevelEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskLevelEnum MEDIUM = new RiskLevelEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskLevelEnum HIGH = new RiskLevelEnum("HIGH");

        private static final Map<String, RiskLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskLevelEnum> createStaticFields() {
            Map<String, RiskLevelEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskLevelEnum(String value) {
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
        public static RiskLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelEnum(value));
        }

        public static RiskLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskLevelEnum) {
                return this.value.equals(((RiskLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private RiskLevelEnum riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateDocumentRequestBodyTags> tags = null;

    public CreateDocumentRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDocumentRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 作业内容，DSL语句，最大长度64KB
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateDocumentRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDocumentRequestBody withRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级。 - LOW：低。 - MEDIUM：中。 - HIGH：高。
     * @return riskLevel
     */
    public RiskLevelEnum getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
    }

    public CreateDocumentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDocumentRequestBody withTags(List<CreateDocumentRequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDocumentRequestBody addTagsItem(CreateDocumentRequestBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDocumentRequestBody withTags(Consumer<List<CreateDocumentRequestBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<CreateDocumentRequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateDocumentRequestBodyTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDocumentRequestBody that = (CreateDocumentRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.content, that.content)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, content, enterpriseProjectId, riskLevel, description, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocumentRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
