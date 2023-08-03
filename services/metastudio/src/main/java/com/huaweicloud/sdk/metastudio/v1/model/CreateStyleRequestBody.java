package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 创建风格请求
 */
public class CreateStyleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    /**
     * 性别
     */
    public static final class SexEnum {

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final SexEnum UNKNOW = new SexEnum("UNKNOW");

        /**
         * Enum MALE for value: "MALE"
         */
        public static final SexEnum MALE = new SexEnum("MALE");

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final SexEnum FEMALE = new SexEnum("FEMALE");

        private static final Map<String, SexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SexEnum> createStaticFields() {
            Map<String, SexEnum> map = new HashMap<>();
            map.put("UNKNOW", UNKNOW);
            map.put("MALE", MALE);
            map.put("FEMALE", FEMALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SexEnum(String value) {
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
        public static SexEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SexEnum(value));
        }

        public static SexEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SexEnum) {
                return this.value.equals(((SexEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private SexEnum sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_assets")

    private List<StyleAssetItem> styleAssets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_meta")

    private StyleExtraMeta extraMeta;

    public CreateStyleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数字人风格化名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateStyleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数字人风格化描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStyleRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateStyleRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateStyleRequestBody withSex(SexEnum sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别
     * @return sex
     */
    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public CreateStyleRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateStyleRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateStyleRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。单个标签16字节，多个用逗号分隔，最多50个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateStyleRequestBody withStyleAssets(List<StyleAssetItem> styleAssets) {
        this.styleAssets = styleAssets;
        return this;
    }

    public CreateStyleRequestBody addStyleAssetsItem(StyleAssetItem styleAssetsItem) {
        if (this.styleAssets == null) {
            this.styleAssets = new ArrayList<>();
        }
        this.styleAssets.add(styleAssetsItem);
        return this;
    }

    public CreateStyleRequestBody withStyleAssets(Consumer<List<StyleAssetItem>> styleAssetsSetter) {
        if (this.styleAssets == null) {
            this.styleAssets = new ArrayList<>();
        }
        styleAssetsSetter.accept(this.styleAssets);
        return this;
    }

    /**
     * 风格化素材资产组合。
     * @return styleAssets
     */
    public List<StyleAssetItem> getStyleAssets() {
        return styleAssets;
    }

    public void setStyleAssets(List<StyleAssetItem> styleAssets) {
        this.styleAssets = styleAssets;
    }

    public CreateStyleRequestBody withExtraMeta(StyleExtraMeta extraMeta) {
        this.extraMeta = extraMeta;
        return this;
    }

    public CreateStyleRequestBody withExtraMeta(Consumer<StyleExtraMeta> extraMetaSetter) {
        if (this.extraMeta == null) {
            this.extraMeta = new StyleExtraMeta();
            extraMetaSetter.accept(this.extraMeta);
        }

        return this;
    }

    /**
     * Get extraMeta
     * @return extraMeta
     */
    public StyleExtraMeta getExtraMeta() {
        return extraMeta;
    }

    public void setExtraMeta(StyleExtraMeta extraMeta) {
        this.extraMeta = extraMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStyleRequestBody that = (CreateStyleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.styleAssets, that.styleAssets) && Objects.equals(this.extraMeta, that.extraMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, projectId, status, sex, tags, styleAssets, extraMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStyleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    styleAssets: ").append(toIndentedString(styleAssets)).append("\n");
        sb.append("    extraMeta: ").append(toIndentedString(extraMeta)).append("\n");
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
