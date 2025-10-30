package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 各漏洞类型漏洞id列表 
 */
public class VulHostHostsResponseInfoVulIdsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_vul_id_list")

    private List<String> linuxVulIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_vul_id_list")

    private List<String> windowsVulIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webcms_vul_id_list")

    private List<String> webcmsVulIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_vul_id_list")

    private List<String> appVulIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urgent_vul_id_list")

    private List<String> urgentVulIdList = null;

    public VulHostHostsResponseInfoVulIdsInfo withLinuxVulIdList(List<String> linuxVulIdList) {
        this.linuxVulIdList = linuxVulIdList;
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo addLinuxVulIdListItem(String linuxVulIdListItem) {
        if (this.linuxVulIdList == null) {
            this.linuxVulIdList = new ArrayList<>();
        }
        this.linuxVulIdList.add(linuxVulIdListItem);
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo withLinuxVulIdList(Consumer<List<String>> linuxVulIdListSetter) {
        if (this.linuxVulIdList == null) {
            this.linuxVulIdList = new ArrayList<>();
        }
        linuxVulIdListSetter.accept(this.linuxVulIdList);
        return this;
    }

    /**
     * **参数解释**: Linux漏洞的漏洞id列表 
     * @return linuxVulIdList
     */
    public List<String> getLinuxVulIdList() {
        return linuxVulIdList;
    }

    public void setLinuxVulIdList(List<String> linuxVulIdList) {
        this.linuxVulIdList = linuxVulIdList;
    }

    public VulHostHostsResponseInfoVulIdsInfo withWindowsVulIdList(List<String> windowsVulIdList) {
        this.windowsVulIdList = windowsVulIdList;
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo addWindowsVulIdListItem(String windowsVulIdListItem) {
        if (this.windowsVulIdList == null) {
            this.windowsVulIdList = new ArrayList<>();
        }
        this.windowsVulIdList.add(windowsVulIdListItem);
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo withWindowsVulIdList(Consumer<List<String>> windowsVulIdListSetter) {
        if (this.windowsVulIdList == null) {
            this.windowsVulIdList = new ArrayList<>();
        }
        windowsVulIdListSetter.accept(this.windowsVulIdList);
        return this;
    }

    /**
     * **参数解释**: Windows漏洞的漏洞id列表 
     * @return windowsVulIdList
     */
    public List<String> getWindowsVulIdList() {
        return windowsVulIdList;
    }

    public void setWindowsVulIdList(List<String> windowsVulIdList) {
        this.windowsVulIdList = windowsVulIdList;
    }

    public VulHostHostsResponseInfoVulIdsInfo withWebcmsVulIdList(List<String> webcmsVulIdList) {
        this.webcmsVulIdList = webcmsVulIdList;
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo addWebcmsVulIdListItem(String webcmsVulIdListItem) {
        if (this.webcmsVulIdList == null) {
            this.webcmsVulIdList = new ArrayList<>();
        }
        this.webcmsVulIdList.add(webcmsVulIdListItem);
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo withWebcmsVulIdList(Consumer<List<String>> webcmsVulIdListSetter) {
        if (this.webcmsVulIdList == null) {
            this.webcmsVulIdList = new ArrayList<>();
        }
        webcmsVulIdListSetter.accept(this.webcmsVulIdList);
        return this;
    }

    /**
     * **参数解释**: Web-CMS漏洞的漏洞id列表 
     * @return webcmsVulIdList
     */
    public List<String> getWebcmsVulIdList() {
        return webcmsVulIdList;
    }

    public void setWebcmsVulIdList(List<String> webcmsVulIdList) {
        this.webcmsVulIdList = webcmsVulIdList;
    }

    public VulHostHostsResponseInfoVulIdsInfo withAppVulIdList(List<String> appVulIdList) {
        this.appVulIdList = appVulIdList;
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo addAppVulIdListItem(String appVulIdListItem) {
        if (this.appVulIdList == null) {
            this.appVulIdList = new ArrayList<>();
        }
        this.appVulIdList.add(appVulIdListItem);
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo withAppVulIdList(Consumer<List<String>> appVulIdListSetter) {
        if (this.appVulIdList == null) {
            this.appVulIdList = new ArrayList<>();
        }
        appVulIdListSetter.accept(this.appVulIdList);
        return this;
    }

    /**
     * **参数解释**: 应用漏洞的漏洞id列表 
     * @return appVulIdList
     */
    public List<String> getAppVulIdList() {
        return appVulIdList;
    }

    public void setAppVulIdList(List<String> appVulIdList) {
        this.appVulIdList = appVulIdList;
    }

    public VulHostHostsResponseInfoVulIdsInfo withUrgentVulIdList(List<String> urgentVulIdList) {
        this.urgentVulIdList = urgentVulIdList;
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo addUrgentVulIdListItem(String urgentVulIdListItem) {
        if (this.urgentVulIdList == null) {
            this.urgentVulIdList = new ArrayList<>();
        }
        this.urgentVulIdList.add(urgentVulIdListItem);
        return this;
    }

    public VulHostHostsResponseInfoVulIdsInfo withUrgentVulIdList(Consumer<List<String>> urgentVulIdListSetter) {
        if (this.urgentVulIdList == null) {
            this.urgentVulIdList = new ArrayList<>();
        }
        urgentVulIdListSetter.accept(this.urgentVulIdList);
        return this;
    }

    /**
     * **参数解释**: 应急漏洞的漏洞id列表 
     * @return urgentVulIdList
     */
    public List<String> getUrgentVulIdList() {
        return urgentVulIdList;
    }

    public void setUrgentVulIdList(List<String> urgentVulIdList) {
        this.urgentVulIdList = urgentVulIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostHostsResponseInfoVulIdsInfo that = (VulHostHostsResponseInfoVulIdsInfo) obj;
        return Objects.equals(this.linuxVulIdList, that.linuxVulIdList)
            && Objects.equals(this.windowsVulIdList, that.windowsVulIdList)
            && Objects.equals(this.webcmsVulIdList, that.webcmsVulIdList)
            && Objects.equals(this.appVulIdList, that.appVulIdList)
            && Objects.equals(this.urgentVulIdList, that.urgentVulIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linuxVulIdList, windowsVulIdList, webcmsVulIdList, appVulIdList, urgentVulIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostHostsResponseInfoVulIdsInfo {\n");
        sb.append("    linuxVulIdList: ").append(toIndentedString(linuxVulIdList)).append("\n");
        sb.append("    windowsVulIdList: ").append(toIndentedString(windowsVulIdList)).append("\n");
        sb.append("    webcmsVulIdList: ").append(toIndentedString(webcmsVulIdList)).append("\n");
        sb.append("    appVulIdList: ").append(toIndentedString(appVulIdList)).append("\n");
        sb.append("    urgentVulIdList: ").append(toIndentedString(urgentVulIdList)).append("\n");
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
