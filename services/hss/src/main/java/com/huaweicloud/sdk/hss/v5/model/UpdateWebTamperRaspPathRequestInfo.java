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
     * **参数解释**: 动态网页防篡改的Tomcat bin目录。 **约束限制**: 仅Linux服务器支持配置动态网页防篡改的Tomcat bin目录。 **取值范围**: 字符长度1-256位，必须以/开头，不能以/结尾，只能包含英文大小写字母，数字，下划线，中划线和点。 **默认取值**: 不涉及 
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
