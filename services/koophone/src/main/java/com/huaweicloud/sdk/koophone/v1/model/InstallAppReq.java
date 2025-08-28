package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstallAppReq
 */
public class InstallAppReq {

    /**
     * 安装类型。0：普通安装，1：快速安装
     */
    public static final class FastInstallEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final FastInstallEnum _0 = new FastInstallEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final FastInstallEnum _1 = new FastInstallEnum("1");

        private static final Map<String, FastInstallEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FastInstallEnum> createStaticFields() {
            Map<String, FastInstallEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FastInstallEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FastInstallEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FastInstallEnum(value));
        }

        public static FastInstallEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FastInstallEnum) {
                return this.value.equals(((FastInstallEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fast_install")

    private FastInstallEnum fastInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_version")

    private String objectVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_size")

    private String objectSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private String bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_md5")

    private String contentMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_package_url")

    private String installPackageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id_list")

    private List<String> instanceIdList = null;

    public InstallAppReq withFastInstall(FastInstallEnum fastInstall) {
        this.fastInstall = fastInstall;
        return this;
    }

    /**
     * 安装类型。0：普通安装，1：快速安装
     * @return fastInstall
     */
    public FastInstallEnum getFastInstall() {
        return fastInstall;
    }

    public void setFastInstall(FastInstallEnum fastInstall) {
        this.fastInstall = fastInstall;
    }

    public InstallAppReq withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 安装后的应用包名，示例：com.tencent.mm
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public InstallAppReq withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称（包括后缀），示例：meituan.apk
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InstallAppReq withObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
        return this;
    }

    /**
     * 应用包版本号，示例：8.0.58
     * @return objectVersion
     */
    public String getObjectVersion() {
        return objectVersion;
    }

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    public InstallAppReq withObjectSize(String objectSize) {
        this.objectSize = objectSize;
        return this;
    }

    /**
     * 应用大小，示例：120，单位MB
     * @return objectSize
     */
    public String getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(String objectSize) {
        this.objectSize = objectSize;
    }

    public InstallAppReq withBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 安装包类型，示例：apk，目前只支持apk应用安装
     * @return bizType
     */
    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public InstallAppReq withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 传输方式，1：obs，目前只支持obs下载，示例：application/octet-stream
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public InstallAppReq withContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }

    /**
     * apk文件的md5值校验，不為空即可，示例:fghfg
     * @return contentMd5
     */
    public String getContentMd5() {
        return contentMd5;
    }

    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    public InstallAppReq withInstallPackageUrl(String installPackageUrl) {
        this.installPackageUrl = installPackageUrl;
        return this;
    }

    /**
     * apk包的obs下载链接url
     * @return installPackageUrl
     */
    public String getInstallPackageUrl() {
        return installPackageUrl;
    }

    public void setInstallPackageUrl(String installPackageUrl) {
        this.installPackageUrl = installPackageUrl;
    }

    public InstallAppReq withInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public InstallAppReq addInstanceIdListItem(String instanceIdListItem) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        this.instanceIdList.add(instanceIdListItem);
        return this;
    }

    public InstallAppReq withInstanceIdList(Consumer<List<String>> instanceIdListSetter) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        instanceIdListSetter.accept(this.instanceIdList);
        return this;
    }

    /**
     * 云机实例列表
     * @return instanceIdList
     */
    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstallAppReq that = (InstallAppReq) obj;
        return Objects.equals(this.fastInstall, that.fastInstall) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.objectVersion, that.objectVersion)
            && Objects.equals(this.objectSize, that.objectSize) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.contentType, that.contentType) && Objects.equals(this.contentMd5, that.contentMd5)
            && Objects.equals(this.installPackageUrl, that.installPackageUrl)
            && Objects.equals(this.instanceIdList, that.instanceIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fastInstall,
            objectName,
            fileName,
            objectVersion,
            objectSize,
            bizType,
            contentType,
            contentMd5,
            installPackageUrl,
            instanceIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallAppReq {\n");
        sb.append("    fastInstall: ").append(toIndentedString(fastInstall)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
        sb.append("    objectSize: ").append(toIndentedString(objectSize)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
        sb.append("    installPackageUrl: ").append(toIndentedString(installPackageUrl)).append("\n");
        sb.append("    instanceIdList: ").append(toIndentedString(instanceIdList)).append("\n");
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
