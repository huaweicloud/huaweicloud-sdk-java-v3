package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PlayContentInfo
 */
public class PlayContentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifyVoice")

    private String notifyVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateId")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateParas")

    private List<String> templateParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collectInd")

    private Integer collectInd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replayAfterCollection")

    private String replayAfterCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collectContentTriggerReplaying")

    private String collectContentTriggerReplaying;

    public PlayContentInfo withNotifyVoice(String notifyVoice) {
        this.notifyVoice = notifyVoice;
        return this;
    }

    /**
     * 通知语音的放音文件名。需要先通过放音文件管理页面上传放音文件并通过审核才能使用。
     * @return notifyVoice
     */
    public String getNotifyVoice() {
        return notifyVoice;
    }

    public void setNotifyVoice(String notifyVoice) {
        this.notifyVoice = notifyVoice;
    }

    public PlayContentInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 通知语音的放音文件名。需要先通过放音文件管理页面上传放音文件并通过审核才能使用。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public PlayContentInfo withTemplateParas(List<String> templateParas) {
        this.templateParas = templateParas;
        return this;
    }

    public PlayContentInfo addTemplateParasItem(String templateParasItem) {
        if (this.templateParas == null) {
            this.templateParas = new ArrayList<>();
        }
        this.templateParas.add(templateParasItem);
        return this;
    }

    public PlayContentInfo withTemplateParas(Consumer<List<String>> templateParasSetter) {
        if (this.templateParas == null) {
            this.templateParas = new ArrayList<>();
        }
        templateParasSetter.accept(this.templateParas);
        return this;
    }

    /**
     * 语音通知模板的变量值列表，用于依次填充templateId参数指定的模板内容中的变量
     * @return templateParas
     */
    public List<String> getTemplateParas() {
        return templateParas;
    }

    public void setTemplateParas(List<String> templateParas) {
        this.templateParas = templateParas;
    }

    public PlayContentInfo withCollectInd(Integer collectInd) {
        this.collectInd = collectInd;
        return this;
    }

    /**
     * 是否进行收号。若进行收号，请在语音通知内容播放完毕后的5秒之内进行按键操作，系统会将用户输入的号码通过语音通知呼叫状态通知API发送给SP
     * minimum: 0
     * maximum: 32
     * @return collectInd
     */
    public Integer getCollectInd() {
        return collectInd;
    }

    public void setCollectInd(Integer collectInd) {
        this.collectInd = collectInd;
    }

    public PlayContentInfo withReplayAfterCollection(String replayAfterCollection) {
        this.replayAfterCollection = replayAfterCollection;
        return this;
    }

    /**
     * 当collectInd字段设置为非0时此参数有效。true：播放,false：不播放
     * @return replayAfterCollection
     */
    public String getReplayAfterCollection() {
        return replayAfterCollection;
    }

    public void setReplayAfterCollection(String replayAfterCollection) {
        this.replayAfterCollection = replayAfterCollection;
    }

    public PlayContentInfo withCollectContentTriggerReplaying(String collectContentTriggerReplaying) {
        this.collectContentTriggerReplaying = collectContentTriggerReplaying;
        return this;
    }

    /**
     * 当replayAfterCollection字段设置为true时此参数有效。
     * @return collectContentTriggerReplaying
     */
    public String getCollectContentTriggerReplaying() {
        return collectContentTriggerReplaying;
    }

    public void setCollectContentTriggerReplaying(String collectContentTriggerReplaying) {
        this.collectContentTriggerReplaying = collectContentTriggerReplaying;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayContentInfo that = (PlayContentInfo) obj;
        return Objects.equals(this.notifyVoice, that.notifyVoice) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateParas, that.templateParas)
            && Objects.equals(this.collectInd, that.collectInd)
            && Objects.equals(this.replayAfterCollection, that.replayAfterCollection)
            && Objects.equals(this.collectContentTriggerReplaying, that.collectContentTriggerReplaying);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyVoice,
            templateId,
            templateParas,
            collectInd,
            replayAfterCollection,
            collectContentTriggerReplaying);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayContentInfo {\n");
        sb.append("    notifyVoice: ").append(toIndentedString(notifyVoice)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateParas: ").append(toIndentedString(templateParas)).append("\n");
        sb.append("    collectInd: ").append(toIndentedString(collectInd)).append("\n");
        sb.append("    replayAfterCollection: ").append(toIndentedString(replayAfterCollection)).append("\n");
        sb.append("    collectContentTriggerReplaying: ")
            .append(toIndentedString(collectContentTriggerReplaying))
            .append("\n");
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
