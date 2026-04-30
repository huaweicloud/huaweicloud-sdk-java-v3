package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCcspClusterListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ShowCcspClusterListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定查询返回记录条数，默认值10
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowCcspClusterListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，从offset指定的下一条数据开始查询默认值为0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowCcspClusterListRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCcspClusterListRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 集群所属的服务类型： - **ENCRYPT_DECRYPT** : 加解密服务； - **SIGN_VERIFY** : 签名验签服务； - **KMS** : 密钥管理服务； - **TIMESTAMP** : 时间戳服务； - **COLLA_SIGN** : 协同签名服务； - **OTP** : 动态令牌服务； - **DB_ENCRYPT** : 数据库加密服务； - **FILE_ENCRYPT** : 文件加密服务 - **TIMESTAMP** : 时间戳服务； - **DIGIT_SEAL** : 电子签章服务； - **SSL_VPN** : ssl vpn服务；
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowCcspClusterListRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序属性，目前支持以下属性： - **create_time** : 集群的创建时间（默认）
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ShowCcspClusterListRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方向，支持以下值： - **DESC** : 降序（默认） - **ASC** : 升序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCcspClusterListRequest that = (ShowCcspClusterListRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.name, that.name) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, name, serviceType, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCcspClusterListRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
