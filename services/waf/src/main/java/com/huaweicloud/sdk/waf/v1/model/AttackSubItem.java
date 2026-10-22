package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 攻击子类型分布项
 */
public class AttackSubItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    public AttackSubItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 子类型标识： 合规检测子类型：politics_matched, violent_matched, illegal_matched, hatespeech_matched, privatesensitive_matched, religion_matched, other_matched 注入检测子类型：goal_hijacking_matched, prompt_leaking_matched, role_play_instruction_matched, unsafe_instruction_topic_matched, inquiry_with_unsafe_opinion_matched, reverse_exposure_matched, multi_step_instruction_matched, context_task_matched, opposition_response_matched, virtual_conversation_matched, do_anything_now_matched, code_injection_matched 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AttackSubItem withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * 该子类型命中次数
     * minimum: 0
     * maximum: 9999999999
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackSubItem that = (AttackSubItem) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackSubItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
