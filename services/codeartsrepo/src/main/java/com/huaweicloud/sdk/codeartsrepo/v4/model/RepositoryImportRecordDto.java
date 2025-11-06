package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryImportRecordDto
 */
public class RepositoryImportRecordDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    /**
     * **参数解释：** 规则名称。 **约束限制：** 不涉及。 **取值范围：** - finished, 导入成功 - fail, 导入失败 - importing, 导入中 **默认取值：** 不涉及。
     */
    public static final class StateEnum {

        /**
         * Enum FINISHED_ for value: "finished, 导入成功"
         */
        public static final StateEnum FINISHED_ = new StateEnum("finished, 导入成功");

        /**
         * Enum FAIL_ for value: "fail, 导入失败"
         */
        public static final StateEnum FAIL_ = new StateEnum("fail, 导入失败");

        /**
         * Enum IMPORTING_ for value: "importing, 导入中"
         */
        public static final StateEnum IMPORTING_ = new StateEnum("importing, 导入中");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("finished, 导入成功", FINISHED_);
            map.put("fail, 导入失败", FAIL_);
            map.put("importing, 导入中", IMPORTING_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private RepositorySimpleDto repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_full_name")

    private String originFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    /**
     * **参数解释：** 导入来源。 **取值范围：** - gitee - self_managed_gitlab - gitlab - github - git - svn - coding - bitbucket - gerrit - codeup
     */
    public static final class SourceTypeEnum {

        /**
         * Enum GITEE for value: "gitee"
         */
        public static final SourceTypeEnum GITEE = new SourceTypeEnum("gitee");

        /**
         * Enum SELF_MANAGED_GITLAB for value: "self_managed_gitlab"
         */
        public static final SourceTypeEnum SELF_MANAGED_GITLAB = new SourceTypeEnum("self_managed_gitlab");

        /**
         * Enum GITLAB for value: "gitlab"
         */
        public static final SourceTypeEnum GITLAB = new SourceTypeEnum("gitlab");

        /**
         * Enum GITHUB for value: "github"
         */
        public static final SourceTypeEnum GITHUB = new SourceTypeEnum("github");

        /**
         * Enum GIT for value: "git"
         */
        public static final SourceTypeEnum GIT = new SourceTypeEnum("git");

        /**
         * Enum SVN for value: "svn"
         */
        public static final SourceTypeEnum SVN = new SourceTypeEnum("svn");

        /**
         * Enum CODING for value: "coding"
         */
        public static final SourceTypeEnum CODING = new SourceTypeEnum("coding");

        /**
         * Enum BITBUCKET for value: "bitbucket"
         */
        public static final SourceTypeEnum BITBUCKET = new SourceTypeEnum("bitbucket");

        /**
         * Enum GERRIT for value: "gerrit"
         */
        public static final SourceTypeEnum GERRIT = new SourceTypeEnum("gerrit");

        /**
         * Enum CODEUP for value: "codeup"
         */
        public static final SourceTypeEnum CODEUP = new SourceTypeEnum("codeup");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("gitee", GITEE);
            map.put("self_managed_gitlab", SELF_MANAGED_GITLAB);
            map.put("gitlab", GITLAB);
            map.put("github", GITHUB);
            map.put("git", GIT);
            map.put("svn", SVN);
            map.put("coding", CODING);
            map.put("bitbucket", BITBUCKET);
            map.put("gerrit", GERRIT);
            map.put("codeup", CODEUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_at")

    private String finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_size")

    private Double repositorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_full_name")

    private String targetFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    public RepositoryImportRecordDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 主键ID。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryImportRecordDto withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 规则名称。 **约束限制：** 不涉及。 **取值范围：** - finished, 导入成功 - fail, 导入失败 - importing, 导入中 **默认取值：** 不涉及。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RepositoryImportRecordDto withRepository(RepositorySimpleDto repository) {
        this.repository = repository;
        return this;
    }

    public RepositoryImportRecordDto withRepository(Consumer<RepositorySimpleDto> repositorySetter) {
        if (this.repository == null) {
            this.repository = new RepositorySimpleDto();
            repositorySetter.accept(this.repository);
        }

        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    public RepositorySimpleDto getRepository() {
        return repository;
    }

    public void setRepository(RepositorySimpleDto repository) {
        this.repository = repository;
    }

    public RepositoryImportRecordDto withOriginFullName(String originFullName) {
        this.originFullName = originFullName;
        return this;
    }

    /**
     * **参数解释：** 源仓库路径。
     * @return originFullName
     */
    public String getOriginFullName() {
        return originFullName;
    }

    public void setOriginFullName(String originFullName) {
        this.originFullName = originFullName;
    }

    public RepositoryImportRecordDto withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * **参数解释：** 源仓库地址。
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public RepositoryImportRecordDto withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释：** 导入来源。 **取值范围：** - gitee - self_managed_gitlab - gitlab - github - git - svn - coding - bitbucket - gerrit - codeup
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public RepositoryImportRecordDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 导入时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryImportRecordDto withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * **参数解释：** 导入完成时间。
     * @return finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public RepositoryImportRecordDto withRepositorySize(Double repositorySize) {
        this.repositorySize = repositorySize;
        return this;
    }

    /**
     * **参数解释：** 源仓库容量。
     * minimum: 0.0
     * maximum: 30720.0
     * @return repositorySize
     */
    public Double getRepositorySize() {
        return repositorySize;
    }

    public void setRepositorySize(Double repositorySize) {
        this.repositorySize = repositorySize;
    }

    public RepositoryImportRecordDto withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释：** 失败原因。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public RepositoryImportRecordDto withTargetFullName(String targetFullName) {
        this.targetFullName = targetFullName;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。
     * @return targetFullName
     */
    public String getTargetFullName() {
        return targetFullName;
    }

    public void setTargetFullName(String targetFullName) {
        this.targetFullName = targetFullName;
    }

    public RepositoryImportRecordDto withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * **参数解释：** 项目ID。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryImportRecordDto that = (RepositoryImportRecordDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.repository, that.repository)
            && Objects.equals(this.originFullName, that.originFullName)
            && Objects.equals(this.sourceUrl, that.sourceUrl) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.finishedAt, that.finishedAt)
            && Objects.equals(this.repositorySize, that.repositorySize)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.targetFullName, that.targetFullName)
            && Objects.equals(this.targetProjectId, that.targetProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            state,
            repository,
            originFullName,
            sourceUrl,
            sourceType,
            createdAt,
            finishedAt,
            repositorySize,
            errorMessage,
            targetFullName,
            targetProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryImportRecordDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    originFullName: ").append(toIndentedString(originFullName)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    repositorySize: ").append(toIndentedString(repositorySize)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    targetFullName: ").append(toIndentedString(targetFullName)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
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
