package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入应用参数
 */
public class AppSrcReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_name")

    private String destinationAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_app_version")

    private String destinationAppVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    private String sourceAppId;

    public AppSrcReq withDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
        return this;
    }

    /**
     * 目标应用名称 取值范围：长度为[1,56]，以大小写字母开头，允许出现中划线(-)、下划线(_)、小写字母和数字，且必须以大小写字母或数字结尾。
     * @return destinationAppName
     */
    public String getDestinationAppName() {
        return destinationAppName;
    }

    public void setDestinationAppName(String destinationAppName) {
        this.destinationAppName = destinationAppName;
    }

    public AppSrcReq withDestinationAppVersion(String destinationAppVersion) {
        this.destinationAppVersion = destinationAppVersion;
        return this;
    }

    /**
     * 目标应用版本 取值范围：长度[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。
     * @return destinationAppVersion
     */
    public String getDestinationAppVersion() {
        return destinationAppVersion;
    }

    public void setDestinationAppVersion(String destinationAppVersion) {
        this.destinationAppVersion = destinationAppVersion;
    }

    public AppSrcReq withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /**
     * 源应用id
     * @return sourceAppId
     */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppSrcReq that = (AppSrcReq) obj;
        return Objects.equals(this.destinationAppName, that.destinationAppName)
            && Objects.equals(this.destinationAppVersion, that.destinationAppVersion)
            && Objects.equals(this.sourceAppId, that.sourceAppId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationAppName, destinationAppVersion, sourceAppId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppSrcReq {\n");
        sb.append("    destinationAppName: ").append(toIndentedString(destinationAppName)).append("\n");
        sb.append("    destinationAppVersion: ").append(toIndentedString(destinationAppVersion)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
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
