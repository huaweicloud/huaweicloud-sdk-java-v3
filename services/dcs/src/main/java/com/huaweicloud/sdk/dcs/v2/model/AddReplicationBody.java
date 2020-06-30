package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加副本请求体
 */
public class AddReplicationBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    
    private String azCode;

    public AddReplicationBody withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 表示指定副本所在的可用区编码。 可用区编码可通过[查询可用区信息](https://support.huaweicloud.com/api-dcs/dcs-api-0514010.html)接口查询，可用区必须是有资源的，否则添加失败。 
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
        AddReplicationBody addReplicationBody = (AddReplicationBody) o;
        return Objects.equals(this.azCode, addReplicationBody.azCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(azCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddReplicationBody {\n");
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

