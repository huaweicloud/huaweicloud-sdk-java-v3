package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<IdNameEntry> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<IdNameEntry> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public CreatePoolResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 实例组ID，用于唯一标识一个实例组。 **取值范围：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePoolResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例组名称。 **取值范围：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePoolResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 实例组所在的区域（Region）。 **取值范围：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreatePoolResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 实例组类型。 **取值范围：** - elb：基础elb类型 - elb-v2：elb-v2类型 - elb-shadow：saas化elb类型 - standard-container：反向代理独享引擎组（云内，承载租户专用） - standard-cloud：反向代理独享引擎组（云内） - standard：反向代理独享引擎组（云外） - detector-cloud：旁路检测独享引擎组（云内） - detector：旁路检测独享引擎组（云外）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreatePoolResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 实例组关联的虚拟私有云ID。 **取值范围：** 不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreatePoolResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 实例组的描述信息。 **取值范围：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePoolResponse withHosts(List<IdNameEntry> hosts) {
        this.hosts = hosts;
        return this;
    }

    public CreatePoolResponse addHostsItem(IdNameEntry hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public CreatePoolResponse withHosts(Consumer<List<IdNameEntry>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 实例组关联的防护域名列表。 **取值范围：** 不涉及
     * @return hosts
     */
    public List<IdNameEntry> getHosts() {
        return hosts;
    }

    public void setHosts(List<IdNameEntry> hosts) {
        this.hosts = hosts;
    }

    public CreatePoolResponse withInstances(List<IdNameEntry> instances) {
        this.instances = instances;
        return this;
    }

    public CreatePoolResponse addInstancesItem(IdNameEntry instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public CreatePoolResponse withInstances(Consumer<List<IdNameEntry>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释：** 实例组关联的引擎实例列表。 **取值范围：** 不涉及
     * @return instances
     */
    public List<IdNameEntry> getInstances() {
        return instances;
    }

    public void setInstances(List<IdNameEntry> instances) {
        this.instances = instances;
    }

    public CreatePoolResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 实例组关联的企业项目ID。 **取值范围：** - 0：代表default企业项目 - 其他为企业项目ID，长度为36个字符
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreatePoolResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 实例组创建时间。Unix时间戳格式，单位为毫秒（ms）。 **取值范围：** 不涉及
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePoolResponse that = (CreatePoolResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.region, that.region) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, region, type, vpcId, description, hosts, instances, enterpriseProjectId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
