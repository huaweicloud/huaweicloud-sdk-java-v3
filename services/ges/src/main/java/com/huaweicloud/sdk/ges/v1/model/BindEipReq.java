package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class BindEipReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eipId")
    

    private String eipId;

    public BindEipReq withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    


    /**
     * 弹性公网IP的ID。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindEipReq bindEipReq = (BindEipReq) o;
        return Objects.equals(this.eipId, bindEipReq.eipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindEipReq {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
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

