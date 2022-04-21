package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户自己修改个人信息的DTO，用member命名做区分，当前仅有名称，后续会扩展地址、签名等等。
 */
public class ModMemberDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public ModMemberDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称 maxLength：64 minLength：1
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModMemberDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /**
     * 英文名称 maxLength：64 minLength：0
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public ModMemberDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名 maxLength：512 minLength：0
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public ModMemberDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位 maxLength：32 minLength：0
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ModMemberDTO withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注 maxLength：128 minLength：0
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModMemberDTO modMemberDTO = (ModMemberDTO) o;
        return Objects.equals(this.name, modMemberDTO.name)
            && Objects.equals(this.englishName, modMemberDTO.englishName)
            && Objects.equals(this.signature, modMemberDTO.signature) && Objects.equals(this.title, modMemberDTO.title)
            && Objects.equals(this.desc, modMemberDTO.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, englishName, signature, title, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModMemberDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
