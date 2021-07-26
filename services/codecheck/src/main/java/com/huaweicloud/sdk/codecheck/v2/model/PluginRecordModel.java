package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户行为记录单
 */
public class PluginRecordModel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_type")
    
    private Integer actionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_params")
    
    private String extraParams;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ide_name")
    
    private String ideName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ide_type")
    
    private String ideType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ide_version")
    
    private String ideVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg_id")
    
    private String msgId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg_type")
    
    private String msgType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_id")
    
    private Integer pluginId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_name")
    
    private String pluginName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_version")
    
    private String pluginVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="send_time")
    
    private Long sendTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username;

    public PluginRecordModel withActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    


    /**
     * 动作类型
     * @return actionType
     */
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    

    public PluginRecordModel withExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    


    /**
     * 额外参数
     * @return extraParams
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    

    public PluginRecordModel withIdeName(String ideName) {
        this.ideName = ideName;
        return this;
    }

    


    /**
     * ide名
     * @return ideName
     */
    public String getIdeName() {
        return ideName;
    }

    public void setIdeName(String ideName) {
        this.ideName = ideName;
    }

    

    public PluginRecordModel withIdeType(String ideType) {
        this.ideType = ideType;
        return this;
    }

    


    /**
     * ide类型
     * @return ideType
     */
    public String getIdeType() {
        return ideType;
    }

    public void setIdeType(String ideType) {
        this.ideType = ideType;
    }

    

    public PluginRecordModel withIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
        return this;
    }

    


    /**
     * ide版本
     * @return ideVersion
     */
    public String getIdeVersion() {
        return ideVersion;
    }

    public void setIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
    }

    

    public PluginRecordModel withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    


    /**
     * 消息编号
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    

    public PluginRecordModel withMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }

    


    /**
     * 类型
     * @return msgType
     */
    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    

    public PluginRecordModel withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 平台类型
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    

    public PluginRecordModel withPluginId(Integer pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    


    /**
     * 插件编号
     * @return pluginId
     */
    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    

    public PluginRecordModel withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    


    /**
     * 插件名字
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    

    public PluginRecordModel withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    


    /**
     * 插件版本
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    

    public PluginRecordModel withSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    


    /**
     * 请求时间
     * @return sendTime
     */
    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    

    public PluginRecordModel withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginRecordModel pluginRecordModel = (PluginRecordModel) o;
        return Objects.equals(this.actionType, pluginRecordModel.actionType) &&
            Objects.equals(this.extraParams, pluginRecordModel.extraParams) &&
            Objects.equals(this.ideName, pluginRecordModel.ideName) &&
            Objects.equals(this.ideType, pluginRecordModel.ideType) &&
            Objects.equals(this.ideVersion, pluginRecordModel.ideVersion) &&
            Objects.equals(this.msgId, pluginRecordModel.msgId) &&
            Objects.equals(this.msgType, pluginRecordModel.msgType) &&
            Objects.equals(this.platform, pluginRecordModel.platform) &&
            Objects.equals(this.pluginId, pluginRecordModel.pluginId) &&
            Objects.equals(this.pluginName, pluginRecordModel.pluginName) &&
            Objects.equals(this.pluginVersion, pluginRecordModel.pluginVersion) &&
            Objects.equals(this.sendTime, pluginRecordModel.sendTime) &&
            Objects.equals(this.username, pluginRecordModel.username);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionType, extraParams, ideName, ideType, ideVersion, msgId, msgType, platform, pluginId, pluginName, pluginVersion, sendTime, username);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginRecordModel {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
        sb.append("    ideName: ").append(toIndentedString(ideName)).append("\n");
        sb.append("    ideType: ").append(toIndentedString(ideType)).append("\n");
        sb.append("    ideVersion: ").append(toIndentedString(ideVersion)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

