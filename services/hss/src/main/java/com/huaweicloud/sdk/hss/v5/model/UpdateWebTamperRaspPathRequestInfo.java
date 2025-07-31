package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateWebTamperRaspPathRequestInfo
 */
public class UpdateWebTamperRaspPathRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_path")

    private String raspPath;

    public UpdateWebTamperRaspPathRequestInfo withRaspPath(String raspPath) {
        this.raspPath = raspPath;
        return this;
    }

    /**
     * rasp path
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
        UpdateWebTamperRaspPathRequestInfo that = (UpdateWebTamperRaspPathRequestInfo) obj;
        return Objects.equals(this.raspPath, that.raspPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raspPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWebTamperRaspPathRequestInfo {\n");
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
