package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ThreatIntelProperties
 */
public class ThreatIntelProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_md5")

    private String fileMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_sha1")

    private String fileSha1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_sha256")

    private String fileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_class")

    private String fileClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_family")

    private String fileFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_maltype")

    private String fileMaltype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_resolves_to_refs")

    private String ipResolvesToRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belongs_to_refs")

    private String belongsToRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_location")

    private String ipLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_family")

    private String domainFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_resolves_to_refs")

    private String domainResolvesToRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_dns_type")

    private String domainDnsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_host")

    private String urlHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_resolves_to_refs")

    private String urlResolvesToRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_belongs_to_ref")

    private String urlBelongsToRef;

    public ThreatIntelProperties withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * 恶意软件Md5。
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public ThreatIntelProperties withFileSha1(String fileSha1) {
        this.fileSha1 = fileSha1;
        return this;
    }

    /**
     * 恶意软件Sha1。
     * @return fileSha1
     */
    public String getFileSha1() {
        return fileSha1;
    }

    public void setFileSha1(String fileSha1) {
        this.fileSha1 = fileSha1;
    }

    public ThreatIntelProperties withFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    /**
     * 恶意软件Sha256值。
     * @return fileSha256
     */
    public String getFileSha256() {
        return fileSha256;
    }

    public void setFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
    }

    public ThreatIntelProperties withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ThreatIntelProperties withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 编译时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ThreatIntelProperties withFileClass(String fileClass) {
        this.fileClass = fileClass;
        return this;
    }

    /**
     * 文件类别，TEXT|XCODE。
     * @return fileClass
     */
    public String getFileClass() {
        return fileClass;
    }

    public void setFileClass(String fileClass) {
        this.fileClass = fileClass;
    }

    public ThreatIntelProperties withFileFamily(String fileFamily) {
        this.fileFamily = fileFamily;
        return this;
    }

    /**
     * 家族，例如：wannacry（勒索软件）。
     * @return fileFamily
     */
    public String getFileFamily() {
        return fileFamily;
    }

    public void setFileFamily(String fileFamily) {
        this.fileFamily = fileFamily;
    }

    public ThreatIntelProperties withFileMaltype(String fileMaltype) {
        this.fileMaltype = fileMaltype;
        return this;
    }

    /**
     * 类别，例如：trojan（特洛伊）。
     * @return fileMaltype
     */
    public String getFileMaltype() {
        return fileMaltype;
    }

    public void setFileMaltype(String fileMaltype) {
        this.fileMaltype = fileMaltype;
    }

    public ThreatIntelProperties withIpResolvesToRefs(String ipResolvesToRefs) {
        this.ipResolvesToRefs = ipResolvesToRefs;
        return this;
    }

    /**
     * mac地址。
     * @return ipResolvesToRefs
     */
    public String getIpResolvesToRefs() {
        return ipResolvesToRefs;
    }

    public void setIpResolvesToRefs(String ipResolvesToRefs) {
        this.ipResolvesToRefs = ipResolvesToRefs;
    }

    public ThreatIntelProperties withBelongsToRefs(String belongsToRefs) {
        this.belongsToRefs = belongsToRefs;
        return this;
    }

    /**
     * IP AS 自治系统。
     * @return belongsToRefs
     */
    public String getBelongsToRefs() {
        return belongsToRefs;
    }

    public void setBelongsToRefs(String belongsToRefs) {
        this.belongsToRefs = belongsToRefs;
    }

    public ThreatIntelProperties withIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
        return this;
    }

    /**
     * 地区 格式：country/provice/city/lngwgs/latwgs。
     * @return ipLocation
     */
    public String getIpLocation() {
        return ipLocation;
    }

    public void setIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
    }

    public ThreatIntelProperties withDomainFamily(String domainFamily) {
        this.domainFamily = domainFamily;
        return this;
    }

    /**
     * 例如：banjori|iodine。
     * @return domainFamily
     */
    public String getDomainFamily() {
        return domainFamily;
    }

    public void setDomainFamily(String domainFamily) {
        this.domainFamily = domainFamily;
    }

    public ThreatIntelProperties withDomainResolvesToRefs(String domainResolvesToRefs) {
        this.domainResolvesToRefs = domainResolvesToRefs;
        return this;
    }

    /**
     * 解析的IP地址。
     * @return domainResolvesToRefs
     */
    public String getDomainResolvesToRefs() {
        return domainResolvesToRefs;
    }

    public void setDomainResolvesToRefs(String domainResolvesToRefs) {
        this.domainResolvesToRefs = domainResolvesToRefs;
    }

    public ThreatIntelProperties withDomainDnsType(String domainDnsType) {
        this.domainDnsType = domainDnsType;
        return this;
    }

    /**
     * DNS类别。A|NS|CNAME|TXT。
     * @return domainDnsType
     */
    public String getDomainDnsType() {
        return domainDnsType;
    }

    public void setDomainDnsType(String domainDnsType) {
        this.domainDnsType = domainDnsType;
    }

    public ThreatIntelProperties withUrlHost(String urlHost) {
        this.urlHost = urlHost;
        return this;
    }

    /**
     * 例：3ms.huawei.com。
     * @return urlHost
     */
    public String getUrlHost() {
        return urlHost;
    }

    public void setUrlHost(String urlHost) {
        this.urlHost = urlHost;
    }

    public ThreatIntelProperties withUrlResolvesToRefs(String urlResolvesToRefs) {
        this.urlResolvesToRefs = urlResolvesToRefs;
        return this;
    }

    /**
     * IP地址。
     * @return urlResolvesToRefs
     */
    public String getUrlResolvesToRefs() {
        return urlResolvesToRefs;
    }

    public void setUrlResolvesToRefs(String urlResolvesToRefs) {
        this.urlResolvesToRefs = urlResolvesToRefs;
    }

    public ThreatIntelProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ThreatIntelProperties withUrlBelongsToRef(String urlBelongsToRef) {
        this.urlBelongsToRef = urlBelongsToRef;
        return this;
    }

    /**
     * 邮箱账户，@之前部分。
     * @return urlBelongsToRef
     */
    public String getUrlBelongsToRef() {
        return urlBelongsToRef;
    }

    public void setUrlBelongsToRef(String urlBelongsToRef) {
        this.urlBelongsToRef = urlBelongsToRef;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreatIntelProperties threatIntelProperties = (ThreatIntelProperties) o;
        return Objects.equals(this.fileMd5, threatIntelProperties.fileMd5)
            && Objects.equals(this.fileSha1, threatIntelProperties.fileSha1)
            && Objects.equals(this.fileSha256, threatIntelProperties.fileSha256)
            && Objects.equals(this.fileName, threatIntelProperties.fileName)
            && Objects.equals(this.createTime, threatIntelProperties.createTime)
            && Objects.equals(this.fileClass, threatIntelProperties.fileClass)
            && Objects.equals(this.fileFamily, threatIntelProperties.fileFamily)
            && Objects.equals(this.fileMaltype, threatIntelProperties.fileMaltype)
            && Objects.equals(this.ipResolvesToRefs, threatIntelProperties.ipResolvesToRefs)
            && Objects.equals(this.belongsToRefs, threatIntelProperties.belongsToRefs)
            && Objects.equals(this.ipLocation, threatIntelProperties.ipLocation)
            && Objects.equals(this.domainFamily, threatIntelProperties.domainFamily)
            && Objects.equals(this.domainResolvesToRefs, threatIntelProperties.domainResolvesToRefs)
            && Objects.equals(this.domainDnsType, threatIntelProperties.domainDnsType)
            && Objects.equals(this.urlHost, threatIntelProperties.urlHost)
            && Objects.equals(this.urlResolvesToRefs, threatIntelProperties.urlResolvesToRefs)
            && Objects.equals(this.displayName, threatIntelProperties.displayName)
            && Objects.equals(this.urlBelongsToRef, threatIntelProperties.urlBelongsToRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileMd5,
            fileSha1,
            fileSha256,
            fileName,
            createTime,
            fileClass,
            fileFamily,
            fileMaltype,
            ipResolvesToRefs,
            belongsToRefs,
            ipLocation,
            domainFamily,
            domainResolvesToRefs,
            domainDnsType,
            urlHost,
            urlResolvesToRefs,
            displayName,
            urlBelongsToRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreatIntelProperties {\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSha1: ").append(toIndentedString(fileSha1)).append("\n");
        sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    fileClass: ").append(toIndentedString(fileClass)).append("\n");
        sb.append("    fileFamily: ").append(toIndentedString(fileFamily)).append("\n");
        sb.append("    fileMaltype: ").append(toIndentedString(fileMaltype)).append("\n");
        sb.append("    ipResolvesToRefs: ").append(toIndentedString(ipResolvesToRefs)).append("\n");
        sb.append("    belongsToRefs: ").append(toIndentedString(belongsToRefs)).append("\n");
        sb.append("    ipLocation: ").append(toIndentedString(ipLocation)).append("\n");
        sb.append("    domainFamily: ").append(toIndentedString(domainFamily)).append("\n");
        sb.append("    domainResolvesToRefs: ").append(toIndentedString(domainResolvesToRefs)).append("\n");
        sb.append("    domainDnsType: ").append(toIndentedString(domainDnsType)).append("\n");
        sb.append("    urlHost: ").append(toIndentedString(urlHost)).append("\n");
        sb.append("    urlResolvesToRefs: ").append(toIndentedString(urlResolvesToRefs)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    urlBelongsToRef: ").append(toIndentedString(urlBelongsToRef)).append("\n");
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
