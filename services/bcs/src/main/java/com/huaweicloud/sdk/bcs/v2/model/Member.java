package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.MemberInvitee;
import com.huaweicloud.sdk.bcs.v2.model.MemberInvitor;
import com.huaweicloud.sdk.bcs.v2.model.OrganizationV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 联盟成员
 */
public class Member  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tcs_need")
    
    private Boolean tcsNeed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_name")
    
    private String channelName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invited_orgs")
    
    private List<OrganizationV2> invitedOrgs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_info")
    
    private MemberInvitor invitorInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_info")
    
    private MemberInvitee inviteeInfo = null;

    public Member withTcsNeed(Boolean tcsNeed) {
        this.tcsNeed = tcsNeed;
        return this;
    }

    


    /**
     * 是否支持可信
     * @return tcsNeed
     */
    public Boolean getTcsNeed() {
        return tcsNeed;
    }

    public void setTcsNeed(Boolean tcsNeed) {
        this.tcsNeed = tcsNeed;
    }

    public Member withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    


    /**
     * 通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Member withInvitedOrgs(List<OrganizationV2> invitedOrgs) {
        this.invitedOrgs = invitedOrgs;
        return this;
    }

    
    public Member addInvitedOrgsItem(OrganizationV2 invitedOrgsItem) {
        if (this.invitedOrgs == null) {
            this.invitedOrgs = new ArrayList<>();
        }
        this.invitedOrgs.add(invitedOrgsItem);
        return this;
    }

    public Member withInvitedOrgs(Consumer<List<OrganizationV2>> invitedOrgsSetter) {
        if(this.invitedOrgs == null ){
            this.invitedOrgs = new ArrayList<>();
        }
        invitedOrgsSetter.accept(this.invitedOrgs);
        return this;
    }

    /**
     * 被邀请的组织
     * @return invitedOrgs
     */
    public List<OrganizationV2> getInvitedOrgs() {
        return invitedOrgs;
    }

    public void setInvitedOrgs(List<OrganizationV2> invitedOrgs) {
        this.invitedOrgs = invitedOrgs;
    }

    public Member withInvitorInfo(MemberInvitor invitorInfo) {
        this.invitorInfo = invitorInfo;
        return this;
    }

    public Member withInvitorInfo(Consumer<MemberInvitor> invitorInfoSetter) {
        if(this.invitorInfo == null ){
            this.invitorInfo = new MemberInvitor();
            invitorInfoSetter.accept(this.invitorInfo);
        }
        
        return this;
    }


    /**
     * Get invitorInfo
     * @return invitorInfo
     */
    public MemberInvitor getInvitorInfo() {
        return invitorInfo;
    }

    public void setInvitorInfo(MemberInvitor invitorInfo) {
        this.invitorInfo = invitorInfo;
    }

    public Member withInviteeInfo(MemberInvitee inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
        return this;
    }

    public Member withInviteeInfo(Consumer<MemberInvitee> inviteeInfoSetter) {
        if(this.inviteeInfo == null ){
            this.inviteeInfo = new MemberInvitee();
            inviteeInfoSetter.accept(this.inviteeInfo);
        }
        
        return this;
    }


    /**
     * Get inviteeInfo
     * @return inviteeInfo
     */
    public MemberInvitee getInviteeInfo() {
        return inviteeInfo;
    }

    public void setInviteeInfo(MemberInvitee inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(this.tcsNeed, member.tcsNeed) &&
            Objects.equals(this.channelName, member.channelName) &&
            Objects.equals(this.invitedOrgs, member.invitedOrgs) &&
            Objects.equals(this.invitorInfo, member.invitorInfo) &&
            Objects.equals(this.inviteeInfo, member.inviteeInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tcsNeed, channelName, invitedOrgs, invitorInfo, inviteeInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Member {\n");
        sb.append("    tcsNeed: ").append(toIndentedString(tcsNeed)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    invitedOrgs: ").append(toIndentedString(invitedOrgs)).append("\n");
        sb.append("    invitorInfo: ").append(toIndentedString(invitorInfo)).append("\n");
        sb.append("    inviteeInfo: ").append(toIndentedString(inviteeInfo)).append("\n");
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

