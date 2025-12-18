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
public class ListRepositoryTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    /**
     * **参数解释：** 是否支持自动创建流水线。 **约束限制：** 不涉及 **取值范围：** - SupportPipeline，支持自动创建流水线。 - UnsupportedPipeline 不支持自动创建流水线。 **默认取值：** 不涉及
     */
    public static final class PipelineEnum {

        /**
         * Enum SUPPORTPIPELINE for value: "SupportPipeline"
         */
        public static final PipelineEnum SUPPORTPIPELINE = new PipelineEnum("SupportPipeline");

        /**
         * Enum UNSUPPORTEDPIPELINE for value: "UnsupportedPipeline"
         */
        public static final PipelineEnum UNSUPPORTEDPIPELINE = new PipelineEnum("UnsupportedPipeline");

        private static final Map<String, PipelineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PipelineEnum> createStaticFields() {
            Map<String, PipelineEnum> map = new HashMap<>();
            map.put("SupportPipeline", SUPPORTPIPELINE);
            map.put("UnsupportedPipeline", UNSUPPORTEDPIPELINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PipelineEnum(String value) {
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
        public static PipelineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PipelineEnum(value));
        }

        public static PipelineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PipelineEnum) {
                return this.value.equals(((PipelineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private PipelineEnum pipeline;

    /**
     * **参数解释：** 自动创建流水线。 **约束限制：** 不涉及 **取值范围：** - SYSTEM,USER，个人和官方模板。 - SYSTEM，官方模板。 - USER，个人模板。 **默认取值：** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum SYSTEM_USER for value: "SYSTEM,USER"
         */
        public static final TypeEnum SYSTEM_USER = new TypeEnum("SYSTEM,USER");

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final TypeEnum SYSTEM = new TypeEnum("SYSTEM");

        /**
         * Enum USER for value: "USER"
         */
        public static final TypeEnum USER = new TypeEnum("USER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SYSTEM,USER", SYSTEM_USER);
            map.put("SYSTEM", SYSTEM);
            map.put("USER", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enter_type")

    private String enterType;

    /**
     * **参数解释：** 按照模板仓的创建时间进行排序。 **约束限制：** 不涉及 **取值范围：** - up，升序。 - down，降序。 **默认取值：** 不涉及
     */
    public static final class DateOrderEnum {

        /**
         * Enum UP for value: "up"
         */
        public static final DateOrderEnum UP = new DateOrderEnum("up");

        /**
         * Enum DOWN for value: "down"
         */
        public static final DateOrderEnum DOWN = new DateOrderEnum("down");

        private static final Map<String, DateOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DateOrderEnum> createStaticFields() {
            Map<String, DateOrderEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DateOrderEnum(String value) {
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
        public static DateOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DateOrderEnum(value));
        }

        public static DateOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DateOrderEnum) {
                return this.value.equals(((DateOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_order")

    private DateOrderEnum dateOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ListRepositoryTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRepositoryTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRepositoryTemplatesRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * **参数解释：** 应用类型。 **约束限制：** 不涉及 **取值范围：** - Android。 - Console。 - HarmonyOS。 - OTHERS。 - REST API。 - ServiceStage。 - Web网站。 - 图形用户界面。 **默认取值：** 不涉及
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ListRepositoryTemplatesRequest withPipeline(PipelineEnum pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * **参数解释：** 是否支持自动创建流水线。 **约束限制：** 不涉及 **取值范围：** - SupportPipeline，支持自动创建流水线。 - UnsupportedPipeline 不支持自动创建流水线。 **默认取值：** 不涉及
     * @return pipeline
     */
    public PipelineEnum getPipeline() {
        return pipeline;
    }

    public void setPipeline(PipelineEnum pipeline) {
        this.pipeline = pipeline;
    }

    public ListRepositoryTemplatesRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 自动创建流水线。 **约束限制：** 不涉及 **取值范围：** - SYSTEM,USER，个人和官方模板。 - SYSTEM，官方模板。 - USER，个人模板。 **默认取值：** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListRepositoryTemplatesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 查询关键字，按模板仓标题搜索。 **约束限制：** 不涉及 **取值范围：** 字符串长度0至50。 **默认取值：** 不涉及
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListRepositoryTemplatesRequest withEnterType(String enterType) {
        this.enterType = enterType;
        return this;
    }

    /**
     * **参数解释：** 参赛类型。 **约束限制：** 不涉及 **取值范围：** - AI。 - 大数据。 - 小程序。 - 微服务。 **默认取值：** 不涉及
     * @return enterType
     */
    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public ListRepositoryTemplatesRequest withDateOrder(DateOrderEnum dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    /**
     * **参数解释：** 按照模板仓的创建时间进行排序。 **约束限制：** 不涉及 **取值范围：** - up，升序。 - down，降序。 **默认取值：** 不涉及
     * @return dateOrder
     */
    public DateOrderEnum getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(DateOrderEnum dateOrder) {
        this.dateOrder = dateOrder;
    }

    public ListRepositoryTemplatesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释：** 编程语言。 **约束限制：** 不涉及 **取值范围：** - ArkTS。 - ASP.NET。 - C。 - C#。 - C++。 - Go。 - Groovy。 - HTML。 - Java。 - NodeJS。 - OTHERS。 - PHP。 - Python。 **默认取值：** 不涉及
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ListRepositoryTemplatesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[[查询项目列表](https://support.huaweicloud.com/eu/api-projectman/ListProjectsV4.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 当该参数不为空时，仅返回当前项目下符合搜索条件的模板仓 **取值范围：** 字符串长度32。 **取值范围：** 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryTemplatesRequest that = (ListRepositoryTemplatesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.pipeline, that.pipeline)
            && Objects.equals(this.type, that.type) && Objects.equals(this.search, that.search)
            && Objects.equals(this.enterType, that.enterType) && Objects.equals(this.dateOrder, that.dateOrder)
            && Objects.equals(this.language, that.language) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, platform, pipeline, type, search, enterType, dateOrder, language, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryTemplatesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    enterType: ").append(toIndentedString(enterType)).append("\n");
        sb.append("    dateOrder: ").append(toIndentedString(dateOrder)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
