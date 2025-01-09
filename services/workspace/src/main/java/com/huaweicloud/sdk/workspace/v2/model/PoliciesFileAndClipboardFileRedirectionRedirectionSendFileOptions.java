package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重定向和发送文件共同控制项。
 */
public class PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_write_speed")

    private Integer readWriteSpeed;

    public PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions withReadWriteSpeed(
        Integer readWriteSpeed) {
        this.readWriteSpeed = readWriteSpeed;
        return this;
    }

    /**
     * 读写速度（Kbps）。取值范围为[0-2147483647]。默认：0。
     * minimum: 0
     * maximum: 2147483647
     * @return readWriteSpeed
     */
    public Integer getReadWriteSpeed() {
        return readWriteSpeed;
    }

    public void setReadWriteSpeed(Integer readWriteSpeed) {
        this.readWriteSpeed = readWriteSpeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions that =
            (PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions) obj;
        return Objects.equals(this.readWriteSpeed, that.readWriteSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readWriteSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions {\n");
        sb.append("    readWriteSpeed: ").append(toIndentedString(readWriteSpeed)).append("\n");
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
