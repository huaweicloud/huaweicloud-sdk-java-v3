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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询条件。
 */
public class RelationModel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    @JacksonXmlProperty(localName = "key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    @JacksonXmlProperty(localName = "value")
    
    private List<String> value = null;
        /**
     * 该条件与其他条件的组合方式。 AND：必须满足所有条件； OR：可以满足其中一个条件； NOT：必须不满足所有条件。
     */
    public static final class RelationEnum {

        
        /**
         * Enum AND for value: "AND"
         */
        public static final RelationEnum AND = new RelationEnum("AND");
        
        /**
         * Enum OR for value: "OR"
         */
        public static final RelationEnum OR = new RelationEnum("OR");
        
        /**
         * Enum NOT for value: "NOT"
         */
        public static final RelationEnum NOT = new RelationEnum("NOT");
        

        private static final Map<String, RelationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationEnum> createStaticFields() {
            Map<String, RelationEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            map.put("NOT", NOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelationEnum(String value) {
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
        public static RelationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RelationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RelationEnum(value);
            }
            return result;
        }

        public static RelationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RelationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelationEnum) {
                return this.value.equals(((RelationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relation")
    
    @JacksonXmlProperty(localName = "relation")
    
    private RelationEnum relation;

    public RelationModel withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 指定查询字段的key，对应metadata里面的key 。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public RelationModel withValue(List<String> value) {
        this.value = value;
        return this;
    }

    
    public RelationModel addValueItem(String valueItem) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public RelationModel withValue(Consumer<List<String>> valueSetter) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 查询条件中指定key的值。
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    

    public RelationModel withRelation(RelationEnum relation) {
        this.relation = relation;
        return this;
    }

    


    /**
     * 该条件与其他条件的组合方式。 AND：必须满足所有条件； OR：可以满足其中一个条件； NOT：必须不满足所有条件。
     * @return relation
     */
    public RelationEnum getRelation() {
        return relation;
    }

    public void setRelation(RelationEnum relation) {
        this.relation = relation;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelationModel relationModel = (RelationModel) o;
        return Objects.equals(this.key, relationModel.key) &&
            Objects.equals(this.value, relationModel.value) &&
            Objects.equals(this.relation, relationModel.relation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value, relation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationModel {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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

