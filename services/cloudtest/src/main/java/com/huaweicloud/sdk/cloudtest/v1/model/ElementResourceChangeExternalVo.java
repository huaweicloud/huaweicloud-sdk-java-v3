package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据信息
 */
public class ElementResourceChangeExternalVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_value")

    private Object objectValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private Object objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_names")

    private Object trackerNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "board_info")

    private List<Object> boardInfo = null;

    public ElementResourceChangeExternalVo withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * 工作项类型
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public ElementResourceChangeExternalVo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ElementResourceChangeExternalVo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ElementResourceChangeExternalVo withObjectValue(Object objectValue) {
        this.objectValue = objectValue;
        return this;
    }

    /**
     * 对象值
     * @return objectValue
     */
    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }

    public ElementResourceChangeExternalVo withObjectKey(Object objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 对象key
     * @return objectKey
     */
    public Object getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(Object objectKey) {
        this.objectKey = objectKey;
    }

    public ElementResourceChangeExternalVo withTrackerNames(Object trackerNames) {
        this.trackerNames = trackerNames;
        return this;
    }

    /**
     * 缺陷类型
     * @return trackerNames
     */
    public Object getTrackerNames() {
        return trackerNames;
    }

    public void setTrackerNames(Object trackerNames) {
        this.trackerNames = trackerNames;
    }

    public ElementResourceChangeExternalVo withBoardInfo(List<Object> boardInfo) {
        this.boardInfo = boardInfo;
        return this;
    }

    public ElementResourceChangeExternalVo addBoardInfoItem(Object boardInfoItem) {
        if (this.boardInfo == null) {
            this.boardInfo = new ArrayList<>();
        }
        this.boardInfo.add(boardInfoItem);
        return this;
    }

    public ElementResourceChangeExternalVo withBoardInfo(Consumer<List<Object>> boardInfoSetter) {
        if (this.boardInfo == null) {
            this.boardInfo = new ArrayList<>();
        }
        boardInfoSetter.accept(this.boardInfo);
        return this;
    }

    /**
     * 归属看板信息，用例关联工作项信息使用
     * @return boardInfo
     */
    public List<Object> getBoardInfo() {
        return boardInfo;
    }

    public void setBoardInfo(List<Object> boardInfo) {
        this.boardInfo = boardInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElementResourceChangeExternalVo that = (ElementResourceChangeExternalVo) obj;
        return Objects.equals(this.trackerName, that.trackerName) && Objects.equals(this.value, that.value)
            && Objects.equals(this.key, that.key) && Objects.equals(this.objectValue, that.objectValue)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.trackerNames, that.trackerNames)
            && Objects.equals(this.boardInfo, that.boardInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackerName, value, key, objectValue, objectKey, trackerNames, boardInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElementResourceChangeExternalVo {\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    objectValue: ").append(toIndentedString(objectValue)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    trackerNames: ").append(toIndentedString(trackerNames)).append("\n");
        sb.append("    boardInfo: ").append(toIndentedString(boardInfo)).append("\n");
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
