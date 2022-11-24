package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImportApiDefinitionsV2RequestBody
 */
public class ImportApiDefinitionsV2RequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_create_group")

    private Boolean isCreateGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    /**
     * 扩展信息导入模式 - merge：当扩展信息定义冲突时，merge保留原有扩展信息 - override：当扩展信息定义冲突时，override会覆盖原有扩展信息
     */
    public static final class ExtendModeEnum {

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ExtendModeEnum MERGE = new ExtendModeEnum("merge");

        /**
         * Enum OVERRIDE for value: "override"
         */
        public static final ExtendModeEnum OVERRIDE = new ExtendModeEnum("override");

        private static final Map<String, ExtendModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExtendModeEnum> createStaticFields() {
            Map<String, ExtendModeEnum> map = new HashMap<>();
            map.put("merge", MERGE);
            map.put("override", OVERRIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExtendModeEnum(String value) {
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
        public static ExtendModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExtendModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExtendModeEnum(value);
            }
            return result;
        }

        public static ExtendModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExtendModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExtendModeEnum) {
                return this.value.equals(((ExtendModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_mode")

    private ExtendModeEnum extendMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_mode")

    private Boolean simpleMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_mode")

    private Boolean mockMode;

    /**
     * 导入模式 - merge：当API信息定义冲突时，merge保留原有API信息 - override：当API信息定义冲突时，override会覆盖原有API信息
     */
    public static final class ApiModeEnum {

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ApiModeEnum MERGE = new ApiModeEnum("merge");

        /**
         * Enum OVERRIDE for value: "override"
         */
        public static final ApiModeEnum OVERRIDE = new ApiModeEnum("override");

        private static final Map<String, ApiModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiModeEnum> createStaticFields() {
            Map<String, ApiModeEnum> map = new HashMap<>();
            map.put("merge", MERGE);
            map.put("override", OVERRIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiModeEnum(String value) {
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
        public static ApiModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiModeEnum(value);
            }
            return result;
        }

        public static ApiModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiModeEnum) {
                return this.value.equals(((ApiModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_mode")

    private ApiModeEnum apiMode;

    @JsonProperty(value = "file_name", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart fileName;

    public ImportApiDefinitionsV2RequestBody withIsCreateGroup(Boolean isCreateGroup) {
        this.isCreateGroup = isCreateGroup;
        return this;
    }

    /**
     * 是否创建新分组
     * @return isCreateGroup
     */
    public Boolean getIsCreateGroup() {
        return isCreateGroup;
    }

    public void setIsCreateGroup(Boolean isCreateGroup) {
        this.isCreateGroup = isCreateGroup;
    }

    public ImportApiDefinitionsV2RequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组编号。  当is_create_group=false时为必填
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ImportApiDefinitionsV2RequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号。  当is_create_group=false且使用集成应用分组时必填
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ImportApiDefinitionsV2RequestBody withExtendMode(ExtendModeEnum extendMode) {
        this.extendMode = extendMode;
        return this;
    }

    /**
     * 扩展信息导入模式 - merge：当扩展信息定义冲突时，merge保留原有扩展信息 - override：当扩展信息定义冲突时，override会覆盖原有扩展信息
     * @return extendMode
     */
    public ExtendModeEnum getExtendMode() {
        return extendMode;
    }

    public void setExtendMode(ExtendModeEnum extendMode) {
        this.extendMode = extendMode;
    }

    public ImportApiDefinitionsV2RequestBody withSimpleMode(Boolean simpleMode) {
        this.simpleMode = simpleMode;
        return this;
    }

    /**
     * 是否开启简易导入模式
     * @return simpleMode
     */
    public Boolean getSimpleMode() {
        return simpleMode;
    }

    public void setSimpleMode(Boolean simpleMode) {
        this.simpleMode = simpleMode;
    }

    public ImportApiDefinitionsV2RequestBody withMockMode(Boolean mockMode) {
        this.mockMode = mockMode;
        return this;
    }

    /**
     * 是否开启Mock后端
     * @return mockMode
     */
    public Boolean getMockMode() {
        return mockMode;
    }

    public void setMockMode(Boolean mockMode) {
        this.mockMode = mockMode;
    }

    public ImportApiDefinitionsV2RequestBody withApiMode(ApiModeEnum apiMode) {
        this.apiMode = apiMode;
        return this;
    }

    /**
     * 导入模式 - merge：当API信息定义冲突时，merge保留原有API信息 - override：当API信息定义冲突时，override会覆盖原有API信息
     * @return apiMode
     */
    public ApiModeEnum getApiMode() {
        return apiMode;
    }

    public void setApiMode(ApiModeEnum apiMode) {
        this.apiMode = apiMode;
    }

    public ImportApiDefinitionsV2RequestBody withFileName(FormDataFilePart fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 导入Api的请求体，json或yaml格式的文件
     * @return fileName
     */
    public FormDataFilePart getFileName() {
        return fileName;
    }

    public void setFileName(FormDataFilePart fileName) {
        this.fileName = fileName;
    }

    public ImportApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName,
        String contentType) {
        this.fileName = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName) {
        this.fileName = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.fileName = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (isCreateGroup != null) {
                    put("is_create_group", new FormDataPart<>(isCreateGroup));
                }
                if (groupId != null) {
                    put("group_id", new FormDataPart<>(groupId));
                }
                if (appId != null) {
                    put("app_id", new FormDataPart<>(appId));
                }
                if (extendMode != null) {
                    put("extend_mode", new FormDataPart<>(extendMode));
                }
                if (simpleMode != null) {
                    put("simple_mode", new FormDataPart<>(simpleMode));
                }
                if (mockMode != null) {
                    put("mock_mode", new FormDataPart<>(mockMode));
                }
                if (apiMode != null) {
                    put("api_mode", new FormDataPart<>(apiMode));
                }
                put("file_name", fileName);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportApiDefinitionsV2RequestBody importApiDefinitionsV2RequestBody = (ImportApiDefinitionsV2RequestBody) o;
        return Objects.equals(this.isCreateGroup, importApiDefinitionsV2RequestBody.isCreateGroup)
            && Objects.equals(this.groupId, importApiDefinitionsV2RequestBody.groupId)
            && Objects.equals(this.appId, importApiDefinitionsV2RequestBody.appId)
            && Objects.equals(this.extendMode, importApiDefinitionsV2RequestBody.extendMode)
            && Objects.equals(this.simpleMode, importApiDefinitionsV2RequestBody.simpleMode)
            && Objects.equals(this.mockMode, importApiDefinitionsV2RequestBody.mockMode)
            && Objects.equals(this.apiMode, importApiDefinitionsV2RequestBody.apiMode)
            && Objects.equals(this.fileName, importApiDefinitionsV2RequestBody.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCreateGroup, groupId, appId, extendMode, simpleMode, mockMode, apiMode, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportApiDefinitionsV2RequestBody {\n");
        sb.append("    isCreateGroup: ").append(toIndentedString(isCreateGroup)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    extendMode: ").append(toIndentedString(extendMode)).append("\n");
        sb.append("    simpleMode: ").append(toIndentedString(simpleMode)).append("\n");
        sb.append("    mockMode: ").append(toIndentedString(mockMode)).append("\n");
        sb.append("    apiMode: ").append(toIndentedString(apiMode)).append("\n");
        sb.append("    fileName: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
