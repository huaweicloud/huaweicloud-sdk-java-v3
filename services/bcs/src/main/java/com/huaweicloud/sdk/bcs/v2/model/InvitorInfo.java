package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 邀请者的信息
 */
public class InvitorInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_id")
    
    private String invitorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_name")
    
    private String invitorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_bcs_id")
    
    private String invitorBcsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_bcs_name")
    
    private String invitorBcsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_consensus")
    
    private String invitorConsensus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_cluster_type")
    
    private String invitorClusterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_database_type")
    
    private String invitorDatabaseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_signature_algorithm")
    
    private String invitorSignatureAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_fabric_version")
    
    private String invitorFabricVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_fade_enabled")
    
    private Boolean orderFadeEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_fade_cache")
    
    private Integer orderFadeCache;

    public InvitorInfo withInvitorId(String invitorId) {
        this.invitorId = invitorId;
        return this;
    }

    


    /**
     * 邀请方用户id
     * @return invitorId
     */
    public String getInvitorId() {
        return invitorId;
    }

    public void setInvitorId(String invitorId) {
        this.invitorId = invitorId;
    }

    public InvitorInfo withInvitorName(String invitorName) {
        this.invitorName = invitorName;
        return this;
    }

    


    /**
     * 邀请方用户名
     * @return invitorName
     */
    public String getInvitorName() {
        return invitorName;
    }

    public void setInvitorName(String invitorName) {
        this.invitorName = invitorName;
    }

    public InvitorInfo withInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
        return this;
    }

    


    /**
     * 邀请方的服务id
     * @return invitorBcsId
     */
    public String getInvitorBcsId() {
        return invitorBcsId;
    }

    public void setInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
    }

    public InvitorInfo withInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
        return this;
    }

    


    /**
     * 邀请方的服务名
     * @return invitorBcsName
     */
    public String getInvitorBcsName() {
        return invitorBcsName;
    }

    public void setInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
    }

    public InvitorInfo withInvitorConsensus(String invitorConsensus) {
        this.invitorConsensus = invitorConsensus;
        return this;
    }

    


    /**
     * 邀请方的共识
     * @return invitorConsensus
     */
    public String getInvitorConsensus() {
        return invitorConsensus;
    }

    public void setInvitorConsensus(String invitorConsensus) {
        this.invitorConsensus = invitorConsensus;
    }

    public InvitorInfo withInvitorClusterType(String invitorClusterType) {
        this.invitorClusterType = invitorClusterType;
        return this;
    }

    


    /**
     * 邀请方的集群类型
     * @return invitorClusterType
     */
    public String getInvitorClusterType() {
        return invitorClusterType;
    }

    public void setInvitorClusterType(String invitorClusterType) {
        this.invitorClusterType = invitorClusterType;
    }

    public InvitorInfo withInvitorDatabaseType(String invitorDatabaseType) {
        this.invitorDatabaseType = invitorDatabaseType;
        return this;
    }

    


    /**
     * 邀请方数据库类型
     * @return invitorDatabaseType
     */
    public String getInvitorDatabaseType() {
        return invitorDatabaseType;
    }

    public void setInvitorDatabaseType(String invitorDatabaseType) {
        this.invitorDatabaseType = invitorDatabaseType;
    }

    public InvitorInfo withInvitorSignatureAlgorithm(String invitorSignatureAlgorithm) {
        this.invitorSignatureAlgorithm = invitorSignatureAlgorithm;
        return this;
    }

    


    /**
     * 邀请方的签名算法
     * @return invitorSignatureAlgorithm
     */
    public String getInvitorSignatureAlgorithm() {
        return invitorSignatureAlgorithm;
    }

    public void setInvitorSignatureAlgorithm(String invitorSignatureAlgorithm) {
        this.invitorSignatureAlgorithm = invitorSignatureAlgorithm;
    }

    public InvitorInfo withInvitorFabricVersion(String invitorFabricVersion) {
        this.invitorFabricVersion = invitorFabricVersion;
        return this;
    }

    


    /**
     * 邀请方的fabric版本
     * @return invitorFabricVersion
     */
    public String getInvitorFabricVersion() {
        return invitorFabricVersion;
    }

    public void setInvitorFabricVersion(String invitorFabricVersion) {
        this.invitorFabricVersion = invitorFabricVersion;
    }

    public InvitorInfo withOrderFadeEnabled(Boolean orderFadeEnabled) {
        this.orderFadeEnabled = orderFadeEnabled;
        return this;
    }

    


    /**
     * 是否允许order老化
     * @return orderFadeEnabled
     */
    public Boolean getOrderFadeEnabled() {
        return orderFadeEnabled;
    }

    public void setOrderFadeEnabled(Boolean orderFadeEnabled) {
        this.orderFadeEnabled = orderFadeEnabled;
    }

    public InvitorInfo withOrderFadeCache(Integer orderFadeCache) {
        this.orderFadeCache = orderFadeCache;
        return this;
    }

    


    /**
     * order老化阈值
     * @return orderFadeCache
     */
    public Integer getOrderFadeCache() {
        return orderFadeCache;
    }

    public void setOrderFadeCache(Integer orderFadeCache) {
        this.orderFadeCache = orderFadeCache;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvitorInfo invitorInfo = (InvitorInfo) o;
        return Objects.equals(this.invitorId, invitorInfo.invitorId) &&
            Objects.equals(this.invitorName, invitorInfo.invitorName) &&
            Objects.equals(this.invitorBcsId, invitorInfo.invitorBcsId) &&
            Objects.equals(this.invitorBcsName, invitorInfo.invitorBcsName) &&
            Objects.equals(this.invitorConsensus, invitorInfo.invitorConsensus) &&
            Objects.equals(this.invitorClusterType, invitorInfo.invitorClusterType) &&
            Objects.equals(this.invitorDatabaseType, invitorInfo.invitorDatabaseType) &&
            Objects.equals(this.invitorSignatureAlgorithm, invitorInfo.invitorSignatureAlgorithm) &&
            Objects.equals(this.invitorFabricVersion, invitorInfo.invitorFabricVersion) &&
            Objects.equals(this.orderFadeEnabled, invitorInfo.orderFadeEnabled) &&
            Objects.equals(this.orderFadeCache, invitorInfo.orderFadeCache);
    }
    @Override
    public int hashCode() {
        return Objects.hash(invitorId, invitorName, invitorBcsId, invitorBcsName, invitorConsensus, invitorClusterType, invitorDatabaseType, invitorSignatureAlgorithm, invitorFabricVersion, orderFadeEnabled, orderFadeCache);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvitorInfo {\n");
        sb.append("    invitorId: ").append(toIndentedString(invitorId)).append("\n");
        sb.append("    invitorName: ").append(toIndentedString(invitorName)).append("\n");
        sb.append("    invitorBcsId: ").append(toIndentedString(invitorBcsId)).append("\n");
        sb.append("    invitorBcsName: ").append(toIndentedString(invitorBcsName)).append("\n");
        sb.append("    invitorConsensus: ").append(toIndentedString(invitorConsensus)).append("\n");
        sb.append("    invitorClusterType: ").append(toIndentedString(invitorClusterType)).append("\n");
        sb.append("    invitorDatabaseType: ").append(toIndentedString(invitorDatabaseType)).append("\n");
        sb.append("    invitorSignatureAlgorithm: ").append(toIndentedString(invitorSignatureAlgorithm)).append("\n");
        sb.append("    invitorFabricVersion: ").append(toIndentedString(invitorFabricVersion)).append("\n");
        sb.append("    orderFadeEnabled: ").append(toIndentedString(orderFadeEnabled)).append("\n");
        sb.append("    orderFadeCache: ").append(toIndentedString(orderFadeCache)).append("\n");
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

