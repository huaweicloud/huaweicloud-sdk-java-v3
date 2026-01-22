package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FirewallProtectionStatusVO
 */
public class FirewallProtectionStatusVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private Integer protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_eip_list")

    private List<String> failedEipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_eip_id_list")

    private List<String> failedEipIdList = null;

    public FirewallProtectionStatusVO withProtectionStatus(Integer protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * **参数解释**： 防火墙防护状态，0: 正常状态, 1: bypass进行中, 2: bypass成功, 3: bypass失败, 4: 恢复中, 5: 恢复失败 **取值范围**： 不涉及
     * @return protectionStatus
     */
    public Integer getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(Integer protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public FirewallProtectionStatusVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirewallProtectionStatusVO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public FirewallProtectionStatusVO withFailedEipList(List<String> failedEipList) {
        this.failedEipList = failedEipList;
        return this;
    }

    public FirewallProtectionStatusVO addFailedEipListItem(String failedEipListItem) {
        if (this.failedEipList == null) {
            this.failedEipList = new ArrayList<>();
        }
        this.failedEipList.add(failedEipListItem);
        return this;
    }

    public FirewallProtectionStatusVO withFailedEipList(Consumer<List<String>> failedEipListSetter) {
        if (this.failedEipList == null) {
            this.failedEipList = new ArrayList<>();
        }
        failedEipListSetter.accept(this.failedEipList);
        return this;
    }

    /**
     * **参数解释**： bypass失败的eip列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return failedEipList
     */
    public List<String> getFailedEipList() {
        return failedEipList;
    }

    public void setFailedEipList(List<String> failedEipList) {
        this.failedEipList = failedEipList;
    }

    public FirewallProtectionStatusVO withFailedEipIdList(List<String> failedEipIdList) {
        this.failedEipIdList = failedEipIdList;
        return this;
    }

    public FirewallProtectionStatusVO addFailedEipIdListItem(String failedEipIdListItem) {
        if (this.failedEipIdList == null) {
            this.failedEipIdList = new ArrayList<>();
        }
        this.failedEipIdList.add(failedEipIdListItem);
        return this;
    }

    public FirewallProtectionStatusVO withFailedEipIdList(Consumer<List<String>> failedEipIdListSetter) {
        if (this.failedEipIdList == null) {
            this.failedEipIdList = new ArrayList<>();
        }
        failedEipIdListSetter.accept(this.failedEipIdList);
        return this;
    }

    /**
     * **参数解释**： bypass失败的eip id列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return failedEipIdList
     */
    public List<String> getFailedEipIdList() {
        return failedEipIdList;
    }

    public void setFailedEipIdList(List<String> failedEipIdList) {
        this.failedEipIdList = failedEipIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallProtectionStatusVO that = (FirewallProtectionStatusVO) obj;
        return Objects.equals(this.protectionStatus, that.protectionStatus) && Objects.equals(this.id, that.id)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.failedEipList, that.failedEipList)
            && Objects.equals(this.failedEipIdList, that.failedEipIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectionStatus, id, objectId, failedEipList, failedEipIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallProtectionStatusVO {\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    failedEipList: ").append(toIndentedString(failedEipList)).append("\n");
        sb.append("    failedEipIdList: ").append(toIndentedString(failedEipIdList)).append("\n");
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
