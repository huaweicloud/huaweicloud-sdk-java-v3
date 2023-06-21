package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 联盟审批日志信息
 */
public class TicsApproveLogVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_alias")

    private String domainAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league")

    private TicsLeagueNoticeVo league;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_name")

    private String leagueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_id")

    private String partnerId;

    /**
     * 联盟参与方状态，JOINED.已加入，JOIN_PENDING_APPROVAL.待审核，JOIN_REJECTED.拒绝加入，QUIT.已退出
     */
    public static final class PartnerStatusEnum {

        /**
         * Enum JOINED for value: "JOINED"
         */
        public static final PartnerStatusEnum JOINED = new PartnerStatusEnum("JOINED");

        /**
         * Enum JOIN_PENDING_APPROVAL for value: "JOIN_PENDING_APPROVAL"
         */
        public static final PartnerStatusEnum JOIN_PENDING_APPROVAL = new PartnerStatusEnum("JOIN_PENDING_APPROVAL");

        /**
         * Enum JOIN_REJECTED for value: "JOIN_REJECTED"
         */
        public static final PartnerStatusEnum JOIN_REJECTED = new PartnerStatusEnum("JOIN_REJECTED");

        /**
         * Enum QUIT for value: "QUIT"
         */
        public static final PartnerStatusEnum QUIT = new PartnerStatusEnum("QUIT");

        private static final Map<String, PartnerStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PartnerStatusEnum> createStaticFields() {
            Map<String, PartnerStatusEnum> map = new HashMap<>();
            map.put("JOINED", JOINED);
            map.put("JOIN_PENDING_APPROVAL", JOIN_PENDING_APPROVAL);
            map.put("JOIN_REJECTED", JOIN_REJECTED);
            map.put("QUIT", QUIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PartnerStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PartnerStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PartnerStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PartnerStatusEnum(value);
            }
            return result;
        }

        public static PartnerStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PartnerStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PartnerStatusEnum) {
                return this.value.equals(((PartnerStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_status")

    private PartnerStatusEnum partnerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partners")

    private List<TicsLeaguePartnerVo> partners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_id")

    private String updateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_name")

    private String updateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public TicsApproveLogVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TicsApproveLogVo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者Id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public TicsApproveLogVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TicsApproveLogVo withDomainAlias(String domainAlias) {
        this.domainAlias = domainAlias;
        return this;
    }

    /**
     * 租户别名
     * @return domainAlias
     */
    public String getDomainAlias() {
        return domainAlias;
    }

    public void setDomainAlias(String domainAlias) {
        this.domainAlias = domainAlias;
    }

    public TicsApproveLogVo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public TicsApproveLogVo withLeague(TicsLeagueNoticeVo league) {
        this.league = league;
        return this;
    }

    public TicsApproveLogVo withLeague(Consumer<TicsLeagueNoticeVo> leagueSetter) {
        if (this.league == null) {
            this.league = new TicsLeagueNoticeVo();
            leagueSetter.accept(this.league);
        }

        return this;
    }

    /**
     * Get league
     * @return league
     */
    public TicsLeagueNoticeVo getLeague() {
        return league;
    }

    public void setLeague(TicsLeagueNoticeVo league) {
        this.league = league;
    }

    public TicsApproveLogVo withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 联盟Id
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public TicsApproveLogVo withLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }

    /**
     * 联盟名称
     * @return leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public TicsApproveLogVo withPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * 联盟参与方Id
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public TicsApproveLogVo withPartnerStatus(PartnerStatusEnum partnerStatus) {
        this.partnerStatus = partnerStatus;
        return this;
    }

    /**
     * 联盟参与方状态，JOINED.已加入，JOIN_PENDING_APPROVAL.待审核，JOIN_REJECTED.拒绝加入，QUIT.已退出
     * @return partnerStatus
     */
    public PartnerStatusEnum getPartnerStatus() {
        return partnerStatus;
    }

    public void setPartnerStatus(PartnerStatusEnum partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    public TicsApproveLogVo withPartners(List<TicsLeaguePartnerVo> partners) {
        this.partners = partners;
        return this;
    }

    public TicsApproveLogVo addPartnersItem(TicsLeaguePartnerVo partnersItem) {
        if (this.partners == null) {
            this.partners = new ArrayList<>();
        }
        this.partners.add(partnersItem);
        return this;
    }

    public TicsApproveLogVo withPartners(Consumer<List<TicsLeaguePartnerVo>> partnersSetter) {
        if (this.partners == null) {
            this.partners = new ArrayList<>();
        }
        partnersSetter.accept(this.partners);
        return this;
    }

    /**
     * Get partners
     * @return partners
     */
    public List<TicsLeaguePartnerVo> getPartners() {
        return partners;
    }

    public void setPartners(List<TicsLeaguePartnerVo> partners) {
        this.partners = partners;
    }

    public TicsApproveLogVo withUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * 更新者Id
     * @return updateId
     */
    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public TicsApproveLogVo withUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    /**
     * 更新者名称
     * @return updateName
     */
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public TicsApproveLogVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TicsApproveLogVo ticsApproveLogVo = (TicsApproveLogVo) o;
        return Objects.equals(this.createTime, ticsApproveLogVo.createTime)
            && Objects.equals(this.creatorId, ticsApproveLogVo.creatorId)
            && Objects.equals(this.creatorName, ticsApproveLogVo.creatorName)
            && Objects.equals(this.domainAlias, ticsApproveLogVo.domainAlias)
            && Objects.equals(this.domainName, ticsApproveLogVo.domainName)
            && Objects.equals(this.league, ticsApproveLogVo.league)
            && Objects.equals(this.leagueId, ticsApproveLogVo.leagueId)
            && Objects.equals(this.leagueName, ticsApproveLogVo.leagueName)
            && Objects.equals(this.partnerId, ticsApproveLogVo.partnerId)
            && Objects.equals(this.partnerStatus, ticsApproveLogVo.partnerStatus)
            && Objects.equals(this.partners, ticsApproveLogVo.partners)
            && Objects.equals(this.updateId, ticsApproveLogVo.updateId)
            && Objects.equals(this.updateName, ticsApproveLogVo.updateName)
            && Objects.equals(this.updateTime, ticsApproveLogVo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            creatorId,
            creatorName,
            domainAlias,
            domainName,
            league,
            leagueId,
            leagueName,
            partnerId,
            partnerStatus,
            partners,
            updateId,
            updateName,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsApproveLogVo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    domainAlias: ").append(toIndentedString(domainAlias)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    league: ").append(toIndentedString(league)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
        sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
        sb.append("    partnerStatus: ").append(toIndentedString(partnerStatus)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
        sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
        sb.append("    updateName: ").append(toIndentedString(updateName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
