package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.InstanceReplicationListInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 分片列表
 */
public class InstanceGroupListInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_list")
    
    private List<InstanceReplicationListInfo> replicationList = null;
    
    public InstanceGroupListInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 分片id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public InstanceGroupListInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 分片名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public InstanceGroupListInfo withReplicationList(List<InstanceReplicationListInfo> replicationList) {
        this.replicationList = replicationList;
        return this;
    }

    
    public InstanceGroupListInfo addReplicationListItem(InstanceReplicationListInfo replicationListItem) {
        this.replicationList.add(replicationListItem);
        return this;
    }

    public InstanceGroupListInfo withReplicationList(Consumer<List<InstanceReplicationListInfo>> replicationListSetter) {
        if(this.replicationList == null ){
            this.replicationList = new ArrayList<>();
        }
        replicationListSetter.accept(this.replicationList);
        return this;
    }

    /**
     * 每个分片包含的副本列表。
     * @return replicationList
     */
    public List<InstanceReplicationListInfo> getReplicationList() {
        return replicationList;
    }

    public void setReplicationList(List<InstanceReplicationListInfo> replicationList) {
        this.replicationList = replicationList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceGroupListInfo instanceGroupListInfo = (InstanceGroupListInfo) o;
        return Objects.equals(this.groupId, instanceGroupListInfo.groupId) &&
            Objects.equals(this.groupName, instanceGroupListInfo.groupName) &&
            Objects.equals(this.replicationList, instanceGroupListInfo.replicationList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, replicationList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceGroupListInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    replicationList: ").append(toIndentedString(replicationList)).append("\n");
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

