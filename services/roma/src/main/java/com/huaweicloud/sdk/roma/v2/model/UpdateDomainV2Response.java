package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDomainV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ssl_version")
    
    private String minSslVersion;

    public UpdateDomainV2Response withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    


    /**
     * 自定义域名
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public UpdateDomainV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 自定义域名的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateDomainV2Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 解析状态值
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateDomainV2Response withMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    


    /**
     * 支持的最小SSL版本
     * @return minSslVersion
     */
    public String getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainV2Response updateDomainV2Response = (UpdateDomainV2Response) o;
        return Objects.equals(this.urlDomain, updateDomainV2Response.urlDomain) &&
            Objects.equals(this.id, updateDomainV2Response.id) &&
            Objects.equals(this.status, updateDomainV2Response.status) &&
            Objects.equals(this.minSslVersion, updateDomainV2Response.minSslVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urlDomain, id, status, minSslVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainV2Response {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
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

