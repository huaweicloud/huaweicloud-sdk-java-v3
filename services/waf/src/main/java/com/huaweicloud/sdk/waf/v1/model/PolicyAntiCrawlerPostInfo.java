package com.huaweicloud.sdk.waf.v1.model;




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
 * PolicyAntiCrawlerPostInfo
 */
public class PolicyAntiCrawlerPostInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;
    /**
     * 规则匹配逻辑（说明：1：包含，2：不包含，3：等于，4：不等于，5：前缀为，6：前缀不为，7：后缀为，8：后缀不为）
     */
    public static final class LogicEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LogicEnum NUMBER_1 = new LogicEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final LogicEnum NUMBER_2 = new LogicEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final LogicEnum NUMBER_3 = new LogicEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final LogicEnum NUMBER_4 = new LogicEnum(4);
        
        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final LogicEnum NUMBER_5 = new LogicEnum(5);
        
        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final LogicEnum NUMBER_6 = new LogicEnum(6);
        
        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final LogicEnum NUMBER_7 = new LogicEnum(7);
        
        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final LogicEnum NUMBER_8 = new LogicEnum(8);
        

        private static final Map<Integer, LogicEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LogicEnum> createStaticFields() {
            Map<Integer, LogicEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LogicEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LogicEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            LogicEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogicEnum(value);
            }
            return result;
        }

        public static LogicEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            LogicEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LogicEnum) {
                return this.value.equals(((LogicEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logic")
    
    private LogicEnum logic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public PolicyAntiCrawlerPostInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 规则应用的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public PolicyAntiCrawlerPostInfo withLogic(LogicEnum logic) {
        this.logic = logic;
        return this;
    }

    


    /**
     * 规则匹配逻辑（说明：1：包含，2：不包含，3：等于，4：不等于，5：前缀为，6：前缀不为，7：后缀为，8：后缀不为）
     * @return logic
     */
    public LogicEnum getLogic() {
        return logic;
    }

    public void setLogic(LogicEnum logic) {
        this.logic = logic;
    }

    

    public PolicyAntiCrawlerPostInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PolicyAntiCrawlerPostInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则url，默认为anticrawler_specific_url
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public PolicyAntiCrawlerPostInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则描述
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
        PolicyAntiCrawlerPostInfo policyAntiCrawlerPostInfo = (PolicyAntiCrawlerPostInfo) o;
        return Objects.equals(this.url, policyAntiCrawlerPostInfo.url) &&
            Objects.equals(this.logic, policyAntiCrawlerPostInfo.logic) &&
            Objects.equals(this.name, policyAntiCrawlerPostInfo.name) &&
            Objects.equals(this.type, policyAntiCrawlerPostInfo.type) &&
            Objects.equals(this.description, policyAntiCrawlerPostInfo.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, logic, name, type, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAntiCrawlerPostInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

