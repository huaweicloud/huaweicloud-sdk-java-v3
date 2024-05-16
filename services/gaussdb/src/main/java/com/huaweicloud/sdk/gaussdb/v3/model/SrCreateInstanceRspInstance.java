package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class SrCreateInstanceRspInstance {

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

    private SrCreateInstanceRspInstanceEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_net_id")

    private String subNetId;

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

    private SrCreateInstanceRspInstancePayInfo payInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private SrCreateInstanceRspInstanceTagsInfo tagsInfo;

    public SrCreateInstanceRspInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * StarRocks实例ID，严格匹配UUID规则。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SrCreateInstanceRspInstance withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区码。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public SrCreateInstanceRspInstance withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区模式。  取值范围：  single：单可用区。  multi：多可用区。
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public SrCreateInstanceRspInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SrCreateInstanceRspInstance withEngine(SrCreateInstanceRspInstanceEngine engine) {
        this.engine = engine;
        return this;
    }

    public SrCreateInstanceRspInstance withEngine(Consumer<SrCreateInstanceRspInstanceEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new SrCreateInstanceRspInstanceEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public SrCreateInstanceRspInstanceEngine getEngine() {
        return engine;
    }

    public void setEngine(SrCreateInstanceRspInstanceEngine engine) {
        this.engine = engine;
    }

    public SrCreateInstanceRspInstance withVpcId(String vpcId) {
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

    public SrCreateInstanceRspInstance withSecurityGroupId(String securityGroupId) {
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

    public SrCreateInstanceRspInstance withSubNetId(String subNetId) {
        this.subNetId = subNetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subNetId
     */
    public String getSubNetId() {
        return subNetId;
    }

    public void setSubNetId(String subNetId) {
        this.subNetId = subNetId;
    }

    public SrCreateInstanceRspInstance withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户。默认root。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public SrCreateInstanceRspInstance withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口号。默认3306。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SrCreateInstanceRspInstance withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 部署模式。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public SrCreateInstanceRspInstance withPayInfo(SrCreateInstanceRspInstancePayInfo payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public SrCreateInstanceRspInstance withPayInfo(Consumer<SrCreateInstanceRspInstancePayInfo> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new SrCreateInstanceRspInstancePayInfo();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /**
     * Get payInfo
     * @return payInfo
     */
    public SrCreateInstanceRspInstancePayInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(SrCreateInstanceRspInstancePayInfo payInfo) {
        this.payInfo = payInfo;
    }

    public SrCreateInstanceRspInstance withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * SSL开关。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public SrCreateInstanceRspInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SrCreateInstanceRspInstance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 实例所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SrCreateInstanceRspInstance withTagsInfo(SrCreateInstanceRspInstanceTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public SrCreateInstanceRspInstance withTagsInfo(Consumer<SrCreateInstanceRspInstanceTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new SrCreateInstanceRspInstanceTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public SrCreateInstanceRspInstanceTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(SrCreateInstanceRspInstanceTagsInfo tagsInfo) {
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
        SrCreateInstanceRspInstance that = (SrCreateInstanceRspInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.azMode, that.azMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.subNetId, that.subNetId) && Objects.equals(this.dbUser, that.dbUser)
            && Objects.equals(this.port, that.port) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.payInfo, that.payInfo) && Objects.equals(this.enableSsl, that.enableSsl)
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
            subNetId,
            dbUser,
            port,
            haMode,
            payInfo,
            enableSsl,
            status,
            region,
            tagsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SrCreateInstanceRspInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subNetId: ").append(toIndentedString(subNetId)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
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
