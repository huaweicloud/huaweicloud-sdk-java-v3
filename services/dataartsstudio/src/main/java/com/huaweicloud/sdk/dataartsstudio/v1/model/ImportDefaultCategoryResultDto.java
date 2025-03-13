package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * ImportDefaultCategoryResultDto
 */
public class ImportDefaultCategoryResultDto {

    /**
     * 导入状态 * success 导入成功 * failed 导入失败
     */
    public static final class ImportStatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ImportStatusEnum SUCCESS = new ImportStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ImportStatusEnum FAILED = new ImportStatusEnum("failed");

        private static final Map<String, ImportStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImportStatusEnum> createStaticFields() {
            Map<String, ImportStatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImportStatusEnum(String value) {
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
        public static ImportStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImportStatusEnum(value));
        }

        public static ImportStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImportStatusEnum) {
                return this.value.equals(((ImportStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_status")

    private ImportStatusEnum importStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_error_message")

    private String importErrorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<ImportDefaultCategoryResultDto> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_result")

    private List<ImportDefaultRuleResultDto> ruleResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ImportDefaultCategoryResultDto withImportStatus(ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * 导入状态 * success 导入成功 * failed 导入失败
     * @return importStatus
     */
    public ImportStatusEnum getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
    }

    public ImportDefaultCategoryResultDto withImportErrorMessage(String importErrorMessage) {
        this.importErrorMessage = importErrorMessage;
        return this;
    }

    /**
     * 导入错误原因。
     * @return importErrorMessage
     */
    public String getImportErrorMessage() {
        return importErrorMessage;
    }

    public void setImportErrorMessage(String importErrorMessage) {
        this.importErrorMessage = importErrorMessage;
    }

    public ImportDefaultCategoryResultDto withChildren(List<ImportDefaultCategoryResultDto> children) {
        this.children = children;
        return this;
    }

    public ImportDefaultCategoryResultDto addChildrenItem(ImportDefaultCategoryResultDto childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ImportDefaultCategoryResultDto withChildren(Consumer<List<ImportDefaultCategoryResultDto>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子分类导入结果。
     * @return children
     */
    public List<ImportDefaultCategoryResultDto> getChildren() {
        return children;
    }

    public void setChildren(List<ImportDefaultCategoryResultDto> children) {
        this.children = children;
    }

    public ImportDefaultCategoryResultDto withRuleResult(List<ImportDefaultRuleResultDto> ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }

    public ImportDefaultCategoryResultDto addRuleResultItem(ImportDefaultRuleResultDto ruleResultItem) {
        if (this.ruleResult == null) {
            this.ruleResult = new ArrayList<>();
        }
        this.ruleResult.add(ruleResultItem);
        return this;
    }

    public ImportDefaultCategoryResultDto withRuleResult(Consumer<List<ImportDefaultRuleResultDto>> ruleResultSetter) {
        if (this.ruleResult == null) {
            this.ruleResult = new ArrayList<>();
        }
        ruleResultSetter.accept(this.ruleResult);
        return this;
    }

    /**
     * 此分类绑定的规则导入的结果。
     * @return ruleResult
     */
    public List<ImportDefaultRuleResultDto> getRuleResult() {
        return ruleResult;
    }

    public void setRuleResult(List<ImportDefaultRuleResultDto> ruleResult) {
        this.ruleResult = ruleResult;
    }

    public ImportDefaultCategoryResultDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 数据分类id。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ImportDefaultCategoryResultDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据分类名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImportDefaultCategoryResultDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据分类描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportDefaultCategoryResultDto that = (ImportDefaultCategoryResultDto) obj;
        return Objects.equals(this.importStatus, that.importStatus)
            && Objects.equals(this.importErrorMessage, that.importErrorMessage)
            && Objects.equals(this.children, that.children) && Objects.equals(this.ruleResult, that.ruleResult)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importStatus, importErrorMessage, children, ruleResult, uuid, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDefaultCategoryResultDto {\n");
        sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
        sb.append("    importErrorMessage: ").append(toIndentedString(importErrorMessage)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    ruleResult: ").append(toIndentedString(ruleResult)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
