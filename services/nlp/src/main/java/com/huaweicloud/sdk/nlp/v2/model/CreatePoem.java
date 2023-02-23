package com.huaweicloud.sdk.nlp.v2.model;




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
 * 
 */
public class CreatePoem  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    

    private String title;
    /**
     * 诗歌类型，取值如下： 0：五言绝句； 1：七言绝句； 2：五言律诗； 3：七言律诗；
     */
    public static final class TypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final TypeEnum NUMBER_3 = new TypeEnum(3);
        

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="type")
    

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acrostic")
    

    private Boolean acrostic;

    public CreatePoem withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 诗歌标题，目前仅支持UTF-8编码，仅支持中文，长度为1-10
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public CreatePoem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 诗歌类型，取值如下： 0：五言绝句； 1：七言绝句； 2：五言律诗； 3：七言律诗；
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public CreatePoem withAcrostic(Boolean acrostic) {
        this.acrostic = acrostic;
        return this;
    }

    


    /**
     * 藏头诗，取值如下： 取值为true，为藏头诗； 取值为false，非藏头诗； 默认取值为false。
     * @return acrostic
     */
    public Boolean getAcrostic() {
        return acrostic;
    }

    public void setAcrostic(Boolean acrostic) {
        this.acrostic = acrostic;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePoem createPoem = (CreatePoem) o;
        return Objects.equals(this.title, createPoem.title) &&
            Objects.equals(this.type, createPoem.type) &&
            Objects.equals(this.acrostic, createPoem.acrostic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, type, acrostic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoem {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    acrostic: ").append(toIndentedString(acrostic)).append("\n");
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

