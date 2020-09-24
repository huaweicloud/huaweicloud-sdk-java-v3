package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.TenantAgreeAuthDetailV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AgreeTenantAuthorizationV2Req
 */
public class AgreeTenantAuthorizationV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_detail_list")
    
    private List<TenantAgreeAuthDetailV2> authDetailList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_effective_time")
    
    private Long authEffectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_expire_time")
    
    private Long authExpireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_id")
    
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

    public AgreeTenantAuthorizationV2Req withAuthDetailList(Consumer<List<TenantAgreeAuthDetailV2>> authDetailListSetter) {
        if(this.authDetailList == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgreeTenantAuthorizationV2Req agreeTenantAuthorizationV2Req = (AgreeTenantAuthorizationV2Req) o;
        return Objects.equals(this.authDetailList, agreeTenantAuthorizationV2Req.authDetailList) &&
            Objects.equals(this.authEffectiveTime, agreeTenantAuthorizationV2Req.authEffectiveTime) &&
            Objects.equals(this.authExpireTime, agreeTenantAuthorizationV2Req.authExpireTime) &&
            Objects.equals(this.groupId, agreeTenantAuthorizationV2Req.groupId) &&
            Objects.equals(this.agencyId, agreeTenantAuthorizationV2Req.agencyId);
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

