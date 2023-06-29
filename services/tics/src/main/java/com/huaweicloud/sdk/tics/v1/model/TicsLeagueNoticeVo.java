package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 联盟信息
 */
public class TicsLeagueNoticeVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_channel_name")

    private String bcsChannelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_ip")

    private String bcsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_org_name")

    private String bcsOrgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_id")

    private String blockChainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_name")

    private String blockChainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partners")

    private Long partners;

    public TicsLeagueNoticeVo withBcsChannelName(String bcsChannelName) {
        this.bcsChannelName = bcsChannelName;
        return this;
    }

    /**
     * BCS通道名称
     * @return bcsChannelName
     */
    public String getBcsChannelName() {
        return bcsChannelName;
    }

    public void setBcsChannelName(String bcsChannelName) {
        this.bcsChannelName = bcsChannelName;
    }

    public TicsLeagueNoticeVo withBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
        return this;
    }

    /**
     * BCS浏览器ip
     * @return bcsIp
     */
    public String getBcsIp() {
        return bcsIp;
    }

    public void setBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
    }

    public TicsLeagueNoticeVo withBcsOrgName(String bcsOrgName) {
        this.bcsOrgName = bcsOrgName;
        return this;
    }

    /**
     * BCS组织名称
     * @return bcsOrgName
     */
    public String getBcsOrgName() {
        return bcsOrgName;
    }

    public void setBcsOrgName(String bcsOrgName) {
        this.bcsOrgName = bcsOrgName;
    }

    public TicsLeagueNoticeVo withBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
        return this;
    }

    /**
     * BCS服务实例ID
     * @return blockChainId
     */
    public String getBlockChainId() {
        return blockChainId;
    }

    public void setBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
    }

    public TicsLeagueNoticeVo withBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
        return this;
    }

    /**
     * BCS服务实例名称
     * @return blockChainName
     */
    public String getBlockChainName() {
        return blockChainName;
    }

    public void setBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
    }

    public TicsLeagueNoticeVo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TicsLeagueNoticeVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TicsLeagueNoticeVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicsLeagueNoticeVo withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public TicsLeagueNoticeVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 联盟id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicsLeagueNoticeVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 联盟名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TicsLeagueNoticeVo withPartners(Long partners) {
        this.partners = partners;
        return this;
    }

    /**
     * 联盟成员数
     * @return partners
     */
    public Long getPartners() {
        return partners;
    }

    public void setPartners(Long partners) {
        this.partners = partners;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsLeagueNoticeVo that = (TicsLeagueNoticeVo) obj;
        return Objects.equals(this.bcsChannelName, that.bcsChannelName) && Objects.equals(this.bcsIp, that.bcsIp)
            && Objects.equals(this.bcsOrgName, that.bcsOrgName) && Objects.equals(this.blockChainId, that.blockChainId)
            && Objects.equals(this.blockChainName, that.blockChainName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.partners, that.partners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcsChannelName,
            bcsIp,
            bcsOrgName,
            blockChainId,
            blockChainName,
            createTime,
            creatorName,
            description,
            expireTime,
            id,
            name,
            partners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsLeagueNoticeVo {\n");
        sb.append("    bcsChannelName: ").append(toIndentedString(bcsChannelName)).append("\n");
        sb.append("    bcsIp: ").append(toIndentedString(bcsIp)).append("\n");
        sb.append("    bcsOrgName: ").append(toIndentedString(bcsOrgName)).append("\n");
        sb.append("    blockChainId: ").append(toIndentedString(blockChainId)).append("\n");
        sb.append("    blockChainName: ").append(toIndentedString(blockChainName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
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
