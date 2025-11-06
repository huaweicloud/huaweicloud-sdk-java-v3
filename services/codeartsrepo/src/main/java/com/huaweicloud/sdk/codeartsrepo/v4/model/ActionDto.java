package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 提交动作设置参数。
 */
public class ActionDto {

    /**
     * **参数解释：** 要执行的操作。 **取值范围：** - create，创建文件。 - create_dir，创建目录。 - update，更新。 - move，移动。 - delete，删除。 - chmod，更改权限。
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        /**
         * Enum CREATE_DIR for value: "create_dir"
         */
        public static final ActionEnum CREATE_DIR = new ActionEnum("create_dir");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final ActionEnum UPDATE = new ActionEnum("update");

        /**
         * Enum MOVE for value: "move"
         */
        public static final ActionEnum MOVE = new ActionEnum("move");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        /**
         * Enum CHMOD for value: "chmod"
         */
        public static final ActionEnum CHMOD = new ActionEnum("chmod");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put("create_dir", CREATE_DIR);
            map.put("update", UPDATE);
            map.put("move", MOVE);
            map.put("delete", DELETE);
            map.put("chmod", CHMOD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_path")

    private String previousPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private Boolean lastCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_filemode")

    private Boolean executeFilemode;

    public ActionDto withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 要执行的操作。 **取值范围：** - create，创建文件。 - create_dir，创建目录。 - update，更新。 - move，移动。 - delete，删除。 - chmod，更改权限。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ActionDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ActionDto withPreviousPath(String previousPath) {
        this.previousPath = previousPath;
        return this;
    }

    /**
     * **参数解释：** 上一个路径。 **取值范围：** 不涉及。
     * @return previousPath
     */
    public String getPreviousPath() {
        return previousPath;
    }

    public void setPreviousPath(String previousPath) {
        this.previousPath = previousPath;
    }

    public ActionDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 文件内容。 **取值范围：** 不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ActionDto withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * **参数解释：** 编码方式。 **取值范围：** - text。 - base64.
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public ActionDto withLastCommitId(Boolean lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * **参数解释：** 上次已知的文件提交ID。 **取值范围：** 不涉及。
     * @return lastCommitId
     */
    public Boolean getLastCommitId() {
        return lastCommitId;
    }

    public void setLastCommitId(Boolean lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    public ActionDto withExecuteFilemode(Boolean executeFilemode) {
        this.executeFilemode = executeFilemode;
        return this;
    }

    /**
     * **参数解释：** 执行文件模式。 **取值范围：** - true，启用文件上的执行标志。 - false，禁用文件上的执行标志
     * @return executeFilemode
     */
    public Boolean getExecuteFilemode() {
        return executeFilemode;
    }

    public void setExecuteFilemode(Boolean executeFilemode) {
        this.executeFilemode = executeFilemode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionDto that = (ActionDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.previousPath, that.previousPath) && Objects.equals(this.content, that.content)
            && Objects.equals(this.encoding, that.encoding) && Objects.equals(this.lastCommitId, that.lastCommitId)
            && Objects.equals(this.executeFilemode, that.executeFilemode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, filePath, previousPath, content, encoding, lastCommitId, executeFilemode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    previousPath: ").append(toIndentedString(previousPath)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
        sb.append("    executeFilemode: ").append(toIndentedString(executeFilemode)).append("\n");
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
