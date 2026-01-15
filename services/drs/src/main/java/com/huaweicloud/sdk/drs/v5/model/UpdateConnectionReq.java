package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改连接请求。
 */
public class UpdateConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private ConnectionConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private BaseEndpoint endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private CloudVpcInfo vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl")

    private EndpointSslConfig ssl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud")

    private CloudBaseInfo cloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public UpdateConnectionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConnectionReq withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型。 取值：mysql - postgresql - mongodb - oracle
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public UpdateConnectionReq withConfig(ConnectionConfig config) {
        this.config = config;
        return this;
    }

    public UpdateConnectionReq withConfig(Consumer<ConnectionConfig> configSetter) {
        if (this.config == null) {
            this.config = new ConnectionConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ConnectionConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectionConfig config) {
        this.config = config;
    }

    public UpdateConnectionReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 连接描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateConnectionReq withEndpoint(BaseEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public UpdateConnectionReq withEndpoint(Consumer<BaseEndpoint> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new BaseEndpoint();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public BaseEndpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(BaseEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public UpdateConnectionReq withVpc(CloudVpcInfo vpc) {
        this.vpc = vpc;
        return this;
    }

    public UpdateConnectionReq withVpc(Consumer<CloudVpcInfo> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new CloudVpcInfo();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public CloudVpcInfo getVpc() {
        return vpc;
    }

    public void setVpc(CloudVpcInfo vpc) {
        this.vpc = vpc;
    }

    public UpdateConnectionReq withSsl(EndpointSslConfig ssl) {
        this.ssl = ssl;
        return this;
    }

    public UpdateConnectionReq withSsl(Consumer<EndpointSslConfig> sslSetter) {
        if (this.ssl == null) {
            this.ssl = new EndpointSslConfig();
            sslSetter.accept(this.ssl);
        }

        return this;
    }

    /**
     * Get ssl
     * @return ssl
     */
    public EndpointSslConfig getSsl() {
        return ssl;
    }

    public void setSsl(EndpointSslConfig ssl) {
        this.ssl = ssl;
    }

    public UpdateConnectionReq withCloud(CloudBaseInfo cloud) {
        this.cloud = cloud;
        return this;
    }

    public UpdateConnectionReq withCloud(Consumer<CloudBaseInfo> cloudSetter) {
        if (this.cloud == null) {
            this.cloud = new CloudBaseInfo();
            cloudSetter.accept(this.cloud);
        }

        return this;
    }

    /**
     * Get cloud
     * @return cloud
     */
    public CloudBaseInfo getCloud() {
        return cloud;
    }

    public void setCloud(CloudBaseInfo cloud) {
        this.cloud = cloud;
    }

    public UpdateConnectionReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConnectionReq that = (UpdateConnectionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.config, that.config) && Objects.equals(this.description, that.description)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.ssl, that.ssl) && Objects.equals(this.cloud, that.cloud)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dbType, config, description, endpoint, vpc, ssl, cloud, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
        sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
