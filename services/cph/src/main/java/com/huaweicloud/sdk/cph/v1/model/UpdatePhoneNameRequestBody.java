package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdatePhoneNameRequestBody
 */
public class UpdatePhoneNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_name")

    @JacksonXmlProperty(localName = "phone_name")

    private String phoneName;

    public UpdatePhoneNameRequestBody withPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    /**
     * 云手机名称，必须为小写字母（a-z）、大写字母（A-Z）、数字（0-9）、中文字符、中划线-、下划线_，且不得超过60个字符。
     * @return phoneName
     */
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePhoneNameRequestBody updatePhoneNameRequestBody = (UpdatePhoneNameRequestBody) o;
        return Objects.equals(this.phoneName, updatePhoneNameRequestBody.phoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePhoneNameRequestBody {\n");
        sb.append("    phoneName: ").append(toIndentedString(phoneName)).append("\n");
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
