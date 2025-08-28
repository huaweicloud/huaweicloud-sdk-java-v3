package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetProtectDirSwitchRequestInfo
 */
public class SetProtectDirSwitchRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_list")

    private List<String> protectDirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_protect")

    private Boolean enableProtect;

    public SetProtectDirSwitchRequestInfo withProtectDirList(List<String> protectDirList) {
        this.protectDirList = protectDirList;
        return this;
    }

    public SetProtectDirSwitchRequestInfo addProtectDirListItem(String protectDirListItem) {
        if (this.protectDirList == null) {
            this.protectDirList = new ArrayList<>();
        }
        this.protectDirList.add(protectDirListItem);
        return this;
    }

    public SetProtectDirSwitchRequestInfo withProtectDirList(Consumer<List<String>> protectDirListSetter) {
        if (this.protectDirList == null) {
            this.protectDirList = new ArrayList<>();
        }
        protectDirListSetter.accept(this.protectDirList);
        return this;
    }

    /**
     * **参数解释**: 需要暂停或恢复的防护目录列表 **约束限制**: 不涉及 **取值范围**: 不超过50条 **默认取值**: 不涉及 
     * @return protectDirList
     */
    public List<String> getProtectDirList() {
        return protectDirList;
    }

    public void setProtectDirList(List<String> protectDirList) {
        this.protectDirList = protectDirList;
    }

    public SetProtectDirSwitchRequestInfo withEnableProtect(Boolean enableProtect) {
        this.enableProtect = enableProtect;
        return this;
    }

    /**
     * **参数解释**: 暂停或恢复防护目录的防护状态 **约束限制**: 不涉及 **取值范围**: - true ：恢复防护。 - false ：暂停防护。  **默认取值**: false 
     * @return enableProtect
     */
    public Boolean getEnableProtect() {
        return enableProtect;
    }

    public void setEnableProtect(Boolean enableProtect) {
        this.enableProtect = enableProtect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetProtectDirSwitchRequestInfo that = (SetProtectDirSwitchRequestInfo) obj;
        return Objects.equals(this.protectDirList, that.protectDirList)
            && Objects.equals(this.enableProtect, that.enableProtect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirList, enableProtect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetProtectDirSwitchRequestInfo {\n");
        sb.append("    protectDirList: ").append(toIndentedString(protectDirList)).append("\n");
        sb.append("    enableProtect: ").append(toIndentedString(enableProtect)).append("\n");
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
