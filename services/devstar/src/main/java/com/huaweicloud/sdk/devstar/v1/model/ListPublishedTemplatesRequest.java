package com.huaweicloud.sdk.devstar.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListPublishedTemplatesRequest  {

    /**
     * Gets or Sets xLanguage
     */
    public static class XLanguageEnum {

        
        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        
        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        

        public static Map<String, XLanguageEnum> staticFields =
                new HashMap<String, XLanguageEnum>() {
                    { 
                        put("zh-cn", ZH_CN);
                        put("en-us", EN_US);
                    }
                };

        private String value;

        XLanguageEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static XLanguageEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            XLanguageEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new XLanguageEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            XLanguageEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof XLanguageEnum) {
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
    @JsonProperty(value="X-Language")
    
    private XLanguageEnum xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keyword")
    
    private String keyword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;

    public ListPublishedTemplatesRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListPublishedTemplatesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    


    /**
     * Get keyword
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListPublishedTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPublishedTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublishedTemplatesRequest listPublishedTemplatesRequest = (ListPublishedTemplatesRequest) o;
        return Objects.equals(this.xLanguage, listPublishedTemplatesRequest.xLanguage) &&
            Objects.equals(this.keyword, listPublishedTemplatesRequest.keyword) &&
            Objects.equals(this.offset, listPublishedTemplatesRequest.offset) &&
            Objects.equals(this.limit, listPublishedTemplatesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, keyword, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublishedTemplatesRequest {\n");
            sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
            sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

