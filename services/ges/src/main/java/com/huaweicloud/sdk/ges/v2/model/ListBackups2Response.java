package com.huaweicloud.sdk.ges.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListBackupsRespBackupList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBackups2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_count")
    
    
    private Integer backupCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_list")
    
    
    private List<ListBackupsRespBackupList> backupList = null;
    
    public ListBackups2Response withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    


    /**
     * 备份总个数。请求失败时，字段为空。
     * @return backupCount
     */
    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    

    public ListBackups2Response withBackupList(List<ListBackupsRespBackupList> backupList) {
        this.backupList = backupList;
        return this;
    }

    
    public ListBackups2Response addBackupListItem(ListBackupsRespBackupList backupListItem) {
        if(this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        this.backupList.add(backupListItem);
        return this;
    }

    public ListBackups2Response withBackupList(Consumer<List<ListBackupsRespBackupList>> backupListSetter) {
        if(this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        backupListSetter.accept(this.backupList);
        return this;
    }

    /**
     * 当前Project ID下的所有图的备份列表。请求失败时，字段为空。
     * @return backupList
     */
    public List<ListBackupsRespBackupList> getBackupList() {
        return backupList;
    }

    public void setBackupList(List<ListBackupsRespBackupList> backupList) {
        this.backupList = backupList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackups2Response listBackups2Response = (ListBackups2Response) o;
        return Objects.equals(this.backupCount, listBackups2Response.backupCount) &&
            Objects.equals(this.backupList, listBackups2Response.backupList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupCount, backupList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackups2Response {\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
        sb.append("    backupList: ").append(toIndentedString(backupList)).append("\n");
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

