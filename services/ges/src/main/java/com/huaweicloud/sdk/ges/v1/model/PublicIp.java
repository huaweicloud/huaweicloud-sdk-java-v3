package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PublicIp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicBindType")
    

    private String publicBindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eipId")
    

    private String eipId;

    public PublicIp withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    


    /**
     * 弹性IP绑定类型，取值如下。 - auto_assign：自动绑定。 - bind_existing：使用已有。
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
    }

    

    public PublicIp withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    


    /**
     * 弹性IP的id，当publicBindType设置为bind_existing时，该值为用户某个已创建但尚未绑定的EIP的ID；当publicBindType设置为auto_assign时，该值设置为空。
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
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.publicBindType, publicIp.publicBindType) &&
            Objects.equals(this.eipId, publicIp.eipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicBindType, eipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    publicBindType: ").append(toIndentedString(publicBindType)).append("\n");
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

