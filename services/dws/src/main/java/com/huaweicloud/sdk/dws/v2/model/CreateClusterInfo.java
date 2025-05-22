package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建集群对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class CreateClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_node")

    private Integer numberOfNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_pwd")

    private String userPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_cn")

    private Integer numberOfCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Tags tags;

    public CreateClusterInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释**： 节点规格ID，需要通过查询规格接口获取，对应的是接口响应的id字段。 **约束限制**： 不涉及。 **取值范围**： 必须是查询规格信息接口返回的规格ID。 **默认取值**： 不涉及。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public CreateClusterInfo withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    /**
     * **参数解释**： 节点数量。 **约束限制**： 不涉及。 **取值范围**： 集群模式取值范围为3~256，实时数仓（单机模式）取值为1。 **默认取值**： 不涉及。
     * minimum: 1
     * maximum: 256
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    public CreateClusterInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 指定子网ID，用于集群网络配置。 **约束限制**： 不涉及。 **取值范围**： 必须是虚拟私有云ID下的某个子网。 **默认取值**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateClusterInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 指定安全组ID，用于集群网络配置。 **约束限制**： 不涉及。 **取值范围**： 参数非空时必须是有效的安全组ID。参数为空时将自动创建安全组。 **默认取值**： null
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateClusterInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 指定虚拟私有云ID，用于集群网络配置。 **约束限制**： 不涉及。 **取值范围**： 必须是有效的虚拟私有云ID。 **默认取值**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateClusterInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**： 配置集群可用区。 **约束限制**： 不涉及。 **取值范围**： 必须是当前局点下状态有效且当前用户可见的可用区编码。 **默认取值**： 查询可用区时第一个可用的可用区编码。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateClusterInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 集群数据库端口。 **约束限制**： 不涉及。 **取值范围**： 8000~30000 **默认取值**： 8000
     * minimum: 8000
     * maximum: 30000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateClusterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **约束限制**： 要求唯一性，必须以字母开头并只包含字母、数字、中划线或下划线，长度为4~64个字符。 **取值范围**： 4~64个字符。 **默认取值**： 8000
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateClusterInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： DWS集群管理员用户名。 **约束限制**： - 只能由小写字母、数字或下划线组成。 - 必须由小写字母或下划线开头。 - 长度为1~63个字符。 - 用户名不能为DWS数据库的关键字。    **取值范围**：   1~63个字符； **默认取值**： dbadmin
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateClusterInfo withUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    /**
     * **参数解释**： DWS集群管理员密码。 **约束限制**： 不涉及。 **取值范围**： 12~32个字符； 至少包含以下字符的3种：大写字母、小写字母、数字和特殊字符(~!?,.:;_(){}[]/<>@#%^&*+|\\\\=-)； 不能与用户名或倒序的用户名相同； **默认取值**： 不涉及。
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public CreateClusterInfo withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CreateClusterInfo withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public CreateClusterInfo withNumberOfCn(Integer numberOfCn) {
        this.numberOfCn = numberOfCn;
        return this;
    }

    /**
     * **参数解释**： CN部署量。 **约束限制**： 不涉及。 **取值范围**： 2~集群节点数，最大值为20。 **默认取值**： 默认值为3。
     * minimum: 2
     * maximum: 20
     * @return numberOfCn
     */
    public Integer getNumberOfCn() {
        return numberOfCn;
    }

    public void setNumberOfCn(Integer numberOfCn) {
        this.numberOfCn = numberOfCn;
    }

    public CreateClusterInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID，对集群指定企业项目。如果未指定，则使用默认企业项目“default”的ID，即0。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterInfo withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    public CreateClusterInfo withTags(Consumer<Tags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new Tags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
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
        CreateClusterInfo that = (CreateClusterInfo) obj;
        return Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.numberOfNode, that.numberOfNode)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.port, that.port)
            && Objects.equals(this.name, that.name) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPwd, that.userPwd) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.numberOfCn, that.numberOfCn)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeType,
            numberOfNode,
            subnetId,
            securityGroupId,
            vpcId,
            availabilityZone,
            port,
            name,
            userName,
            userPwd,
            publicIp,
            numberOfCn,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInfo {\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPwd: ").append(toIndentedString(userPwd)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    numberOfCn: ").append(toIndentedString(numberOfCn)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
