package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.InviteeInfo;
import com.huaweicloud.sdk.bcs.v2.model.InvitorInfo;
import com.huaweicloud.sdk.bcs.v2.model.OrganizationV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NotificationList
 */
public class NotificationList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_name")
    
    private String channelName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_time")
    
    private String updatedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tc3_need")
    
    private Boolean tc3Need;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_info")
    
    private InvitorInfo invitorInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_info")
    
    private InviteeInfo inviteeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hide")
    
    private Integer hide;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_orgs")
    
    private List<OrganizationV2> inviteeOrgs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_status")
    
    private Integer readStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cross_version_upgrade")
    
    private String crossVersionUpgrade;

    public NotificationList withChannelName(String channelName) {
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

    

    public NotificationList withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public NotificationList withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    

    public NotificationList withTc3Need(Boolean tc3Need) {
        this.tc3Need = tc3Need;
        return this;
    }

    


    /**
     * 是否开启可信
     * @return tc3Need
     */
    public Boolean getTc3Need() {
        return tc3Need;
    }

    public void setTc3Need(Boolean tc3Need) {
        this.tc3Need = tc3Need;
    }

    

    public NotificationList withInvitorInfo(InvitorInfo invitorInfo) {
        this.invitorInfo = invitorInfo;
        return this;
    }

    public NotificationList withInvitorInfo(Consumer<InvitorInfo> invitorInfoSetter) {
        if(this.invitorInfo == null ){
            this.invitorInfo = new InvitorInfo();
            invitorInfoSetter.accept(this.invitorInfo);
        }
        
        return this;
    }


    /**
     * Get invitorInfo
     * @return invitorInfo
     */
    public InvitorInfo getInvitorInfo() {
        return invitorInfo;
    }

    public void setInvitorInfo(InvitorInfo invitorInfo) {
        this.invitorInfo = invitorInfo;
    }

    

    public NotificationList withInviteeInfo(InviteeInfo inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
        return this;
    }

    public NotificationList withInviteeInfo(Consumer<InviteeInfo> inviteeInfoSetter) {
        if(this.inviteeInfo == null ){
            this.inviteeInfo = new InviteeInfo();
            inviteeInfoSetter.accept(this.inviteeInfo);
        }
        
        return this;
    }


    /**
     * Get inviteeInfo
     * @return inviteeInfo
     */
    public InviteeInfo getInviteeInfo() {
        return inviteeInfo;
    }

    public void setInviteeInfo(InviteeInfo inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
    }

    

    public NotificationList withHide(Integer hide) {
        this.hide = hide;
        return this;
    }

    


    /**
     * 是否删除
     * @return hide
     */
    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }

    

    public NotificationList withInviteeOrgs(List<OrganizationV2> inviteeOrgs) {
        this.inviteeOrgs = inviteeOrgs;
        return this;
    }

    
    public NotificationList addInviteeOrgsItem(OrganizationV2 inviteeOrgsItem) {
        if(this.inviteeOrgs == null) {
            this.inviteeOrgs = new ArrayList<>();
        }
        this.inviteeOrgs.add(inviteeOrgsItem);
        return this;
    }

    public NotificationList withInviteeOrgs(Consumer<List<OrganizationV2>> inviteeOrgsSetter) {
        if(this.inviteeOrgs == null) {
            this.inviteeOrgs = new ArrayList<>();
        }
        inviteeOrgsSetter.accept(this.inviteeOrgs);
        return this;
    }

    /**
     * 被邀请的组织信息
     * @return inviteeOrgs
     */
    public List<OrganizationV2> getInviteeOrgs() {
        return inviteeOrgs;
    }

    public void setInviteeOrgs(List<OrganizationV2> inviteeOrgs) {
        this.inviteeOrgs = inviteeOrgs;
    }

    

    public NotificationList withReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    


    /**
     * 阅读状态值
     * @return readStatus
     */
    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    

    public NotificationList withCrossVersionUpgrade(String crossVersionUpgrade) {
        this.crossVersionUpgrade = crossVersionUpgrade;
        return this;
    }

    


    /**
     * 跨版本进行升级
     * @return crossVersionUpgrade
     */
    public String getCrossVersionUpgrade() {
        return crossVersionUpgrade;
    }

    public void setCrossVersionUpgrade(String crossVersionUpgrade) {
        this.crossVersionUpgrade = crossVersionUpgrade;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationList notificationList = (NotificationList) o;
        return Objects.equals(this.channelName, notificationList.channelName) &&
            Objects.equals(this.status, notificationList.status) &&
            Objects.equals(this.updatedTime, notificationList.updatedTime) &&
            Objects.equals(this.tc3Need, notificationList.tc3Need) &&
            Objects.equals(this.invitorInfo, notificationList.invitorInfo) &&
            Objects.equals(this.inviteeInfo, notificationList.inviteeInfo) &&
            Objects.equals(this.hide, notificationList.hide) &&
            Objects.equals(this.inviteeOrgs, notificationList.inviteeOrgs) &&
            Objects.equals(this.readStatus, notificationList.readStatus) &&
            Objects.equals(this.crossVersionUpgrade, notificationList.crossVersionUpgrade);
    }
    @Override
    public int hashCode() {
        return Objects.hash(channelName, status, updatedTime, tc3Need, invitorInfo, inviteeInfo, hide, inviteeOrgs, readStatus, crossVersionUpgrade);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationList {\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    tc3Need: ").append(toIndentedString(tc3Need)).append("\n");
        sb.append("    invitorInfo: ").append(toIndentedString(invitorInfo)).append("\n");
        sb.append("    inviteeInfo: ").append(toIndentedString(inviteeInfo)).append("\n");
        sb.append("    hide: ").append(toIndentedString(hide)).append("\n");
        sb.append("    inviteeOrgs: ").append(toIndentedString(inviteeOrgs)).append("\n");
        sb.append("    readStatus: ").append(toIndentedString(readStatus)).append("\n");
        sb.append("    crossVersionUpgrade: ").append(toIndentedString(crossVersionUpgrade)).append("\n");
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

