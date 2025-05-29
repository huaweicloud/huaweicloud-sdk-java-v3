package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVoiceRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultcode")

    private String resultcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultdesc")

    private String resultdesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Location")

    private String location;

    public ShowVoiceRecordResponse withResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }

    /**
     * 错误码
     * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public ShowVoiceRecordResponse withResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
        return this;
    }

    /**
     * 错误描述
     * @return resultdesc
     */
    public String getResultdesc() {
        return resultdesc;
    }

    public void setResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
    }

    public ShowVoiceRecordResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
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
        ShowVoiceRecordResponse that = (ShowVoiceRecordResponse) obj;
        return Objects.equals(this.resultcode, that.resultcode) && Objects.equals(this.resultdesc, that.resultdesc)
            && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultcode, resultdesc, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVoiceRecordResponse {\n");
        sb.append("    resultcode: ").append(toIndentedString(resultcode)).append("\n");
        sb.append("    resultdesc: ").append(toIndentedString(resultdesc)).append("\n");
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
