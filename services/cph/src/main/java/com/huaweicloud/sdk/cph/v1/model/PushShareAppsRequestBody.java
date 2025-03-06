package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PushShareAppsRequestBody
 */
public class PushShareAppsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_install_app")

    private Integer preInstallApp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_path")

    private String objectPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    public PushShareAppsRequestBody withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 合法的应用包名。
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public PushShareAppsRequestBody withPreInstallApp(Integer preInstallApp) {
        this.preInstallApp = preInstallApp;
        return this;
    }

    /**
     * 是否预装应用。 - 1：预装 - 0：不预装；默认不预装
     * minimum: -128
     * maximum: 128
     * @return preInstallApp
     */
    public Integer getPreInstallApp() {
        return preInstallApp;
    }

    public void setPreInstallApp(Integer preInstallApp) {
        this.preInstallApp = preInstallApp;
    }

    public PushShareAppsRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点组成
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public PushShareAppsRequestBody withObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }

    /**
     * 合法的OBS对象key，最大长度1024字符。仅支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号等这些字符。 推送的文件只支持tar文件类型。推送时，按tar文件解压后的文件目录结构推送到手机。
     * @return objectPath
     */
    public String getObjectPath() {
        return objectPath;
    }

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    public PushShareAppsRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public PushShareAppsRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public PushShareAppsRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云手机服务器ID列表。传入的服务器id个数范围为[1, 100]。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushShareAppsRequestBody that = (PushShareAppsRequestBody) obj;
        return Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.preInstallApp, that.preInstallApp)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectPath, that.objectPath)
            && Objects.equals(this.serverIds, that.serverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, preInstallApp, bucketName, objectPath, serverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushShareAppsRequestBody {\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    preInstallApp: ").append(toIndentedString(preInstallApp)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectPath: ").append(toIndentedString(objectPath)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
