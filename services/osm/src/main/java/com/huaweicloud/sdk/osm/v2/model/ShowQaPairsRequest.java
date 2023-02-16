package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowQaPairsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    /**
     * - HOT:  - RECOMMEND:  
     */
    public static final class SearchTypeEnum {

        /**
         * Enum HOT for value: "HOT"
         */
        public static final SearchTypeEnum HOT = new SearchTypeEnum("HOT");

        /**
         * Enum RECOMMEND for value: "RECOMMEND"
         */
        public static final SearchTypeEnum RECOMMEND = new SearchTypeEnum("RECOMMEND");

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("HOT", HOT);
            map.put("RECOMMEND", RECOMMEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchTypeEnum(String value) {
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
        public static SearchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SearchTypeEnum(value);
            }
            return result;
        }

        public static SearchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SearchTypeEnum) {
                return this.value.equals(((SearchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private SearchTypeEnum searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SearchQaPairsReq body;

    public ShowQaPairsRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public ShowQaPairsRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public ShowQaPairsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowQaPairsRequest withSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * - HOT:  - RECOMMEND:  
     * @return searchType
     */
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    public ShowQaPairsRequest withBody(SearchQaPairsReq body) {
        this.body = body;
        return this;
    }

    public ShowQaPairsRequest withBody(Consumer<SearchQaPairsReq> bodySetter) {
        if (this.body == null) {
            this.body = new SearchQaPairsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SearchQaPairsReq getBody() {
        return body;
    }

    public void setBody(SearchQaPairsReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQaPairsRequest showQaPairsRequest = (ShowQaPairsRequest) o;
        return Objects.equals(this.xServiceKey, showQaPairsRequest.xServiceKey)
            && Objects.equals(this.xSite, showQaPairsRequest.xSite)
            && Objects.equals(this.xLanguage, showQaPairsRequest.xLanguage)
            && Objects.equals(this.searchType, showQaPairsRequest.searchType)
            && Objects.equals(this.body, showQaPairsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, searchType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQaPairsRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
