package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CertificateBody */
public class CertificateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_status")

    private Integer expStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_host")

    private List<BindHost> bindHost = null;

    public CertificateBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 证书id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 证书名
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CertificateBody withContent(String content) {
        this.content = content;
        return this;
    }

    /** 证书文件，PEM编码
     * 
     * @return content */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CertificateBody withKey(String key) {
        this.key = key;
        return this;
    }

    /** 证书私钥，PEM编码
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CertificateBody withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 证书过期时间戳
     * 
     * @return expireTime */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public CertificateBody withExpStatus(Integer expStatus) {
        this.expStatus = expStatus;
        return this;
    }

    /** 证书过期状态，0-未过期，1-已过期，2-即将过期（一个月内即将过期）
     * 
     * @return expStatus */
    public Integer getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(Integer expStatus) {
        this.expStatus = expStatus;
    }

    public CertificateBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 证书上传时间戳
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CertificateBody withBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
        return this;
    }

    public CertificateBody addBindHostItem(BindHost bindHostItem) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        this.bindHost.add(bindHostItem);
        return this;
    }

    public CertificateBody withBindHost(Consumer<List<BindHost>> bindHostSetter) {
        if (this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        bindHostSetter.accept(this.bindHost);
        return this;
    }

    /** 证书关联的域名信息
     * 
     * @return bindHost */
    public List<BindHost> getBindHost() {
        return bindHost;
    }

    public void setBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateBody certificateBody = (CertificateBody) o;
        return Objects.equals(this.id, certificateBody.id) && Objects.equals(this.name, certificateBody.name)
            && Objects.equals(this.content, certificateBody.content) && Objects.equals(this.key, certificateBody.key)
            && Objects.equals(this.expireTime, certificateBody.expireTime)
            && Objects.equals(this.expStatus, certificateBody.expStatus)
            && Objects.equals(this.timestamp, certificateBody.timestamp)
            && Objects.equals(this.bindHost, certificateBody.bindHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, content, key, expireTime, expStatus, timestamp, bindHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    expStatus: ").append(toIndentedString(expStatus)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    bindHost: ").append(toIndentedString(bindHost)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
