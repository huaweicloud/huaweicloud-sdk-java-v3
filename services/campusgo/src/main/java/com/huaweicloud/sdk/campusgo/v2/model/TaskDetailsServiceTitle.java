package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业对应服务的标题
 */
public class TaskDetailsServiceTitle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh")

    private String zh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    private String en;

    public TaskDetailsServiceTitle withZh(String zh) {
        this.zh = zh;
        return this;
    }

    /**
     * 作业对应服务的中文标题
     * @return zh
     */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public TaskDetailsServiceTitle withEn(String en) {
        this.en = en;
        return this;
    }

    /**
     * 作业对应服务的英文标题
     * @return en
     */
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDetailsServiceTitle taskDetailsServiceTitle = (TaskDetailsServiceTitle) o;
        return Objects.equals(this.zh, taskDetailsServiceTitle.zh)
            && Objects.equals(this.en, taskDetailsServiceTitle.en);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zh, en);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetailsServiceTitle {\n");
        sb.append("    zh: ").append(toIndentedString(zh)).append("\n");
        sb.append("    en: ").append(toIndentedString(en)).append("\n");
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
