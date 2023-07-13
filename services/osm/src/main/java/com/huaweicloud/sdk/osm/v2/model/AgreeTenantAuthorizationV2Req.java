package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgreeTenantAuthorizationV2Req
 */
public class AgreeTenantAuthorizationV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_detail_list")

    private List<TenantAgreeAuthDetailV2> authDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_effective_time")

    private Long authEffectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_expire_time")

    private Long authExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    public AgreeTenantAuthorizationV2Req withAuthDetailList(List<TenantAgreeAuthDetailV2> authDetailList) {
        this.authDetailList = authDetailList;
        return this;
    }

    public AgreeTenantAuthorizationV2Req addAuthDetailListItem(TenantAgreeAuthDetailV2 authDetailListItem) {
        if (this.authDetailList == null) {
            this.authDetailList = new ArrayList<>();
        }
        this.authDetailList.add(authDetailListItem);
        return this;
    }

    public AgreeTenantAuthorizationV2Req withAuthDetailList(
        Consumer<List<TenantAgreeAuthDetailV2>> authDetailListSetter) {
        if (this.authDetailList == null) {
            this.authDetailList = new ArrayList<>();
        }
        authDetailListSetter.accept(this.authDetailList);
        return this;
    }

    /**
     * 授权详情列表
     * @return authDetailList
     */
    public List<TenantAgreeAuthDetailV2> getAuthDetailList() {
        return authDetailList;
    }

    public void setAuthDetailList(List<TenantAgreeAuthDetailV2> authDetailList) {
        this.authDetailList = authDetailList;
    }

    public AgreeTenantAuthorizationV2Req withAuthEffectiveTime(Long authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
        return this;
    }

    /**
     * 授权生效时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authEffectiveTime
     */
    public Long getAuthEffectiveTime() {
        return authEffectiveTime;
    }

    public void setAuthEffectiveTime(Long authEffectiveTime) {
        this.authEffectiveTime = authEffectiveTime;
    }

    public AgreeTenantAuthorizationV2Req withAuthExpireTime(Long authExpireTime) {
        this.authExpireTime = authExpireTime;
        return this;
    }

    /**
     * 授权到期时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authExpireTime
     */
    public Long getAuthExpireTime() {
        return authExpireTime;
    }

    public void setAuthExpireTime(Long authExpireTime) {
        this.authExpireTime = authExpireTime;
    }

    public AgreeTenantAuthorizationV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AgreeTenantAuthorizationV2Req withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托id
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgreeTenantAuthorizationV2Req that = (AgreeTenantAuthorizationV2Req) obj;
        return Objects.equals(this.authDetailList, that.authDetailList)
            && Objects.equals(this.authEffectiveTime, that.authEffectiveTime)
            && Objects.equals(this.authExpireTime, that.authExpireTime) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.agencyId, that.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authDetailList, authEffectiveTime, authExpireTime, groupId, agencyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgreeTenantAuthorizationV2Req {\n");
        sb.append("    authDetailList: ").append(toIndentedString(authDetailList)).append("\n");
        sb.append("    authEffectiveTime: ").append(toIndentedString(authEffectiveTime)).append("\n");
        sb.append("    authExpireTime: ").append(toIndentedString(authExpireTime)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
