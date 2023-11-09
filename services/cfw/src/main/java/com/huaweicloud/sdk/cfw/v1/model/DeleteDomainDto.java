package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteDomainDto
 */
public class DeleteDomainDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_address_ids")

    private List<String> domainAddressIds = null;

    public DeleteDomainDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public DeleteDomainDto withDomainAddressIds(List<String> domainAddressIds) {
        this.domainAddressIds = domainAddressIds;
        return this;
    }

    public DeleteDomainDto addDomainAddressIdsItem(String domainAddressIdsItem) {
        if (this.domainAddressIds == null) {
            this.domainAddressIds = new ArrayList<>();
        }
        this.domainAddressIds.add(domainAddressIdsItem);
        return this;
    }

    public DeleteDomainDto withDomainAddressIds(Consumer<List<String>> domainAddressIdsSetter) {
        if (this.domainAddressIds == null) {
            this.domainAddressIds = new ArrayList<>();
        }
        domainAddressIdsSetter.accept(this.domainAddressIds);
        return this;
    }

    /**
     * 域名地址组
     * @return domainAddressIds
     */
    public List<String> getDomainAddressIds() {
        return domainAddressIds;
    }

    public void setDomainAddressIds(List<String> domainAddressIds) {
        this.domainAddressIds = domainAddressIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDomainDto that = (DeleteDomainDto) obj;
        return Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.domainAddressIds, that.domainAddressIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, domainAddressIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDomainDto {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    domainAddressIds: ").append(toIndentedString(domainAddressIds)).append("\n");
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
