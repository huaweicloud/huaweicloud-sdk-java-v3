package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListEnginesItems
 */
public class ListEnginesItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v1_compatible")

    private Boolean v1Compatible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_user")

    private String runUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private ListEnginesImageInfo imageInfo;

    public ListEnginesItems withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 引擎规格的ID。如“caffe-1.0.0-python2.7”。
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public ListEnginesItems withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎规格的名称。如“Caffe”。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListEnginesItems withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎规格的版本。对一个引擎名称，有多个版本的引擎，如使用python2.7的\"Caffe-1.0.0-python2.7\"等。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ListEnginesItems withV1Compatible(Boolean v1Compatible) {
        this.v1Compatible = v1Compatible;
        return this;
    }

    /**
     * 是否为v1兼容模式。
     * @return v1Compatible
     */
    public Boolean getV1Compatible() {
        return v1Compatible;
    }

    public void setV1Compatible(Boolean v1Compatible) {
        this.v1Compatible = v1Compatible;
    }

    public ListEnginesItems withRunUser(String runUser) {
        this.runUser = runUser;
        return this;
    }

    /**
     * 引擎默认启动用户uid。
     * @return runUser
     */
    public String getRunUser() {
        return runUser;
    }

    public void setRunUser(String runUser) {
        this.runUser = runUser;
    }

    public ListEnginesItems withImageInfo(ListEnginesImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public ListEnginesItems withImageInfo(Consumer<ListEnginesImageInfo> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new ListEnginesImageInfo();
            imageInfoSetter.accept(this.imageInfo);
        }

        return this;
    }

    /**
     * Get imageInfo
     * @return imageInfo
     */
    public ListEnginesImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ListEnginesImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnginesItems that = (ListEnginesItems) obj;
        return Objects.equals(this.engineId, that.engineId) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.v1Compatible, that.v1Compatible) && Objects.equals(this.runUser, that.runUser)
            && Objects.equals(this.imageInfo, that.imageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId, engineName, engineVersion, v1Compatible, runUser, imageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginesItems {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    v1Compatible: ").append(toIndentedString(v1Compatible)).append("\n");
        sb.append("    runUser: ").append(toIndentedString(runUser)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
