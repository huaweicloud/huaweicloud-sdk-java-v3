package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EIPSwitchStatusVO
 */
public class EIPSwitchStatusVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_eip_id_list")

    private List<String> failEipIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_eip_list")

    private List<FailedEipInfo> failEipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public EIPSwitchStatusVO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID。此处仅取type为0的防护对象id，可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public EIPSwitchStatusVO withFailEipIdList(List<String> failEipIdList) {
        this.failEipIdList = failEipIdList;
        return this;
    }

    public EIPSwitchStatusVO addFailEipIdListItem(String failEipIdListItem) {
        if (this.failEipIdList == null) {
            this.failEipIdList = new ArrayList<>();
        }
        this.failEipIdList.add(failEipIdListItem);
        return this;
    }

    public EIPSwitchStatusVO withFailEipIdList(Consumer<List<String>> failEipIdListSetter) {
        if (this.failEipIdList == null) {
            this.failEipIdList = new ArrayList<>();
        }
        failEipIdListSetter.accept(this.failEipIdList);
        return this;
    }

    /**
     * 修改eip防护状态失败状态列表，状态包括成功“successful”，失败“fail”
     * @return failEipIdList
     */
    public List<String> getFailEipIdList() {
        return failEipIdList;
    }

    public void setFailEipIdList(List<String> failEipIdList) {
        this.failEipIdList = failEipIdList;
    }

    public EIPSwitchStatusVO withFailEipList(List<FailedEipInfo> failEipList) {
        this.failEipList = failEipList;
        return this;
    }

    public EIPSwitchStatusVO addFailEipListItem(FailedEipInfo failEipListItem) {
        if (this.failEipList == null) {
            this.failEipList = new ArrayList<>();
        }
        this.failEipList.add(failEipListItem);
        return this;
    }

    public EIPSwitchStatusVO withFailEipList(Consumer<List<FailedEipInfo>> failEipListSetter) {
        if (this.failEipList == null) {
            this.failEipList = new ArrayList<>();
        }
        failEipListSetter.accept(this.failEipList);
        return this;
    }

    /**
     * 修改eip防护状态失败信息列表
     * @return failEipList
     */
    public List<FailedEipInfo> getFailEipList() {
        return failEipList;
    }

    public void setFailEipList(List<FailedEipInfo> failEipList) {
        this.failEipList = failEipList;
    }

    public EIPSwitchStatusVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防火墙ID，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EIPSwitchStatusVO that = (EIPSwitchStatusVO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.failEipIdList, that.failEipIdList)
            && Objects.equals(this.failEipList, that.failEipList) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, failEipIdList, failEipList, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EIPSwitchStatusVO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    failEipIdList: ").append(toIndentedString(failEipIdList)).append("\n");
        sb.append("    failEipList: ").append(toIndentedString(failEipList)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
