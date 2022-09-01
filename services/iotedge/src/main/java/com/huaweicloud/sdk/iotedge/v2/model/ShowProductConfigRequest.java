package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowProductConfigRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_type")
    
    @JacksonXmlProperty(localName = "protocol_type")
    
    private String protocolType;

    public ShowProductConfigRequest withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 协议类型
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProductConfigRequest showProductConfigRequest = (ShowProductConfigRequest) o;
        return Objects.equals(this.protocolType, showProductConfigRequest.protocolType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocolType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProductConfigRequest {\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
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

