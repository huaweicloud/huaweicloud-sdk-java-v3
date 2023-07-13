package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulnRule
 */
public class VulnRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_info")

    private String identityInfo;

    public VulnRule withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 问题文件
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public VulnRule withIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * 特征信息
     * @return identityInfo
     */
    public String getIdentityInfo() {
        return identityInfo;
    }

    public void setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulnRule that = (VulnRule) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.identityInfo, that.identityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, identityInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnRule {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
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
