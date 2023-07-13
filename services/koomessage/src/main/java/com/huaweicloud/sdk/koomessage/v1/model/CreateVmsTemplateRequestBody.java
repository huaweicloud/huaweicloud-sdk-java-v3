package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新建智能信息基础版模板的请求消息体。
 */
public class CreateVmsTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reslist")

    private List<ResourceInfo> reslist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reminders")

    private String reminders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callbackurl")

    private String callbackurl;

    public CreateVmsTemplateRequestBody withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 智能信息基础版模板有效期。单位：天，必须取整，最长9999天。
     * @return expirationTime
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CreateVmsTemplateRequestBody withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息基础版模板名称。模板的别名，用来帮助记忆。最大不超过100个字，若使用中文需经过UTF-8编码。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public CreateVmsTemplateRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 智能信息基础版模板主题，最大不超过20个字，若使用中文需经过UTF-8 编码，主题不能包含“【】”，否则审核会不通过。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateVmsTemplateRequestBody withReslist(List<ResourceInfo> reslist) {
        this.reslist = reslist;
        return this;
    }

    public CreateVmsTemplateRequestBody addReslistItem(ResourceInfo reslistItem) {
        if (this.reslist == null) {
            this.reslist = new ArrayList<>();
        }
        this.reslist.add(reslistItem);
        return this;
    }

    public CreateVmsTemplateRequestBody withReslist(Consumer<List<ResourceInfo>> reslistSetter) {
        if (this.reslist == null) {
            this.reslist = new ArrayList<>();
        }
        reslistSetter.accept(this.reslist);
        return this;
    }

    /**
     *  模板资源列表，由按顺序排列的资源组成，资源类型支持文本、图片、音频、视频。  > 资源在JSON数组中的顺序将决定其在手机上的显示顺序，数组大小不能超过10。 
     * @return reslist
     */
    public List<ResourceInfo> getReslist() {
        return reslist;
    }

    public void setReslist(List<ResourceInfo> reslist) {
        this.reslist = reslist;
    }

    public CreateVmsTemplateRequestBody withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 智能信息基础版模板备注信息，用于填写对模板审核的期望或要求，最大不超过200个字。例如：希望这个模板绑定的通道类型是三网合一通道，默认优先绑定三网合一通道。
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public CreateVmsTemplateRequestBody withReminders(String reminders) {
        this.reminders = reminders;
        return this;
    }

    /**
     * 用于发送提醒短信，将智能信息基础版模板审批的结果和意见及时通知到指定对象，目前仅支持11位纯数字国内手机号码，多个号码用英文逗号分隔，最多支持5个手机号。
     * @return reminders
     */
    public String getReminders() {
        return reminders;
    }

    public void setReminders(String reminders) {
        this.reminders = reminders;
    }

    public CreateVmsTemplateRequestBody withCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
        return this;
    }

    /**
     * 客户系统回调URL，可用于通知对端模板审核状态信息。  > 接口规格需参照定义智能信息基础版模板状态回执完成实现。 
     * @return callbackurl
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVmsTemplateRequestBody that = (CreateVmsTemplateRequestBody) obj;
        return Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.tplName, that.tplName)
            && Objects.equals(this.title, that.title) && Objects.equals(this.reslist, that.reslist)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.reminders, that.reminders)
            && Objects.equals(this.callbackurl, that.callbackurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationTime, tplName, title, reslist, remarks, reminders, callbackurl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVmsTemplateRequestBody {\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    reslist: ").append(toIndentedString(reslist)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
        sb.append("    callbackurl: ").append(toIndentedString(callbackurl)).append("\n");
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
