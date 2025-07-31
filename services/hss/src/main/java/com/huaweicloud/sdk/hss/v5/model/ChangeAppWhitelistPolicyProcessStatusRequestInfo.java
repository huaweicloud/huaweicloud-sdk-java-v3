package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标记策略识别进程
 */
public class ChangeAppWhitelistPolicyProcessStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_hash_list")

    private List<String> processHashList = null;

    public ChangeAppWhitelistPolicyProcessStatusRequestInfo withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * **参数解释**： 进程可信状态 **约束限制**: 不涉及 **取值范围**: - trust：可信 - suspicious：可疑 - malicious：恶意 - unknown：未知  **默认取值**: 不涉及 
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public ChangeAppWhitelistPolicyProcessStatusRequestInfo withProcessHashList(List<String> processHashList) {
        this.processHashList = processHashList;
        return this;
    }

    public ChangeAppWhitelistPolicyProcessStatusRequestInfo addProcessHashListItem(String processHashListItem) {
        if (this.processHashList == null) {
            this.processHashList = new ArrayList<>();
        }
        this.processHashList.add(processHashListItem);
        return this;
    }

    public ChangeAppWhitelistPolicyProcessStatusRequestInfo withProcessHashList(
        Consumer<List<String>> processHashListSetter) {
        if (this.processHashList == null) {
            this.processHashList = new ArrayList<>();
        }
        processHashListSetter.accept(this.processHashList);
        return this;
    }

    /**
     * 进程hash列表
     * @return processHashList
     */
    public List<String> getProcessHashList() {
        return processHashList;
    }

    public void setProcessHashList(List<String> processHashList) {
        this.processHashList = processHashList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeAppWhitelistPolicyProcessStatusRequestInfo that = (ChangeAppWhitelistPolicyProcessStatusRequestInfo) obj;
        return Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processHashList, that.processHashList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processStatus, processHashList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAppWhitelistPolicyProcessStatusRequestInfo {\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processHashList: ").append(toIndentedString(processHashList)).append("\n");
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
