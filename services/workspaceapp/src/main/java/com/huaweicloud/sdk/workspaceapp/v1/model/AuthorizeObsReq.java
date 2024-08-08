package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取ak/sk时候传入的文件名称（带后缀）。
 */
public class AuthorizeObsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_file_name")

    private String appFileName;

    public AuthorizeObsReq withAppFileName(String appFileName) {
        this.appFileName = appFileName;
        return this;
    }

    /**
     * 应用名称,名称需满足如下规则: 1. 文件名前缀由可见字符和空格组成，且不能为全空格。 2. 长度范围1~255个字符。 3. 结尾必须是`.msi`或者`.exe`或者`.zip`或者`.rar`。
     * @return appFileName
     */
    public String getAppFileName() {
        return appFileName;
    }

    public void setAppFileName(String appFileName) {
        this.appFileName = appFileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeObsReq that = (AuthorizeObsReq) obj;
        return Objects.equals(this.appFileName, that.appFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appFileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeObsReq {\n");
        sb.append("    appFileName: ").append(toIndentedString(appFileName)).append("\n");
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
