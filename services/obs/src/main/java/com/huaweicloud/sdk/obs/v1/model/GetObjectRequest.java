package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "GetObjectRequest")
public class GetObjectRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-content-type")

    @JacksonXmlProperty(localName = "response-content-type")

    private String responseContentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-content-language")

    @JacksonXmlProperty(localName = "response-content-language")

    private String responseContentLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-expires")

    @JacksonXmlProperty(localName = "response-expires")

    private String responseExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-cache-control")

    @JacksonXmlProperty(localName = "response-cache-control")

    private String responseCacheControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-content-disposition")

    @JacksonXmlProperty(localName = "response-content-disposition")

    private String responseContentDisposition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response-content-encoding")

    @JacksonXmlProperty(localName = "response-content-encoding")

    private String responseContentEncoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionId")

    @JacksonXmlProperty(localName = "versionId")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-image-process")

    @JacksonXmlProperty(localName = "x-image-process")

    private String xImageProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attname")

    @JacksonXmlProperty(localName = "attname")

    private String attname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Range")

    @JacksonXmlProperty(localName = "Range")

    private String range;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "If-Modified-Since")

    @JacksonXmlProperty(localName = "If-Modified-Since")

    private String ifModifiedSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "If-Unmodified-Since")

    @JacksonXmlProperty(localName = "If-Unmodified-Since")

    private String ifUnmodifiedSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "If-Match")

    @JacksonXmlProperty(localName = "If-Match")

    private String ifMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "If-None-Match")

    @JacksonXmlProperty(localName = "If-None-Match")

    private String ifNoneMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key")

    private String xObsServerSideEncryptionCustomerKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public GetObjectRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public GetObjectRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 通过此请求下载的对象名称。 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public GetObjectRequest withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 请求发起端的日期和时间，例如：Wed, 27 Jun 2018 13:39:15 +0000。 默认值：无。 条件：如果消息头中带了x-obs-date字段，则可以不带该字段，其他情况下必选。 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public GetObjectRequest withResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }

    /**
     * 重写响应中的Content-Type头。 
     * @return responseContentType
     */
    public String getResponseContentType() {
        return responseContentType;
    }

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    public GetObjectRequest withResponseContentLanguage(String responseContentLanguage) {
        this.responseContentLanguage = responseContentLanguage;
        return this;
    }

    /**
     * 重写响应中的Content-Language头。 
     * @return responseContentLanguage
     */
    public String getResponseContentLanguage() {
        return responseContentLanguage;
    }

    public void setResponseContentLanguage(String responseContentLanguage) {
        this.responseContentLanguage = responseContentLanguage;
    }

    public GetObjectRequest withResponseExpires(String responseExpires) {
        this.responseExpires = responseExpires;
        return this;
    }

    /**
     * 重写响应中的Expires头。 
     * @return responseExpires
     */
    public String getResponseExpires() {
        return responseExpires;
    }

    public void setResponseExpires(String responseExpires) {
        this.responseExpires = responseExpires;
    }

    public GetObjectRequest withResponseCacheControl(String responseCacheControl) {
        this.responseCacheControl = responseCacheControl;
        return this;
    }

    /**
     * 重写响应中的Cache-Control头。 
     * @return responseCacheControl
     */
    public String getResponseCacheControl() {
        return responseCacheControl;
    }

    public void setResponseCacheControl(String responseCacheControl) {
        this.responseCacheControl = responseCacheControl;
    }

    public GetObjectRequest withResponseContentDisposition(String responseContentDisposition) {
        this.responseContentDisposition = responseContentDisposition;
        return this;
    }

    /**
     * 重写响应中的Content-Disposition头。  示例：response-content-disposition=attachment; filename*=utf-8''name1  下载对象重命名为“name1”，如果name1中存在中文，需要将中文进行URL编码。 
     * @return responseContentDisposition
     */
    public String getResponseContentDisposition() {
        return responseContentDisposition;
    }

    public void setResponseContentDisposition(String responseContentDisposition) {
        this.responseContentDisposition = responseContentDisposition;
    }

    public GetObjectRequest withResponseContentEncoding(String responseContentEncoding) {
        this.responseContentEncoding = responseContentEncoding;
        return this;
    }

    /**
     * 重写响应中的Content-Encoding头。 
     * @return responseContentEncoding
     */
    public String getResponseContentEncoding() {
        return responseContentEncoding;
    }

    public void setResponseContentEncoding(String responseContentEncoding) {
        this.responseContentEncoding = responseContentEncoding;
    }

    public GetObjectRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 指定获取对象的版本号。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public GetObjectRequest withXImageProcess(String xImageProcess) {
        this.xImageProcess = xImageProcess;
        return this;
    }

    /**
     * 图片处理服务。  示例：  命令方式：x-image-process=image/commands  样式方式：x-image-process=style/stylename  详见[《图片处理特性指南》](https://support.huaweicloud.com/usermanual-obs/obs_01_0001.html)。 
     * @return xImageProcess
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-image-process")
    public String getXImageProcess() {
        return xImageProcess;
    }

    public void setXImageProcess(String xImageProcess) {
        this.xImageProcess = xImageProcess;
    }

    public GetObjectRequest withAttname(String attname) {
        this.attname = attname;
        return this;
    }

    /**
     * 重写响应中的Content-Disposition头。  示例：attname=name1  下载对象重命名为“name1”。 
     * @return attname
     */
    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public GetObjectRequest withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * 获取对象时，获取在Range范围内的对象内容。如果Range不合法则忽略此字段获取整个对象。  Range是一个范围，它的起始值最小为0，最大为对象长度减1。Range范围的起始值为必填项，如果Range只包含起始值，表示获取起始值到对象长度减1这个区间的对象内容。  携带Range头域后，响应消息的ETag仍是对象的ETag，而不是Range范围内对象的ETag。  bytes=byte_range  示例1：bytes=0-4 示例2：bytes=1024 示例3：bytes=10-20,30-40（表示多个区间） 
     * @return range
     */
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public GetObjectRequest withIfModifiedSince(String ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
        return this;
    }

    /**
     * 如果对象在请求中指定的时间之后有修改，则返回对象内容；否则的话返回304（not modified）。  类型：符合http://www.ietf.org/rfc/rfc2616.txt规定格式的HTTP时间字符串。 
     * @return ifModifiedSince
     */
    public String getIfModifiedSince() {
        return ifModifiedSince;
    }

    public void setIfModifiedSince(String ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
    }

    public GetObjectRequest withIfUnmodifiedSince(String ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        return this;
    }

    /**
     * 如果对象在请求中指定的时间之后没有修改，则返回对象内容；否则的话返回412（precondition failed）。  类型：符合http://www.ietf.org/rfc/rfc2616.txt规定格式的HTTP时间字符串。 
     * @return ifUnmodifiedSince
     */
    public String getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    public void setIfUnmodifiedSince(String ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
    }

    public GetObjectRequest withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * 如果对象的ETag和请求中指定的ETag相同，则返回对象内容，否则的话返回412（precondition failed）。  （ETag值，例：0f64741bf7cb1089e988e4585d0d3434。） 
     * @return ifMatch
     */
    public String getIfMatch() {
        return ifMatch;
    }

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    public GetObjectRequest withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    /**
     * 如果对象的ETag和请求中指定的ETag不相同，则返回对象内容，否则的话返回304（not modified）。  （ETag值，例：0f64741bf7cb1089e988e4585d0d3434。） 
     * @return ifNoneMatch
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public void setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
    }

    public GetObjectRequest withXObsServerSideEncryptionCustomerAlgorithm(
        String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的算法。  示例：x-obs-server-side-encryption-customer-algorithm：AES256  约束：需要和x-obs-server-side-encryption-customer-key， x-obs-server-side-encryption-customer-key-MD5一起使用。 
     * @return xObsServerSideEncryptionCustomerAlgorithm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")
    public String getXObsServerSideEncryptionCustomerAlgorithm() {
        return xObsServerSideEncryptionCustomerAlgorithm;
    }

    public void setXObsServerSideEncryptionCustomerAlgorithm(String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
    }

    public GetObjectRequest withXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的密钥。该密钥用于解密对象。  示例：x-obs-server-side-encryption-customer-key:K7QkYpBkM5+hca27fsNkUnNVaobncnLht/rCB2o/9Cw=  约束：该头域由256-bit的密钥经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key-MD5一起使用。 
     * @return xObsServerSideEncryptionCustomerKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")
    public String getXObsServerSideEncryptionCustomerKey() {
        return xObsServerSideEncryptionCustomerKey;
    }

    public void setXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
    }

    public GetObjectRequest withXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的密钥的MD5值。MD5值用于验证密钥传输过程中没有出错。  示例：x-obs-server-side-encryption-customer-key-MD5:4XvB3tbNTN+tIEVa0/fGaQ==  约束：该头域由密钥的128-bit MD5值经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key一起使用。 
     * @return xObsServerSideEncryptionCustomerKeyMD5
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")
    public String getXObsServerSideEncryptionCustomerKeyMD5() {
        return xObsServerSideEncryptionCustomerKeyMD5;
    }

    public void setXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetObjectRequest that = (GetObjectRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectKey, that.objectKey)
            && Objects.equals(this.date, that.date)
            && Objects.equals(this.responseContentType, that.responseContentType)
            && Objects.equals(this.responseContentLanguage, that.responseContentLanguage)
            && Objects.equals(this.responseExpires, that.responseExpires)
            && Objects.equals(this.responseCacheControl, that.responseCacheControl)
            && Objects.equals(this.responseContentDisposition, that.responseContentDisposition)
            && Objects.equals(this.responseContentEncoding, that.responseContentEncoding)
            && Objects.equals(this.versionId, that.versionId) && Objects.equals(this.xImageProcess, that.xImageProcess)
            && Objects.equals(this.attname, that.attname) && Objects.equals(this.range, that.range)
            && Objects.equals(this.ifModifiedSince, that.ifModifiedSince)
            && Objects.equals(this.ifUnmodifiedSince, that.ifUnmodifiedSince)
            && Objects.equals(this.ifMatch, that.ifMatch) && Objects.equals(this.ifNoneMatch, that.ifNoneMatch)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKey, that.xObsServerSideEncryptionCustomerKey)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName,
            objectKey,
            date,
            responseContentType,
            responseContentLanguage,
            responseExpires,
            responseCacheControl,
            responseContentDisposition,
            responseContentEncoding,
            versionId,
            xImageProcess,
            attname,
            range,
            ifModifiedSince,
            ifUnmodifiedSince,
            ifMatch,
            ifNoneMatch,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsServerSideEncryptionCustomerKey,
            xObsServerSideEncryptionCustomerKeyMD5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetObjectRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    responseContentType: ").append(toIndentedString(responseContentType)).append("\n");
        sb.append("    responseContentLanguage: ").append(toIndentedString(responseContentLanguage)).append("\n");
        sb.append("    responseExpires: ").append(toIndentedString(responseExpires)).append("\n");
        sb.append("    responseCacheControl: ").append(toIndentedString(responseCacheControl)).append("\n");
        sb.append("    responseContentDisposition: ").append(toIndentedString(responseContentDisposition)).append("\n");
        sb.append("    responseContentEncoding: ").append(toIndentedString(responseContentEncoding)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    xImageProcess: ").append(toIndentedString(xImageProcess)).append("\n");
        sb.append("    attname: ").append(toIndentedString(attname)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    ifModifiedSince: ").append(toIndentedString(ifModifiedSince)).append("\n");
        sb.append("    ifUnmodifiedSince: ").append(toIndentedString(ifUnmodifiedSince)).append("\n");
        sb.append("    ifMatch: ").append(toIndentedString(ifMatch)).append("\n");
        sb.append("    ifNoneMatch: ").append(toIndentedString(ifNoneMatch)).append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKey: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKey))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
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
