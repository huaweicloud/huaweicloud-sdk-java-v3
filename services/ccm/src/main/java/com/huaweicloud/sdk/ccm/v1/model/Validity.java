package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Validity
 */
public class Validity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_from")
    
    private String startFrom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Integer value;

    public Validity withStartFrom(String startFrom) {
        this.startFrom = startFrom;
        return this;
    }

    


    /**
     * 起始时间
     * @return startFrom
     */
    public String getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    

    public Validity withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 有效期类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Validity withValue(Integer value) {
        this.value = value;
        return this;
    }

    


    /**
     * 路径长度
     * minimum: 0
     * maximum: 100000000
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Validity validity = (Validity) o;
        return Objects.equals(this.startFrom, validity.startFrom) &&
            Objects.equals(this.type, validity.type) &&
            Objects.equals(this.value, validity.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startFrom, type, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Validity {\n");
        sb.append("    startFrom: ").append(toIndentedString(startFrom)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

