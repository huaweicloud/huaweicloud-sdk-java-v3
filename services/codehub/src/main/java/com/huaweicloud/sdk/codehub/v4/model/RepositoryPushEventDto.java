package com.huaweicloud.sdk.codehub.v4.model;

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
 * **参数解释：** 推送动态。
 */
public class RepositoryPushEventDto {

    /**
     * **参数解释：** 操作名称。 - pushed to，表示推送。 - pushed new，表示推送并新建。 - deleted，表示删除。
     */
    public static final class ActionNameEnum {

        /**
         * Enum PUSHED_TO for value: "pushed to"
         */
        public static final ActionNameEnum PUSHED_TO = new ActionNameEnum("pushed to");

        /**
         * Enum PUSHED_NEW for value: "pushed new"
         */
        public static final ActionNameEnum PUSHED_NEW = new ActionNameEnum("pushed new");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final ActionNameEnum DELETED = new ActionNameEnum("deleted");

        private static final Map<String, ActionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionNameEnum> createStaticFields() {
            Map<String, ActionNameEnum> map = new HashMap<>();
            map.put("pushed to", PUSHED_TO);
            map.put("pushed new", PUSHED_NEW);
            map.put("deleted", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionNameEnum(String value) {
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
        public static ActionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionNameEnum(value));
        }

        public static ActionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionNameEnum) {
                return this.value.equals(((ActionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private ActionNameEnum actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private RepositoryEventAuthorDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private Integer authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_username")

    private String authorUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_data")

    private PushEventPayloadDto pushData;

    public RepositoryPushEventDto withActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * **参数解释：** 操作名称。 - pushed to，表示推送。 - pushed new，表示推送并新建。 - deleted，表示删除。
     * @return actionName
     */
    public ActionNameEnum getActionName() {
        return actionName;
    }

    public void setActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
    }

    public RepositoryPushEventDto withAuthor(RepositoryEventAuthorDto author) {
        this.author = author;
        return this;
    }

    public RepositoryPushEventDto withAuthor(Consumer<RepositoryEventAuthorDto> authorSetter) {
        if (this.author == null) {
            this.author = new RepositoryEventAuthorDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public RepositoryEventAuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(RepositoryEventAuthorDto author) {
        this.author = author;
    }

    public RepositoryPushEventDto withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 触发者ID。
     * minimum: 1
     * maximum: 2147483647
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public RepositoryPushEventDto withAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
        return this;
    }

    /**
     * **参数解释：** 触发者名称。
     * @return authorUsername
     */
    public String getAuthorUsername() {
        return authorUsername;
    }

    public void setAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
    }

    public RepositoryPushEventDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryPushEventDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryPushEventDto withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释：** 仓库名。
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepositoryPushEventDto withPushData(PushEventPayloadDto pushData) {
        this.pushData = pushData;
        return this;
    }

    public RepositoryPushEventDto withPushData(Consumer<PushEventPayloadDto> pushDataSetter) {
        if (this.pushData == null) {
            this.pushData = new PushEventPayloadDto();
            pushDataSetter.accept(this.pushData);
        }

        return this;
    }

    /**
     * Get pushData
     * @return pushData
     */
    public PushEventPayloadDto getPushData() {
        return pushData;
    }

    public void setPushData(PushEventPayloadDto pushData) {
        this.pushData = pushData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryPushEventDto that = (RepositoryPushEventDto) obj;
        return Objects.equals(this.actionName, that.actionName) && Objects.equals(this.author, that.author)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.authorUsername, that.authorUsername)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.repositoryName, that.repositoryName) && Objects.equals(this.pushData, that.pushData);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(actionName, author, authorId, authorUsername, createdAt, repositoryId, repositoryName, pushData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryPushEventDto {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    authorUsername: ").append(toIndentedString(authorUsername)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    pushData: ").append(toIndentedString(pushData)).append("\n");
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
