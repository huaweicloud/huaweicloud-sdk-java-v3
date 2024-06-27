package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClickHouse实例信息。
 */
public class CreateChInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_mode")

    private String azMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private ClickHouseEngineInfo engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_info")

    private CreateChInstanceInfoPayInfo payInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private Boolean sslOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private CreateChInstanceInfoTagsInfo tagsInfo;

    public CreateChInstanceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateChInstanceInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public CreateChInstanceInfo withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区模式。 取值范围： - single：单可用区 - double：多可用区
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public CreateChInstanceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateChInstanceInfo withEngine(ClickHouseEngineInfo engine) {
        this.engine = engine;
        return this;
    }

    public CreateChInstanceInfo withEngine(Consumer<ClickHouseEngineInfo> engineSetter) {
        if (this.engine == null) {
            this.engine = new ClickHouseEngineInfo();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public ClickHouseEngineInfo getEngine() {
        return engine;
    }

    public void setEngine(ClickHouseEngineInfo engine) {
        this.engine = engine;
    }

    public CreateChInstanceInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateChInstanceInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateChInstanceInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateChInstanceInfo withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public CreateChInstanceInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口。取值范围：0~65535。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateChInstanceInfo withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 部署模式。 取值范围： - Single：单机 - Ha：主备
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public CreateChInstanceInfo withPayInfo(CreateChInstanceInfoPayInfo payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public CreateChInstanceInfo withPayInfo(Consumer<CreateChInstanceInfoPayInfo> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new CreateChInstanceInfoPayInfo();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /**
     * Get payInfo
     * @return payInfo
     */
    public CreateChInstanceInfoPayInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(CreateChInstanceInfoPayInfo payInfo) {
        this.payInfo = payInfo;
    }

    public CreateChInstanceInfo withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * SSL开关。
     * @return sslOption
     */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    public CreateChInstanceInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。 取值范围： - creating：创建 - normal：正常 - abnormal：异常 - createfailed：创建失败 - deleted：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateChInstanceInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 实例所在区。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateChInstanceInfo withTagsInfo(CreateChInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public CreateChInstanceInfo withTagsInfo(Consumer<CreateChInstanceInfoTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new CreateChInstanceInfoTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public CreateChInstanceInfoTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(CreateChInstanceInfoTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChInstanceInfo that = (CreateChInstanceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.azMode, that.azMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.dbUser, that.dbUser)
            && Objects.equals(this.port, that.port) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.payInfo, that.payInfo) && Objects.equals(this.sslOption, that.sslOption)
            && Objects.equals(this.status, that.status) && Objects.equals(this.region, that.region)
            && Objects.equals(this.tagsInfo, that.tagsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            azCode,
            azMode,
            name,
            engine,
            vpcId,
            securityGroupId,
            subnetId,
            dbUser,
            port,
            haMode,
            payInfo,
            sslOption,
            status,
            region,
            tagsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChInstanceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    tagsInfo: ").append(toIndentedString(tagsInfo)).append("\n");
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
