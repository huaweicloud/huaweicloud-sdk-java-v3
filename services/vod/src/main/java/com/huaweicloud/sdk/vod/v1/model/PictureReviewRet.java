package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.ReviewDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 图片审核结果
 */
public class PictureReviewRet  {

    /**
     * 检测结果是否通过。 取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。
     */
    public static final class SuggestionEnum {

        
        /**
         * Enum BLOCK for value: "block"
         */
        public static final SuggestionEnum BLOCK = new SuggestionEnum("block");
        
        /**
         * Enum PASS for value: "pass"
         */
        public static final SuggestionEnum PASS = new SuggestionEnum("pass");
        
        /**
         * Enum REVIEW for value: "review"
         */
        public static final SuggestionEnum REVIEW = new SuggestionEnum("review");
        

        private static final Map<String, SuggestionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SuggestionEnum> createStaticFields() {
            Map<String, SuggestionEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("pass", PASS);
            map.put("review", REVIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SuggestionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SuggestionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SuggestionEnum(value);
            }
            return result;
        }

        public static SuggestionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SuggestionEnum) {
                return this.value.equals(((SuggestionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private SuggestionEnum suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="politics")
    
    private List<ReviewDetail> politics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="terrorism")
    
    private List<ReviewDetail> terrorism = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="porn")
    
    private List<ReviewDetail> porn = null;
    
    public PictureReviewRet withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 检测结果是否通过。 取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。
     * @return suggestion
     */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    

    public PictureReviewRet withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 截图在视频中的时间偏移值。封面不涉及此字段 单位：秒。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public PictureReviewRet withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 对应截图/封面的访问URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public PictureReviewRet withPolitics(List<ReviewDetail> politics) {
        this.politics = politics;
        return this;
    }

    
    public PictureReviewRet addPoliticsItem(ReviewDetail politicsItem) {
        if(this.politics == null) {
            this.politics = new ArrayList<>();
        }
        this.politics.add(politicsItem);
        return this;
    }

    public PictureReviewRet withPolitics(Consumer<List<ReviewDetail>> politicsSetter) {
        if(this.politics == null) {
            this.politics = new ArrayList<>();
        }
        politicsSetter.accept(this.politics);
        return this;
    }

    /**
     * 政治因素审核结果。
     * @return politics
     */
    public List<ReviewDetail> getPolitics() {
        return politics;
    }

    public void setPolitics(List<ReviewDetail> politics) {
        this.politics = politics;
    }

    

    public PictureReviewRet withTerrorism(List<ReviewDetail> terrorism) {
        this.terrorism = terrorism;
        return this;
    }

    
    public PictureReviewRet addTerrorismItem(ReviewDetail terrorismItem) {
        if(this.terrorism == null) {
            this.terrorism = new ArrayList<>();
        }
        this.terrorism.add(terrorismItem);
        return this;
    }

    public PictureReviewRet withTerrorism(Consumer<List<ReviewDetail>> terrorismSetter) {
        if(this.terrorism == null) {
            this.terrorism = new ArrayList<>();
        }
        terrorismSetter.accept(this.terrorism);
        return this;
    }

    /**
     * 暴恐元素审核结果。
     * @return terrorism
     */
    public List<ReviewDetail> getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(List<ReviewDetail> terrorism) {
        this.terrorism = terrorism;
    }

    

    public PictureReviewRet withPorn(List<ReviewDetail> porn) {
        this.porn = porn;
        return this;
    }

    
    public PictureReviewRet addPornItem(ReviewDetail pornItem) {
        if(this.porn == null) {
            this.porn = new ArrayList<>();
        }
        this.porn.add(pornItem);
        return this;
    }

    public PictureReviewRet withPorn(Consumer<List<ReviewDetail>> pornSetter) {
        if(this.porn == null) {
            this.porn = new ArrayList<>();
        }
        pornSetter.accept(this.porn);
        return this;
    }

    /**
     * 涉黄内容审核结果。
     * @return porn
     */
    public List<ReviewDetail> getPorn() {
        return porn;
    }

    public void setPorn(List<ReviewDetail> porn) {
        this.porn = porn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PictureReviewRet pictureReviewRet = (PictureReviewRet) o;
        return Objects.equals(this.suggestion, pictureReviewRet.suggestion) &&
            Objects.equals(this.offset, pictureReviewRet.offset) &&
            Objects.equals(this.url, pictureReviewRet.url) &&
            Objects.equals(this.politics, pictureReviewRet.politics) &&
            Objects.equals(this.terrorism, pictureReviewRet.terrorism) &&
            Objects.equals(this.porn, pictureReviewRet.porn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(suggestion, offset, url, politics, terrorism, porn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureReviewRet {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    politics: ").append(toIndentedString(politics)).append("\n");
        sb.append("    terrorism: ").append(toIndentedString(terrorism)).append("\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
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

