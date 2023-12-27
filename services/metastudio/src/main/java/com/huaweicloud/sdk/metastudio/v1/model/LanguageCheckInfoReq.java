package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LanguageCheckInfoReq
 */
public class LanguageCheckInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_language")

    private String targetLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_script")

    private List<LiveShootScriptItem> shootScript = null;

    public LanguageCheckInfoReq withTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }

    /**
     * 目标语言
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public LanguageCheckInfoReq withShootScript(List<LiveShootScriptItem> shootScript) {
        this.shootScript = shootScript;
        return this;
    }

    public LanguageCheckInfoReq addShootScriptItem(LiveShootScriptItem shootScriptItem) {
        if (this.shootScript == null) {
            this.shootScript = new ArrayList<>();
        }
        this.shootScript.add(shootScriptItem);
        return this;
    }

    public LanguageCheckInfoReq withShootScript(Consumer<List<LiveShootScriptItem>> shootScriptSetter) {
        if (this.shootScript == null) {
            this.shootScript = new ArrayList<>();
        }
        shootScriptSetter.accept(this.shootScript);
        return this;
    }

    /**
     * 用户传来的剧本文本信息
     * @return shootScript
     */
    public List<LiveShootScriptItem> getShootScript() {
        return shootScript;
    }

    public void setShootScript(List<LiveShootScriptItem> shootScript) {
        this.shootScript = shootScript;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanguageCheckInfoReq that = (LanguageCheckInfoReq) obj;
        return Objects.equals(this.targetLanguage, that.targetLanguage)
            && Objects.equals(this.shootScript, that.shootScript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetLanguage, shootScript);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageCheckInfoReq {\n");
        sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
        sb.append("    shootScript: ").append(toIndentedString(shootScript)).append("\n");
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
