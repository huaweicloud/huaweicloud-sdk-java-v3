package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePtrRequestBody
 */
public class UpdatePtrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptrdnames")

    private List<String> ptrdnames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    public UpdatePtrRequestBody withPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
        return this;
    }

    public UpdatePtrRequestBody addPtrdnamesItem(String ptrdnamesItem) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        this.ptrdnames.add(ptrdnamesItem);
        return this;
    }

    public UpdatePtrRequestBody withPtrdnames(Consumer<List<String>> ptrdnamesSetter) {
        if (this.ptrdnames == null) {
            this.ptrdnames = new ArrayList<>();
        }
        ptrdnamesSetter.accept(this.ptrdnames);
        return this;
    }

    /**
     * 反向解析记录对应的域名列表，最大个数不超过10个。
     * @return ptrdnames
     */
    public List<String> getPtrdnames() {
        return ptrdnames;
    }

    public void setPtrdnames(List<String> ptrdnames) {
        this.ptrdnames = ptrdnames;
    }

    public UpdatePtrRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对反向解析记录的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePtrRequestBody withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 反向解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。取值范围：1～2147483647
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePtrRequestBody that = (UpdatePtrRequestBody) obj;
        return Objects.equals(this.ptrdnames, that.ptrdnames) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ttl, that.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptrdnames, description, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePtrRequestBody {\n");
        sb.append("    ptrdnames: ").append(toIndentedString(ptrdnames)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
