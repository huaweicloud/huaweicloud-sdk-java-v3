package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DecryptDatakeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_key")

    @JacksonXmlProperty(localName = "data_key")

    private String dataKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_length")

    @JacksonXmlProperty(localName = "datakey_length")

    private String datakeyLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_dgst")

    @JacksonXmlProperty(localName = "datakey_dgst")

    private String datakeyDgst;

    public DecryptDatakeyResponse withDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }

    /**
     * DEK明文的16进制字符串。
     * @return dataKey
     */
    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public DecryptDatakeyResponse withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    /**
     * DEK明文字节长度。
     * @return datakeyLength
     */
    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    public DecryptDatakeyResponse withDatakeyDgst(String datakeyDgst) {
        this.datakeyDgst = datakeyDgst;
        return this;
    }

    /**
     * DEK明文的SHA256值对应的16进制字符串。
     * @return datakeyDgst
     */
    public String getDatakeyDgst() {
        return datakeyDgst;
    }

    public void setDatakeyDgst(String datakeyDgst) {
        this.datakeyDgst = datakeyDgst;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecryptDatakeyResponse decryptDatakeyResponse = (DecryptDatakeyResponse) o;
        return Objects.equals(this.dataKey, decryptDatakeyResponse.dataKey)
            && Objects.equals(this.datakeyLength, decryptDatakeyResponse.datakeyLength)
            && Objects.equals(this.datakeyDgst, decryptDatakeyResponse.datakeyDgst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataKey, datakeyLength, datakeyDgst);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyResponse {\n");
        sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
        sb.append("    datakeyDgst: ").append(toIndentedString(datakeyDgst)).append("\n");
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
