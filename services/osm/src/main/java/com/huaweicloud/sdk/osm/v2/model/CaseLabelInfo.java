package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CaseLabelInfo
 */
public class CaseLabelInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_id")
    
    private Integer labelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="color")
    
    private String color;

    public CaseLabelInfo withLabelId(Integer labelId) {
        this.labelId = labelId;
        return this;
    }

    


    /**
     * 标签标识
     * @return labelId
     */
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    

    public CaseLabelInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 标签名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CaseLabelInfo withColor(String color) {
        this.color = color;
        return this;
    }

    


    /**
     * 标签颜色
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaseLabelInfo caseLabelInfo = (CaseLabelInfo) o;
        return Objects.equals(this.labelId, caseLabelInfo.labelId) &&
            Objects.equals(this.name, caseLabelInfo.name) &&
            Objects.equals(this.color, caseLabelInfo.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(labelId, name, color);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseLabelInfo {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

