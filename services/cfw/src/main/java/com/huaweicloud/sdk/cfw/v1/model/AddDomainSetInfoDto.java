package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddDomainSetInfoDto
 */
public class AddDomainSetInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_names")

    private List<DomainSetInfoDto> domainNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_set_type")

    private Integer domainSetType;

    public AddDomainSetInfoDto withFwInstanceId(String fwInstanceId) {
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

    public AddDomainSetInfoDto withObjectId(String objectId) {
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

    public AddDomainSetInfoDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddDomainSetInfoDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDomainSetInfoDto withDomainNames(List<DomainSetInfoDto> domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    public AddDomainSetInfoDto addDomainNamesItem(DomainSetInfoDto domainNamesItem) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        this.domainNames.add(domainNamesItem);
        return this;
    }

    public AddDomainSetInfoDto withDomainNames(Consumer<List<DomainSetInfoDto>> domainNamesSetter) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        domainNamesSetter.accept(this.domainNames);
        return this;
    }

    /**
     * 域名信息列表
     * @return domainNames
     */
    public List<DomainSetInfoDto> getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(List<DomainSetInfoDto> domainNames) {
        this.domainNames = domainNames;
    }

    public AddDomainSetInfoDto withDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
        return this;
    }

    /**
     * 域名组类型，0表示应用域名组，1表示网络域名组
     * @return domainSetType
     */
    public Integer getDomainSetType() {
        return domainSetType;
    }

    public void setDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDomainSetInfoDto that = (AddDomainSetInfoDto) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.domainNames, that.domainNames)
            && Objects.equals(this.domainSetType, that.domainSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, objectId, name, description, domainNames, domainSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDomainSetInfoDto {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    domainSetType: ").append(toIndentedString(domainSetType)).append("\n");
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
