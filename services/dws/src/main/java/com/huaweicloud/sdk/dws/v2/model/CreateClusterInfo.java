package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.PublicIp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群对象
 */
public class CreateClusterInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private PublicIp publicIp = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_node")
    
    private Integer numberOfNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_cn")
    
    private Integer numberOfCn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_pwd")
    
    private String userPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type")
    
    private String nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;

    public CreateClusterInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 配置集群可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateClusterInfo withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CreateClusterInfo withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if(this.publicIp == null ){
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

    public CreateClusterInfo withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    


    /**
     * 集群节点数量，取值范围为3~32。
     * minimum: 3
     * maximum: 32
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    public CreateClusterInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 指定虚拟私有云ID，用于集群网络配置。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateClusterInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * DWS集群管理员用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateClusterInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 指定安全组ID，用于集群网络配置。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateClusterInfo withNumberOfCn(Integer numberOfCn) {
        this.numberOfCn = numberOfCn;
        return this;
    }

    


    /**
     * CN部署量，取值范围为2~集群节点数-1，最大值为5，默认值为2。
     * @return numberOfCn
     */
    public Integer getNumberOfCn() {
        return numberOfCn;
    }

    public void setNumberOfCn(Integer numberOfCn) {
        this.numberOfCn = numberOfCn;
    }

    public CreateClusterInfo withUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    


    /**
     * DWS集群管理员密码。
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public CreateClusterInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID，对集群指定企业项目，如果未指定，则使用默认企业项目“default”的ID，即0。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public CreateClusterInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 集群服务端口，取值范围为8000~30000，默认值：8000。
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
     * 集群名称，要求唯一性，必须以字母开头并只包含字母、数字、中划线或下划线，长度为4~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateClusterInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 指定子网ID，用于集群网络配置。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterInfo createClusterInfo = (CreateClusterInfo) o;
        return Objects.equals(this.availabilityZone, createClusterInfo.availabilityZone) &&
            Objects.equals(this.publicIp, createClusterInfo.publicIp) &&
            Objects.equals(this.numberOfNode, createClusterInfo.numberOfNode) &&
            Objects.equals(this.vpcId, createClusterInfo.vpcId) &&
            Objects.equals(this.userName, createClusterInfo.userName) &&
            Objects.equals(this.securityGroupId, createClusterInfo.securityGroupId) &&
            Objects.equals(this.numberOfCn, createClusterInfo.numberOfCn) &&
            Objects.equals(this.userPwd, createClusterInfo.userPwd) &&
            Objects.equals(this.enterpriseProjectId, createClusterInfo.enterpriseProjectId) &&
            Objects.equals(this.nodeType, createClusterInfo.nodeType) &&
            Objects.equals(this.port, createClusterInfo.port) &&
            Objects.equals(this.name, createClusterInfo.name) &&
            Objects.equals(this.subnetId, createClusterInfo.subnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, publicIp, numberOfNode, vpcId, userName, securityGroupId, numberOfCn, userPwd, enterpriseProjectId, nodeType, port, name, subnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInfo {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    numberOfCn: ").append(toIndentedString(numberOfCn)).append("\n");
        sb.append("    userPwd: ").append(toIndentedString(userPwd)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

