package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 查询服务目录API列表请求参数
 */
public class MallParaDTO {

    /**
     * 认证类型。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum APP for value: "APP"
         */
        public static final AuthTypeEnum APP = new AuthTypeEnum("APP");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("IAM", IAM);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    /**
     * API可见性，WORKSPACE：工作空间可见，PROJECT： 项目可见，DOMAIN：租户可见，SPECIFIC_PROJECT：指定项目可见。
     */
    public static final class VisibilityEnum {

        /**
         * Enum WORKSPACE for value: "WORKSPACE"
         */
        public static final VisibilityEnum WORKSPACE = new VisibilityEnum("WORKSPACE");

        /**
         * Enum PROJECT for value: "PROJECT"
         */
        public static final VisibilityEnum PROJECT = new VisibilityEnum("PROJECT");

        /**
         * Enum DOMAIN for value: "DOMAIN"
         */
        public static final VisibilityEnum DOMAIN = new VisibilityEnum("DOMAIN");

        /**
         * Enum SPECIFIC_PROJECT for value: "SPECIFIC_PROJECT"
         */
        public static final VisibilityEnum SPECIFIC_PROJECT = new VisibilityEnum("SPECIFIC_PROJECT");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("WORKSPACE", WORKSPACE);
            map.put("PROJECT", PROJECT);
            map.put("DOMAIN", DOMAIN);
            map.put("SPECIFIC_PROJECT", SPECIFIC_PROJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    /**
     * 排序参数。
     */
    public static final class MarketSortTypeEnum {

        /**
         * Enum UPDATETIME for value: "updateTime"
         */
        public static final MarketSortTypeEnum UPDATETIME = new MarketSortTypeEnum("updateTime");

        /**
         * Enum CREATETIME for value: "createTime"
         */
        public static final MarketSortTypeEnum CREATETIME = new MarketSortTypeEnum("createTime");

        private static final Map<String, MarketSortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MarketSortTypeEnum> createStaticFields() {
            Map<String, MarketSortTypeEnum> map = new HashMap<>();
            map.put("updateTime", UPDATETIME);
            map.put("createTime", CREATETIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MarketSortTypeEnum(String value) {
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
        public static MarketSortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MarketSortTypeEnum(value));
        }

        public static MarketSortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MarketSortTypeEnum) {
                return this.value.equals(((MarketSortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_sort_type")

    private MarketSortTypeEnum marketSortType;

    /**
     * 升序、降序。
     */
    public static final class AscOrDescEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final AscOrDescEnum ASC = new AscOrDescEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final AscOrDescEnum DESC = new AscOrDescEnum("desc");

        private static final Map<String, AscOrDescEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AscOrDescEnum> createStaticFields() {
            Map<String, AscOrDescEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AscOrDescEnum(String value) {
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
        public static AscOrDescEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AscOrDescEnum(value));
        }

        public static AscOrDescEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AscOrDescEnum) {
                return this.value.equals(((AscOrDescEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc_or_desc")

    private AscOrDescEnum ascOrDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_owner")

    private Boolean isOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized")

    private Boolean isAuthorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_recently")

    private Boolean isUpdateRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_release_recently")

    private Boolean isReleaseRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_hot_recently")

    private Boolean isHotRecently;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_and_failure_rate")

    private Boolean successAndFailureRate;

    public MallParaDTO withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public MallParaDTO withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * API可见性，WORKSPACE：工作空间可见，PROJECT： 项目可见，DOMAIN：租户可见，SPECIFIC_PROJECT：指定项目可见。
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public MallParaDTO withMarketSortType(MarketSortTypeEnum marketSortType) {
        this.marketSortType = marketSortType;
        return this;
    }

    /**
     * 排序参数。
     * @return marketSortType
     */
    public MarketSortTypeEnum getMarketSortType() {
        return marketSortType;
    }

    public void setMarketSortType(MarketSortTypeEnum marketSortType) {
        this.marketSortType = marketSortType;
    }

    public MallParaDTO withAscOrDesc(AscOrDescEnum ascOrDesc) {
        this.ascOrDesc = ascOrDesc;
        return this;
    }

    /**
     * 升序、降序。
     * @return ascOrDesc
     */
    public AscOrDescEnum getAscOrDesc() {
        return ascOrDesc;
    }

    public void setAscOrDesc(AscOrDescEnum ascOrDesc) {
        this.ascOrDesc = ascOrDesc;
    }

    public MallParaDTO withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public MallParaDTO withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public MallParaDTO withIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * 是否显示拥有者。
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public MallParaDTO withIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    /**
     * 是否显示已被授权。
     * @return isAuthorized
     */
    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public MallParaDTO withIsUpdateRecently(Boolean isUpdateRecently) {
        this.isUpdateRecently = isUpdateRecently;
        return this;
    }

    /**
     * 是否显示最近更新。
     * @return isUpdateRecently
     */
    public Boolean getIsUpdateRecently() {
        return isUpdateRecently;
    }

    public void setIsUpdateRecently(Boolean isUpdateRecently) {
        this.isUpdateRecently = isUpdateRecently;
    }

    public MallParaDTO withIsReleaseRecently(Boolean isReleaseRecently) {
        this.isReleaseRecently = isReleaseRecently;
        return this;
    }

    /**
     * 是否显示最近发布。
     * @return isReleaseRecently
     */
    public Boolean getIsReleaseRecently() {
        return isReleaseRecently;
    }

    public void setIsReleaseRecently(Boolean isReleaseRecently) {
        this.isReleaseRecently = isReleaseRecently;
    }

    public MallParaDTO withIsHotRecently(Boolean isHotRecently) {
        this.isHotRecently = isHotRecently;
        return this;
    }

    /**
     * 是否显示热销状态。
     * @return isHotRecently
     */
    public Boolean getIsHotRecently() {
        return isHotRecently;
    }

    public void setIsHotRecently(Boolean isHotRecently) {
        this.isHotRecently = isHotRecently;
    }

    public MallParaDTO withSuccessAndFailureRate(Boolean successAndFailureRate) {
        this.successAndFailureRate = successAndFailureRate;
        return this;
    }

    /**
     * 是否显示7天内成功率与失败率。
     * @return successAndFailureRate
     */
    public Boolean getSuccessAndFailureRate() {
        return successAndFailureRate;
    }

    public void setSuccessAndFailureRate(Boolean successAndFailureRate) {
        this.successAndFailureRate = successAndFailureRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MallParaDTO that = (MallParaDTO) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.marketSortType, that.marketSortType)
            && Objects.equals(this.ascOrDesc, that.ascOrDesc) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.isOwner, that.isOwner)
            && Objects.equals(this.isAuthorized, that.isAuthorized)
            && Objects.equals(this.isUpdateRecently, that.isUpdateRecently)
            && Objects.equals(this.isReleaseRecently, that.isReleaseRecently)
            && Objects.equals(this.isHotRecently, that.isHotRecently)
            && Objects.equals(this.successAndFailureRate, that.successAndFailureRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType,
            visibility,
            marketSortType,
            ascOrDesc,
            offset,
            limit,
            isOwner,
            isAuthorized,
            isUpdateRecently,
            isReleaseRecently,
            isHotRecently,
            successAndFailureRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MallParaDTO {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    marketSortType: ").append(toIndentedString(marketSortType)).append("\n");
        sb.append("    ascOrDesc: ").append(toIndentedString(ascOrDesc)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    isUpdateRecently: ").append(toIndentedString(isUpdateRecently)).append("\n");
        sb.append("    isReleaseRecently: ").append(toIndentedString(isReleaseRecently)).append("\n");
        sb.append("    isHotRecently: ").append(toIndentedString(isHotRecently)).append("\n");
        sb.append("    successAndFailureRate: ").append(toIndentedString(successAndFailureRate)).append("\n");
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
