package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 路由表详情
 */
public class Routetable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    @JacksonXmlProperty(localName = "subnets")

    private List<BaseId> subnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    @JacksonXmlProperty(localName = "default")

    private Boolean _default;

    public Routetable withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 路由表ID  取值范围：标准UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Routetable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 路由表名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Routetable withSubnets(List<BaseId> subnets) {
        this.subnets = subnets;
        return this;
    }

    public Routetable addSubnetsItem(BaseId subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public Routetable withSubnets(Consumer<List<BaseId>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 路由表所关联的子网  约束：只能关联路由表所属VPC下的子网
     * @return subnets
     */
    public List<BaseId> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<BaseId> subnets) {
        this.subnets = subnets;
    }

    public Routetable withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 路由表所在的虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Routetable withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Routetable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由表描述信息  取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Routetable withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为默认路由表  取值范围：true表示默认路由表；false表示自定义路由表
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Routetable routetable = (Routetable) o;
        return Objects.equals(this.id, routetable.id) && Objects.equals(this.name, routetable.name)
            && Objects.equals(this.subnets, routetable.subnets) && Objects.equals(this.vpcId, routetable.vpcId)
            && Objects.equals(this.domainId, routetable.domainId)
            && Objects.equals(this.description, routetable.description)
            && Objects.equals(this._default, routetable._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subnets, vpcId, domainId, description, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Routetable {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
