package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class ListApplicationsV6Request {

    /**
     * 语言类型 中文:zh-cn 英文:en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attention")

    @JacksonXmlProperty(localName = "attention")

    private Boolean attention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    @JacksonXmlProperty(localName = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    @JacksonXmlProperty(localName = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    @JacksonXmlProperty(localName = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_created_by_self")

    @JacksonXmlProperty(localName = "is_created_by_self")

    private Boolean isCreatedBySelf;

    /**
     * Gets or Sets sortKey
     */
    public static final class SortKeyEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final SortKeyEnum NAME = new SortKeyEnum("name");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private List<SortKeyEnum> sortKey = null;

    /**
    * Gets or Sets sortDir
    */
    public static final class SortDirEnum {

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListApplicationsV6Request withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言类型 中文:zh-cn 英文:en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListApplicationsV6Request withAttention(Boolean attention) {
        this.attention = attention;
        return this;
    }

    /**
     * 是否查询我关注的应用
     * @return attention
     */
    public Boolean getAttention() {
        return attention;
    }

    public void setAttention(Boolean attention) {
        this.attention = attention;
    }

    public ListApplicationsV6Request withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id，从控制台获取方法请参见: [获取区域ID](https://console.huaweicloud.com/iam/?region=cn-north-1&locale=zh-cn#/iam/projects)
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListApplicationsV6Request withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 搜索关键字,支持按名称和描述搜索，默认null
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListApplicationsV6Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属DevCloud项目id，从 [项目列表接口](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=DevStar&api=ListProjectsV4) 查询。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListApplicationsV6Request withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 主题id,场景或者部署方式分类id
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public ListApplicationsV6Request withIsCreatedBySelf(Boolean isCreatedBySelf) {
        this.isCreatedBySelf = isCreatedBySelf;
        return this;
    }

    /**
     * 是否查询由我创建
     * @return isCreatedBySelf
     */
    public Boolean getIsCreatedBySelf() {
        return isCreatedBySelf;
    }

    public void setIsCreatedBySelf(Boolean isCreatedBySelf) {
        this.isCreatedBySelf = isCreatedBySelf;
    }

    public ListApplicationsV6Request withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListApplicationsV6Request addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListApplicationsV6Request withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 排序字段, name：应用名称,created_at:创建时间,updated_at:更新时间
     * @return sortKey
     */
    public List<SortKeyEnum> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
    }

    public ListApplicationsV6Request withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListApplicationsV6Request addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListApplicationsV6Request withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序方式, desc:降序, asc:升序
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ListApplicationsV6Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量,默认10
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

    public ListApplicationsV6Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询,默认0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationsV6Request listApplicationsV6Request = (ListApplicationsV6Request) o;
        return Objects.equals(this.xLanguage, listApplicationsV6Request.xLanguage)
            && Objects.equals(this.attention, listApplicationsV6Request.attention)
            && Objects.equals(this.regionId, listApplicationsV6Request.regionId)
            && Objects.equals(this.keyword, listApplicationsV6Request.keyword)
            && Objects.equals(this.projectId, listApplicationsV6Request.projectId)
            && Objects.equals(this.topicId, listApplicationsV6Request.topicId)
            && Objects.equals(this.isCreatedBySelf, listApplicationsV6Request.isCreatedBySelf)
            && Objects.equals(this.sortKey, listApplicationsV6Request.sortKey)
            && Objects.equals(this.sortDir, listApplicationsV6Request.sortDir)
            && Objects.equals(this.limit, listApplicationsV6Request.limit)
            && Objects.equals(this.offset, listApplicationsV6Request.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            attention,
            regionId,
            keyword,
            projectId,
            topicId,
            isCreatedBySelf,
            sortKey,
            sortDir,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsV6Request {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    isCreatedBySelf: ").append(toIndentedString(isCreatedBySelf)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
