package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGetConfDetailResponse extends SdkResponse {

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

    public ShowGetConfDetailResponse withName(String name) {
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

    public ShowGetConfDetailResponse withStatus(String status) {
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

    public ShowGetConfDetailResponse withConfContent(String confContent) {
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

    public ShowGetConfDetailResponse withSetting(Setting setting) {
        this.setting = setting;
        return this;
    }

    public ShowGetConfDetailResponse withSetting(Consumer<Setting> settingSetter) {
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

    public ShowGetConfDetailResponse withUpdateAt(String updateAt) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGetConfDetailResponse that = (ShowGetConfDetailResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.confContent, that.confContent) && Objects.equals(this.setting, that.setting)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, confContent, setting, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGetConfDetailResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    confContent: ").append(toIndentedString(confContent)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
