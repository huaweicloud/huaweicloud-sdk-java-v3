package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建集群发起的请求的请求体对象。
 */
public class CreateClusterReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info")

    private CreateClusterReqBodyClusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbuser")

    private String dbuser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbuserpwd")

    private String dbuserpwd;

    public CreateClusterReqBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名字
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateClusterReqBody withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateClusterReqBody withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public CreateClusterReqBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateClusterReqBody withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public CreateClusterReqBody addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateClusterReqBody withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 集群所在的网络信息以及安全组信息。
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public CreateClusterReqBody withClusterInfo(CreateClusterReqBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public CreateClusterReqBody withClusterInfo(Consumer<CreateClusterReqBodyClusterInfo> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new CreateClusterReqBodyClusterInfo();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /**
     * Get clusterInfo
     * @return clusterInfo
     */
    public CreateClusterReqBodyClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(CreateClusterReqBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public CreateClusterReqBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterReqBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateClusterReqBody withDbuser(String dbuser) {
        this.dbuser = dbuser;
        return this;
    }

    /**
     * type为doris时，必填项，管理账号：admin
     * @return dbuser
     */
    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public CreateClusterReqBody withDbuserpwd(String dbuserpwd) {
        this.dbuserpwd = dbuserpwd;
        return this;
    }

    /**
     * type为doris时，必填项，管理账号密码
     * @return dbuserpwd
     */
    public String getDbuserpwd() {
        return dbuserpwd;
    }

    public void setDbuserpwd(String dbuserpwd) {
        this.dbuserpwd = dbuserpwd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterReqBody that = (CreateClusterReqBody) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.clusterInfo, that.clusterInfo)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.dbuser, that.dbuser)
            && Objects.equals(this.dbuserpwd, that.dbuserpwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName,
            datastore,
            availabilityZone,
            nics,
            clusterInfo,
            enterpriseProjectId,
            vpcId,
            dbuser,
            dbuserpwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReqBody {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    dbuser: ").append(toIndentedString(dbuser)).append("\n");
        sb.append("    dbuserpwd: ").append(toIndentedString(dbuserpwd)).append("\n");
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
