package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Resources
 */
public class Resources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    
    private Integer min;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max")
    
    private Integer max;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Integer quota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public Resources withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 资源的计数单位。 - 当type为instance时，无单位。 - 当type为ram时，单位为GB。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    public Resources withMin(Integer min) {
        this.min = min;
        return this;
    }

    


    /**
     * - 当type为instance时，表示可申请实例配额的最小值。 - 当type为ram时，表示可申请内存配额的最小值。 
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    

    public Resources withMax(Integer max) {
        this.max = max;
        return this;
    }

    


    /**
     * - 当type为instance时，表示可申请实例配额的最大值。 - 当type为ram时，表示可申请内存配额的最大值。 
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    

    public Resources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 可以创建的实例最大数和总内存的配额限制。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    

    public Resources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已创建的实例个数和已使用的内存配额。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    

    public Resources withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 支持instance、ram两种。 - instance表示实例配额。 - ram表示内存配额。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        Resources resources = (Resources) o;
        return Objects.equals(this.unit, resources.unit) &&
            Objects.equals(this.min, resources.min) &&
            Objects.equals(this.max, resources.max) &&
            Objects.equals(this.quota, resources.quota) &&
            Objects.equals(this.used, resources.used) &&
            Objects.equals(this.type, resources.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(unit, min, max, quota, used, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resources {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

