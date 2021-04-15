package com.huaweicloud.sdk.bcs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationInvitee;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationInvitor;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationOrg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 处理联盟邀请body数据
 */
public class HandleNotificationRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_name")
    
    private String channelName;
    /**
     * 处理邀请
     */
    public static final class StatusEnum {

        
        /**
         * Enum AGREED for value: "agreed"
         */
        public static final StatusEnum AGREED = new StatusEnum("agreed");
        
        /**
         * Enum REJECT for value: "reject"
         */
        public static final StatusEnum REJECT = new StatusEnum("reject");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("agreed", AGREED);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_info")
    
    private HandleNotificationInvitor invitorInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_info")
    
    private HandleNotificationInvitee inviteeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invited_orgs")
    
    private List<HandleNotificationOrg> invitedOrgs = null;
    
    public HandleNotificationRequestBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    


    /**
     * 邀请目标通道
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    

    public HandleNotificationRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 处理邀请
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public HandleNotificationRequestBody withInvitorInfo(HandleNotificationInvitor invitorInfo) {
        this.invitorInfo = invitorInfo;
        return this;
    }

    public HandleNotificationRequestBody withInvitorInfo(Consumer<HandleNotificationInvitor> invitorInfoSetter) {
        if(this.invitorInfo == null ){
            this.invitorInfo = new HandleNotificationInvitor();
            invitorInfoSetter.accept(this.invitorInfo);
        }
        
        return this;
    }


    /**
     * Get invitorInfo
     * @return invitorInfo
     */
    public HandleNotificationInvitor getInvitorInfo() {
        return invitorInfo;
    }

    public void setInvitorInfo(HandleNotificationInvitor invitorInfo) {
        this.invitorInfo = invitorInfo;
    }

    

    public HandleNotificationRequestBody withInviteeInfo(HandleNotificationInvitee inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
        return this;
    }

    public HandleNotificationRequestBody withInviteeInfo(Consumer<HandleNotificationInvitee> inviteeInfoSetter) {
        if(this.inviteeInfo == null ){
            this.inviteeInfo = new HandleNotificationInvitee();
            inviteeInfoSetter.accept(this.inviteeInfo);
        }
        
        return this;
    }


    /**
     * Get inviteeInfo
     * @return inviteeInfo
     */
    public HandleNotificationInvitee getInviteeInfo() {
        return inviteeInfo;
    }

    public void setInviteeInfo(HandleNotificationInvitee inviteeInfo) {
        this.inviteeInfo = inviteeInfo;
    }

    

    public HandleNotificationRequestBody withInvitedOrgs(List<HandleNotificationOrg> invitedOrgs) {
        this.invitedOrgs = invitedOrgs;
        return this;
    }

    
    public HandleNotificationRequestBody addInvitedOrgsItem(HandleNotificationOrg invitedOrgsItem) {
        if(this.invitedOrgs == null) {
            this.invitedOrgs = new ArrayList<>();
        }
        this.invitedOrgs.add(invitedOrgsItem);
        return this;
    }

    public HandleNotificationRequestBody withInvitedOrgs(Consumer<List<HandleNotificationOrg>> invitedOrgsSetter) {
        if(this.invitedOrgs == null) {
            this.invitedOrgs = new ArrayList<>();
        }
        invitedOrgsSetter.accept(this.invitedOrgs);
        return this;
    }

    /**
     * 加入联盟的组织，同意加入时必填
     * @return invitedOrgs
     */
    public List<HandleNotificationOrg> getInvitedOrgs() {
        return invitedOrgs;
    }

    public void setInvitedOrgs(List<HandleNotificationOrg> invitedOrgs) {
        this.invitedOrgs = invitedOrgs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandleNotificationRequestBody handleNotificationRequestBody = (HandleNotificationRequestBody) o;
        return Objects.equals(this.channelName, handleNotificationRequestBody.channelName) &&
            Objects.equals(this.status, handleNotificationRequestBody.status) &&
            Objects.equals(this.invitorInfo, handleNotificationRequestBody.invitorInfo) &&
            Objects.equals(this.inviteeInfo, handleNotificationRequestBody.inviteeInfo) &&
            Objects.equals(this.invitedOrgs, handleNotificationRequestBody.invitedOrgs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(channelName, status, invitorInfo, inviteeInfo, invitedOrgs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleNotificationRequestBody {\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    invitorInfo: ").append(toIndentedString(invitorInfo)).append("\n");
        sb.append("    inviteeInfo: ").append(toIndentedString(inviteeInfo)).append("\n");
        sb.append("    invitedOrgs: ").append(toIndentedString(invitedOrgs)).append("\n");
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

