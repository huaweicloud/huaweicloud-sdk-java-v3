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
 * Request Object
 */
public class ListApisRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * 数据服务的版本类型，指定SHARED共享版或EXCLUSIVE专享版。
     */
    public static final class DlmTypeEnum {

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final DlmTypeEnum SHARED = new DlmTypeEnum("SHARED");

        /**
         * Enum EXCLUSIVE for value: "EXCLUSIVE"
         */
        public static final DlmTypeEnum EXCLUSIVE = new DlmTypeEnum("EXCLUSIVE");

        private static final Map<String, DlmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DlmTypeEnum> createStaticFields() {
            Map<String, DlmTypeEnum> map = new HashMap<>();
            map.put("SHARED", SHARED);
            map.put("EXCLUSIVE", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DlmTypeEnum(String value) {
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
        public static DlmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DlmTypeEnum(value));
        }

        public static DlmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DlmTypeEnum) {
                return this.value.equals(((DlmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Dlm-Type")

    private DlmTypeEnum dlmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-return-publish-messages")

    private String xReturnPublishMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * API类型。
     */
    public static final class ApiTypeEnum {

        /**
         * Enum API_SPECIFIC_TYPE_CONFIGURATION for value: "API_SPECIFIC_TYPE_CONFIGURATION"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_CONFIGURATION =
            new ApiTypeEnum("API_SPECIFIC_TYPE_CONFIGURATION");

        /**
         * Enum API_SPECIFIC_TYPE_SCRIPT for value: "API_SPECIFIC_TYPE_SCRIPT"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_SCRIPT = new ApiTypeEnum("API_SPECIFIC_TYPE_SCRIPT");

        /**
         * Enum API_SPECIFIC_TYPE_REGISTER for value: "API_SPECIFIC_TYPE_REGISTER"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_REGISTER = new ApiTypeEnum("API_SPECIFIC_TYPE_REGISTER");

        /**
         * Enum API_SPECIFIC_TYPE_MYBATIS for value: "API_SPECIFIC_TYPE_MYBATIS"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_MYBATIS = new ApiTypeEnum("API_SPECIFIC_TYPE_MYBATIS");

        /**
         * Enum API_SPECIFIC_TYPE_GROOVY for value: "API_SPECIFIC_TYPE_GROOVY"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_GROOVY = new ApiTypeEnum("API_SPECIFIC_TYPE_GROOVY");

        private static final Map<String, ApiTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiTypeEnum> createStaticFields() {
            Map<String, ApiTypeEnum> map = new HashMap<>();
            map.put("API_SPECIFIC_TYPE_CONFIGURATION", API_SPECIFIC_TYPE_CONFIGURATION);
            map.put("API_SPECIFIC_TYPE_SCRIPT", API_SPECIFIC_TYPE_SCRIPT);
            map.put("API_SPECIFIC_TYPE_REGISTER", API_SPECIFIC_TYPE_REGISTER);
            map.put("API_SPECIFIC_TYPE_MYBATIS", API_SPECIFIC_TYPE_MYBATIS);
            map.put("API_SPECIFIC_TYPE_GROOVY", API_SPECIFIC_TYPE_GROOVY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiTypeEnum(String value) {
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
        public static ApiTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiTypeEnum(value));
        }

        public static ApiTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiTypeEnum) {
                return this.value.equals(((ApiTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiTypeEnum apiType;

    /**
     * API发布状态。
     */
    public static final class PublishStatusEnum {

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final PublishStatusEnum PUBLISHED = new PublishStatusEnum("PUBLISHED");

        /**
         * Enum NOT_PUBLISHED for value: "NOT_PUBLISHED"
         */
        public static final PublishStatusEnum NOT_PUBLISHED = new PublishStatusEnum("NOT_PUBLISHED");

        private static final Map<String, PublishStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublishStatusEnum> createStaticFields() {
            Map<String, PublishStatusEnum> map = new HashMap<>();
            map.put("PUBLISHED", PUBLISHED);
            map.put("NOT_PUBLISHED", NOT_PUBLISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublishStatusEnum(String value) {
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
        public static PublishStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublishStatusEnum(value));
        }

        public static PublishStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublishStatusEnum) {
                return this.value.equals(((PublishStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_status")

    private PublishStatusEnum publishStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public ListApisRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListApisRequest withDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
        return this;
    }

    /**
     * 数据服务的版本类型，指定SHARED共享版或EXCLUSIVE专享版。
     * @return dlmType
     */
    public DlmTypeEnum getDlmType() {
        return dlmType;
    }

    public void setDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
    }

    public ListApisRequest withXReturnPublishMessages(String xReturnPublishMessages) {
        this.xReturnPublishMessages = xReturnPublishMessages;
        return this;
    }

    /**
     * 是否返回专享版API的发布信息。
     * @return xReturnPublishMessages
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-return-publish-messages")
    public String getXReturnPublishMessages() {
        return xReturnPublishMessages;
    }

    public void setXReturnPublishMessages(String xReturnPublishMessages) {
        this.xReturnPublishMessages = xReturnPublishMessages;
    }

    public ListApisRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标, 即跳过前X条数据。仅支持0或limit的整数倍，不满足则向下取整。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListApisRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数, 即查询Y条数据。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListApisRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 根据API名称模糊查询。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListApisRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 根据API描述信息模糊查询。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListApisRequest withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 根据API创建用户模糊查询。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ListApisRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 根据API创建时间过滤，开始时间，如2024-02-24T16:00:00.000Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListApisRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 根据API创建时间过滤，结束时间，如2024-04-05T15:59:59.998Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListApisRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ListApisRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListApisRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ListApisRequest withApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * API类型。
     * @return apiType
     */
    public ApiTypeEnum getApiType() {
        return apiType;
    }

    public void setApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
    }

    public ListApisRequest withPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * API发布状态。
     * @return publishStatus
     */
    public PublishStatusEnum getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
    }

    public ListApisRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 根据API用到的数据库表名模糊查询。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApisRequest that = (ListApisRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.dlmType, that.dlmType)
            && Objects.equals(this.xReturnPublishMessages, that.xReturnPublishMessages)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.apiType, that.apiType) && Objects.equals(this.publishStatus, that.publishStatus)
            && Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            dlmType,
            xReturnPublishMessages,
            offset,
            limit,
            name,
            description,
            createUser,
            startTime,
            endTime,
            tags,
            apiType,
            publishStatus,
            tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dlmType: ").append(toIndentedString(dlmType)).append("\n");
        sb.append("    xReturnPublishMessages: ").append(toIndentedString(xReturnPublishMessages)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
