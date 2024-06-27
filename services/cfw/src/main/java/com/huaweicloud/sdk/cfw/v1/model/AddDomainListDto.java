package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddDomainListDto
 */
public class AddDomainListDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_names")

    private List<DomainSetInfoDto> domainNames = null;

    public AddDomainListDto withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，默认情况下，fw_instance_Id为空时，返回账号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public AddDomainListDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，type为0的为互联网边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AddDomainListDto withDomainNames(List<DomainSetInfoDto> domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    public AddDomainListDto addDomainNamesItem(DomainSetInfoDto domainNamesItem) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        this.domainNames.add(domainNamesItem);
        return this;
    }

    public AddDomainListDto withDomainNames(Consumer<List<DomainSetInfoDto>> domainNamesSetter) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        domainNamesSetter.accept(this.domainNames);
        return this;
    }

    /**
     * 域名列表
     * @return domainNames
     */
    public List<DomainSetInfoDto> getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(List<DomainSetInfoDto> domainNames) {
        this.domainNames = domainNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDomainListDto that = (AddDomainListDto) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.domainNames, that.domainNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, objectId, domainNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDomainListDto {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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
