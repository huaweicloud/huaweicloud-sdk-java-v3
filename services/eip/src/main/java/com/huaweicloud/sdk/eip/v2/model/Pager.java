package com.huaweicloud.sdk.eip.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * marker分页结构
 */
public class Pager  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;
    /**
     * next:下一页  previous:前一页
     */
    public static final class RelEnum {

        
        /**
         * Enum NEXT for value: "next"
         */
        public static final RelEnum NEXT = new RelEnum("next");
        
        /**
         * Enum PREVIOUS for value: "previous"
         */
        public static final RelEnum PREVIOUS = new RelEnum("previous");
        

        private static final Map<String, RelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelEnum> createStaticFields() {
            Map<String, RelEnum> map = new HashMap<>();
            map.put("next", NEXT);
            map.put("previous", PREVIOUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelEnum(String value) {
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
        public static RelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RelEnum(value);
            }
            return result;
        }

        public static RelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RelEnum) {
                return this.value.equals(((RelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private RelEnum rel;

    public Pager withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 页码url
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Pager withRel(RelEnum rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * next:下一页  previous:前一页
     * @return rel
     */
    public RelEnum getRel() {
        return rel;
    }

    public void setRel(RelEnum rel) {
        this.rel = rel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pager pager = (Pager) o;
        return Objects.equals(this.href, pager.href) &&
            Objects.equals(this.rel, pager.rel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pager {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

