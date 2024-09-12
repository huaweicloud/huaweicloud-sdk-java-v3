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
 * Request Object
 */
public class ListAssetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    /**
     * 标签查询组合方式 INTERSECTION：交集 UNION_SET：并集
     */
    public static final class TagCombinationTypeEnum {

        /**
         * Enum INTERSECTION for value: "INTERSECTION"
         */
        public static final TagCombinationTypeEnum INTERSECTION = new TagCombinationTypeEnum("INTERSECTION");

        /**
         * Enum UNION_SET for value: "UNION_SET"
         */
        public static final TagCombinationTypeEnum UNION_SET = new TagCombinationTypeEnum("UNION_SET");

        private static final Map<String, TagCombinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagCombinationTypeEnum> createStaticFields() {
            Map<String, TagCombinationTypeEnum> map = new HashMap<>();
            map.put("INTERSECTION", INTERSECTION);
            map.put("UNION_SET", UNION_SET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagCombinationTypeEnum(String value) {
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
        public static TagCombinationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagCombinationTypeEnum(value));
        }

        public static TagCombinationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagCombinationTypeEnum) {
                return this.value.equals(((TagCombinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_combination_type")

    private TagCombinationTypeEnum tagCombinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    /**
     * 资产来源。 * SYSTEM：系统资产 * CUSTOMIZATION：租户资产 * ALL：所有资产  默认查询租户资产。
     */
    public static final class AssetSourceEnum {

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final AssetSourceEnum SYSTEM = new AssetSourceEnum("SYSTEM");

        /**
         * Enum CUSTOMIZATION for value: "CUSTOMIZATION"
         */
        public static final AssetSourceEnum CUSTOMIZATION = new AssetSourceEnum("CUSTOMIZATION");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final AssetSourceEnum ALL = new AssetSourceEnum("ALL");

        private static final Map<String, AssetSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetSourceEnum> createStaticFields() {
            Map<String, AssetSourceEnum> map = new HashMap<>();
            map.put("SYSTEM", SYSTEM);
            map.put("CUSTOMIZATION", CUSTOMIZATION);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetSourceEnum(String value) {
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
        public static AssetSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetSourceEnum(value));
        }

        public static AssetSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetSourceEnum) {
                return this.value.equals(((AssetSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source")

    private AssetSourceEnum assetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_state")

    private String assetState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accurate_query_field")

    private List<String> accurateQueryField = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "render_engine")

    private String renderEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private List<String> assetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_property")

    private String systemProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_editable")

    private Boolean actionEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_with_action_library")

    private Boolean isWithActionLibrary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_movable")

    private Boolean isMovable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_provider")

    private String voiceProvider;

    /**
     * 角色。 SHARER：共享方，SHAREE：被共享方
     */
    public static final class RoleEnum {

        /**
         * Enum SHARER for value: "SHARER"
         */
        public static final RoleEnum SHARER = new RoleEnum("SHARER");

        /**
         * Enum SHAREE for value: "SHAREE"
         */
        public static final RoleEnum SHAREE = new RoleEnum("SHAREE");

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("SHARER", SHARER);
            map.put("SHAREE", SHAREE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleEnum(value));
        }

        public static RoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleEnum) {
                return this.value.equals(((RoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private RoleEnum role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_realtime_voice")

    private Boolean isRealtimeVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_model_2d_version")

    private String humanModel2dVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_device_name")

    private String includeDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_device_name")

    private String excludeDeviceName;

    /**
     * 资产支持的业务类型。默认查询所有资产。 * VIDEO_2D：分身数字人视频制作 * LIVE_2D：分身数字人直播 * CHAT_2D：分身数字人智能交互
     */
    public static final class SupportedServiceEnum {

        /**
         * Enum VIDEO_2D for value: "VIDEO_2D"
         */
        public static final SupportedServiceEnum VIDEO_2D = new SupportedServiceEnum("VIDEO_2D");

        /**
         * Enum LIVE_2D for value: "LIVE_2D"
         */
        public static final SupportedServiceEnum LIVE_2D = new SupportedServiceEnum("LIVE_2D");

        /**
         * Enum CHAT_2D for value: "CHAT_2D"
         */
        public static final SupportedServiceEnum CHAT_2D = new SupportedServiceEnum("CHAT_2D");

        private static final Map<String, SupportedServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedServiceEnum> createStaticFields() {
            Map<String, SupportedServiceEnum> map = new HashMap<>();
            map.put("VIDEO_2D", VIDEO_2D);
            map.put("LIVE_2D", LIVE_2D);
            map.put("CHAT_2D", CHAT_2D);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedServiceEnum(String value) {
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
        public static SupportedServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedServiceEnum(value));
        }

        public static SupportedServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedServiceEnum) {
                return this.value.equals(((SupportedServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_service")

    private SupportedServiceEnum supportedService;

    public ListAssetsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListAssetsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。  格式为(YYYYMMDD'T'HHMMSS'Z')。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListAssetsRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 第三方用户ID。不允许输入中文。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public ListAssetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
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

    public ListAssetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询。
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

    public ListAssetsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称模糊查询。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAssetsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 按标签模糊查询。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListAssetsRequest withTagCombinationType(TagCombinationTypeEnum tagCombinationType) {
        this.tagCombinationType = tagCombinationType;
        return this;
    }

    /**
     * 标签查询组合方式 INTERSECTION：交集 UNION_SET：并集
     * @return tagCombinationType
     */
    public TagCombinationTypeEnum getTagCombinationType() {
        return tagCombinationType;
    }

    public void setTagCombinationType(TagCombinationTypeEnum tagCombinationType) {
        this.tagCombinationType = tagCombinationType;
    }

    public ListAssetsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 最近直播任务起始时间。格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListAssetsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 最近直播任务结束时间。格式遵循：RFC 3339 如“2021-01-10T10:43:17Z”。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAssetsRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。多个类型使用英文逗号分割。 * HUMAN_MODEL：数字人模型 * VOICE_MODEL：音色模型（仅系统管理员可上传） * SCENE：场景模型 * ANIMATION：动作动画 * VIDEO：视频文件 * IMAGE：图片文件 * PPT：幻灯片文件 * MATERIAL：风格化素材 * HUMAN_MODEL_2D: 2D数字人网络模型 * BUSINESS_CARD_TEMPLET: 数字人名片模板 * MUSIC: 音乐 * AUDIO: 音频
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ListAssetsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段，支持的排序方式有： - 按创建时间排序：create_time - 按更新时间排序：update_time - 按资产排序：asset_order
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListAssetsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式。 * asc：升序 * desc：降序  默认asc升序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListAssetsRequest withAssetSource(AssetSourceEnum assetSource) {
        this.assetSource = assetSource;
        return this;
    }

    /**
     * 资产来源。 * SYSTEM：系统资产 * CUSTOMIZATION：租户资产 * ALL：所有资产  默认查询租户资产。
     * @return assetSource
     */
    public AssetSourceEnum getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(AssetSourceEnum assetSource) {
        this.assetSource = assetSource;
    }

    public ListAssetsRequest withAssetState(String assetState) {
        this.assetState = assetState;
        return this;
    }

    /**
     * 资产状态。多个资产状态使用英文逗号分割。 * CREATING：资产创建中，主文件尚未上传 * FAILED：主文件上传失败 * UNACTIVED：主文件上传成功，资产未激活，资产不可用于其他业务（用户可更新状态） * ACTIVED：主文件上传成功，资产激活，资产可用于其他业务（用户可更新状态） * DELETING：资产删除中，资产不可用，资产可恢复 * DELETED：资产文件已删除，资产不可用，资产不可恢复 * BLOCK：资产被冻结，资产不可用，不可查看文件。 默认查询所有状态的资产。
     * @return assetState
     */
    public String getAssetState() {
        return assetState;
    }

    public void setAssetState(String assetState) {
        this.assetState = assetState;
    }

    public ListAssetsRequest withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * 基于风格化ID查询关联资产。 * system_male_001：男性风格01 * system_female_001：女性风格01 * system_male_002：男性风格02  * system_female_002：女性风格02
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public ListAssetsRequest withAccurateQueryField(List<String> accurateQueryField) {
        this.accurateQueryField = accurateQueryField;
        return this;
    }

    public ListAssetsRequest addAccurateQueryFieldItem(String accurateQueryFieldItem) {
        if (this.accurateQueryField == null) {
            this.accurateQueryField = new ArrayList<>();
        }
        this.accurateQueryField.add(accurateQueryFieldItem);
        return this;
    }

    public ListAssetsRequest withAccurateQueryField(Consumer<List<String>> accurateQueryFieldSetter) {
        if (this.accurateQueryField == null) {
            this.accurateQueryField = new ArrayList<>();
        }
        accurateQueryFieldSetter.accept(this.accurateQueryField);
        return this;
    }

    /**
     * 使用精确查询的字段
     * @return accurateQueryField
     */
    public List<String> getAccurateQueryField() {
        return accurateQueryField;
    }

    public void setAccurateQueryField(List<String> accurateQueryField) {
        this.accurateQueryField = accurateQueryField;
    }

    public ListAssetsRequest withRenderEngine(String renderEngine) {
        this.renderEngine = renderEngine;
        return this;
    }

    /**
     * 可用引擎。 * UE：UE引擎 * MetaEngine：MetaEngine引擎 > 该字段当前只对MetaEngine白名单用户生效
     * @return renderEngine
     */
    public String getRenderEngine() {
        return renderEngine;
    }

    public void setRenderEngine(String renderEngine) {
        this.renderEngine = renderEngine;
    }

    public ListAssetsRequest withAssetId(List<String> assetId) {
        this.assetId = assetId;
        return this;
    }

    public ListAssetsRequest addAssetIdItem(String assetIdItem) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        this.assetId.add(assetIdItem);
        return this;
    }

    public ListAssetsRequest withAssetId(Consumer<List<String>> assetIdSetter) {
        if (this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        assetIdSetter.accept(this.assetId);
        return this;
    }

    /**
     * 资产id
     * @return assetId
     */
    public List<String> getAssetId() {
        return assetId;
    }

    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    public ListAssetsRequest withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。多选使用英文逗号分隔。
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ListAssetsRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言。多选使用英文逗号分隔。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ListAssetsRequest withSystemProperty(String systemProperty) {
        this.systemProperty = systemProperty;
        return this;
    }

    /**
     * 系统属性。  key和value间用\":\"分隔，多个key之间用\",\"分隔。  如system_property=BACKGROUND_IMG:Yes,RENDER_ENGINE:MetaEngine。  不同Key对应Value取值如下：  公共资产属性： * BACKGROUND_IMG：视频制作的2D背景图片，可取值Yes * CREATED_BY_PLATFORM：是否平台生成，可取值Yes  分身数字人资产属性： * MATERIAL_IMG：素材图片，用作前景。可取值Yes * MATERIAL_VIDEO：素材视频，用作前景。可取值Yes * TO_BE_TRANSLATED_VIDEO: 视频翻译的源视频。可取值Yes  3D数字人资产属性： * STYLE_ID：风格Id * RENDER_ENGINE：引擎类型，可取值UE或MetaEngine * BACKGROUND_SCENE：视频制作的2D背景场景，可取值Horizontal（横屏）或者Vertical（竖屏）
     * @return systemProperty
     */
    public String getSystemProperty() {
        return systemProperty;
    }

    public void setSystemProperty(String systemProperty) {
        this.systemProperty = systemProperty;
    }

    public ListAssetsRequest withActionEditable(Boolean actionEditable) {
        this.actionEditable = actionEditable;
        return this;
    }

    /**
     * 动作是否可编辑。仅在分身数字人模型查询时有效。
     * @return actionEditable
     */
    public Boolean getActionEditable() {
        return actionEditable;
    }

    public void setActionEditable(Boolean actionEditable) {
        this.actionEditable = actionEditable;
    }

    public ListAssetsRequest withIsWithActionLibrary(Boolean isWithActionLibrary) {
        this.isWithActionLibrary = isWithActionLibrary;
        return this;
    }

    /**
     * 分身数字人是否带原子动作库。 > * 带原子动作库的分身数字人可做动作编排。
     * @return isWithActionLibrary
     */
    public Boolean getIsWithActionLibrary() {
        return isWithActionLibrary;
    }

    public void setIsWithActionLibrary(Boolean isWithActionLibrary) {
        this.isWithActionLibrary = isWithActionLibrary;
    }

    public ListAssetsRequest withIsMovable(Boolean isMovable) {
        this.isMovable = isMovable;
        return this;
    }

    /**
     * 分身数字人是否支持走动。仅在分身数字人模型查询时有效。
     * @return isMovable
     */
    public Boolean getIsMovable() {
        return isMovable;
    }

    public void setIsMovable(Boolean isMovable) {
        this.isMovable = isMovable;
    }

    public ListAssetsRequest withVoiceProvider(String voiceProvider) {
        this.voiceProvider = voiceProvider;
        return this;
    }

    /**
     * 取值：HUAWEI_METASTUDIO、MOBVOI。 HUAWEI_METASTUDIO：MetaStudio自研音色 MOBVOI：出门问问音色
     * @return voiceProvider
     */
    public String getVoiceProvider() {
        return voiceProvider;
    }

    public void setVoiceProvider(String voiceProvider) {
        this.voiceProvider = voiceProvider;
    }

    public ListAssetsRequest withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * 角色。 SHARER：共享方，SHAREE：被共享方
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public ListAssetsRequest withIsRealtimeVoice(Boolean isRealtimeVoice) {
        this.isRealtimeVoice = isRealtimeVoice;
        return this;
    }

    /**
     * 音色是否支持实时合成。仅在音色查询时有效。 > * 支持实时合成的音色，可以用于直播和智能交互场景。否则只能用于视频制作。
     * @return isRealtimeVoice
     */
    public Boolean getIsRealtimeVoice() {
        return isRealtimeVoice;
    }

    public void setIsRealtimeVoice(Boolean isRealtimeVoice) {
        this.isRealtimeVoice = isRealtimeVoice;
    }

    public ListAssetsRequest withHumanModel2dVersion(String humanModel2dVersion) {
        this.humanModel2dVersion = humanModel2dVersion;
        return this;
    }

    /**
     * 模型版本
     * @return humanModel2dVersion
     */
    public String getHumanModel2dVersion() {
        return humanModel2dVersion;
    }

    public void setHumanModel2dVersion(String humanModel2dVersion) {
        this.humanModel2dVersion = humanModel2dVersion;
    }

    public ListAssetsRequest withIncludeDeviceName(String includeDeviceName) {
        this.includeDeviceName = includeDeviceName;
        return this;
    }

    /**
     * 资产已执行的任务名称
     * @return includeDeviceName
     */
    public String getIncludeDeviceName() {
        return includeDeviceName;
    }

    public void setIncludeDeviceName(String includeDeviceName) {
        this.includeDeviceName = includeDeviceName;
    }

    public ListAssetsRequest withExcludeDeviceName(String excludeDeviceName) {
        this.excludeDeviceName = excludeDeviceName;
        return this;
    }

    /**
     * 资产已执行的任务名称
     * @return excludeDeviceName
     */
    public String getExcludeDeviceName() {
        return excludeDeviceName;
    }

    public void setExcludeDeviceName(String excludeDeviceName) {
        this.excludeDeviceName = excludeDeviceName;
    }

    public ListAssetsRequest withSupportedService(SupportedServiceEnum supportedService) {
        this.supportedService = supportedService;
        return this;
    }

    /**
     * 资产支持的业务类型。默认查询所有资产。 * VIDEO_2D：分身数字人视频制作 * LIVE_2D：分身数字人直播 * CHAT_2D：分身数字人智能交互
     * @return supportedService
     */
    public SupportedServiceEnum getSupportedService() {
        return supportedService;
    }

    public void setSupportedService(SupportedServiceEnum supportedService) {
        this.supportedService = supportedService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetsRequest that = (ListAssetsRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xAppUserId, that.xAppUserId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.name, that.name)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.tagCombinationType, that.tagCombinationType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.assetSource, that.assetSource)
            && Objects.equals(this.assetState, that.assetState) && Objects.equals(this.styleId, that.styleId)
            && Objects.equals(this.accurateQueryField, that.accurateQueryField)
            && Objects.equals(this.renderEngine, that.renderEngine) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.language, that.language)
            && Objects.equals(this.systemProperty, that.systemProperty)
            && Objects.equals(this.actionEditable, that.actionEditable)
            && Objects.equals(this.isWithActionLibrary, that.isWithActionLibrary)
            && Objects.equals(this.isMovable, that.isMovable) && Objects.equals(this.voiceProvider, that.voiceProvider)
            && Objects.equals(this.role, that.role) && Objects.equals(this.isRealtimeVoice, that.isRealtimeVoice)
            && Objects.equals(this.humanModel2dVersion, that.humanModel2dVersion)
            && Objects.equals(this.includeDeviceName, that.includeDeviceName)
            && Objects.equals(this.excludeDeviceName, that.excludeDeviceName)
            && Objects.equals(this.supportedService, that.supportedService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            xAppUserId,
            limit,
            offset,
            name,
            tag,
            tagCombinationType,
            startTime,
            endTime,
            assetType,
            sortKey,
            sortDir,
            assetSource,
            assetState,
            styleId,
            accurateQueryField,
            renderEngine,
            assetId,
            sex,
            language,
            systemProperty,
            actionEditable,
            isWithActionLibrary,
            isMovable,
            voiceProvider,
            role,
            isRealtimeVoice,
            humanModel2dVersion,
            includeDeviceName,
            excludeDeviceName,
            supportedService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    tagCombinationType: ").append(toIndentedString(tagCombinationType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    assetSource: ").append(toIndentedString(assetSource)).append("\n");
        sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    accurateQueryField: ").append(toIndentedString(accurateQueryField)).append("\n");
        sb.append("    renderEngine: ").append(toIndentedString(renderEngine)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    systemProperty: ").append(toIndentedString(systemProperty)).append("\n");
        sb.append("    actionEditable: ").append(toIndentedString(actionEditable)).append("\n");
        sb.append("    isWithActionLibrary: ").append(toIndentedString(isWithActionLibrary)).append("\n");
        sb.append("    isMovable: ").append(toIndentedString(isMovable)).append("\n");
        sb.append("    voiceProvider: ").append(toIndentedString(voiceProvider)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    isRealtimeVoice: ").append(toIndentedString(isRealtimeVoice)).append("\n");
        sb.append("    humanModel2dVersion: ").append(toIndentedString(humanModel2dVersion)).append("\n");
        sb.append("    includeDeviceName: ").append(toIndentedString(includeDeviceName)).append("\n");
        sb.append("    excludeDeviceName: ").append(toIndentedString(excludeDeviceName)).append("\n");
        sb.append("    supportedService: ").append(toIndentedString(supportedService)).append("\n");
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
