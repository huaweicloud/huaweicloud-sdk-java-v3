package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowNaRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="na_id")
    

    private String naId;

    public ShowNaRequest withNaId(String naId) {
        this.naId = naId;
        return this;
    }

    


    /**
     * 北向数据接收端点ID
     * @return naId
     */
    public String getNaId() {
        return naId;
    }

    public void setNaId(String naId) {
        this.naId = naId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNaRequest showNaRequest = (ShowNaRequest) o;
        return Objects.equals(this.naId, showNaRequest.naId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(naId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNaRequest {\n");
        sb.append("    naId: ").append(toIndentedString(naId)).append("\n");
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

