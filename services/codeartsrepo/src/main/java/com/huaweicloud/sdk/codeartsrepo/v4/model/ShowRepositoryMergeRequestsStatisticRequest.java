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
 * Request Object
 */
public class ShowRepositoryMergeRequestsStatisticRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iids")

    private String iids;

    /**
     * **参数解释：** 统计字段。 **约束限制 ** - commits_count，统计提交数 - changed_files_count，文件变更数 - notes_count， 检视意见数 - changed_lines_count，代码变更行数
     */
    public static final class FieldsEnum {

        /**
         * Enum COMMITS_COUNT for value: "commits_count"
         */
        public static final FieldsEnum COMMITS_COUNT = new FieldsEnum("commits_count");

        /**
         * Enum CHANGED_FILES_COUNT for value: "changed_files_count"
         */
        public static final FieldsEnum CHANGED_FILES_COUNT = new FieldsEnum("changed_files_count");

        /**
         * Enum NOTES_COUNT for value: "notes_count"
         */
        public static final FieldsEnum NOTES_COUNT = new FieldsEnum("notes_count");

        /**
         * Enum CHANGED_LINES_COUNT for value: "changed_lines_count"
         */
        public static final FieldsEnum CHANGED_LINES_COUNT = new FieldsEnum("changed_lines_count");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("commits_count", COMMITS_COUNT);
            map.put("changed_files_count", CHANGED_FILES_COUNT);
            map.put("notes_count", NOTES_COUNT);
            map.put("changed_lines_count", CHANGED_LINES_COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private FieldsEnum fields;

    public ShowRepositoryMergeRequestsStatisticRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ShowRepositoryMergeRequestsStatisticRequest withIids(String iids) {
        this.iids = iids;
        return this;
    }

    /**
     * **参数解释：** 合并请求iid。
     * @return iids
     */
    public String getIids() {
        return iids;
    }

    public void setIids(String iids) {
        this.iids = iids;
    }

    public ShowRepositoryMergeRequestsStatisticRequest withFields(FieldsEnum fields) {
        this.fields = fields;
        return this;
    }

    /**
     * **参数解释：** 统计字段。 **约束限制 ** - commits_count，统计提交数 - changed_files_count，文件变更数 - notes_count， 检视意见数 - changed_lines_count，代码变更行数
     * @return fields
     */
    public FieldsEnum getFields() {
        return fields;
    }

    public void setFields(FieldsEnum fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryMergeRequestsStatisticRequest that = (ShowRepositoryMergeRequestsStatisticRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.iids, that.iids)
            && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, iids, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryMergeRequestsStatisticRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    iids: ").append(toIndentedString(iids)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
