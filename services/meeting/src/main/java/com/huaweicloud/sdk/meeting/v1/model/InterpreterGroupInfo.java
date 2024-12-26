package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 传译组信息
 */
public class InterpreterGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupID")

    private String groupID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupName")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupType")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firstLanguage")

    private String firstLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondLanguage")

    private String secondLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interpreters")

    private List<InterpreterInfo> interpreters = null;

    public InterpreterGroupInfo withGroupID(String groupID) {
        this.groupID = groupID;
        return this;
    }

    /**
     * 传译组序号。
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public InterpreterGroupInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 传译组名称。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public InterpreterGroupInfo withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 传译组类型，MANUAL：人工传译，AI：AI传译。默认MANUAL。
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public InterpreterGroupInfo withFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
        return this;
    }

    /**
     * 传译组支持的第一种语言。
     * @return firstLanguage
     */
    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public InterpreterGroupInfo withSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
        return this;
    }

    /**
     * 传译组支持的第二种语言。
     * @return secondLanguage
     */
    public String getSecondLanguage() {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
    }

    public InterpreterGroupInfo withInterpreters(List<InterpreterInfo> interpreters) {
        this.interpreters = interpreters;
        return this;
    }

    public InterpreterGroupInfo addInterpretersItem(InterpreterInfo interpretersItem) {
        if (this.interpreters == null) {
            this.interpreters = new ArrayList<>();
        }
        this.interpreters.add(interpretersItem);
        return this;
    }

    public InterpreterGroupInfo withInterpreters(Consumer<List<InterpreterInfo>> interpretersSetter) {
        if (this.interpreters == null) {
            this.interpreters = new ArrayList<>();
        }
        interpretersSetter.accept(this.interpreters);
        return this;
    }

    /**
     * 传译员列表。
     * @return interpreters
     */
    public List<InterpreterInfo> getInterpreters() {
        return interpreters;
    }

    public void setInterpreters(List<InterpreterInfo> interpreters) {
        this.interpreters = interpreters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterpreterGroupInfo that = (InterpreterGroupInfo) obj;
        return Objects.equals(this.groupID, that.groupID) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.firstLanguage, that.firstLanguage)
            && Objects.equals(this.secondLanguage, that.secondLanguage)
            && Objects.equals(this.interpreters, that.interpreters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupID, groupName, groupType, firstLanguage, secondLanguage, interpreters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterpreterGroupInfo {\n");
        sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    firstLanguage: ").append(toIndentedString(firstLanguage)).append("\n");
        sb.append("    secondLanguage: ").append(toIndentedString(secondLanguage)).append("\n");
        sb.append("    interpreters: ").append(toIndentedString(interpreters)).append("\n");
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
