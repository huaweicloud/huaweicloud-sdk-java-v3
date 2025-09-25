package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 特权进程配置详情
 */
public class WebTamperPrivilegedProcessRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_process_path_list")

    private List<String> privilegedProcessPathList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_child_status")

    private Boolean privilegedChildStatus;

    public WebTamperPrivilegedProcessRequestInfo withPrivilegedProcessPathList(List<String> privilegedProcessPathList) {
        this.privilegedProcessPathList = privilegedProcessPathList;
        return this;
    }

    public WebTamperPrivilegedProcessRequestInfo addPrivilegedProcessPathListItem(
        String privilegedProcessPathListItem) {
        if (this.privilegedProcessPathList == null) {
            this.privilegedProcessPathList = new ArrayList<>();
        }
        this.privilegedProcessPathList.add(privilegedProcessPathListItem);
        return this;
    }

    public WebTamperPrivilegedProcessRequestInfo withPrivilegedProcessPathList(
        Consumer<List<String>> privilegedProcessPathListSetter) {
        if (this.privilegedProcessPathList == null) {
            this.privilegedProcessPathList = new ArrayList<>();
        }
        privilegedProcessPathListSetter.accept(this.privilegedProcessPathList);
        return this;
    }

    /**
     * **参数解释**: 特权进程文件路径列表 **约束限制** : 不涉及 **取值范围**: 最少0条，最多10条 **默认取值** : 不涉及 
     * @return privilegedProcessPathList
     */
    public List<String> getPrivilegedProcessPathList() {
        return privilegedProcessPathList;
    }

    public void setPrivilegedProcessPathList(List<String> privilegedProcessPathList) {
        this.privilegedProcessPathList = privilegedProcessPathList;
    }

    public WebTamperPrivilegedProcessRequestInfo withPrivilegedChildStatus(Boolean privilegedChildStatus) {
        this.privilegedChildStatus = privilegedChildStatus;
        return this;
    }

    /**
     * **参数解释**: 特权进程子进程可信状态 **约束限制** : 不涉及 **取值范围**: - True ：开启特权进程子进程可信。 - False ：关闭特权进程子进程可信。  **默认取值** : False 
     * @return privilegedChildStatus
     */
    public Boolean getPrivilegedChildStatus() {
        return privilegedChildStatus;
    }

    public void setPrivilegedChildStatus(Boolean privilegedChildStatus) {
        this.privilegedChildStatus = privilegedChildStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperPrivilegedProcessRequestInfo that = (WebTamperPrivilegedProcessRequestInfo) obj;
        return Objects.equals(this.privilegedProcessPathList, that.privilegedProcessPathList)
            && Objects.equals(this.privilegedChildStatus, that.privilegedChildStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privilegedProcessPathList, privilegedChildStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperPrivilegedProcessRequestInfo {\n");
        sb.append("    privilegedProcessPathList: ").append(toIndentedString(privilegedProcessPathList)).append("\n");
        sb.append("    privilegedChildStatus: ").append(toIndentedString(privilegedChildStatus)).append("\n");
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
