package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 邀请联盟成员 */
public class BatchInviteMembersToChannelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_id")

    private String bcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_username")

    private String invitorUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invited_userinfo")

    private List<InvitedDomain> invitedUserinfo = null;

    public BatchInviteMembersToChannelRequestBody withBcsId(String bcsId) {
        this.bcsId = bcsId;
        return this;
    }

    /** 邀请实例id
     * 
     * @return bcsId */
    public String getBcsId() {
        return bcsId;
    }

    public void setBcsId(String bcsId) {
        this.bcsId = bcsId;
    }

    public BatchInviteMembersToChannelRequestBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /** 邀请加入的通道名
     * 
     * @return channelName */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public BatchInviteMembersToChannelRequestBody withInvitorUsername(String invitorUsername) {
        this.invitorUsername = invitorUsername;
        return this;
    }

    /** 发出邀请的租户名
     * 
     * @return invitorUsername */
    public String getInvitorUsername() {
        return invitorUsername;
    }

    public void setInvitorUsername(String invitorUsername) {
        this.invitorUsername = invitorUsername;
    }

    public BatchInviteMembersToChannelRequestBody withInvitedUserinfo(List<InvitedDomain> invitedUserinfo) {
        this.invitedUserinfo = invitedUserinfo;
        return this;
    }

    public BatchInviteMembersToChannelRequestBody addInvitedUserinfoItem(InvitedDomain invitedUserinfoItem) {
        if (this.invitedUserinfo == null) {
            this.invitedUserinfo = new ArrayList<>();
        }
        this.invitedUserinfo.add(invitedUserinfoItem);
        return this;
    }

    public BatchInviteMembersToChannelRequestBody withInvitedUserinfo(
        Consumer<List<InvitedDomain>> invitedUserinfoSetter) {
        if (this.invitedUserinfo == null) {
            this.invitedUserinfo = new ArrayList<>();
        }
        invitedUserinfoSetter.accept(this.invitedUserinfo);
        return this;
    }

    /** 被邀请的用户列表
     * 
     * @return invitedUserinfo */
    public List<InvitedDomain> getInvitedUserinfo() {
        return invitedUserinfo;
    }

    public void setInvitedUserinfo(List<InvitedDomain> invitedUserinfo) {
        this.invitedUserinfo = invitedUserinfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchInviteMembersToChannelRequestBody batchInviteMembersToChannelRequestBody =
            (BatchInviteMembersToChannelRequestBody) o;
        return Objects.equals(this.bcsId, batchInviteMembersToChannelRequestBody.bcsId)
            && Objects.equals(this.channelName, batchInviteMembersToChannelRequestBody.channelName)
            && Objects.equals(this.invitorUsername, batchInviteMembersToChannelRequestBody.invitorUsername)
            && Objects.equals(this.invitedUserinfo, batchInviteMembersToChannelRequestBody.invitedUserinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcsId, channelName, invitorUsername, invitedUserinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchInviteMembersToChannelRequestBody {\n");
        sb.append("    bcsId: ").append(toIndentedString(bcsId)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    invitorUsername: ").append(toIndentedString(invitorUsername)).append("\n");
        sb.append("    invitedUserinfo: ").append(toIndentedString(invitedUserinfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
