package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceDiskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    
    private String used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private String total;

    public ShowInstanceDiskResponse withUsed(String used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已使用量。表示当前实例已使用的存储空间大小。单位：GB
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    

    public ShowInstanceDiskResponse withTotal(String total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总量。表示当前实例最大存储空间大小。单位：GB
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceDiskResponse showInstanceDiskResponse = (ShowInstanceDiskResponse) o;
        return Objects.equals(this.used, showInstanceDiskResponse.used) &&
            Objects.equals(this.total, showInstanceDiskResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(used, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceDiskResponse {\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

