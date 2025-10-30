package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MSS频道出流信息
 */
public class MssPackageItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_selection")

    private List<StreamSelectionItem> streamSelection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_duration_seconds")

    private Integer segmentDurationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playlist_window_seconds")

    private Integer playlistWindowSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption")

    private Encryption encryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_args")

    private Object extArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_segment")

    private Integer delaySegment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_args")

    private PackageRequestArgs requestArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_access")

    private Boolean enableAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_all_ip_access")

    private Boolean allowAllIpAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_whitelist")

    private String ipWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdn_identifier_header")

    private HttpHeader cdnIdentifierHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_domain_master")

    private String originDomainMaster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_domain_slave")

    private String originDomainSlave;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_name")

    private String manifestName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_url")

    private String slaveUrl;

    public MssPackageItem withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 客户自定义的拉流地址，包括方法、域名、路径
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MssPackageItem withStreamSelection(List<StreamSelectionItem> streamSelection) {
        this.streamSelection = streamSelection;
        return this;
    }

    public MssPackageItem addStreamSelectionItem(StreamSelectionItem streamSelectionItem) {
        if (this.streamSelection == null) {
            this.streamSelection = new ArrayList<>();
        }
        this.streamSelection.add(streamSelectionItem);
        return this;
    }

    public MssPackageItem withStreamSelection(Consumer<List<StreamSelectionItem>> streamSelectionSetter) {
        if (this.streamSelection == null) {
            this.streamSelection = new ArrayList<>();
        }
        streamSelectionSetter.accept(this.streamSelection);
        return this;
    }

    /**
     * 从全量流中过滤出一个码率在[min, max]区间的流。如果不需要码率过滤可不选。
     * @return streamSelection
     */
    public List<StreamSelectionItem> getStreamSelection() {
        return streamSelection;
    }

    public void setStreamSelection(List<StreamSelectionItem> streamSelection) {
        this.streamSelection = streamSelection;
    }

    public MssPackageItem withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
        return this;
    }

    /**
     * 频道输出分片的时长，为必选项  单位：秒。取值范围：1-10 > 修改分片时长会影响已录制内容的时移和回看服务，请谨慎修改！
     * minimum: 1
     * maximum: 10
     * @return segmentDurationSeconds
     */
    public Integer getSegmentDurationSeconds() {
        return segmentDurationSeconds;
    }

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    public MssPackageItem withPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        this.playlistWindowSeconds = playlistWindowSeconds;
        return this;
    }

    /**
     * 频道直播返回分片的窗口长度，为频道输出分片的时长乘以数量后得到的值。实际返回的分片数不小于3个。  单位：秒。取值范围：0 - 86400（24小时转化成秒后的取值）
     * minimum: 0
     * maximum: 86400
     * @return playlistWindowSeconds
     */
    public Integer getPlaylistWindowSeconds() {
        return playlistWindowSeconds;
    }

    public void setPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        this.playlistWindowSeconds = playlistWindowSeconds;
    }

    public MssPackageItem withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public MssPackageItem withEncryption(Consumer<Encryption> encryptionSetter) {
        if (this.encryption == null) {
            this.encryption = new Encryption();
            encryptionSetter.accept(this.encryption);
        }

        return this;
    }

    /**
     * Get encryption
     * @return encryption
     */
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    public MssPackageItem withExtArgs(Object extArgs) {
        this.extArgs = extArgs;
        return this;
    }

    /**
     * 其他额外参数
     * @return extArgs
     */
    public Object getExtArgs() {
        return extArgs;
    }

    public void setExtArgs(Object extArgs) {
        this.extArgs = extArgs;
    }

    public MssPackageItem withDelaySegment(Integer delaySegment) {
        this.delaySegment = delaySegment;
        return this;
    }

    /**
     * 延播时长，单位秒
     * minimum: 1
     * maximum: 10
     * @return delaySegment
     */
    public Integer getDelaySegment() {
        return delaySegment;
    }

    public void setDelaySegment(Integer delaySegment) {
        this.delaySegment = delaySegment;
    }

    public MssPackageItem withRequestArgs(PackageRequestArgs requestArgs) {
        this.requestArgs = requestArgs;
        return this;
    }

    public MssPackageItem withRequestArgs(Consumer<PackageRequestArgs> requestArgsSetter) {
        if (this.requestArgs == null) {
            this.requestArgs = new PackageRequestArgs();
            requestArgsSetter.accept(this.requestArgs);
        }

        return this;
    }

    /**
     * Get requestArgs
     * @return requestArgs
     */
    public PackageRequestArgs getRequestArgs() {
        return requestArgs;
    }

    public void setRequestArgs(PackageRequestArgs requestArgs) {
        this.requestArgs = requestArgs;
    }

    public MssPackageItem withEnableAccess(Boolean enableAccess) {
        this.enableAccess = enableAccess;
        return this;
    }

    /**
     * 当频道mode是ONLY_OS类型时，允许本输出可以直接从源站拉流，默认：false true：允许output访问 false：禁止output访问
     * @return enableAccess
     */
    public Boolean getEnableAccess() {
        return enableAccess;
    }

    public void setEnableAccess(Boolean enableAccess) {
        this.enableAccess = enableAccess;
    }

    public MssPackageItem withAllowAllIpAccess(Boolean allowAllIpAccess) {
        this.allowAllIpAccess = allowAllIpAccess;
        return this;
    }

    /**
     * 是否放通所有的IP访问，默认：false true：允许所有的IP地址访问，ip_whitelist配置不生效 false：不允许所有的IP地址访问，ip_whitelist生效，仅在ip_whitelist配置的ip地址才能访问
     * @return allowAllIpAccess
     */
    public Boolean getAllowAllIpAccess() {
        return allowAllIpAccess;
    }

    public void setAllowAllIpAccess(Boolean allowAllIpAccess) {
        this.allowAllIpAccess = allowAllIpAccess;
    }

    public MssPackageItem withIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * 当频道类型mode是ONLY_OS类型时，允许直接从源站拉流的IP白名单
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public MssPackageItem withCdnIdentifierHeader(HttpHeader cdnIdentifierHeader) {
        this.cdnIdentifierHeader = cdnIdentifierHeader;
        return this;
    }

    public MssPackageItem withCdnIdentifierHeader(Consumer<HttpHeader> cdnIdentifierHeaderSetter) {
        if (this.cdnIdentifierHeader == null) {
            this.cdnIdentifierHeader = new HttpHeader();
            cdnIdentifierHeaderSetter.accept(this.cdnIdentifierHeader);
        }

        return this;
    }

    /**
     * Get cdnIdentifierHeader
     * @return cdnIdentifierHeader
     */
    public HttpHeader getCdnIdentifierHeader() {
        return cdnIdentifierHeader;
    }

    public void setCdnIdentifierHeader(HttpHeader cdnIdentifierHeader) {
        this.cdnIdentifierHeader = cdnIdentifierHeader;
    }

    public MssPackageItem withOriginDomainMaster(String originDomainMaster) {
        this.originDomainMaster = originDomainMaster;
        return this;
    }

    /**
     * 源站分发域名-主region 跟CreateOttChannelInfoReq.region一致 满足正则：^(\\[a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.){2,}[a-zA-Z]{2,16}$ 最大长度255
     * @return originDomainMaster
     */
    public String getOriginDomainMaster() {
        return originDomainMaster;
    }

    public void setOriginDomainMaster(String originDomainMaster) {
        this.originDomainMaster = originDomainMaster;
    }

    public MssPackageItem withOriginDomainSlave(String originDomainSlave) {
        this.originDomainSlave = originDomainSlave;
        return this;
    }

    /**
     * 源站分发域名-备region 满足正则：^(\\[a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.){2,}[a-zA-Z]{2,16}$ 最大长度255
     * @return originDomainSlave
     */
    public String getOriginDomainSlave() {
        return originDomainSlave;
    }

    public void setOriginDomainSlave(String originDomainSlave) {
        this.originDomainSlave = originDomainSlave;
    }

    public MssPackageItem withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * output的索引文件名字 默认：index 长度：0-128 字符集：大小写字母、数字、\"-\"、\".\"、\"_\"，不能有/路径
     * @return manifestName
     */
    public String getManifestName() {
        return manifestName;
    }

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    public MssPackageItem withSlaveUrl(String slaveUrl) {
        this.slaveUrl = slaveUrl;
        return this;
    }

    /**
     * 客户自定义的拉流地址，包括方法、域名、路径
     * @return slaveUrl
     */
    public String getSlaveUrl() {
        return slaveUrl;
    }

    public void setSlaveUrl(String slaveUrl) {
        this.slaveUrl = slaveUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MssPackageItem that = (MssPackageItem) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.streamSelection, that.streamSelection)
            && Objects.equals(this.segmentDurationSeconds, that.segmentDurationSeconds)
            && Objects.equals(this.playlistWindowSeconds, that.playlistWindowSeconds)
            && Objects.equals(this.encryption, that.encryption) && Objects.equals(this.extArgs, that.extArgs)
            && Objects.equals(this.delaySegment, that.delaySegment)
            && Objects.equals(this.requestArgs, that.requestArgs)
            && Objects.equals(this.enableAccess, that.enableAccess)
            && Objects.equals(this.allowAllIpAccess, that.allowAllIpAccess)
            && Objects.equals(this.ipWhitelist, that.ipWhitelist)
            && Objects.equals(this.cdnIdentifierHeader, that.cdnIdentifierHeader)
            && Objects.equals(this.originDomainMaster, that.originDomainMaster)
            && Objects.equals(this.originDomainSlave, that.originDomainSlave)
            && Objects.equals(this.manifestName, that.manifestName) && Objects.equals(this.slaveUrl, that.slaveUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            streamSelection,
            segmentDurationSeconds,
            playlistWindowSeconds,
            encryption,
            extArgs,
            delaySegment,
            requestArgs,
            enableAccess,
            allowAllIpAccess,
            ipWhitelist,
            cdnIdentifierHeader,
            originDomainMaster,
            originDomainSlave,
            manifestName,
            slaveUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MssPackageItem {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    streamSelection: ").append(toIndentedString(streamSelection)).append("\n");
        sb.append("    segmentDurationSeconds: ").append(toIndentedString(segmentDurationSeconds)).append("\n");
        sb.append("    playlistWindowSeconds: ").append(toIndentedString(playlistWindowSeconds)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    extArgs: ").append(toIndentedString(extArgs)).append("\n");
        sb.append("    delaySegment: ").append(toIndentedString(delaySegment)).append("\n");
        sb.append("    requestArgs: ").append(toIndentedString(requestArgs)).append("\n");
        sb.append("    enableAccess: ").append(toIndentedString(enableAccess)).append("\n");
        sb.append("    allowAllIpAccess: ").append(toIndentedString(allowAllIpAccess)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("    cdnIdentifierHeader: ").append(toIndentedString(cdnIdentifierHeader)).append("\n");
        sb.append("    originDomainMaster: ").append(toIndentedString(originDomainMaster)).append("\n");
        sb.append("    originDomainSlave: ").append(toIndentedString(originDomainSlave)).append("\n");
        sb.append("    manifestName: ").append(toIndentedString(manifestName)).append("\n");
        sb.append("    slaveUrl: ").append(toIndentedString(slaveUrl)).append("\n");
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
