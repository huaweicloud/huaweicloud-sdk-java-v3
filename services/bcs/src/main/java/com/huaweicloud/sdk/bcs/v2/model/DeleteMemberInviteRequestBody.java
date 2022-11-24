package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteMemberInviteRequestBody
 */
public class DeleteMemberInviteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_id")

    private String bcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invited_userinfo")

    private List<InvitationDetail> invitedUserinfo = null;

    public DeleteMemberInviteRequestBody withBcsId(String bcsId) {
        this.bcsId = bcsId;
        return this;
    }

    /**
     * 邀请实例id
     * @return bcsId
     */
    public String getBcsId() {
        return bcsId;
    }

    public void setBcsId(String bcsId) {
        this.bcsId = bcsId;
    }

    public DeleteMemberInviteRequestBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 邀请加入的通道名
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public DeleteMemberInviteRequestBody withInvitedUserinfo(List<InvitationDetail> invitedUserinfo) {
        this.invitedUserinfo = invitedUserinfo;
        return this;
    }

    public DeleteMemberInviteRequestBody addInvitedUserinfoItem(InvitationDetail invitedUserinfoItem) {
        if (this.invitedUserinfo == null) {
            this.invitedUserinfo = new ArrayList<>();
        }
        this.invitedUserinfo.add(invitedUserinfoItem);
        return this;
    }

    public DeleteMemberInviteRequestBody withInvitedUserinfo(Consumer<List<InvitationDetail>> invitedUserinfoSetter) {
        if (this.invitedUserinfo == null) {
            this.invitedUserinfo = new ArrayList<>();
        }
        invitedUserinfoSetter.accept(this.invitedUserinfo);
        return this;
    }

    /**
     * 被邀请的用户列表，对应信息可通过获取联盟成员列表（ListMembers）接口查询，或被邀请方已加入联盟，或邀请状态为released时，需填写准确的被邀请方bcs实例id和邀请状态
     * @return invitedUserinfo
     */
    public List<InvitationDetail> getInvitedUserinfo() {
        return invitedUserinfo;
    }

    public void setInvitedUserinfo(List<InvitationDetail> invitedUserinfo) {
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
        DeleteMemberInviteRequestBody deleteMemberInviteRequestBody = (DeleteMemberInviteRequestBody) o;
        return Objects.equals(this.bcsId, deleteMemberInviteRequestBody.bcsId)
            && Objects.equals(this.channelName, deleteMemberInviteRequestBody.channelName)
            && Objects.equals(this.invitedUserinfo, deleteMemberInviteRequestBody.invitedUserinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcsId, channelName, invitedUserinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMemberInviteRequestBody {\n");
        sb.append("    bcsId: ").append(toIndentedString(bcsId)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    invitedUserinfo: ").append(toIndentedString(invitedUserinfo)).append("\n");
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
