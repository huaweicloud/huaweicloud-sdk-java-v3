package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Virsubnet
 */
public class Virsubnet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_nameservers")

    private List<String> dnsNameservers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidrs")

    private List<SubnetCidr> subnetCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResponseTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_dhcp_opts")

    private List<SubnetExtraDhcpOpt> extraDhcpOpts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public Virsubnet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 子网的资源ID。子网创建成功后，会生成一个子网 ID，是子网对应的唯一标识。 **取值范围**： 带“-”的标准UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Virsubnet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 子网的名称。 **取值范围**： 1-64个字符，支持数字、字母、中文字符、_(下划线)、-（中划线）、.（点）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Virsubnet withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 子网的描述信息。 **取值范围**： 0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Virsubnet withDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
        return this;
    }

    public Virsubnet addDnsNameserversItem(String dnsNameserversItem) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        this.dnsNameservers.add(dnsNameserversItem);
        return this;
    }

    public Virsubnet withDnsNameservers(Consumer<List<String>> dnsNameserversSetter) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        dnsNameserversSetter.accept(this.dnsNameservers);
        return this;
    }

    /**
     * **参数解释**： 子网的DNS服务器地址列表。 **取值范围**： 不涉及。
     * @return dnsNameservers
     */
    public List<String> getDnsNameservers() {
        return dnsNameservers;
    }

    public void setDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
    }

    public Virsubnet withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释**： 子网的可用区ID。 **取值范围**： 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Virsubnet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 子网所属VPC的资源ID。 **取值范围**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Virsubnet withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 子网的状态。 **取值范围**： - ACTIVE：表示子网已挂载到VPC上。 - UNKNOWN：表示子网还未挂载到VPC上。 - ERROR：表示子网状态故障。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Virsubnet withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 子网所属的项目ID。 **取值范围**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Virsubnet withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**： 子网的作用域（边缘云场景）。 **取值范围**： - center：表示作用域为中心。 - {publicBorderGroup}：表示作用域为具体的公网边界组。公网边界组限制子网的可用区范围，可关联多个边缘可用区。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Virsubnet withSubnetCidrs(List<SubnetCidr> subnetCidrs) {
        this.subnetCidrs = subnetCidrs;
        return this;
    }

    public Virsubnet addSubnetCidrsItem(SubnetCidr subnetCidrsItem) {
        if (this.subnetCidrs == null) {
            this.subnetCidrs = new ArrayList<>();
        }
        this.subnetCidrs.add(subnetCidrsItem);
        return this;
    }

    public Virsubnet withSubnetCidrs(Consumer<List<SubnetCidr>> subnetCidrsSetter) {
        if (this.subnetCidrs == null) {
            this.subnetCidrs = new ArrayList<>();
        }
        subnetCidrsSetter.accept(this.subnetCidrs);
        return this;
    }

    /**
     * **参数解释**： OpenStack Neutron子网信息。 **取值范围**： 不涉及。
     * @return subnetCidrs
     */
    public List<SubnetCidr> getSubnetCidrs() {
        return subnetCidrs;
    }

    public void setSubnetCidrs(List<SubnetCidr> subnetCidrs) {
        this.subnetCidrs = subnetCidrs;
    }

    public Virsubnet withTags(List<ResponseTag> tags) {
        this.tags = tags;
        return this;
    }

    public Virsubnet addTagsItem(ResponseTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Virsubnet withTags(Consumer<List<ResponseTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 子网的标签信息，包括标签键和标签值，可用来分类和标识资源。详情请参见Tag对象。 **取值范围**： 不涉及。
     * @return tags
     */
    public List<ResponseTag> getTags() {
        return tags;
    }

    public void setTags(List<ResponseTag> tags) {
        this.tags = tags;
    }

    public Virsubnet withExtraDhcpOpts(List<SubnetExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    public Virsubnet addExtraDhcpOptsItem(SubnetExtraDhcpOpt extraDhcpOptsItem) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public Virsubnet withExtraDhcpOpts(Consumer<List<SubnetExtraDhcpOpt>> extraDhcpOptsSetter) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * **参数解释**： 子网的DHCP属性，支持配置NTP地址、DNS域名或租约到期时间。 **取值范围**： 不涉及。
     * @return extraDhcpOpts
     */
    public List<SubnetExtraDhcpOpt> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<SubnetExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }

    public Virsubnet withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 子网的创建时间。 **取值范围**： UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Virsubnet withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**： 子网的更新时间。 **取值范围**： UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Virsubnet that = (Virsubnet) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dnsNameservers, that.dnsNameservers) && Objects.equals(this.zoneId, that.zoneId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.subnetCidrs, that.subnetCidrs) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.extraDhcpOpts, that.extraDhcpOpts) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            dnsNameservers,
            zoneId,
            vpcId,
            status,
            projectId,
            scope,
            subnetCidrs,
            tags,
            extraDhcpOpts,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Virsubnet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsNameservers: ").append(toIndentedString(dnsNameservers)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    subnetCidrs: ").append(toIndentedString(subnetCidrs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
