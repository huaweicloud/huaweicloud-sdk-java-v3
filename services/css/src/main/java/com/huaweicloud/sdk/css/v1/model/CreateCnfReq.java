package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateCnfReq */
public class CreateCnfReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confContent")

    private String confContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private Setting setting;

    public CreateCnfReq withName(String name) {
        this.name = name;
        return this;
    }

    /** 配置文件名称。4～32个字符，只能包含数字、字母、中划线和下划线，且必须以字母开头
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCnfReq withConfContent(String confContent) {
        this.confContent = confContent;
        return this;
    }

    /** 配置文件内容。
     * 
     * @return confContent */
    public String getConfContent() {
        return confContent;
    }

    public void setConfContent(String confContent) {
        this.confContent = confContent;
    }

    public CreateCnfReq withSetting(Setting setting) {
        this.setting = setting;
        return this;
    }

    public CreateCnfReq withSetting(Consumer<Setting> settingSetter) {
        if (this.setting == null) {
            this.setting = new Setting();
            settingSetter.accept(this.setting);
        }

        return this;
    }

    /** Get setting
     * 
     * @return setting */
    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCnfReq createCnfReq = (CreateCnfReq) o;
        return Objects.equals(this.name, createCnfReq.name)
            && Objects.equals(this.confContent, createCnfReq.confContent)
            && Objects.equals(this.setting, createCnfReq.setting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, confContent, setting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCnfReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    confContent: ").append(toIndentedString(confContent)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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
