package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Confs
 */
public class Confs {

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

    private Setting setting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public Confs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置文件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Confs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 配置文件状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Confs withConfContent(String confContent) {
        this.confContent = confContent;
        return this;
    }

    /**
     * 配置文件内容。
     * @return confContent
     */
    public String getConfContent() {
        return confContent;
    }

    public void setConfContent(String confContent) {
        this.confContent = confContent;
    }

    public Confs withSetting(Setting setting) {
        this.setting = setting;
        return this;
    }

    public Confs withSetting(Consumer<Setting> settingSetter) {
        if (this.setting == null) {
            this.setting = new Setting();
            settingSetter.accept(this.setting);
        }

        return this;
    }

    /**
     * Get setting
     * @return setting
     */
    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Confs withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public Confs withDesc(String desc) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Confs that = (Confs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.confContent, that.confContent) && Objects.equals(this.setting, that.setting)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, confContent, setting, updateAt, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Confs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    confContent: ").append(toIndentedString(confContent)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
