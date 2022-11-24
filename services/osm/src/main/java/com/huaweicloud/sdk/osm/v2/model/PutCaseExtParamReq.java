package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutCaseExtParamReq
 */
public class PutCaseExtParamReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extends_map")

    private Map<String, Object> extendsMap = null;

    public PutCaseExtParamReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public PutCaseExtParamReq withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 消息id
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public PutCaseExtParamReq withExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }

    public PutCaseExtParamReq putExtendsMapItem(String key, Object extendsMapItem) {
        if (this.extendsMap == null) {
            this.extendsMap = new HashMap<>();
        }
        this.extendsMap.put(key, extendsMapItem);
        return this;
    }

    public PutCaseExtParamReq withExtendsMap(Consumer<Map<String, Object>> extendsMapSetter) {
        if (this.extendsMap == null) {
            this.extendsMap = new HashMap<>();
        }
        extendsMapSetter.accept(this.extendsMap);
        return this;
    }

    /**
     * 扩展参数
     * @return extendsMap
     */
    public Map<String, Object> getExtendsMap() {
        return extendsMap;
    }

    public void setExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutCaseExtParamReq putCaseExtParamReq = (PutCaseExtParamReq) o;
        return Objects.equals(this.groupId, putCaseExtParamReq.groupId)
            && Objects.equals(this.messageId, putCaseExtParamReq.messageId)
            && Objects.equals(this.extendsMap, putCaseExtParamReq.extendsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, messageId, extendsMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutCaseExtParamReq {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    extendsMap: ").append(toIndentedString(extendsMap)).append("\n");
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
