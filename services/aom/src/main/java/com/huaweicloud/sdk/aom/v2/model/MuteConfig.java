package com.huaweicloud.sdk.aom.v2.model;




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
 * 静默规则的生效时间配置
 */
public class MuteConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ends_at")
    

    private Long endsAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private List<String> scope = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="starts_at")
    

    private Long startsAt;
    /**
     * 静默规则生效时间种类。FIXED:固定方式统计,DAILY:按日合计,WEEKLY:按周统计,MONTHLY:按月统计
     */
    public static final class TypeEnum {

        
        /**
         * Enum FIXED for value: "FIXED"
         */
        public static final TypeEnum FIXED = new TypeEnum("FIXED");
        
        /**
         * Enum DAILY for value: "DAILY"
         */
        public static final TypeEnum DAILY = new TypeEnum("DAILY");
        
        /**
         * Enum WEEKLY for value: "WEEKLY"
         */
        public static final TypeEnum WEEKLY = new TypeEnum("WEEKLY");
        
        /**
         * Enum MONTHLY for value: "MONTHLY"
         */
        public static final TypeEnum MONTHLY = new TypeEnum("MONTHLY");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FIXED", FIXED);
            map.put("DAILY", DAILY);
            map.put("WEEKLY", WEEKLY);
            map.put("MONTHLY", MONTHLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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

    public MuteConfig withEndsAt(Long endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    


    /**
     * 静默规则结束时间
     * minimum: 0
     * maximum: 999999999
     * @return endsAt
     */
    public Long getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Long endsAt) {
        this.endsAt = endsAt;
    }

    

    public MuteConfig withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    
    public MuteConfig addScopeItem(String scopeItem) {
        if(this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public MuteConfig withScope(Consumer<List<String>> scopeSetter) {
        if(this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * 当type为每周或者每月时，scope不能为空
     * @return scope
     */
    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    

    public MuteConfig withStartsAt(Long startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    


    /**
     * 静默规则开始时间
     * minimum: 0
     * maximum: 999999999
     * @return startsAt
     */
    public Long getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Long startsAt) {
        this.startsAt = startsAt;
    }

    

    public MuteConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 静默规则生效时间种类。FIXED:固定方式统计,DAILY:按日合计,WEEKLY:按周统计,MONTHLY:按月统计
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MuteConfig muteConfig = (MuteConfig) o;
        return Objects.equals(this.endsAt, muteConfig.endsAt) &&
            Objects.equals(this.scope, muteConfig.scope) &&
            Objects.equals(this.startsAt, muteConfig.startsAt) &&
            Objects.equals(this.type, muteConfig.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endsAt, scope, startsAt, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MuteConfig {\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

