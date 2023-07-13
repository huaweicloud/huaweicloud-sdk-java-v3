package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建经典型跨源连接的请求body体。
 */
public class CreateDatasourceConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTagEntity> tags = null;

    public CreateDatasourceConnectionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatasourceConnectionReq withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 服务名称，目前为CloudTable.OpenTSDB/CloudTable，MRS.OPENTSDB，DWS，RDS，CSS。 说明： 大小写不敏感。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public CreateDatasourceConnectionReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     *   用户指定安全组ID，即为需要建立连接的服务所在的安全组。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateDatasourceConnectionReq withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 对应服务的子网网络ID，即为需要建立连接的服务所在的子网。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public CreateDatasourceConnectionReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 对应服务对外提供的访问url。长度不能超过512个字符。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateDatasourceConnectionReq withTags(List<TmsTagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDatasourceConnectionReq addTagsItem(TmsTagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDatasourceConnectionReq withTags(Consumer<List<TmsTagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<TmsTagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagEntity> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatasourceConnectionReq that = (CreateDatasourceConnectionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.service, that.service)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.url, that.url)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, service, securityGroupId, networkId, url, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatasourceConnectionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
