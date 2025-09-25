package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWebTamperRaspPathResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_path")

    private String raspPath;

    public ShowWebTamperRaspPathResponse withRaspPath(String raspPath) {
        this.raspPath = raspPath;
        return this;
    }

    /**
     * **参数解释**: 动态网页防篡改的Tomcat bin目录 **取值范围**: 字符长度0-512位 
     * @return raspPath
     */
    public String getRaspPath() {
        return raspPath;
    }

    public void setRaspPath(String raspPath) {
        this.raspPath = raspPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWebTamperRaspPathResponse that = (ShowWebTamperRaspPathResponse) obj;
        return Objects.equals(this.raspPath, that.raspPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raspPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebTamperRaspPathResponse {\n");
        sb.append("    raspPath: ").append(toIndentedString(raspPath)).append("\n");
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
