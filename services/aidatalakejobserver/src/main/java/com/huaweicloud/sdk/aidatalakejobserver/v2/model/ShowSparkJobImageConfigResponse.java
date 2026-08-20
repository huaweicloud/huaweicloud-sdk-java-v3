package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：镜像配置信息，包含镜像ID和版本信息。 
 */
public class ShowSparkJobImageConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_id")

    private String imageVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    private String releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_type")

    private String imageVersionType;

    public ShowSparkJobImageConfigResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID，唯一标识Spark作业使用的镜像。 **取值范围**：长度为1~128个字符。 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowSparkJobImageConfigResponse withImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本，指定镜像的版本号。 **取值范围**：长度为1~64个字符。 
     * @return imageVersionId
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }

    public ShowSparkJobImageConfigResponse withReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * **参数解释**：Spark作业的版本信息(AIDalake.xxx(Sparkx.xx.x,JRExx.x))。 **取值范围**：长度为1~512个字符。
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public ShowSparkJobImageConfigResponse withImageVersionType(String imageVersionType) {
        this.imageVersionType = imageVersionType;
        return this;
    }

    /**
     * **参数解释**：Spark作业使用的镜像版本类型。 **取值范围**： - STABLE：稳定。 - RECOMMEND：推荐。 - BETA：测试。
     * @return imageVersionType
     */
    public String getImageVersionType() {
        return imageVersionType;
    }

    public void setImageVersionType(String imageVersionType) {
        this.imageVersionType = imageVersionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkJobImageConfigResponse that = (ShowSparkJobImageConfigResponse) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersionId, that.imageVersionId)
            && Objects.equals(this.releaseVersion, that.releaseVersion)
            && Objects.equals(this.imageVersionType, that.imageVersionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageVersionId, releaseVersion, imageVersionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkJobImageConfigResponse {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersionId: ").append(toIndentedString(imageVersionId)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    imageVersionType: ").append(toIndentedString(imageVersionType)).append("\n");
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
