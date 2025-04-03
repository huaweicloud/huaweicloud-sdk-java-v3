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
 * ApiParam
 */
public class ApiParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    /**
     * API发布状态。
     */
    public static final class PublishStatusTypeEnum {

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final PublishStatusTypeEnum PUBLISHED = new PublishStatusTypeEnum("PUBLISHED");

        /**
         * Enum NOT_PUBLISHED for value: "NOT_PUBLISHED"
         */
        public static final PublishStatusTypeEnum NOT_PUBLISHED = new PublishStatusTypeEnum("NOT_PUBLISHED");

        private static final Map<String, PublishStatusTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublishStatusTypeEnum> createStaticFields() {
            Map<String, PublishStatusTypeEnum> map = new HashMap<>();
            map.put("PUBLISHED", PUBLISHED);
            map.put("NOT_PUBLISHED", NOT_PUBLISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublishStatusTypeEnum(String value) {
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
        public static PublishStatusTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublishStatusTypeEnum(value));
        }

        public static PublishStatusTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublishStatusTypeEnum) {
                return this.value.equals(((PublishStatusTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_status_type")

    private PublishStatusTypeEnum publishStatusType;

    /**
     * API取数方式。
     */
    public static final class ApiSpecificTypeStrEnum {

        /**
         * Enum API_SPECIFIC_TYPE_CONFIGURATION for value: "API_SPECIFIC_TYPE_CONFIGURATION"
         */
        public static final ApiSpecificTypeStrEnum API_SPECIFIC_TYPE_CONFIGURATION =
            new ApiSpecificTypeStrEnum("API_SPECIFIC_TYPE_CONFIGURATION");

        /**
         * Enum API_SPECIFIC_TYPE_SCRIPT for value: "API_SPECIFIC_TYPE_SCRIPT"
         */
        public static final ApiSpecificTypeStrEnum API_SPECIFIC_TYPE_SCRIPT =
            new ApiSpecificTypeStrEnum("API_SPECIFIC_TYPE_SCRIPT");

        /**
         * Enum API_SPECIFIC_TYPE_MYBATIS for value: "API_SPECIFIC_TYPE_MYBATIS"
         */
        public static final ApiSpecificTypeStrEnum API_SPECIFIC_TYPE_MYBATIS =
            new ApiSpecificTypeStrEnum("API_SPECIFIC_TYPE_MYBATIS");

        /**
         * Enum API_SPECIFIC_TYPE_GROOVY for value: "API_SPECIFIC_TYPE_GROOVY"
         */
        public static final ApiSpecificTypeStrEnum API_SPECIFIC_TYPE_GROOVY =
            new ApiSpecificTypeStrEnum("API_SPECIFIC_TYPE_GROOVY");

        private static final Map<String, ApiSpecificTypeStrEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiSpecificTypeStrEnum> createStaticFields() {
            Map<String, ApiSpecificTypeStrEnum> map = new HashMap<>();
            map.put("API_SPECIFIC_TYPE_CONFIGURATION", API_SPECIFIC_TYPE_CONFIGURATION);
            map.put("API_SPECIFIC_TYPE_SCRIPT", API_SPECIFIC_TYPE_SCRIPT);
            map.put("API_SPECIFIC_TYPE_MYBATIS", API_SPECIFIC_TYPE_MYBATIS);
            map.put("API_SPECIFIC_TYPE_GROOVY", API_SPECIFIC_TYPE_GROOVY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiSpecificTypeStrEnum(String value) {
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
        public static ApiSpecificTypeStrEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiSpecificTypeStrEnum(value));
        }

        public static ApiSpecificTypeStrEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiSpecificTypeStrEnum) {
                return this.value.equals(((ApiSpecificTypeStrEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_specific_type_str")

    private ApiSpecificTypeStrEnum apiSpecificTypeStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * Gets or Sets authorizationStatusType
     */
    public static final class AuthorizationStatusTypeEnum {

        /**
         * Enum NO_AUTHORIZATION_REQUIRED for value: "NO_AUTHORIZATION_REQUIRED"
         */
        public static final AuthorizationStatusTypeEnum NO_AUTHORIZATION_REQUIRED =
            new AuthorizationStatusTypeEnum("NO_AUTHORIZATION_REQUIRED");

        /**
         * Enum UNAUTHORIZED for value: "UNAUTHORIZED"
         */
        public static final AuthorizationStatusTypeEnum UNAUTHORIZED = new AuthorizationStatusTypeEnum("UNAUTHORIZED");

        /**
         * Enum AUTHORIZED for value: "AUTHORIZED"
         */
        public static final AuthorizationStatusTypeEnum AUTHORIZED = new AuthorizationStatusTypeEnum("AUTHORIZED");

        private static final Map<String, AuthorizationStatusTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthorizationStatusTypeEnum> createStaticFields() {
            Map<String, AuthorizationStatusTypeEnum> map = new HashMap<>();
            map.put("NO_AUTHORIZATION_REQUIRED", NO_AUTHORIZATION_REQUIRED);
            map.put("UNAUTHORIZED", UNAUTHORIZED);
            map.put("AUTHORIZED", AUTHORIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthorizationStatusTypeEnum(String value) {
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
        public static AuthorizationStatusTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AuthorizationStatusTypeEnum(value));
        }

        public static AuthorizationStatusTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthorizationStatusTypeEnum) {
                return this.value.equals(((AuthorizationStatusTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_status_type")

    private AuthorizationStatusTypeEnum authorizationStatusType;

    public ApiParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiParam withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * API创建人名称。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ApiParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * API描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiParam withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ApiParam addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ApiParam withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * API标签列表。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ApiParam withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * API所使用到的数据库表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ApiParam withPublishStatusType(PublishStatusTypeEnum publishStatusType) {
        this.publishStatusType = publishStatusType;
        return this;
    }

    /**
     * API发布状态。
     * @return publishStatusType
     */
    public PublishStatusTypeEnum getPublishStatusType() {
        return publishStatusType;
    }

    public void setPublishStatusType(PublishStatusTypeEnum publishStatusType) {
        this.publishStatusType = publishStatusType;
    }

    public ApiParam withApiSpecificTypeStr(ApiSpecificTypeStrEnum apiSpecificTypeStr) {
        this.apiSpecificTypeStr = apiSpecificTypeStr;
        return this;
    }

    /**
     * API取数方式。
     * @return apiSpecificTypeStr
     */
    public ApiSpecificTypeStrEnum getApiSpecificTypeStr() {
        return apiSpecificTypeStr;
    }

    public void setApiSpecificTypeStr(ApiSpecificTypeStrEnum apiSpecificTypeStr) {
        this.apiSpecificTypeStr = apiSpecificTypeStr;
    }

    public ApiParam withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * API创建开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ApiParam withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * API创建结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ApiParam withAuthorizationStatusType(AuthorizationStatusTypeEnum authorizationStatusType) {
        this.authorizationStatusType = authorizationStatusType;
        return this;
    }

    /**
     * Get authorizationStatusType
     * @return authorizationStatusType
     */
    public AuthorizationStatusTypeEnum getAuthorizationStatusType() {
        return authorizationStatusType;
    }

    public void setAuthorizationStatusType(AuthorizationStatusTypeEnum authorizationStatusType) {
        this.authorizationStatusType = authorizationStatusType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiParam that = (ApiParam) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.publishStatusType, that.publishStatusType)
            && Objects.equals(this.apiSpecificTypeStr, that.apiSpecificTypeStr)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.authorizationStatusType, that.authorizationStatusType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            createUser,
            description,
            tags,
            tableName,
            publishStatusType,
            apiSpecificTypeStr,
            startTime,
            endTime,
            authorizationStatusType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    publishStatusType: ").append(toIndentedString(publishStatusType)).append("\n");
        sb.append("    apiSpecificTypeStr: ").append(toIndentedString(apiSpecificTypeStr)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    authorizationStatusType: ").append(toIndentedString(authorizationStatusType)).append("\n");
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
