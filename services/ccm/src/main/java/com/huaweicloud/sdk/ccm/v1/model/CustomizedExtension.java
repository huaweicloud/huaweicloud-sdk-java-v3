package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CustomizedExtension */
public class CustomizedExtension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_identifier")

    private String objectIdentifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CustomizedExtension withObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
        return this;
    }

    /** 对象标识符。 > 本参数需要满足ASN1规范的点分十进制符号格式的字符串，如1.3.6.1.4.1.2011.4.99。
     * 
     * @return objectIdentifier */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    public CustomizedExtension withValue(String value) {
        this.value = value;
        return this;
    }

    /** 自定义属性内容。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizedExtension customizedExtension = (CustomizedExtension) o;
        return Objects.equals(this.objectIdentifier, customizedExtension.objectIdentifier)
            && Objects.equals(this.value, customizedExtension.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectIdentifier, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizedExtension {\n");
        sb.append("    objectIdentifier: ").append(toIndentedString(objectIdentifier)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
