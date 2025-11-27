package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteWebTamperProtectionConfigRequestInfo
 */
public class DeleteWebTamperProtectionConfigRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_config_id_list")

    private List<String> protectionConfigIdList = null;

    public DeleteWebTamperProtectionConfigRequestInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改的类型 **约束限制**: 不涉及 **取值范围**: - container_wtp：容器网页防篡改  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeleteWebTamperProtectionConfigRequestInfo withProtectionConfigIdList(List<String> protectionConfigIdList) {
        this.protectionConfigIdList = protectionConfigIdList;
        return this;
    }

    public DeleteWebTamperProtectionConfigRequestInfo addProtectionConfigIdListItem(String protectionConfigIdListItem) {
        if (this.protectionConfigIdList == null) {
            this.protectionConfigIdList = new ArrayList<>();
        }
        this.protectionConfigIdList.add(protectionConfigIdListItem);
        return this;
    }

    public DeleteWebTamperProtectionConfigRequestInfo withProtectionConfigIdList(
        Consumer<List<String>> protectionConfigIdListSetter) {
        if (this.protectionConfigIdList == null) {
            this.protectionConfigIdList = new ArrayList<>();
        }
        protectionConfigIdListSetter.accept(this.protectionConfigIdList);
        return this;
    }

    /**
     * **参数解释**: 防护配置id列表 **约束限制**: 不涉及 **取值范围**: 最少0条，最多100条 **默认取值**: 不涉及 
     * @return protectionConfigIdList
     */
    public List<String> getProtectionConfigIdList() {
        return protectionConfigIdList;
    }

    public void setProtectionConfigIdList(List<String> protectionConfigIdList) {
        this.protectionConfigIdList = protectionConfigIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteWebTamperProtectionConfigRequestInfo that = (DeleteWebTamperProtectionConfigRequestInfo) obj;
        return Objects.equals(this.type, that.type)
            && Objects.equals(this.protectionConfigIdList, that.protectionConfigIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, protectionConfigIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteWebTamperProtectionConfigRequestInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionConfigIdList: ").append(toIndentedString(protectionConfigIdList)).append("\n");
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
