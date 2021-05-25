package com.huaweicloud.sdk.ims.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListOsVersionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;

    public ListOsVersionsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * OS的标签。 根据标签值可以过滤查询指定特性的OS信息。 取值范围： bms：表示该镜像支持BMS的os_version列表。 uefi：支持UEFI启动方式的os_version列表。 arm：显示基于arm架构的os_version列表。 x86：显示基于x86架构的os_version列表。不带tag查询条件则默认查询当前region支持的所有的OS列表。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOsVersionsRequest listOsVersionsRequest = (ListOsVersionsRequest) o;
        return Objects.equals(this.tag, listOsVersionsRequest.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOsVersionsRequest {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

