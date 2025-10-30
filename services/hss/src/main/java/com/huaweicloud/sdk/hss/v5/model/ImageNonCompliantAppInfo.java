package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageNonCompliantAppInfo
 */
public class ImageNonCompliantAppInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_digest")

    private String layerDigest;

    public ImageNonCompliantAppInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: id **取值范围**: 字符长度0-128位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageNonCompliantAppInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 不合规软件名称 **取值范围**: 字符长度0-128位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ImageNonCompliantAppInfo withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * **参数解释**: 不合规软件路径 **取值范围**: 字符长度0-128位 
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public ImageNonCompliantAppInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**: 不合规软件版本 **取值范围**: 字符长度0-64位 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ImageNonCompliantAppInfo withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
        return this;
    }

    /**
     * **参数解释**: 层digest **取值范围**: 字符长度0-128位 
     * @return layerDigest
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageNonCompliantAppInfo that = (ImageNonCompliantAppInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.appPath, that.appPath) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.layerDigest, that.layerDigest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appName, appPath, appVersion, layerDigest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageNonCompliantAppInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    layerDigest: ").append(toIndentedString(layerDigest)).append("\n");
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
