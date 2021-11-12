package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CN横向扩容时必填
 */
public class OpenGaussCoordinators  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    
    
    private String azCode;

    public OpenGaussCoordinators withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 新增CN横向扩容每个节点的可用区。如果需要扩容多个CN，请分别填写待扩容CN所在的可用区。  不同区域的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)。  说明： 扩容后，实例中CN节点的数量必须小于或等于两倍的分片数量。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussCoordinators openGaussCoordinators = (OpenGaussCoordinators) o;
        return Objects.equals(this.azCode, openGaussCoordinators.azCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(azCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussCoordinators {\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
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

