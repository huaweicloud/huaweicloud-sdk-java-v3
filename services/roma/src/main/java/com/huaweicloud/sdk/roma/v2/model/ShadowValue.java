package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShadowValue
 */
public class ShadowValue  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property_name")
    
    private String propertyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property_value")
    
    private String propertyValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property_updated_date")
    
    private Long propertyUpdatedDate;

    public ShadowValue withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    


    /**
     * 属性名称
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public ShadowValue withPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }

    


    /**
     * 属性最后一次上报值
     * @return propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public ShadowValue withPropertyUpdatedDate(Long propertyUpdatedDate) {
        this.propertyUpdatedDate = propertyUpdatedDate;
        return this;
    }

    


    /**
     * 属性最后一次上报时间，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return propertyUpdatedDate
     */
    public Long getPropertyUpdatedDate() {
        return propertyUpdatedDate;
    }

    public void setPropertyUpdatedDate(Long propertyUpdatedDate) {
        this.propertyUpdatedDate = propertyUpdatedDate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShadowValue shadowValue = (ShadowValue) o;
        return Objects.equals(this.propertyName, shadowValue.propertyName) &&
            Objects.equals(this.propertyValue, shadowValue.propertyValue) &&
            Objects.equals(this.propertyUpdatedDate, shadowValue.propertyUpdatedDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(propertyName, propertyValue, propertyUpdatedDate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShadowValue {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
        sb.append("    propertyUpdatedDate: ").append(toIndentedString(propertyUpdatedDate)).append("\n");
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

