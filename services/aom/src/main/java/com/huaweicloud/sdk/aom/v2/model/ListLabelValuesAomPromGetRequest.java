package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLabelValuesAomPromGetRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_name")
    

    private String labelName;

    public ListLabelValuesAomPromGetRequest withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    


    /**
     * 查询所用标签。
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLabelValuesAomPromGetRequest listLabelValuesAomPromGetRequest = (ListLabelValuesAomPromGetRequest) o;
        return Objects.equals(this.labelName, listLabelValuesAomPromGetRequest.labelName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(labelName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelValuesAomPromGetRequest {\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

