package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 解绑EIP请求体
 */
public class DetachEipReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_id")
    

    private String eipId;

    public DetachEipReq withEipId(String eipId) {
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
        DetachEipReq detachEipReq = (DetachEipReq) o;
        return Objects.equals(this.eipId, detachEipReq.eipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachEipReq {\n");
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

