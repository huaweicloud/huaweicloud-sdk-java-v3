package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RefreshTaskRequestBody
 */
public class RefreshTaskRequestBody  {

    /**
     * 刷新的类型，其值可以为file 或directory，默认为file
     */
    public static final class TypeEnum {

        
        /**
         * Enum FILE for value: "file"
         */
        public static final TypeEnum FILE = new TypeEnum("file");
        
        /**
         * Enum DIRECTORY for value: "directory"
         */
        public static final TypeEnum DIRECTORY = new TypeEnum("directory");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("directory", DIRECTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
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
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="urls")
    
    private List<String> urls = null;
    
    public RefreshTaskRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 刷新的类型，其值可以为file 或directory，默认为file
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public RefreshTaskRequestBody withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public RefreshTaskRequestBody addUrlsItem(String urlsItem) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public RefreshTaskRequestBody withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 输入URL必须带有“http://”或“https://”，多个URL用逗号分隔，单个url的长度限制为10240字符，单次最多输入1000个url。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefreshTaskRequestBody refreshTaskRequestBody = (RefreshTaskRequestBody) o;
        return Objects.equals(this.type, refreshTaskRequestBody.type) &&
            Objects.equals(this.urls, refreshTaskRequestBody.urls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, urls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshTaskRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

