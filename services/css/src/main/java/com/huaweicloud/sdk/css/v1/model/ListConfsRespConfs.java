package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListConfsRespConfs
 */
public class ListConfsRespConfs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confContent")

    private String confContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private ListConfsRespConfsSetting setting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveWordsShielding")

    private Boolean sensitiveWordsShielding;

    public ListConfsRespConfs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 配置文件名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListConfsRespConfs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 配置文件状态。 **取值范围**： - checking：正在检查中。 - available：可用。 - unavailable：不可用。 - starting：正开始。 - working：工作中。 - stopping：正在停止。 - stopped：已经停止。 - restoring：正在回滚。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListConfsRespConfs withConfContent(String confContent) {
        this.confContent = confContent;
        return this;
    }

    /**
     * **参数解释**： 配置文件内容。 **取值范围**： 不涉及
     * @return confContent
     */
    public String getConfContent() {
        return confContent;
    }

    public void setConfContent(String confContent) {
        this.confContent = confContent;
    }

    public ListConfsRespConfs withSetting(ListConfsRespConfsSetting setting) {
        this.setting = setting;
        return this;
    }

    public ListConfsRespConfs withSetting(Consumer<ListConfsRespConfsSetting> settingSetter) {
        if (this.setting == null) {
            this.setting = new ListConfsRespConfsSetting();
            settingSetter.accept(this.setting);
        }

        return this;
    }

    /**
     * Get setting
     * @return setting
     */
    public ListConfsRespConfsSetting getSetting() {
        return setting;
    }

    public void setSetting(ListConfsRespConfsSetting setting) {
        this.setting = setting;
    }

    public ListConfsRespConfs withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**： 更新时间，格式：yyyy-MM-dd'T'HH:mm:ss。 **取值范围**： 不涉及
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public ListConfsRespConfs withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 配置文件描述。 **取值范围**： 长度不超过128个字符。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ListConfsRespConfs withSensitiveWordsShielding(Boolean sensitiveWordsShielding) {
        this.sensitiveWordsShielding = sensitiveWordsShielding;
        return this;
    }

    /**
     * **参数解释**： 是否隐藏敏感词。 **取值范围**： - true：隐藏敏感词。 - false：未隐藏敏感词。
     * @return sensitiveWordsShielding
     */
    public Boolean getSensitiveWordsShielding() {
        return sensitiveWordsShielding;
    }

    public void setSensitiveWordsShielding(Boolean sensitiveWordsShielding) {
        this.sensitiveWordsShielding = sensitiveWordsShielding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfsRespConfs that = (ListConfsRespConfs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.confContent, that.confContent) && Objects.equals(this.setting, that.setting)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.sensitiveWordsShielding, that.sensitiveWordsShielding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, confContent, setting, updateAt, desc, sensitiveWordsShielding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfsRespConfs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    confContent: ").append(toIndentedString(confContent)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    sensitiveWordsShielding: ").append(toIndentedString(sensitiveWordsShielding)).append("\n");
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
