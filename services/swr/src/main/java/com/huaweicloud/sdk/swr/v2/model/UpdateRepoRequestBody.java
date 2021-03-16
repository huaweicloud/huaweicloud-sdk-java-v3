package com.huaweicloud.sdk.swr.v2.model;




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
 * UpdateRepoRequestBody
 */
public class UpdateRepoRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_public")
    
    private Boolean isPublic;
    /**
     * 仓库类型，可设置为app_server, linux, framework_app, database, lang, other, windows, arm。
     */
    public static final class CategoryEnum {

        
        /**
         * Enum APP_SERVER for value: "app_server"
         */
        public static final CategoryEnum APP_SERVER = new CategoryEnum("app_server");
        
        /**
         * Enum LINUX for value: "linux"
         */
        public static final CategoryEnum LINUX = new CategoryEnum("linux");
        
        /**
         * Enum FRAMEWORK_APP for value: "framework_app"
         */
        public static final CategoryEnum FRAMEWORK_APP = new CategoryEnum("framework_app");
        
        /**
         * Enum DATABASE for value: "database"
         */
        public static final CategoryEnum DATABASE = new CategoryEnum("database");
        
        /**
         * Enum LANG for value: "lang"
         */
        public static final CategoryEnum LANG = new CategoryEnum("lang");
        
        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final CategoryEnum WINDOWS = new CategoryEnum("windows");
        
        /**
         * Enum ARMS for value: "arms"
         */
        public static final CategoryEnum ARMS = new CategoryEnum("arms");
        
        /**
         * Enum OTHER for value: "other"
         */
        public static final CategoryEnum OTHER = new CategoryEnum("other");
        

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("app_server", APP_SERVER);
            map.put("linux", LINUX);
            map.put("framework_app", FRAMEWORK_APP);
            map.put("database", DATABASE);
            map.put("lang", LANG);
            map.put("windows", WINDOWS);
            map.put("arms", ARMS);
            map.put("other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private CategoryEnum category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public UpdateRepoRequestBody withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    


    /**
     * 是否为公共仓库，可选值为true或false。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    

    public UpdateRepoRequestBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    


    /**
     * 仓库类型，可设置为app_server, linux, framework_app, database, lang, other, windows, arm。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    

    public UpdateRepoRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像仓库的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRepoRequestBody updateRepoRequestBody = (UpdateRepoRequestBody) o;
        return Objects.equals(this.isPublic, updateRepoRequestBody.isPublic) &&
            Objects.equals(this.category, updateRepoRequestBody.category) &&
            Objects.equals(this.description, updateRepoRequestBody.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isPublic, category, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoRequestBody {\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

