package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Objects;

/**
 * CreateBucketRequestBody
 */
@JacksonXmlRootElement(localName = "CreateBucketConfiguration")
public class CreateBucketRequestBody extends SdkXmlBody<CreateBucketRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Location")

    @JacksonXmlProperty(localName = "Location")

    private String location;

    public CreateBucketRequestBody withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 指定Bucket在哪个区域被创建。 使用华北-北京一的终端节点创桶时 不携带Location，桶将默认创建在华北-北京一（cn-north-1） 在Location中指定其它区域，例如华北-北京四（cn-north-4），桶将创建在指定区域 使用华北-北京一以外其它区域的终端节点创桶时，必须携带Location，并且Location只能指定为该终端节点对应的区域。 例如使用obs.cn-north-4.myhuaweicloud.com终端节点创桶时，必须指定Location为cn-north-4。  有关OBS区域和终端节点的更多信息，请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint?OBS)。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBucketRequestBody that = (CreateBucketRequestBody) obj;
        return Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBucketRequestBody {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
