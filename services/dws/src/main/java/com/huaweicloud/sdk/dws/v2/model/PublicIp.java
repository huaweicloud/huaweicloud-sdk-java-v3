package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PublicIp
 */
public class PublicIp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_id")
    
    private String eipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_bind_type")
    
    private String publicBindType;

    public PublicIp withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    


    /**
     * 弹性IP的id
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public PublicIp withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    


    /**
     * 弹性IP绑定类型
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
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
        return Objects.equals(this.eipId, publicIp.eipId) &&
            Objects.equals(this.publicBindType, publicIp.publicBindType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eipId, publicBindType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    publicBindType: ").append(toIndentedString(publicBindType)).append("\n");
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

